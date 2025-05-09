package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.tbpoplayer.track.model.TrackAppMonitorConfig;
import com.taobao.tbpoplayer.track.model.TrackConfig;
import com.taobao.tbpoplayer.track.model.TrackUTConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a9l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_AUTO_SIZE_ASPECT = "autoSizeAspect";
    public static final String SP_KEY_CDN_FETCH_CDN_URL = "CDN_FETCH_CDN_URL";
    public static final String SP_KEY_CDN_FETCH_PAGE_SWITCH_TIMES = "CDN_FETCH_PAGE_SWITCH_TIMES";
    public static final String SP_KEY_CONFIG_BY_CON = "CONFIG_BY_CON";
    public static final String SP_KEY_CONFIG_LOCAL_OPT = "CONFIG_LOCAL_OPT";
    public static final String SP_KEY_DAI_TRIGGER_ENABLE = "DAI_TRIGGER_ENABLE";
    public static final String SP_KEY_ENABLE_CLEAN_KEEP_DIRECTLY = "ENABLE_CLEAN_KEEP_DIRECTLY";
    public static final String SP_KEY_ENABLE_CONTEXT_WRAPPER = "ENABLE_CONTEXT_WRAPPER";
    public static final String SP_KEY_ENABLE_LAUNCH_OPT = "ENABLE_LAUNCH_OPT";
    public static final String SP_KEY_ENABLE_LOCAL_CONFIG = "ENABLE_LOCAL_CONFIG";
    public static final String SP_KEY_ENABLE_LOCAL_LM_CONFIG = "ENABLE_LOCAL_LM_CONFIG";
    public static final String SP_KEY_ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY = "ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY";
    public static final String SP_KEY_FATIGUE_FILTER_ENABLE = "FATIGUE_FILTER_ENABLE";
    public static final String SP_KEY_FLASH_POP_ENABLE = "FLASH_POP_ENABLE";
    public static final String SP_KEY_FLOW_INTERVENTION = "flowIntervention";
    public static final String SP_KEY_FORBID_H5_ACC = "FORBID_H5_ACC";
    public static final String SP_KEY_INTERCEPT_HOVER = "INTERCEPT_HOVER";
    public static final String SP_KEY_INTERRUPT_DOWN_ACTION = "INTERRUPT_DOWN_ACTION";
    public static final String SP_KEY_INVALID_ACTIVITY_CONFIG = "INVALID_ACTIVITY_CONFIG";
    public static final String SP_KEY_LM_CONFIG_ORANGE_VERSION = "LM_CONFIG_ORANGE_VERSION";
    public static final String SP_KEY_MTOP_GROUP_ENABLE = "MTOP_GROUP_ENABLE";
    public static final String SP_KEY_NATIVE_POP_ENABLE = "NATIVE_POP_ENABLE";
    public static final String SP_KEY_NATIVE_POP_GRADUAL_ENABLE = "NATIVE_POP_GRADUAL_ENABLE";
    public static final String SP_KEY_NATIVE_POP_PROP_REPLACE_BF = "NATIVE_POP_PROP_REPLACE_BF";
    public static final String SP_KEY_NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE = "NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE";
    public static final String SP_KEY_NEW_NATIVE_NOTIFICATION_ENABLE = "NEW_NATIVE_NOTIFICATION_ENABLE";
    public static final String SP_KEY_OPT_GROUP_CHECK = "OPT_GROUP_CHECK";
    public static final String SP_KEY_OPT_H5_SNAPSHOT = "OPT_H5_SNAPSHOT";
    public static final String SP_KEY_OPT_NATIVE_SNAPSHOT = "OPT_NATIVE_SNAPSHOT";
    public static final String SP_KEY_OPT_THREAD = "optThread";
    public static final String SP_KEY_OPT_WEBVIEW_REMOVE = "optWebviewRemove";
    public static final String SP_KEY_OPT_WEEX2_SNAPSHOT = "OPT_WEEX2_SNAPSHOT";
    public static final String SP_KEY_OPT_WEEX_SNAPSHOT = "OPT_WEEX_SNAPSHOT";
    public static final String SP_KEY_PAGE_EVENT_ENABLE = "PAGE_EVENT_ENABLE";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_HIGH = "POP_CENTER_OUT_OF_TIME_HIGH";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_LOW = "POP_CENTER_OUT_OF_TIME_LOW";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_MIDDLE = "POP_CENTER_OUT_OF_TIME_MIDDLE";
    public static final String SP_KEY_POP_DISPLAY_ENABLE = "POP_DISPLAY_ENABLE";
    public static final String SP_KEY_POP_HUB_CODE_BLACK_LIST = "POP_HUB_CODE_BLACK_LIST";
    public static final String SP_KEY_POP_HUB_CODE_WHITE_LIST = "POP_HUB_CODE_WHITE_LIST";
    public static final String SP_KEY_POP_HUB_TRIGGER_MODE = "POP_HUB_TRIGGER_MODE";
    public static final String SP_KEY_PRE_DEAL_TRIGGER_ENABLE = "PRE_DEAL_TRIGGER_ENABLE";
    public static final String SP_KEY_RECORD_BUCKET_ENABLE = "RECORD_BUCKET_ENABLE";
    public static final String SP_KEY_REQUESTING_FILTER_ENABLE = "REQUESTING_FILTER_ENABLE";
    public static final String SP_KEY_SCENE_FREQ = "sceneFreq";
    public static final String SP_KEY_SCREENSHOT_TLOG_ENABLE = "watermarkReportTLog";
    public static final String SP_KEY_SEND_SCREEN_CHANGE_EVENT = "SEND_SCREEN_CHANGE_EVENT";
    public static final String SP_KEY_USE_NEW_ACTION_LINE = "USE_NEW_ACTION_LINE";
    public static final String SP_KEY_USE_NEW_MAMA_TYPE = "USE_NEW_MAMA_TYPE";
    public static final String SP_KEY_WATER_MASK_BLACK_LIST_ENABLE = "watermarkBlackModeEnable";
    public static final String SP_KEY_WATER_MASK_CONFIG_INVALID_REQUEST_GAP = "watermarkConfigInvalidRequestGap";
    public static final String SP_KEY_WATER_MASK_DELAY_TIME = "watermarkDelayTime";
    public static final String SP_KEY_WATER_MASK_ENABLE = "waterMaskEnable";
    public static final String SP_KEY_WATER_MASK_REQ_GAP = "waterMaskRequestGap";
    public static final String SP_KEY_WEEX2_SNAPSHOT_SCALE = "WEEX2_SNAPSHOT_SCALE";
    public static final String SP_KEY_WEEX_INIT_WAIT_TIME = "WEEX_INIT_WAIT_TIME";
    public static final String SP_KEY_WEEX_INIT_WAIT_TIME_ENABLE = "WEEX_INIT_WAIT_TIME_ENABLE";
    public static final String SP_KEY_WEEX_MODULE_INTERCEPT_ENABLE = "WEEX_MODULE_INTERCEPT_ENABLE";
    public TrackConfig d;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f15614a = new ArrayList();
    public List<String> b = new CopyOnWriteArrayList();
    public List<String> c = new CopyOnWriteArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean f = false;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public boolean h = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a9l f15615a = new a9l();

        static {
            t2o.a(790626366);
        }

        public static /* synthetic */ a9l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a9l) ipChange.ipc$dispatch("42ca8524", new Object[0]);
            }
            return f15615a;
        }
    }

    static {
        t2o.a(790626365);
    }

    public static a9l w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9l) ipChange.ipc$dispatch("6eda4b5f", new Object[0]);
        }
        return a.a();
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f1609c", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_ENABLE_CONTEXT_WRAPPER, true);
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7698e2be", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_FORBID_H5_ACC, true);
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f303f683", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_FATIGUE_FILTER_ENABLE, true);
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47bc9bef", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_INTERCEPT_HOVER, false);
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211dd3f1", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_ENABLE_LOCAL_CONFIG, true);
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d943a732", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_ENABLE_LOCAL_LM_CONFIG, true);
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b8717fb", new Object[]{this})).booleanValue();
        }
        return nim.d(SP_KEY_MTOP_GROUP_ENABLE);
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19677b06", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_NEW_NATIVE_NOTIFICATION_ENABLE, true);
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6de53f2", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_PAGE_EVENT_ENABLE, true);
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72ea49c1", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_PRE_DEAL_TRIGGER_ENABLE, true);
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e262ac8e", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_RECORD_BUCKET_ENABLE, true);
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c2b6f0", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY, true);
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843b7003", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_REQUESTING_FILTER_ENABLE, true);
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d9e618", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_USE_NEW_ACTION_LINE, true);
    }

    public boolean T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2de2245", new Object[]{this, context})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(context, "POPCallWeexInitOpt");
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc072cc", new Object[]{this})).booleanValue();
        }
        return nim.d(SP_KEY_WEEX_MODULE_INTERCEPT_ENABLE);
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a98b34f", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_OPT_H5_SNAPSHOT, true);
    }

    public long W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5f5f2c9", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_WATER_MASK_DELAY_TIME, 2000L);
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c5b5619", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_OPT_NATIVE_SNAPSHOT, true);
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f6a08cd", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_OPT_WEEX2_SNAPSHOT, true);
    }

    public boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91edffc3", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_OPT_WEEX_SNAPSHOT, true);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("738f98bf", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_CONFIG_BY_CON, true);
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a69e36b7", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE, true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb84035", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_CONFIG_LOCAL_OPT, true);
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ee7e3a1", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_SEND_SCREEN_CHANGE_EVENT, true);
    }

    public boolean c() {
        TrackAppMonitorConfig trackAppMonitorConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce749dd", new Object[]{this})).booleanValue();
        }
        TrackConfig trackConfig = this.d;
        if (trackConfig == null || (trackAppMonitorConfig = trackConfig.AppMonitor) == null || !trackAppMonitorConfig.enable) {
            return false;
        }
        return true;
    }

    public void c0(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c82768e", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.c = list;
        if (z) {
            nim.r(SP_KEY_POP_HUB_CODE_BLACK_LIST, list);
        }
    }

    public boolean d(String str) {
        TrackAppMonitorConfig trackAppMonitorConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df725b59", new Object[]{this, str})).booleanValue();
        }
        TrackConfig trackConfig = this.d;
        if (trackConfig == null || (trackAppMonitorConfig = trackConfig.AppMonitor) == null || !trackAppMonitorConfig.getCategoryHit(str, false)) {
            return false;
        }
        return true;
    }

    public void d0(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3f5da4", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.b = list;
        if (z) {
            nim.r(SP_KEY_POP_HUB_CODE_WHITE_LIST, list);
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("772ffdfb", new Object[]{this});
        }
        return nim.m(SP_KEY_AUTO_SIZE_ASPECT);
    }

    public void e0(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c569b2ba", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.f15614a = list;
        if (z) {
            nim.r(SP_KEY_INVALID_ACTIVITY_CONFIG, list);
        }
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81a0205b", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_CDN_FETCH_PAGE_SWITCH_TIMES, 5L);
    }

    public SharedPreferences.Editor f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("4a0c2a5f", new Object[]{this});
        }
        return nim.s();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c232b834", new Object[]{this});
        }
        return nim.m(SP_KEY_CDN_FETCH_CDN_URL);
    }

    public void g0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457d4e02", new Object[]{this, str, new Boolean(z)});
        } else {
            nim.t(str, z);
        }
    }

    public List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a48cae86", new Object[]{this});
        }
        List<String> list = this.c;
        if (list == null || list.isEmpty()) {
            List<String> n = nim.n(SP_KEY_POP_HUB_CODE_BLACK_LIST);
            wdm.d("OrangeConfigManager.getCodeBlackList.FromLocalSp.list=%s.", n);
            return new CopyOnWriteArrayList(n);
        }
        wdm.d("OrangeConfigManager.getCodeBlackList.FromOrange.list=%s.", this.c);
        return this.c;
    }

    public void h0() {
        TrackAppMonitorConfig trackAppMonitorConfig;
        TrackUTConfig trackUTConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        TrackConfig trackConfig = (TrackConfig) JSON.parseObject(lig.g().e("appMonitorConfig"), TrackConfig.class);
        this.d = trackConfig;
        if (!(trackConfig == null || (trackUTConfig = trackConfig.UserTrack) == null)) {
            trackUTConfig.generateHitMap();
        }
        TrackConfig trackConfig2 = this.d;
        if (trackConfig2 != null && (trackAppMonitorConfig = trackConfig2.AppMonitor) != null) {
            trackAppMonitorConfig.generateHitMap();
            d0j.d(this.d.AppMonitor.useConfigCheckFail);
            d0j.e(this.d.AppMonitor.onePopOnlyResult);
        }
    }

    public List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e64631c", new Object[]{this});
        }
        List<String> list = this.b;
        if (list == null || list.isEmpty()) {
            List<String> n = nim.n(SP_KEY_POP_HUB_CODE_WHITE_LIST);
            wdm.d("OrangeConfigManager.getCodeWhiteList.FromLocalSp.list=%s.", n);
            return new CopyOnWriteArrayList(n);
        }
        wdm.d("OrangeConfigManager.getCodeWhiteList.FromOrange.list=%s.", this.b);
        return this.b;
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a4a6bb2", new Object[]{this});
        }
        List<String> list = this.f15614a;
        if (list == null || list.isEmpty()) {
            List<String> n = nim.n(SP_KEY_INVALID_ACTIVITY_CONFIG);
            wdm.d("OrangeConfigManager.getInValidActivities.FromLocalSp.list=%s.", n);
            return new CopyOnWriteArrayList(n);
        }
        wdm.d("OrangeConfigManager.getInValidActivities.FromOrange.list=%s.", this.f15614a);
        return this.f15614a;
    }

    public void j0(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6424fec", new Object[]{this, str, new Long(j)});
        } else {
            nim.u(str, j);
        }
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d59947cd", new Object[]{this, str});
        }
        return nim.m(str);
    }

    public void k0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63815c37", new Object[]{this, str, str2});
        } else {
            nim.v(str, str2);
        }
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72b77bff", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_POP_CENTER_OUT_OF_TIME_HIGH, 500L);
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("358c8a46", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_USE_NEW_MAMA_TYPE, true);
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13dcbead", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_POP_CENTER_OUT_OF_TIME_LOW, 1000L);
    }

    public boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88ec5e22", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca2515f2", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_POP_CENTER_OUT_OF_TIME_MIDDLE, 800L);
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4175f3b", new Object[]{this})).intValue();
        }
        return (int) nim.h(SP_KEY_POP_HUB_TRIGGER_MODE, 0L);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74350da9", new Object[]{this});
        }
        return nim.m(SP_KEY_SCENE_FREQ);
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e84c84a", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_WATER_MASK_CONFIG_INVALID_REQUEST_GAP, 3600000L);
    }

    public long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbb087d5", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_WATER_MASK_REQ_GAP, 86400000L);
    }

    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975b4206", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_WEEX2_SNAPSHOT_SCALE, 25L);
    }

    public long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72c27924", new Object[]{this})).longValue();
        }
        return nim.h(SP_KEY_WEEX_INIT_WAIT_TIME, Constants.STARTUP_TIME_LEVEL_1);
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca35c92", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_INTERRUPT_DOWN_ACTION, true);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5129cae8", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_ENABLE_CLEAN_KEEP_DIRECTLY, true);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f620fb4", new Object[]{this})).booleanValue();
        }
        return nim.d(SP_KEY_DAI_TRIGGER_ENABLE);
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130445bf", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_OPT_WEBVIEW_REMOVE, true);
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f8cfa2", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_SCREENSHOT_TLOG_ENABLE, true);
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2f8007", new Object[]{this})).booleanValue();
        }
        return nim.e(SP_KEY_WATER_MASK_ENABLE, true);
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61320a52", new Object[]{this})).booleanValue();
        }
        if (this.g.compareAndSet(false, true)) {
            this.h = nim.e(SP_KEY_WATER_MASK_BLACK_LIST_ENABLE, true);
        }
        return this.h;
    }

    public boolean S(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3716ee0b", new Object[]{this, context})).booleanValue();
        }
        if (this.e.compareAndSet(false, true)) {
            this.f = ABGlobal.isFeatureOpened(context, "watermark_ahead_launch");
        }
        return this.f;
    }

    public boolean i0(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17990663", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        String m = nim.m(SP_KEY_LM_CONFIG_ORANGE_VERSION);
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopConfigLocalManager.updateLocalConfigs.orangeVersion=" + str4 + ".localOrangeVersion=" + m);
        try {
            if (!TextUtils.isEmpty(m) && !TextUtils.isEmpty(str4)) {
                boolean equals = str4.equals(m);
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopConfigLocalManager.updateLocalConfigs.orangeVersionSame=" + equals);
                if (equals) {
                    return false;
                }
            }
        } catch (Throwable th) {
            wdm.h("PopConfigLocalManager.parseOrangeVersionUpdated.error.", th);
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        nim.v(str2, config);
        nim.v(str3, OrangeConfig.getInstance().getConfig(str, str3, ""));
        String[] split = config.split(",");
        for (String str5 : split) {
            nim.v(str5, OrangeConfig.getInstance().getConfig(str, str5, ""));
        }
        wdm.d("OrangeConfigManager.updateLMLocalConfigs.done", new Object[0]);
        return true;
    }

    public boolean q(String str, BaseConfigItem baseConfigItem, boolean z) {
        TrackUTConfig trackUTConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b234189", new Object[]{this, str, baseConfigItem, new Boolean(z)})).booleanValue();
        }
        if (baseConfigItem != null && baseConfigItem.forceUpdateUT && (str.equals(wdm.CATEGORY_WEB_JSBRIDGE) || str.equals(wdm.CATEGORY_WEEX_JSBRIDGE) || str.equals("pageLifeCycle") || str.equals(wdm.CATEGORY_CONTAINER_LIFE_CYCLE) || auv.a().b(str))) {
            return true;
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || (trackUTConfig = trackConfig.UserTrack) == null || !trackUTConfig.getCategoryHit(str, z)) ? false : true;
    }

    public boolean r(String str, BaseConfigItem baseConfigItem) {
        TrackUTConfig trackUTConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95fb8191", new Object[]{this, str, baseConfigItem})).booleanValue();
        }
        if (baseConfigItem != null && baseConfigItem.forceUpdateUT && (str.equals(wdm.CATEGORY_WEB_JSBRIDGE) || str.equals(wdm.CATEGORY_WEEX_JSBRIDGE) || str.equals("pageLifeCycle") || str.equals(wdm.CATEGORY_CONTAINER_LIFE_CYCLE) || auv.a().b(str))) {
            return true;
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || (trackUTConfig = trackConfig.UserTrack) == null || !trackUTConfig.enable) ? false : true;
    }
}
