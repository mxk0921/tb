package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ddk<T> extends kdk<T> {
    public final g79 x;
    public final long y;
    public final long z;

    public ddk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        super(cls, str, str2, j, supplier, k2aVar, null, null, null, g79VarArr);
        boolean z = false;
        g79 g79Var = g79VarArr[0];
        this.x = g79Var;
        this.y = g79Var.m;
        this.z = g79Var.n;
        this.h = g79Var.j != null ? true : z;
    }

    @Override // tb.kdk
    public void A(T t) {
        this.x.l(t);
    }

    @Override // tb.ldk, tb.jdk
    public T F(JSONReader jSONReader) {
        return o(jSONReader, null, null, this.d);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 h(long j) {
        if (j == this.z) {
            return this.x;
        }
        return null;
    }

    @Override // tb.ldk, tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        if (jSONReader.w) {
            return q(jSONReader, type, obj, 0L);
        }
        T t = null;
        if (jSONReader.D1()) {
            return null;
        }
        long j2 = this.d | j;
        long B0 = jSONReader.B0(j2);
        boolean b1 = jSONReader.b1();
        k2a k2aVar = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var = this.x;
        if (!b1) {
            jSONReader.F1();
            if (supplier != null) {
                t = supplier.get();
            }
            if (this.h) {
                A(t);
            }
            if (!(t == null || (JSONReader.Feature.InitStringFieldAsEmpty.mask & B0) == 0)) {
                g(t);
            }
            int i = 0;
            while (true) {
                if (jSONReader.E1()) {
                    break;
                }
                long h2 = jSONReader.h2();
                if (i == 0 && h2 == jdk.HASH_TYPE) {
                    long T2 = jSONReader.T2();
                    JSONReader.c cVar = jSONReader.f2453a;
                    jdk h = cVar.h(T2);
                    if (!((h == null && (h = cVar.i(jSONReader.U0(), cls)) == null) || h == this)) {
                        t = (T) h.o(jSONReader, type, obj, j);
                        break;
                    }
                } else if (h2 == this.y) {
                    g79Var.L(jSONReader, t);
                } else if (!jSONReader.q1(j2) || jSONReader.P0() != this.z) {
                    k(jSONReader, t, j);
                    i++;
                } else {
                    g79Var.L(jSONReader, t);
                }
                i++;
            }
            jSONReader.w1();
            return k2aVar != null ? (T) k2aVar.apply(t) : t;
        } else if ((JSONReader.Feature.SupportArrayToBean.mask & B0) == 0) {
            return l(jSONReader, type, obj, B0);
        } else {
            jSONReader.t1();
            T t2 = supplier.get();
            g79Var.L(jSONReader, t2);
            if (jSONReader.u1()) {
                jSONReader.w1();
                if (k2aVar != null) {
                    return (T) k2aVar.apply(t2);
                }
                return t2;
            }
            throw new JSONException(jSONReader.a1("array to bean end error, " + jSONReader.f0()));
        }
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        g79 g79Var;
        T t;
        g79 g79Var2;
        boolean z = this.i;
        Class<T> cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        long j2 = this.d | j;
        jdk c = c(jSONReader, cls, j2);
        if (!(c == null || c == this || c.b() == cls)) {
            return (T) c.q(jSONReader, type, obj, j);
        }
        boolean b1 = jSONReader.b1();
        k2a k2aVar = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var3 = this.x;
        if (b1) {
            T t2 = supplier.get();
            int c3 = jSONReader.c3();
            if (c3 > 0) {
                g79Var3.L(jSONReader, t2);
                for (int i = 1; i < c3; i++) {
                    jSONReader.b3();
                }
            }
            if (k2aVar != null) {
                return (T) k2aVar.apply(t2);
            }
            return t2;
        }
        int i2 = 0;
        if (!jSONReader.y1((byte) -90)) {
            if (jSONReader.r1()) {
                jSONReader.Z2(false);
            } else {
                throw new JSONException(jSONReader.a1("expect object, but " + yqf.b(jSONReader.W0())));
            }
        }
        long j3 = 0;
        JSONReader.c cVar = jSONReader.f2453a;
        if (supplier != null) {
            t = supplier.get();
            g79Var = g79Var3;
        } else {
            g79Var = g79Var3;
            if (((cVar.c | j) & JSONReader.Feature.FieldBased.mask) != 0) {
                try {
                    t = (T) opf.UNSAFE.allocateInstance(cls);
                } catch (InstantiationException e) {
                    throw new JSONException(jSONReader.a1("create instance error"), e);
                }
            } else {
                t = null;
            }
        }
        if (t != null && this.h) {
            A(t);
        }
        while (!jSONReader.y1((byte) -91)) {
            long h2 = jSONReader.h2();
            if (h2 == m() && i2 == 0) {
                jdk z2 = z(cVar, jSONReader.T2());
                if (z2 == null) {
                    String U0 = jSONReader.U0();
                    jdk i3 = cVar.i(U0, null);
                    if (i3 != null) {
                        z2 = i3;
                    } else {
                        throw new JSONException(jSONReader.a1("auotype not support : " + U0));
                    }
                }
                if (z2 != this) {
                    return (T) z2.q(jSONReader, type, obj, j);
                }
            } else if (h2 != j3) {
                if (h2 == this.y) {
                    g79Var2 = g79Var;
                    g79Var2.M(jSONReader, t);
                } else {
                    g79Var2 = g79Var;
                    if (!jSONReader.q1(j2) || jSONReader.P0() != this.z) {
                        k(jSONReader, t, j);
                    } else {
                        g79Var2.L(jSONReader, t);
                    }
                }
                i2++;
                g79Var = g79Var2;
                j3 = 0;
            }
            g79Var2 = g79Var;
            i2++;
            g79Var = g79Var2;
            j3 = 0;
        }
        return k2aVar != null ? (T) k2aVar.apply(t) : t;
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T r(JSONReader jSONReader, Type type, Object obj, long j) {
        boolean z = this.i;
        Class<T> cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        jdk c = c(jSONReader, cls, this.d | j);
        if (!(c == null || c == this || c.b() == cls)) {
            return (T) c.r(jSONReader, type, obj, j);
        }
        T t = this.b.get();
        int c3 = jSONReader.c3();
        if (c3 > 0) {
            this.x.L(jSONReader, t);
            for (int i = 1; i < c3; i++) {
                jSONReader.b3();
            }
        }
        k2a k2aVar = this.c;
        if (k2aVar != null) {
            return (T) k2aVar.apply(t);
        }
        return t;
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 u(long j) {
        if (j == this.y) {
            return this.x;
        }
        return null;
    }
}
