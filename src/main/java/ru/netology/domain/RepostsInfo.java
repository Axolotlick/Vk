package ru.netology.domain;

public class RepostsInfo {
    private int repostCount;
    private boolean userRepost;

    // + get/set на все поля

    public int getRepostCount() {
        return repostCount;
    }
    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }

    public boolean getUserLRepost() {
        return userRepost;
    }
    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }
}
