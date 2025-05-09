package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fdv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String F_BROADCAST = "broadcast";
    public static final String F_COMPONENT_RENDER = "componentRender";
    public static final String F_COMPONENT_RENDER_TAG = "umbrella.component.render";
    public static final String F_CONFIG = "orange";
    public static final String F_DATA_PROCESS = "dataProcess";
    public static final String F_DATA_PROCESS_TAG = "umbrella.data.process";
    public static final String F_DOWNGRADE = "downgrade";
    public static final String F_EVENT_PROCESS = "eventProcess";
    public static final String F_EVENT_PROCESS_TAG = "umbrella.event.process";
    public static final String F_NETWORK_REQUEST = "netRequest";
    public static final String F_PAGE_RENDER = "pageRender";
    public static final String F_PAGE_RENDER_TAG = "umbrella.page.render";
    public static final String F_SKIN = "skin";
    public static final String F_TEMPLATE_DOWNGRADE_INNER_TEMPALTE_TAG = "umbrella.downgrade.inner.template";
    public static final String F_TEMPLATE_DOWNGRADE_NATIVE_TAG = "umbrella.downgrade.native";
    public static final String F_TEMPLATE_DOWNLOAD = "templateDownload";
    public static final String F_TEMPLATE_DOWNLOAD_TAG = "umbrella.download.template";

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f19223a = hdv.a();

    static {
        t2o.a(479199536);
    }

    public static void d(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e30adf2", new Object[]{lcuVar});
        } else if (lcuVar != null) {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("eventId", lcuVar.d());
                hashMap.put("params", lcuVar.c());
                f19223a.logInfo("cart_ultron", "", "eventProcess", null, vxu.CONTAINER_DIM_MAP, cyu.b(hashMap));
            } catch (Throwable th) {
                UnifyLog.m(lcuVar.f().c(), "UmbrellaMonitor", "logEvent", th.getMessage());
            }
        }
    }

    public static void e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c877c3b4", new Object[]{str, str2, str3, str4});
            return;
        }
        cyu a2 = cyu.a(str3, str4);
        a2.d("tag", str);
        try {
            f19223a.logInfo("cart_ultron", "", str2, null, null, a2);
        } catch (Throwable unused) {
        }
    }

    public static void f(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0d68e5", new Object[]{str, str2, map});
            return;
        }
        cyu b = cyu.b(map);
        b.d("tag", str);
        try {
            f19223a.logInfo("cart_ultron", "", str2, null, null, b);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea5e77a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        cyu c = cyu.c(str5);
        c.d("tag", str);
        f19223a.logError("cart_ultron", "", str2, null, str3, str4, null, c);
    }

    public static void c(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf17bd5", new Object[]{str, str2, str3, str4, map});
            return;
        }
        cyu b = cyu.b(map);
        b.d("tag", str);
        f19223a.logError("cart_ultron", "", str2, null, str3, str4, null, b);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        c("umbrella", str, str6, str7, map);
        try {
            f19223a.commitFailure(str, str2, str3, "cart_ultron", "", map, str6, str7);
        } catch (Throwable unused) {
        }
    }
}
