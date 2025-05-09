package com.taobao.application.common;

import android.app.Activity;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IScrollListener {
    public static final int SCROLL_TYPE_FINGER = 1;
    public static final int SCROLL_TYPE_VIEW = 2;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface ScrollType {
    }

    void onDoFrame(long j);

    void onScrollEnd(Activity activity, int i, String str);

    @Deprecated
    void onScrollEnd(Activity activity, String str);

    void onScrollStart(Activity activity, int i);

    void onStopMonitorDoFrame();
}
