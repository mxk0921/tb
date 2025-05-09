package tb;

import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vvi extends fzh implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f30280a;
    public final String b;

    public vvi(Throwable th, String str) {
        this.f30280a = th;
        this.b = str;
    }

    public Void P0(d dVar, Runnable runnable) {
        Q0();
        throw null;
    }

    public final Void Q0() {
        String str;
        Throwable th = this.f30280a;
        if (th != null) {
            String str2 = this.b;
            if (str2 == null || (str = ". ".concat(str2)) == null) {
                str = "";
            }
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str), th);
        }
        ozh.d();
        throw null;
    }

    public Void R0(long j, q23<? super xhv> q23Var) {
        Q0();
        throw null;
    }

    @Override // kotlinx.coroutines.h
    public rr7 b(long j, Runnable runnable, d dVar) {
        Q0();
        throw null;
    }

    @Override // kotlinx.coroutines.h
    public /* bridge */ /* synthetic */ void c(long j, q23 q23Var) {
        R0(j, q23Var);
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public /* bridge */ /* synthetic */ void dispatch(d dVar, Runnable runnable) {
        P0(dVar, runnable);
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(d dVar) {
        Q0();
        throw null;
    }

    @Override // tb.fzh, kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        Q0();
        throw null;
    }

    @Override // tb.fzh, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        Throwable th = this.f30280a;
        if (th != null) {
            str = ", cause=" + th;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // tb.fzh
    public fzh N0() {
        return this;
    }
}
