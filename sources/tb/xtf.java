package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xtf extends fek {
    public xtf(String str, Locale locale) {
        super(str, locale);
    }

    @Override // tb.fek, tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        vcf vcfVar;
        boolean h1 = jSONReader.h1();
        boolean z = this.b;
        if (h1) {
            long r2 = jSONReader.r2();
            if (z) {
                r2 *= 1000;
            }
            return new Date(r2);
        } else if (jSONReader.n2()) {
            return null;
        } else {
            if (z && jSONReader.l1()) {
                return new Date(Long.parseLong(jSONReader.Q2()) * 1000);
            }
            if (this.f26308a == null || this.d || this.c) {
                q7h x2 = jSONReader.x2();
                if (x2 != null) {
                    return new Date(x2.i(jSONReader.X0()).g());
                }
                if (jSONReader.o3()) {
                    return null;
                }
                long H2 = jSONReader.H2();
                if (H2 != 0 || !jSONReader.o3()) {
                    return new Date(H2);
                }
                return null;
            }
            String Q2 = jSONReader.Q2();
            if (Q2.isEmpty()) {
                return null;
            }
            DateTimeFormatter H = H();
            boolean z2 = this.f;
            JSONReader.c cVar = jSONReader.f2453a;
            if (!z2) {
                vcfVar = xqx.c(q7h.f(H.h(Q2), x9h.MIN), cVar.m()).h();
            } else {
                vcfVar = xqx.c(H.i(Q2), cVar.m()).h();
            }
            return new Date(vcfVar.g());
        }
    }

    @Override // tb.fek, tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return o(jSONReader, type, obj, j);
    }
}
