package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.request.callback.CompatibleRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.tao.util.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262775);
    }

    public static void b(Context context, String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c609ed", new Object[]{context, str, str2, map});
        } else if (!TextUtils.isEmpty(str2)) {
            if (map != null) {
                jov.a(str2, map);
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MYBROWSERURL, str2);
            bundle.putString("ItemIdForceH5", str);
            jov.j(context, bundle, str2);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    public static String c(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c5374c2", new Object[]{context, jSONObject, str});
        }
        String str2 = null;
        if (!f(jSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject(DnsPreference.KEY_TRADE);
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString(com.ut.share.utils.Constants.WEIBO_REDIRECTURL_KEY);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return vbl.P0() + str;
    }

    public static void d(MainRequestParams mainRequestParams, owc owcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ea4b9c", new Object[]{mainRequestParams, owcVar});
        } else {
            e(mainRequestParams, owcVar, "0");
        }
    }

    public static void e(MainRequestParams mainRequestParams, owc owcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a64666", new Object[]{mainRequestParams, owcVar, str});
        } else if (mainRequestParams != null && owcVar != null) {
            new g94(mainRequestParams).q(new CompatibleRequestCallback(mainRequestParams, owcVar)).c();
            i(mainRequestParams.getItemId(), str);
        }
    }

    public static boolean f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad24f2e5", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject("feature")) == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject3.getString("degradeToBaseDetail"));
    }

    public static boolean g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1390c0dc", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject("feature")) == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject3.getString("degradeToErrorPage"));
    }

    public static void h(String str, String str2, String str3, Uri uri, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af264e8d", new Object[]{str, str2, str3, uri, str4, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.ut.share.utils.Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        if (uri != null) {
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri.toString());
        }
        hashMap.put("reason", !TextUtils.isEmpty(str4) ? str4 : "no reason");
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        tgh.b("DetailDowngradeUtils", "-100030 for reason: " + str4 + " : 端侧异常跳转到兜底URL");
        bw7.b(hashMap, -100030, "端侧异常跳转到兜底URL");
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2a2356", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        bw7.b(hashMap, -300010, "主接口请求降级getDetail");
    }

    public static void j(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f7f4e7", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.ut.share.utils.Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        hashMap.put("sellerId", str4);
        tgh.b("DetailDowngradeUtils", "-100017degradeToBaseDetail跳转到重定向url");
        bw7.b(hashMap, -100017, "degradeToBaseDetail跳转到重定向url");
    }

    public static void k(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c9eafa", new Object[]{str, str2, new Boolean(z), str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(jk.KEY_RET_CODE, str);
        hashMap.put(jk.KEY_RET_MSG, str2);
        hashMap.put("itemId", str3);
        hashMap.put("fromServerDegrade", String.valueOf(z));
        hashMap.put("traceId", str4);
        bw7.b(hashMap, -100016, "新详情架构显示错误页");
    }

    public static void l(String str, String str2, String str3, Uri uri, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940dc000", new Object[]{str, str2, str3, uri, new Boolean(z), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.ut.share.utils.Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        if (uri != null) {
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri.toString());
        }
        hashMap.put("isFliggyData", String.valueOf(z));
        hashMap.put("sellerId", str4);
        tgh.b("DetailDowngradeUtils", "-100025跳转到兜底url");
        bw7.b(hashMap, -100025, "跳转到兜底url");
    }

    public static void m(String str, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6e0a68", new Object[]{str, new Boolean(z), str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.ut.share.utils.Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("fromServerDegrade", String.valueOf(z));
        hashMap.put("traceId", str3);
        hashMap.put("sellerId", str4);
        tgh.b("DetailDowngradeUtils", "-100018跳转到重定向url");
        bw7.b(hashMap, -100018, "跳转到重定向url");
    }

    public static void n(int i, String str, String str2, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182b669e", new Object[]{new Integer(i), str, str2, uri, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        if (uri != null) {
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri.toString());
        }
        hashMap.put("isFliggyData", String.valueOf(z));
        bw7.b(hashMap, i, "返回数据类型监控");
    }

    public static void o(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945ae525", new Object[]{new Boolean(z), str});
        } else {
            p(z, str, "0");
        }
    }

    public static void p(boolean z, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b0efaf", new Object[]{new Boolean(z), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        int i = z ? -300005 : -300011;
        if (z) {
            str3 = "getdetail降级请求返回数据为空";
        } else {
            str3 = "data.get单响应请求返回数据为空";
        }
        bw7.b(hashMap, i, str3);
    }

    public static void q(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da6760a", new Object[]{new Boolean(z), str});
        } else {
            r(z, str, "0");
        }
    }

    public static void r(boolean z, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a1f154", new Object[]{new Boolean(z), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        int i = z ? -300006 : -300012;
        if (z) {
            str3 = "getdetail降级请求失败";
        } else {
            str3 = "data.get单响应请求回调失败";
        }
        bw7.b(hashMap, i, str3);
    }

    public static void a(Context context, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ab4235", new Object[]{context, uri, str});
            return;
        }
        try {
            tgh.b("DetailDowngradeUtils", "downgrade to DetailActivity");
            Activity activity = (Activity) context;
            IpChange ipChange2 = DetailActivity.$ipChange;
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.setData(uri);
            intent.putExtra(TTDetailPageManager.DOWNGRADE_DATA_ID, str);
            activity.startActivity(intent);
            activity.finish();
            activity.overridePendingTransition(0, 0);
            tgh.b("DetailDowngradeUtils", "downgrade2DetailWrapper done");
        } catch (Throwable th) {
            tgh.c("DetailDowngradeUtils", "downgrade2DetailWrapper exception", th);
        }
    }
}
