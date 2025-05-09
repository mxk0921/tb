package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.open.ucc.UccResultCode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class byj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST = "list_param,%22list_param,search_keyword,eurl,targetParams,prefetchImg,prefetchImgRatio,spm,scm,epid,pvid";
    public static final int DELAY_INCREMENT_DEFAULT_TEXT_ANIMATION_TIME = 200;
    public static final int DELAY_INCREMENT_FETCH_RECOMMEND_LIST_FOR_NEXT_PAGE_TIME = 2;
    public static final int DELAY_INCREMENT_NAV_INCREMENT_CONTAINER_SHOW_TIME = 23;
    public static final int DELAY_INCREMENT_NAV_INCREMENT_DELAY_TIME = 1;
    public static final String DETAIL_TAOBAO_GROUP_NAME = "android_detail";
    public static final String DOWNGRADE_KEY_ANDROIDX_NOT_DELETE_PRE_LAYOUT = "downgrade_key_androidx_not_delete_pre_layout";
    public static final String DOWNGRADE_KEY_INSERT_CARD_CHECK_REQUESTING = "downgrade_key_insert_card_check_requesting";
    public static final String DOWNGRADE_KEY_INSERT_CARD_SHOW_FULL_LOG = "downgrade_key_insert_card_show_full_log";
    public static final String DOWNGRADE_KEY_NOT_RESET_MAIN_RENDER_MARGIN = "downgrade_key_not_reset_main_render_margin";
    public static final String FLOAT_PERMISSION_CHECK_INTERVAL = "float_permission_check_interval";
    public static final String GUIDE_PRELOAD_PARAMS_BLACKLIST = "guide_preload_request_params_black_list";
    public static final int MAIN_PIC_DATA_REFRESH_TYPE_CHANGE_ALL = 4;
    public static final int MAIN_PIC_DATA_REFRESH_TYPE_CHANGE_REALTIME_CARD = 2;
    public static final int MAIN_PIC_DATA_REFRESH_TYPE_DEFAULT = 2;
    public static final int MAIN_PIC_DATA_REFRESH_TYPE_DIFF_UTIL = 3;
    public static final int MAIN_PIC_DATA_REFRESH_TYPE_OLD_20240819 = 1;
    public static boolean N = false;
    public static final String NEWDETAIL_WEEX2_SWITCH_DEVICE = "newdetail_weex2_switch_device";
    public static int S = 0;
    public static final String VALUE_FALSE = "false";
    public static final String VALUE_TRUE = "true";
    public static boolean Y;
    public static String Z;
    public static int a0;
    public static int b0;
    public static int c0;
    public static int d0;
    public static int e0;
    public static int f0;
    public static boolean g0;
    public static boolean h0;
    public static boolean i0;
    public static int t;
    public boolean A;
    public String B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String d;
    public boolean g;
    public JSONObject h;
    public int i;
    public JSONObject j;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final String NEWDETAIL_TAOBAO_GROUP_NAME = "android_newdetail";
    public static final String[] X = {NEWDETAIL_TAOBAO_GROUP_NAME};

    /* renamed from: a  reason: collision with root package name */
    public int f16716a = 3;
    public int b = 12;
    public int c = 2;
    public final List<String> e = new ArrayList();
    public final List<String> f = new ArrayList();
    public int k = 2;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                byj.a(configs);
                byj.b(configs);
            }
            if (map != null) {
                xmo.D(y9a.b(), map.get("configVersion"));
            }
        }
    }

    static {
        t2o.a(352321783);
    }

    public byj() {
        o2r.a("NewDetailOrangeConfigInit");
        c0();
        o2r.b();
    }

    public static byj A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("8a2e5ed9", new Object[0]);
        }
        if (!gxj.b()) {
            return new byj();
        }
        throw new RuntimeException("newDetailContext 为空");
    }

    public static int A0(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b96d30b", new Object[]{new Integer(i)})).intValue();
        }
        int d = bx0.d();
        if (i < 40) {
            str = "newdetail_auto_adapter_anim_duration_lt40_max_value";
        } else if (i < 60) {
            str = "newdetail_auto_adapter_anim_duration_lt60_max_value";
        } else if (i < 80) {
            str = "newdetail_auto_adapter_anim_duration_max_value";
        } else {
            str = "newdetail_auto_adapter_anim_duration_gt80_max_value";
        }
        return ywj.g(Z(str, ""), d);
    }

    public static ArrayList<String> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("219284cd", new Object[0]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String Z2 = Z("enable_newdetail_deliver_prefetchZcacheList", "newdetail-super-pref,newdetail-newguide");
        if (!TextUtils.isEmpty(Z2)) {
            Collections.addAll(arrayList, Z2.split(","));
        }
        return arrayList;
    }

    public static int B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88ae07ca", new Object[0])).intValue();
        }
        return ywj.g(Z("newdetail_auto_adapter_anim_duration_speed", ""), 1);
    }

    public static int C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2046cb94", new Object[0])).intValue();
        }
        return ywj.g(Z("newdetail_auto_adapter_min_frame_time", ""), 17);
    }

    public static int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d992e74", new Object[0])).intValue();
        }
        return F(FLOAT_PERMISSION_CHECK_INTERVAL, wu2.DAY);
    }

    public static int D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b00642", new Object[0])).intValue();
        }
        return ywj.g(Z("newdetail_auto_device_duration_multiplier", ""), -2);
    }

    public static int E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f40fe9c9", new Object[0])).intValue();
        }
        return G("newdetail_downgrade_force_call_resume", -1);
    }

    @Deprecated
    public static int F(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("874d8aa5", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(DETAIL_TAOBAO_GROUP_NAME, str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedd9d73", new Object[0])).booleanValue();
        }
        return y("newdetail_downgrade_weex_clear_cache_instance", "false");
    }

    public static int G(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("122f6c2f", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig(NEWDETAIL_TAOBAO_GROUP_NAME, str, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98fceb50", new Object[0])).booleanValue();
        }
        return y("newdetail_enable_activity_destroyed_flag", "true");
    }

    public static int H(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a14c4a11", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3c0d8c", new Object[0])).booleanValue();
        }
        return y("newdetail_enable_mask_frame_anim", "true");
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4044e37d", new Object[0])).booleanValue();
        }
        return y("newdetail_enable_nav_check_delay_task", "true");
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0109c2c", new Object[0])).booleanValue();
        }
        return y("newdetail_enable_slow_bg_for_first_node", "true");
    }

    public static int K(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a67a194", new Object[]{context})).intValue();
        }
        d0();
        boolean P = TBDeviceUtils.P(context);
        boolean p = TBDeviceUtils.p(context);
        if (P) {
            return e0;
        }
        if (p) {
            return d0;
        }
        return f0;
    }

    public static String K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("354d55b", new Object[0]);
        }
        return Z("fast_key_nd_weex_switch_list", "nd_best_switch");
    }

    public static int L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1df8fea8", new Object[]{context})).intValue();
        }
        d0();
        boolean P = TBDeviceUtils.P(context);
        boolean p = TBDeviceUtils.p(context);
        if (P) {
            return b0;
        }
        if (p) {
            return a0;
        }
        return c0;
    }

    public static String L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6e264fb", new Object[0]);
        }
        return Z("newdetail_fast_nd_optimization_lower_score", "");
    }

    public static String M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22012f47", new Object[0]);
        }
        return Z("newdetail_fast_nd_orange_config_cache", "");
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f18a7055", new Object[0])).booleanValue();
        }
        return y("newdetail_force_close_delay_task_and_frozen", "false");
    }

    public static String O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c3eb2cc", new Object[0]);
        }
        return Z("newdetail_default_degrade_blur_bg_url", "https://gw.alicdn.com/imgextra/i2/O1CN01IJjpaU1hx8tZmWNbP_!!6000000004343-2-tps-750-1000.png_450x10000q100.jpg");
    }

    public static String P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52ab5f0d", new Object[0]);
        }
        return Z("nd_weex_url_filter_info", "{\"type\":\"skipUrl\",\"urlList\":[\"market.m.taobao.com/app/newdetail/newdetail/pages/SuperItem\"]}");
    }

    public static byj Q(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("93cea13", new Object[]{cxjVar});
        }
        if (cxjVar == null) {
            return A();
        }
        if (gxj.b()) {
            return cxjVar.m();
        }
        try {
            return cxjVar.m();
        } catch (Exception unused) {
            return A();
        }
    }

    public static int Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9e96ec7", new Object[0])).intValue();
        }
        return ywj.g(Z("newdetail_main_iv_round_rect_alpha_time", ""), UccResultCode.NO_ACTION_BIND_FAILED);
    }

    public static int R0(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("587934d7", new Object[]{new Integer(i)})).intValue();
        }
        int e = bx0.e();
        if (i < 40) {
            str = "newdetail_mask_frame_lt40_anim_duration";
        } else if (i < 60) {
            str = "newdetail_mask_frame_lt60_anim_duration";
        } else if (i < 80) {
            str = "newdetail_mask_frame_anim_duration";
        } else {
            str = "newdetail_mask_frame_gt80_anim_duration";
        }
        return ywj.g(Z(str, ""), e);
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1e89c5", new Object[0])).booleanValue();
        }
        if (r19.P0()) {
            return true;
        }
        return false;
    }

    public static String T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54086c66", new Object[0]);
        }
        String Z2 = Z("newdetail_slow_anim_weex_bg_time", "1800");
        if (TextUtils.isEmpty(Z2)) {
            return "1800";
        }
        return Z2;
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca6fa7fd", new Object[0])).booleanValue();
        }
        return y("newdetail_support_higher_atoms", "true");
    }

    public static List<String> V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f79cbe96", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(Z)) {
            Collections.addAll(arrayList, Z.split(","));
        }
        return arrayList;
    }

    public static void V0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c068ab21", new Object[]{map});
            return;
        }
        if (map.containsKey("enable_newdetail_middleware_blackList")) {
            Y = "true".equals(map.get("enable_newdetail_middleware_blackList"));
        }
        if (map.containsKey("newdetail_resolverMiddleware_blackList")) {
            Z = map.get("newdetail_resolverMiddleware_blackList");
        }
        if (map.containsKey("newdetail_fold_max_pre_data_size")) {
            d0 = H(map.get("newdetail_fold_max_pre_data_size"), 90);
        }
        if (map.containsKey("newdetail_pad_max_pre_data_size")) {
            e0 = H(map.get("newdetail_pad_max_pre_data_size"), 90);
        }
        if (map.containsKey("newdetail_phone_max_pre_data_size")) {
            f0 = H(map.get("newdetail_phone_max_pre_data_size"), 30);
        }
        if (map.containsKey("newdetail_openImmediately_maxCacheCountRandom")) {
            t = H(map.get("newdetail_openImmediately_maxCacheCountRandom"), 8);
        }
        if (map.containsKey("newdetail_fold_max_pre_request_num")) {
            a0 = H(map.get("newdetail_fold_max_pre_request_num"), 10);
        }
        if (map.containsKey("newdetail_pad_max_pre_request_num")) {
            b0 = H(map.get("newdetail_pad_max_pre_request_num"), 10);
        }
        if (map.containsKey("newdetail_phone_max_pre_request_num")) {
            c0 = H(map.get("newdetail_phone_max_pre_request_num"), 5);
        }
        if (map.containsKey("enable_newdetail_pre_requester")) {
            h0 = "true".equals(map.get("enable_newdetail_pre_requester"));
        }
        if (map.containsKey("enable_newdetail_randomPreload")) {
            N = "true".equals(map.get("enable_newdetail_randomPreload"));
        }
        if (map.containsKey("enable_newdetail_location_permission")) {
            i0 = "true".equals(map.get("enable_newdetail_location_permission"));
        }
        if (map.containsKey("newdetail_openImmediately_maxPreloadOnceRandom")) {
            S = H(map.get("newdetail_openImmediately_maxPreloadOnceRandom"), 5);
        }
    }

    public static void W0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0b447", new Object[]{map});
            return;
        }
        if (map.containsKey("newdetail_resolverMiddleware_blackList")) {
            xmo.C(y9a.b(), "newdetail_resolverMiddleware_blackList", map.get("newdetail_resolverMiddleware_blackList"));
        }
        if (map.containsKey("enable_newdetail_middleware_blackList")) {
            xmo.C(y9a.b(), "enable_newdetail_middleware_blackList", map.get("enable_newdetail_middleware_blackList"));
        }
        if (map.containsKey("newdetail_fold_max_pre_data_size")) {
            xmo.C(y9a.b(), "newdetail_fold_max_pre_data_size", map.get("newdetail_fold_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_pad_max_pre_data_size")) {
            xmo.C(y9a.b(), "newdetail_pad_max_pre_data_size", map.get("newdetail_pad_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_phone_max_pre_data_size")) {
            xmo.C(y9a.b(), "newdetail_phone_max_pre_data_size", map.get("newdetail_phone_max_pre_data_size"));
        }
        if (map.containsKey("newdetail_openImmediately_maxCacheCountRandom")) {
            xmo.C(y9a.b(), "newdetail_openImmediately_maxCacheCountRandom", map.get("newdetail_openImmediately_maxCacheCountRandom"));
        }
        if (map.containsKey("newdetail_fold_max_pre_request_num")) {
            xmo.C(y9a.b(), "newdetail_fold_max_pre_request_num", map.get("newdetail_fold_max_pre_request_num"));
        }
        if (map.containsKey("newdetail_pad_max_pre_request_num")) {
            xmo.C(y9a.b(), "newdetail_pad_max_pre_request_num", map.get("newdetail_pad_max_pre_request_num"));
        }
        if (map.containsKey("newdetail_phone_max_pre_request_num")) {
            xmo.C(y9a.b(), "newdetail_phone_max_pre_request_num", map.get("newdetail_phone_max_pre_request_num"));
        }
        if (map.containsKey("enable_newdetail_openImmedChannel")) {
            xmo.C(y9a.b(), "enable_newdetail_openImmedChannel", map.get("enable_newdetail_openImmedChannel"));
        }
        if (map.containsKey("enable_newdetail_pre_requester")) {
            xmo.C(y9a.b(), "enable_newdetail_pre_requester", map.get("enable_newdetail_pre_requester"));
        }
        if (map.containsKey("enable_newdetail_randomPreload")) {
            xmo.C(y9a.b(), "enable_newdetail_randomPreload", map.get("enable_newdetail_randomPreload"));
        }
        if (map.containsKey("enable_newdetail_location_permission")) {
            xmo.C(y9a.b(), "enable_newdetail_location_permission", map.get("enable_newdetail_location_permission"));
        }
        if (map.containsKey("newdetail_openImmediately_maxPreloadOnceRandom")) {
            xmo.C(y9a.b(), "newdetail_openImmediately_maxPreloadOnceRandom", map.get("newdetail_openImmediately_maxPreloadOnceRandom"));
        }
    }

    @Deprecated
    public static String Y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49b465f7", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig(DETAIL_TAOBAO_GROUP_NAME, str, str2);
    }

    public static String Z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdd4b081", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig(NEWDETAIL_TAOBAO_GROUP_NAME, str, str2);
    }

    public static int Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a806141b", new Object[0])).intValue();
        }
        return G("newdetail_call_resume_delay_time", 3);
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9b172e", new Object[]{map});
        } else {
            V0(map);
        }
    }

    public static String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f73f35", new Object[0]);
        }
        return Y(NEWDETAIL_WEEX2_SWITCH_DEVICE, "2");
    }

    public static String a1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c79080f4", new Object[]{str});
        }
        return Z("trnAnimSetting_" + str, "");
    }

    public static /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d320d1cd", new Object[]{map});
        } else {
            W0(map);
        }
    }

    public static ArrayList<String> b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f4b1de74", new Object[0]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String Z2 = Z("enable_newdetail_prefetchZcacheList", "newdetail-super-pref,newdetail-newguide");
        if (!TextUtils.isEmpty(Z2)) {
            Collections.addAll(arrayList, Z2.split(","));
        }
        return arrayList;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9c67df2", new Object[0])).booleanValue();
        }
        return y("newdetail_downgrade_mts_pre_task", "false");
    }

    public static void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c70dc7", new Object[0]);
        } else if (!zgj.h) {
            Y = "true".equals(xmo.n(y9a.b(), "enable_newdetail_middleware_blackList", "true"));
            Z = xmo.n(y9a.b(), "newdetail_resolverMiddleware_blackList", "shareNDParams,hybrid_nd,xxc,disableHalfScreenGuide,guideExp,newDetailChannel,ndExp,newParams,spm,ndTitle,ndSubTitle,umpChannel,u_channel,multiTabXObjectType,newType,newDetailChannel,id,entryNDNid");
            d0 = H(xmo.n(y9a.b(), "newdetail_fold_max_pre_data_size", "90"), 90);
            e0 = H(xmo.n(y9a.b(), "newdetail_pad_max_pre_data_size", "90"), 90);
            f0 = H(xmo.n(y9a.b(), "newdetail_phone_max_pre_data_size", "30"), 30);
            t = H(xmo.n(y9a.b(), "newdetail_openImmediately_maxCacheCountRandom", "8"), 8);
            a0 = H(xmo.n(y9a.b(), "newdetail_fold_max_pre_request_num", "10"), 10);
            b0 = H(xmo.n(y9a.b(), "newdetail_pad_max_pre_request_num", "10"), 10);
            c0 = H(xmo.n(y9a.b(), "newdetail_phone_max_pre_request_num", "5"), 5);
            g0 = "true".equals(xmo.n(y9a.b(), "enable_newdetail_openImmedChannel", "true"));
            h0 = "true".equals(xmo.n(y9a.b(), "enable_newdetail_pre_requester", "true"));
            N = "true".equals(xmo.n(y9a.b(), "enable_newdetail_randomPreload", "true"));
            i0 = "true".equals(xmo.n(y9a.b(), "enable_newdetail_location_permission", "true"));
            S = H(xmo.n(y9a.b(), "newdetail_openImmediately_maxPreloadOnceRandom", "5"), 5);
            e0();
            zgj.h = true;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ba1e3e1", new Object[0])).booleanValue();
        }
        return y("newdetail_downgrade_video_metric", "false");
    }

    public static void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5071b9", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(X, new a(), false);
        }
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad792a6", new Object[0])).intValue();
        }
        return S;
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a1791e", new Object[0])).booleanValue();
        }
        return y("enable_newdetail_deliver_data_anim", "true");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a999f6e5", new Object[0])).booleanValue();
        }
        return y("newdetail_fold_enable_apm", "true");
    }

    public static int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa6c759d", new Object[0])).intValue();
        }
        d0();
        return t;
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae6b19c", new Object[0])).booleanValue();
        }
        return i0;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5342ac7b", new Object[0])).booleanValue();
        }
        return Y;
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d84e0e", new Object[0])).booleanValue();
        }
        return N;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f54a179", new Object[0])).booleanValue();
        }
        return y("newdetail_pad_enable_apm", "true");
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc583d91", new Object[0])).booleanValue();
        }
        return h0;
    }

    public static boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f53009ee", new Object[]{str, str2})).booleanValue();
        }
        return "true".equals(Z(str, str2));
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c94467", new Object[]{this});
        }
        return this.B;
    }

    public float E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5b5158c", new Object[]{this})).floatValue();
        }
        return this.C;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5370d4ca", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b2c8f95", new Object[]{this})).intValue();
        }
        return this.H;
    }

    public final JSONObject M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("30b60cf2", new Object[]{this});
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null) {
            try {
                jSONObject = JSON.parseObject(Z("nd_downgrade_config", "{}"));
                this.j = jSONObject;
            } catch (Exception e) {
                txj.e(txj.TAG_REALTIME, "解析异常: getServerRealtimeDelayTypeInfo : exception " + Log.getStackTraceString(e));
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("109f9b2e", new Object[]{this})).intValue();
        }
        return this.I;
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86815da0", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public List<String> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9bfd0267", new Object[]{this});
        }
        return this.e;
    }

    public int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c4de69c", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b35c0be", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9c99e7", new Object[]{this})).intValue();
        }
        return this.f16716a;
    }

    public JSONObject U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f2d556e", new Object[]{this});
        }
        JSONObject jSONObject = this.h;
        if (jSONObject == null) {
            try {
                jSONObject = JSON.parseObject(Z("nd_server_realtime_delay_info", "{\"toDetail\":800,\"account2\":1000}"));
                this.h = jSONObject;
            } catch (Exception e) {
                txj.e(txj.TAG_REALTIME, "解析异常: getServerRealtimeDelayTypeInfo : exception " + Log.getStackTraceString(e));
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ca15607", new Object[]{this});
        }
        return this.d;
    }

    public List<String> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9152084", new Object[]{this});
        }
        return this.f;
    }

    public int X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8413629", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public int Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a91eb42", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db0678c", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !"1".equals(M().getString(str))) {
            return false;
        }
        return true;
    }

    public boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f3eddd", new Object[]{this})).booleanValue();
        }
        return this.W;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc51aa3", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e2d648", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e68332", new Object[]{this})).booleanValue();
        }
        if (!this.p || !this.o) {
            return false;
        }
        return true;
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1682b8", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb3c41a7", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a175c54", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9152f4c4", new Object[]{this})).booleanValue();
        }
        return this.R;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9856a243", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bae14d61", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a56aad", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79c0398", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b5104a", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91fb8c10", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c30b0528", new Object[]{this})).booleanValue();
        }
        return this.M;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a9bd690", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20baf1d", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a626ac3c", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce0a1f4", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9df0c00", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7384087a", new Object[]{this})).booleanValue();
        }
        return this.V;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("343605aa", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3be1671c", new Object[]{this})).booleanValue();
        }
        return this.K;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d29d9128", new Object[]{this})).booleanValue();
        }
        return oj7.i();
    }

    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1fb9690", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7120d79", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e3f1f90", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48798e32", new Object[]{this})).intValue();
        }
        int i = this.L;
        if (i <= 0) {
            return 160;
        }
        return i;
    }

    public int x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ccd37b", new Object[]{this})).intValue();
        }
        int i = this.v;
        if (i <= 0) {
            return 500;
        }
        return i;
    }

    public boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1bdc13", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23cb9e91", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e6c057c", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f16716a = Integer.valueOf(Y("scrollRec_fail_maxNum", "3")).intValue();
        this.c = Integer.valueOf(Y("scrollRec_preload_page", "2")).intValue();
        if (vv6.a()) {
            this.d = Y("newdetail_specifyLiveId", "");
        }
        String Y2 = Y("newdetail_openImmediately_channel", "a2141.1.guessitemtab");
        if (!TextUtils.isEmpty(Y2)) {
            Collections.addAll(this.e, Y2.split(","));
        }
        this.b = ywj.f(Z("new_detail_nav_margin_right_ignore_more", "12"));
        String Z2 = Z("stable_pass_params_white_list", "entryBuckets,ndBuckets,newDetailChannel,newType,mtype,appVersion,ndOpenType");
        if (!TextUtils.isEmpty(Z2)) {
            Collections.addAll(this.f, Z2.split(","));
        }
        this.g = y("nd_enable_server_realtime_rec", "true");
        this.i = G("nd_server_realtime_exp_diff_value", 0);
        y("enable_newdetail_realTimeRequest", "true");
        this.l = y("nd_enable_new_callback_process_insert_card", "true");
        this.m = y("nd_enable_new_callback_process_all", "true");
        this.n = y("nd_enable_insert_card_independent_cb", "true");
        this.k = G("nd_main_pic_data_refresh_type", 2);
        this.o = y("enable_newdetail_baseReqWithBXFeatureV2", "true");
        this.p = y("enable_newdetail_baseReqWithBXFeatureFirstPage", "true");
        this.q = ywj.g(Z("value_newdetail_diff_refresh_nav_data", ""), 2000);
        this.r = ywj.g(Z("value_newdetail_click_area_half_space_dp", ""), 5);
        this.s = y("enable_newdetail_tableViewPinchConflict", "true");
        y("nd_enable_asac_when_request", "true");
        y("nd_enable_fix_more_button_desc", "false");
        this.u = S0();
        this.v = ywj.f(Z("newdetail_nav_root_view_alpha_time", ""));
        this.w = y("newdetail_enable_delay_fetch_next_page", "false");
        this.x = ywj.b(Z("newdetail_enable_delay_render_next_page", ""), false);
        this.y = ywj.b(Z("newdetail_enable_delay_first_page_second_render", ""), false);
        this.z = y("enable_newdetail_inside_detail_page", "true");
        this.A = y("newdetail_screen_record_switch", "true");
        this.B = Z("enable_newdetail_inside_detail_page_test_token", "");
        this.C = ywj.e(Z("newdetail_inside_detail_scroll_percent", ""), 0.95f);
        this.D = y("enable_newdetail_audioRecover", "true");
        this.E = y("enable_newdetail_new_weex_lifecycle", "true");
        this.F = y("enable_newdetail_mediaView34YCenter", "false");
        this.G = y("enable_newdetail_mediaView11YCenter", "true");
        this.H = ywj.g(Z("nd_main_pic_pad_and_fold_size_type", ""), -1);
        this.I = ywj.g(Z("nd_last_page_focus_time", ""), 400);
        this.J = y("nd_enable_entry_ut_param_only_once", "true");
        this.K = y("enable_newdetail_send_deliver_to_weex_no_open_immed", "true");
        this.L = ywj.f(Z("newdetail_blur_bitmap_processor_radius", ""));
        this.M = y("enable_newdetail_mainpic_refresh_active", "true");
        this.O = y("enable_newdetail_kirin_preload_list_null_v2", "true");
        this.P = y("enable_newdetail_background_locate_card", "true");
        this.Q = y("enable_newdetail_trace_net", "true");
        this.R = y("enable_newdetail_weex_disallow_intercept", "true");
        this.T = y("enable_newdetail_mainpic_show_video_view", "true");
        this.U = y("enable_newdetail_mainpic_video_recycle", "true");
        this.V = y("enable_newdetail_send_deliver_data_when_nav", "true");
        this.W = y("enable_newdetail_bx_bind_data_update_ut", "true");
    }
}
