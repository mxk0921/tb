package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.og8;
import tb.pg1;
import tb.t2o;
import tb.v7t;
import tb.zpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVCookie extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVCookie";

    static {
        t2o.a(989856274);
    }

    public static /* synthetic */ Object ipc$super(WVCookie wVCookie, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVCookie");
    }

    public void readCookies(WVCallBackContext wVCallBackContext, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899ffe7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                v7t.d(TAG, "readCookies: param decode error, param=" + str);
            }
            try {
                string = new JSONObject(str).getString("url");
            } catch (JSONException unused2) {
                v7t.d(TAG, "readCookies: param parse to JSON error, param=" + str);
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            string = null;
        }
        String a2 = zpw.a(string);
        if (a2 == null) {
            v7t.n(TAG, "readCookies: cookieStr is null");
            a2 = "";
        }
        String replace = a2.replace("\"", "\\\\\"");
        replace.split(";");
        nswVar.b("value", replace);
        wVCallBackContext.success(nswVar);
    }

    public void write(WVCallBackContext wVCallBackContext, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe30fc2d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                v7t.d(TAG, "writeCookies: param decode error, param=" + str);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string2 = jSONObject.getString(next);
                    sb.append(next);
                    sb.append("=");
                    sb.append(string2);
                    if (keys.hasNext()) {
                        sb.append("; ");
                    }
                }
                string = jSONObject.getString("domain");
            } catch (JSONException unused2) {
                v7t.d(TAG, "writeCookies: param parse to JSON error, param=" + str);
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            string = null;
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || TextUtils.isEmpty(string)) {
            if (v7t.h()) {
                v7t.n(TAG, "writeCookies: Illegal param: cookieStr=" + sb2 + ";domain=" + string);
            }
            wVCallBackContext.error(nswVar);
            return;
        }
        zpw.c(string, sb2);
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("readCookies".equals(str)) {
            readCookies(wVCallBackContext, str2);
        } else if ("writeCookies".equals(str)) {
            writeCookies(wVCallBackContext, str2);
        } else if ("read".equals(str)) {
            read(wVCallBackContext, str2);
        } else if (!"write".equals(str)) {
            return false;
        } else {
            write(wVCallBackContext, str2);
        }
        return true;
    }

    public void read(WVCallBackContext wVCallBackContext, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f4d24", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                v7t.d(TAG, "readCookies: param decode error, param=" + str);
            }
            try {
                string = new JSONObject(str).getString("url");
            } catch (JSONException unused2) {
                v7t.d(TAG, "readCookies: param parse to JSON error, param=" + str);
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            string = null;
        }
        String a2 = zpw.a(string);
        if (a2 == null) {
            v7t.n(TAG, "readCookies: cookieStr is null");
            a2 = "";
        }
        String[] split = a2.replace("\"", "\\\\\"").split(";");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : split) {
            String[] split2 = str2.split("=");
            if (split2 != null && split2.length > 1) {
                try {
                    jSONObject2.put(split2[0].trim(), split2[1].trim());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            if (!og8.b()) {
                jSONObject.put(pg1.ATOM_values, jSONObject2);
            }
            jSONObject.put("value", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nswVar.d("value", jSONObject);
        wVCallBackContext.success(nswVar);
    }

    public void writeCookies(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        String string;
        String str3 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237004be", new Object[]{this, wVCallBackContext, str3});
            return;
        }
        nsw nswVar = new nsw();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            try {
                str3 = URLDecoder.decode(str3, "utf-8");
            } catch (Exception unused) {
                v7t.d(TAG, "writeCookies: param decode error, param=" + str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                String string2 = jSONObject.getString("name");
                try {
                    str2 = URLEncoder.encode(jSONObject.getString("value"), "utf-8");
                } catch (UnsupportedEncodingException unused2) {
                    v7t.d(TAG, "writeCookies: URLEncoder.encode error: value=" + str2);
                }
                string = jSONObject.getString("domain");
                String optString = jSONObject.optString("expires");
                String optString2 = jSONObject.optString("path");
                String optString3 = jSONObject.optString("secure");
                sb.append(string2);
                sb.append("=");
                sb.append(str2);
                sb.append("; Domain=");
                sb.append(string);
                if (!TextUtils.isEmpty(optString2)) {
                    sb.append("; Path=");
                    sb.append(optString2);
                }
                if (!TextUtils.isEmpty(optString)) {
                    sb.append("; Expires=");
                    sb.append(optString);
                }
                if (!TextUtils.isEmpty(optString3)) {
                    sb.append("; Secure");
                }
            } catch (JSONException unused3) {
                v7t.d(TAG, "writeCookies: param parse to JSON error, param=" + str3);
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            string = null;
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || TextUtils.isEmpty(string)) {
            if (v7t.h()) {
                v7t.n(TAG, "writeCookies: Illegal param: cookieStr=" + sb2 + ";domain=" + string);
            }
            wVCallBackContext.error(nswVar);
            return;
        }
        zpw.c(string, sb2);
        wVCallBackContext.success(nswVar);
    }
}
