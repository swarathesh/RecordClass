package com.salyert.swarathesh.reportcard;

/**
 * Created by swarathesh on 7/1/2016.
 */
public class RecordClass {
    private int MathGrade, ScienceGrade, SocialGrade, EnglishGrade, TeluguGrade;
    public RecordClass() {
        MathGrade = 0;
        ScienceGrade = 0;
        SocialGrade = 0;
        EnglishGrade = 0;
        TeluguGrade = 0;
    }
    public RecordClass(int mathGrade, int scienceGrade, int socialGrade, int englishGrade, int teluguGrade) {
        MathGrade = mathGrade;
        ScienceGrade = scienceGrade;
        SocialGrade = socialGrade;
        EnglishGrade = englishGrade;
        TeluguGrade = teluguGrade;
    }
    public int getMathGrade() {
        return MathGrade;
    }
    public void setMathGrade(int mathGrade) {
        MathGrade = mathGrade;
    }
    public int getScienceGrade() {
        return ScienceGrade;
    }
    public void setScienceGrade(int scienceGrade) {
        ScienceGrade = scienceGrade;
    }
    public int getSocialGrade() {
        return SocialGrade;
    }
    public void setSocialGrade(int socialGrade) {
        SocialGrade = socialGrade;
    }
    public int getEnglishGrade() {
        return EnglishGrade;
    }
    public void setEnglishGrade(int englishGrade) {
        EnglishGrade = englishGrade;
    }
    public int getTeluguGrade() {
        return TeluguGrade;
    }
    public void setTeluguGrade(int teluguGrade) {
        TeluguGrade = teluguGrade;
    }
    @Override
    public String toString() {
        return "RecordClass{" + "MathGrade=" + MathGrade + ", ScienceGrade=" + ScienceGrade + ", SocialGrade=" + SocialGrade + ", EnglishGrade=" + EnglishGrade + ", TeluguGrade=" + TeluguGrade + '}';
    }
}
