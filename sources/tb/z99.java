package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z99<T, V> extends fa9<T> {
    final long x;
    final long y;

    public z99(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, z92 z92Var) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, z92Var);
        this.s = type2;
        this.t = cls2;
        long j2 = 0;
        this.y = cls2 == null ? 0L : ls9.a(cls2.getName());
        this.x = cls != null ? ls9.a(TypeUtils.n(cls)) : j2;
        if (str2 != null && type2 == Date.class) {
            this.u = new fek(str2, locale);
        }
    }

    @Override // tb.fa9, tb.g79
    public Object K(JSONReader jSONReader) {
        k2a M;
        boolean z = jSONReader.w;
        int i = 0;
        JSONReader.c cVar = jSONReader.f2453a;
        if (z) {
            int c3 = jSONReader.c3();
            Object[] objArr = new Object[c3];
            jdk v = v(cVar);
            while (i < c3) {
                objArr[i] = v.o(jSONReader, null, null, 0L);
                i++;
            }
            return Arrays.asList(objArr);
        } else if (jSONReader.f0() == '[') {
            jdk v2 = v(cVar);
            Collection<V> P = P(cVar);
            jSONReader.t1();
            while (!jSONReader.u1()) {
                P.add((V) v2.o(jSONReader, null, null, 0L));
                jSONReader.w1();
            }
            jSONReader.w1();
            return P;
        } else {
            if (jSONReader.l1()) {
                String Q2 = jSONReader.Q2();
                Type type = this.s;
                if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (M = cVar.i.M(String.class, this.s)) != null) {
                    Collection<V> P2 = P(cVar);
                    if (Q2.indexOf(44) != -1) {
                        String[] split = Q2.split(",");
                        int length = split.length;
                        while (i < length) {
                            P2.add((V) M.apply(split[i]));
                            i++;
                        }
                    }
                    return P2;
                }
            }
            throw new JSONException(jSONReader.a1("TODO : " + getClass()));
        }
    }

    @Override // tb.fa9, tb.g79
    public void L(JSONReader jSONReader, T t) {
        V v;
        if (jSONReader.w) {
            M(jSONReader, t);
            return;
        }
        k2a k2aVar = null;
        if (jSONReader.C1()) {
            O(t, null);
            return;
        }
        JSONReader.c cVar = jSONReader.f2453a;
        jdk y = y(cVar);
        jdk jdkVar = this.v;
        if (jdkVar != null) {
            k2aVar = jdkVar.d();
        } else if (y instanceof xfk) {
            k2aVar = ((xfk) y).d();
        }
        char f0 = jSONReader.f0();
        if (f0 == '[') {
            jdk v2 = v(cVar);
            Collection<V> P = P(cVar);
            jSONReader.t1();
            int i = 0;
            while (!jSONReader.u1()) {
                if (jSONReader.k1()) {
                    String P2 = jSONReader.P2();
                    if ("..".equals(P2)) {
                        v = (V) P;
                    } else {
                        o(jSONReader, (List) P, i, P2);
                        i++;
                    }
                } else {
                    v = (V) v2.o(jSONReader, null, null, 0L);
                }
                P.add(v);
                jSONReader.w1();
                i++;
            }
            if (k2aVar != 0) {
                P = (Collection) k2aVar.apply(P);
            }
            h(t, P);
            jSONReader.w1();
        } else if (f0 != '{' || !(v(cVar) instanceof ldk)) {
            h(t, y.o(jSONReader, null, null, this.e));
        } else {
            Object o = this.u.o(jSONReader, null, null, this.e);
            Collection collection = (Collection) y.D(this.e);
            collection.add(o);
            if (k2aVar != null) {
                collection = (Collection) k2aVar.apply(collection);
            }
            h(t, collection);
            jSONReader.w1();
        }
    }

    public void O(T t, JSONArray jSONArray) {
        h(t, jSONArray);
    }

    public Collection<V> P(JSONReader.c cVar) {
        Class cls = this.c;
        if (cls == List.class || cls == Collection.class || cls == ArrayList.class) {
            return new ArrayList();
        }
        return (Collection) y(cVar).a();
    }

    @Override // tb.g79
    public jdk p(JSONReader jSONReader) {
        if (!jSONReader.y1((byte) -110)) {
            return null;
        }
        long T2 = jSONReader.T2();
        long B0 = jSONReader.B0(this.e);
        JSONReader.c cVar = jSONReader.f2453a;
        JSONReader.a d = cVar.d();
        if (d != null) {
            Class<?> c = d.c(T2, this.c, B0);
            if (c == null) {
                c = d.b(jSONReader.U0(), this.c, B0);
            }
            if (c != null) {
                return cVar.g(this.c);
            }
        }
        if (jSONReader.m1(B0)) {
            jdk S0 = jSONReader.S0(T2, this.c, B0);
            if (S0 instanceof xfk) {
                xfk xfkVar = (xfk) S0;
                S0 = new xfk(this.d, this.c, xfkVar.c, this.s, xfkVar.g);
            }
            if (S0 != null) {
                return S0;
            }
            throw new JSONException(jSONReader.a1("auotype not support : " + jSONReader.U0()));
        } else if (jSONReader.b1() && !jSONReader.d1(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
            return z(jSONReader);
        } else {
            throw new JSONException(jSONReader.a1("autoType not support input " + jSONReader.U0()));
        }
    }

    @Override // tb.g79
    public long u() {
        return this.y;
    }
}
