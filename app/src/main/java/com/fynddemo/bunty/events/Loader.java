package com.fynddemo.bunty.events;

public class Loader {
    private boolean isLoading;

    public Loader(boolean isLoading) {
        this.isLoading = isLoading;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
    }
}
