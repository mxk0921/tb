package com.taobao.android.live.plugin.proxy.jsbridgeDispatcher;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.JSBridgeDispatcherProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import java.util.HashMap;
import tb.jnr;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class JSBridgeDispatcherProxy extends k2n<IJSBridgeDispatcherProxy> implements IJSBridgeDispatcherProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JSBridgeDispatcherProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final JSBridgeDispatcherProxy f8750a = new JSBridgeDispatcherProxy();

        static {
            t2o.a(806355171);
        }

        public static /* synthetic */ JSBridgeDispatcherProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSBridgeDispatcherProxy) ipChange.ipc$dispatch("f80f04dd", new Object[0]);
            }
            return f8750a;
        }
    }

    static {
        t2o.a(806355169);
        t2o.a(806355168);
    }

    public static JSBridgeDispatcherProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSBridgeDispatcherProxy) ipChange.ipc$dispatch("5b475737", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(JSBridgeDispatcherProxy jSBridgeDispatcherProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/jsbridgeDispatcher/JSBridgeDispatcherProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IJSBridgeDispatcherProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.JSBridgeDispatcherProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installJSBridgeDispatcherPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "jsbridge转发";
    }

    @Override // com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.IJSBridgeDispatcherProxy
    public boolean onEvent(IWVWebView iWVWebView, String str, HashMap<String, String> hashMap, String str2, jnr jnrVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f012381", new Object[]{this, iWVWebView, str, hashMap, str2, jnrVar})).booleanValue();
        }
        IJSBridgeDispatcherProxy real = getReal();
        if (real != null) {
            z = real.onEvent(iWVWebView, str, hashMap, str2, jnrVar);
        }
        FlexaLiveX.w("[JSBridgeDispatcherProxy#initJSBridgeDispatcher] " + z);
        return z;
    }

    private JSBridgeDispatcherProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[JSBridgeDispatcherProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IJSBridgeDispatcherProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IJSBridgeDispatcherProxy) ipChange.ipc$dispatch("9c5e69f2", new Object[]{this})) : new JSBridgeDispatcherProxyX();
    }
}
