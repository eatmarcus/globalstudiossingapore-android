package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.github.chrisbanes.photoview.OnPhotoTapListener;
import com.github.chrisbanes.photoview.PhotoView;


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

    private Button goThere;

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
        View view = inflater.inflate(R.layout.fragment_guide_map, container, false);

        getActivity().setTitle("Guide Map");

        photoView = view.findViewById(R.id.photoView);

        photoView.setImageResource(R.drawable.map);
        photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        photoView.setOnPhotoTapListener(new PhotoTapListener());

        goThere = view.findViewById(R.id.getThere);
        goThere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //put method here
                directToPlace(1.355137, 103.760892);
            }
        });

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

    public void directToPlace(double lat, double lng){
        String toParse = "google.navigation:q=" + lat + ", " + lng + "&mode=w";
        Uri gmmIntentUri = Uri.parse(toParse);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    private class PhotoTapListener implements OnPhotoTapListener {


        @Override
        public void onPhotoTap(ImageView view, float x, float y) {
            float xPercentage = x * 100f;
            float yPercentage = y * 100f;

//            //
//            // POPUP VIEW
//            //
//            //Open Popup (map_popup.xml)
//            LayoutInflater layoutInflater = (LayoutInflater)getActivity().getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View popupView = layoutInflater.inflate(R.layout.map_popup, null);
//            final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//
//            Button departureButton = (Button) popupView.findViewById(R.id.startStation);
//            Button arrivalButton = (Button) popupView.findViewById(R.id.endStation);
//
//
//            //Done as OnViewTapListener is still not available, change to listener in future!!
//            //Reverse calculate to obtain view tap region.
//            PhotoView photoView = (PhotoView) view;
//            RectF displayRect = photoView.getDisplayRect();
//            float xViewTap = x * displayRect.width() + displayRect.left;
//            float yViewTap = y * displayRect.height() + displayRect.top;
//
//            //For Debugging Purposes
//            System.out.println("IMAGE TAP REGION: X-"+x+", Y-"+y);
//            System.out.println("VIEW TAP REGION: X-"+xViewTap+", Y-"+yViewTap);
//
//            checkStationTextValidityAndClear();
//
//
//            // Obtain Station from tapped position.
//            // Returns null if there's no valid station at that tap.
//            Station tappedStation = MapDisplayUtility.getStation(x, y);
//
//            if (tappedStation != null){
//                //System.out.println("THERE IS A STATION HERE!!!!");
//                //Display popup at tap region
//
//                //Obtain actual position of the tapped region
//                MapPoint actualStationMapPoint = tappedStation.getMapCoordinates();
//                double actualStationX = actualStationMapPoint.getxCoordinate();
//                double actualStationY = actualStationMapPoint.getyCoordinate();
//
//                actualStationX = actualStationX * displayRect.width() + displayRect.left;
//                actualStationY = actualStationY * displayRect.height() + displayRect.top;
//
//                //Set on click listeners for buttons
//                departureButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        AutoCompleteTextView departureTextView = (AutoCompleteTextView) getView().findViewById(R.id.departureTextView);
//                        departureTextView.setText(tappedStation.getStationName());
//                        departureTextView.clearFocus();
//
//                        dismissPopupWindowWithEffect();
//                        checkFieldsAndInvokeScreen();
//
//                    }
//                });
//
//                arrivalButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        AutoCompleteTextView arrivalTextView = (AutoCompleteTextView) getView().findViewById(R.id.arrivalTextView);
//                        arrivalTextView.setText(tappedStation.getStationName());
//                        arrivalTextView.callOnClick();
//
//                        dismissPopupWindowWithEffect();
//                        checkFieldsAndInvokeScreen();
//
//                    }
//                });
//
//
//                //Display on UI
//                //180 and 125 are hardcoded values, height and width of the popup windows to offset and centralise!
//                if (currentOpenPopupWindow!=null){
//                    currentOpenPopupWindow.dismiss();
//                    currentOpenPopupWindow = null;
//
//                }
//
//                float xOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), -88);
//                float yOffsetPxPopup = ConverterUtility.dpToPx(getActivity(), 115);
//                //-208, 285
//                popupWindow.showAtLocation(view, Gravity.NO_GRAVITY, (int)(actualStationX+xOffsetPxPopup), (int)(actualStationY+yOffsetPxPopup));
//                //popupWindow.showAsDropDown(view, (int)xViewTap, (int)yViewTap, Gravity.CENTER_HORIZONTAL);
//                currentOpenPopupWindow = popupWindow;
//
//                float xOffsetPx = ConverterUtility.dpToPx(getActivity(), -20);
//                float yOffsetPx = ConverterUtility.dpToPx(getActivity(), 82);
//                //-55, 202
//                avi.setPadding((int)(actualStationX+xOffsetPx),(int)(actualStationY+yOffsetPx),0,0);
//                avi.show();
//                avi.setVisibility(View.VISIBLE);
//
//
//
//            } else{
//                //Invalid Point
//                avi.setVisibility(View.INVISIBLE);
//                avi.hide();
//                if (currentOpenPopupWindow!=null){
//                    currentOpenPopupWindow.dismiss();
//                    currentOpenPopupWindow = null;
//                }
//            }
        }
    }

}
