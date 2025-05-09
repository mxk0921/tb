package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fdk<T> extends kdk<T> {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final g79 x;
    public final g79 y;
    public final g79 z;

    public fdk(Class cls, String str, String str2, long j, Supplier<T> supplier, k2a k2aVar, g79... g79VarArr) {
        super(cls, str, str2, j, supplier, k2aVar, null, null, null, g79VarArr);
        boolean z = false;
        g79 g79Var = g79VarArr[0];
        this.x = g79Var;
        g79 g79Var2 = g79VarArr[1];
        this.y = g79Var2;
        g79 g79Var3 = g79VarArr[2];
        this.z = g79Var3;
        this.A = g79Var.m;
        this.B = g79Var2.m;
        this.C = g79Var3.m;
        this.D = g79Var.n;
        this.E = g79Var2.n;
        this.F = g79Var3.n;
        this.h = (g79Var.j == null && g79Var2.j == null && g79Var3.j == null) ? z : true;
    }

    @Override // tb.kdk
    public void A(T t) {
        this.x.l(t);
        this.y.l(t);
        this.z.l(t);
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 h(long j) {
        if (j == this.D) {
            return this.x;
        }
        if (j == this.E) {
            return this.y;
        }
        if (j == this.F) {
            return this.z;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r5 == null) goto L_0x00b2;
     */
    @Override // tb.ldk, tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T o(com.alibaba.fastjson2.JSONReader r21, java.lang.reflect.Type r22, java.lang.Object r23, long r24) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fdk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public T q(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        k2a k2aVar;
        long j2;
        boolean z = this.i;
        Class cls = this.f23271a;
        if (!z) {
            jSONReader.u0(cls);
        }
        boolean b1 = jSONReader.b1();
        k2a k2aVar2 = this.c;
        Supplier<T> supplier = this.b;
        g79 g79Var = this.z;
        g79 g79Var2 = this.y;
        g79 g79Var3 = this.x;
        if (b1) {
            T t2 = supplier.get();
            int c3 = jSONReader.c3();
            if (c3 > 0) {
                g79Var3.L(jSONReader, t2);
                if (c3 > 1) {
                    g79Var2.L(jSONReader, t2);
                    if (c3 > 2) {
                        g79Var.L(jSONReader, t2);
                        for (int i = 3; i < c3; i++) {
                            jSONReader.b3();
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
        long j3 = this.d | j;
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
                    long j5 = this.A;
                    if (h2 == j5) {
                        g79Var3.L(jSONReader, t);
                        k2aVar = k2aVar2;
                    } else {
                        k2aVar = k2aVar2;
                        long j6 = this.B;
                        if (h2 == j6) {
                            g79Var2.L(jSONReader, t);
                        } else {
                            long j7 = this.C;
                            if (h2 == j7) {
                                g79Var.L(jSONReader, t);
                            } else {
                                j2 = j3;
                                if (!jSONReader.q1(j2)) {
                                    k(jSONReader, t, j);
                                } else {
                                    long P0 = jSONReader.P0();
                                    if (P0 == j5) {
                                        g79Var3.L(jSONReader, t);
                                    } else if (P0 == j6) {
                                        g79Var2.L(jSONReader, t);
                                    } else if (P0 == j7) {
                                        g79Var.L(jSONReader, t);
                                    } else {
                                        k(jSONReader, t, j);
                                    }
                                }
                                j3 = j2;
                                k2aVar2 = k2aVar;
                                j4 = 0;
                            }
                        }
                    }
                    j2 = j3;
                    j3 = j2;
                    k2aVar2 = k2aVar;
                    j4 = 0;
                }
            }
            return k2aVar2 != null ? (T) k2aVar2.apply(t) : t;
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
        T t = this.b.get();
        int c3 = jSONReader.c3();
        if (c3 > 0) {
            this.x.L(jSONReader, t);
            if (c3 > 1) {
                this.y.L(jSONReader, t);
                if (c3 > 2) {
                    this.z.L(jSONReader, t);
                    for (int i = 3; i < c3; i++) {
                        jSONReader.b3();
                    }
                }
            }
        }
        for (int i2 = 3; i2 < c3; i2++) {
            jSONReader.b3();
        }
        k2a k2aVar = this.c;
        if (k2aVar != null) {
            return (T) k2aVar.apply(t);
        }
        return t;
    }

    @Override // tb.kdk, tb.ldk, tb.jdk
    public g79 u(long j) {
        if (j == this.A) {
            return this.x;
        }
        if (j == this.B) {
            return this.y;
        }
        if (j == this.C) {
            return this.z;
        }
        return null;
    }
}
