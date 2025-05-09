package com.taobao.android.live.plugin.proxy.livehome;

import android.content.Context;
import android.content.Intent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.live.plugin.proxy.IProxy;
import tb.cus;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ITaoLiveHomePageProxy extends IProxy {
    public static final String KEY = "ITaoLiveHomePageProxy";

    cus createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent);

    String getBailoutTemplate();

    String getBailoutVideoListData();

    String getDXAppVersion();

    String getDXBizType();

    void previewEngineDidInitialized(s sVar);

    boolean processInner(Intent intent, zmj zmjVar);
}
