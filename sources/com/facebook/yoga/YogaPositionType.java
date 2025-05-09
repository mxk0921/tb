package com.facebook.yoga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    private final int mIntValue;

    YogaPositionType(int i) {
        this.mIntValue = i;
    }

    public static YogaPositionType fromInt(int i) {
        if (i == 0) {
            return RELATIVE;
        }
        if (i == 1) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
