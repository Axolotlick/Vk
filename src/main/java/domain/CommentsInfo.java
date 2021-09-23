package domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    // + get/set на все поля

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }
    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }
    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean IsCanClose() {
        return canClose;
    }
    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean IsCanOpen() {
        return canOpen;
    }
    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
