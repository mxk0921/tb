package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class n3y<TResult> implements ym8<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private xpk<TResult> f24493a;
    Executor b;
    private final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ tct f24494a;

        public a(tct tctVar) {
            this.f24494a = tctVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (n3y.this.c) {
                try {
                    if (n3y.this.f24493a != null) {
                        n3y.this.f24493a.onComplete(this.f24494a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public n3y(Executor executor, xpk<TResult> xpkVar) {
        this.f24493a = xpkVar;
        this.b = executor;
    }

    @Override // tb.ym8
    public final void cancel() {
        synchronized (this.c) {
            this.f24493a = null;
        }
    }

    @Override // tb.ym8
    public final void onComplete(tct<TResult> tctVar) {
        this.b.execute(new a(tctVar));
    }
}
