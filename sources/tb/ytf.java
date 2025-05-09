package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import java.lang.reflect.Type;
import java.sql.Time;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ytf extends fek {
    public ytf(String str, Locale locale) {
        super(str, locale);
    }

    @Override // tb.fek, tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        xqx xqxVar;
        q7h q7hVar;
        boolean h1 = jSONReader.h1();
        boolean z = this.b;
        if (h1) {
            long r2 = jSONReader.r2();
            if (z) {
                r2 *= 1000;
            }
            return new Time(r2);
        } else if (jSONReader.n2()) {
            return null;
        } else {
            if (this.d || this.c) {
                return new Time(jSONReader.H2());
            }
            if (z) {
                return new Time(jSONReader.q2().longValue() * 1000);
            }
            if (this.f26308a != null) {
                jSONReader.O0();
                DateTimeFormatter I = I(null);
                if (I != null) {
                    String Q2 = jSONReader.Q2();
                    if (Q2.isEmpty()) {
                        return null;
                    }
                    if (!this.f) {
                        q7hVar = q7h.f(I.h(Q2), x9h.MIN);
                    } else if (!this.e) {
                        q7hVar = q7h.f(p7h.e(1970, 1, 1), I.j(Q2));
                    } else {
                        q7hVar = I.i(Q2);
                    }
                    xqxVar = xqx.c(q7hVar, jSONReader.f2453a.m());
                } else {
                    xqxVar = jSONReader.W2();
                }
                return new Time(xqxVar.h().g());
            }
            String Q22 = jSONReader.Q2();
            if ("0000-00-00".equals(Q22) || "0000-00-00 00:00:00".equals(Q22)) {
                return new Time(0L);
            }
            if (Q22.isEmpty() || "null".equals(Q22)) {
                return null;
            }
            return Time.valueOf(Q22);
        }
    }

    @Override // tb.fek, tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return o(jSONReader, type, obj, j);
    }
}
