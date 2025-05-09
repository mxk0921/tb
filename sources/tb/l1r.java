package tb;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l1r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_MEMORY_REPEAT_INTERVAL = "config_memory_repeat_interval";
    public static final String SWITCH_ALARM_MANAGER_PROXY_EVENT = "switch_alarm_manager_proxy_event";
    public static final String SWITCH_BATTERY_HARDWARE_STAT_METRIC = "switch_battery_hardware_stat_metric";
    public static final String SWITCH_BLOCK_STACK_METRIC = "switch_block_stack_metric";
    public static final String SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT = "switch_bluetooth_adapter_proxy_event";
    public static final String SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT = "switch_bluetooth_le_scanner_proxy_event";
    public static final String SWITCH_CPU_LOAD_ABNORMAL_METRIC = "switch_cpu_load_abnormal_metric";
    public static final String SWITCH_HONOR_PLUGIN = "switch_honor_plugin";
    public static final String SWITCH_LOCATION_MANAGER_PROXY_EVENT = "switch_location_manager_proxy_event";
    public static final String SWITCH_POWER_MANAGER_PROXY_EVENT = "switch_power_manager_proxy_event";
    public static final String SWITCH_SENSOR_MANAGER_PROXY_EVENT = "switch_sensor_manager_proxy_event";

    /* renamed from: a  reason: collision with root package name */
    public static Application f23059a;
    public static boolean b;
    public static boolean c;
    public static final boolean d = new File("/data/local/tmp/.metrickit/", ".metrickit_top_level_switcher").exists();
    public static final boolean e = new File("/data/local/tmp/.metrickit/", ".metrickit_top_level_open_all_switcher").exists();
    public static final Set<String> f;
    public static final Set<String> g;
    public static volatile SharedPreferences h;

    static {
        HashSet hashSet = new HashSet();
        f = hashSet;
        HashSet hashSet2 = new HashSet();
        g = hashSet2;
        hashSet.add(SWITCH_BLOCK_STACK_METRIC);
        hashSet.add(SWITCH_POWER_MANAGER_PROXY_EVENT);
        hashSet.add(SWITCH_SENSOR_MANAGER_PROXY_EVENT);
        hashSet.add(SWITCH_ALARM_MANAGER_PROXY_EVENT);
        hashSet.add(SWITCH_BATTERY_HARDWARE_STAT_METRIC);
        hashSet.add(SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT);
        hashSet.add(SWITCH_LOCATION_MANAGER_PROXY_EVENT);
        hashSet.add(SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT);
        hashSet.add(SWITCH_CPU_LOAD_ABNORMAL_METRIC);
        hashSet2.add(SWITCH_BLOCK_STACK_METRIC);
        hashSet2.add(SWITCH_POWER_MANAGER_PROXY_EVENT);
        hashSet2.add(SWITCH_SENSOR_MANAGER_PROXY_EVENT);
        hashSet2.add(SWITCH_ALARM_MANAGER_PROXY_EVENT);
        hashSet2.add(SWITCH_BATTERY_HARDWARE_STAT_METRIC);
        hashSet2.add(SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT);
        hashSet2.add(SWITCH_LOCATION_MANAGER_PROXY_EVENT);
        hashSet2.add(SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT);
        hashSet2.add(SWITCH_CPU_LOAD_ABNORMAL_METRIC);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22d83af", new Object[0]);
        } else if (f23059a == null) {
            g(ActivityThread.currentActivityThread().getApplication());
        }
    }

    public static void b(Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4122bfb", new Object[]{map});
            return;
        }
        try {
            a();
            SharedPreferences e2 = e(f23059a);
            SharedPreferences.Editor edit = e2.edit();
            Iterator it = ((HashSet) f).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!map.containsKey(str) && e2.contains(str)) {
                    edit.remove(str);
                    z = true;
                }
            }
            Iterator it2 = ((HashSet) g).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!map.containsKey(str2) && e2.contains(str2)) {
                    edit.remove(str2);
                    z = true;
                }
            }
            if (z) {
                edit.apply();
            }
        } catch (Exception e3) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.l1r.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "94fe047f"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0018:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/local/tmp/.metrickit/"
            r0.<init>(r1, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0026
            return r5
        L_0x0026:
            r4 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: all -> 0x0042, NumberFormatException -> 0x0046, IOException -> 0x004a
            java.lang.String r2 = "r"
            r1.<init>(r0, r2)     // Catch: all -> 0x0042, NumberFormatException -> 0x0046, IOException -> 0x004a
            java.lang.String r4 = r1.readLine()     // Catch: all -> 0x003c, NumberFormatException -> 0x003e, IOException -> 0x0040
            r1.close()     // Catch: IOException -> 0x0037
            goto L_0x003b
        L_0x0037:
            r5 = move-exception
            r5.printStackTrace()
        L_0x003b:
            return r4
        L_0x003c:
            r4 = move-exception
            goto L_0x005a
        L_0x003e:
            r4 = move-exception
            goto L_0x004c
        L_0x0040:
            r4 = move-exception
            goto L_0x004c
        L_0x0042:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L_0x005a
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            r1 = r4
            r4 = r0
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            goto L_0x0047
        L_0x004c:
            r4.printStackTrace()     // Catch: all -> 0x003c
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch: IOException -> 0x0055
            goto L_0x0059
        L_0x0055:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0059:
            return r5
        L_0x005a:
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch: IOException -> 0x0060
            goto L_0x0064
        L_0x0060:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0064:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l1r.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        if (!d) {
            try {
                a();
                return e(f23059a).getLong(str, j);
            } catch (Exception e2) {
                TLog.loge("MetricKit", "MetricKit.Switcher", e2);
                return j;
            }
        } else {
            try {
                return Long.parseLong(c("." + str, String.valueOf(j)));
            } catch (Exception e3) {
                e3.printStackTrace();
                return j;
            }
        }
    }

    public static SharedPreferences e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        if (h == null) {
            synchronized (daq.class) {
                try {
                    if (h == null) {
                        h = m7l.a(context, "MetricKitConfig", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd0d780c", new Object[]{str})).booleanValue();
        }
        if ((!b || !((HashSet) f).contains(str)) && (!c || !((HashSet) g).contains(str))) {
            return false;
        }
        return true;
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52433a52", new Object[]{str})).booleanValue();
        }
        if (e) {
            return true;
        }
        if (!d) {
            try {
                a();
                return e(f23059a).getBoolean(str, f(str));
            } catch (Exception e2) {
                TLog.loge("MetricKit", "MetricKit.Switcher", e2);
                return false;
            }
        } else {
            return new File("/data/local/tmp/.metrickit/", "." + str).exists();
        }
    }

    public static void i(Map<String, Boolean> map, Map<String, Long> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20efca30", new Object[]{map, map2});
            return;
        }
        try {
            a();
            SharedPreferences.Editor edit = e(f23059a).edit();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    edit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
                }
            }
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                if (entry2.getValue() != null) {
                    edit.putLong(entry2.getKey(), entry2.getValue().longValue());
                }
            }
            edit.apply();
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
        }
    }

    public static void j(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78117888", new Object[]{str, new Long(j)});
            return;
        }
        try {
            a();
            e(f23059a).edit().putLong(str, j).commit();
        } catch (Exception e2) {
            TLog.loge("MetricKit", "MetricKit.Switcher", e2);
            e2.printStackTrace();
        }
    }

    public static void g(Application application) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        f23059a = application;
        if ((application.getApplicationInfo().flags & 2) != 0) {
            z = true;
        }
        c = z;
        int identifier = application.getResources().getIdentifier("publish_type", "string", application.getPackageName());
        if (identifier <= 0) {
            str = "";
        } else {
            str = application.getString(identifier);
        }
        b = "0".equals(str);
    }
}
