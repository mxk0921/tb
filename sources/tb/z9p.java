package tb;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.d;
import kotlinx.coroutines.sync.SemaphoreKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class z9p extends v8p<z9p> {
    public final AtomicReferenceArray h;

    public z9p(long j, z9p z9pVar, int i) {
        super(j, z9pVar, i);
        int i2;
        i2 = SemaphoreKt.f;
        this.h = new AtomicReferenceArray(i2);
    }

    @Override // tb.v8p
    public int n() {
        int i;
        i = SemaphoreKt.f;
        return i;
    }

    @Override // tb.v8p
    public void o(int i, Throwable th, d dVar) {
        u1r u1rVar;
        u1rVar = SemaphoreKt.e;
        r().set(i, u1rVar);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.h;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
