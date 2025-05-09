package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class gwu implements Iterable<fwu>, rzf {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f20277a;
    public final int b;
    public final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ gwu(int i, int i2, int i3, a07 a07Var) {
        this(i, i2, i3);
    }

    public int a() {
        return e();
    }

    public int b() {
        return d();
    }

    public final int d() {
        return this.f20277a;
    }

    public final int e() {
        return this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator<fwu> iterator() {
        return new hwu(this.f20277a, this.b, this.c, null);
    }

    public gwu(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f20277a = i;
            this.b = iyu.d(i, i2, i3);
            this.c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
