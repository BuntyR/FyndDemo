package com.fynddemo.bunty.events;

public class TwitterClick {

    private boolean isLoginSuccessfull;

    public TwitterClick(boolean isLoginSuccessfull) {
        this.isLoginSuccessfull = isLoginSuccessfull;
    }

    public boolean isLoginSuccessfull() {
        return isLoginSuccessfull;
    }

    public void setLoginSuccessfull(boolean loginSuccessfull) {
        isLoginSuccessfull = loginSuccessfull;
    }
}
