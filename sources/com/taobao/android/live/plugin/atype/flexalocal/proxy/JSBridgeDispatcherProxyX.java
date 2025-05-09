package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.IJSBridgeDispatcherProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.jnr;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class JSBridgeDispatcherProxyX implements IJSBridgeDispatcherProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<String> jsBridgeList = new ArrayList();

    static {
        t2o.a(295699610);
        t2o.a(806355168);
    }

    @Override // com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.IJSBridgeDispatcherProxy
    public boolean onEvent(IWVWebView iWVWebView, String str, HashMap<String, String> hashMap, String str2, jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f012381", new Object[]{this, iWVWebView, str, hashMap, str2, jnrVar})).booleanValue();
        }
        if (!str.equals("checkGoodsRemoteJSBridge")) {
            return false;
        }
        nsw nswVar = new nsw();
        nswVar.b("hasRegister", String.valueOf(this.jsBridgeList.contains(hashMap.get("checkBridgeName"))));
        jnrVar.i(nswVar);
        return true;
    }
}
