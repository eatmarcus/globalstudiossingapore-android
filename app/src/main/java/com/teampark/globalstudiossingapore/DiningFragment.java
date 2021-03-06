package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import im.delight.android.location.SimpleLocation;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DiningFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DiningFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DiningFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<DiningPlaces> diningList;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private SimpleLocation location;

    public DiningFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DiningFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DiningFragment newInstance(String param1, String param2) {
        DiningFragment fragment = new DiningFragment();
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
        ( (MainActivity) getActivity()).getSupportActionBar().setTitle("Dining");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dining, container, false);

        // Lookup the recycler in activity layout
        RecyclerView rvDiningPlaces = (RecyclerView)view.findViewById(R.id.diningList);

        // construct a new instance of SimpleLocation
        location = new SimpleLocation(getActivity(), true);

        // if we can't access the location yet
        if (!location.hasLocationEnabled()) {
            // ask the user to enable location access
            SimpleLocation.openSettings(getActivity());
        }

        Log.v("LOCATION" , location.getLatitude()+", " + location.getLongitude());
        // Initialize dining places
        diningList = DiningPlaces.createDiningList(location);
        // Create adapter passing in the sample user data
        DiningAdapter adapter = new DiningAdapter(getActivity(), getActivity(), diningList);
        // Attach the adapter to the recyclerview to populate items
        rvDiningPlaces.setAdapter(adapter);
        rvDiningPlaces.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
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

    @Override
    public void onResume() {
        super.onResume();

        // make the device update its location
        location.beginUpdates();
    }

    @Override
    public void onPause() {
        // stop location updates (saves battery)
        location.endUpdates();
        super.onPause();
    }

}
