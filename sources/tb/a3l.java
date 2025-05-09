package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a3l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15527a;

    static {
        String g = vav.g(c9x.CART_BIZ_NAME, "silenceErrorCodesOfAddBag", null);
        if (!TextUtils.isEmpty(g)) {
            f15527a = g;
        }
    }

    public static void a(String str, long j, boolean z, String str2, String str3) {
        float f;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a933ab58", new Object[]{str, new Long(j), new Boolean(z), str2, str3});
            return;
        }
        p5j a2 = p5j.a(c9x.CART_BIZ_NAME, str, z, ub3.PID, "http://taobao.com/jstracker/addbag.html");
        if (z) {
            f = 0.001f;
        } else {
            f = 1.0f;
        }
        p5j m = a2.sampling(f).m(System.currentTimeMillis() - j);
        if (TextUtils.isEmpty(str2) || !f15527a.contains(str2)) {
            z2 = false;
        }
        f9v.r(m.l(z2).b(str2).message(str3));
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{str, str2});
            return;
        }
        xh8 b = xh8.b(c9x.CART_BIZ_NAME, ub3.PID, "http://taobao.com/jstracker/android/cart.html");
        b.sampling(1.0f).c(str).message(str2);
        f9v.q(b);
    }
}
