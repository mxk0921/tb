package com.taobao.android.launcher.bootstrap.tao.ability.qos;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface QoSHandler {
    public static final int DO_FRAME = 0;
    public static final int HIGH = 1;
    public static final int IDLE = 3;
    public static final int IMPORTANT = 2;
    public static final int NORMAL = 0;
    public static final int POST = 1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Level {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Type {
    }

    boolean a(int i, Runnable runnable);
}
