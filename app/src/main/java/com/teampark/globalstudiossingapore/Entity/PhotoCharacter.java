package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by darrylong on 24/3/18.
 */

public class PhotoCharacter {

    private String characterName;
    private int previewImage;
    private String fileLocation;
    private double scale;

    public PhotoCharacter(String characterName, int previewImage, String fileLocation, double scale) {
        this.characterName = characterName;
        this.previewImage = previewImage;
        this.fileLocation = fileLocation;
        this.scale = scale;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getPreviewImage() {
        return previewImage;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public double getScale() {
        return scale;
    }
}
