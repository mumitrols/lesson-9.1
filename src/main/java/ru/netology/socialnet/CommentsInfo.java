package ru.netology.socialnet;

import java.util.Date;

public class CommentsInfo {
    private int id;
    //Дата + текст комментария
    private Date dateComment;
    private String textComment;
    //id автора комментария
    private String idCommentAuthor;


    public void setId(int id) {
        this.id = id;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public void setIdCommentAuthor(String idCommentAuthor) {
        this.idCommentAuthor = idCommentAuthor;
    }

    public String getIdCommentAuthor() {
        return idCommentAuthor;
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
