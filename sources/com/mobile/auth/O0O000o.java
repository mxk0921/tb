package com.mobile.auth;

import android.text.TextUtils;
import com.alibaba.security.realidentity.u2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.login4android.constants.LoginConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O000o extends O00OoO0o {
    private JSONArray O0000o0O;
    private String O0000ooo;
    private String O000O00o;
    private String O00oOooO;
    private String O00oOooo;
    private String O00000Oo = null;
    private String O00000o0 = null;
    private String O00000o = null;
    private String O00000oO = null;
    private String O00000oo = null;
    private String O0000O0o = null;
    private String O0000OOo = null;
    private String O0000Oo0 = null;
    private String O0000Oo = null;
    private String O0000OoO = "";
    private String O0000Ooo = null;
    private String O0000o00 = null;
    private String O0000o0 = null;
    private String O0000o0o = null;
    private String O0000o = null;
    private String O0000oO0 = null;
    private String O0000oO = null;
    private String O0000oOO = null;
    private String O0000oOo = null;
    private String O0000oo0 = null;
    private String O0000oo = null;
    private String O0000ooO = null;
    public CopyOnWriteArrayList<Throwable> O000000o = new CopyOnWriteArrayList<>();

    @Override // com.mobile.auth.O00OoO0o
    public String O000000o() {
        return null;
    }

    @Override // com.mobile.auth.O00OoO0o
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.O00000Oo);
            jSONObject.put("traceId", this.O00000o0);
            jSONObject.put("appName", this.O00000o);
            jSONObject.put("appVersion", this.O00000oO);
            jSONObject.put("sdkVersion", BuildConfig.CMCC_SDK_VERSION);
            jSONObject.put(u2.q, "android");
            jSONObject.put("timeOut", this.O00000oo);
            jSONObject.put("requestTime", this.O0000O0o);
            jSONObject.put("responseTime", this.O0000OOo);
            jSONObject.put("elapsedTime", this.O0000Oo0);
            jSONObject.put("requestType", this.O0000Oo);
            jSONObject.put("interfaceType", this.O0000OoO);
            jSONObject.put("interfaceCode", this.O0000Ooo);
            jSONObject.put("interfaceElasped", this.O0000o00);
            jSONObject.put(LoginConstants.LOGIN_TYPE, this.O0000o0);
            jSONObject.put("exceptionStackTrace", this.O0000o0O);
            jSONObject.put("operatorType", this.O0000o0o);
            jSONObject.put("networkOperator", this.O0000o);
            jSONObject.put("networkType", this.O0000oO0);
            jSONObject.put("brand", this.O0000oO);
            jSONObject.put("reqDevice", this.O0000oOO);
            jSONObject.put("reqSystem", this.O0000oOo);
            jSONObject.put("simCardNum", this.O0000oo0);
            jSONObject.put("imsiState", this.O0000oo);
            jSONObject.put("resultCode", this.O0000ooO);
            jSONObject.put("AID", this.O0000ooo);
            jSONObject.put("sysOperType", this.O00oOooO);
            jSONObject.put("scripType", this.O00oOooo);
            if (!TextUtils.isEmpty(this.O000O00o)) {
                jSONObject.put("networkTypeByAPI", this.O000O00o);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void O00000o(String str) {
        this.O0000ooO = str;
    }

    public void O00000o0(String str) {
        this.O0000oo = str;
    }

    public void O00000oO(String str) {
        this.O0000oO = str;
    }

    public void O00000oo(String str) {
        this.O0000o00 = str;
    }

    public void O0000O0o(String str) {
        this.O0000Ooo = str;
    }

    public void O0000OOo(String str) {
        this.O0000OoO = str;
    }

    public void O0000Oo(String str) {
        this.O00000oO = str;
    }

    public void O0000Oo0(String str) {
        this.O00000o = str;
    }

    public void O0000OoO(String str) {
        this.O00000oo = str;
    }

    public void O0000Ooo(String str) {
        this.O0000Oo0 = str;
    }

    public void O0000o(String str) {
        this.O0000o0 = str;
    }

    public void O0000o0(String str) {
        this.O0000o0o = str;
    }

    public void O0000o00(String str) {
        this.O0000oo0 = str;
    }

    public void O0000o0O(String str) {
        this.O0000oOO = str;
    }

    public void O0000o0o(String str) {
        this.O0000oOo = str;
    }

    public void O0000oO(String str) {
        this.O0000O0o = str;
    }

    public void O0000oO0(String str) {
        this.O00000o0 = str;
    }

    public void O0000oOO(String str) {
        this.O0000OOo = str;
    }

    public void O0000oOo(String str) {
        this.O0000Oo = str;
    }

    public void O0000oo0(String str) {
        this.O0000oO0 = str;
    }

    public void O0000ooO(String str) {
        this.O0000ooo = str;
    }

    public void O0000ooo(String str) {
        this.O00oOooO = str;
    }

    public void O00oOooO(String str) {
        this.O00oOooo = str;
    }

    public void O00oOooo(String str) {
        this.O000O00o = str;
    }

    @Override // com.mobile.auth.O00OoO0o
    public String a_(String str) {
        return null;
    }

    public void O000000o(JSONArray jSONArray) {
        this.O0000o0O = jSONArray;
    }

    public void O00000Oo(String str) {
        this.O00000Oo = str;
    }
}
