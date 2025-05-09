package com.taobao.android.live.plugin.proxy.jump302;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.Jump302ProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.cv1;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Jump302Proxy extends k2n<IJump302Proxy> implements IJump302Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Jump302Proxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Jump302Proxy f8751a = new Jump302Proxy();

        static {
            t2o.a(806355175);
        }

        public static /* synthetic */ Jump302Proxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Jump302Proxy) ipChange.ipc$dispatch("887408d", new Object[0]);
            }
            return f8751a;
        }
    }

    static {
        t2o.a(806355173);
        t2o.a(806355172);
    }

    public static Jump302Proxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Jump302Proxy) ipChange.ipc$dispatch("3c35d267", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(Jump302Proxy jump302Proxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/jump302/Jump302Proxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IJump302Proxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.Jump302ProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "install302Plugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "302Jump";
    }

    @Override // com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy
    public void jump302(Context context, cv1 cv1Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fdc0cc", new Object[]{this, context, cv1Var, tBLiveDataModel});
            return;
        }
        IJump302Proxy real = getReal();
        if (real != null) {
            real.jump302(context, cv1Var, tBLiveDataModel);
        }
        FlexaLiveX.w("[Jump302Proxy#jump302]");
    }

    private Jump302Proxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[Jump302Proxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IJump302Proxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IJump302Proxy) ipChange.ipc$dispatch("f98671ec", new Object[]{this})) : new Jump302ProxyX();
    }
}
