package com.facebook.yoga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);
    
    private final int mIntValue;

    YogaNodeType(int i) {
        this.mIntValue = i;
    }

    public static YogaNodeType fromInt(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return TEXT;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
