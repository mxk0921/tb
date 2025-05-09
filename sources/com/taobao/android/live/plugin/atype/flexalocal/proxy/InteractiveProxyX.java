package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.jsbridge.TBLiveOnlyDebugWVPlugin;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.jsbridge.TBLiveWVPlugin;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.fanslevel.H5DynamicSDKFrame;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.interactpanel.InteractPanelFrameSDK;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.right_component.RightComponentFrameSDK;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.system_component.SystemComponentFrameSDK;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.ddu;
import tb.ig6;
import tb.jnr;
import tb.kpw;
import tb.nga;
import tb.roa;
import tb.t2o;
import tb.ukr;
import tb.ux9;
import tb.wbc;
import tb.xkc;
import tb.y26;
import tb.ye6;
import tb.zvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveProxyX implements IInteractiveProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Class<? extends BaseFrame>> frameClassMap = new HashMap<String, Class<? extends BaseFrame>>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.InteractiveProxyX.1
        {
            put("dynamic_h5_sdk", H5DynamicSDKFrame.class);
            put("tl-intimacy", SystemComponentFrameSDK.class);
            put("tl-interactive-entrance", RightComponentFrameSDK.class);
            put("tl-interact-panel", InteractPanelFrameSDK.class);
        }
    };
    private final Map<String, Class<? extends kpw>> wvApiClassMap = new HashMap<String, Class<? extends kpw>>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.InteractiveProxyX.2
        {
            put(IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN, TBLiveWVPlugin.class);
            put("TBLiveOnlyDebugWVPlugin", TBLiveOnlyDebugWVPlugin.class);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ddu.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f8646a;

        public a(InteractiveProxyX interactiveProxyX, jnr jnrVar) {
            this.f8646a = jnrVar;
        }

        @Override // tb.ddu.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df3f29f9", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) str);
            this.f8646a.h(jSONObject.toJSONString());
        }
    }

    static {
        t2o.a(295699606);
        t2o.a(806355271);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public wbc createGoodsH5TabFrameAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbc) ipChange.ipc$dispatch("d69cb922", new Object[]{this});
        }
        return new nga();
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("124c4837", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return new H5DynamicSDKFrame(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public IInteractiveProxy.h createInteractiveManager(Context context, ux9 ux9Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("63eada32", new Object[]{this, context, ux9Var, new Long(j)});
        }
        return new ukr(context, ux9Var, j);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public IInteractiveProxy.k createTaoLiveWebBottomFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.k) ipChange.ipc$dispatch("4a02e021", new Object[]{this});
        }
        return new TaoLiveWebBottomFragment.d();
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        return this.frameClassMap.get(str);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public boolean getTradeSign(IWVWebView iWVWebView, jnr jnrVar) {
        zvg zvgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85557a78", new Object[]{this, iWVWebView, jnrVar})).booleanValue();
        }
        Object a2 = roa.a(iWVWebView);
        if (a2 instanceof xkc) {
            zvgVar = ((xkc) a2).a();
        } else {
            zvgVar = null;
        }
        if (zvgVar == null || zvgVar.i() == null) {
            jnrVar.b();
            return false;
        } else if (zvgVar.i().a0(new a(this, jnrVar))) {
            return true;
        } else {
            jnrVar.b();
            return false;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public Class<? extends kpw> getWvApiClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fd0cb67", new Object[]{this, str});
        }
        return this.wvApiClassMap.get(str);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy
    public void registerEventHandlerAndWidget(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc669e0", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(ig6.DX_EVENT_TAOLIVEINTERACTCLICK, new ig6());
        dinamicXEngine.e1(ye6.DXTLCOMPONENTPROGRESS_TLCOMPONENTPROGRESS, new ye6.a());
        dinamicXEngine.e1(y26.DXLIVESCROLLTEXTVIEW_LIVESCROLLTEXTVIEW, new y26.b());
    }
}
