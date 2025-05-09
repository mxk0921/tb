package com.facebook.yoga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum YogaDimension {
    WIDTH(0),
    HEIGHT(1);
    
    private final int mIntValue;

    YogaDimension(int i) {
        this.mIntValue = i;
    }

    public static YogaDimension fromInt(int i) {
        if (i == 0) {
            return WIDTH;
        }
        if (i == 1) {
            return HEIGHT;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
