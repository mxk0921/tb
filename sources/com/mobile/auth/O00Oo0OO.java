package com.mobile.auth;

import com.ali.user.open.ucc.util.UccConstants;
import com.alipay.android.msp.framework.db.MspDBHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00Oo0OO extends O00OoO0o {
    private final String O000000o;
    private final String O00000Oo;
    private String O00000o = "authz";
    private final String O00000o0;
    private String O00000oO;
    private String O00000oo;

    public O00Oo0OO(String str, String str2, String str3) {
        this.O000000o = str;
        this.O00000Oo = str2;
        this.O00000o0 = str3;
    }

    @Override // com.mobile.auth.O00OoO0o
    public String O000000o() {
        return this.O000000o;
    }

    @Override // com.mobile.auth.O00OoO0o
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, this.O00000Oo);
            jSONObject.put("operatortype", this.O00000oo);
            jSONObject.put("data", this.O00000o0);
            jSONObject.put("userCapaid", this.O00000oO);
            jSONObject.put(UccConstants.PARAM_FUNC_TYPE, this.O00000o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void O00000o(String str) {
        this.O00000oO = str;
    }

    public void O00000o0(String str) {
        this.O00000o = str;
    }

    @Override // com.mobile.auth.O00OoO0o
    public String a_(String str) {
        return null;
    }

    public void O00000Oo(String str) {
        this.O00000oo = str;
    }
}
