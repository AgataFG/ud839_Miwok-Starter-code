package com.example.android.miwok;

/**
 * Created by flisiaka on 2018-03-27.
 * /*
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */


public class Word {
   /** Default translation for the word */
   private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    //** ID for the image
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private int mAudioResourceID = 0;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = mImageResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

   /**
      * Get the default translation of the word.
      */

   public String getDefaultTranslation() {
                return mDefaultTranslation;
           }

            /**
      * Get the Miwok translation of the word.
      */
    public String getMiwokTranslation() {
                return mMiwokTranslation;
            }

    /* get image ID */
    public int getImageID() { return mImageResourceID; }

    /**
     +     * Returns whether or not there is an image for this word.
     +     */
   public boolean hasImage() {
              return mImageResourceID != NO_IMAGE_PROVIDED;
           }

           public int getAudioResourceID(){return mAudioResourceID;}

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceID;
    }

}
