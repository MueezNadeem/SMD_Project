package com.example.smd_project;

public class Rating {
    public  Rating(){
        comment="" ;
        RatingValue=0;
    }

    public  Rating (float r,String c){
        this.comment=c;
        this.RatingValue=r;
    }

    private String comment;
    private  float RatingValue;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRatingValue() {
        return RatingValue;
    }

    public void setRatingValue(float ratingValue) {
        RatingValue = ratingValue;
    }
}
