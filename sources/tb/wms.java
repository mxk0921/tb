package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_KEY_ACTIVITIES = "idleActivities";
    public static final String CONFIG_KEY_CONFIG = "tschedule_config";
    public static final String CONFIG_KEY_DELAY_PRERENDER = "is_delay_prerender_on";
    public static final String CONFIG_KEY_FRAGMENTS = "idleFragments";
    public static final String CONFIG_KEY_INJECT_JS = "injectJs";
    public static final String CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5 = "multi_process_h5";
    public static final String CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP = "multi_process_mini";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_H5 = "render_h5";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_MINIAPP = "render_mini";
    public static final String CONFIG_KEY_RENDER_PROTOCOL_PHA = "render_pha";
    public static final String CONFIG_KEY_RENDER_VERSION = "render_version";
    public static final String CONFIG_KEY_SAMPLE_RATIO = "sample_ratio";
    public static final String CONFIG_KEY_SMOOTH_DURATION = "smooth_duration";
    public static final String CONFIG_KEY_TRIGGER_CUSTOM_WHITE_LIST = "trigger_custom_whitelist";
    public static final String CONFIG_KEY_TRIGGER_IDLE_WHITE_LIST = "trigger_idle_whitelist";
    public static final String CONFIG_KEY_TRIGGER_NAV_BLACK_LIST = "trigger_nav_blacklist";
    public static final String DEFER_INIT_PREFETCH_CONFIG = "tsche_init_defer";
    public static final String SP_FILE_NAME = "tschedule";
    public static final String SWITCH_KEY_ENABLE_CONFIG_TRIGGER = "config_trigger_enable";
    public static final String SWITCH_KEY_ENABLE_FOREACH_INTENT = "foreach_intent_enable";
    public static final String SWITCH_KEY_ENABLE_NAV = "nav_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_CUSTOM = "custom_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_DINAMIC2 = "dinamic2_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_DINAMIC3 = "dinamic3_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_HTTP = "http_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_MTOP = "mtop_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_PHENIX = "phenix_task_enable";
    public static final String SWITCH_KEY_ENABLE_TASK_RENDER = "webview_task_enable";
    public static final String TIME_CONTENT_FIX = "timeContentFix";
    public static final String TS_ENABLE = "tsEnable";
    public static final String TS_MEMORY_THRESHOLD = "tsMemoryThreshold";
    public static final String TS_PREDICT_ENABLE = "tsPredict";
    public static final String TS_RENDER_BY_EDITION = "render_by_edition_enable";
    public static final String TS_RENDER_HIT_ENABLE = "tsRender";

    static {
        t2o.a(329253029);
    }

    public static synchronized SharedPreferences a(String str) {
        synchronized (wms.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("7e57ee58", new Object[]{str});
            }
            try {
                return TScheduleInitialize.b().getSharedPreferences(str, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
        }
        SharedPreferences a2 = a(str);
        if (a2 == null) {
            return str3;
        }
        try {
            return a2.getString(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences a2 = a(str);
        if (a2 != null) {
            try {
                SharedPreferences.Editor edit = a2.edit();
                edit.putString(str2, str3);
                edit.commit();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r4 == null) goto L_0x0064;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.wms.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "f5bbcc23"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = "resetValues"
            tb.ums.c(r1)
            android.content.SharedPreferences r4 = a(r4)
            if (r4 != 0) goto L_0x0022
            return
        L_0x0022:
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: all -> 0x0060
            r4.clear()     // Catch: all -> 0x0056
            if (r5 == 0) goto L_0x005c
            boolean r2 = r5.isEmpty()     // Catch: all -> 0x0056
            if (r2 == 0) goto L_0x0032
            goto L_0x005c
        L_0x0032:
            java.util.Set r5 = r5.entrySet()     // Catch: all -> 0x0056
            java.util.Iterator r5 = r5.iterator()     // Catch: all -> 0x0056
        L_0x003a:
            boolean r2 = r5.hasNext()     // Catch: all -> 0x0056
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r5.next()     // Catch: all -> 0x0056
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: all -> 0x0056
            java.lang.Object r3 = r2.getKey()     // Catch: all -> 0x0056
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0056
            java.lang.Object r2 = r2.getValue()     // Catch: all -> 0x0056
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x0056
            r4.putString(r3, r2)     // Catch: all -> 0x0056
            goto L_0x003a
        L_0x0056:
            goto L_0x0061
        L_0x0058:
            r4.commit()
            goto L_0x0064
        L_0x005c:
            r4.commit()
            return
        L_0x0060:
            r4 = 0
        L_0x0061:
            if (r4 == 0) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            java.lang.String[] r4 = new java.lang.String[r0]
            tb.ums.b(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wms.d(java.lang.String, java.util.Map):void");
    }
}
