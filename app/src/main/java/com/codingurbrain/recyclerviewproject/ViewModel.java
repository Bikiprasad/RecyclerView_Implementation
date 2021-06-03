package com.codingurbrain.recyclerviewproject;

import androidx.annotation.NonNull;

public class ViewModel {

    private String simpleText;

    public ViewModel(@NonNull final String simpleText) {
        setSimpleText(simpleText);
    }

    @NonNull
    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(@NonNull final String simpleText) {
        this.simpleText = simpleText;
    }
}
