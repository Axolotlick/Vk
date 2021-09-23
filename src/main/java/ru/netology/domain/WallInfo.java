package ru.netology.domain;

public class WallInfo {
    private int wallPostText;
    private int wallPostLink;
    private int wallPostImg;

    // + get/set на все поля

    public int getWallPostText() {
        return wallPostText;
    }
    public void setWallPostText(int wallPostText) {
        this.wallPostText = wallPostText;
    }

    public int getWallPostLink() {
        return wallPostLink;
    }
    public void setWallPostLink(int wallPostLink) {
        this.wallPostLink = wallPostLink;
    }

    public int getWallPostImg() {
        return wallPostImg;
    }
    public void setWallPostImg(int wallPostImg) {
        this.wallPostImg = wallPostImg;
    }
}
