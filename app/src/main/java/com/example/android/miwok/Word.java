package com.example.android.miwok;

public class Word {


    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageRessourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miwokTranslation ,String defaultTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    public Word(String miwokTranslation ,String defaultTranslation, int imageRessourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageRessourceId = imageRessourceId;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageRessourceId() {return  mImageRessourceId; }


    public boolean hasImage(){
    return mImageRessourceId != NO_IMAGE_PROVIDED;
    }

}
