package tb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ne1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final hwl f24673a = new hwl();
    private final hj8 b;

    public ne1(hj8 hj8Var) {
        this.b = hj8Var;
    }

    public void a(gwq gwqVar, Object obj) {
        this.f24673a.a(fwl.a(gwqVar, obj));
        this.b.e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        fwl b = this.f24673a.b();
        if (b != null) {
            this.b.g(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
