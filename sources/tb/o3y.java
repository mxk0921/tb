package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class o3y<TResult> implements dcy<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final ucy<TResult> f25131a;
    public final Executor b;
    public final Object c = new Object();

    public o3y(Executor executor, ucy<TResult> ucyVar) {
        this.f25131a = ucyVar;
        this.b = executor;
    }

    @Override // tb.dcy
    public final void a(m9y m9yVar) {
        this.b.execute(new nyx(this, m9yVar));
    }
}
