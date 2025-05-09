package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class cdk {
    public static jdk a(jdk jdkVar, JSONReader.c cVar, long j) {
        return cVar.h(j);
    }

    public static jdk b(jdk jdkVar, ObjectReaderProvider objectReaderProvider, long j) {
        return objectReaderProvider.G(j);
    }

    public static Object c(jdk jdkVar) {
        return jdkVar.D(0L);
    }

    public static Object d(jdk jdkVar, long j) {
        throw new UnsupportedOperationException();
    }

    public static Object e(jdk jdkVar, Collection collection) {
        throw new UnsupportedOperationException(jdkVar.getClass().getName());
    }

    public static Object f(jdk jdkVar, Map map, long j) {
        jdk jdkVar2;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(jdkVar.G());
        if (obj instanceof String) {
            String str = (String) obj;
            long a2 = ls9.a(str);
            if ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (jdkVar instanceof yhk)) {
                jdkVar2 = jdkVar.w(objectReaderProvider, a2);
            } else {
                jdkVar2 = null;
            }
            if (jdkVar2 == null) {
                jdkVar2 = objectReaderProvider.H(str, jdkVar.b(), jdkVar.v() | j);
            }
            if (!(jdkVar2 == jdkVar || jdkVar2 == null)) {
                return jdkVar2.x(map, j);
            }
        }
        Object D = jdkVar.D(0L);
        for (Map.Entry entry : map.entrySet()) {
            String obj2 = entry.getKey().toString();
            Object value = entry.getValue();
            g79 j2 = jdkVar.j(obj2);
            if (j2 == null) {
                jdkVar.s(D, obj2, entry.getValue(), j);
            } else {
                j2.k(D, value, j);
            }
        }
        k2a d = jdkVar.d();
        if (d != null) {
            return d.apply(D);
        }
        return D;
    }

    public static Object g(jdk jdkVar, Map map, JSONReader.Feature... featureArr) {
        long j = 0;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
        }
        return jdkVar.x(map, j);
    }

    public static g79 h(jdk jdkVar, String str) {
        long a2 = ls9.a(str);
        g79 u = jdkVar.u(a2);
        if (u != null) {
            return u;
        }
        long b = ls9.b(str);
        if (b != a2) {
            return jdkVar.h(b);
        }
        return u;
    }

    public static Object i(jdk jdkVar, JSONReader jSONReader, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    public static Object j(jdk jdkVar, JSONReader jSONReader, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    public static Object k(jdk jdkVar, JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.b1() && jSONReader.n1()) {
            return jdkVar.r(jSONReader, type, obj, j);
        }
        jSONReader.F1();
        int i = 0;
        Object obj2 = null;
        while (true) {
            boolean E1 = jSONReader.E1();
            JSONReader.c cVar = jSONReader.f2453a;
            if (!E1) {
                long h2 = jSONReader.h2();
                if (h2 == jdkVar.m() && i == 0) {
                    jdk z = jdkVar.z(cVar, jSONReader.T2());
                    if (z == null) {
                        String U0 = jSONReader.U0();
                        jdk i2 = cVar.i(U0, null);
                        if (i2 != null) {
                            z = i2;
                        } else {
                            throw new JSONException(jSONReader.a1("No suitable ObjectReader found for" + U0));
                        }
                    }
                    if (z != jdkVar) {
                        return z.q(jSONReader, type, obj, j);
                    }
                } else if (h2 != 0) {
                    g79 u = jdkVar.u(h2);
                    if (u == null && jSONReader.q1(jdkVar.v() | j)) {
                        u = jdkVar.h(jSONReader.P0());
                    }
                    if (u == null) {
                        jSONReader.b3();
                    } else {
                        if (obj2 == null) {
                            obj2 = jdkVar.D(cVar.c | j);
                        }
                        u.L(jSONReader, obj2);
                    }
                }
                i++;
            } else if (obj2 == null) {
                return jdkVar.D(cVar.c | j);
            } else {
                return obj2;
            }
        }
    }

    public static Object l(jdk jdkVar, JSONReader jSONReader) {
        return jdkVar.o(jSONReader, null, null, jdkVar.v());
    }
}
