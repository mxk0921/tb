package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nyx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m9y f25039a;
    public final /* synthetic */ o3y b;

    public nyx(o3y o3yVar, m9y m9yVar) {
        this.b = o3yVar;
        this.f25039a = m9yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            try {
                Object obj = this.b.f25131a;
                if (obj != null) {
                    ((o5b) obj).a(this.f25039a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
