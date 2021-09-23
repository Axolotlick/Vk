package ru.netology.domain;

public class ActionsInfo {
    private int actionInfo;
    private int complain;
    private int saveToBookmarks;

    // + get/set на все поля

    public int getActionInfo() {
        return actionInfo;
    }
    public void setActionInfo(int actionInfo) {
        this.actionInfo = actionInfo;
    }

    public int getComplain() {
        return complain;
    }
    public void setComplain(int complain) {
        this.complain = complain;
    }

    public int getSaveToBookmarks() {
        return saveToBookmarks;
    }
    public void setSaveToBookmarks(int saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }
}
