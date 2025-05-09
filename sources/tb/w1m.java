package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f30395a = new Random();
    public static final String b = "";
    public static final String c = "";

    static {
        t2o.a(962592999);
    }

    public static String a(Context context) {
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9baa5d", new Object[]{context});
        }
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_ie", "");
                if (!hsq.f(string)) {
                    String str = new String(tp1.a(string.getBytes(), 2), "UTF-8");
                    if (!hsq.f(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
            b2 = b(context);
        } else {
            b2 = null;
        }
        if (hsq.f(b2)) {
            b2 = e();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_ie", new String(tp1.d(b2.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return b2;
    }

    public static synchronized String b(Context context) {
        synchronized (w1m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3ead4363", new Object[]{context});
            }
            return b;
        }
    }

    public static String c(Context context) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b0848f", new Object[]{context});
        }
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_is", "");
                if (!hsq.f(string)) {
                    String str = new String(tp1.a(string.getBytes(), 2), "UTF-8");
                    if (!hsq.f(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
            d = d(context);
        } else {
            d = null;
        }
        if (hsq.f(d)) {
            d = e();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_is", new String(tp1.d(d.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return d;
    }

    public static synchronized String d(Context context) {
        synchronized (w1m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4fa5cb95", new Object[]{context});
            }
            return c;
        }
    }

    public static final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4faa1617", new Object[0]);
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        Random random = f30395a;
        int nextInt = random.nextInt();
        int nextInt2 = random.nextInt();
        byte[] a2 = cef.a(currentTimeMillis);
        byte[] a3 = cef.a(nanoTime);
        byte[] a4 = cef.a(nextInt);
        byte[] a5 = cef.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a2, 0, bArr, 0, 4);
        System.arraycopy(a3, 0, bArr, 4, 4);
        System.arraycopy(a4, 0, bArr, 8, 4);
        System.arraycopy(a5, 0, bArr, 12, 4);
        return tp1.g(bArr, 2);
    }
}
