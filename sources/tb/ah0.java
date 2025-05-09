package tb;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ah0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AFC_AFTER_LINK_ROUTER_TIME = "afc_after_link_router_time";
    public static final String AFC_BEFORE_LINK_ROUTER_TIME = "afc_before_link_router_time";
    public static final String AFC_FLOW_LEAVE = "afc_flow_leave";
    public static final String AFC_FLOW_LOCAL_ROUTER = "afc_flow_local_router";
    public static final String AFC_FLOW_REMOTE_ROUTER = "afc_flow_remote_router";
    public static final String AFC_FLOW_ROUTER_AFTER = "afc_flow_router_after";
    public static final String AFC_FLOW_ROUTER_BEFORE = "afc_flow_router_before";
    public static final String AFC_FLOW_TAID = "afc_flow_taid";
    public static final String AFC_FLOW_TRACK = "afc_flow_track";
    public static final String AFC_FLOW_TRACK_2 = "afc_flow_track2";
    public static final String AFC_ID = "afc_id";
    public static final String AFC_LINK_CRASH_MESSAGE = "afc_link_crash_message";
    public static final String AFC_LINK_CRASH_ROUTER_LOCAL = "afc_link_crash_router_local";
    public static final String AFC_LINK_CRASH_ROUTER_URL = "afc_link_crash_router_url";
    public static final String AFC_LINK_CRASH_SMALL_HANDLE = "afc_link_crash_small_handle";
    public static final String AFC_LINK_END = "afc_link_end";
    public static final String AFC_LINK_NAV_START = "afc_link_nav_start";
    public static final String AFC_LINK_ROUTER = "afc_link_router";
    public static final String AFC_LINK_ROUTER_TIME = "afc_link_router_time";
    public static final String AFC_LINK_START = "afc_link_start";
    public static final String AFC_NAV_TIME = "afc_nav_time";
    public static final String AFC_NAV_URL = "afc_nav_url";
    public static final String AFC_REQUEST_TIME = "afc_request_time";
    public static final String AFC_SDK_INIT = "afc_sdk_init";
    public static final String AFC_SDK_INIT_TIME = "afc_sdk_init_time";
    public static final String ALIBC_FLOWCUSTOMS_INIT = "alibc_flowCustoms_init";
    public static final String APPLINK_GATEWAY = "applink_gateway";
    public static final String ARG1_DEVICE_INFO_APPLY_PRIVILEGE_COUNT = "device_info_apply_privilege_count";
    public static final String ARG1_FLOW_BACK = "return_refer_app_click";
    public static final String ARG1_FLOW_EXPOSE = "return_refer_app_expose";
    public static final int EVENT_ID_1013 = 1013;
    public static final int EVENT_ID_1014 = 1014;
    public static final int EVENT_ID_19999 = 19999;
    public static final int EVENT_ID_2101 = 2101;
    public static final int EVENT_ID_2201 = 2201;
    public static final String PAGE_FLOWCUSTOMS = "Page_FlowCustoms";
    public static final String PAGE_WELCOME = "Page_Welcome";
    public static final String PAGE_WELCOME2 = "Page_Welcome2";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15732a = new AtomicBoolean(false);
    public static final List<Map<String, String>> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15733a;
        public final /* synthetic */ Map b;

        public a(String str, Map map) {
            this.f15733a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ah0.a(this.f15733a, this.b);
            }
        }
    }

    static {
        t2o.a(467664975);
    }

    public static /* synthetic */ void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99a7e4", new Object[]{str, map});
        } else {
            e(str, map);
        }
    }

    public static void c(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbc2e85", new Object[]{new Integer(i), str, str2, str3, map});
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable unused) {
                vp9.b(AfcCustomSdk.LOG_TAG_UT, "AfcCustomSdk.error.eventId=" + i);
                return;
            }
        }
        Map<String, String> b2 = b(map);
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(PAGE_FLOWCUSTOMS, i, str, str2, str3, b2);
        vp9.a(AfcCustomSdk.LOG_TAG_UT, "eventId: " + i + "  arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + "  properties: " + b2);
        g(str, uTOriginalCustomHitBuilder.build());
    }

    public static void d(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5fe806", new Object[]{str, str2, str3, map});
        } else {
            c(1013, str, str2, str3, map);
        }
    }

    public static void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91a1e55", new Object[]{str, map});
            return;
        }
        try {
            if (pg0.i().n) {
                UTAnalytics.getInstance().getDefaultTracker().send(map);
                vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === UT标记位初始化成功 " + str + " === 具体参数：" + map.toString());
            } else if (UTAnalytics.getInstance().isInit()) {
                UTAnalytics.getInstance().getDefaultTracker().send(map);
                vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === UT初始化成功 " + str + " === 具体参数：" + map.toString());
                return;
            } else {
                ((ArrayList) b).add(map);
            }
            vp9.a(AfcCustomSdk.LOG_TAG_UT, "性能节点: arg1= " + str + " === 具体参数：" + map.toString());
        } catch (Throwable th) {
            vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === sendData2Ut === 异常：" + th.getMessage());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56411514", new Object[0]);
            return;
        }
        try {
            pg0.i().n = true;
            List<Map<String, String>> list = b;
            if (((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    Map<String, String> map = (Map) it.next();
                    UTAnalytics.getInstance().getDefaultTracker().send(map);
                    vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === 上传缓存埋点:" + map.toString());
                }
                ((ArrayList) b).clear();
            }
        } catch (Exception e) {
            vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === 上传缓存的埋点异常:" + e.getMessage());
        }
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729264ed", new Object[]{str, map});
        } else if (pg0.i().o) {
            zsa.b.a(new a(str, map));
        } else {
            vp9.a(AfcCustomSdk.LOG_TAG_UT, "AfcTracker === sendUt === 同步上传数据");
            e(str, map);
        }
    }

    public static void h(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82f9f7", new Object[]{new Boolean(z)});
        } else if (f15732a.compareAndSet(false, true)) {
            if (z) {
                str = "Page_Welcome";
            } else {
                str = PAGE_WELCOME2;
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, 2003, null, null, null, null);
            vp9.a(AfcCustomSdk.LOG_TAG_UT, "[sendWelcomePoint]2003");
            g(null, uTOriginalCustomHitBuilder.build());
        }
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("25d74cdd", new Object[]{map});
        }
        int h = pg0.i().h(-1);
        boolean j = pg0.i().j(false);
        String k = pg0.i().k("COLD");
        long m = pg0.i().m(0L);
        String b2 = pg0.i().b();
        if (!TextUtils.isEmpty(b2)) {
            b2 = b2.toLowerCase();
        }
        map.put("isInBackground", String.valueOf(j));
        map.put("deviceLevel", String.valueOf(h));
        map.put(rg0.COLDBOOT, String.valueOf(k));
        map.put("processId", String.valueOf(Process.myPid()));
        map.put("processStart", String.valueOf(m));
        map.put("processType", String.valueOf(0));
        if (!"cold".equals(b2)) {
            m = AfcUtils.f();
        }
        map.put("flowStart", String.valueOf(m));
        map.put("launchStartType", b2);
        return map;
    }
}
