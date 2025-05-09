package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f22250a = 0;
    public static int b = 0;

    static {
        t2o.a(779093644);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9280c881", new Object[]{context})).booleanValue();
        }
        if (!frr.b()) {
            return !g(context);
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return new n81(context).isAutoPlayVideoUnderCurrentNetwork(context);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (b == 0) {
            b = context.getResources().getDisplayMetrics().heightPixels;
        }
        return b;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (f22250a == 0) {
            f22250a = context.getResources().getDisplayMetrics().widthPixels;
        }
        return f22250a;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f3bfb9a", new Object[0])).booleanValue();
        }
        return i3s.h();
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        return i3s.m(context);
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed9ac165", new Object[]{context})).booleanValue();
        }
        return i3s.n(context);
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f4bc52", new Object[]{context})).booleanValue();
        }
        return i3s.o(context);
    }
}
