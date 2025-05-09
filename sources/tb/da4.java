package tb;

import kotlinx.coroutines.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class da4 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17676a;
    public final g23 b;
    public final g1a<Throwable, xhv> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public da4(Object obj, g23 g23Var, g1a<? super Throwable, xhv> g1aVar, Object obj2, Throwable th) {
        this.f17676a = obj;
        this.b = g23Var;
        this.c = g1aVar;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ da4 b(da4 da4Var, Object obj, g23 g23Var, g1a g1aVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = da4Var.f17676a;
        }
        if ((i & 2) != 0) {
            g23Var = da4Var.b;
        }
        if ((i & 4) != 0) {
            g1aVar = da4Var.c;
        }
        if ((i & 8) != 0) {
            obj2 = da4Var.d;
        }
        if ((i & 16) != 0) {
            th = da4Var.e;
        }
        return da4Var.a(obj, g23Var, g1aVar, obj2, th);
    }

    public final da4 a(Object obj, g23 g23Var, g1a<? super Throwable, xhv> g1aVar, Object obj2, Throwable th) {
        return new da4(obj, g23Var, g1aVar, obj2, th);
    }

    public final boolean c() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final void d(c<?> cVar, Throwable th) {
        g23 g23Var = this.b;
        if (g23Var != null) {
            cVar.k(g23Var, th);
        }
        g1a<Throwable, xhv> g1aVar = this.c;
        if (g1aVar != null) {
            cVar.o(g1aVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da4)) {
            return false;
        }
        da4 da4Var = (da4) obj;
        if (ckf.b(this.f17676a, da4Var.f17676a) && ckf.b(this.b, da4Var.b) && ckf.b(this.c, da4Var.c) && ckf.b(this.d, da4Var.d) && ckf.b(this.e, da4Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        Object obj = this.f17676a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i6 = i * 31;
        g23 g23Var = this.b;
        if (g23Var == null) {
            i2 = 0;
        } else {
            i2 = g23Var.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        g1a<Throwable, xhv> g1aVar = this.c;
        if (g1aVar == null) {
            i3 = 0;
        } else {
            i3 = g1aVar.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            i4 = 0;
        } else {
            i4 = obj2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i5 = th.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f17676a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ da4(Object obj, g23 g23Var, g1a g1aVar, Object obj2, Throwable th, int i, a07 a07Var) {
        this(obj, (i & 2) != 0 ? null : g23Var, (i & 4) != 0 ? null : g1aVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
