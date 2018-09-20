package com.tistory.black_jin0427.myrecyclerview.model;

public class Movie {

    private int viewType;

    private String url, genre, title, content;

    public Movie(int viewType, String url, String genre, String title, String content) {

        this.viewType = viewType;

        this.url = url;
        this.genre = genre;
        this.title = title;
        this.content = content;

    }

    public int getViewType() { return viewType; }

    public String getUrl() {
        return url;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


}
