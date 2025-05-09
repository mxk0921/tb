package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelStoreOwner;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrameForKandian;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.bigcard.KandianBigCardFrame;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.aq8;
import tb.b2e;
import tb.bea;
import tb.beb;
import tb.fea;
import tb.feg;
import tb.hha;
import tb.ikr;
import tb.jga;
import tb.kkr;
import tb.mac;
import tb.nac;
import tb.pfa;
import tb.poo;
import tb.qyc;
import tb.s9z;
import tb.stk;
import tb.t2o;
import tb.tac;
import tb.ux9;
import tb.vvs;
import tb.wbc;
import tb.wda;
import tb.xea;
import tb.y6p;
import tb.yac;
import tb.yga;
import tb.zga;
import tb.zu1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodProxyX implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodProxyX";
    private final tac mGoodHandlerProxy = new bea();

    static {
        t2o.a(295699604);
        t2o.a(806355158);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    @Deprecated
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public s9z createAtmosphere(Context context, ux9 ux9Var, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s9z) ipChange.ipc$dispatch("1d561e0d", new Object[]{this, context, ux9Var, viewGroup});
        }
        return new poo(context, ux9Var, viewGroup);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public BaseFrame createBigCardKandianFrame(Activity activity, ux9 ux9Var, LiveItem liveItem, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7a314d90", new Object[]{this, activity, ux9Var, liveItem, frameLayout});
        }
        return new KandianBigCardFrame(activity, ux9Var, liveItem, frameLayout);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        return ikr.f().a(context, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("2920b78f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        return new GoodFrame(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("df48474d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        return new GoodFrameForKandian(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec8af478", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else if (obj instanceof xea) {
            kkr.i().a((xea) obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            ikr.f().b();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(stk stkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26574cc", new Object[]{this, stkVar, str});
        } else {
            kkr.i().b(null, stkVar, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public beb getActionAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (beb) ipChange.ipc$dispatch("1b0598e0", new Object[]{this});
        }
        return kkr.i().d();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this});
        }
        return jga.c(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        return ikr.f().e();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue();
        }
        return kkr.i().f(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(ux9 ux9Var, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9fe6d01c", new Object[]{this, ux9Var, str});
        }
        if ("glPerformanceExclusive".equals(str)) {
            return Boolean.valueOf(wda.M());
        }
        if ("bigCardChatViewStyle".equals(str)) {
            if (ux9Var == null) {
                hha.b(TAG, "bigCardChatViewStyle | frameContext null.");
                return "";
            }
            Object k = ux9Var.k();
            if (!(k instanceof xea) || (jSONObject = ((xea) k).R) == null) {
                return null;
            }
            return jSONObject.toJSONString();
        } else if (!"glItemNum".equals(str)) {
            return null;
        } else {
            if (ux9Var == null) {
                hha.b(TAG, "glItemNum | frameContext null.");
                return -1;
            }
            Object k2 = ux9Var.k();
            if (k2 instanceof xea) {
                xea xeaVar = (xea) k2;
                if (xeaVar.j() != null) {
                    return Integer.valueOf(xeaVar.j().d0());
                }
            }
            hha.b(TAG, "glItemNum | goodLiveContext=" + k2);
            if (ux9Var.g() == null || ux9Var.g().a() == null) {
                return -1;
            }
            hha.b(TAG, "glItemNum | return videoInfo num.");
            return Integer.valueOf(ux9Var.g().a().curItemNum);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public tac getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tac) ipChange.ipc$dispatch("c1a136a", new Object[]{this});
        }
        return this.mGoodHandlerProxy;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this});
        }
        return kkr.i().j();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public HashMap<String, String> getLastClickItemInfo(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("467a974e", new Object[]{this, yacVar});
        }
        if (yacVar instanceof xea) {
            return ((xea) yacVar).s();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public b2e getTrackAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2e) ipChange.ipc$dispatch("cd84b170", new Object[]{this});
        }
        return kkr.i().o();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        } else if (wda.x() || wda.a()) {
            pfa.u((ViewModelStoreOwner) context);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isListShow(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e4c3457", new Object[]{this, yacVar})).booleanValue();
        }
        if (yacVar instanceof xea) {
            return ((xea) yacVar).P();
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue();
        }
        return y6p.b(liveItem);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        return aq8.a(jSONObject, obj, z);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void preloadLVContainers(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91da17c", new Object[]{this, context});
        } else if (yga.j()) {
            new feg().h(context);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            zu1.b("tl-showcase-common", ShowcaseFrame.class);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            ikr.f().j(dXRootView, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(beb bebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5ebf92", new Object[]{this, bebVar});
        } else {
            kkr.i().u(bebVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(nac nacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949daa1c", new Object[]{this, nacVar});
        } else {
            kkr.i().v(nacVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(wbc wbcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ed2a72", new Object[]{this, wbcVar});
        } else {
            kkr.i().w(wbcVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(yac yacVar, String str, String str2) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6193f72e", new Object[]{this, yacVar, str, str2});
        } else if (!TextUtils.isEmpty(str2) || vvs.b("goodlist", "enableLandPortrait", true)) {
            if (yacVar instanceof xea) {
                xeaVar = (xea) yacVar;
            } else {
                xeaVar = null;
            }
            if (xeaVar != null) {
                fea a2 = fea.a(str, str2);
                kkr.i().x(xeaVar, a2);
                if (yacVar != null && zga.a() && !TextUtils.isEmpty(str2)) {
                    a2.h(xeaVar.f());
                    hha.c(TAG, "gotoTimeShift | cache goodlist dxdata. cacheData=" + a2);
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(qyc qycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b10f02", new Object[]{this, qycVar});
        } else {
            kkr.i().y(qycVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            ikr.f().n(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(b2e b2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287a5252", new Object[]{this, b2eVar});
        } else {
            kkr.i().A(b2eVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            ikr.f().k(dXRootView, jSONObject, dXRenderOptions);
        }
    }
}
