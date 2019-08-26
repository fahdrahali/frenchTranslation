package com.example.android.miwok;

public class Color {


    private String  mDefaultTranslation;
    private String  mFrenchTranslation;
    private int mImageRessourceId;

    public Color(String defaultTranslation, String frenchTranslation, int imageRessourceId){
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageRessourceId = imageRessourceId;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmFrenchTranslation(){
        return mFrenchTranslation;
    }

    public int getmImageRessourceId() {
        return mImageRessourceId;
    }
}
