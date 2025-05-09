package tb;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class x6o<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile AtomicReferenceArray<T> f31182a;

    public x6o(int i) {
        this.f31182a = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.f31182a.length();
    }

    public final T b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.f31182a;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.f31182a;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(hfn.c(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.f31182a = atomicReferenceArray2;
    }
}
