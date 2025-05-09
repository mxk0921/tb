package com.taobao.android.live.plugin.proxy.jump302;

import android.content.Context;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.cv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IJump302Proxy extends IProxy {
    public static final String KEY = "IJump302Proxy";

    void jump302(Context context, cv1 cv1Var, TBLiveDataModel tBLiveDataModel);
}
