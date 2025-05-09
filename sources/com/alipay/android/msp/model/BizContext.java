package com.alipay.android.msp.model;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AND_LITE = "ty";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_PACKAGE_VERSION = "av";
    public static final String KEY_START_TIME = "sdk_start_time";
    public static final String PAIR_AND = "&";
    public static final String PAIR_BIZCONTEXT = "bizcontext=\"";
    public static final String PAIR_BIZCONTEXT_ENCODED = "bizcontext=";
    public static final String PAIR_CONNECTION = "\"&";
    public static final String PAIR_QUOTATION_MARK = "\"";

    /* renamed from: a  reason: collision with root package name */
    public final String f3697a;

    public BizContext(Context context) {
        this.f3697a = "";
        try {
            this.f3697a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            context.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df24bdc6", new Object[]{this, str});
        }
        try {
            String c = c(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(c)) {
                str = str + "&" + e("bizcontext=", "");
            } else {
                int indexOf = str.indexOf(c);
                str = str.substring(0, indexOf) + d(c, "bizcontext=", "") + str.substring(indexOf + c.length());
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3642aea5", new Object[]{this, str});
        }
        try {
            String c = c(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(c)) {
                return str + "&" + e("bizcontext=\"", "\"");
            }
            if (!c.endsWith("\"")) {
                c = c.concat("\"");
            }
            int indexOf = str.indexOf(c);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + c.length());
            return substring + d(c, "bizcontext=\"", "\"") + substring2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public String buildSimpleBizContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d74469", new Object[]{this, str, str2});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("av", this.f3697a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public final String e(String str, String str2) throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3478cf9", new Object[]{this, str, str2});
        }
        String buildSimpleBizContext = buildSimpleBizContext("", "");
        return str + buildSimpleBizContext + str2;
    }

    public String format(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (!str.contains("\"&")) {
            return a(str);
        }
        return b(str);
    }

    public final String d(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{this, str, str2, str3});
        }
        String substring = str.substring(str2.length());
        JSONObject jSONObject = new JSONObject(substring.substring(0, substring.length() - str3.length()));
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "sdk_and");
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.f3697a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        String jSONObject2 = jSONObject.toString();
        return str2 + jSONObject2 + str3;
    }
}
