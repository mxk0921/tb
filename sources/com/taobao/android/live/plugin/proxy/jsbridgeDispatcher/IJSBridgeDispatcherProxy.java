package com.taobao.android.live.plugin.proxy.jsbridgeDispatcher;

import android.taobao.windvane.webview.IWVWebView;
import com.taobao.android.live.plugin.proxy.IProxy;
import java.util.HashMap;
import tb.jnr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IJSBridgeDispatcherProxy extends IProxy {
    public static final String KEY = "IJSBridgeDispatcherProxy";

    boolean onEvent(IWVWebView iWVWebView, String str, HashMap<String, String> hashMap, String str2, jnr jnrVar);
}
