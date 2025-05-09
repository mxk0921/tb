package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ntm;
import tb.sv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPreloadTask {
    public static final int TYPE_CANCEL_PRELOAD = 0;
    public static final int TYPE_HUITUI = 10;
    public static final int TYPE_ICON_STREAM_REQUEST = 2;
    public static final int TYPE_ICON_STREAM_REQUEST_HIGH_VERSION = 3;
    public static final int TYPE_INACTIVE_PRELOAD = 4;
    public static final int TYPE_NORMAL_PRELOAD = 1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface PreloadTaskType {
    }

    void a(ntm ntmVar, sv2<ntm> sv2Var);

    boolean b(JSONObject jSONObject);

    void c(sv2<ntm> sv2Var);

    Context getContext();

    ntm getPreloadVideoData();

    int getType();
}
