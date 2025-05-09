package tb;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.TrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xau {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AI_PAGE_NAME = "ClientAI";
    public static final int EVENT_ID_19997 = 19997;
    public static final String KEY_IS_NATIVE_AD = "is_nativeAd";
    public static final String PAGE_NAME = "Page_videointeract";
    public static final String PRODUCT_NAME = "videointeract";
    public static final String PROPERTY_CLICK_ID = "clickid";
    public static final String PROPERTY_COLD_DISAPPEAR_TIME = "cold_disappear_times";
    public static final String PROPERTY_COLD_FIRST_FRAME_TYPE = "cold_first_frame_type";
    public static final String PROPERTY_CURRENT_VIDEO_TIME = "current_video_time";
    public static final String PROPERTY_DISAPPEAR_TIME = "disappear_times";
    public static final String PROPERTY_FEED_ID = "feed_id";
    public static final String PROPERTY_HIT_MTOP_PREFETCH = "hit_mtop_prefetch";
    public static final String PROPERTY_IS_FINISH = "isFinish";
    public static final String PROPERTY_IS_FROM_LAUNCHER = "isFromLauncher";
    public static final String PROPERTY_LAUNCHER_NODE_URL = "launcherNodeUrl";
    public static final String PROPERTY_MAX_INDEX_NORMAL = "maxIndexNormal";
    public static final String PROPERTY_PAGENAME = "pageName";
    public static final String PROPERTY_PROCESS_LAUNCHER_FLAG = "processLauncherFlag";
    public static final String PROPERTY_REDPOINT_FIRST_FRAME_TYPE = "redpoint_first_frame_type";
    public static final String PROPERTY_UCM = "ucm";
    public static final String PROPERTY_VIDEO_ID = "video_id";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ir9.b("TrackUtils", "refreshUTIfNeeded");
                g3v.getInstance().saveCacheDataToLocal();
                Thread.sleep(akt.u2());
                g3v.getInstance().dispatchLocalHits();
            } catch (Throwable th) {
                ir9.b("TrackUtils", "refreshUTIfNeeded " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(468713588);
    }

    public static void A(FluidContext fluidContext, Map<String, String> map, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b942c1", new Object[]{fluidContext, map, uq9Var});
            return;
        }
        if (uq9Var instanceof prp) {
            int P = uq9Var.Y().P();
            int v = uq9Var.Y().v();
            r8e c = ((prp) uq9Var).G1().c();
            int i = c.g;
            int i2 = c.h;
            ir9.b("TrackUtils", "showContent videoWH:" + P + "," + v + "; videoShowWH:" + i + "," + i2);
            map.put("videoWidth", String.valueOf(P));
            map.put("videoHeight", String.valueOf(v));
            map.put("videoShowWidth", String.valueOf(i));
            map.put("videoShowHeight", String.valueOf(i2));
        }
        F(fluidContext, "contentshow", map);
    }

    public static void B(uq9 uq9Var, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5fa4b6", new Object[]{uq9Var, map, new Long(j)});
        } else if (j > 0) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.put("play_time", String.valueOf(j));
            if (uq9Var instanceof xyw) {
                String valueOf = String.valueOf(ezw.d((xyw) uq9Var));
                hashMap.put("current_play_time", valueOf);
                ir9.b("[webcomponent_trackerUtils]", "showContentEnd埋点，play_time：" + j + ",current_play_time:" + valueOf);
            }
            F(uq9Var.U(), "Show-content_end", hashMap);
        }
    }

    public static void C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b6432f", new Object[]{map});
        } else {
            F(null, "ggGame", map);
        }
    }

    public static void D(FluidContext fluidContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1a5dee", new Object[]{fluidContext, map});
            return;
        }
        map.put("go", "2");
        F(fluidContext, "videoshow", map);
    }

    public static void E(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55774d83", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Click("Page_videointeract", str, map);
        }
    }

    public static void F(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d04a03c", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Show("Page_videointeract", str, map);
        }
    }

    public static void G(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7b833a", new Object[]{fluidContext, str, map});
        } else {
            FluidSDK.getUTAdapter().withFluidContext(fluidContext).track4Show2202("Page_videointeract", str, map);
        }
    }

    public static void H(FluidContext fluidContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512eddd4", new Object[]{fluidContext, str, map});
        } else {
            I(fluidContext, str, map, 19997);
        }
    }

    public static void I(FluidContext fluidContext, String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d56122", new Object[]{fluidContext, str, map, new Integer(i)});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(v(fluidContext));
        if (map.containsKey("videoid")) {
            map.put("contentId", map.get("videoid"));
        }
        FluidSDK.getUTAdapter().withFluidContext(fluidContext).trackCustom(AI_PAGE_NAME, i, str, null, null, map);
    }

    public static void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c88997", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("context", str);
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "AddViewDuringLayout", null, null, hashMap);
    }

    public static void K(FluidContext fluidContext, int i, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c220b0", new Object[]{fluidContext, new Integer(i), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack());
        hashMap.put("position", String.valueOf(i));
        if (z) {
            str = BizTaskData.MANUAL_TIME;
        } else {
            str = "natural";
        }
        hashMap.put("showType", str);
        F(fluidContext, "Show-Pic", hashMap);
    }

    public static void L(FluidContext fluidContext, String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14293eec", new Object[]{fluidContext, str, map, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("sourceGroup", "guangguang");
        hashMap.put("play_time", String.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("is_pv", "Y");
        hashMap2.put("exp_stay_time", String.valueOf(j));
        hashMap2.put("x_object_id", str);
        hashMap2.put("js_now", String.valueOf(System.currentTimeMillis()));
        hashMap.put("utLogMap", JSON.toJSONString(hashMap2));
        F(fluidContext, "Page_videointeract_Show_articleStayTime", hashMap);
    }

    public static void M(int i, int i2, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e57797", new Object[]{new Integer(i), new Integer(i2), new Long(j), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i));
        hashMap.put("failScrollToNextReason", String.valueOf(i2));
        hashMap.put("shownTime", String.valueOf(j));
        hashMap.put("apiErrorCode", String.valueOf(str));
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "cannot_scroll_loading_shown", null, null, hashMap);
    }

    public static void N(FluidContext fluidContext, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c196fa67", new Object[]{fluidContext, new Boolean(z), str, str2});
            return;
        }
        Map<String, String> v = v(fluidContext);
        v.put("succeed", String.valueOf(z));
        v.put("url", str);
        v.put("error", str2);
        E(fluidContext, "Button-cdnload", v);
    }

    public static void O(FluidContext fluidContext, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af277b6c", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (z) {
            str = "quit-left";
        } else {
            str = "quit-right";
        }
        v.put("hs_stype", str);
        E(fluidContext, "Button-Horizontal_screen", v);
    }

    public static void P(FluidContext fluidContext, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de9b7bf", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (z) {
            str = "0";
        } else {
            str = "1";
        }
        v.put("pausestate", str);
        E(fluidContext, "Button-video-pause-dragprogressbar", v);
    }

    public static void Q(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbedba4", new Object[]{hashMap});
        } else {
            FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "ZeroSizeOnStart", null, null, hashMap);
        }
    }

    public static void R(FluidContext fluidContext, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef77ea4", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (z) {
            str = "1";
        } else {
            str = "2";
        }
        v.put("dragtype", str);
        E(fluidContext, "Button-video-pause-dragprogressbar", v);
    }

    public static void S(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd26aed", new Object[]{fluidContext});
        } else {
            E(fluidContext, "Button-video-Horizontal_screen-operate", v(fluidContext));
        }
    }

    public static void U(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1a95d3", new Object[]{fluidContext, str});
            return;
        }
        try {
            Map<String, String> v = v(fluidContext);
            if (v != null) {
                v.put(c4o.KEY_REFRESH_TYPE, str);
            }
            E(fluidContext, "Button-RefreshData", v);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void V(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa3af13", new Object[]{fluidContext, str, str2});
            return;
        }
        Map<String, String> v = v(fluidContext);
        v.put("blackScreenType", str);
        v.put("blackScreenUtpairs", str2);
        G(fluidContext, "Page_videointeract_Show-VideoError", v);
    }

    public static void W(FluidContext fluidContext, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cd23a1", new Object[]{fluidContext, hashMap});
        } else {
            X(fluidContext, hashMap, null);
        }
    }

    public static void X(FluidContext fluidContext, HashMap<String, String> hashMap, Boolean bool) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2499e0c", new Object[]{fluidContext, hashMap, bool});
            return;
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        a.d e = currentMediaSetData == null ? null : currentMediaSetData.e();
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null && sessionParams != null) {
            hashMap.clear();
            hashMap.putAll(activeCardCommonTrack);
            hashMap.put("clickid", sessionParams.p);
            JSONObject jSONObject = new JSONObject();
            if (e != null) {
                if (e.C()) {
                    jSONObject.put(PROPERTY_VIDEO_ID, (Object) e.O());
                }
                jSONObject.put("feed_id", (Object) e.f());
            }
            jSONObject.put("page", (Object) sessionParams.c);
            hashMap.put(PROPERTY_UCM, jSONObject.toJSONString());
            hashMap.put("pageName", "Page_videointeract");
            hashMap.put(PROPERTY_MAX_INDEX_NORMAL, String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getMaxSlideIndexPublicMode()));
            hashMap.put(PROPERTY_CURRENT_VIDEO_TIME, String.valueOf(((IMediaService) fluidContext.getService(IMediaService.class)).getVideoLength()));
            hashMap.put(PROPERTY_HIT_MTOP_PREFETCH, String.valueOf(((IDataService) fluidContext.getService(IDataService.class)).isTab3LauncherHitMtopPrefetch()));
            hashMap.put("isFromLauncher", String.valueOf(pto.l(fluidContext)));
            if (oau.g(fluidContext)) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("processLauncherFlag", str);
            String c = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().c();
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("launcherNodeUrl", c);
            }
            if (bool != null) {
                hashMap.put(PROPERTY_IS_FINISH, String.valueOf(bool));
            }
            if (pto.g(fluidContext)) {
                String valueOf = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getTab3ComponentDisappearTimes());
                String valueOf2 = String.valueOf(TrackService.sTab3ColdDisAppearTimes);
                String valueOf3 = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().a());
                String valueOf4 = String.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getConfig().b());
                hashMap.put(PROPERTY_DISAPPEAR_TIME, valueOf);
                hashMap.put(PROPERTY_COLD_DISAPPEAR_TIME, valueOf2);
                hashMap.put(PROPERTY_COLD_FIRST_FRAME_TYPE, valueOf3);
                hashMap.put(PROPERTY_REDPOINT_FIRST_FRAME_TYPE, valueOf4);
                ir9.b("PickPreloadController2001h", "disappear_times:" + valueOf + ",cold_disappear_times:" + valueOf2 + ",cold_first_frame_type:" + valueOf3 + ",redpoint_first_frame_type:" + valueOf4);
            }
            sj4.a(hashMap);
            hashMap.putAll(((ITrackService) fluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithCard(null));
        }
    }

    public static void Z(HashMap<String, String> hashMap, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a34eea", new Object[]{hashMap, map});
        } else if (hashMap != null && map != null) {
            hashMap.putAll(map);
        }
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc81a03", new Object[]{fluidContext, str});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (!TextUtils.isEmpty(str)) {
            v.put(KEY_IS_NATIVE_AD, "1");
        } else {
            v.put(KEY_IS_NATIVE_AD, "0");
        }
        E(fluidContext, "Button-native-video-pause-ad", v);
    }

    public static void a0(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc20f66", new Object[]{fluidContext});
        } else {
            F(fluidContext, "winplay_show", v(fluidContext));
        }
    }

    public static void b(View view, String str, HashMap<String, String> hashMap) {
        boolean isLayoutSuppressed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a52df9", new Object[]{view, str, hashMap});
        } else if (view != null) {
            if (Build.VERSION.SDK_INT >= 29 && (view instanceof ViewGroup)) {
                isLayoutSuppressed = ((ViewGroup) view).isLayoutSuppressed();
                hashMap.put(str + "Suppressed", String.valueOf(isLayoutSuppressed));
            }
            hashMap.put(str + "InLayout", String.valueOf(view.isInLayout()));
            hashMap.put(str + "LaidOut", String.valueOf(view.isLaidOut()));
        }
    }

    public static HashMap<String, String> c(boolean z, String str, ViewGroup viewGroup, ViewGroup viewGroup2) {
        String str2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("dae9585", new Object[]{new Boolean(z), str, viewGroup, viewGroup2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (z) {
            str2 = "video";
        } else {
            str2 = "live";
        }
        hashMap.put("type", str2);
        hashMap.put("contentId", str);
        ViewGroup viewGroup5 = null;
        if (viewGroup == null) {
            viewGroup3 = null;
            viewGroup4 = null;
        } else if (z) {
            viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.video_host);
            viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.favor_frame);
            viewGroup3 = null;
        } else {
            viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.live_host);
            viewGroup4 = null;
        }
        b(viewGroup, WXBasicComponentType.CELL, hashMap);
        b(viewGroup5, "favorFrame", hashMap);
        b(viewGroup4, "videoHost", hashMap);
        b(viewGroup3, "liveHost", hashMap);
        b(viewGroup2, "video", hashMap);
        return hashMap;
    }

    public static void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("301f406a", new Object[]{fluidContext});
        } else {
            E(fluidContext, "backtovideo", v(fluidContext));
        }
    }

    public static void e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5ed9a5", new Object[]{fluidContext});
        } else {
            E(fluidContext, "closewin", v(fluidContext));
        }
    }

    public static void f(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9da6b4", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (z) {
            v.put("controlType", "pause");
        } else {
            v.put("controlType", "play");
        }
        E(fluidContext, "controlwin", v);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c63faa", new Object[0]);
        } else {
            E(null, "Button-DenyPermission", null);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d456fc6a", new Object[0]);
        } else {
            E(null, "Button-GrantPermission", null);
        }
    }

    public static void i(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b7e3e6", new Object[]{fluidContext, str});
            return;
        }
        E(fluidContext, "Button-video-pause", v(fluidContext));
        H(fluidContext, "video-pause", null);
        a(fluidContext, str);
    }

    public static void j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884d94e0", new Object[]{fluidContext});
            return;
        }
        E(fluidContext, "Button-video-play", v(fluidContext));
        H(fluidContext, "video-play", null);
    }

    public static void k(FluidContext fluidContext, int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c8a784", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            Map<String, String> v = v(fluidContext);
            if (v != null) {
                v.put("seekstart", String.valueOf(i));
                v.put("seekend", String.valueOf(i2));
                if (i > i2) {
                    str = "back";
                } else {
                    str = "forward";
                }
                v.put("seekdirection", str);
            }
            E(fluidContext, "Button-videoseek", v);
            H(fluidContext, "Button-videoseek", v);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523bc45d", new Object[]{map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("type", "0");
        E(null, "Button-Dig", hashMap);
    }

    public static void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d90bf2", new Object[]{map});
        } else {
            E(null, "Button-livemodegotolive", map);
        }
    }

    public static void o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32895e99", new Object[]{fluidContext});
        } else {
            E(fluidContext, "Button-slide", v(fluidContext));
        }
    }

    public static void p(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869e33c4", new Object[]{map, str});
        } else if (!TextUtils.isEmpty(str)) {
            map.put("svm_pid", str);
        }
    }

    public static void r(FluidContext fluidContext, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230df629", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            activeCardCommonTrack.put("is_hscreen", str);
        }
    }

    public static void s(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9f9f00", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            activeCardCommonTrack.put("current_play_time", String.valueOf(i));
        }
    }

    public static void t(FluidContext fluidContext, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b220c1a4", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            activeCardCommonTrack.put("xubo", str);
        }
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3a5efc", new Object[0]);
        } else if (y()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
        }
    }

    public static Map<String, String> v(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("38085a2", new Object[]{fluidContext});
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            return new HashMap(activeCardCommonTrack);
        }
        return new HashMap();
    }

    public static int w(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83d17569", new Object[]{fluidContext})).intValue();
        }
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack == null || (str = activeCardCommonTrack.get("index")) == null) {
            return 0;
        }
        return lak.c(str);
    }

    public static void x(FluidContext fluidContext, uq9 uq9Var, Map<String, String> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbadf7fd", new Object[]{fluidContext, uq9Var, map});
            return;
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        Map<String, String> map2 = sessionParams.u;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, String> map3 = sessionParams.v;
        if (map3 != null) {
            map.putAll(map3);
        }
        map.put("topicId", sessionParams.f);
        map.put("utExtParams", sessionParams.t);
        map.put("version", AfcCustomSdk.SDK_VERSION);
        map.put("spm-cnt", sj4.f28084a);
        if (!TextUtils.isEmpty(sessionParams.e)) {
            map.put("spm-url", sessionParams.e);
        }
        map.put("source", sessionParams.c);
        map.put("scm", sessionParams.o);
        map.put("sourceType", sessionParams.b);
        if (!TextUtils.isEmpty(sessionParams.n) && !map.containsKey("trackInfo")) {
            map.put("trackInfo", sessionParams.n);
        }
        map.put("sourcePageName", sessionParams.k);
        map.put("product_type", PRODUCT_NAME);
        if (((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableSharePlayer()) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("xubo", str);
        map.put("tintInfo", JSON.toJSONString(((ITrackService) fluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithCard(uq9Var)));
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (!(j == null || (str2 = j.f24645a) == null)) {
            map.put(IStorage.TYPE_DSL, str2.replace("/", "@"));
        }
        map.put("dsl_is_orange", "" + akt.B0());
        kgv kgvVar = kgv.INSTANCE;
        map.put("is_underage_mode", String.valueOf(kgvVar.h(fluidContext.getContext())));
        map.put("isSystemMinors", String.valueOf(kgvVar.g(fluidContext.getContext())));
        map.put("minorsAgeLevel", String.valueOf(kgvVar.b(fluidContext.getContext())));
        ITrackService iTrackService = (ITrackService) fluidContext.getService(ITrackService.class);
        map.put(yj4.PARAM_ENTRY_UT_PARAM, iTrackService.getUtparamUrl());
        map.put("entryUtparamPre", iTrackService.getUtparamPre());
        String tabId = fluidContext.getInstanceConfig().getTabId();
        map.put("tnode_tab_id", String.valueOf(tabId));
        ir9.b("TrackUtils", "initCommonTrack tnodeTabId=" + tabId);
        sj4.a(map);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c483fe21", new Object[0])).booleanValue();
        }
        return e0o.e("video") && e0o.b(o.J(), "flush_ut", false);
    }

    public static void z(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf6a8e", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        Map<String, String> v = v(fluidContext);
        if (z) {
            v.put("gesture_type", "speedup");
        } else {
            v.put("gesture_type", "showmore");
        }
        E(fluidContext, "Button-LongClick", v);
    }

    public static void Y(FluidContext fluidContext, Map<String, String> map, a.d dVar) {
        MediaContentDetailData g;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee8d951", new Object[]{fluidContext, map, dVar});
            return;
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (!(dVar == null || (g = dVar.g()) == null)) {
            map.put("id", dVar.f());
            map.put("fromCDN", String.valueOf(dVar.j));
            if (dVar.C()) {
                map.put("videoid", dVar.O());
            } else {
                map.remove("videoid");
            }
            map.put("cid", dVar.f());
            map.put("content_account_id", dVar.d());
            map.put("content_type", dVar.N());
            map.put("card_type", g.cardType);
            map.put("fluid_data_version", String.valueOf(dVar.g() == null ? -1 : dVar.g().currentDataVersion));
            if (vt6.h(g.trackInfo)) {
                map.put("trackInfo", g.trackInfo);
            } else if (sessionParams == null || TextUtils.isEmpty(sessionParams.n)) {
                map.remove("trackInfo");
            } else {
                map.put("trackInfo", sessionParams.n);
            }
            map.remove("item_id");
            MediaContentDetailData.Content content = g.content;
            if (!(content == null || (list = content.itemIds) == null || list.size() <= 0)) {
                String str = g.content.itemIds.get(0);
                if (!TextUtils.isEmpty(str)) {
                    map.put("item_id", str);
                }
            }
            Map<String, String> map2 = g.utPairs;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(g.utPairs);
            }
        }
        if (zk1.e(j.f)) {
            map.put("auto_play", "1");
        } else {
            map.put("auto_play", "0");
        }
        map.put("UI_type", "1");
    }

    public static void l(FluidContext fluidContext, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce1cb37", new Object[]{fluidContext, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, String> activeCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getActiveCardCommonTrack();
        if (activeCardCommonTrack != null) {
            hashMap.putAll(activeCardCommonTrack);
        }
        if (z) {
            str = "up";
        } else {
            str = "down";
        }
        hashMap.put("type", str);
        if (((IFeedsListService) fluidContext.getService(IFeedsListService.class)).isPublicAutoCut()) {
            hashMap.put(Constants.KEY_CONTROL, "auto");
        } else {
            hashMap.put(Constants.KEY_CONTROL, BizTaskData.MANUAL_TIME);
        }
        ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).setPublicAutoCut(false);
        if (zk1.b() == 0) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        hashMap.put("is_automanual", str2);
        if (hashMap.containsKey("videoid")) {
            String str3 = (String) hashMap.get("videoid");
            String recordContentId = ((ITrackService) fluidContext.getService(ITrackService.class)).getRecordContentId();
            if (str3 == null || !str3.equals(recordContentId)) {
                hashMap.put("replayCount", "0");
            } else {
                Integer valueOf = Integer.valueOf(((ITrackService) fluidContext.getService(ITrackService.class)).getRecordCount());
                hashMap.put("replayCount", "" + valueOf);
            }
            ((ITrackService) fluidContext.getService(ITrackService.class)).setRecordContentId("");
        }
        E(fluidContext, "Button-cut", hashMap);
    }

    public static void q(Map<String, String> map, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a6de06", new Object[]{map, new Integer(i), new Boolean(z)});
            return;
        }
        map.put("index", String.valueOf(i));
        if (z) {
            i--;
        }
        map.put("realIndex", String.valueOf(i));
    }

    public static void T(FluidContext fluidContext, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5067a065", new Object[]{fluidContext, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            Map<String, String> v = v(fluidContext);
            if (v != null) {
                v.put("playnextfinal", String.valueOf(z));
                String str = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().f;
                v.put("playnextserver", str);
                String str2 = "none";
                int b = zk1.b();
                if (b == 1) {
                    str2 = "true";
                } else if (b == 2) {
                    str2 = "false";
                }
                v.put("playnextlocal", str2);
                v.put("playnextbreak", String.valueOf(z2));
                ir9.b("TrackUitls", "trackPlayCompleted playnextfinal=" + z + ",palynextserver=" + str + ",playnextlocal=" + str2 + ",playnextbreak=" + z2);
            }
            E(fluidContext, "Button-VideoPlayCompleted", v);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
