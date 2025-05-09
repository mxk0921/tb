package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IDeviceInfo {
    public static final int SCREEN_LARGE = 3;
    public static final int SCREEN_MAX = 4;
    public static final int SCREEN_MEDIUM = 2;
    public static final int SCREEN_MIN = 0;
    public static final int SCREEN_SMALL = 1;
    public static final int SCREEN_UNKNOWN = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface ScreenType {
    }

    String getUtdid(Context context);

    boolean h();

    boolean i();

    Rect j(Activity activity);

    int k();

    boolean l();

    JSONObject m(Context context);

    boolean n(Activity activity);

    int o(Activity activity);

    float p(Context context);
}
