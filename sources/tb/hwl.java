package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class hwl {

    /* renamed from: a  reason: collision with root package name */
    public fwl f20928a;
    public fwl b;

    public synchronized void a(fwl fwlVar) {
        try {
            if (fwlVar != null) {
                fwl fwlVar2 = this.b;
                if (fwlVar2 != null) {
                    fwlVar2.c = fwlVar;
                    this.b = fwlVar;
                } else if (this.f20928a == null) {
                    this.b = fwlVar;
                    this.f20928a = fwlVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized fwl b() {
        fwl fwlVar;
        fwlVar = this.f20928a;
        if (fwlVar != null) {
            fwl fwlVar2 = fwlVar.c;
            this.f20928a = fwlVar2;
            if (fwlVar2 == null) {
                this.b = null;
            }
        }
        return fwlVar;
    }

    public synchronized fwl c(int i) throws InterruptedException {
        try {
            if (this.f20928a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b();
    }
}
