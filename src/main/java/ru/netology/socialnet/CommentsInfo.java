package ru.netology.socialnet;

import java.util.Date;

public class CommentsInfo {
    private int id;
    private Date dateComment;
    private String textComment;


    public void setId(int id) {
        this.id = id;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
    public int getId() {
        return id;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public String getTextComment() {
        return textComment;
    }

}
