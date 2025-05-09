package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import tb.ort;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class nrt<T extends ort & Comparable<? super T>> {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(nrt.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    public T[] f24911a;
    @Volatile
    public volatile int b;

    public final void a(T t) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        t.b(this);
        T[] f = f();
        int c2 = c();
        j(c2 + 1);
        f[c2] = t;
        t.a(c2);
        l(c2);
    }

    public final T b() {
        T[] tArr = this.f24911a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return c.get(this);
    }

    public final boolean d() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final T[] f() {
        T[] tArr = this.f24911a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ort[4];
            this.f24911a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            ckf.f(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((ort[]) copyOf);
            this.f24911a = tArr3;
            return tArr3;
        }
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            if (t.e() == null) {
                z = false;
            } else {
                int index = t.getIndex();
                String str = dv6.DEBUG_PROPERTY_NAME;
                h(index);
                z = true;
            }
        }
        return z;
    }

    public final T h(int i) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        T[] tArr = this.f24911a;
        ckf.d(tArr);
        j(c() - 1);
        if (i < c()) {
            m(i, c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                ckf.d(t);
                T t2 = tArr[i2];
                ckf.d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i, i2);
                    l(i2);
                }
            }
            k(i);
        }
        T t3 = tArr[c()];
        ckf.d(t3);
        t3.b(null);
        t3.a(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T t;
        synchronized (this) {
            if (c() > 0) {
                t = h(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    public final void j(int i) {
        c.set(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L_0x002c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto L_0x000b
            return
        L_0x000b:
            T extends tb.ort & java.lang.Comparable<? super T>[] r2 = r5.f24911a
            tb.ckf.d(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L_0x002b
            r3 = r2[r0]
            tb.ckf.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            tb.ckf.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r1 = r2[r6]
            tb.ckf.d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            tb.ckf.d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L_0x003f
            return
        L_0x003f:
            r5.m(r6, r0)
            r6 = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nrt.k(int):void");
    }

    public final void l(int i) {
        while (i > 0) {
            T[] tArr = this.f24911a;
            ckf.d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            ckf.d(t);
            T t2 = tArr[i];
            ckf.d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void m(int i, int i2) {
        T[] tArr = this.f24911a;
        ckf.d(tArr);
        T t = tArr[i2];
        ckf.d(t);
        T t2 = tArr[i];
        ckf.d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.a(i);
        t2.a(i2);
    }
}
