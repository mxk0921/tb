package com.taobao.android.live.plugin.proxy.livehome;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import tb.cus;
import tb.k2n;
import tb.t2o;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveHomePageProxy extends k2n<ITaoLiveHomePageProxy> implements ITaoLiveHomePageProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLiveHomePageProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TaoLiveHomePageProxy f8754a = new TaoLiveHomePageProxy();

        static {
            t2o.a(806355189);
        }

        public static /* synthetic */ TaoLiveHomePageProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoLiveHomePageProxy) ipChange.ipc$dispatch("8a0a1fe5", new Object[0]);
            }
            return f8754a;
        }
    }

    static {
        t2o.a(806355188);
        t2o.a(806355185);
    }

    public TaoLiveHomePageProxy() {
        try {
            TaoLiveLaunchInitializer.init();
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[TaoLiveHomePageProxy<init>] error: " + th.getMessage());
        }
    }

    public static TaoLiveHomePageProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHomePageProxy) ipChange.ipc$dispatch("5429fc6a", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveHomePageProxy taoLiveHomePageProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/livehome/TaoLiveHomePageProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public cus createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent) {
        cus cusVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cus) ipChange.ipc$dispatch("dfdbd067", new Object[]{this, context, new Boolean(z), obj, intent});
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            cusVar = real.createTaoLiveHomePage(context, z, obj, intent);
        } else {
            cusVar = null;
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#createTaoLiveHomePage]  value: " + cusVar);
        return cusVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutTemplate() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0d24c29", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            str = real.getBailoutTemplate();
        } else {
            str = null;
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#getBailoutTemplate]  value: " + str);
        return str;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutVideoListData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a978b4ac", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            str = real.getBailoutVideoListData();
        } else {
            str = null;
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#getBailoutVideoListData]  value: " + str);
        return str;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXAppVersion() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb6a1c18", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            str = real.getDXAppVersion();
        } else {
            str = null;
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#getDXAppVersion]  value: " + str);
        return str;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXBizType() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this});
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            str = real.getDXBizType();
        } else {
            str = null;
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#getDXBizType]  value: " + str);
        return str;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ITaoLiveHomePageProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installTaoLiveHomePagePlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "频道页";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
            return;
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            real.previewEngineDidInitialized(sVar);
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#previewEngineDidInitialized]");
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public boolean processInner(Intent intent, zmj zmjVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("397a04af", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        ITaoLiveHomePageProxy real = getReal();
        if (real != null) {
            z = real.processInner(intent, zmjVar);
        }
        FlexaLiveX.w("[TaoLiveHomePageProxy#processInner]  value: " + z);
        return z;
    }

    @Override // tb.k2n
    public <ProxyType extends ITaoLiveHomePageProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ITaoLiveHomePageProxy) ipChange.ipc$dispatch("afeadc6b", new Object[]{this})) : new TaoLiveHomePageX();
    }
}
