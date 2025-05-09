package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000Oo0 {
    private static final String O000000o = "O000Oo0";

    public static String O000000o(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", i);
            jSONObject.put("msg", str);
            return jSONObject.toString();
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "Json parse error", th);
                return "";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }
}
