package ru.netology.domain;

public class LikesInfo {
    private int whoLiked;
    private int likesCount;
    private boolean userLike;

    // + get/set на все поля

    public int getWhoLiked() {
        return whoLiked;
    }
    public void setWhoLiked(int whoLiked) {
        this.whoLiked = whoLiked;
    }

    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean getUserLike() {
        return userLike;
    }
    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }
}
