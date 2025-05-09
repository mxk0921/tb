package com.taobao.tmcs.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.pay.PayTask;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import tb.c0c;
import tb.o78;
import tb.r8r;
import tb.upx;
import tb.xp3;
import tb.z7r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TmcsOrderParamsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_MODULE = "TmcsOrderParamsHelper";

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f13832a;

    public static JSONObject a() {
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

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc5770c6", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) "0.1.0");
        jSONObject.put("features", (Object) new JSONObject());
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
        if (f13832a == null) {
            try {
                f13832a = PayTask.getPreposeCashierRequestParams(null, context);
            } catch (Exception unused) {
            }
        }
        JSONObject jSONObject2 = f13832a;
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            jSONObject.put("alipayCashierParams", (Object) f13832a.toJSONString());
        }
        return jSONObject;
    }

    public static String d(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd0aec4c", new Object[]{context});
        }
        try {
            PositionInfo i = o78.i(context);
            if (i != null) {
                str = i.countryCode;
            } else {
                str = "";
            }
        } catch (Throwable th) {
            TLog.logi(TLOG_MODULE, TLOG_MODULE, "获取countryCode失败: " + th.getMessage());
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public static JSONObject e(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14332112", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            str = context.getResources().getConfiguration().locale.toString();
        } catch (Exception e) {
            TLog.logi(TLOG_MODULE, TLOG_MODULE, "获取locale 参数报错: " + e.getMessage());
            str = "zh_CN";
        }
        jSONObject.put("websiteLanguage", (Object) str);
        jSONObject.put("lbsInfo", (Object) r8r.b());
        jSONObject.putAll(f(context));
        jSONObject.put("isLargeScreen", (Object) Boolean.toString(z7r.a(context)));
        jSONObject.put("umfVersions", (Object) b());
        jSONObject.put("tradeProtocolFeatures", (Object) "5");
        jSONObject.put("coupon", (Object) "true");
        jSONObject.put("coVersion", (Object) "2.0");
        jSONObject.putAll(a());
        try {
            String str2 = APSecuritySdk.getInstance(context.getApplicationContext()).getTokenResult().apdidToken;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(upx.APDIDTOKEN, (Object) str2);
            }
        } catch (Exception e2) {
            TLog.logi(TLOG_MODULE, TLOG_MODULE, "APSecuritySdk 获取参数报错: " + e2.getMessage());
        }
        jSONObject.putAll(c(context));
        return jSONObject;
    }

    public static JSONObject f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a88bab08", new Object[]{context});
        }
        return new JSONObject(xp3.f(context, false)) { // from class: com.taobao.tmcs.utils.TmcsOrderParamsHelper.1
            public final /* synthetic */ String val$resultAppList;

            {
                this.val$resultAppList = r2;
                if (!TextUtils.isEmpty(r2)) {
                    put("installApp", (Object) r2);
                }
            }
        };
    }
}
