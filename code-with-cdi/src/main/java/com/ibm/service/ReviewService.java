package com.ibm.service;

import com.ibm.model.Review;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ReviewService {

    public List<Review> getReviews(){
        return List.of(new Review(1,"This is elegant product","John"));
    }
}
