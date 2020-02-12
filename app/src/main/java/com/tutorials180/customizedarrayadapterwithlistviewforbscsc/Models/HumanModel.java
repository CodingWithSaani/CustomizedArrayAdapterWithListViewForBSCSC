package com.tutorials180.customizedarrayadapterwithlistviewforbscsc.Models;

public class HumanModel {

    private String userName;
    private int avatarReference;

    public HumanModel(String userName, int avatarReference) {
        this.userName = userName;
        this.avatarReference = avatarReference;
    }

    public String getUserName() {
        return userName;
    }

    public int getAvatarReference() {
        return avatarReference;
    }
}
