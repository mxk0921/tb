package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class d71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_TINCT_TAG = "tinctTag";
    public static final String POINT_COMMIT_FAILURE = "exception_failure";
    public static final String POINT_COMMIT_SUCCESS = "exception_success";
    public static final String POINT_LOG = "exception_log";

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80feadea", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str7)) {
            map.put("errorMsg", str7);
        }
        if (!map.containsKey(PARAM_TINCT_TAG)) {
            map.put(PARAM_TINCT_TAG, zxu.f(str4));
        }
        UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
        bVar.d(str3).b(map);
        bVar.c("2.0");
        UmbrellaInfo a2 = bVar.a();
        if (a2 != null) {
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString(), str6, str7);
        }
    }

    public static void b(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{str, str2, umTypeKey, str3, str4});
            return;
        }
        UmbrellaInfo.b bVar = new UmbrellaInfo.b(null, null, umTypeKey.getKey(), str, "feedback");
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str4);
        hashMap.put("feedback", str2);
        hashMap.put("stacks", g());
        if (!hashMap.containsKey(PARAM_TINCT_TAG)) {
            hashMap.put(PARAM_TINCT_TAG, zxu.f(str));
        }
        bVar.b(hashMap);
        bVar.c("2.0");
        UmbrellaInfo a2 = bVar.a();
        if (a2 != null) {
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString(), str3, str4);
        }
    }

    public static void c(Throwable th, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db95a90", new Object[]{th, str, str2, str3, str4, str5});
            return;
        }
        try {
            String e = e(str);
            String e2 = e(str2);
            String e3 = e(str3);
            String e4 = e(str4);
            String e5 = e(str5);
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", "Monitor_Umbrella2_Service", f(th), e, e2 + "|" + e3 + "|" + e4 + "|" + e5);
        } catch (Throwable th2) {
            Log.e("umbrella.LinkLogWorker", "SafetyRunnable catch exception", th2);
        }
    }

    public static void d(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1ebd8f", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(PARAM_TINCT_TAG)) {
            map.put(PARAM_TINCT_TAG, zxu.f(str4));
        }
        UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
        bVar.d(str3).b(map);
        bVar.c("2.0");
        UmbrellaInfo a2 = bVar.a();
        AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST, a2.toJsonString());
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c302f1d3", new Object[]{str});
        }
        if (byu.a(str)) {
            return "empty";
        }
        return str;
    }

    public static String f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49ef7c30", new Object[]{th});
        }
        if (th == null) {
            return "empty_throwable";
        }
        String message = th.getMessage();
        if (!byu.a(message)) {
            return message.substring(Math.max(0, message.length() - 2000));
        }
        String simpleName = th.getClass().getSimpleName();
        if (byu.b(simpleName)) {
            return simpleName;
        }
        return "empty_message";
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fed0ab8", new Object[0]);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return "empty_stack";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\nat " + stackTraceElement);
        }
        if (byu.a(sb.toString())) {
            return "empty_message";
        }
        return sb.substring(0, Math.min(2000, sb.length()));
    }
}
