package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.teampark.globalstudiossingapore.Entity.PhotoCharacter;

import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class PhotoSelectionAdapter extends RecyclerView.Adapter<PhotoSelectionAdapter.ViewHolder> {

    private List<PhotoCharacter> photoCharacters;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public PhotoSelectionAdapter(Context context, List<PhotoCharacter> photoCharacters){
        mContext = context;
        this.photoCharacters = photoCharacters;
    }

    private Context getContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row

        private ImageView photoImage1;
        private ImageView photoImage2;
        private TextView photoName1;
        private TextView photoName2;

        private CardView cardView1;
        private CardView cardView2;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            photoName1 = itemView.findViewById(R.id.photoName1);
            photoName2 = itemView.findViewById(R.id.photoName2);
            photoImage1 = itemView.findViewById(R.id.photoImage1);
            photoImage2 = itemView.findViewById(R.id.photoImage2);

            cardView1 = itemView.findViewById(R.id.cardView1);
            cardView2 = itemView.findViewById(R.id.cardView2);
        }
    }

    // To inflate the item layout and create the holder
    @Override
    public PhotoSelectionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View photoSelectionView = inflater.inflate(R.layout.item_photoselection, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(photoSelectionView);
        return viewHolder;
    }

    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(PhotoSelectionAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        PhotoCharacter character1 = photoCharacters.get(position * 2);
        PhotoCharacter character2 = null;

        if (photoCharacters.size() > (position * 2 + 1)){
            character2 = photoCharacters.get(position * 2 + 1);
        }

        // Set item views based on your views and data model
        TextView photoName1TextView = viewHolder.photoName1;
        photoName1TextView.setText(character1.getCharacterName());

        ImageView photoImage1ImageView = viewHolder.photoImage1;
        photoImage1ImageView.setImageResource(character1.getPreviewImage());

        CardView cardView1 = viewHolder.cardView1;

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (mContext, ARActivity.class);
                intent.putExtra("file", character1.getFileLocation());
                intent.putExtra("scale", character1.getScale());
                mContext.startActivity(intent);
            }
        });


        CardView cardView2 = viewHolder.cardView2;

        if (character2 != null){
            TextView photoName2TextView = viewHolder.photoName2;
            photoName2TextView.setText(character2.getCharacterName());

            ImageView photoImage2ImageView = viewHolder.photoImage2;
            photoImage2ImageView.setImageResource(character2.getPreviewImage());

            PhotoCharacter finalCharacter = character2;
            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent (mContext, ARActivity.class);
                    intent.putExtra("file", finalCharacter.getFileLocation());
                    intent.putExtra("scale", finalCharacter.getScale());
                    mContext.startActivity(intent);
                }
            });
        } else {
            cardView2.setVisibility(View.INVISIBLE);
        }


    }

    // To determine the number of items
    @Override
    public int getItemCount() {
        return (photoCharacters.size() + 1) / 2;
    }

}
