package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.github.chrisbanes.photoview.OnMatrixChangedListener;
import com.github.chrisbanes.photoview.OnPhotoTapListener;
import com.github.chrisbanes.photoview.PhotoView;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.teampark.globalstudiossingapore.DAO.AttractionDAO;
import com.teampark.globalstudiossingapore.Entity.Attraction;
import com.teampark.globalstudiossingapore.Entity.BeaconRecord;
import com.teampark.globalstudiossingapore.Entity.MapPoint;
import com.teampark.globalstudiossingapore.Network.RecordRequestInterface;
import com.teampark.globalstudiossingapore.utility.ConverterUtility;
import com.teampark.globalstudiossingapore.utility.MapDisplayUtility;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.ArrayList;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GuideMapFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GuideMapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuideMapFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private PhotoView photoView;

    private ConstraintLayout detailsConstraintLayout;

    PopupWindow currentOpenPopupWindow = null;

    public AVLoadingIndicatorView avi;
    private AVLoadingIndicatorView aviThomie;
    private AVLoadingIndicatorView aviSponglash;
    private AVLoadingIndicatorView aviRaging;
    private AVLoadingIndicatorView aviSteamin;
    private AVLoadingIndicatorView aviDare;

    private SearchView searchView;

    private static String url = "http://heyitsmong.com:8080/gss-server/api/";
    CompositeDisposable compositeDisposable;

    String timeFor1;
    String timeFor2;

    ArrayList<Attractions> attractionsList;
    public GuideMapFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GuideMapFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GuideMapFragment newInstance(String param1, String param2) {
        GuideMapFragment fragment = new GuideMapFragment();
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

        ( (MainActivity) getActivity()).getSupportActionBar().setTitle("Guide Map");

        View view = inflater.inflate(R.layout.fragment_guide_map, container, false);


        aviDare = view.findViewById(R.id.aviDare);
        aviRaging = view.findViewById(R.id.aviRaging);
        aviSponglash = view.findViewById(R.id.aviSponglash);
        aviSteamin = view.findViewById(R.id.aviSteamin);
        aviThomie = view.findViewById(R.id.aviThomie);

        photoView = view.findViewById(R.id.photoView);
        detailsConstraintLayout = view.findViewById(R.id.detailsConstraintLayout);

        photoView.setImageResource(R.drawable.map);
        photoView.setOnPhotoTapListener(new PhotoTapListener());
        photoView.setOnMatrixChangeListener(new MatrixChangeListener());

        photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        avi = view.findViewById(R.id.avi);
        attractionsList = Attractions.createAttractionList();

        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
        searchView = toolbar.findViewById(R.id.searchView);
        searchView.setVisibility(View.VISIBLE);

//        searchView.setOnSearchClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment fragment = new AttractionsFragment();
//                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.mainFrame, fragment);
//                ft.commit();
//            }
//        });

        FloatingActionButton emergencyCall = getActivity().findViewById(R.id.emergencyCall);
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) emergencyCall.getLayoutParams();
        p.setMargins(0,0,(int) ConverterUtility.dpToPx(getActivity(), 16), (int) ConverterUtility.dpToPx(getActivity(),200));
        emergencyCall.setLayoutParams(p);

        //emergencyCall.requestLayout();


        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String coordinates = bundle.getString("coordinates");
            coordinates.split(",");
            Float Xcoordinates = Float.parseFloat(coordinates.split(",")[0]);
            Float Ycoordinates = Float.parseFloat(coordinates.split(",")[1]);
            zoomToArea(Xcoordinates, Ycoordinates);
        }

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

    private void zoomToArea(Float Xcoordinates, Float Ycoordinates) {
        float minScale = photoView.getMinimumScale();
        float maxScale = photoView.getMaximumScale();
        float avgScale = (minScale + maxScale) / 2;
        photoView.setScale(avgScale, Xcoordinates, Ycoordinates, true);
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
                    timeFor1 = "< 5mins";
                }else{
                    int time = (count/12) * 5;
                    timeFor1 = "< " + time + "mins";
                }
            }else{
                if((count/12) <= 1){
                    timeFor2 = "< 5mins";
                }else{
                    int time = (count/12) * 5;
                    timeFor2 = "< " + time + "mins";
                }
            }

        }
//        int time1 = Integer.parseInt(timeFor1);
//        int time2 = Integer.parseInt(timeFor2);
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
        searchView.setVisibility(View.INVISIBLE);
        searchView.setOnClickListener(null);

        FloatingActionButton emergencyCall = getActivity().findViewById(R.id.emergencyCall);
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) emergencyCall.getLayoutParams();
        p.setMargins(0,0,(int) ConverterUtility.dpToPx(getActivity(), 16), (int) ConverterUtility.dpToPx(getActivity(),16));
        emergencyCall.setLayoutParams(p);
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

    public void directToPlace(double lat, double lng){
        String toParse = "google.navigation:q=" + lat + ", " + lng + "&mode=w";
        Uri gmmIntentUri = Uri.parse(toParse);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void viewDetails(Attractions rides){
        Intent intent = new Intent(getContext() ,AttractionInfor.class);
        intent.putExtra("rideName", rides.getAttractionName());
        intent.putExtra("rideInfo",rides.getAttractionInfo());
        intent.putExtra("rideCategory", rides.getAttractionCategory());
        intent.putExtra("rideAge", rides.getAttractionAgeRange());
        if(rides.getAttractionName().equals("Thomie's Mine Train")){
            intent.putExtra("rideQueueTime", timeFor1);
        }else if(rides.getAttractionName().equals("Dare Devil")){
            intent.putExtra("rideQueueTime", timeFor2);
        }else{
            intent.putExtra("rideQueueTime", rides.getAttractionQueue()+ " mins");
        }
        intent.putExtra("rideImage", rides.getImageUrl());
        intent.putExtra("rideId", rides.getId());

        // When the person click should go to the DiningMenu page
//               mContext.startActivity(intent);
        getActivity().startActivityForResult(intent, 1);
    }

    private class PhotoTapListener implements OnPhotoTapListener {


        @Override
        public void onPhotoTap(ImageView view, float x, float y) {
            float xPercentage = x * 100f;
            float yPercentage = y * 100f;

            System.out.println("Percentage: " + xPercentage + ", " + yPercentage);
            //
            // POPUP VIEW
            //
            //Open Popup (map_popup.xml)
//            LayoutInflater layoutInflater = (LayoutInflater)getActivity().getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View popupView = layoutInflater.inflate(R.layout.map_popup, null);

//            final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

//            Button goThereButton = (Button) popupView.findViewById(R.id.goThere);
//
//            TextView rideNameTextView = popupView.findViewById(R.id.rideNameTextView);
//            TextView descriptionTextView = popupView.findViewById(R.id.descriptionTextView);
//            TextView timeValueTextView = popupView.findViewById(R.id.timeValueTextView);

            Button goThereButton = detailsConstraintLayout.findViewById(R.id.goThere);
            Button viewD = detailsConstraintLayout.findViewById(R.id.viewDetails);

            TextView rideNameTextView = detailsConstraintLayout.findViewById(R.id.rideNameTextView);
            TextView descriptionTextView = detailsConstraintLayout.findViewById(R.id.descriptionTextView);
            TextView timeValueTextView = detailsConstraintLayout.findViewById(R.id.timeValueTextView);


            detailsConstraintLayout.setVisibility(View.VISIBLE);

            //Done as OnViewTapListener is still not available, change to listener in future!!
            //Reverse calculate to obtain view tap region.
            PhotoView photoView = (PhotoView) view;
            RectF displayRect = photoView.getDisplayRect();
            float xViewTap = x * displayRect.width() + displayRect.left;
            float yViewTap = y * displayRect.height() + displayRect.top;

            //For Debugging Purposes
            System.out.println("IMAGE TAP REGION: X-"+x+", Y-"+y);
            System.out.println("VIEW TAP REGION: X-"+xViewTap+", Y-"+yViewTap);


            // Obtain Station from tapped position.
            // Returns null if there's no valid station at that tap.
            Attraction tappedAttraction = MapDisplayUtility.getAttraction(x, y);
            Map test = AttractionDAO.getAttractionMapPositionList();

            if (tappedAttraction != null){
                //System.out.println("THERE IS A ATTRACTION HERE!!!!");
                //Display popup at tap region

                rideNameTextView.setText(tappedAttraction.getName());
                descriptionTextView.setText(tappedAttraction.getDescription());

                //Set the waiting time for the 2 attractions
                if(tappedAttraction.getName().equals("Thomie's Mine Train")){
                    timeValueTextView.setText(timeFor1);
                }else if(tappedAttraction.getName().equals("Dare Devil")){
                    timeValueTextView.setText(timeFor2);
                }else{
                    timeValueTextView.setText("< 5mins");
                }
                //Obtain actual position of the tapped region
                MapPoint actualAttractionMapPoint = tappedAttraction.getMapCoordinates();
                double actualAttractionX = actualAttractionMapPoint.getxCoordinate();
                double actualAttractionY = actualAttractionMapPoint.getyCoordinate();

                actualAttractionX = actualAttractionX * displayRect.width() + displayRect.left;
                actualAttractionY = actualAttractionY * displayRect.height() + displayRect.top;



                //Set on click listeners for buttons
                goThereButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String attractionName = tappedAttraction.getName();
                        dismissPopupWindowWithEffect();
                        if(attractionName.equals("Raging River")){
                            directToPlace(1.2543797, 103.8231613);
                        }else if(attractionName.equals("Dare Devil")){
                            directToPlace(1.2540289,103.8230367);
                        }else if(attractionName.equals("Sponglash Wave Pool")){
                            directToPlace(1.253302,103.8227258);
                        }else if(attractionName.equals("Steamin' Demon")){
                            directToPlace(1.2532943,103.8220809);
                        }else if(attractionName.equals("Thomie's Mine Train")){
                            directToPlace(1.2540289,103.8230367);
                        }

                    }
                });

                viewD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String attractionName = tappedAttraction.getName();
                        Attractions a = null;
                        for(Attractions temp: attractionsList){
                            if(temp.getAttractionName().equals(attractionName)){
                                a = temp;
                            }else if(temp.getAttractionName().equals("Steaming Demon") && attractionName.equals("Steamin' Demon")){
                                a = temp;
                            }
                        }
                        if(a != null){
                            viewDetails(a);
                        }
                    }
                });

                //Display on UI
                //180 and 125 are hardcoded values, height and width of the popup windows to offset and centralise!
                if (currentOpenPopupWindow!=null){
                    currentOpenPopupWindow.dismiss();
                    currentOpenPopupWindow = null;

                }

                float xOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), -70);
                float yOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), 135);
                //-208, 285
//                popupWindow.showAtLocation(view, Gravity.NO_GRAVITY, (int)(actualAttractionX+xOffsetPxPopup), (int)(actualAttractionY+yOffsetPxPopup));
                //popupWindow.showAsDropDown(view, (int)xViewTap, (int)yViewTap, Gravity.CENTER_HORIZONTAL);
//                currentOpenPopupWindow = popupWindow;

                float xOffsetPx = ConverterUtility.dpToPx(getActivity(), -10);
                float yOffsetPx = ConverterUtility.dpToPx(getActivity(), -60);

//                System.out.println("offset x: " + actualAttractionX+xOffsetPx);
//                System.out.println("offset y: " + actualAttractionY+yOffsetPx);
                //-55, 202
                avi.setPadding((int)(actualAttractionX+xOffsetPx),(int)(actualAttractionY+yOffsetPx),0,0);
                //avi.setPadding((int)(xViewTap+xOffsetPx),(int)(yViewTap+yOffsetPx),0,0);
                //avi.setPadding(0,0,0,0);
                avi.show();
                avi.setVisibility(View.VISIBLE);


            } else{
                //Invalid Point
                avi.setVisibility(View.INVISIBLE);
                avi.hide();
                if (currentOpenPopupWindow!=null){
                    currentOpenPopupWindow.dismiss();
                    currentOpenPopupWindow = null;
                }
                detailsConstraintLayout.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void dismissPopupWindowWithEffect(){
        if (avi != null){
            avi.setVisibility(View.INVISIBLE);
            avi.hide();
        }
        if (currentOpenPopupWindow!=null){
            currentOpenPopupWindow.dismiss();
            currentOpenPopupWindow = null;

        }

        detailsConstraintLayout.setVisibility(View.INVISIBLE);
    }

    private class MatrixChangeListener implements OnMatrixChangedListener {

        @Override
        public void onMatrixChanged(RectF rect) {
            dismissPopupWindowWithEffect();

            setAnimationPoint(aviRaging, rect, 0.46396226, 0.35501555 );
            setAnimationPoint(aviThomie, rect, 0.2110371, 0.3987882 );
            setAnimationPoint(aviSponglash, rect, 0.17878105, 0.7542211);
            setAnimationPoint(aviSteamin, rect, 0.71214676, 0.42501387);
            setAnimationPoint(aviDare, rect, 0.72232956, 0.78550935 );

        }

    }

    private void setAnimationPoint(AVLoadingIndicatorView avi, RectF displayRect, double x, double y) {

        x = x * displayRect.width() + displayRect.left;
        y = y * displayRect.height() + displayRect.top;

        float xOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), -70);
        float yOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), 135);

//        float scale = photoView.getScale();

        float xOffsetPx = ConverterUtility.dpToPx(getActivity(), -10);
        float yOffsetPx = ConverterUtility.dpToPx(getActivity(), -60);
        //-55, 202
        avi.setPadding((int)(x+xOffsetPx),(int)(y+yOffsetPx),0,0);
        //avi.setPadding((int)(xViewTap+xOffsetPx),(int)(yViewTap+yOffsetPx),0,0);
        //avi.setPadding(0,0,0,0);


//        avi.setScaleX(scale);
//        avi.setScaleY(scale);

        avi.show();
        avi.setVisibility(View.VISIBLE);



    }
}
