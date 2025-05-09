package tb;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class akt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15794a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static final Map<String, Object> f = new ConcurrentHashMap();
    public static final Map<String, Object> g = new ConcurrentHashMap();
    public static final Map<String, Boolean> h = new ConcurrentHashMap();
    public static String[] i = null;
    public static Boolean j;
    public static String k;
    public static Integer l;
    public static Integer m;
    public static Integer n;
    public static Integer o;
    public static Integer p;
    public static Boolean q;
    public static Boolean r;

    static {
        t2o.a(503316529);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9805a679", new Object[0])).booleanValue();
        }
        return p2("enableDefaultTransferTo750", true);
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1af94f0", new Object[0])).booleanValue();
        }
        return p2("enableFluidSupportEngineId", true);
    }

    public static boolean A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cf50add", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_prefetch_at_new_openUrl", true);
    }

    public static int A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ead1ff13", new Object[0])).intValue();
        }
        return w2("maxPagesInFragment", 1);
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b698422", new Object[0])).booleanValue();
        }
        if (!p2("enableDelayCommit", true) || !x1()) {
            return false;
        }
        return true;
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cd8cad9", new Object[0])).booleanValue();
        }
        try {
            if (p2("enableFullPageOrangeDsl", true)) {
                return "true".equals(G2("android_fullscreenvideo.orange_dsl_v2.enable", "false"));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3dec264", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_prefetch_download_video", true);
    }

    public static Object B2(String str, Object obj) {
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1914b9ad", new Object[]{str, obj});
        }
        Map<String, Object> map = g;
        Object obj2 = ((ConcurrentHashMap) map).get(str);
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object a2 = od0.D().c().a(str, obj);
            if (a2 != null) {
                obj = a2;
            }
            if (obj != null) {
                try {
                    ((ConcurrentHashMap) map).put(str, obj);
                } catch (Exception e3) {
                    e2 = e3;
                    obj2 = obj;
                    tfs.f("getObjectABConfig: " + str + ":" + e2.getMessage());
                    return obj2;
                }
            }
            tfs.f("getObjectABConfig: " + str + ":" + obj);
            return obj;
        } catch (Exception e4) {
            e2 = e4;
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4381afcc", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_disallow_touch", true);
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac73e801", new Object[0])).booleanValue();
        }
        try {
            return p2("enableFullPageQuickOpen", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93306f25", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_prefetch_guangguang", true);
    }

    public static String C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69676fe", new Object[0]);
        }
        return G2("AB_TNode.20220823prefetchhomelistvideo.config", "");
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb8bc57", new Object[0])).booleanValue();
        }
        return !od0.D().i().l() && TextUtils.equals("true", G2("Tab2.Tab2TaskOpt.enable_layout", "true"));
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4145b47", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_gesture_detector_click", false);
    }

    public static boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c355021", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_prefetch_other", true);
    }

    public static int D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("709c8b2e", new Object[0])).intValue();
        }
        return w2("refreshTouchSlop", -1);
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880d838", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_double_grid_strategy", true);
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43a0b236", new Object[0])).booleanValue();
        }
        return p2("enableClickManager", true);
    }

    public static boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c75ca208", new Object[0])).booleanValue();
        }
        return p2("enablePreloadEarly", true);
    }

    public static String E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bc41b57", new Object[0]);
        }
        return G2("AB_ServerGray.ci_flow_env_rounting.bucket", "0");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27412b45", new Object[0])).booleanValue();
        }
        return p2("enableEnterShareTransitionForCard", true);
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1620d0f", new Object[0])).booleanValue();
        }
        return p2("enableGlobalConfigV2", false);
    }

    public static boolean F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86961173", new Object[0])).booleanValue();
        }
        return p2("enablePreloadEngine", true);
    }

    public static int F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec0e47af", new Object[0])).intValue();
        }
        Integer num = p;
        if (num != null) {
            return num.intValue();
        }
        try {
            int parseInt = Integer.parseInt(H2("tnode_performance_shareElementConfig", "0"));
            p = Integer.valueOf(parseInt);
            return parseInt;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ee52a7", new Object[0])).booleanValue();
        }
        return p2("enableExpandableView", true);
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf9f9ae4", new Object[0])).booleanValue();
        }
        return p2("enableGuangViewContainer", true);
    }

    public static boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea96b3", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_preload_node", true);
    }

    public static String G2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2110245b", new Object[]{str, str2});
        }
        Map<String, Object> map = g;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                Object a2 = od0.D().c().a(str, str2);
                if (a2 != null) {
                    obj = a2.toString();
                } else {
                    obj = str2;
                }
                if (obj != null) {
                    ((ConcurrentHashMap) map).put(str, obj);
                }
                tfs.f("getStringABConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getStringABConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.I(obj, str2);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0570b", new Object[0])).booleanValue();
        }
        return p2("ShortVideo.enableFSVideoPreDownload", true);
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d85061", new Object[0])).booleanValue();
        }
        return p2("enableHandleTNodeTransfer", true);
    }

    public static boolean H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e61b64", new Object[0])).booleanValue();
        }
        return p2("enable_prepare_component", false);
    }

    public static String H2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3440f40e", new Object[]{str, str2});
        }
        Map<String, Object> map = f;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                obj = od0.D().g().b(str, str2);
                if (obj != null) {
                    ((ConcurrentHashMap) map).put(str, String.valueOf(obj));
                }
                tfs.f("getStringOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getStringOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.I(obj, str2);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ac8e1ce", new Object[0])).booleanValue();
        }
        return p2("weitao_switch.enableFilterMultiStyleChange", false);
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1272a53d", new Object[0])).booleanValue();
        }
        if (p2("enableHomeTabNavIntercept", false) || q2("enableHomeTabNavIntercept")) {
            return true;
        }
        return false;
    }

    public static int I2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e863ab9", new Object[]{new Integer(i2)})).intValue();
        }
        if (!gz0.d()) {
            return i2;
        }
        Integer num = m;
        if (num != null) {
            return num.intValue() > 0 ? m.intValue() : i2;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(H2("tnode_performance_velocityDownThresholds", "1800")));
            m = valueOf;
            return valueOf.intValue() > 0 ? m.intValue() : i2;
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6596f3da", new Object[0])).booleanValue();
        }
        return p2("enableFirstFrameUrl", true);
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa04a0d", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_honor_pagetracker", true);
    }

    public static boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77b81f0e", new Object[0])).booleanValue();
        }
        return p2("weitao_switch.enableResetItemCache", true);
    }

    public static int J2(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a820db2", new Object[]{new Integer(i2)})).intValue();
        }
        if (!gz0.d()) {
            return i2;
        }
        Integer num = l;
        if (num != null) {
            return num.intValue() > 0 ? l.intValue() : i2;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(H2("tnode_performance_velocityUpThresholds", "3000")));
            l = valueOf;
            return valueOf.intValue() > 0 ? l.intValue() : i2;
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4446a5b", new Object[0])).booleanValue();
        }
        return p2("enableFixAutoSlide", true);
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e49ca32", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_ignore_first_onscroll", true);
    }

    public static boolean K1(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("842c0ee7", new Object[]{new Boolean(z), str})).booleanValue();
        }
        if (!Q0(z, str) || !p2("enableRootViewFullScreenInImmersiveModeV2", true)) {
            return false;
        }
        return true;
    }

    public static boolean K2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bd059d", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.equals("/app/tb-source-app/video-fullpage/pages/index2") || str.equals("/video-fullpage/transparent-videolist.html")) {
            return true;
        }
        return false;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c765adb0", new Object[0])).booleanValue();
        }
        return p2("enableFixBottomSheetBehaviorAnim", true);
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99302a57", new Object[0])).booleanValue();
        }
        return p2("enableIgnoreSameAttr2", false);
    }

    public static boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de9f83dc", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_scroll_pull_offset_y", true);
    }

    public static boolean L2(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b932d648", new Object[]{anlVar})).booleanValue();
        }
        if (!p2("enableNewTransform", true) || anlVar == null || !anlVar.isSuitableForFragmentTransition()) {
            return false;
        }
        return true;
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c61b18", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fixBouncyEdgeEffectAt31", true);
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("674d78b", new Object[0])).booleanValue();
        }
        return p2("enableImageOptOffScreen", true);
    }

    public static boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38326c97", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_send_refresh_state_idle_msg", true);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b07c92d4", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_cell_appear", true);
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d086d1b", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_image_origin_test", true);
    }

    public static boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a25c628b", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_send_refresh_state_msg", true);
    }

    public static int N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c9c896a", new Object[0])).intValue();
        }
        return w2("ShortVideo.timeoutFinishPointReport", 10000);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20a7f01c", new Object[0])).booleanValue();
        }
        return p2("enableFixContentParent", false);
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2029707b", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_image_retry", true);
    }

    public static boolean O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d31e561a", new Object[0])).booleanValue();
        }
        return p2("enableServerGrayParams", true);
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cce096f6", new Object[0])).booleanValue();
        }
        return p2("enableFixDarkMode", true);
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5ad4828", new Object[0])).booleanValue();
        }
        if (e0o.d()) {
            return Y1();
        }
        Boolean bool = q;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((int) (System.nanoTime() % 100)) >= w2("tnode_image_performance_sample_threshold", 5)) {
            q = Boolean.FALSE;
            return false;
        }
        q = Boolean.TRUE;
        return true;
    }

    public static boolean P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c000cfcb", new Object[0])).booleanValue();
        }
        if (F2() != 2) {
            return true;
        }
        return false;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39703d0", new Object[0])).booleanValue();
        }
        return p2("enableFixDetach", false);
    }

    public static boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2913a9b3", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27390e4c", new Object[0])).booleanValue();
        }
        return p2("enableFixDiffParent2", true);
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a411419", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_input_fix", true);
    }

    public static boolean R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0fc11ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(vfs.g().e("ShortVideo", "enableSharePlayerView", "false")));
            tfs.e(sj4.VIDEO_ACTION_TYPE_SHAREPLAYER, "view 复用orange续播开关：" + b);
        }
        Boolean bool = b;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("feb1bcd3", new Object[0])).booleanValue();
        }
        return p2("enableFixFlexMinSize", true);
    }

    public static boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("712fe382", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_input_fix_compare", true);
    }

    public static boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec8523f", new Object[0])).booleanValue();
        }
        return p2("ab_dsl_orangekey_enable", true);
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c4bdb58", new Object[0])).booleanValue();
        }
        return p2("enableFixForcePlay", true);
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1707d191", new Object[0])).booleanValue();
        }
        return p2("enableInterceptBack", true);
    }

    public static boolean T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b0f10d", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(!"true".equals((String) od0.D().g().b("disabledShortPage", "false")));
        }
        return c.booleanValue();
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d6d4bc", new Object[0])).booleanValue();
        }
        return p2("enableFixFragments", true);
    }

    public static boolean U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a5ee0c", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_recyclerview_dispatchevent", true);
    }

    public static boolean U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e0e216", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_simulated_click", true);
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b48ef357", new Object[0])).booleanValue();
        }
        return p2("enableFixGlobalAppear2", true);
    }

    public static boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f406b7ee", new Object[0])).booleanValue();
        }
        return p2("enableInterceptPageAppear", true);
    }

    public static boolean V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c07ee1", new Object[0])).booleanValue();
        }
        return p2("enableSureCategory", true);
    }

    public static boolean W(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2d5a89b", new Object[]{yVar})).booleanValue();
        }
        fhb f2 = od0.D().f();
        if (f2 == null || !f2.R(yVar.q())) {
            return p2("enableFixOtherIncorrectPageAppear", false);
        }
        return p2("enableFixTab2IncorrectPageAppear", true);
    }

    public static boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67d2097e", new Object[0])).booleanValue();
        }
        return p2("enableLastedDSL", true);
    }

    public static boolean W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48857ba0", new Object[0])).booleanValue();
        }
        return Q1();
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f236f3e", new Object[0])).booleanValue();
        }
        return p2("enableFixInitDataKey", true);
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30108622", new Object[0])).booleanValue();
        }
        if (f15794a == null) {
            f15794a = Boolean.valueOf(!od0.D().i().l());
        }
        return f15794a.booleanValue();
    }

    public static boolean X1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("375220cd", new Object[]{str})).booleanValue();
        }
        if (e0o.d()) {
            return Y1();
        }
        return p2(str, false);
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9737897a", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_input_oneditting", true);
    }

    public static boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9d4e29d", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_list_batch_insert_v2", true);
    }

    public static boolean Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ef0559", new Object[0])).booleanValue();
        }
        return p2("enableTNodeUTForColdLaunch", false);
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ece3ebd", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_keypath2", true);
    }

    public static boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48bb2", new Object[0])).booleanValue();
        }
        if (d == null) {
            try {
                d = Boolean.valueOf(Boolean.parseBoolean(vfs.g().e("ShortVideo", "enableListVideoBufferExt", "true")));
                tfs.e("TestConfig", "双列流buffer加长：" + d);
            } catch (Exception e2) {
                tfs.e("TestConfig", "e:" + e2.getMessage());
            }
        }
        Boolean bool = d;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2becdb5a", new Object[0])).booleanValue();
        }
        return p2("enableTab3LaunchUseNewLoading", true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1739025", new Object[0])).booleanValue();
        }
        return p2("tnode_check_video_invisible2", true);
    }

    public static boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2113438f", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_recycler_reuse", true);
    }

    public static boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f01807", new Object[0])).booleanValue();
        }
        return p2("enableLiveAvatarBlankCheck", true);
    }

    public static boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1167cd5", new Object[0])).booleanValue();
        }
        return p2("enableTabBarControllerNewIdleStrategy", true);
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbf6d63", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_localsetting", true);
    }

    public static boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc50527", new Object[0])).booleanValue();
        }
        return p2("enableLiveRoomMemRelease", false);
    }

    public static boolean b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("757c4b65", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_tabbarcontroller_tracker_fix", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6987b968", new Object[0])).booleanValue();
        }
        return p2("disablePreloadInColdLaunch", true);
    }

    public static boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc159e9e", new Object[0])).booleanValue();
        }
        return p2("enableFixMaxSize", true);
    }

    public static boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90745dc8", new Object[0])).booleanValue();
        }
        String G2 = G2("AB_TNode.LiveRoomMemRelease.enable", "true");
        tfs.e("TestConfig", "enableLiveRoomMemReleaseAB, abConfig: " + G2);
        return "true".equals(G2);
    }

    public static boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("723e074d", new Object[0])).booleanValue();
        }
        return p2("asyncTextRender", false);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f733ac98", new Object[0])).booleanValue();
        }
        String H2 = H2("tnode_disable_pullrightexit_version", "");
        if (!TextUtils.isEmpty(H2)) {
            for (String str : H2.split(",")) {
                if (nwv.t(str, 0) == Build.VERSION.SDK_INT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("162a9ecc", new Object[0])).booleanValue();
        }
        return p2("enableFixMoveSort", true);
    }

    public static boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2cfd383", new Object[0])).booleanValue();
        }
        return p2("enableLiveSecondRefresh", true);
    }

    public static boolean d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e54f2f5a", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_tracker_scroll_state", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ffea91", new Object[0])).booleanValue();
        }
        if (j == null) {
            Boolean valueOf = Boolean.valueOf(p2("enableAPMCustomProcessor", true));
            j = valueOf;
            if (valueOf.booleanValue()) {
                int w2 = w2("apm_sample", 1);
                String str = nca.h;
                if (!TextUtils.isEmpty(str) && str.split("\\.").length >= 4) {
                    w2 *= 200;
                }
                if (Math.random() * 1000.0d < w2) {
                    z = true;
                }
                j = Boolean.valueOf(z);
            }
        }
        return j.booleanValue();
    }

    public static boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e23fd63", new Object[0])).booleanValue();
        }
        return p2("enableFixNodePageAppear", true);
    }

    public static boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35a610af", new Object[0])).booleanValue();
        }
        return p2("enableLiveTabTopBar", true);
    }

    public static boolean e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c0706c5", new Object[0])).booleanValue();
        }
        if (s6o.E(3)) {
            return false;
        }
        return !d();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301be616", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_allpreload", true);
    }

    public static boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb76c1b0", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_notify_serialize", false);
    }

    public static boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c1fe43", new Object[0])).booleanValue();
        }
        return p2("enableLowMem", false);
    }

    public static boolean f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d4fc66", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_video_new_strategy_v2", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601ac15", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_alphaclip_fix", false);
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be3e6b1", new Object[0])).booleanValue();
        }
        return p2("enableFixPageDisappearInUt", true);
    }

    public static boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2140ae3", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_masklayer_checkalpha", true);
    }

    public static boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8444a42", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_video_seek_to_start", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d7a119", new Object[0])).booleanValue();
        }
        return p2("enableAnimDefaultStartDelay", true);
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c5936a", new Object[0])).booleanValue();
        }
        return p2("enableFixPauseDelay", true);
    }

    public static boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15478cee", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_monitor_card_select", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24a94a4e", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a51c8b", new Object[0])).booleanValue();
        }
        return p2("enableFixPreloadViewNPECrash", true);
    }

    public static boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867eaa26", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_mtop_headers", false);
    }

    public static boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce4fac2", new Object[0])).booleanValue();
        }
        return p2("enableWatchMsgInOwnRenderInstance", true);
    }

    public static boolean j(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6465472e", new Object[]{nVar})).booleanValue();
        }
        boolean p2 = p2("enableTab2AsyncLayoutInPreload3", true);
        fhb f2 = od0.D().f();
        String q2 = nVar.P().d0().c0().q();
        Context N = nVar.N();
        if (!p2 || !f2.R(q2) || !f2.L()) {
            return false;
        }
        if ((N instanceof Application) || f2.J(N)) {
            return true;
        }
        return false;
    }

    public static boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28866c61", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_refresh_header", true);
    }

    public static boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54fc96be", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_mtop_prefetch_fix", true);
    }

    public static boolean j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe10b75e", new Object[0])).booleanValue();
        }
        return p2("fixFoldDeviceWidthWrong", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("799ed37", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_text_autofit", true);
    }

    public static boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94394fd9", new Object[0])).booleanValue();
        }
        if (e == null) {
            e = Boolean.valueOf(p2("enableFixRichTextOffset", true));
        }
        return e.booleanValue();
    }

    public static boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42d33b0d", new Object[0])).booleanValue();
        }
        return p2("enableMultiThread", true);
    }

    public static boolean k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19764c0e", new Object[0])).booleanValue();
        }
        return p2("fixMemLeak2", false);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("444aa965", new Object[0])).booleanValue();
        }
        return p2("enableAvatar2RelayRedPoint", true);
    }

    public static boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b58a3c99", new Object[0])).booleanValue();
        }
        return p2("enableFixSaveDSL", true);
    }

    public static boolean l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f070ee2", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e8981f", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fixOffsetInCellOrRoot", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c507e209", new Object[0])).booleanValue();
        }
        return p2("enableAvatarInterceptHorizontalDrag", true);
    }

    public static boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e7e08c", new Object[0])).booleanValue();
        }
        return p2("enableFixSaveImageOOM", true);
    }

    public static boolean m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("816f88aa", new Object[0])).booleanValue();
        }
        return p2("ShortVideo.enableNewVideoDownloadCancel", true);
    }

    public static boolean m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a554c765", new Object[0])).booleanValue();
        }
        if (!od0.D().i().i() || !p2("forcePushTransition", true)) {
            return false;
        }
        return true;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2422e3e2", new Object[0])).booleanValue();
        }
        return p2("enabledBitmapSizeOptimise", true);
    }

    public static boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7444309f", new Object[0])).booleanValue();
        }
        return p2("enableFixSuperDelete", true);
    }

    public static boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a57c0bb", new Object[0])).booleanValue();
        }
        return p2("enableNewErrorView", true);
    }

    public static boolean n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ef3654", new Object[0])).booleanValue();
        }
        return p2("forceResetUtParams", false);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb38cd2b", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_bottomsheet_appear", false);
    }

    public static boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d6d5a8", new Object[0])).booleanValue();
        }
        return p2("enableFixTid", true);
    }

    public static boolean o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8e1f50f", new Object[0])).booleanValue();
        }
        return p2("enableNewInterpolator", true);
    }

    public static int o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("683ddc1a", new Object[0])).intValue();
        }
        return w2("bitmapMaxSize", 4000);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e311cab", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_cacheab", true);
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63eee40", new Object[0])).booleanValue();
        }
        return p2("enableFixTid2", true);
    }

    public static boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e050afeb", new Object[0])).booleanValue();
        }
        return p2("enableNewNetworkReceiver", true);
    }

    public static boolean p2(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933b45d7", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Map<String, Object> map = f;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                obj = Boolean.valueOf("true".equals(String.valueOf(od0.D().g().b(str, Boolean.valueOf(z)))));
                ((ConcurrentHashMap) map).put(str, obj);
                tfs.f("getBoolOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getBoolOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.o(obj, z);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d2b77dd", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e140937", new Object[0])).booleanValue();
        }
        return p2("enableFixTabIndicator", true);
    }

    public static boolean q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2cf26f2", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_new_orange_sp", false);
    }

    public static boolean q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d056d1b", new Object[]{str})).booleanValue();
        }
        Map<String, Boolean> map = h;
        Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(str);
        if (bool == null) {
            try {
                bool = Boolean.valueOf(od0.D().g().a(str));
                ((ConcurrentHashMap) map).put(str, bool);
                tfs.f("getBooleanFeatureConfig: " + str + ":" + bool);
            } catch (Exception e2) {
                tfs.f("getBooleanFeatureConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.o(bool, false);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e8a033", new Object[0])).booleanValue();
        }
        return p2("enableCellPreLayout", true);
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a8c0d58", new Object[0])).booleanValue();
        }
        return p2("enableFixTabbarControllerAddNewNode", true);
    }

    public static boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6110a74", new Object[0])).booleanValue();
        }
        return p2("enableNewUriMerge", true);
    }

    public static int r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca9c1efc", new Object[0])).intValue();
        }
        if (!gz0.d()) {
            return 0;
        }
        Integer num = o;
        if (num != null) {
            return num.intValue();
        }
        try {
            int parseInt = Integer.parseInt(H2("lazyLoadStartPosition", "1"));
            o = Integer.valueOf(parseInt);
            return parseInt;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20516f1", new Object[0])).booleanValue();
        }
        return p2("tnode_cell_render_timeout", true);
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5580ce", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_text_draw", true);
    }

    public static boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2483f445", new Object[0])).booleanValue();
        }
        return p2("enableNonClip", true);
    }

    public static int s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec059aa", new Object[0])).intValue();
        }
        return w2("tnode_delay_render_time", 300);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eecc3e7c", new Object[0])).booleanValue();
        }
        return p2("enableChangeClipPaddingInlist", true);
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8234e6f9", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_text_ellipsize", true);
    }

    public static boolean t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a086850b", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_onscroll_for_grid", true);
    }

    public static float t2(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0ba1fa9", new Object[]{str, new Float(f2)})).floatValue();
        }
        Map<String, Object> map = f;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                obj = od0.D().g().b(str, Float.valueOf(f2));
                ((ConcurrentHashMap) map).put(str, String.valueOf(obj));
                tfs.f("getFloatOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getFloatOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.q(obj, f2);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4e449fe", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_change_keyBoardDismissMode", true);
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cfba7f4", new Object[0])).booleanValue();
        }
        return p2("enableFixTextLayout", true);
    }

    public static boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f1ca18", new Object[0])).booleanValue();
        }
        return p2("enableOptBindEvent", true);
    }

    public static int u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c587cbfd", new Object[0])).intValue();
        }
        return w2("ShortVideo.flushUTDelayTime", 500);
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137e7ee2", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_change_listFinder", true);
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc4f5a1a", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_trackpage", true);
    }

    public static boolean v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8e697d6", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_opt_node_component", true);
    }

    public static int v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e6d8ace", new Object[0])).intValue();
        }
        return w2("globalclickinterval", 500);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c21f9c8b", new Object[0])).booleanValue();
        }
        return p2("enableClearHorizontalScrollView", true);
    }

    public static boolean w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8cfc714", new Object[0])).booleanValue();
        }
        return p2("enableOptSetNodeAttr", true);
    }

    public static int w2(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f640d9fc", new Object[]{str, new Integer(i2)})).intValue();
        }
        Map<String, Object> map = f;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                obj = od0.D().g().b(str, Integer.valueOf(i2));
                ((ConcurrentHashMap) map).put(str, String.valueOf(obj));
                tfs.f("getIntOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getIntOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.t(obj, i2);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e39c180", new Object[0])).booleanValue();
        }
        if (p2("enableContentNavIntercept", false) || q2("enableContentNavIntercept")) {
            return true;
        }
        return false;
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d547bf92", new Object[0])).booleanValue();
        }
        return p2("enableFixTransition", true);
    }

    public static boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ecff5b0", new Object[0])).booleanValue();
        }
        return p2("enableOptTransition", true);
    }

    public static int x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59026e05", new Object[0])).intValue();
        }
        return w2("linkbackExpireTimeout", RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5cf83f5", new Object[0])).booleanValue();
        }
        return p2(me8.WIDGET_SWITCH_ENABLE_CORNER_RADIUS, true);
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f305dca", new Object[0])).booleanValue();
        }
        return p2("disableTransparentTouch", true);
    }

    public static boolean y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71c52e9", new Object[0])).booleanValue();
        }
        return p2("enableFlick", false);
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541bc356", new Object[0])).booleanValue();
        }
        return p2("enableCrossPageUT", true);
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a78ecf", new Object[0])).booleanValue();
        }
        return p2("tnode_enable_fix_visibility", true);
    }

    public static boolean z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb205673", new Object[0])).booleanValue();
        }
        if (!p2("enablePerformanceTrackSample", false)) {
            return false;
        }
        if (nwv.R(o.J())) {
            return true;
        }
        Boolean bool = r;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((int) (System.nanoTime() % 100)) >= w2("tnode_performance_collector_sample_threshold", 1)) {
            r = Boolean.FALSE;
            return false;
        }
        r = Boolean.TRUE;
        return true;
    }

    public static long z2(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1460c4e5", new Object[]{str, new Long(j2)})).longValue();
        }
        Map<String, Object> map = f;
        Object obj = ((ConcurrentHashMap) map).get(str);
        if (obj == null) {
            try {
                obj = od0.D().g().b(str, Long.valueOf(j2));
                ((ConcurrentHashMap) map).put(str, String.valueOf(obj));
                tfs.f("getIntOrangeConfig: " + str + ":" + obj);
            } catch (Exception e2) {
                tfs.f("getIntOrangeConfig: " + str + ":" + e2.getMessage());
            }
        }
        return nwv.y(obj, j2);
    }

    public static boolean w0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56bd38d2", new Object[]{str})).booleanValue();
        }
        return p2("tnode_enable_fix_tracker_expose_" + str, true);
    }

    public static boolean I1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8cfaeca", new Object[]{str})).booleanValue();
        }
        boolean p2 = p2("ShortVideo.enableRecoverAudio", true);
        boolean h2 = j9t.e(o.J(), str).b().h("tbGlobalMuteSetting");
        tfs.e("TestConfig", "enableRecoverAudio, bizCode:" + str + " settingsAB: " + h2 + " boolOrangeConfig: " + p2);
        return p2 && h2;
    }

    public static boolean M2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c57986", new Object[]{str})).booleanValue();
        }
        if (i == null) {
            i = H2("syncModules", "orange,ab").split(",");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = i;
            if (i2 >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i2])) {
                return true;
            }
            i2++;
        }
    }

    public static boolean Q0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7d45c", new Object[]{new Boolean(z), str})).booleanValue();
        }
        return !s6o.E(3) && !TextUtils.equals(sj4.TAB2_SOURCE_OUTSIDE, str) && !z && p2("enableImmersiveLiveRoom", true);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e576781d", new Object[]{context})).booleanValue();
        }
        if (k == null) {
            try {
                boolean parseBoolean = Boolean.parseBoolean(vfs.g().e("ShortVideo", "disableMasklayerDispatchTouch", "true"));
                tfs.e("TestConfig", "禁用masklayer的DispatchTouch：" + parseBoolean);
                if (parseBoolean) {
                    k = "fullscreen";
                } else {
                    k = "no";
                }
                tfs.e("TestConfig", "禁用masklayer的DispatchTouch：ab: " + k);
            } catch (Exception e2) {
                tfs.e("TestConfig", "e:" + e2.getMessage());
            }
        }
        if ("all".equals(k)) {
            return true;
        }
        if (!"fullscreen".equals(k)) {
            return false;
        }
        String simpleName = context.getClass().getSimpleName();
        return "TransparentVideoListActivity".equals(simpleName) || "VideoListActivity2".equals(simpleName);
    }

    public static boolean h2(Context context, Uri uri, Uri uri2) {
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73698a0c", new Object[]{context, uri, uri2})).booleanValue();
        }
        if (!nwv.h(context) || p2("tnode_disable_view_container", false)) {
            return false;
        }
        if (p2("tnode_enable_view_container", false)) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        if (uri2 == null) {
            uri2 = uri;
        }
        String H2 = H2("tnode.changeToNewContainer", "page_detail,page_fullpage,page_profile,page_search,page_guangguangcircle,page_content");
        if (!TextUtils.isEmpty(H2)) {
            String[] split2 = H2.split(",");
            if (K2(uri.getPath())) {
                str = "page_fullpage";
            } else if (uri2.getQueryParameter("tnode") == null || (split = uri2.getQueryParameter("tnode").split("\\?")) == null || split.length <= 0) {
                str = "";
            } else {
                str = split[0];
            }
            for (String str2 : split2) {
                if (str.equals(str2) || f.k(str)) {
                    return true;
                }
            }
            if (TextUtils.equals(str, gol.GUANGGUANG_SHORT_LINK) && G0()) {
                return true;
            }
        }
        return false;
    }

    public static int y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("883ec19c", new Object[]{new Boolean(z)})).intValue();
        }
        if (gz0.d()) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        Integer num = n;
        if (num != null) {
            return num.intValue();
        }
        try {
            int parseInt = Integer.parseInt(H2("tnode_performance_listPreloadConfig", "1"));
            n = Integer.valueOf(parseInt);
            return parseInt;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
