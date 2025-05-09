package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class b6y<TResult> implements dcy<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final xcy f16221a;
    public final Executor b;
    public final Object c = new Object();

    public b6y(Executor executor, xcy xcyVar) {
        this.f16221a = xcyVar;
        this.b = executor;
    }

    @Override // tb.dcy
    public final void a(m9y m9yVar) {
        if (!m9yVar.f()) {
            m9yVar.e();
            this.b.execute(new e5y(this, m9yVar));
        }
    }
}
