package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.O000000o;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.o1;
import tb.p1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class OO0O0O<T extends o1> implements p1<T> {
    protected O000000o O000000o;

    public void O000000o(O000000o o000000o) {
        try {
            this.O000000o = o000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public abstract boolean O000000o(String str);

    @Override // tb.p1
    public boolean upload(List<T> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (T t : list) {
                String a2 = t.a();
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        jSONArray.put(new JSONObject(a2));
                    } catch (Exception e) {
                        O0000Oo0.O000000o(e);
                    }
                }
            }
            return O000000o(jSONArray.toString());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
