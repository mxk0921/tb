package com.taobao.android.live.plugin.proxy.topbar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.TopBarProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopBarProxy extends k2n<ITopBarProxy> implements ITopBarProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopBarProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TopBarProxy f8772a = new TopBarProxy();

        static {
            t2o.a(806355289);
        }

        public static /* synthetic */ TopBarProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopBarProxy) ipChange.ipc$dispatch("6932951d", new Object[0]);
            }
            return f8772a;
        }
    }

    static {
        t2o.a(806355287);
        t2o.a(806355286);
    }

    public static TopBarProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopBarProxy) ipChange.ipc$dispatch("272fd577", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(TopBarProxy topBarProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/topbar/TopBarProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ITopBarProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.TopBarProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveTopBarPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getTopBarFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("481e3ed2", new Object[]{this});
        }
        ITopBarProxy real = getReal();
        if (real != null) {
            cls = real.getTopBarFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[TopBarProxy#getTopBarFrame3Class]  clazz: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "顶部头像";
    }

    private TopBarProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[TopBarProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ITopBarProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ITopBarProxy) ipChange.ipc$dispatch("139bf15c", new Object[]{this})) : new TopBarProxyX();
    }
}
