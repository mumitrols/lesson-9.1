package ru.netology.socialnet;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;

    //Заголовок и дата поста
    private String postTitle;
    private Date postDate;

    //Можно или нельзя комментривать
    private boolean canClose;
    private boolean canOpen;

    //Собщение поста
    private PostNotice postNotice;

    //Блок со счетчиками: лайки+репосты+просмотры+комменты
    private int countLikes;
    private int countReposts;
    private int countViews;
    private int countComments;

    //Блок с комментариями
    private CommentsInfo commentsInfo;

    //сетеры-гетеры
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

    public void setPostNotice(PostNotice postNotice) {
        this.postNotice = postNotice;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setCanClose(Boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
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

    public Boolean getCanClose() {
        return canClose;
    }

    public PostNotice getPostNotice() {
        return postNotice;
    }

    public Boolean getCanOpen() {
        return canOpen;
    }
}
