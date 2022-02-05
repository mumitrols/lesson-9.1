package ru.netology.socialnet;

public class PostNotice {
    private int id;
    private String textNotice;
    private String imageUrl;
    private String textNamePost;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTextNotice(String textNotice) {
        this.textNotice = textNotice;
    }
    public void setTextNamePost(String textNamePost) {
        this.textNamePost = textNamePost;
    }

    public int getId() {
        return id;
    }
    public String getTextNotice() {
        return textNotice;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getTextNamePost() {
        return textNamePost;
    }

}
