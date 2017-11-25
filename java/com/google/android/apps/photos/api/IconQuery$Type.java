package com.google.android.apps.photos.api;

public enum IconQuery$Type {
    BADGE("badge", 2131427480),
    INTERACT("interact", 2131427479),
    DIALOG("dialog", 2131427479);
    
    private final int dimensionResourceId;
    private final String path;

    private IconQuery$Type(String str, int i) {
        this.path = str;
        this.dimensionResourceId = i;
    }

    public int getDimensionResourceId() {
        return this.dimensionResourceId;
    }
}
