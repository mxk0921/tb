package com.taobao.android.autosize;

import android.app.Activity;
import android.content.res.Configuration;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface OnScreenChangedListener {
    public static final int SCREEN_LANDSCAPE_LAYOUT = 2;
    public static final int SCREEN_PORTRAIT_LAYOUT = 1;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface ScreenChangeType {
    }

    void onActivityChanged(Activity activity, int i, Configuration configuration);

    void onScreenChanged(int i, Configuration configuration);
}
