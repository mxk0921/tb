package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t3l {

    /* renamed from: a  reason: collision with root package name */
    public long f28470a;
    public String b;
    public final String c;

    static {
        t2o.a(147849255);
    }

    public t3l(String str) {
        this.c = str;
    }

    public boolean a() {
        if (this.f28470a > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f28470a = 0L;
    }

    public void d(long j) {
        this.f28470a = j;
    }

    public void e(String str) {
        this.b = str;
    }

    public void c(int i) {
    }
}
