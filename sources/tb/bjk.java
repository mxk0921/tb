package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bjk extends pu6 implements iik {
    public static final bjk l = new bjk(null, null);

    public bjk(String str, Locale locale) {
        super(str, locale);
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
        } else {
            jSONWriter.T1(((Calendar) obj).getTimeInMillis());
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
        String str;
        String str2;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        JSONWriter.a aVar = jSONWriter.f2458a;
        Calendar calendar = (Calendar) obj;
        long timeInMillis = calendar.getTimeInMillis();
        if (this.b || ((str = this.f26308a) == null && aVar.j())) {
            jSONWriter.O1(timeInMillis / 1000);
        } else if (str != null || !aVar.i()) {
            xqx d = xqx.d(vcf.d(timeInMillis), aVar.g());
            q7h q7hVar = d.f31549a;
            int i = q7hVar.f26561a.f25919a;
            if (i >= 0 && i <= 9999) {
                int i2 = d.b;
                if (str != null || !aVar.h()) {
                    if (str == null) {
                        str2 = aVar.b();
                    } else {
                        str2 = str;
                    }
                    if (str2 == null) {
                        p7h p7hVar = q7hVar.f26561a;
                        short s = p7hVar.b;
                        short s2 = p7hVar.c;
                        x9h x9hVar = q7hVar.b;
                        byte b = x9hVar.f31233a;
                        byte b2 = x9hVar.b;
                        byte b3 = x9hVar.c;
                        int i3 = x9hVar.d;
                        if (i3 == 0) {
                            jSONWriter.v1(i, s, s2, b, b2, b3);
                            return;
                        } else {
                            jSONWriter.w1(i, s, s2, b, b2, b3, i3 / 1000000, i2, false);
                            return;
                        }
                    }
                } else {
                    p7h p7hVar2 = q7hVar.f26561a;
                    short s3 = p7hVar2.b;
                    short s4 = p7hVar2.c;
                    x9h x9hVar2 = q7hVar.b;
                    jSONWriter.w1(i, s3, s4, x9hVar2.f31233a, x9hVar2.b, x9hVar2.c, x9hVar2.d / 1000000, i2, true);
                    return;
                }
            }
            if (str == null) {
                str = jSONWriter.f2458a.b();
            }
            jSONWriter.k2(new SimpleDateFormat(str).format(calendar.getTime()));
        } else {
            jSONWriter.O1(timeInMillis);
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
