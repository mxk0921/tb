package com.google.gson.internal;

/* compiled from: Taobao */
/* renamed from: com.google.gson.internal.$Gson$Preconditions  reason: invalid class name */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
