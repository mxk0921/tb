package com.taobao.android.live.plugin.proxy.smartlanding;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLandingProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import tb.k2n;
import tb.t2o;
import tb.wzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLandingProxy extends k2n<ISmartLandingProxy> implements ISmartLandingProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartLandingProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final SmartLandingProxy f8767a = new SmartLandingProxy();

        static {
            t2o.a(806355255);
        }

        public static /* synthetic */ SmartLandingProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SmartLandingProxy) ipChange.ipc$dispatch("d9867cdd", new Object[0]);
            }
            return f8767a;
        }
    }

    static {
        t2o.a(806355253);
        t2o.a(806355246);
    }

    public static SmartLandingProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLandingProxy) ipChange.ipc$dispatch("1fb40637", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(SmartLandingProxy smartLandingProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/smartlanding/SmartLandingProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("e51c1f5", new Object[]{this, context, str, str2, str3, eVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.b createSmartLanding = real != null ? real.createSmartLanding(context, str, str2, str3, eVar) : null;
        FlexaLiveX.w("[SmartLandingProxy#createSmartLanding]  value: " + createSmartLanding);
        return createSmartLanding;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.c createSmlDataManager(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, JSONObject jSONObject, wzc wzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.c) ipChange.ipc$dispatch("2ecdae5d", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, jSONObject, wzcVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.c createSmlDataManager = real != null ? real.createSmlDataManager(context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, jSONObject, wzcVar) : null;
        FlexaLiveX.w("[SmartLandingProxy#createSmlDataManager]  value: " + createSmlDataManager);
        return createSmlDataManager;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ISmartLandingProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLandingProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveSmartLandingPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "SmartLanding";
    }

    private SmartLandingProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[SmartLandingProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ISmartLandingProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ISmartLandingProxy) ipChange.ipc$dispatch("57af78fc", new Object[]{this})) : new SmartLandingProxyX();
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("ac57d377", new Object[]{this, context, str, str2, str3, str4, str5, str6, str7, jSONObject, eVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.b createSmartLanding = real != null ? real.createSmartLanding(context, str, str2, str3, str4, str5, str6, str7, jSONObject, eVar) : null;
        FlexaLiveX.w("[SmartLandingProxy#createSmartLanding]  value: " + createSmartLanding);
        return createSmartLanding;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy
    public ISmartLandingProxy.b createSmartLanding(Context context, ISmartLandingProxy.c cVar, ISmartLandingProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.b) ipChange.ipc$dispatch("2120b185", new Object[]{this, context, cVar, eVar});
        }
        ISmartLandingProxy real = getReal();
        ISmartLandingProxy.b createSmartLanding = real != null ? real.createSmartLanding(context, cVar, eVar) : null;
        FlexaLiveX.w("[SmartLandingProxy#createSmartLanding]  value: " + createSmartLanding);
        return createSmartLanding;
    }
}
