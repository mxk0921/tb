package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class buf extends pu6 implements iik {
    public buf(String str) {
        super(str);
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
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Timestamp timestamp = (Timestamp) obj;
        long time = timestamp.getTime();
        int nanos = timestamp.getNanos();
        if (nanos == 0) {
            jSONWriter.T1(time);
        } else {
            jSONWriter.I1(time, nanos);
        }
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
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        JSONWriter.a aVar = jSONWriter.f2458a;
        Timestamp timestamp = (Timestamp) obj;
        if (this.b || aVar.j()) {
            jSONWriter.O1(timestamp.getTime() / 1000);
            return;
        }
        wqx g = aVar.g();
        vcf b = vcf.b(timestamp);
        xqx d = xqx.d(b, g);
        int a2 = g.a(b);
        boolean z = this.d;
        q7h q7hVar = d.f31549a;
        if (z || aVar.h()) {
            x9h x9hVar = q7hVar.b;
            int i = x9hVar.d;
            if (i % 1000000 == 0) {
                p7h p7hVar = q7hVar.f26561a;
                jSONWriter.w1(p7hVar.f25919a, p7hVar.b, p7hVar.c, x9hVar.f31233a, x9hVar.b, x9hVar.c, i / 1000000, a2, true);
                return;
            }
        }
        DateTimeFormatter H = H();
        if (H == null) {
            H = aVar.c();
        }
        if (H != null) {
            jSONWriter.k2(H.c(d));
        } else if (this.c || aVar.i()) {
            jSONWriter.O1(timestamp.getTime());
        } else {
            int nanos = timestamp.getNanos();
            if (nanos == 0) {
                jSONWriter.O1(timestamp.getTime());
                return;
            }
            p7h p7hVar2 = q7hVar.f26561a;
            int i2 = p7hVar2.f25919a;
            x9h x9hVar2 = q7hVar.b;
            byte b2 = x9hVar2.f31233a;
            if (nanos % 1000000 == 0) {
                jSONWriter.w1(i2, p7hVar2.b, p7hVar2.c, b2, x9hVar2.b, x9hVar2.c, nanos / 1000000, a2, false);
                return;
            }
            jSONWriter.S1(q7hVar);
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
