package com.taobao.android.live.plugin.proxy.debugPanel;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.DebugPanelProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.myb;
import tb.t2o;
import tb.zuc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DebugPanelProxy extends k2n<IDebugPanelProxy> implements IDebugPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DebugPanelProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final DebugPanelProxy f8744a = new DebugPanelProxy();

        static {
            t2o.a(806355136);
        }

        public static /* synthetic */ DebugPanelProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DebugPanelProxy) ipChange.ipc$dispatch("da8839dd", new Object[0]);
            }
            return f8744a;
        }
    }

    static {
        t2o.a(806355134);
        t2o.a(806355138);
    }

    public static DebugPanelProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DebugPanelProxy) ipChange.ipc$dispatch("87548037", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(DebugPanelProxy debugPanelProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/debugPanel/DebugPanelProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public Object createDebugPanel(Context context, ViewGroup viewGroup, zuc zucVar, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241b245e", new Object[]{this, context, viewGroup, zucVar, new Boolean(z)});
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            obj = real.createDebugPanel(context, viewGroup, zucVar, z);
        } else {
            obj = null;
        }
        FlexaLiveX.w("[DebugPanelProxy#initDebugPanel] " + obj);
        return obj;
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public myb createDisplayView(Context context, ViewGroup viewGroup, boolean z) {
        myb mybVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myb) ipChange.ipc$dispatch("c3ee7884", new Object[]{this, context, viewGroup, new Boolean(z)});
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            mybVar = real.createDisplayView(context, viewGroup, z);
        } else {
            mybVar = null;
        }
        FlexaLiveX.w("[DebugPanelProxy#createDisplayView] " + mybVar);
        return mybVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public void destroyDebugPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9dd1f6", new Object[]{this, context});
            return;
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            real.destroyDebugPanel(context);
        }
        FlexaLiveX.w("[DebugPanelProxy#removeDebugPanel]");
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public void destroyDisplayView(Context context, myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d7961", new Object[]{this, context, mybVar});
            return;
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            real.destroyDisplayView(context, mybVar);
        }
        FlexaLiveX.w("[DebugPanelProxy#removeDisplayView]");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IDebugPanelProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.DebugPanelProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveDebugPanelPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "算法debug面板";
    }

    private DebugPanelProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[DebugPanelProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IDebugPanelProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IDebugPanelProxy) ipChange.ipc$dispatch("6015d522", new Object[]{this})) : new DebugPanelProxyX();
    }
}
