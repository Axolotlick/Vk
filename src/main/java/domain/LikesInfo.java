package domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private boolean canLike;
    private boolean canPublish;

    // + get/set на все поля

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }
    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public boolean IsСanLike() {
        return canLike;
    }
    public void setСanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean IsСanPublish() {
        return canPublish;
    }
    public void setСanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
