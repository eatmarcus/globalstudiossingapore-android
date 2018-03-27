package com.teampark.globalstudiossingapore.DAO;

import com.teampark.globalstudiossingapore.Entity.PhotoCharacter;
import com.teampark.globalstudiossingapore.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by darrylong on 24/3/18.
 */

public class PhotoSelectionDAO {

    private static ArrayList<PhotoCharacter> photoCharacterList;

    static {
        photoCharacterList = new ArrayList<>();

        photoCharacterList.add(new PhotoCharacter("Brave Raideen", R.drawable.photo_badtz, "file:///android_asset/brave_raideen.obj", 0.2f));
        photoCharacterList.add(new PhotoCharacter("Badtz Maru", R.drawable.photo_badtz, "file:///android_asset/badtz.obj", 0.1f));
        photoCharacterList.add(new PhotoCharacter("R2D2", R.drawable.photo_badtz, "file:///android_asset/R2D2.obj",0.7f));
//        photoCharacterList.add(new PhotoCharacter("Miku", R.drawable.photo_badtz, "file:///android_asset/SubstanceMiku.obj", 0.3f));
        photoCharacterList.add(new PhotoCharacter("BB8", R.drawable.photo_badtz, "file:///android_asset/BB8.obj", 0.7f));
//        photoCharacterList.add(new PhotoCharacter("Kirby", R.drawable.photo_badtz, "file:///android_asset/kirby.obj", 0.4f));
//        photoCharacterList.add(new PhotoCharacter("Snowman", R.drawable.photo_badtz, "file:///android_asset/snowman.obj", 0.2f));
//        photoCharacterList.add(new PhotoCharacter("Spongebob", R.drawable.photo_badtz, "file:///android_asset/spongebob.obj", 0.1f));
        photoCharacterList.add(new PhotoCharacter("Gundam", R.drawable.photo_badtz, "file:///android_asset/gundam.obj", 0.3f));
        photoCharacterList.add(new PhotoCharacter("Monika", R.drawable.photo_badtz, "file:///android_asset/Monika.obj", 0.06f));
        photoCharacterList.add(new PhotoCharacter("Chicken", R.drawable.photo_badtz, "file:///android_asset/niwatori_working.obj", 0.05f));
        photoCharacterList.add(new PhotoCharacter("Spongebob", R.drawable.photo_badtz, "file:///android_asset/spongebob.obj", 0.05f));
    }

    public static List<PhotoCharacter> getPhotoCharacterList() {
        return photoCharacterList;
    }
}
