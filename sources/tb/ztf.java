package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ztf extends pu6 implements iik {
    public static final ztf INSTANCE = new ztf(null);

    public ztf(String str) {
        super(str);
    }

    public static ztf J(String str) {
        if (str == null) {
            return INSTANCE;
        }
        return new ztf(str);
    }

    @Override // tb.iik
    public /* synthetic */ void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.i(this, jSONWriter, obj, obj2, type, j);
        throw null;
    }

    @Override // tb.iik
    public /* synthetic */ void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.e(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ FieldWriter E(long j) {
        return null;
    }

    @Override // tb.iik
    public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.g(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ void k(JSONWriter jSONWriter, Object obj) {
        hik.d(this, jSONWriter, obj);
    }

    @Override // tb.iik
    public /* synthetic */ void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.f(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ boolean n(JSONWriter jSONWriter) {
        return hik.b(this, jSONWriter);
    }

    @Override // tb.iik
    public /* synthetic */ List p() {
        return hik.a(this);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        DateTimeFormatter dateTimeFormatter;
        String b;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        JSONWriter.a aVar = jSONWriter.f2458a;
        if (this.b || aVar.j()) {
            jSONWriter.O1(((Date) obj).getTime() / 1000);
        } else if (this.c || aVar.i()) {
            jSONWriter.O1(((Time) obj).getTime());
        } else if (this.d || aVar.h()) {
            xqx d = xqx.d(vcf.d(((Time) obj).getTime()), wqx.e);
            q7h q7hVar = d.f31549a;
            p7h p7hVar = q7hVar.f26561a;
            int i = p7hVar.f25919a;
            short s = p7hVar.b;
            short s2 = p7hVar.c;
            x9h x9hVar = q7hVar.b;
            jSONWriter.w1(i, s, s2, x9hVar.f31233a, x9hVar.b, x9hVar.c, 0, d.b, true);
        } else {
            String str = this.f26308a;
            if (str == null || str.contains("dd")) {
                dateTimeFormatter = null;
            } else {
                dateTimeFormatter = H();
            }
            if (dateTimeFormatter == null && (b = aVar.b()) != null && !b.contains("dd")) {
                dateTimeFormatter = aVar.c();
            }
            if (dateTimeFormatter == null) {
                jSONWriter.k2(obj.toString());
            } else {
                jSONWriter.k2(dateTimeFormatter.c(xqx.d(vcf.d(((Date) obj).getTime()), aVar.g())));
            }
        }
    }

    @Override // tb.iik
    public /* synthetic */ void A(e1n e1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void c(h1n h1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void f(qij qijVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void g(y1w y1wVar) {
    }
}
