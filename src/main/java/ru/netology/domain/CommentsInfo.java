package ru.netology.domain;

public class CommentsInfo {
    private int comments;
    private int commentsCount;

    // + get/set на все поля

    public int getComments() {
        return comments;
    }
    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getCommentsCount() {
        return commentsCount;
    }
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }
}
