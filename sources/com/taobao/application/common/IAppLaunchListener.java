package com.taobao.application.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAppLaunchListener {
    public static final int COLD = 0;
    public static final int HOT = 1;
    public static final int LAUNCH_COMPLETED = 4;
    public static final int LAUNCH_DRAW_START = 0;
    public static final int LAUNCH_INTERACTIVE = 2;
    public static final int LAUNCH_SKI_INTERACTIVE = 3;
    public static final int LAUNCH_VISIBLE = 1;

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface LaunchStatus {
    }

    void d(int i, int i2);
}
