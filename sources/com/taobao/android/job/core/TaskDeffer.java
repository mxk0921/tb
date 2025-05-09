package com.taobao.android.job.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface TaskDeffer<T, R> {
    public static final int OPTION_DEFFER_NORMAL = 0;
    public static final int OPTION_DEFFER_REPLY_ON_TASK = 1;
    public static final int OPTION_DEFFER_WHEN_WAITING = 2;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Option {
    }
}
