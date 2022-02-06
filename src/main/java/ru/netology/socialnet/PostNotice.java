package ru.netology.socialnet;

public class PostNotice {
    private int id;
    //Анонс сообщения в начале блока
    private String textNotice;
    //Картинка
    private String imageUrl;
    //Ссылка на все сообщение
    private String textNamePost;

    //сетеры-гетыры
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
