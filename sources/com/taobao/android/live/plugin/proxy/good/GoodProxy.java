package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.GoodProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.b2e;
import tb.beb;
import tb.k2n;
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
public class GoodProxy extends k2n<IGoodProxy> implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodProxy";
    private IGoodProxy mDefaultProxy = new EmptyDefaultGoodProxy();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final GoodProxy f8748a = new GoodProxy();

        static {
            t2o.a(806355155);
        }

        public static /* synthetic */ GoodProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodProxy) ipChange.ipc$dispatch("648c4c9c", new Object[0]);
            }
            return f8748a;
        }
    }

    static {
        t2o.a(806355154);
        t2o.a(806355158);
    }

    public GoodProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[GoodProxy<init>] error: " + th.getMessage());
        }
    }

    public static IGoodProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IGoodProxy) ipChange.ipc$dispatch("7afbf586", new Object[0]);
        }
        return a.a();
    }

    private IGoodProxy getProxyWithDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IGoodProxy) ipChange.ipc$dispatch("ce6b5fce", new Object[]{this});
        }
        IGoodProxy real = getReal();
        if (real == null) {
            return this.mDefaultProxy;
        }
        return real;
    }

    public static /* synthetic */ Object ipc$super(GoodProxy goodProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/good/GoodProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        } else {
            getProxyWithDefault().activityDestroy();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public s9z createAtmosphere(Context context, ux9 ux9Var, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s9z) ipChange.ipc$dispatch("1d561e0d", new Object[]{this, context, ux9Var, viewGroup});
        }
        return getProxyWithDefault().createAtmosphere(context, ux9Var, viewGroup);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public BaseFrame createBigCardKandianFrame(Activity activity, ux9 ux9Var, LiveItem liveItem, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7a314d90", new Object[]{this, activity, ux9Var, liveItem, frameLayout});
        }
        return getProxyWithDefault().createBigCardKandianFrame(activity, ux9Var, liveItem, frameLayout);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        return getProxyWithDefault().createDX(context, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("2920b78f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        return getProxyWithDefault().createGoodFrame(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public mac createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mac) ipChange.ipc$dispatch("df48474d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, ux9Var});
        }
        return getProxyWithDefault().createGoodFrameKandian(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec8af478", new Object[]{this, context});
        }
        return getProxyWithDefault().createUltronInstanceAndInitServerConfig(context);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else {
            getProxyWithDefault().destroy(obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            getProxyWithDefault().destroyDXManger();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(stk stkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26574cc", new Object[]{this, stkVar, str});
        } else {
            getProxyWithDefault().follow(stkVar, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public beb getActionAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (beb) ipChange.ipc$dispatch("1b0598e0", new Object[]{this});
        }
        return getProxyWithDefault().getActionAdapter();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this});
        }
        return getProxyWithDefault().getCurrentAnchorId();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        return getProxyWithDefault().getDynamicXEngine();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue();
        }
        return getProxyWithDefault().getFollowState();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9fe6d01c", new Object[]{this, ux9Var, str});
        }
        return getProxyWithDefault().getGLConfig(ux9Var, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public tac getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tac) ipChange.ipc$dispatch("c1a136a", new Object[]{this});
        }
        return getProxyWithDefault().getGoodHandlerProxy();
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return "GoodProxy";
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this});
        }
        return getProxyWithDefault().getItemListXEageleeyeId();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public HashMap<String, String> getLastClickItemInfo(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("467a974e", new Object[]{this, yacVar});
        }
        return getProxyWithDefault().getLastClickItemInfo(yacVar);
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.GoodProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveGoodPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public b2e getTrackAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2e) ipChange.ipc$dispatch("cd84b170", new Object[]{this});
        }
        return getProxyWithDefault().getTrackAdapter();
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "宝贝口袋";
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        } else {
            getProxyWithDefault().initUltronServerConfig(context);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isListShow(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e4c3457", new Object[]{this, yacVar})).booleanValue();
        }
        return getProxyWithDefault().isListShow(yacVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue();
        }
        return getProxyWithDefault().isMultiStateSecKill(liveItem);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        return getProxyWithDefault().parseExpressionObj(jSONObject, obj, z);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void preloadLVContainers(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91da17c", new Object[]{this, context});
        } else {
            getProxyWithDefault().preloadLVContainers(context);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            getProxyWithDefault().registShowcaseFrame();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            getProxyWithDefault().renderDX(dXRootView, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(beb bebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5ebf92", new Object[]{this, bebVar});
        } else {
            getProxyWithDefault().setActionAdapter(bebVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(nac nacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949daa1c", new Object[]{this, nacVar});
        } else {
            getProxyWithDefault().setGoodFrameAdapter(nacVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(wbc wbcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ed2a72", new Object[]{this, wbcVar});
        } else {
            getProxyWithDefault().setH5TabFrameAdapter(wbcVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(yac yacVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6193f72e", new Object[]{this, yacVar, str, str2});
        } else {
            getProxyWithDefault().setListCacheData(yacVar, str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(qyc qycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b10f02", new Object[]{this, qycVar});
        } else {
            getProxyWithDefault().setNavAdapter(qycVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            getProxyWithDefault().setTemplateString(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(b2e b2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287a5252", new Object[]{this, b2eVar});
        } else {
            getProxyWithDefault().setTrackAdapter(b2eVar);
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IGoodProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IGoodProxy) ipChange.ipc$dispatch("50aade7a", new Object[]{this})) : new GoodProxyX();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            getProxyWithDefault().renderDX(dXRootView, jSONObject, dXRenderOptions);
        }
    }
}
