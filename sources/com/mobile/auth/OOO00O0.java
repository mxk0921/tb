package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONObject;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOO00O0 {
    public OO0OOo0 O000000o = null;

    public final void O000000o(int i, int i2, String str, String str2, String str3) {
        try {
            OOO.O00000o0("typeTokenUaid=".concat(String.valueOf(i)));
            try {
                if (this.O000000o != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", i2);
                    jSONObject.put("resultMsg", str);
                    jSONObject.put("resultData", str2);
                    jSONObject.put(y1r.COL_SEQ, str3);
                    this.O000000o.onResult(jSONObject.toString());
                    this.O000000o = null;
                }
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
