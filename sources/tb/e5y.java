package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e5y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m9y f18303a;
    public final /* synthetic */ b6y b;

    public e5y(b6y b6yVar, m9y m9yVar) {
        this.b = b6yVar;
        this.f18303a = m9yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            try {
                xcy xcyVar = this.b.f16221a;
                if (xcyVar != null) {
                    this.f18303a.c();
                    ((iay) xcyVar).f21201a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
