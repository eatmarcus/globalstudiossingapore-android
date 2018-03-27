package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.teampark.globalstudiossingapore.Entity.BeaconRecord;
import com.teampark.globalstudiossingapore.Entity.Records;
import com.teampark.globalstudiossingapore.Network.RecordRequestInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.teampark.globalstudiossingapore.Entity.Attraction;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AttractionsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AttractionsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AttractionsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<Attractions> attractionsList;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private final String TAG = "AttractionsFragment";

    private static String url = "http://heyitsmong.com:8080/gss-server/api/";
    CompositeDisposable compositeDisposable;

    RecyclerView rvAttractions;

    int timeFor1;
    int timeFor2;

    public AttractionsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AttractionsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AttractionsFragment newInstance(String param1, String param2) {
        AttractionsFragment fragment = new AttractionsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ( (MainActivity) getActivity()).getSupportActionBar().setTitle("Attractions");

        getActivity().setTitle("Attractions");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        // Lookup the recycler in activity layout
        rvAttractions = (RecyclerView)view.findViewById(R.id.attractionList);

        // Initialize dining places
        attractionsList = Attractions.createAttractionList();
        // Create adapter passing in the sample user data
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(),attractionsList);
        // Attach the adapter to the recyclerview to populate items
        rvAttractions.setAdapter(adapter);
        rvAttractions.setLayoutManager(new LinearLayoutManager(getActivity()));


        //
        //RETRIEVE ALL RECORDS
        //
        compositeDisposable = new CompositeDisposable();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        RecordRequestInterface recordRequestInterface = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build().create(RecordRequestInterface.class);

        compositeDisposable.add(recordRequestInterface.getAllRecords()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse,this::handleError));
        //
        //End
        //

        return view;
    }

    private void handleResponse(ArrayList<BeaconRecord> beaconRecords) {
        //GET THE RECORDS AND THEN CALCULATE THE TIME
        for (BeaconRecord beaconRecord : beaconRecords){
            //Get the beaconId
            String id = beaconRecord.getBeaconId();
            //Get the count
            int count = beaconRecord.getCount();

            if(id.equals("1")){
                if((count/12) <= 1){
                    timeFor1 = 5;
                }else{
                    int time = (count/12) * 5;
                    timeFor1 = time;
                }
            }else{
                if((count/12) <= 1){
                    timeFor2 = 5;
                }else{
                    int time = (count/12) * 5;
                    timeFor2 = time;
                }
            }

        }
        //attractionsList = Attractions.createAttractionList();

        for(int i = 0; i < attractionsList.size(); i++){
            Attractions a = attractionsList.get(i);
            if(a.getAttractionName().equals("Thomie's Mine Train")){
                attractionsList.remove(i);
            }
        }
        for(int i = 0; i < attractionsList.size(); i++){
            Attractions a = attractionsList.get(i);
            if(a.getAttractionName().equals("Dare Devil")){
                attractionsList.remove(i);
            }
        }

        attractionsList.add(new Attractions(2, "Dare Devil",
                "Cylon – as you engage in the ultimate intergalactic battle between good and evil on the world’s tallest dueling roller coasters!"
                ,timeFor2,R.drawable.attractions2, "Sci-fi City", "All Ages"));

        attractionsList.add(new Attractions(3, "Thomie's Mine Train",
                " Test your intergalactic stamina on this whirling twirling attraction."
                ,timeFor1,R.drawable.attractions3, "Sci-fi City", "All Ages"));

        Collections.sort(attractionsList, new Attractions());
        // Create adapter passing in the sample user data
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractionsList);
        // Attach the adapter to the recyclerview to populate items
        rvAttractions.setAdapter(adapter);
        rvAttractions.setLayoutManager(new LinearLayoutManager(getActivity()));


    }

    private void handleError(Throwable error) {
        Log.d("Error", "Cannot get beacon records");
        error.printStackTrace();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
