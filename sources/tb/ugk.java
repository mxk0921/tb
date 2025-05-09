package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ugk<T> extends kdk<T> {
    public ugk(Class cls, String str, String str2, long j, Supplier supplier, k2a k2aVar, g79[] g79VarArr) {
        super(cls, str, str2, j, supplier, k2aVar, g79VarArr);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T D(long j) {
        return (T) TypeUtils.s(this.f23271a, new JSONObject());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158 A[SYNTHETIC] */
    @Override // tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ugk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        long f = f();
        long j2 = this.d | j;
        jdk c0 = jSONReader.c0(this.f23271a, f, j2);
        Class<T> cls = this.f23271a;
        if (c0 != null && c0.b() != cls) {
            return (T) c0.q(jSONReader, type, obj, j);
        }
        if (!jSONReader.b1()) {
            jSONReader.F1();
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (!jSONReader.E1()) {
                long h2 = jSONReader.h2();
                if (h2 == this.l && i == 0) {
                    long V2 = jSONReader.V2();
                    JSONReader.c cVar = jSONReader.f2453a;
                    jdk z = z(cVar, V2);
                    if (z == null) {
                        String U0 = jSONReader.U0();
                        jdk i2 = cVar.i(U0, null);
                        if (i2 != null) {
                            z = i2;
                        } else {
                            throw new JSONException(jSONReader.a1("auotype not support : " + U0));
                        }
                    }
                    if (z != this) {
                        jSONReader.Z2(true);
                        return (T) z.q(jSONReader, type, obj, j);
                    }
                } else if (h2 != 0) {
                    g79 u = u(h2);
                    if (u == null && jSONReader.q1(j2)) {
                        u = h(jSONReader.P0());
                    }
                    if (u == null) {
                        jSONObject.put(jSONReader.L0(), jSONReader.T1());
                    } else {
                        jSONObject.put(u.b, u.K(jSONReader));
                    }
                }
                i++;
            }
            return (T) TypeUtils.s(cls, jSONObject);
        } else if (jSONReader.n1()) {
            return r(jSONReader, type, obj, j);
        } else {
            throw new JSONException(jSONReader.a1("expect object, but " + yqf.b(jSONReader.W0())));
        }
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T x(Map map, long j) {
        JSONObject jSONObject;
        if (map instanceof JSONObject) {
            jSONObject = (JSONObject) map;
        } else {
            jSONObject = new JSONObject(map);
        }
        return (T) TypeUtils.s(this.f23271a, jSONObject);
    }
}
