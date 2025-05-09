package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ldk<T> implements jdk<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f23271a;
    public final Supplier<T> b;
    public final k2a c;
    public final long d;
    public String e;
    public long f;
    public g79 g;
    public boolean h;
    public final boolean i;
    public JSONReader.a j;

    public ldk(Class cls, Supplier<T> supplier, String str, long j, k2a k2aVar) {
        long j2;
        boolean z;
        this.f23271a = cls;
        this.b = supplier;
        this.c = k2aVar;
        this.d = j;
        this.e = str;
        if (str != null) {
            j2 = ls9.a(str);
        } else {
            j2 = 0;
        }
        this.f = j2;
        if (cls == null || !Serializable.class.isAssignableFrom(cls)) {
            z = false;
        } else {
            z = true;
        }
        this.i = z;
    }

    @Override // tb.jdk
    public /* synthetic */ Object D(long j) {
        cdk.d(this, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    @Override // tb.jdk
    public /* synthetic */ Object a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public Class<T> b() {
        return this.f23271a;
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    public String e() {
        Class cls;
        if (this.e == null && (cls = this.f23271a) != null) {
            this.e = TypeUtils.n(cls);
        }
        return this.e;
    }

    public long f() {
        String e;
        if (this.f == 0 && (e = e()) != null) {
            this.f = ls9.a(e);
        }
        return this.f;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object i(Collection collection) {
        cdk.e(this, collection);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    public void k(JSONReader jSONReader, Object obj, long j) {
        g79 h;
        g79 g79Var = this.g;
        if (g79Var == null || obj == null) {
            if ((jSONReader.B0(j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
                String L0 = jSONReader.L0();
                if (L0.startsWith("is", 0) && (h = h(ls9.b(L0.substring(2)))) != null && h.c == Boolean.class) {
                    h.L(jSONReader, obj);
                    return;
                }
            }
            ft8 ft8Var = jSONReader.f2453a.h;
            if (ft8Var != null) {
                String L02 = jSONReader.L0();
                ft8Var.processExtra(obj, L02, jSONReader.P1(ft8Var.d(L02)));
            } else if ((jSONReader.B0(j) & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
                jSONReader.b3();
            } else {
                throw new JSONException("Unknown Property " + jSONReader.L0());
            }
        } else {
            g79Var.J(jSONReader, obj);
        }
    }

    public T l(JSONReader jSONReader, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.e;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String a1 = jSONReader.a1(str);
        if ((jSONReader.B0(j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.f23271a;
            }
            List V1 = jSONReader.V1(type);
            if (V1.size() == 1) {
                return (T) V1.get(0);
            }
            if (V1.size() == 0) {
                return null;
            }
            if (V1.size() == 1) {
                return (T) V1.get(0);
            }
        }
        throw new JSONException(a1);
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    public /* synthetic */ Object n(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.j(this, jSONReader, type, obj, j);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130 A[SYNTHETIC] */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r24, java.lang.reflect.Type r25, java.lang.Object r26, long r27) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ldk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    public void p(JSONReader jSONReader, Object obj, long j) {
        if (jSONReader.C1()) {
            jSONReader.w1();
        } else if (jSONReader.F1()) {
            while (!jSONReader.E1()) {
                g79 u = u(jSONReader.h2());
                if (u == null && jSONReader.q1(v() | j)) {
                    u = h(jSONReader.P0());
                }
                if (u == null) {
                    k(jSONReader, obj, j);
                } else {
                    u.L(jSONReader, obj);
                }
            }
            jSONReader.w1();
        } else {
            throw new JSONException(jSONReader.Z0());
        }
    }

    @Override // tb.jdk
    public /* synthetic */ Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return cdk.k(this, jSONReader, type, obj, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.i(this, jSONReader, type, obj, j);
        throw null;
    }

    @Override // tb.jdk
    public void s(Object obj, String str, Object obj2, long j) {
        g79 g79Var = this.g;
        if (g79Var != null && obj != null) {
            g79Var.m(obj, str, obj2);
        } else if ((j & JSONReader.Feature.ErrorOnUnknownProperties.mask) != 0) {
            throw new JSONException("Unknown Property " + str);
        }
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        return cdk.b(this, objectReaderProvider, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    public void y(JSONReader.a aVar) {
        this.j = aVar;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    public final jdk c(JSONReader jSONReader, Class cls, long j) {
        if (!jSONReader.B1()) {
            return null;
        }
        long T2 = jSONReader.T2();
        long B0 = jSONReader.B0(this.d | j);
        JSONReader.c cVar = jSONReader.f2453a;
        JSONReader.a d = cVar.d();
        if (d != null) {
            Class<?> c = d.c(T2, cls, j);
            if (c == null) {
                String U0 = jSONReader.U0();
                Class<?> b = d.b(U0, cls, j);
                if (b == null || cls.isAssignableFrom(b)) {
                    c = b;
                } else if ((jSONReader.B0(j) & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                    c = cls;
                } else {
                    throw new JSONException("type not match. " + U0 + " -> " + cls.getName());
                }
            }
            return cVar.g(c);
        }
        jdk S0 = jSONReader.S0(T2, cls, j);
        if (S0 != null) {
            Class<?> b2 = S0.b();
            if (cls == null || b2 == null || cls.isAssignableFrom(b2)) {
                if (T2 == f()) {
                    return this;
                }
                if ((JSONReader.Feature.SupportAutoType.mask & B0) == 0) {
                    return null;
                }
                return S0;
            } else if ((JSONReader.Feature.IgnoreAutoTypeNotMatch.mask & B0) != 0) {
                return cVar.g(cls);
            } else {
                throw new JSONException("type not match. " + this.e + " -> " + cls.getName());
            }
        } else {
            throw new JSONException(jSONReader.a1("auotype not support"));
        }
    }

    public void g(Object obj) {
    }
}
