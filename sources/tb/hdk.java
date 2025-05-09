package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hdk<T> extends kdk<T> {
    public final g79 A;
    public final g79 B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final g79 x;
    public final g79 y;
    public final g79 z;

    public hdk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
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
        g79 g79Var5 = g79VarArr[4];
        this.B = g79Var5;
        this.C = g79Var.m;
        this.D = g79Var2.m;
        this.E = g79Var3.m;
        this.F = g79Var4.m;
        this.G = g79Var5.m;
        this.H = g79Var.n;
        this.I = g79Var2.n;
        this.J = g79Var3.n;
        this.K = g79Var4.n;
        this.L = g79Var5.n;
        this.h = (g79Var.j == null && g79Var2.j == null && g79Var3.j == null && g79Var4.j == null && g79Var5.j == null) ? z : true;
    }

    @Override // tb.kdk
    public void A(T t) {
        this.x.l(t);
        this.y.l(t);
        this.z.l(t);
        this.A.l(t);
        this.B.l(t);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 h(long j) {
        if (j == this.H) {
            return this.x;
        }
        if (j == this.I) {
            return this.y;
        }
        if (j == this.J) {
            return this.z;
        }
        if (j == this.K) {
            return this.A;
        }
        if (j == this.L) {
            return this.B;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
        if (r3 == null) goto L_0x00e0;
     */
    @Override // tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r21, java.lang.reflect.Type r22, java.lang.Object r23, long r24) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hdk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        g79 g79Var;
        k2a k2aVar;
        g79 g79Var2;
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        boolean b1 = jSONReader.b1();
        k2a k2aVar2 = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var3 = this.B;
        g79 g79Var4 = this.A;
        g79 g79Var5 = this.z;
        g79 g79Var6 = this.y;
        g79 g79Var7 = this.x;
        if (b1) {
            T t2 = supplier.get();
            int c3 = jSONReader.c3();
            if (c3 > 0) {
                g79Var7.L(jSONReader, t2);
                if (c3 > 1) {
                    g79Var6.L(jSONReader, t2);
                    if (c3 > 2) {
                        g79Var5.L(jSONReader, t2);
                        if (c3 > 3) {
                            g79Var4.L(jSONReader, t2);
                            if (c3 > 4) {
                                g79Var3.L(jSONReader, t2);
                                for (int i = 5; i < c3; i++) {
                                    jSONReader.b3();
                                }
                            }
                        }
                    }
                }
            }
            if (k2aVar2 != null) {
                return (T) k2aVar2.apply(t2);
            }
            return t2;
        }
        long f = f();
        long j2 = this.d | j;
        g79 g79Var8 = g79Var3;
        g79 g79Var9 = g79Var4;
        jdk c0 = jSONReader.c0(this.f23271a, f, j2);
        if (!(c0 == null || c0.b() == cls)) {
            return (T) c0.q(jSONReader, type, obj, j);
        }
        if (jSONReader.y1((byte) -90)) {
            long j3 = 0;
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
                if (h2 != j3) {
                    if (h2 == this.C) {
                        g79Var7.L(jSONReader, t);
                    } else if (h2 == this.D) {
                        g79Var6.L(jSONReader, t);
                    } else if (h2 == this.E) {
                        g79Var5.L(jSONReader, t);
                    } else {
                        if (h2 == this.F) {
                            g79Var2 = g79Var9;
                            g79Var2.L(jSONReader, t);
                            k2aVar = k2aVar2;
                            g79Var = g79Var8;
                        } else {
                            k2aVar = k2aVar2;
                            g79Var2 = g79Var9;
                            if (h2 == this.G) {
                                g79Var = g79Var8;
                                g79Var.L(jSONReader, t);
                            } else {
                                g79Var = g79Var8;
                                if (!jSONReader.q1(j2)) {
                                    k(jSONReader, t, j);
                                    g79Var9 = g79Var2;
                                    k2aVar2 = k2aVar;
                                    g79Var8 = g79Var;
                                    j2 = j2;
                                    j3 = 0;
                                } else {
                                    long P0 = jSONReader.P0();
                                    j2 = j2;
                                    if (P0 == this.H) {
                                        g79Var7.L(jSONReader, t);
                                    } else if (P0 == this.I) {
                                        g79Var6.L(jSONReader, t);
                                    } else if (P0 == this.J) {
                                        g79Var5.L(jSONReader, t);
                                    } else if (P0 == this.K) {
                                        g79Var2.L(jSONReader, t);
                                    } else if (P0 == this.L) {
                                        g79Var.L(jSONReader, t);
                                    } else {
                                        k(jSONReader, t, j);
                                    }
                                }
                            }
                        }
                        g79Var9 = g79Var2;
                        k2aVar2 = k2aVar;
                        g79Var8 = g79Var;
                        j3 = 0;
                    }
                    k2aVar = k2aVar2;
                    g79Var = g79Var8;
                    g79Var2 = g79Var9;
                    g79Var9 = g79Var2;
                    k2aVar2 = k2aVar;
                    g79Var8 = g79Var;
                    j3 = 0;
                }
            }
            return k2aVar2 != null ? (T) k2aVar2.apply(t) : t;
        }
        throw new JSONException("expect object, but " + yqf.b(jSONReader.W0()));
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
                if (c3 > 2) {
                    this.z.L(jSONReader, t);
                    if (c3 > 3) {
                        this.A.L(jSONReader, t);
                        if (c3 > 4) {
                            this.B.L(jSONReader, t);
                            for (int i = 5; i < c3; i++) {
                                jSONReader.b3();
                            }
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
        if (j == this.C) {
            return this.x;
        }
        if (j == this.D) {
            return this.y;
        }
        if (j == this.E) {
            return this.z;
        }
        if (j == this.F) {
            return this.A;
        }
        if (j == this.G) {
            return this.B;
        }
        return null;
    }
}
