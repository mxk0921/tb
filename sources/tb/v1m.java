package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593000);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9baa5d", new Object[]{context});
        }
        String b = w1m.b(context);
        if (hsq.f(b)) {
            return c();
        }
        return b;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b0848f", new Object[]{context});
        }
        String d = w1m.d(context);
        if (hsq.f(d)) {
            return c();
        }
        return d;
    }

    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4faa1617", new Object[0]);
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] a2 = cef.a(currentTimeMillis);
        byte[] a3 = cef.a(nanoTime);
        byte[] a4 = cef.a(nextInt);
        byte[] a5 = cef.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a2, 0, bArr, 0, 4);
        System.arraycopy(a3, 0, bArr, 4, 4);
        System.arraycopy(a4, 0, bArr, 8, 4);
        System.arraycopy(a5, 0, bArr, 12, 4);
        return hq1.i(bArr);
    }
}
