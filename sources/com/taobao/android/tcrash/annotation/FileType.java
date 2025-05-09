package com.taobao.android.tcrash.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface FileType {
    public static final String ANR = "anr";
    public static final String CRASH_JAVA = "java";
    public static final String CRASH_NATIVE = "native";
}
