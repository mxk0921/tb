package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class edk<T> extends kdk<T> {
    public final long A;
    public final long B;
    public final long C;
    public final g79 x;
    public final g79 y;
    public final long z;

    public edk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        super(cls, str, str2, j, supplier, k2aVar, null, null, null, g79VarArr);
        boolean z = false;
        g79 g79Var = g79VarArr[0];
        this.x = g79Var;
        g79 g79Var2 = g79VarArr[1];
        this.y = g79Var2;
        this.z = g79Var.m;
        this.B = g79Var.n;
        this.A = g79Var2.m;
        this.C = g79Var2.n;
        this.h = (g79Var.j == null && g79Var2.j == null) ? z : true;
    }

    @Override // tb.kdk
    public void A(T t) {
        this.x.l(t);
        this.y.l(t);
    }

    @Override // tb.ldk, tb.jdk
    public T F(JSONReader jSONReader) {
        return o(jSONReader, null, null, this.d);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 h(long j) {
        if (j == this.B) {
            return this.x;
        }
        if (j == this.C) {
            return this.y;
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
            return q(jSONReader, type, obj, j);
        }
        if (jSONReader.C1()) {
            jSONReader.w1();
            return null;
        }
        long j2 = this.d | j;
        long B0 = jSONReader.B0(j2);
        boolean b1 = jSONReader.b1();
        Supplier<T> supplier = this.b;
        g79 g79Var = this.y;
        g79 g79Var2 = this.x;
        if (!b1) {
            jSONReader.F1();
            T t = supplier.get();
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
                } else if (h2 == this.z) {
                    g79Var2.L(jSONReader, t);
                } else if (h2 == this.A) {
                    g79Var.L(jSONReader, t);
                } else {
                    if (jSONReader.q1(j2)) {
                        long P0 = jSONReader.P0();
                        if (P0 == this.B) {
                            g79Var2.L(jSONReader, t);
                        } else if (P0 == this.C) {
                            g79Var.L(jSONReader, t);
                        }
                    }
                    k(jSONReader, t, j);
                    i++;
                }
                i++;
            }
            jSONReader.w1();
            k2a k2aVar = this.c;
            if (k2aVar == null) {
                return t;
            }
            try {
                return (T) k2aVar.apply(t);
            } catch (IllegalStateException e) {
                throw new JSONException(jSONReader.a1("build object error"), e);
            }
        } else if ((JSONReader.Feature.SupportArrayToBean.mask & B0) == 0) {
            return l(jSONReader, type, obj, B0);
        } else {
            jSONReader.t1();
            T t2 = supplier.get();
            if (this.h) {
                A(t2);
            }
            g79Var2.L(jSONReader, t2);
            g79Var.L(jSONReader, t2);
            if (jSONReader.f0() == ']') {
                jSONReader.t1();
                return t2;
            }
            throw new JSONException(jSONReader.a1("array to bean end error"));
        }
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        long f = f();
        long j2 = this.d | j;
        jdk c0 = jSONReader.c0(this.f23271a, f, j2);
        if (!(c0 == null || c0.b() == cls)) {
            return (T) c0.q(jSONReader, type, obj, j);
        }
        boolean b1 = jSONReader.b1();
        k2a k2aVar = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var = this.y;
        g79 g79Var2 = this.x;
        if (b1) {
            T t2 = supplier.get();
            if (this.h) {
                A(t2);
            }
            int c3 = jSONReader.c3();
            if (c3 > 0) {
                g79Var2.L(jSONReader, t2);
                if (c3 > 1) {
                    g79Var.L(jSONReader, t2);
                    for (int i = 2; i < c3; i++) {
                        jSONReader.b3();
                    }
                }
            }
            if (k2aVar != null) {
                return (T) k2aVar.apply(t2);
            }
            return t2;
        } else if (jSONReader.y1((byte) -90)) {
            if (supplier != null) {
                t = supplier.get();
            } else if ((JSONReader.Feature.FieldBased.mask & (jSONReader.f2453a.c | j)) != 0) {
                try {
                    t = (T) opf.UNSAFE.allocateInstance(cls);
                } catch (InstantiationException e) {
                    throw new JSONException(jSONReader.a1("create instance error"), e);
                }
            } else {
                t = null;
            }
            if (t != null && this.h) {
                A(t);
            }
            if (t != null && jSONReader.g1()) {
                g(t);
            }
            while (!jSONReader.y1((byte) -91)) {
                long h2 = jSONReader.h2();
                if (h2 != 0) {
                    if (h2 == this.z) {
                        g79Var2.L(jSONReader, t);
                    } else if (h2 == this.A) {
                        g79Var.M(jSONReader, t);
                    } else {
                        if (jSONReader.q1(j2)) {
                            long P0 = jSONReader.P0();
                            if (P0 == this.B) {
                                g79Var2.M(jSONReader, t);
                            } else if (P0 == this.C) {
                                g79Var.M(jSONReader, t);
                            }
                        }
                        k(jSONReader, t, j);
                    }
                }
            }
            return k2aVar != null ? (T) k2aVar.apply(t) : t;
        } else {
            throw new JSONException(jSONReader.a1("expect object, but " + yqf.b(jSONReader.W0())));
        }
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
            if (c3 > 1) {
                this.y.L(jSONReader, t);
                for (int i = 2; i < c3; i++) {
                    jSONReader.b3();
                }
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
        if (j == this.z) {
            return this.x;
        }
        if (j == this.A) {
            return this.y;
        }
        return null;
    }
}
