package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kik extends jkk {
    public static final kik d = new kik(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f22691a;
    public final long b;
    public final Type c;

    public kik(Type type) {
        this.c = type;
        if (type == Object.class) {
            this.f22691a = yqf.a("[O");
            this.b = ls9.a("[0");
            return;
        }
        String str = "[" + TypeUtils.n((Class) type);
        this.f22691a = yqf.a(str);
        this.b = ls9.a(str);
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String Y0;
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        boolean B0 = jSONWriter.B0();
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(this.f22691a, this.b);
        }
        jSONWriter.d1(objArr.length);
        Class<?> cls = null;
        boolean z = B0;
        iik iikVar = null;
        for (int i = 0; i < objArr.length; i++) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.b2();
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    z = jSONWriter.B0();
                    iikVar = jSONWriter.F(cls2);
                    if (z) {
                        z = !z1.n(cls2);
                    }
                    cls = cls2;
                }
                if (!z || (Y0 = jSONWriter.Y0(i, obj3)) == null) {
                    iikVar.e(jSONWriter, obj3, Integer.valueOf(i), this.c, 0L);
                    if (z) {
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
        iik iikVar;
        Class<?> cls;
        boolean z;
        String Y0;
        if (jSONWriter.d) {
            e(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.k1();
        } else {
            boolean B0 = jSONWriter.B0();
            Object[] objArr = (Object[]) obj;
            jSONWriter.c1();
            Class<?> cls2 = null;
            iik iikVar2 = null;
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                Object obj3 = objArr[i];
                if (obj3 == null) {
                    jSONWriter.b2();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 == cls2) {
                        z = B0;
                        cls = cls2;
                        iikVar = iikVar2;
                    } else {
                        boolean B02 = jSONWriter.B0();
                        iik F = jSONWriter.F(cls3);
                        if (B02) {
                            B02 = !z1.n(cls3);
                        }
                        z = B02;
                        iikVar = F;
                        cls = cls3;
                    }
                    if (!z || (Y0 = jSONWriter.Y0(i, obj3)) == null) {
                        iikVar.y(jSONWriter, obj3, Integer.valueOf(i), this.c, j);
                        if (z) {
                            jSONWriter.X0(obj3);
                        }
                    } else {
                        jSONWriter.i2(Y0);
                        jSONWriter.X0(obj3);
                    }
                    B0 = z;
                    cls2 = cls;
                    iikVar2 = iikVar;
                }
            }
            jSONWriter.e();
        }
    }
}
