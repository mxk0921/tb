package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class auf extends fek {
    public auf(String str, Locale locale) {
        super(str, locale);
    }

    public Object L(long j, int i) {
        Timestamp timestamp = new Timestamp(j);
        if (i != 0) {
            timestamp.setNanos(i);
        }
        return timestamp;
    }

    @Override // tb.fek, tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        vcf vcfVar;
        if (jSONReader.h1()) {
            long r2 = jSONReader.r2();
            if (this.b) {
                r2 *= 1000;
            }
            return L(r2, 0);
        } else if (jSONReader.D1()) {
            return null;
        } else {
            if (this.f26308a == null || this.d || this.c) {
                q7h x2 = jSONReader.x2();
                if (x2 != null) {
                    return x2.j();
                }
                if (jSONReader.o3()) {
                    return null;
                }
                long H2 = jSONReader.H2();
                if (H2 != 0 || !jSONReader.o3()) {
                    return new Timestamp(H2);
                }
                return null;
            }
            String Q2 = jSONReader.Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            DateTimeFormatter H = H();
            boolean z = this.f;
            JSONReader.c cVar = jSONReader.f2453a;
            if (!z) {
                vcfVar = xqx.c(q7h.f(H.h(Q2), x9h.MIN), cVar.m()).h();
            } else {
                vcfVar = DateUtils.D(Q2, 0, Q2.length()).i(cVar.m());
            }
            return L(vcfVar.g(), vcfVar.b);
        }
    }

    @Override // tb.fek, tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.h1()) {
            long r2 = jSONReader.r2();
            if (this.b) {
                r2 *= 1000;
            }
            return L(r2, 0);
        } else if (jSONReader.n2()) {
            return null;
        } else {
            return o(jSONReader, type, obj, j);
        }
    }
}
