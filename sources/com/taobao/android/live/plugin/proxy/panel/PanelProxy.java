package com.taobao.android.live.plugin.proxy.panel;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.k2n;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PanelProxy extends k2n<IPanelProxy> implements IPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PanelProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PanelProxy f8760a = new PanelProxy();

        static {
            t2o.a(806355213);
        }

        public static /* synthetic */ PanelProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PanelProxy) ipChange.ipc$dispatch("cb7eb8c7", new Object[0]);
            }
            return f8760a;
        }
    }

    static {
        t2o.a(806355211);
        t2o.a(806355210);
    }

    public static PanelProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelProxy) ipChange.ipc$dispatch("3ca447a1", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(PanelProxy panelProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/panel/PanelProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Hide(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeca21e", new Object[]{this, obj});
            return;
        }
        IPanelProxy real = getReal();
        if (real != null) {
            real.blankFrame2Hide(obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2HidePlayIcon(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566efd4b", new Object[]{this, obj});
            return;
        }
        IPanelProxy real = getReal();
        if (real != null) {
            real.blankFrame2HidePlayIcon(obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Show(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7a145b", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        IPanelProxy real = getReal();
        if (real != null) {
            real.blankFrame2Show(obj, z);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getBlankFrame2Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9359d849", new Object[]{this});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            cls = real.getBlankFrame2Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[PanelProxy#getBlankFrame2Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IPanelProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("230d7c1b", new Object[]{this, context, ux9Var});
        }
        IPanelProxy real = getReal();
        BaseFrame liveAvatarNewFrame = real != null ? real.getLiveAvatarNewFrame(context, ux9Var) : null;
        FlexaLiveX.w("[PanelProxy#getLiveAvatarNewFrame]  value: " + liveAvatarNewFrame);
        return liveAvatarNewFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveEndFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c28d9e38", new Object[]{this});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            cls = real.getLiveEndFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[PanelProxy#getLiveEndFrameClass]  value: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveReadyFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("95fcbe37", new Object[]{this, context, ux9Var});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            baseFrame = real.getLiveReadyFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[PanelProxy#getLiveReadyFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLivePanelPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getShowcaseFrame(Context context, ux9 ux9Var, LiveItem liveItem) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("680416d4", new Object[]{this, context, ux9Var, liveItem});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            baseFrame = real.getShowcaseFrame(context, ux9Var, liveItem);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[PanelProxy#getShowcaseFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getTopFakeBarFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("6aeb71b5", new Object[]{this, context, ux9Var});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            baseFrame = real.getTopFakeBarFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[PanelProxy#getLiveAvatarNewFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "面板";
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getWatermarkFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("12434758", new Object[]{this});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            cls = real.getWatermarkFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[PanelProxy#getWatermarkFrame3Class]  value: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object showClearScreenGuide(Context context) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2f1a82b1", new Object[]{this, context});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            obj = real.showClearScreenGuide(context);
        } else {
            obj = null;
        }
        FlexaLiveX.w("[PanelProxy#showClearScreenGuide]  ");
        return obj;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object showPlayRateScreenGuide(Context context) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b441b6d0", new Object[]{this, context});
        }
        IPanelProxy real = getReal();
        if (real != null) {
            obj = real.showPlayRateScreenGuide(context);
        } else {
            obj = null;
        }
        FlexaLiveX.w("[PanelProxy#showPlayRateScreenGuide]  ");
        return obj;
    }

    private PanelProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[PanelProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IPanelProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IPanelProxy) ipChange.ipc$dispatch("eb469b8c", new Object[]{this})) : new PanelProxyX();
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("900cfdae", new Object[]{this, context, new Boolean(z), tBLiveDataModel});
        }
        IPanelProxy real = getReal();
        BaseFrame liveAvatarNewFrame = real != null ? real.getLiveAvatarNewFrame(context, z, tBLiveDataModel) : null;
        FlexaLiveX.w("[PanelProxy#getLiveAvatarNewFrame]  value: " + liveAvatarNewFrame);
        return liveAvatarNewFrame;
    }
}
