package com.example.android.miwok;

/**
 * Created by Abc1 on 11/5/2016.
 */
public class Word {

    private String mEnglishWord;
    private String mMiwokTranslation;

    public String getmEnglishWord() {
        return mEnglishWord;
    }

    public void setmEnglishWord(String mEnglishWord) {
        this.mEnglishWord = mEnglishWord;
    }

    public Word(String mEnglishWord, String mMiwokTranslation) {
        this.mEnglishWord = mEnglishWord;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }
}
