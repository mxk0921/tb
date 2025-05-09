package com.taobao.android.live.plugin.proxy.multiLink;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.MultiLinkProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiLinkProxy extends k2n<IMultiLinkProxy> implements IMultiLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiLinkProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final MultiLinkProxy f8755a = new MultiLinkProxy();

        static {
            t2o.a(806355193);
        }

        public static /* synthetic */ MultiLinkProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MultiLinkProxy) ipChange.ipc$dispatch("8c2775a5", new Object[0]);
            }
            return f8755a;
        }
    }

    static {
        t2o.a(806355191);
        t2o.a(806355190);
    }

    public static MultiLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiLinkProxy) ipChange.ipc$dispatch("40258a7f", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(MultiLinkProxy multiLinkProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/multiLink/MultiLinkProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IMultiLinkProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.MultiLinkProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.multiLink.IMultiLinkProxy
    public BaseFrame getMultiLinkFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("a4ecdf3", new Object[]{this, context, ux9Var});
        }
        IMultiLinkProxy real = getReal();
        if (real != null) {
            baseFrame = real.getMultiLinkFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[MultiLinkProxy#getMultiLinkFrame]  clazz: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.multiLink.IMultiLinkProxy
    public Class<? extends BaseFrame> getMultiLinkFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b481813c", new Object[]{this});
        }
        IMultiLinkProxy real = getReal();
        if (real != null) {
            cls = real.getMultiLinkFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[MultiLinkProxy#getMultiLinkFrameClass]  clazz: " + cls);
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
        return "多人连麦";
    }

    private MultiLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[MultiLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IMultiLinkProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IMultiLinkProxy) ipChange.ipc$dispatch("23c6722c", new Object[]{this})) : new MultiLinkProxyX();
    }
}
