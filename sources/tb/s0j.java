package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.monitor.procedure.IPage;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s0j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APM_PRELOAD_VIDEO_BEGIN = 2;
    public static final int APM_PRELOAD_VIDEO_SUCCESS = 3;
    public static final int APM_VIDEO_BEGIN = 0;
    public static final int APM_VIDEO_PLAYTIME_BEGIN = 4;
    public static final int APM_VIDEO_PLAYTIME_SUCCESS = 5;
    public static final int APM_VIDEO_SUCCESS = 1;
    public static final String GG_INTERACTIVE_RENDER = "gg_interactive_render";
    public static final String GG_VIDEOTAB_DATA_COMMIT = "gg_videoTab_data_commit";
    public static final String GG_VIDEOTAB_DATA_PARSE = "gg_videoTab_data_parse";
    public static final String GG_VIDEOTAB_MTOP_REQUEST = "gg_videoTab_mtop_request";
    public static final String GG_VIDEOTAB_PAGE_INIT = "gg_videoTab_page_init";
    public static final String GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND = "gg_videotab_video_app_enter_background";
    public static final String GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED = "gg_videotab_video_app_foreground_changed";
    public static final String GG_VIDEOTAB_VIDEO_CREATE_DW_INSTANCE = "gg_videotab_video_create_dw_instance";
    public static final String GG_VIDEOTAB_VIDEO_DECRYPT = "gg_videoTab_video_decrypt";
    public static final String GG_VIDEOTAB_VIDEO_LEAVE_UT = "gg_videotab_video_leave_ut";
    public static final String GG_VIDEOTAB_VIDEO_LOADSO = "gg_videoTab_video_loadso";
    public static final String GG_VIDEOTAB_VIDEO_NEW_DW_INSTANCE = "gg_videotab_video_new_dw_instance";
    public static final String GG_VIDEOTAB_VIDEO_PLAY = "gg_videoTab_video_play";
    public static final String GG_VIDEOTAB_VIDEO_PLAY_END_UT = "gg_videotab_video_play_end_ut";
    public static final String GG_VIDEOTAB_VIDEO_PLAY_TIME = "gg_videoTab_video_playtime";
    public static final String GG_VIDEOTAB_VIDEO_PREDOWNLAOD = "gg_videotab_video_predownlaod";
    public static final String GG_VIDEOTAB_VIDEO_PREFETCH_MTOP = "gg_videotab_video_prefetch_mtop";
    public static final String GG_VIDEOTAB_VIDEO_PRELOAD = "gg_videoTab_video_preload";
    public static final String MTS_STAGE_FIRST_FRAME = "first_frame";
    public static final String MTS_SUB_STAGE_CREATE_DW_INSTANCE = "createDWInstance";
    public static final String MTS_SUB_STAGE_LOAD_CACHE = "loadCache";
    public static final String MTS_SUB_STAGE_START_VIDEO_PLAYER = "startVideoPlay";
    public static final String MTS_TAG_CACHE_TYPE = "cacheType";
    public static final String MTS_TAG_CLICK_TIME = "clickTime";
    public static final String MTS_TAG_CREATE_DW_IS_PLAYER_CACHE_VALID = "createdw_isPlayerCacheValid";
    public static final String MTS_TAG_CREATE_DW_IS_VIDEO_CACHED = "createdw_isVideoCached";
    public static final String MTS_TAG_END_TYPE = "tab2EndType";
    public static final String MTS_TAG_ERROR_CODE = "videoErrorCode";
    public static final String MTS_TAG_HAS_VIDEO_DOWNLOAD = "createdw_hasVideoDownload";
    public static final String MTS_TAG_IS_CACHE_VALID = "readcache_isCacheValid";
    public static final String MTS_TAG_IS_COLD_LAUNCH = "isColdLaunch";
    public static final String MTS_TAG_IS_PLAYER_CACHE_VALID = "readcache_isPlayerCacheValid";
    public static final String MTS_TAG_IS_PRE_CREATED_DW = "isPreCreatedDW";
    public static final String MTS_TAG_IS_VIDEO_CACHED = "readcache_isVideoCached";
    public static final String MTS_TAG_IS_VIDEO_HIT_CACHE = "ff_isVideoHitCache";
    public static final String MTS_TAG_PRELOAD_TYPE = "preloadType";
    public static final String MTS_TAG_TTL = "ff_ttl";
    public static final String MTS_TASK_INIT_DETAIL_CACHE = "initDetailCache";
    public static final String MTS_TASK_INIT_DW_PROXY = "InitDWProxy";
    public static final String MTS_TASK_LOAD_LIBRARY = "loadDWLibrary";
    public static final String MTS_TASK_START_RENDER = "startRender";
    public static final String MTS_VALUE_SWITCH_CARD = "switchCard";
    public static final String MTS_VALUE_VIDEO_ERROR = "videoFrameError";
    public static final String MTS_VALUE_VIDEO_SUCCESS = "videoFrameSuccess";
    public static final String TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER = "trace_trace_videotab_onRequestMediaPlayer";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE = "trace_trace_videotab_shortVideoCard_onActive";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR = "trace_trace_videotab_shortVideoCard_onAppear";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA = "trace_trace_videotab_shortVideoCard_onBindData";
    public static final String TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT = "trace_trace_videotab_shortVideoCard_onInit";
    public static final String TRACE_VIDEOTAB_TABLIST_APPLYATTRFORVIEW = "trace_videotab_tablist_applyAttrForView";
    public static final String TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW = "trace_videotab_tablist_initVideoControllerNew";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_NEW = "trace_videotab_tablist_MultiTabVideoController_new";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_ONRENDER = "trace_videotab_tablist_MultiTabVideoController_onRender";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL = "trace_videotab_tablist_MultiTabVideoController_save_detail";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_TRACKPAGESTART = "trace_videotab_tablist_MultiTabVideoController_trackPageStart";
    public static final String TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_UPDATEVIEW = "trace_videotab_tablist_MultiTabVideoController_updateView";
    public static final String TRACE_VIDEOTAB_TABLIST_ONCREATEVIEW = "trace_videotab_tablist_onCreateView";
    public static final String TRACE_VIDEOTAB_VIDEO_LAUNCHER_INIT = "trace_videotab_video_launcher_init";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f27717a = new boolean[6];
    public static volatile boolean b = false;
    public static volatile boolean c = false;
    public static WeakReference<Context> d;
    public static boolean e;
    public static long f;
    public static boolean g;

    static {
        t2o.a(468713871);
    }

    public static void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c95418", new Object[0]);
        } else if (!c) {
            c = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("source");
            arrayList2.add(TypedValues.CycleType.S_WAVE_PHASE);
            AppMonitor.register("ShortVideo", "video_time", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
        }
    }

    public static void B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0cab32", new Object[]{view});
        } else if (view != null) {
            SystemClock.uptimeMillis();
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        }
    }

    public static void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa60a7e", new Object[]{new Integer(i)});
        } else if (i >= 0) {
            boolean[] zArr = f27717a;
            if (i < zArr.length) {
                zArr[i] = true;
            }
        }
    }

    public static void E(FluidContext fluidContext, String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80cba49", new Object[]{fluidContext, str, new Double(d2)});
        } else {
            F(p(fluidContext), str, d2, false);
        }
    }

    public static void F(String str, String str2, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bbb583", new Object[]{str, str2, new Double(d2), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Double.valueOf(d2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", str);
        hashMap2.put(TypedValues.CycleType.S_WAVE_PHASE, str2);
        AppMonitor.Stat.commit("ShortVideo", "video_time", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        ir9.b("VideoMonitorUtils", "videoTimeMonitor, source: " + str + ", phase: " + str2 + ", time: " + d2);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63e7aca", new Object[]{str});
            return;
        }
        w(str);
        vxm.b.e().v(str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd00b0e9", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    public static void c(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519e1b7c", new Object[]{str, str2, map});
        } else if (x(str)) {
            vxm.b.e().p(str, str2, map);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ba0ea4", new Object[]{str});
        } else {
            e(str, null);
        }
    }

    public static void e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fec3061", new Object[]{str, map});
        } else if (y(str)) {
            vxm.b.e().e(str, map);
        }
    }

    public static void f(Context context, atb atbVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc622c91", new Object[]{context, atbVar, fluidContext});
        } else if (g(atbVar)) {
            ir9.b("VideoMonitorUtils", "beginFirstFrameAPMTask");
            String b2 = pto.b(fluidContext);
            ryr.b(context, b2, GG_VIDEOTAB_VIDEO_PLAY);
            a(GG_VIDEOTAB_VIDEO_PLAY_END_UT);
            ryr.b(context, b2, "gg_videoMutiTab_videoPlay");
            if (fluidContext != null) {
                ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).setTab3LauncherPrePlayerStartTime(System.currentTimeMillis());
                ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).setPlayerPlayToken(atbVar.t());
            }
        }
    }

    public static boolean g(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d342b3", new Object[]{atbVar})).booleanValue();
        }
        if (q(0)) {
            return false;
        }
        D(0);
        if (!(atbVar == null || atbVar.getView() == null)) {
            atbVar.getView().setTag(R.id.fluid_sdk_tag_video_play_tag, 0);
        }
        return true;
    }

    public static boolean h(atb atbVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61684f0d", new Object[]{atbVar})).booleanValue();
        }
        boolean q = q(1);
        if (atbVar == null || atbVar.getView() == null || nwv.t(atbVar.getView().getTag(R.id.fluid_sdk_tag_video_play_tag), -1) != 0) {
            z = false;
        } else {
            z = true;
        }
        if (q || !z) {
            return false;
        }
        D(1);
        d = new WeakReference<>(atbVar.getView().getContext());
        return true;
    }

    public static void i(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f5bf33", new Object[]{fluidContext, new Double(d2)});
        } else {
            E(fluidContext, "dwBuild", d2);
        }
    }

    public static void j(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91d277f", new Object[]{fluidContext, new Double(d2)});
        } else {
            E(fluidContext, "dwDestroy", d2);
        }
    }

    public static void m(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a03727", new Object[]{fluidContext, new Double(d2)});
        } else {
            E(fluidContext, "dwStart", d2);
        }
    }

    public static void n(FluidContext fluidContext, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8f8dd5", new Object[]{fluidContext, new Double(d2)});
        } else {
            E(fluidContext, "dwStartToPrepare", d2);
        }
    }

    public static String p(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("142e1f96", new Object[]{fluidContext});
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null || TextUtils.isEmpty(sessionParams.b)) {
            return "-";
        }
        return sessionParams.b;
    }

    public static boolean q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ce174c4", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            boolean[] zArr = f27717a;
            if (i < zArr.length) {
                return zArr[i];
            }
        }
        return false;
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b275068", new Object[]{context})).booleanValue();
        }
        if (!q(1) || context != d.get()) {
            return false;
        }
        return true;
    }

    public static void s(FluidContext fluidContext, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9f622f", new Object[]{fluidContext, new Double(d2), new Boolean(z)});
        } else {
            u(p(fluidContext), "dwInstance", d2, z);
        }
    }

    public static void t(FluidContext fluidContext, MtopResponse mtopResponse, long j, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2bcbd96", new Object[]{fluidContext, mtopResponse, new Long(j), new Boolean(z)});
            return;
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        String str2 = null;
        if (sessionParams != null) {
            str = sessionParams.b;
        } else {
            str = null;
        }
        String str3 = "-";
        if (TextUtils.isEmpty(str)) {
            str = str3;
        }
        if (mtopResponse != null) {
            str2 = mtopResponse.getApi();
        }
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        u(str, str3, System.currentTimeMillis() - j, z);
    }

    public static void u(String str, String str2, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59708179", new Object[]{str, str2, new Double(d2), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mtop_error", Double.valueOf(z ? vu3.b.GEO_NOT_SUPPORT : 1.0d));
        hashMap.put("time", Double.valueOf(d2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", str);
        hashMap2.put("api", str2);
        AppMonitor.Stat.commit("ShortVideo", "mtop_api", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.create(hashMap));
        ir9.b("VideoMonitorUtils", "mtopApiMonitor, source: " + str + ", api: " + str2 + ", time: " + d2 + ",isSuccess: " + z);
    }

    public static void v(FluidContext fluidContext, Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2238f5", new Object[]{fluidContext, activity});
        } else if (activity != null && (intent = activity.getIntent()) != null) {
            long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
            if (longExtra >= 1) {
                E(fluidContext, "navToOnCreate", System.currentTimeMillis() - longExtra);
            }
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29dc0994", new Object[]{str});
        }
    }

    public static boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("298d0d9", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, GG_VIDEOTAB_VIDEO_PREFETCH_MTOP)) {
            if (e) {
                return false;
            }
            e = true;
        }
        return true;
    }

    public static boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b2f12f2", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, GG_VIDEOTAB_VIDEO_PREFETCH_MTOP)) {
            if (e) {
                return false;
            }
            e = true;
        }
        return true;
    }

    public static void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdb4ea2", new Object[0]);
        } else if (!b) {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("mtop_error");
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("source");
            arrayList2.add("api");
            AppMonitor.register("ShortVideo", "mtop_api", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
        }
    }

    public static void C(FluidContext fluidContext, long j) {
        IHostTNodeService iHostTNodeService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ea16e5", new Object[]{fluidContext, new Long(j)});
        } else if (!g) {
            if (f <= 0 && j > 0) {
                f = j;
            }
            ir9.b("VideoMonitorUtils", "APMdata setAPMFirstFrameTime uptimeMillis=" + j + "; apmFirstFrameTime=" + f);
            if (f > 0 && (iHostTNodeService = (IHostTNodeService) fluidContext.getService(IHostTNodeService.class)) != null) {
                IPage apmPage = iHostTNodeService.getApmPage();
                ir9.b("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime; page=" + apmPage);
                if (apmPage != null) {
                    String str = "";
                    try {
                        str = fluidContext.getInstanceConfig().getFluidOriginUrl();
                        str = str + "&tab3IsDefault=" + ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams().b().f();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        ir9.b("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime 。 error: " + th.getMessage());
                    }
                    ir9.b("VideoMonitorUtils", "APMdata setAPM videoFirstFrameTime 。 firstFrameTime=" + f + "; fluidOriginUrl = " + str);
                    apmPage.d().onStage("videoFirstFrameTime", f);
                    apmPage.d().a("videoTabUrl", str);
                    g = true;
                    f = 0L;
                }
            }
        }
    }

    public static void k(FluidContext fluidContext) {
        double d2;
        long b2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd77377", new Object[]{fluidContext});
        } else if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().d()) {
            ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().f(false);
            if (hol.b(fluidContext) <= 0) {
                return;
            }
            if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).isRetryFetchContent()) {
                E(fluidContext, "onCreateToFirstFrameInRetry", System.currentTimeMillis() - b2);
                return;
            }
            E(fluidContext, "onCreateToFirstFrame", System.currentTimeMillis() - b2);
            ir9.a("changfeng", "VideoProcess onCreateToFirstFrame cost= " + (System.currentTimeMillis() - b2));
        } else {
            long cardPrivateViewForegroundTime = ((ICardService) fluidContext.getService(ICardService.class)).getCardPrivateViewForegroundTime();
            int i2 = (cardPrivateViewForegroundTime > 0L ? 1 : (cardPrivateViewForegroundTime == 0L ? 0 : -1));
            if (i2 > 0) {
                d2 = System.currentTimeMillis() - cardPrivateViewForegroundTime;
            } else {
                if (i2 == 0) {
                    i = 1;
                }
                d2 = i;
            }
            E(fluidContext, "cutToFirstFrame", d2);
        }
    }

    public static void l(FluidContext fluidContext) {
        double d2;
        long b2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4ae136", new Object[]{fluidContext});
        } else if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().e()) {
            ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().g(false);
            if (hol.b(fluidContext) <= 0) {
                return;
            }
            if (((IAnalysisService) fluidContext.getService(IAnalysisService.class)).isRetryFetchContent()) {
                E(fluidContext, "onCreateToOnStartInRetry", System.currentTimeMillis() - b2);
            } else {
                E(fluidContext, "onCreateToOnStart", System.currentTimeMillis() - b2);
            }
        } else {
            long cardPrivateViewForegroundTime = ((ICardService) fluidContext.getService(ICardService.class)).getCardPrivateViewForegroundTime();
            int i2 = (cardPrivateViewForegroundTime > 0L ? 1 : (cardPrivateViewForegroundTime == 0L ? 0 : -1));
            if (i2 > 0) {
                d2 = System.currentTimeMillis() - cardPrivateViewForegroundTime;
            } else {
                if (i2 == 0) {
                    i = 1;
                }
                d2 = i;
            }
            E(fluidContext, "cutToOnStart", d2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0657  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(com.taobao.android.fluid.core.FluidContext r45, tb.fe8 r46) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s0j.o(com.taobao.android.fluid.core.FluidContext, tb.fe8):void");
    }
}
