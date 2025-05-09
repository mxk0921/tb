package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zwm {

    /* renamed from: a  reason: collision with root package name */
    public final int f33066a;
    public final int b;
    public final int c;
    public static final zwm LIST_HEADER = new zwm(1000, 1000);
    public static final zwm LIST = new zwm(2000, 1000);
    public static final zwm FOLD = new zwm(1000, 1000);
    public static final zwm HALF_STICKY = new zwm(3000, 2000);
    public static final zwm STICKY = new zwm(1000, 3000);

    static {
        t2o.a(993001871);
    }

    public zwm(int i, int i2) {
        this(i, i, i2);
    }

    public zwm(int i, int i2, int i3) {
        this.f33066a = i3;
        this.b = i;
        this.c = i2;
    }
}
