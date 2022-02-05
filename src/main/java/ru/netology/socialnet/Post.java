package ru.netology.socialnet;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private String postTitle;
    private Date postDate;

    private PostNotice postNotice;

    private int countLikes;
    private int countReposts;
    private int countViews;
    private int countComments;

    private CommentsInfo commentsInfo;

    public void setId(int id) {
        this.id = id;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public void setPostAnons(PostNotice postAnons) {
        this.postNotice = postAnons;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public void setCountReposts(int countReposts) {
        this.countReposts = countReposts;
    }

    public void setCountViews(int countViews) {
        this.countViews = countViews;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public String getPostTitle() {
        return postTitle;
    }

    public Date getPostDate() {
        return postDate;
    }

    public PostNotice getPostAnons() {
        return postNotice;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public int getCountReposts() {
        return countReposts;
    }

    public int getCountViews() {
        return countViews;
    }

    public int getCountComments() {
        return countComments;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

}
