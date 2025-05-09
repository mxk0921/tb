package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kdk<T> extends ldk<T> {
    public final String k;
    public final long l;
    public final g79[] m;
    public final long[] n;
    public final short[] o;
    public final long[] p;
    public final short[] q;
    public final Constructor r;
    public final int s;
    public final Class[] t;
    public final String[] u;
    public final Class v;
    public final Map<Long, Class> w;

    public kdk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        this(cls, str, str2, j, supplier, k2aVar, null, null, null, g79VarArr);
    }

    public void A(T t) {
        g79[] g79VarArr;
        for (g79 g79Var : this.m) {
            Object obj = g79Var.j;
            if (obj != null) {
                g79Var.h(t, obj);
            }
        }
    }

    @Override // tb.ldk, tb.jdk
    public T D(long j) {
        T t;
        Class cls = this.f23271a;
        Constructor constructor = this.r;
        if (constructor == null || this.s != 0) {
            Supplier<T> supplier = this.b;
            if (supplier != null) {
                t = supplier.get();
            } else {
                throw new JSONException("create instance error, " + cls);
            }
        } else {
            try {
                t = (T) constructor.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("create instance error, " + cls, e);
            }
        }
        if (this.h) {
            A(t);
        }
        return t;
    }

    @Override // tb.ldk, tb.jdk
    public final String G() {
        return this.k;
    }

    @Override // tb.ldk, tb.jdk
    public final k2a d() {
        return this.c;
    }

    @Override // tb.ldk
    public void g(Object obj) {
        int i = 0;
        while (true) {
            g79[] g79VarArr = this.m;
            if (i < g79VarArr.length) {
                g79 g79Var = g79VarArr[i];
                if (g79Var.c == String.class) {
                    g79Var.h(obj, "");
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // tb.ldk, tb.jdk
    public g79 h(long j) {
        int binarySearch = Arrays.binarySearch(this.p, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.m[this.q[binarySearch]];
    }

    @Override // tb.ldk, tb.jdk
    public T i(Collection collection) {
        T D = D(0L);
        int i = 0;
        for (Object obj : collection) {
            g79[] g79VarArr = this.m;
            if (i >= g79VarArr.length) {
                break;
            }
            g79VarArr[i].h(D, obj);
            i++;
        }
        return D;
    }

    @Override // tb.ldk, tb.jdk
    public final long m() {
        return this.l;
    }

    @Override // tb.ldk
    public T n(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.i) {
            jSONReader.u0(this.f23271a);
        }
        jSONReader.v1();
        T t = this.b.get();
        int i = 0;
        while (true) {
            g79[] g79VarArr = this.m;
            if (i >= g79VarArr.length) {
                break;
            }
            g79VarArr[i].L(jSONReader, t);
            i++;
        }
        if (jSONReader.u1()) {
            jSONReader.w1();
            k2a k2aVar = this.c;
            if (k2aVar != null) {
                return (T) k2aVar.apply(t);
            }
            return t;
        }
        throw new JSONException(jSONReader.a1("array to bean end error"));
    }

    @Override // tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.C1()) {
            return null;
        }
        long f = f();
        long j2 = this.d | j;
        jdk c0 = jSONReader.c0(this.f23271a, f, j2);
        Class cls = this.f23271a;
        if (c0 != null && c0.b() != cls) {
            return (T) c0.q(jSONReader, type, obj, j);
        }
        if (!this.i) {
            jSONReader.u0(cls);
        }
        if (!jSONReader.b1()) {
            jSONReader.F1();
            int i = 0;
            T t = null;
            while (true) {
                boolean E1 = jSONReader.E1();
                JSONReader.c cVar = jSONReader.f2453a;
                if (!E1) {
                    long h2 = jSONReader.h2();
                    if (h2 == this.l && i == 0) {
                        jdk z = z(cVar, jSONReader.V2());
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
                            k(jSONReader, t, j);
                        } else {
                            if (t == null) {
                                t = D(cVar.c | j);
                            }
                            u.L(jSONReader, t);
                        }
                    }
                    i++;
                } else if (t == null) {
                    return D(cVar.c | j);
                } else {
                    return t;
                }
            }
        } else if (jSONReader.n1()) {
            return r(jSONReader, type, obj, j);
        } else {
            throw new JSONException(jSONReader.a1("expect object, but " + yqf.b(jSONReader.W0())));
        }
    }

    @Override // tb.ldk, tb.jdk
    public T r(JSONReader jSONReader, Type type, Object obj, long j) {
        g79[] g79VarArr;
        boolean z = this.i;
        Class<T> cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        jdk c = c(jSONReader, cls, this.d | j);
        if (!(c == null || c == this || c.b() == cls)) {
            return (T) c.r(jSONReader, type, obj, j);
        }
        int c3 = jSONReader.c3();
        T D = D(0L);
        int i = 0;
        while (true) {
            g79VarArr = this.m;
            if (i >= g79VarArr.length) {
                break;
            }
            if (i < c3) {
                g79VarArr[i].L(jSONReader, D);
            }
            i++;
        }
        for (int length = g79VarArr.length; length < c3; length++) {
            jSONReader.b3();
        }
        k2a k2aVar = this.c;
        if (k2aVar != null) {
            return (T) k2aVar.apply(D);
        }
        return D;
    }

    @Override // tb.ldk, tb.jdk
    public g79 u(long j) {
        int binarySearch = Arrays.binarySearch(this.n, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.m[this.o[binarySearch]];
    }

    @Override // tb.ldk, tb.jdk
    public final long v() {
        return this.d;
    }

    @Override // tb.ldk, tb.jdk
    public jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        Map<Long, Class> map = this.w;
        if (map == null || ((HashMap) map).size() <= 0) {
            return objectReaderProvider.G(j);
        }
        Class cls = (Class) ((HashMap) map).get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return objectReaderProvider.I(cls);
    }

    @Override // tb.ldk, tb.jdk
    public T x(Map map, long j) {
        boolean z;
        jdk jdkVar;
        ObjectReaderProvider k = JSONFactory.k();
        Object obj = map.get(this.k);
        long j2 = this.d | j;
        if (obj instanceof String) {
            String str = (String) obj;
            long a2 = ls9.a(str);
            if ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (this instanceof yhk)) {
                jdkVar = w(k, a2);
            } else {
                jdkVar = null;
            }
            if (jdkVar == null) {
                jdkVar = k.H(str, b(), j2);
            }
            if (!(jdkVar == this || jdkVar == null)) {
                return (T) jdkVar.x(map, j);
            }
        }
        T D = D(0L);
        if (this.g == null && ((JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.ErrorOnUnknownProperties.mask) & j2) == 0) {
            int i = 0;
            if ((j2 & JSONReader.Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            while (true) {
                g79[] g79VarArr = this.m;
                if (i >= g79VarArr.length) {
                    break;
                }
                g79 g79Var = g79VarArr[i];
                Object obj2 = map.get(g79Var.b);
                if (obj2 != null) {
                    Class<?> cls = obj2.getClass();
                    Type type = g79Var.d;
                    if (cls == type) {
                        g79Var.h(D, obj2);
                    } else if ((g79Var instanceof z99) && (obj2 instanceof JSONArray)) {
                        g79Var.h(D, g79Var.A(k).i((JSONArray) obj2));
                    } else if (!(obj2 instanceof JSONObject) || type == JSONObject.class) {
                        g79Var.k(D, obj2, j);
                    } else {
                        g79Var.h(D, k.J(type, z).x((JSONObject) obj2, j));
                    }
                }
                i++;
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                String obj3 = entry.getKey().toString();
                Object value = entry.getValue();
                g79 j3 = j(obj3);
                if (j3 == null) {
                    s(D, obj3, entry.getValue(), j);
                } else if (value == null || value.getClass() != j3.d) {
                    j3.k(D, value, j);
                } else {
                    j3.h(D, value);
                }
            }
        }
        k2a k2aVar = this.c;
        if (k2aVar != null) {
            return (T) k2aVar.apply(D);
        }
        return D;
    }

    @Override // tb.ldk, tb.jdk
    public jdk z(JSONReader.c cVar, long j) {
        Map<Long, Class> map = this.w;
        if (map == null || ((HashMap) map).size() <= 0) {
            return cVar.h(j);
        }
        Class cls = (Class) ((HashMap) map).get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return cVar.g(cls);
    }

    public kdk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, Class[] clsArr, String[] strArr, Class cls2, g79... g79VarArr) {
        super(cls, supplier, str2, j, k2aVar);
        Constructor constructor;
        g79 g79Var;
        if (supplier instanceof dk4) {
            constructor = ((dk4) supplier).f17878a;
        } else {
            constructor = cls == null ? null : BeanUtils.w(cls, true);
            if (constructor != null) {
                constructor.setAccessible(true);
            }
        }
        if (constructor != null) {
            this.s = constructor.getParameterTypes().length;
        } else {
            this.s = -1;
        }
        this.r = constructor;
        if (str == null || str.isEmpty()) {
            this.k = JSON.DEFAULT_TYPE_KEY;
            this.l = jdk.HASH_TYPE;
        } else {
            this.k = str;
            this.l = ls9.a(str);
        }
        this.m = g79VarArr;
        int length = g79VarArr.length;
        long[] jArr = new long[length];
        int length2 = g79VarArr.length;
        long[] jArr2 = new long[length2];
        for (int i = 0; i < g79VarArr.length; i++) {
            g79 g79Var2 = g79VarArr[i];
            jArr[i] = g79Var2.m;
            jArr2[i] = g79Var2.n;
            if (g79Var2.C() && ((g79Var = this.g) == null || !(g79Var instanceof h79))) {
                this.g = g79Var2;
            }
            if (g79Var2.j != null) {
                this.h = true;
            }
        }
        long[] copyOf = Arrays.copyOf(jArr, length);
        this.n = copyOf;
        Arrays.sort(copyOf);
        this.o = new short[copyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.o[Arrays.binarySearch(this.n, jArr[i2])] = (short) i2;
        }
        long[] copyOf2 = Arrays.copyOf(jArr2, length2);
        this.p = copyOf2;
        Arrays.sort(copyOf2);
        this.q = new short[copyOf2.length];
        for (int i3 = 0; i3 < length2; i3++) {
            this.q[Arrays.binarySearch(this.p, jArr2[i3])] = (short) i3;
        }
        this.t = clsArr;
        if (clsArr != null) {
            this.w = new HashMap(clsArr.length);
            this.u = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String str3 = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (str3 == null || str3.isEmpty()) {
                    str3 = cls3.getSimpleName();
                }
                ((HashMap) this.w).put(Long.valueOf(ls9.a(str3)), cls3);
                this.u[i4] = str3;
            }
        } else {
            this.w = null;
            this.u = null;
        }
        this.v = cls2;
    }
}
