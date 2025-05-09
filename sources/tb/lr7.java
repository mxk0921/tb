package tb;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f23527a = -1.0f;
    public static int b = -1;
    public static int c;

    static {
        t2o.a(664797282);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * c()) + 0.5f);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        if (f23527a < 0.0f) {
            e();
        }
        return f23527a;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (b < 0) {
            e();
        }
        return b;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa2585", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = hjp.a().getResources().getDisplayMetrics();
        String str = Build.DEVICE;
        if (str.equalsIgnoreCase("mx2")) {
            c = 96;
        }
        Configuration configuration = hjp.a().getResources().getConfiguration();
        if (str.equalsIgnoreCase("mx2")) {
            c = 96;
        }
        if (configuration.orientation == 2) {
            int i = displayMetrics.heightPixels;
            f23527a = displayMetrics.density;
            b = displayMetrics.widthPixels - c;
            return;
        }
        int i2 = displayMetrics.widthPixels;
        f23527a = displayMetrics.density;
        b = displayMetrics.heightPixels - c;
    }
}
