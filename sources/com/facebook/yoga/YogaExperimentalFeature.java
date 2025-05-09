package com.facebook.yoga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0);
    
    private final int mIntValue;

    YogaExperimentalFeature(int i) {
        this.mIntValue = i;
    }

    public static YogaExperimentalFeature fromInt(int i) {
        if (i == 0) {
            return WEB_FLEX_BASIS;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
