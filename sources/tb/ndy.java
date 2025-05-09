package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ndy<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final m9y f24669a = new m9y();

    public void a(Exception exc) {
        m9y m9yVar = this.f24669a;
        synchronized (m9yVar.f23881a) {
            try {
                if (!m9yVar.b) {
                    m9yVar.b = true;
                    m9yVar.d = exc;
                    m9yVar.f23881a.notifyAll();
                    m9yVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(TResult tresult) {
        m9y m9yVar = this.f24669a;
        synchronized (m9yVar.f23881a) {
            try {
                if (!m9yVar.b) {
                    m9yVar.b = true;
                    m9yVar.c = tresult;
                    m9yVar.f23881a.notifyAll();
                    m9yVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
