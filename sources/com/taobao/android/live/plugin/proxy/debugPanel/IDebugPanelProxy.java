package com.taobao.android.live.plugin.proxy.debugPanel;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import tb.myb;
import tb.zuc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDebugPanelProxy extends IBTypeProxy {
    public static final String KEY = "IDebugPanelProxy";

    Object createDebugPanel(Context context, ViewGroup viewGroup, zuc zucVar, boolean z);

    myb createDisplayView(Context context, ViewGroup viewGroup, boolean z);

    void destroyDebugPanel(Context context);

    void destroyDisplayView(Context context, myb mybVar);
}
