package tb;

import kotlin.coroutines.d;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class luo extends ExecutorCoroutineDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final int f23577a;
    public final int b;
    public final long c;
    public final String d;
    public final CoroutineScheduler e = N0();

    public luo(int i, int i2, long j, String str) {
        this.f23577a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
    }

    public final CoroutineScheduler N0() {
        return new CoroutineScheduler(this.f23577a, this.b, this.c, this.d);
    }

    public final void O0(Runnable runnable, gdt gdtVar, boolean z) {
        this.e.F(runnable, gdtVar, z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        CoroutineScheduler.L(this.e, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d dVar, Runnable runnable) {
        CoroutineScheduler.L(this.e, runnable, null, true, 2, null);
    }
}
