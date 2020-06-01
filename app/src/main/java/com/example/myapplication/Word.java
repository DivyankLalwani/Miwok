package com.example.myapplication;
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;
    private int mImage;
    /** Miwok translation for the word */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation,int mImage) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImage=mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
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

    public int getmImage() {
        return mImage;
    }
}