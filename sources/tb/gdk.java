package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gdk<T> extends kdk<T> {
    public final g79 A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final g79 x;
    public final g79 y;
    public final g79 z;

    public gdk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        super(cls, str, str2, j, supplier, k2aVar, null, null, null, g79VarArr);
        boolean z = false;
        g79 g79Var = g79VarArr[0];
        this.x = g79Var;
        g79 g79Var2 = g79VarArr[1];
        this.y = g79Var2;
        g79 g79Var3 = g79VarArr[2];
        this.z = g79Var3;
        g79 g79Var4 = g79VarArr[3];
        this.A = g79Var4;
        this.B = g79Var.m;
        this.C = g79Var2.m;
        this.D = g79Var3.m;
        this.E = g79Var4.m;
        this.F = g79Var.n;
        this.G = g79Var2.n;
        this.H = g79Var3.n;
        this.I = g79Var4.n;
        this.h = (g79Var.j == null && g79Var2.j == null && g79Var3.j == null && g79Var4.j == null) ? z : true;
    }

    @Override // tb.kdk
    public void A(T t) {
        this.x.l(t);
        this.y.l(t);
        this.z.l(t);
        this.A.l(t);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 h(long j) {
        if (j == this.F) {
            return this.x;
        }
        if (j == this.G) {
            return this.y;
        }
        if (j == this.H) {
            return this.z;
        }
        if (j == this.I) {
            return this.A;
        }
        return null;
    }

    @Override // tb.ldk, tb.jdk
    public T o(JSONReader jSONReader, Type type, Object obj, long j) {
        Class cls;
        boolean z = this.i;
        Class cls2 = this.f23271a;
        if (!z) {
            jSONReader.u0(cls2);
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
        if (!jSONReader.b1()) {
            jSONReader.F1();
            T t = this.b.get();
            if (this.h) {
                A(t);
            }
            if (!(t == null || (B0 & JSONReader.Feature.InitStringFieldAsEmpty.mask) == 0)) {
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
                    if (!((h == null && (h = cVar.i(jSONReader.U0(), cls2)) == null) || h == this)) {
                        t = (T) h.o(jSONReader, type, obj, j);
                        break;
                    }
                } else {
                    long j3 = this.B;
                    g79 g79Var = this.x;
                    if (h2 == j3) {
                        g79Var.L(jSONReader, t);
                    } else {
                        long j4 = this.C;
                        g79 g79Var2 = this.y;
                        if (h2 == j4) {
                            g79Var2.L(jSONReader, t);
                        } else {
                            long j5 = this.D;
                            g79 g79Var3 = this.z;
                            if (h2 == j5) {
                                g79Var3.L(jSONReader, t);
                            } else {
                                long j6 = this.E;
                                cls = cls2;
                                g79 g79Var4 = this.A;
                                if (h2 == j6) {
                                    g79Var4.L(jSONReader, t);
                                } else if (!jSONReader.q1(j2)) {
                                    k(jSONReader, t, j);
                                } else {
                                    long P0 = jSONReader.P0();
                                    if (P0 == this.F) {
                                        g79Var.L(jSONReader, t);
                                    } else if (P0 == this.G) {
                                        g79Var2.L(jSONReader, t);
                                    } else if (P0 == this.H) {
                                        g79Var3.L(jSONReader, t);
                                    } else if (P0 == this.I) {
                                        g79Var4.L(jSONReader, t);
                                    } else {
                                        k(jSONReader, t, j);
                                    }
                                }
                                i++;
                                cls2 = cls;
                            }
                        }
                    }
                }
                cls = cls2;
                i++;
                cls2 = cls;
            }
            jSONReader.w1();
            k2a k2aVar = this.c;
            return k2aVar != null ? (T) k2aVar.apply(t) : t;
        } else if ((JSONReader.Feature.SupportArrayToBean.mask & B0) != 0) {
            return n(jSONReader, type, obj, j);
        } else {
            return l(jSONReader, type, obj, B0);
        }
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        long j2;
        g79 g79Var;
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        boolean b1 = jSONReader.b1();
        k2a k2aVar = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var2 = this.A;
        g79 g79Var3 = this.z;
        g79 g79Var4 = this.y;
        g79 g79Var5 = this.x;
        if (b1) {
            T t2 = supplier.get();
            int c3 = jSONReader.c3();
            if (c3 > 0) {
                g79Var5.L(jSONReader, t2);
                if (c3 > 1) {
                    g79Var4.L(jSONReader, t2);
                    if (c3 > 2) {
                        g79Var3.L(jSONReader, t2);
                        if (c3 > 3) {
                            g79Var2.L(jSONReader, t2);
                            for (int i = 4; i < c3; i++) {
                                jSONReader.b3();
                            }
                        }
                    }
                }
            }
            if (k2aVar != null) {
                return (T) k2aVar.apply(t2);
            }
            return t2;
        }
        long f = f();
        long j3 = this.d | j;
        g79 g79Var6 = g79Var2;
        jdk c0 = jSONReader.c0(this.f23271a, f, j3);
        if (!(c0 == null || c0.b() == cls)) {
            return (T) c0.q(jSONReader, type, obj, j);
        }
        if (jSONReader.y1((byte) -90)) {
            long j4 = 0;
            if (supplier != null) {
                t = supplier.get();
            } else if (((jSONReader.f2453a.c | j) & JSONReader.Feature.FieldBased.mask) != 0) {
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
            while (!jSONReader.y1((byte) -91)) {
                long h2 = jSONReader.h2();
                if (h2 != j4) {
                    if (h2 == this.B) {
                        g79Var5.L(jSONReader, t);
                    } else if (h2 == this.C) {
                        g79Var4.L(jSONReader, t);
                    } else if (h2 == this.D) {
                        g79Var3.L(jSONReader, t);
                    } else if (h2 == this.E) {
                        g79Var = g79Var6;
                        g79Var.L(jSONReader, t);
                        j2 = j3;
                        j3 = j2;
                        g79Var6 = g79Var;
                        j4 = 0;
                    } else {
                        g79Var = g79Var6;
                        if (!jSONReader.q1(j3)) {
                            k(jSONReader, t, j);
                            g79Var6 = g79Var;
                            j3 = j3;
                            j4 = 0;
                        } else {
                            long P0 = jSONReader.P0();
                            j2 = j3;
                            if (P0 == this.F) {
                                g79Var5.L(jSONReader, t);
                            } else if (P0 == this.G) {
                                g79Var4.L(jSONReader, t);
                            } else if (P0 == this.H) {
                                g79Var3.L(jSONReader, t);
                            } else if (P0 == this.I) {
                                g79Var.L(jSONReader, t);
                            } else {
                                k(jSONReader, t, j);
                            }
                            j3 = j2;
                            g79Var6 = g79Var;
                            j4 = 0;
                        }
                    }
                    g79Var = g79Var6;
                    j2 = j3;
                    j3 = j2;
                    g79Var6 = g79Var;
                    j4 = 0;
                }
            }
            return k2aVar != null ? (T) k2aVar.apply(t) : t;
        }
        throw new JSONException(jSONReader.a1("expect object, but " + yqf.b(jSONReader.W0())));
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
        int c3 = jSONReader.c3();
        T t = this.b.get();
        if (c3 > 0) {
            this.x.L(jSONReader, t);
            if (c3 > 1) {
                this.y.L(jSONReader, t);
                if (c3 > 2) {
                    this.z.L(jSONReader, t);
                    if (c3 > 3) {
                        this.A.L(jSONReader, t);
                        for (int i = 4; i < c3; i++) {
                            jSONReader.b3();
                        }
                    }
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
        if (j == this.B) {
            return this.x;
        }
        if (j == this.C) {
            return this.y;
        }
        if (j == this.D) {
            return this.z;
        }
        if (j == this.E) {
            return this.A;
        }
        return null;
    }
}
