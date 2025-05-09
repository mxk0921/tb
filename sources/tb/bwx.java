package tb;

import java.util.concurrent.Executor;
import tb.l9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bwx<TResult> implements ym8<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private rpk f16693a;
    private Executor b;
    private final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (bwx.this.c) {
                try {
                    if (bwx.this.f16693a != null) {
                        ((l9y.b) bwx.this.f16693a).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public bwx(Executor executor, rpk rpkVar) {
        this.f16693a = rpkVar;
        this.b = executor;
    }

    @Override // tb.ym8
    public final void cancel() {
        synchronized (this.c) {
            this.f16693a = null;
        }
    }

    @Override // tb.ym8
    public final void onComplete(tct<TResult> tctVar) {
        if (tctVar.f()) {
            this.b.execute(new a());
        }
    }
}
