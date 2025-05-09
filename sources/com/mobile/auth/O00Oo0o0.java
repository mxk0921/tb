package com.mobile.auth;

import android.util.Base64;
import com.taobao.accs.common.Constants;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00Oo0o0 extends O00OoO0o {
    private O00Oo00 O000000o;
    private byte[] O00000Oo;
    private byte[] O00000o;
    private String O00000o0;
    private String O00000oO;
    private boolean O00000oo = false;

    @Override // com.mobile.auth.O00OoO0o
    public String O000000o() {
        return this.O000000o.O000000o();
    }

    @Override // com.mobile.auth.O00OoO0o
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        if (this.O00000oo) {
            try {
                jSONObject.put(AgooConstants.MESSAGE_ENCRYPTED, this.O00000o0);
                jSONObject.put("encryptedIV", Base64.encodeToString(this.O00000o, 0));
                jSONObject.put(Constants.KEY_SEND_REQDATA, O0O00o.O000000o(this.O00000Oo, this.O000000o.O00000Oo().toString(), this.O00000o));
                jSONObject.put("securityreinforce", this.O00000oO);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public O00Oo00 O00000o0() {
        return this.O000000o;
    }

    @Override // com.mobile.auth.O00OoO0o
    public String a_(String str) {
        return null;
    }

    public void O000000o(O00Oo00 o00Oo00) {
        this.O000000o = o00Oo00;
    }

    public void O00000Oo(String str) {
        this.O00000oO = str;
    }

    public void O00000o0(String str) {
        this.O00000o0 = str;
    }

    public void O000000o(boolean z) {
        this.O00000oo = z;
    }

    public void O00000Oo(byte[] bArr) {
        this.O00000o = bArr;
    }

    public void O000000o(byte[] bArr) {
        this.O00000Oo = bArr;
    }
}
