package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLEAR_CACHE = "_clear_cache";

    static {
        t2o.a(839909961);
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f39041e6", new Object[]{uri});
        }
        if (uri != null && uri.isHierarchical()) {
            return uri.getQueryParameter("_ariver_appid");
        }
        return null;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7584e528", new Object[0]);
        }
        return "trvNative://authorize/settings";
    }

    public static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c269dc42", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return !TextUtils.isEmpty(a(uri));
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91fa5ef6", new Object[]{uri})).booleanValue();
        }
        if (uri == null || !uri.isHierarchical() || !TextUtils.equals(uri.getQueryParameter("_afc_link"), "1")) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        Uri g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7989b6c7", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Exception e) {
            TMSLogger.c("TMSUrlUtils", "isAboutPage error", e);
        }
        if (TextUtils.isEmpty(str) || (g = ies.g(str)) == null) {
            return false;
        }
        if (q9s.V2().contains(g.buildUpon().clearQuery().build().toString())) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a1a376", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(b()) || TextUtils.equals(b(), ies.b(str))) {
            return true;
        }
        return false;
    }

    public static boolean h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9567e705", new Object[]{uri})).booleanValue();
        }
        return "true".equals(uri.getQueryParameter(KEY_CLEAR_CACHE));
    }

    public static boolean j(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8847b945", new Object[]{uri})).booleanValue();
        }
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        return TextUtils.equals("true", uri.getQueryParameter("isThemis"));
    }

    public static Uri c(ITMSPage iTMSPage, bbs bbsVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("42b1ad7b", new Object[]{iTMSPage, bbsVar, str, jSONObject});
        }
        String str2 = "";
        Uri.Builder path = ies.g(bbsVar.e0()).buildUpon().authority("m.duanqu.com").path(str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("_ariver_appid", (Object) bbsVar.L());
        jSONObject2.put("_ariver_ua", (Object) r8s.f(bbsVar));
        if (!TextUtils.isEmpty(str)) {
            jSONObject2.put("page", (Object) str);
        }
        Uri build = path.build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : build.getQueryParameterNames()) {
            if ("spm".equalsIgnoreCase(str3)) {
                linkedHashMap.put(str3, "a21bpk.21128592.0.0");
            } else {
                linkedHashMap.put(str3, build.getQueryParameter(str3));
            }
        }
        for (String str4 : jSONObject2.keySet()) {
            linkedHashMap.put(str4, jSONObject2.getString(str4));
        }
        if (jSONObject != null) {
            for (String str5 : jSONObject.keySet()) {
                linkedHashMap.put(str5, jSONObject.getString(str5));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(Uri.encode((String) entry.getValue()));
            sb.append("&");
        }
        Uri.Builder buildUpon = build.buildUpon();
        if (sb.length() > 0) {
            str2 = sb.substring(0, sb.length() - 1);
        }
        return buildUpon.encodedQuery(str2).build();
    }

    public static boolean i(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0dd1230", new Object[]{context, uri})).booleanValue();
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setPackage(context.getPackageName());
        intent.setAction("android.intent.action.VIEW");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            TMSLogger.f("isNav2H5", "isNav2H5 : false");
            return false;
        } else if ("com.taobao.browser.BrowserActivity".contains(resolveActivity.activityInfo.name)) {
            TMSLogger.f("isNav2H5", "isNav2H5 : true");
            return true;
        } else {
            TMSLogger.f("isNav2H5", "isNav2H5 : false");
            return false;
        }
    }
}
