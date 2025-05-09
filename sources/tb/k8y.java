package tb;

import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class k8y<TResult> implements ym8<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private fvk<TResult> f22481a;
    private Executor b;
    private final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ tct f22482a;

        public a(tct tctVar) {
            this.f22482a = tctVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (k8y.this.c) {
                try {
                    if (k8y.this.f22481a != null) {
                        k8y.this.f22481a.onSuccess(this.f22482a.e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public k8y(Executor executor, fvk<TResult> fvkVar) {
        this.f22481a = fvkVar;
        this.b = executor;
    }

    @Override // tb.ym8
    public final void cancel() {
        synchronized (this.c) {
            this.f22481a = null;
        }
    }

    @Override // tb.ym8
    public final void onComplete(tct<TResult> tctVar) {
        if (tctVar.h() && !tctVar.f()) {
            this.b.execute(new a(tctVar));
        }
    }
}
