package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class de3 extends vav.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f17754a = false;
    public static boolean b = false;
    public static boolean c = false;

    static {
        t2o.a(478150844);
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77200ec0", new Object[]{new Boolean(z)});
        } else {
            f17754a = z;
        }
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eda49bf", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9279dd55", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static /* synthetic */ Object ipc$super(de3 de3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/performance/switcher/CartUltronSwitcher");
    }

    @Override // tb.vav.b
    public float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
        }
        return u8l.m(str, f);
    }

    @Override // tb.vav.b
    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        str.hashCode();
        if (!str.equals(na3.sPageScrollBottomLeftCountToPrefetch)) {
            return u8l.n(str, i);
        }
        return ((Integer) j6v.a("icart_client", "performance", str, Integer.valueOf(i))).intValue();
    }

    @Override // tb.vav.b
    public long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{this, str, new Long(j)})).longValue();
        }
        return u8l.o(str, j);
    }

    @Override // tb.vav.b
    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{this, str, str2});
        }
        str.hashCode();
        if (!str.equals("dimension")) {
            return u8l.p(str, str2);
        }
        return (String) j6v.a("icart_client", "performance_dxbutter", str, "default");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
        if (r7.equals(tb.na3.sLoadImageWhenPreRequest) == false) goto L_0x002f;
     */
    @Override // tb.vav.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.de3.a(java.lang.String, boolean):boolean");
    }
}
