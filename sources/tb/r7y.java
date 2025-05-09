package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r7y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m9y f27175a;
    public final /* synthetic */ l8y b;

    public r7y(l8y l8yVar, m9y m9yVar) {
        this.b = l8yVar;
        this.f27175a = m9yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            try {
                Object obj = this.b.f23187a;
                if (obj != null) {
                    this.f27175a.d();
                    ((iay) obj).f21201a.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
