package tb;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIXED_SJS_FAST_SWITCH_LIST_VALUE = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
    public static final String KEY_LOW_BATTERY_ND_QUICK_JUMP = "lowBatteryNdQuickJump";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f16662a;
    public static volatile Boolean b;
    public static volatile Boolean c;
    public static volatile Boolean d;
    public static volatile Boolean e;
    public static String f = null;
    public static String g = null;
    public static boolean h = false;

    static {
        t2o.a(486539271);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe7421", new Object[]{str, str2})).booleanValue();
        }
        if (i(str, "f_home_lb_quick_jump") || q(str2, "f_home_lb_quick_jump")) {
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42072ba9", new Object[]{str, str2})).booleanValue();
        }
        if (i(str, "f_home_simple_v5_jump") || q(str2, "f_home_simple_v5_jump")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("109bbddd", new Object[]{str, str2})).booleanValue();
        }
        if (!o()) {
            return false;
        }
        if (i(str, "f_home_skip_tran") || q(str2, "f_home_skip_tran")) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac9c30", new Object[0])).booleanValue();
        }
        if (e == null) {
            synchronized (bve.class) {
                try {
                    if (e == null) {
                        e = Boolean.valueOf(mve.a("disableInfoFlowShareThread", false));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff48d05", new Object[0])).booleanValue();
        }
        boolean a2 = ute.a(null, null, "enable_dx3_engine_auto_release");
        fve.e("InfoFlowGlobalABUtils", "enable_dx3_engine_auto_release: " + a2);
        return a2;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdfff365", new Object[0])).booleanValue();
        }
        boolean a2 = ute.a(null, null, "enable_first_screen_fade_in");
        fve.e("InfoFlowGlobalABUtils", "enable_first_screen_fade_in: " + a2);
        return a2;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d75f6c", new Object[0])).booleanValue();
        }
        if (f16662a == null) {
            synchronized (bve.class) {
                try {
                    if (f16662a == null) {
                        f16662a = Boolean.valueOf(mve.a("enableMemoryOptimize", true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16662a.booleanValue();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12240fa2", new Object[0])).booleanValue();
        }
        boolean g2 = g();
        fve.e("InfoFlowGlobalABUtils", "enableUtLogMapOptimize: " + g2);
        return g2;
    }

    public static boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d3bb50", new Object[]{str, str2})).booleanValue();
        }
        if (str != null && str2 != null && str.startsWith("f_ver")) {
            return str.contains(str2.concat("_ev2"));
        }
        if (str == null || str2 == null || !str.contains(str2)) {
            return false;
        }
        return true;
    }

    public static boolean j(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd448a57", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        return (jSONObject == null || str == null || !jSONObject.containsKey(str)) ? z : "true".equals(jSONObject.getString(str));
    }

    public static String k(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c86080", new Object[]{new Boolean(z)});
        }
        if (z || (str = f) == null) {
            try {
                str = (String) mza.d().c("ndLowOptimizationThird", String.class);
            } catch (Throwable th) {
                fve.c("InfoFlowGlobalABUtils", "调用HomeClientABTestTool.getAbTestValue 出错。", th);
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
            }
            f = str;
        }
        return str;
    }

    public static String l(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68955794", new Object[]{new Boolean(z)});
        }
        if (z || (str = g) == null) {
            try {
                str = whs.b();
            } catch (Throwable th) {
                fve.c("InfoFlowGlobalABUtils", "TPPUtils.getNdLowFeatureList 出错。", th);
                str = "";
            }
            g = str;
        }
        return str;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72062111", new Object[0])).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "homepagePreRenderXOpt3")) {
            z = true;
        }
        fve.e("InfoFlowGlobalABUtils", "homepagePreRenderXOpt3  = " + z);
        return z;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c228f862", new Object[0])).booleanValue();
        }
        if (eue.a() == null || TBDeviceUtils.P(eue.a()) || TBDeviceUtils.p(eue.a())) {
            return false;
        }
        boolean a2 = ute.a(null, null, "HomepageEnablePrefetchImage");
        fve.e("InfoFlowGlobalABUtils", "HomepageEnablePrefetchImage: " + a2);
        return a2;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1a5f338", new Object[0])).booleanValue();
        }
        return TextUtils.equals("l", sue.a());
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce50b56b", new Object[0])).booleanValue();
        }
        if (c == null) {
            synchronized (bve.class) {
                try {
                    if (c == null) {
                        c = Boolean.valueOf(mve.a("SavePersistenceDB", true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (c == null) {
            return false;
        }
        return c.booleanValue();
    }

    public static boolean q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5810f38", new Object[]{str, str2})).booleanValue();
        }
        if (str != null && str2 != null && str.startsWith("f_ver")) {
            return str.contains(str2.concat("_ev2"));
        }
        if (str == null || str2 == null || !str.contains(str2)) {
            return false;
        }
        return true;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1875a00c", new Object[0])).booleanValue();
        }
        if (!p()) {
            return false;
        }
        if (d == null) {
            synchronized (bve.class) {
                try {
                    if (d == null) {
                        d = Boolean.valueOf(mve.a("UTSavePersistenceDB", true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (d == null) {
            return false;
        }
        return d.booleanValue();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4320bf4e", new Object[0])).booleanValue();
        }
        if (b == null) {
            synchronized (bve.class) {
                try {
                    if (b == null) {
                        b = Boolean.valueOf(mve.a("utUploadUseSubThread", true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d16d0da", new Object[0])).booleanValue();
        }
        boolean a2 = ute.a(null, null, "enable_high_quality");
        fve.e("InfoFlowGlobalABUtils", "enable_high_quality: " + a2);
        return a2;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe12c96", new Object[0])).booleanValue();
        }
        if (eue.b()) {
            return ute.a(null, null, "home_test_enable_nd_back_anim");
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156a939f", new Object[0])).booleanValue();
        }
        if (eue.b()) {
            return ute.a(null, null, "enable_save_home_snap_shot");
        }
        return false;
    }
}
