package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Currency;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class eek extends xgk {
    public static final eek b = new eek();
    public static final long c = ls9.a("Currency");

    public eek() {
        super(Currency.class);
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        String str;
        if (jSONReader.j1()) {
            JSONObject jSONObject = new JSONObject();
            jSONReader.O2(jSONObject, new JSONReader.Feature[0]);
            str = jSONObject.getString("currency");
            if (str == null) {
                str = jSONObject.getString("currencyCode");
            }
        } else {
            str = jSONReader.Q2();
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return Currency.getInstance(str);
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.W0() == -110) {
            jSONReader.t1();
            long T2 = jSONReader.T2();
            if (!(T2 == c || T2 == -7860540621745740270L)) {
                throw new JSONException(jSONReader.a1("currency not support input autoTypeClass " + jSONReader.U0()));
            }
        }
        String Q2 = jSONReader.Q2();
        if (Q2 == null || Q2.isEmpty()) {
            return null;
        }
        return Currency.getInstance(Q2);
    }
}
