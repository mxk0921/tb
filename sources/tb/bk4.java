package tb;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class bk4<T> implements sbp<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<sbp<T>> f16441a;

    public bk4(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "sequence");
        this.f16441a = new AtomicReference<>(sbpVar);
    }

    @Override // tb.sbp
    public Iterator<T> iterator() {
        sbp<T> andSet = this.f16441a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
