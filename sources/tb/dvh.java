package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dvh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_1ST_LOCAL_DATA_UI_REFRESH = "1st_local_data_ui_refresh";
    public static final String STAGE_1ST_NETWORK_DATA_UI_REFRESH = "1st_network_data_ui_refresh";
    public static final String STAGE_APP_LAUNCH_TASKS = "app_launch_tasks";
    public static final String STAGE_PAGE_INIT = "page_init";
    public static final String STAGE_PAGE_ON_CREATE = "page_on_create";
    public static final String STAGE_PAGE_ON_CREATE_VIEW = "page_on_create_view";
    public static final String TASK_1ST_PAGE_IMAGE_LOAD = "1st_page_image_load";
    public static final String TASK_DATA_PROCESS = "data_process";
    public static final String TASK_DX_MAIN_LOAD_DATA = "home_dx_main_load_data";
    public static final String TASK_DX_MAIN_PRERENDER = "main_prerender";
    public static final String TASK_DX_SUB_LOAD_DATA = "home_dx_sub_load_data";
    public static final String TASK_DX_SUB_PRERENDER = "sub_prerender";
    public static final String TASK_GATEWAY_REQUEST = "gateway_request";
    public static final String TASK_HOME_COLD_START_PRE_REQUEST = "home_cold_start_pre_request";
    public static final String TASK_HOME_DX_REGISTER = "home_dx_register";
    public static final String TASK_INIT_GATEWAY = "init_gateway";
    public static final String TASK_INIT_GATEWAY_MGR = "init_gateway_mgr";
    public static final String TASK_LOAD_CACHE_PRE_CREATE_THEME = "pre_create_theme";
    public static final String TASK_LOAD_FILE = "load_file";
    public static final String TASK_LOAD_FILE_PARSE = "rmd_data_parse";
    public static final String TASK_PRE_CREATE_NATIVE_VIEW = "pre_create_native_view";
    public static final String TASK_PRE_CREATE_ROCKET_VIEW = "pre_create_rocket_view";
    public static final String TASK_PRE_LOAD_CACHE = "pre_load_cache";
    public static final String TASK_TOP_MULTI_TAB_MANAGER = "top_multi_tab_manager";
    public static final String TASK_UI_REFRESH = "ui_refresh";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f18095a = new HashMap<>();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);

    static {
        t2o.a(729809214);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167ad8a6", new Object[]{str});
        } else if (l()) {
            h().g(str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6739916f", new Object[]{str, str2});
        } else if (l()) {
            h().i(str, str2);
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9459ca1", new Object[]{str});
        }
        if (!l()) {
            return "";
        }
        String p = h().p(str);
        f18095a.put(str, p);
        return p;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        AtomicBoolean atomicBoolean = c;
        if (!atomicBoolean.get()) {
            f18095a.clear();
            huh.h().g(s9m.LPM_BIZ_CODE, "firstScreen");
            atomicBoolean.set(true);
        }
    }

    public static void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0a020", new Object[]{str, new Boolean(z)});
        } else if (l()) {
            h().j(str, z);
        }
    }

    public static void f(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6abfc27", new Object[]{str, new Boolean(z), str2});
        } else if (l()) {
            h().t(str, z, str2);
        }
    }

    public static void g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30226ba2", new Object[]{str, new Boolean(z)});
        } else if (l()) {
            f18095a.remove(str);
            h().f(str, z);
        }
    }

    public static zoc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("1bc3b61e", new Object[0]);
        }
        zoc i = huh.h().i(s9m.LPM_BIZ_CODE, "firstScreen");
        if (i == null) {
            return huh.h().c(s9m.LPM_BIZ_CODE, "firstScreen", null);
        }
        return i;
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        return (g0b.f() - SystemClock.uptimeMillis()) + System.currentTimeMillis();
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78e380f9", new Object[]{str});
        }
        return f18095a.get(str);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        return f4b.b("homepageMTSTrace", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[0])).booleanValue();
        }
        if (!b.get() || c.get()) {
            return false;
        }
        return true;
    }

    public static void m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2012ff", new Object[]{str, str2, str3});
        } else if (l() && !TextUtils.isEmpty(str3)) {
            h().l(str, str2, str3);
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d180810b", new Object[]{str, str2});
        } else if (l()) {
            h().k(str, str2);
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[0])).booleanValue();
        }
        if (k() && vxl.b().G() && !c.get()) {
            AtomicBoolean atomicBoolean = b;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                h().m(i());
                return true;
            }
        }
        return false;
    }

    public static void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54686b", new Object[]{new Boolean(z)});
        } else if (l()) {
            h().n(z);
            b.set(false);
        }
    }
}
