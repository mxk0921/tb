package com.uploader.export;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IUploaderLog {
    public static final int D = 2;
    public static final int E = 16;
    public static final int I = 4;
    public static final int V = 1;
    public static final int W = 8;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface Definition {
    }

    int a(int i, String str, String str2, Throwable th);

    boolean isEnabled(int i);
}
