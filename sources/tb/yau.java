package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class yau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29e1f9", new Object[]{map});
        } else if (map != null) {
            for (String str : map.keySet()) {
                if (trq.e(str) && str.contains("-")) {
                    RSoLog.d("!!! Do not use '-' in track args key !!!, key=".concat(str));
                }
            }
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb612a1b", new Object[]{str, str2, map});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Counter.commit(str, str2, jSONString, 1.0d);
        RSoLog.d(str2 + " = " + jSONString);
    }

    public static void c(String str, String str2, Map<String, Object> map, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7207bb61", new Object[]{str, str2, map, new Integer(i), str3});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Alarm.commitFail(str, str2, jSONString, String.valueOf(i), str3);
        RSoLog.d(str2 + " = " + jSONString + ", [" + i + ":" + str3 + "]");
    }

    public static void d(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3f1f88", new Object[]{str, str2, map});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Alarm.commitSuccess(str, str2, jSONString);
        RSoLog.d(str2 + " = " + jSONString);
    }
}
