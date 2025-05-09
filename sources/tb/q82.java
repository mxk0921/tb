package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q82 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BehaviXMonitor";

    static {
        t2o.a(404750598);
    }

    public static void a(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40136e88", new Object[]{str, str2, map, str3, str4});
        } else {
            hdv.a().commitFailure("crash", str, "1.0", "BehaviX", str2, map, str3, str4);
        }
    }

    public static void b(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dae9387", new Object[]{str, str2, map, str3, str4});
        } else {
            hdv.a().commitFailure("eventProcess", str, "1.0", "BehaviX", str2, map, str3, str4);
        }
    }

    public static void c(String str, String str2, String str3, String str4, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b5e4b1", new Object[]{str, str2, str3, str4, cyuVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(UMDimKey.DIM_1, str2);
        }
        hdv.a().logError("BehaviX", str, "eventProcess", null, str3, str4, hashMap, cyuVar);
    }

    public static void d(String str, String str2, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8333f97", new Object[]{str, str2, cyuVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(UMDimKey.DIM_1, str2);
        }
        hdv.a().logInfo("BehaviX", str, "eventProcess", null, hashMap, cyuVar);
    }

    public static void e(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7f96d2", new Object[]{str, str2, map, str3, str4});
        } else {
            b(str, str2, map, str3, str4);
        }
    }

    public static void f(String str, String str2, Map<String, String> map, Throwable th) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d776f9a", new Object[]{str, str2, map, th});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        TLog.loge("behavix_track", TAG, th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0) {
            str3 = "";
            str4 = str3;
        } else {
            str3 = stackTrace[0].toString();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\r\n");
            }
            str4 = sb.toString();
        }
        map.put("errorMsg", th.toString() + "____" + str3);
        map.put("errorStackString", str4);
        a(str, str2, map, th.getClass().getSimpleName(), th.getClass().getSimpleName());
        if (Debuggable.isDebug()) {
            throw new RuntimeException(th.getMessage(), th);
        }
    }
}
