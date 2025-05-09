package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23359a;
    public final long b;
    public final Class c;
    public volatile iik d;
    public final DecimalFormat e;
    public final boolean f;
    public static final lik FLOAT_ARRAY = new lik(Float.class, null);
    public static final lik DOUBLE_ARRAY = new lik(Double.class, null);
    public static final lik DECIMAL_ARRAY = new lik(BigDecimal.class, null);

    public lik(Class cls, DecimalFormat decimalFormat) {
        this.c = cls;
        this.e = decimalFormat;
        String str = "[" + TypeUtils.n(cls);
        this.f23359a = yqf.a(str);
        this.b = ls9.a(str);
        this.f = !z1.n(cls);
    }

    public iik b(JSONWriter jSONWriter) {
        iik F;
        iik iikVar = this.d;
        if (iikVar == null) {
            Class cls = this.c;
            if (cls == Float.class) {
                if (this.e != null) {
                    F = new ljk(this.e);
                } else {
                    F = ljk.b;
                }
            } else if (cls == Double.class) {
                if (this.e != null) {
                    F = new ijk(this.e);
                } else {
                    F = ijk.b;
                }
            } else if (cls != BigDecimal.class) {
                F = jSONWriter.F(cls);
            } else if (this.e != null) {
                F = new yik(this.e, null);
            } else {
                F = yik.c;
            }
            iikVar = F;
            this.d = iikVar;
        }
        return iikVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String Y0;
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        boolean B0 = jSONWriter.B0();
        if (B0) {
            B0 = this.f;
        }
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(this.f23359a, this.b);
        }
        jSONWriter.d1(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.b2();
            } else {
                iik b = b(jSONWriter);
                if (!B0 || (Y0 = jSONWriter.Y0(i, obj3)) == null) {
                    b.e(jSONWriter, obj3, Integer.valueOf(i), this.c, 0L);
                    if (B0) {
                        jSONWriter.X0(obj3);
                    }
                } else {
                    jSONWriter.i2(Y0);
                    jSONWriter.X0(obj3);
                }
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String Y0;
        if (jSONWriter.d) {
            e(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.k1();
        } else {
            boolean B0 = jSONWriter.B0();
            if (B0) {
                B0 = this.f;
            }
            Object[] objArr = (Object[]) obj;
            jSONWriter.c1();
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                Object obj3 = objArr[i];
                if (obj3 == null) {
                    jSONWriter.b2();
                } else {
                    iik b = b(jSONWriter);
                    if (!B0 || (Y0 = jSONWriter.Y0(i, obj3)) == null) {
                        b.y(jSONWriter, obj3, Integer.valueOf(i), this.c, j);
                        if (B0) {
                            jSONWriter.X0(obj3);
                        }
                    } else {
                        jSONWriter.i2(Y0);
                        jSONWriter.X0(obj3);
                    }
                }
            }
            jSONWriter.e();
        }
    }
}
