package com.taobao.android.live.plugin.proxy.pklink;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.PkLinkProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PkLinkProxy extends k2n<IPkLinkProxy> implements IPkLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PKLinkProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PkLinkProxy f8761a = new PkLinkProxy();

        static {
            t2o.a(806355218);
        }

        public static /* synthetic */ PkLinkProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PkLinkProxy) ipChange.ipc$dispatch("98e497d", new Object[0]);
            }
            return f8761a;
        }
    }

    static {
        t2o.a(806355216);
        t2o.a(806355215);
    }

    public static PkLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PkLinkProxy) ipChange.ipc$dispatch("c78b89d7", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(PkLinkProxy pkLinkProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/pklink/PkLinkProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IPkLinkProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.PkLinkProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy
    public BaseFrame getPkLinkFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("53a68ee1", new Object[]{this, context, ux9Var});
        }
        IPkLinkProxy real = getReal();
        if (real != null) {
            baseFrame = real.getPkLinkFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[PKLinkProxy#getPkLinkFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy
    public Class<? extends BaseFrame> getPkLinkFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2d02862a", new Object[]{this});
        }
        IPkLinkProxy real = getReal();
        if (real != null) {
            cls = real.getPkLinkFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[PKLinkProxy#getPkLinkFrameClass]  clazz: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "新连麦 PK";
    }

    private PkLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[PKLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IPkLinkProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IPkLinkProxy) ipChange.ipc$dispatch("fe143fca", new Object[]{this})) : new PkLinkProxyX();
    }
}
