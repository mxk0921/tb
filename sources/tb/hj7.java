package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571201);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dec1cc44", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()).trim();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ec1aa3a", new Object[0])).intValue();
        }
        String a2 = ino.a("app_launch_count", "");
        int i = 1;
        if (TextUtils.isEmpty(a2)) {
            jgh.a("DeviceUtil", " getLaunchCountNum appLaunchCountJSONObjStr is empty");
            return 1;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            String a3 = a();
            if (!parseObject.containsKey(a3)) {
                return 1;
            }
            i = parseObject.getIntValue(a3);
            jgh.a("DeviceUtil", " getLaunchCountNum success  launchCountResult : " + i);
            return i;
        } catch (Throwable th) {
            jgh.a("DeviceUtil", " launchCountNum error" + th.toString());
            return i;
        }
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("307630f3", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            jgh.a("DeviceUtil", "launchCnt isCrossOneDay: spStorageStrVal is null");
            return true;
        }
        try {
            boolean z = !JSON.parseObject(str).containsKey(str2);
            jgh.a("DeviceUtil", " launchCnt isCrossOneDay: isCrossOneDay :" + z);
            return z;
        } catch (Throwable th) {
            jgh.a("DeviceUtil", " isCrossOneDay check error" + th.toString());
            return true;
        }
    }

    public static void d(boolean z) {
        int i = 0;
        i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c3082b", new Object[]{new Boolean(z)});
            return;
        }
        String a2 = ino.a("app_launch_count", "");
        String a3 = a();
        if (c(a2, a3)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(a3, (Object) 1);
            ino.b("app_launch_count", jSONObject.toString());
            jgh.a("DeviceUtil", " launchCnt updateAppLaunchCountTimes init " + jSONObject.toString());
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(a2);
                i = parseObject.getIntValue(a3) + 1;
                parseObject.put(a3, (Object) Integer.valueOf(i));
                ino.b("app_launch_count", parseObject.toString());
                jgh.a("DeviceUtil", " launchCnt updateAppLaunchCountTimes success withOneDay save data : " + parseObject.toString());
            } catch (Throwable th) {
                jgh.a("DeviceUtil", " updateAppLaunchCountTimes error" + th);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", String.valueOf(i));
        hashMap.put("launchCnt_isColdStart", String.valueOf(z));
        i4v.p(i4v.S_UT_PAGE, 2101, "app_launch_count", "", "", hashMap);
    }
}
