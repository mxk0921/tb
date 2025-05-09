package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a6y<TResult> implements ym8<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private qqk f15576a;
    private Executor b;
    private final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ tct f15577a;

        public a(tct tctVar) {
            this.f15577a = tctVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (a6y.this.c) {
                try {
                    if (a6y.this.f15576a != null) {
                        a6y.this.f15576a.onFailure(this.f15577a.d());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public a6y(Executor executor, qqk qqkVar) {
        this.f15576a = qqkVar;
        this.b = executor;
    }

    @Override // tb.ym8
    public final void cancel() {
        synchronized (this.c) {
            this.f15576a = null;
        }
    }

    @Override // tb.ym8
    public final void onComplete(tct<TResult> tctVar) {
        if (!tctVar.h() && !tctVar.f()) {
            this.b.execute(new a(tctVar));
        }
    }
}
