package tb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fo1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final hwl f19430a = new hwl();
    private final hj8 b;
    private volatile boolean c;

    public fo1(hj8 hj8Var) {
        this.b = hj8Var;
    }

    public void a(gwq gwqVar, Object obj) {
        fwl a2 = fwl.a(gwqVar, obj);
        synchronized (this) {
            try {
                this.f19430a.a(a2);
                if (!this.c) {
                    this.c = true;
                    this.b.e().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    fwl c = this.f19430a.c(1000);
                    if (c == null) {
                        synchronized (this) {
                            c = this.f19430a.b();
                            if (c == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.b.g(c);
                } catch (InterruptedException unused) {
                    Thread.currentThread().getName();
                    this.c = false;
                    return;
                }
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
