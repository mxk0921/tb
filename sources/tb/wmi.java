package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714338);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("652f68f6", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableUTDirect", true);
    }

    public static Map b(FluidContext fluidContext, vrp vrpVar) {
        Map<String, Object> map;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7ff56b1", new Object[]{fluidContext, vrpVar});
        }
        HashMap hashMap = new HashMap();
        ISceneConfigService iSceneConfigService = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        iep sessionExtParams = iSceneConfigService.getSessionExtParams();
        pep sessionParams = iSceneConfigService.getSessionParams();
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        hashMap.put("tbvs_version", 31);
        hashMap.put("pageUrl", fluidContext.getInstanceConfig().getFluidUrl());
        if (j == null) {
            map = new HashMap<>();
        } else {
            map = j.g();
        }
        hashMap.put("configs", map);
        Map map3 = null;
        hashMap.put("sessionParams", sessionParams == null ? null : sessionParams.f26046a);
        if (vrpVar != null) {
            map2 = vrpVar.b();
        } else {
            map2 = new HashMap();
        }
        hashMap.put("initData", map2);
        hashMap.put("scene", sessionExtParams == null ? null : sessionExtParams.a());
        hashMap.put("isFullScreen", Boolean.valueOf(fluidContext.getInstanceConfig().isTab3Fullscreen()));
        String ggType = fluidContext.getInstanceConfig().getGgType();
        if (TextUtils.isEmpty(ggType)) {
            ggType = null;
        }
        hashMap.put("ggType", ggType);
        String tab3ComponentSource = fluidContext.getInstanceConfig().getTab3ComponentSource();
        if (TextUtils.isEmpty(tab3ComponentSource)) {
            tab3ComponentSource = null;
        }
        hashMap.put(c4o.KEY_TAB3COMPONENTSOURCE, tab3ComponentSource);
        hashMap.put("isImmersiveVideo", Boolean.valueOf(pto.i(fluidContext)));
        String d = sessionExtParams == null ? null : sessionExtParams.d();
        if (!TextUtils.isEmpty(d)) {
            hashMap.put("tab3SceneSource", d);
        }
        if (sessionExtParams != null) {
            map3 = sessionExtParams.b();
        }
        hashMap.put("tab3ExtParams", map3);
        String tabId = fluidContext.getInstanceConfig().getTabId();
        if (!TextUtils.isEmpty(tabId)) {
            hashMap.put("tab3CardType", tabId);
        }
        hashMap.put("actionBarHeight", Integer.valueOf(bbw.d(fluidContext)));
        hashMap.put("bottomBarHeight", Integer.valueOf(bbw.e(fluidContext)));
        hashMap.put(c4o.KEY_VERTICAL_LAYOUT, Boolean.valueOf(b93.n(fluidContext)));
        hashMap.put(sj4.NATIVE_ALBUM, Boolean.valueOf(b93.f()));
        hashMap.put("isLargeScreenDevice", Boolean.valueOf(pr9.l()));
        hashMap.put("topBarMarginTop", Integer.valueOf(pcw.m()));
        hashMap.put("topBarHeight", Integer.valueOf(pcw.l()));
        FluidInstance fluidInstance = (FluidInstance) fluidContext;
        hashMap.put("tab3TopBarHeight", Integer.valueOf(pcw.o(fluidInstance)));
        hashMap.put("tab3TopBarTopY", Integer.valueOf(pcw.q(fluidInstance)));
        hashMap.put("tab3TopBarBottomY", Integer.valueOf(pcw.p(fluidInstance)));
        hashMap.put("ggTabbarHeight", Integer.valueOf(pr9.o(p91.i())));
        hashMap.put("isTabbarVisible", Boolean.valueOf(od0.D().f().C()));
        long b = hol.b(fluidContext);
        if (b > 0) {
            hashMap.put("TTFE", Long.valueOf(b));
        }
        hashMap.put("supportPadHalfZoom", Boolean.valueOf(hn4.f(fluidContext)));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isGuangGuang", Boolean.valueOf(TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE)));
        hashMap2.put("supportLockListView", "true");
        hashMap2.put("supportDXComment", "true");
        hashMap2.put("supportItemRecognize", "true");
        hashMap2.put("supportGoodsPoint", "true");
        hashMap2.put("supportProgressMovedown", Boolean.valueOf(b93.x(fluidContext)));
        Boolean bool = Boolean.FALSE;
        hashMap2.put("hasHalfScreenGuide", bool);
        hashMap2.put("supportNewLandscape", Boolean.valueOf(c()));
        hashMap2.put("isTab3GuideShoppingVersion", Boolean.valueOf(hn4.o(fluidContext)));
        hashMap2.put("supportCollectionPage", Boolean.valueOf(((ICollectionService) fluidContext.getService(ICollectionService.class)).isCollectionScene()));
        hashMap2.put("isTab3UseNewMtop", Boolean.TRUE);
        hashMap2.put("enableUTDirect", Boolean.valueOf(a()));
        kgv kgvVar = kgv.INSTANCE;
        hashMap2.put("isUnderageMode", Boolean.valueOf(kgvVar.h(fluidContext.getContext())));
        hashMap2.put("isSystemMinors", Boolean.valueOf(kgvVar.g(fluidContext.getContext())));
        hashMap2.put("minorsAgeLevel", Integer.valueOf(kgvVar.b(fluidContext.getContext())));
        hashMap2.put("supportSnapShot", Boolean.valueOf(x4w.INSTANCE.d()));
        hashMap2.put("isSupportRelateData", bool);
        hashMap2.put("isRelateDataFlow", bool);
        hashMap2.put("openUiReLayout", pto.a());
        hashMap2.put("supportImmersiveLiveJump", String.valueOf(f4h.g()));
        hashMap2.put("supportTNodeBridge", Boolean.valueOf(fgs.a()));
        hashMap.put("extra", hashMap2);
        HashMap h = mfj.h(fluidContext);
        if (!h.isEmpty()) {
            hashMap.put("globalMuteState", h);
        }
        sj4.a(hashMap);
        return hashMap;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e14a61", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLandscapeDialog", true);
    }
}
