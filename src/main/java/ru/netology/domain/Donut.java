package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private Object placeholder;
    private boolean canPublishFreeCopy;
    private String editMode;

    // + get/set на все поля

    public boolean IsIsDonut() {
        return isDonut;
    }
    public void setIsDonut(boolean isDonut) {
        this.isDonut = isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }
    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }
    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public boolean IsCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }
    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }
    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
