package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f16987a = new HashSet();

    static {
        t2o.a(729809850);
    }

    public static void a(JSONObject jSONObject, f fVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2567b2", new Object[]{jSONObject, fVar});
        } else if (e(jSONObject)) {
            TLog.loge("AdMonitorHelper", "lunbo card rend error.");
            StringBuilder sb = new StringBuilder("lunbo card rend error. ");
            if (fVar == null) {
                str = "null";
            } else {
                str = fVar.toString();
            }
            sb.append(str);
            c(jSONObject, "DxErrorMonitor", "DxErrorMonitor", sb.toString());
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5849924", new Object[]{jSONObject, str});
        } else if (e(jSONObject)) {
            TLog.loge("AdMonitorHelper", "this target url are not nav to right page. url is " + str);
            c(jSONObject, "errorTargetUrl", "errorTargetUrl", "this target url are not nav to right page. url is " + str);
        }
    }

    public static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e933559", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("brandAd"), "1") && TextUtils.isEmpty(jSONObject2.getString("ifs"))) {
            TLog.loge("AdMonitorHelper", "brandAd card do not contain ifs url.");
            c(jSONObject, "BizBrandAd", "BrandAdNoIfs", "");
        } else if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("ifs")) && !TextUtils.equals(jSONObject2.getString("brandAd"), "1")) {
            TLog.loge("AdMonitorHelper", "ifs card is not brandAd");
            c(jSONObject, "BizBrandAd", "IfsNotBrandAdV2", "");
        }
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b3398", new Object[]{jSONObject});
        } else if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("monitorCard"))) {
            HashSet hashSet = new HashSet(1);
            hashSet.add("home_0_guess_0");
            f16987a = hashSet;
        } else {
            f16987a = new HashSet(Arrays.asList(jSONObject.getString("monitorCard").split(",")));
        }
    }

    public static void c(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49760bc6", new Object[]{jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("section", jSONObject.toJSONString());
        ddv.b("AdMonitorHelper", str, "1.0", str2, hashMap, str2, str3);
    }

    public static boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ed37f33", new Object[]{jSONObject})).booleanValue();
        }
        return jSONObject != null && f16987a.contains(jSONObject.getString("sectionBizCode")) && jSONObject.getJSONObject("ext") != null && jSONObject.getJSONObject("ext").getBooleanValue("isBannerCard");
    }
}
