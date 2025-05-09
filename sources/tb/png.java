package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class png {

    /* renamed from: a  reason: collision with root package name */
    public final t42<String> f26196a;

    static {
        t2o.a(945815736);
    }

    public png(pa2 pa2Var) {
        this.f26196a = new t42<>(pa2Var, "unicorn/lifecycle", jqq.INSTANCE);
    }

    public void a() {
        hdh.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f26196a.d("AppLifecycleState.detached");
    }

    public void b() {
        hdh.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f26196a.d("AppLifecycleState.inactive");
    }

    public void c() {
        hdh.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f26196a.d("AppLifecycleState.paused");
    }

    public void d() {
        hdh.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f26196a.d("AppLifecycleState.resumed");
    }

    public static void e() {
    }
}
