package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class l8y<TResult> implements dcy<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final idy<TResult> f23187a;
    public final Executor b;
    public final Object c = new Object();

    public l8y(Executor executor, idy<TResult> idyVar) {
        this.f23187a = idyVar;
        this.b = executor;
    }

    @Override // tb.dcy
    public final void a(m9y m9yVar) {
        if (m9yVar.f()) {
            m9yVar.e();
            this.b.execute(new r7y(this, m9yVar));
        }
    }
}
