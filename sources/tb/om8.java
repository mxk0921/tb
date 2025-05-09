package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.a;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class om8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750420);
    }

    public static Map<String, String> a(Throwable th) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb4c7002", new Object[]{th});
        }
        HashMap hashMap = new HashMap(10);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0) {
            str = "";
            str2 = str;
        } else {
            str = stackTrace[0].toString();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\r\n");
            }
            str2 = sb.toString();
        }
        hashMap.put("errorMsg", th.toString() + " " + str);
        hashMap.put("errorStackString", str2);
        return hashMap;
    }

    public static void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f8365f", new Object[]{str, jSONObject});
            return;
        }
        try {
            String valueOf = String.valueOf(kxw.b(jSONObject));
            if (g(valueOf)) {
                TLog.loge("ExceptionUtils", "catchErrorToUm onError : walle no init or degrade");
                return;
            }
            HashMap hashMap = new HashMap(jSONObject.size());
            for (String str2 : jSONObject.keySet()) {
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    hashMap.put(str2, (String) obj);
                } else if (obj != null) {
                    hashMap.put(str2, obj.toString());
                }
            }
            hdv.a().commitFailure("eventProcess", "ExceptionUtils", "1.0", "BehaviR", str, hashMap, valueOf, "catchErrorToUm error");
        } catch (Throwable th) {
            TLog.loge("ExceptionUtils", "catchErrorToUm error, " + th.getMessage());
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c5cf45", new Object[]{str, str2, str3});
            return;
        }
        try {
            hdv.a().commitFailure("eventProcess", "ExceptionUtils", "1.0", "BehaviR", str, null, str2, str3);
            TLog.loge(str, str2, str3);
        } catch (Throwable th) {
            TLog.loge("ExceptionUtils", "catchErrorToUm error, " + th.getMessage());
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb58d66", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge("ExceptionUtils", "UncatchedException,", th);
            UtUtils.c(str, a(th), a.e("code", str2));
        } catch (Throwable th2) {
            TLog.loge("ExceptionUtils", "when catch exception, it has an other exception.", th2);
            TLog.loge("ExceptionUtils", "the origin exception is ", th);
        }
        if (Debuggable.isDebug()) {
            throw new RuntimeException(th);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8adb0", new Object[]{str, th});
        } else {
            d(str, "", th);
        }
    }

    public static void f(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff996f1c", new Object[]{str, str2, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        hdv.a().commitFailure("UCPCommonError", "", "", "UCP", "UCP", hashMap, str, str2);
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18cec813", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (!str.contains("209") && !str.contains("83") && !str.contains("84"))) {
            return false;
        }
        return true;
    }
}
