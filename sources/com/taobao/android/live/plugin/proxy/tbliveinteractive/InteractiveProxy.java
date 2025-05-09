package com.taobao.android.live.plugin.proxy.tbliveinteractive;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.InteractiveProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.jnr;
import tb.k2n;
import tb.kpw;
import tb.t2o;
import tb.ux9;
import tb.wbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveProxy extends k2n<IInteractiveProxy> implements IInteractiveProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InteractiveProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final InteractiveProxy f8771a = new InteractiveProxy();

        static {
            t2o.a(806355285);
        }

        public static /* synthetic */ InteractiveProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InteractiveProxy) ipChange.ipc$dispatch("d1090469", new Object[0]);
            }
            return f8771a;
        }
    }

    static {
        t2o.a(806355283);
        t2o.a(806355271);
    }

    public static InteractiveProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveProxy) ipChange.ipc$dispatch("c83e50c3", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(InteractiveProxy interactiveProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/tbliveinteractive/InteractiveProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public wbc createGoodsH5TabFrameAdapter() {
        wbc wbcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbc) ipChange.ipc$dispatch("d69cb922", new Object[]{this});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            wbcVar = real.createGoodsH5TabFrameAdapter();
        } else {
            wbcVar = null;
        }
        FlexaLiveX.w("[InteractiveProxy#createGoodsH5TabFrameAdapter]  value: " + wbcVar);
        return wbcVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("124c4837", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            baseFrame = real.createH5DynamicSDKFrame(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[InteractiveProxy#createH5DynamicSDKFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public IInteractiveProxy.h createInteractiveManager(Context context, ux9 ux9Var, long j) {
        IInteractiveProxy.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("63eada32", new Object[]{this, context, ux9Var, new Long(j)});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            hVar = real.createInteractiveManager(context, ux9Var, j);
        } else {
            hVar = null;
        }
        FlexaLiveX.w("[InteractiveProxy#createInteractiveManager]  value: " + hVar);
        return hVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public IInteractiveProxy.k createTaoLiveWebBottomFragment() {
        IInteractiveProxy.k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.k) ipChange.ipc$dispatch("4a02e021", new Object[]{this});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            kVar = real.createTaoLiveWebBottomFragment();
        } else {
            kVar = null;
        }
        FlexaLiveX.w("[InteractiveProxy#createTaoLiveWebBottomFragment]  value: " + kVar);
        return kVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            cls = real.getFrameClassMap(str);
        } else {
            cls = null;
        }
        FlexaLiveX.w("[InteractiveProxy#IInteractiveProxy getFrameClassMap]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IInteractiveProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.InteractiveProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveInteractivePlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "Interactive";
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public boolean getTradeSign(IWVWebView iWVWebView, jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85557a78", new Object[]{this, iWVWebView, jnrVar})).booleanValue();
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            return real.getTradeSign(iWVWebView, jnrVar);
        }
        FlexaLiveX.w("[InteractiveProxy#getTradeSign]  value: ");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public Class<? extends kpw> getWvApiClassMap(String str) {
        Class<? extends kpw> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fd0cb67", new Object[]{this, str});
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            cls = real.getWvApiClassMap(str);
        } else {
            cls = null;
        }
        FlexaLiveX.w("[InteractiveProxy#IInteractiveProxy getWvApiClassMap]  value: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public void registerEventHandlerAndWidget(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc669e0", new Object[]{this, dinamicXEngine});
            return;
        }
        IInteractiveProxy real = getReal();
        if (real != null) {
            real.registerEventHandlerAndWidget(dinamicXEngine);
        }
        FlexaLiveX.w("[InteractiveProxy#registerEventHandlerAndWidget]  value: ");
    }

    private InteractiveProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[InteractiveProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IInteractiveProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IInteractiveProxy) ipChange.ipc$dispatch("cae72566", new Object[]{this})) : new InteractiveProxyX();
    }
}
