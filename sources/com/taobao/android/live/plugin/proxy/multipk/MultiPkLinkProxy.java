package com.taobao.android.live.plugin.proxy.multipk;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.MultiPkLinkProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiPkLinkProxy extends k2n<IMultiPkLinkProxy> implements IMultiPkLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiPkLinkProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final MultiPkLinkProxy f8756a = new MultiPkLinkProxy();

        static {
            t2o.a(806355197);
        }

        public static /* synthetic */ MultiPkLinkProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MultiPkLinkProxy) ipChange.ipc$dispatch("dd4b84a1", new Object[0]);
            }
            return f8756a;
        }
    }

    static {
        t2o.a(806355195);
        t2o.a(806355194);
    }

    public static MultiPkLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiPkLinkProxy) ipChange.ipc$dispatch("9149997b", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(MultiPkLinkProxy multiPkLinkProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/multipk/MultiPkLinkProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IMultiPkLinkProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.MultiPkLinkProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.multipk.IMultiPkLinkProxy
    public BaseFrame getMultiPkLinkFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("f886d28e", new Object[]{this, context, ux9Var});
        }
        IMultiPkLinkProxy real = getReal();
        if (real != null) {
            baseFrame = real.getMultiPkLinkFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[MultiPkLinkProxy#getMultiPkLinkFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.multipk.IMultiPkLinkProxy
    public Class<? extends BaseFrame> getMultiPkLinkFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("4c4f9fd7", new Object[]{this});
        }
        IMultiPkLinkProxy real = getReal();
        if (real != null) {
            cls = real.getMultiPkLinkFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[MultiPkLinkProxy#getMultiPkLinkFrameClass]  clazz: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "多人PK连麦";
    }

    private MultiPkLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[MultiPkLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IMultiPkLinkProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IMultiPkLinkProxy) ipChange.ipc$dispatch("8231d9c6", new Object[]{this})) : new MultiPkLinkProxyX();
    }
}
