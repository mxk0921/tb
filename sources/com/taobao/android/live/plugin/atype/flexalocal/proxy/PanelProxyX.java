package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.clean.BlankFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame;
import com.taobao.android.live.plugin.atype.flexalocal.liveready.TaoLiveReadyRecommendFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.android.live.plugin.atype.flexalocal.watermark.WatermarkFrame3;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.n6m;
import tb.ot3;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PanelProxyX implements IPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699614);
        t2o.a(806355210);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Hide(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeca21e", new Object[]{this, obj});
        } else if (obj instanceof BlankFrame2) {
            ((BlankFrame2) obj).hide();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2HidePlayIcon(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566efd4b", new Object[]{this, obj});
        } else if (obj instanceof BlankFrame2) {
            ((BlankFrame2) obj).hidePlayIcon();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Show(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7a145b", new Object[]{this, obj, new Boolean(z)});
        } else if (obj instanceof BlankFrame2) {
            BlankFrame2 blankFrame2 = (BlankFrame2) obj;
            blankFrame2.setNeedHideGoodsIcon(z);
            blankFrame2.show();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getBlankFrame2Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9359d849", new Object[]{this});
        }
        return BlankFrame2.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("230d7c1b", new Object[]{this, context, ux9Var}) : new LiveAvatarNewFrame(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveEndFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c28d9e38", new Object[]{this});
        }
        return LiveEndRecommendFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveReadyFrame(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("95fcbe37", new Object[]{this, context, ux9Var});
        }
        return new TaoLiveReadyRecommendFrame(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getShowcaseFrame(Context context, ux9 ux9Var, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("680416d4", new Object[]{this, context, ux9Var, liveItem});
        }
        return new ShowcaseFrame(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getTopFakeBarFrame(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("6aeb71b5", new Object[]{this, context, ux9Var});
        }
        return new TopFakeBarFrame(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getWatermarkFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("12434758", new Object[]{this});
        }
        return WatermarkFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object showClearScreenGuide(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2f1a82b1", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        ot3 ot3Var = new ot3(context);
        ot3Var.show();
        return ot3Var;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object showPlayRateScreenGuide(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b441b6d0", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        n6m n6mVar = new n6m(context);
        n6mVar.e(false);
        return n6mVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("900cfdae", new Object[]{this, context, new Boolean(z), tBLiveDataModel}) : new LiveAvatarNewFrame(context, z, tBLiveDataModel);
    }
}
