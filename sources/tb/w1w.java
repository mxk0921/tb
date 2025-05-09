package tb;

import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w1w<K, A> extends pw1<K, A> {
    public final A i;

    public w1w(fmh<A> fmhVar) {
        this(fmhVar, null);
    }

    @Override // tb.pw1
    public float c() {
        return 1.0f;
    }

    @Override // tb.pw1
    public A h() {
        fmh<A> fmhVar = this.e;
        float f = f();
        float f2 = f();
        float f3 = f();
        A a2 = this.i;
        return fmhVar.b(0.0f, 0.0f, a2, a2, f, f2, f3);
    }

    @Override // tb.pw1
    public A i(w4g<K> w4gVar, float f) {
        return h();
    }

    @Override // tb.pw1
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override // tb.pw1
    public void m(float f) {
        this.d = f;
    }

    public w1w(fmh<A> fmhVar, A a2) {
        super(Collections.emptyList());
        n(fmhVar);
        this.i = a2;
    }
}
