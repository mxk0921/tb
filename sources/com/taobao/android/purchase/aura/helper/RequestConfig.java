package com.taobao.android.purchase.aura.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.media.MediaConstant;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a8r;
import tb.c0c;
import tb.ct0;
import tb.h9r;
import tb.izl;
import tb.kjf;
import tb.o78;
import tb.s8r;
import tb.t2o;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ANCHOR_ID = "anchorId";
    public static final String KEY_LIVE_ID = "liveId";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, String>> f9222a = new HashMap();

    static {
        t2o.a(708837514);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
        } else {
            ((HashMap) f9222a).clear();
        }
    }

    public static JSONObject b() {
        String globalProperty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5311d2ea", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(globalProperty)) {
            return jSONObject;
        }
        String[] split = globalProperty.split(c0c.UNESCAPED_SEPARATOR);
        if (split.length < 4) {
            return jSONObject;
        }
        String str = split[2];
        if (str.length() > 50) {
            return jSONObject;
        }
        jSONObject.put("bcflsrc", (Object) str);
        return jSONObject;
    }

    public static JSONObject c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("33a2e192", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject;
        }
        JSONObject c = h9r.c(context);
        if (c != null && !c.isEmpty()) {
            jSONObject.put("alipayCashierParams", (Object) c.toJSONString());
        }
        return jSONObject;
    }

    public static Map<String, String> d(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9cb01a09", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        try {
            PositionInfo i = o78.i(context);
            if (i != null) {
                str = i.countryCode;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("countryCode", str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static Map<String, String> e(Context context) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84afa1fa", new Object[]{context});
        }
        HashMap hashMap = (HashMap) f9222a;
        if (!hashMap.isEmpty() && (map = (Map) hashMap.get("cacheParams")) != null) {
            return map;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(l(context));
        hashMap2.putAll(j(context));
        hashMap.put("cacheParams", hashMap2);
        return hashMap2;
    }

    public static HashMap<String, String> f(Intent intent, List<String> list) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("18634022", new Object[]{intent, list});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(intent.getData() == null || (parseObject = JSON.parseObject(intent.getData().getQueryParameter("exParams"))) == null)) {
            for (String str : list) {
                String string = parseObject.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("14eebb42", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            boolean a2 = kjf.a();
            if (a2) {
                if (a2) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("inner", str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5fdfc0d", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeProtocolFeatures", "5");
        hashMap.put("tradeTemplates", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        return hashMap;
    }

    public static JSONObject i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a88bab08", new Object[]{context});
        }
        return new JSONObject(ct0.b(context, false)) { // from class: com.taobao.android.purchase.aura.helper.RequestConfig.1
            public final /* synthetic */ String val$resultAppList;

            {
                this.val$resultAppList = r2;
                if (!TextUtils.isEmpty(r2)) {
                    put("installApp", (Object) r2);
                }
            }
        };
    }

    public static Map<String, String> j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba36c693", new Object[]{context});
        }
        return k(context, null);
    }

    public static Map<String, String> k(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3323887", new Object[]{context, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str = APSecuritySdk.getInstance(context.getApplicationContext()).getTokenResult().apdidToken;
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put(upx.APDIDTOKEN, (Object) str);
            }
        } catch (Exception unused) {
            UnifyLog.e("RequestUtil", "addExtraParams", "APSecuritySdk 获取参数报错");
        }
        if (izl.b(context)) {
            jSONObject2.put("lbsInfo", (Object) s8r.b());
        }
        jSONObject2.putAll(m());
        jSONObject2.putAll(h());
        jSONObject2.putAll(g());
        jSONObject2.putAll(c(context));
        jSONObject2.putAll(b());
        jSONObject2.putAll(i(context));
        jSONObject2.put("isLargeScreen", (Object) Boolean.toString(a8r.b(context)));
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (AliBuyPerfSwitcher.enableBudgetCache()) {
            jSONObject2.put("enableBudgetCache", (Object) Boolean.FALSE);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("exParams", jSONObject2.toJSONString());
        return hashMap;
    }

    public static Map<String, String> l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e24346c", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(d(context));
        return hashMap;
    }

    public static Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e8cb944", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coupon", "true");
        hashMap.put("coVersion", "2.0");
        return hashMap;
    }
}
