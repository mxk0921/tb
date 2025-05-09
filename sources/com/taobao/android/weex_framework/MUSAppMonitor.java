package com.taobao.android.weex_framework;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.amo;
import tb.dwh;
import tb.iu2;
import tb.t2o;
import tb.zbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSAppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIMUISE_SDK_VERSION = "alimuise_sdk_version";
    public static final String BUNDLE_URL = "bundle_url";
    public static final String BYTECODE = "bytecode";
    public static final String ERROR_MSG = "error_msg";
    public static final String LOG_TAG = "[Monitor]";
    public static final String MODULE = "MUSAppMonitor";
    public static final String MUISE_SDK_VERSION = "muise_sdk_version";
    public static final String PAGE_NAME = "page_name";
    public static final String SCRIPT_URL = "script_url";
    public static final String SVERSION = "sversion";
    public static final String T_ITEM_TYPE = "t_item_type";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface AvailErrorCodeType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface DownloadErrorCodeType {
    }

    static {
        t2o.a(982515997);
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7cfea5", new Object[]{cVar});
        } else {
            c(cVar, "1009", "downgrade to h5");
        }
    }

    public static void b(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09fa83", new Object[]{cVar, str, str2});
            return;
        }
        c(cVar, "1004", "downgrade to: " + str + ", reason: " + str2);
    }

    public static void c(c cVar, String str, String str2) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c413483", new Object[]{cVar, str, str2});
        } else if (cVar == null || !cVar.p()) {
            if (cVar == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = cVar.a();
            }
            if (MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn != cVar.l()) {
                z = false;
            }
            d(jSONObject, str, str2, z);
        }
    }

    public static void d(JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c361ad46", new Object[]{jSONObject, str, str2, new Boolean(z)});
            return;
        }
        if (str2.length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        jSONObject.put(ERROR_MSG, (Object) str2);
        if (!zbf.a()) {
            try {
                AppMonitor.Alarm.commitFail("MUSAppMonitor", "available_error", jSONObject.toString(), str, "");
            } catch (Throwable unused) {
                dwh.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }

    public static void e(c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a57bab", new Object[]{cVar});
        } else if (cVar == null || !cVar.p()) {
            if (cVar == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = cVar.a();
            }
            String json = jSONObject.toString();
            if (!zbf.a()) {
                try {
                    AppMonitor.Alarm.commitSuccess("MUSAppMonitor", amo.a.POINT_NAME, json);
                } catch (Throwable unused) {
                    dwh.f(LOG_TAG, "AppMonitor not found");
                }
            }
        }
    }

    public static void f(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a62b20", new Object[]{cVar, str});
        } else {
            c(cVar, "1000", str);
        }
    }

    public static void g(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f9fbf4", new Object[]{cVar, str, str2});
            return;
        }
        c(cVar, iu2.CALENDAR_ERROR_INVALIDATE_END_TIME_CODE, "code: " + str + ", error: " + str2);
    }

    public static void h(c cVar, String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1163e6a", new Object[]{cVar, str, str2});
        } else if (cVar == null || !cVar.p()) {
            if (cVar == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = cVar.a();
            }
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            jSONObject.put(ERROR_MSG, (Object) str2);
            if (!zbf.a()) {
                try {
                    AppMonitor.Alarm.commitFail("MUSAppMonitor", "download_error", jSONObject.toString(), str, "");
                } catch (Throwable unused) {
                    dwh.f(LOG_TAG, "AppMonitor not found");
                }
            }
        }
    }

    public static void i(c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea03724", new Object[]{cVar});
        } else if (cVar == null || !cVar.p()) {
            if (cVar == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = cVar.a();
            }
            String json = jSONObject.toString();
            if (!zbf.a()) {
                try {
                    AppMonitor.Alarm.commitSuccess("MUSAppMonitor", "download", json);
                } catch (Throwable unused) {
                    dwh.f(LOG_TAG, "AppMonitor not found");
                }
            }
        }
    }

    public static void j(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916f359e", new Object[]{cVar, new Long(j)});
        } else if (cVar != null) {
            MUSMonitor.g(cVar, j);
        }
    }

    public static void k(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbc4c29", new Object[]{cVar, str, str2});
            return;
        }
        c(cVar, "1006", "code: " + str + ", error: " + str2);
    }

    public static void l(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8c793c", new Object[]{cVar, str, str2});
            return;
        }
        c(cVar, "1005", "code: " + str + ", error: " + str2);
    }

    public static void m(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8108427f", new Object[]{cVar});
        } else if (cVar != null && !cVar.p() && !zbf.a()) {
            JSONObject a2 = cVar.a();
            String c = cVar.c();
            if (TextUtils.isEmpty(c)) {
                c = "No activity info";
            }
            a2.put(ERROR_MSG, (Object) c);
            try {
                AppMonitor.Alarm.commitFail("MUSAppMonitor", "monitor_error", a2.toString(), c, "");
            } catch (Throwable unused) {
                dwh.f(LOG_TAG, "AppMonitor not found");
            }
        }
    }
}
