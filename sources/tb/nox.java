package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002024);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8d1a58", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "page_preload_state", g(str, str2), "arg_err", str3);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a4cac3", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "page_preload_state", g(str, str2), "not_exist", "not_exist");
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c441e3", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("xsearchlist_preload", "page_preload_state", g(str, str2));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b098102e", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "request_preload_state", g(str, str2), pg1.ATOM_EXT_repeat, pg1.ATOM_EXT_repeat);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6177d5", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("xsearchlist_preload", "request_preload_state", g(str, str2));
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0d3204", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "request_preload_state", g(str, str2), "timeout", "timeout");
        }
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c91896b", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url_path", (Object) str);
        jSONObject.put("pageName", (Object) str2);
        return jSONObject.toJSONString();
    }
}
