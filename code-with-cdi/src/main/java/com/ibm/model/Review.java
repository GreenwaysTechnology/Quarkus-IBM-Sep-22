package com.ibm.model;

public class Review {
    private int id;
    private String comments;
    private String by;

    public Review() {
    }

    public Review(int id, String comments, String by) {
        this.id = id;
        this.comments = comments;
        this.by = by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
