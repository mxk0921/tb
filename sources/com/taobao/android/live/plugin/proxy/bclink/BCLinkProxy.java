package com.taobao.android.live.plugin.proxy.bclink;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.BCLinkProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BCLinkProxy extends k2n<IBCLinkProxy> implements IBCLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BCLinkProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final BCLinkProxy f8741a = new BCLinkProxy();

        static {
            t2o.a(806355122);
        }

        public static /* synthetic */ BCLinkProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BCLinkProxy) ipChange.ipc$dispatch("f63ae69d", new Object[0]);
            }
            return f8741a;
        }
    }

    static {
        t2o.a(806355120);
        t2o.a(806355123);
    }

    public static BCLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BCLinkProxy) ipChange.ipc$dispatch("b43826f7", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(BCLinkProxy bCLinkProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/bclink/BCLinkProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public BaseFrame createLiveLinkFrame3(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("5d2fc0a4", new Object[]{this, context, ux9Var, tBLiveDataModel, viewStub});
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            baseFrame = real.createLiveLinkFrame3(context, ux9Var, tBLiveDataModel, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BCLinkProxy#createLiveLinkFrame3]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public BaseFrame createLiveLinkFrame3AndCreateView(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("48813c2c", new Object[]{this, context, ux9Var, tBLiveDataModel, viewStub});
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            baseFrame = real.createLiveLinkFrame3AndCreateView(context, ux9Var, tBLiveDataModel, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BCLinkProxy#createLiveLinkFrame3AndCreateView]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Object createSEIDispatcher(ux9 ux9Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1adc00e1", new Object[]{this, ux9Var});
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            obj = real.createSEIDispatcher(ux9Var);
        } else {
            obj = null;
        }
        FlexaLiveX.w("[BCLinkProxy#createSEIDispatcher]");
        return obj;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableJianBao(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c04a096d", new Object[]{this, ux9Var, tBLiveDataModel})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableJianBao(ux9Var, tBLiveDataModel);
        }
        FlexaLiveX.w("[BCLinkProxy#enableJianBao]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableLinkLive3() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f05635", new Object[]{this})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableLinkLive3();
        }
        FlexaLiveX.w("[BCLinkProxy#enableLinkLive3]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableLiveLink(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("463da555", new Object[]{this, ux9Var, tBLiveDataModel})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableLiveLink(ux9Var, tBLiveDataModel);
        }
        FlexaLiveX.w("[BCLinkProxy#enableLiveLink]  value: " + z);
        return z;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IBCLinkProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Class<? extends BaseFrame> getLiveLinkEntranceFrame() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8fcc48ef", new Object[]{this});
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            cls = real.getLiveLinkEntranceFrame();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[BCLinkProxy#getLiveLinkEntranceFrame]  value: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Class<? extends BaseFrame> getLiveLinkFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("efb88aca", new Object[]{this});
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            cls = real.getLiveLinkFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[BCLinkProxy#getLiveLinkFrame3Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.BCLinkProxyX";
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
        return "BC 连麦";
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void liveLinkFrame3ShowStopLinkDialog(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8c14f0", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.liveLinkFrame3ShowStopLinkDialog(obj);
        }
        FlexaLiveX.w("[BCLinkProxy#liveLinkFrame3ShowStopLinkDialog]");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherDispatch(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee6eca5", new Object[]{this, obj, str});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.seiDispatcherDispatch(obj, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherInitialize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea43eb1", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.seiDispatcherInitialize(obj);
        }
        FlexaLiveX.w("[BCLinkProxy#seiDispatcherInitialize]");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherQuit(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8012a2b0", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.seiDispatcherQuit(obj);
        }
        FlexaLiveX.w("[BCLinkProxy#seiDispatcherQuit]");
    }

    private BCLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[BCLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IBCLinkProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IBCLinkProxy) ipChange.ipc$dispatch("36747f36", new Object[]{this})) : new BCLinkProxyX();
    }
}
