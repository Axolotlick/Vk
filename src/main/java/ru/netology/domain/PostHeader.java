package ru.netology.domain;

public class PostHeader {
    private int postAuthor;
    private int authorId;
    private int postImg;
    private int postDate;
    private boolean wallFixedLabel;

    // + get/set на все поля

    public int getPostAuthor() {
        return postAuthor;
    }
    public void setPostAuthor(int postAuthor) {
        this.postAuthor = postAuthor;
    }

    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPostImg() {
        return postImg;
    }
    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }

    public int getPostDate() {
        return postDate;
    }
    public void setPostDate(int postDate) {
        this.postDate = postDate;
    }

    public boolean getWallFixedLabel() {
        return wallFixedLabel;
    }
    public void setWallFixedLabel(boolean wallFixedLabel) {
        this.wallFixedLabel = wallFixedLabel;
    }

}
