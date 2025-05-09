package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class hik {
    public static List a(iik iikVar) {
        return Collections.emptyList();
    }

    public static boolean b(iik iikVar, JSONWriter jSONWriter) {
        return jSONWriter.Z(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
    }

    public static void c(iik iikVar, uh9 uh9Var) {
        if (uh9Var instanceof e1n) {
            iikVar.A((e1n) uh9Var);
        }
        if (uh9Var instanceof y1w) {
            iikVar.g((y1w) uh9Var);
        }
        if (uh9Var instanceof qij) {
            iikVar.f((qij) uh9Var);
        }
        if (uh9Var instanceof h1n) {
            iikVar.c((h1n) uh9Var);
        }
    }

    public static void d(iik iikVar, JSONWriter jSONWriter, Object obj) {
        iikVar.y(jSONWriter, obj, null, null, 0L);
    }

    public static void e(iik iikVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.d) {
            iikVar.l(jSONWriter, obj, obj2, type, j);
            return;
        }
        List<FieldWriter> p = iikVar.p();
        jSONWriter.c1();
        int i = 0;
        if (!iikVar.n(jSONWriter)) {
            int size = p.size();
            while (i < size) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                p.get(i).R(jSONWriter, obj);
                i++;
            }
        } else {
            jSONWriter.f2458a.getClass();
            int size2 = p.size();
            while (i < size2) {
                if (i != 0) {
                    jSONWriter.t1();
                }
                FieldWriter fieldWriter = p.get(i);
                Object a2 = fieldWriter.a(obj);
                if (a2 == null) {
                    jSONWriter.b2();
                } else {
                    fieldWriter.g(jSONWriter, a2.getClass()).k(jSONWriter, a2);
                }
                i++;
            }
        }
        jSONWriter.e();
    }

    public static void f(iik iikVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        List<FieldWriter> p = iikVar.p();
        int size = p.size();
        jSONWriter.d1(size);
        for (int i = 0; i < size; i++) {
            p.get(i).R(jSONWriter, obj);
        }
    }

    public static void g(iik iikVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        iikVar.y(jSONWriter, obj, obj2, type, j);
    }

    public static void h(iik iikVar, JSONWriter jSONWriter, Object obj) {
        iikVar.B(jSONWriter, obj, null, null, 0L);
    }

    public static void i(iik iikVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        throw new UnsupportedOperationException();
    }
}
