package com.mobile.auth;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00Oo extends O00OoO0o {
    private O00000Oo O000000o;
    private O000000o O00000Oo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class O000000o {
        private JSONObject O000000o;

        public JSONObject O000000o() {
            return this.O000000o;
        }

        public void O000000o(JSONObject jSONObject) {
            this.O000000o = jSONObject;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class O00000Oo extends O00OoO0o {
        private String O000000o;
        private String O00000Oo;
        private String O00000o;
        private String O00000o0;
        private String O00000oO;

        @Override // com.mobile.auth.O00OoO0o
        public String O000000o() {
            return this.O00000o;
        }

        @Override // com.mobile.auth.O00OoO0o
        public JSONObject O00000Oo() {
            return null;
        }

        public String O00000o() {
            return this.O000000o;
        }

        public String O00000o0() {
            return this.O00000oO;
        }

        public String O00000oO() {
            return this.O00000Oo;
        }

        public String O00000oo() {
            return this.O00000o0;
        }

        @Override // com.mobile.auth.O00OoO0o
        public String a_(String str) {
            return this.O00000oO + this.O00000o + this.O00000o0 + this.O00000Oo + "@Fdiwmxy7CBDDQNUI";
        }

        public void O00000Oo(String str) {
            this.O00000oO = str;
        }

        public void O00000o(String str) {
            this.O000000o = str;
        }

        public void O00000o0(String str) {
            this.O00000o = str;
        }

        public void O00000oO(String str) {
            this.O00000Oo = str;
        }

        public void O00000oo(String str) {
            this.O00000o0 = str;
        }
    }

    @Override // com.mobile.auth.O00OoO0o
    public String O000000o() {
        return this.O000000o.O00000o;
    }

    @Override // com.mobile.auth.O00OoO0o
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("sign", this.O000000o.O00000o());
            jSONObject2.put("msgid", this.O000000o.O00000oO());
            jSONObject2.put("systemtime", this.O000000o.O00000oo());
            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.O000000o.O000000o());
            jSONObject2.put("version", this.O000000o.O00000o0());
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", this.O00000Oo.O000000o());
            jSONObject.put(AgooConstants.MESSAGE_BODY, jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.mobile.auth.O00OoO0o
    public String a_(String str) {
        return null;
    }

    public void O000000o(O000000o o000000o) {
        this.O00000Oo = o000000o;
    }

    public void O000000o(O00000Oo o00000Oo) {
        this.O000000o = o00000Oo;
    }
}
