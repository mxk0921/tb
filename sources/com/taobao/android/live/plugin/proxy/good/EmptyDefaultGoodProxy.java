package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.b2e;
import tb.beb;
import tb.mac;
import tb.nac;
import tb.qyc;
import tb.s9z;
import tb.stk;
import tb.t2o;
import tb.tac;
import tb.ux9;
import tb.wbc;
import tb.yac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EmptyDefaultGoodProxy implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EmptyDefaultGoodProxy ";

    static {
        t2o.a(806355153);
        t2o.a(806355158);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy activityDestroy");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public s9z createAtmosphere(Context context, ux9 ux9Var, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s9z) ipChange.ipc$dispatch("1d561e0d", new Object[]{this, context, ux9Var, viewGroup});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy createAtmosphere");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public BaseFrame createBigCardKandianFrame(Activity activity, ux9 ux9Var, LiveItem liveItem, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7a314d90", new Object[]{this, activity, ux9Var, liveItem, frameLayout});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy renderBigCard");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy createDX");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("2920b78f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy createGoodFrame");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("df48474d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy createGoodFrameKandian");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec8af478", new Object[]{this, context});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy createUltronInstanceAndInitServerConfig");
        return new Object();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy destroy");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy destroyDXManger");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(stk stkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26574cc", new Object[]{this, stkVar, str});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy follow");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public beb getActionAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (beb) ipChange.ipc$dispatch("1b0598e0", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getActionAdapter");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getCurrentAnchorId");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getDynamicXEngine");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue();
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getFollowState");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9fe6d01c", new Object[]{this, ux9Var, str});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getGLConfig | key=" + str);
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public tac getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tac) ipChange.ipc$dispatch("c1a136a", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getGoodHandlerProxy");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getItemListXEageleeyeId");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public HashMap<String, String> getLastClickItemInfo(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("467a974e", new Object[]{this, yacVar});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getLastClickItemInfo");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public b2e getTrackAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2e) ipChange.ipc$dispatch("cd84b170", new Object[]{this});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy getTrackAdapter");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy initUltronServerConfig");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isListShow(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e4c3457", new Object[]{this, yacVar})).booleanValue();
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy isListShow");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue();
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy isMultiStateSecKill");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        FlexaLiveX.w("EmptyDefaultGoodProxy parseExpressionObj");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void preloadLVContainers(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91da17c", new Object[]{this, context});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy preloadLVContainers");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy registShowcaseFrame");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy renderDX");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(beb bebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5ebf92", new Object[]{this, bebVar});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setActionAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(nac nacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949daa1c", new Object[]{this, nacVar});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setGoodFrameAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(wbc wbcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ed2a72", new Object[]{this, wbcVar});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setH5TabFrameAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(yac yacVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6193f72e", new Object[]{this, yacVar, str, str2});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setListCacheData");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(qyc qycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b10f02", new Object[]{this, qycVar});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setNavAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setTemplateString");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(b2e b2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287a5252", new Object[]{this, b2eVar});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy setTrackAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            FlexaLiveX.w("EmptyDefaultGoodProxy renderDX");
        }
    }
}
