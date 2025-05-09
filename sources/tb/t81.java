package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f28561a;
    public static String b;
    public static String c;
    public static String d;
    public static Context e;
    public static int f;
    public static int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static final List<String> SCORE = Arrays.asList("10", "1", "0.1", "50", "10");
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9ac854f", new Object[0]);
        }
        return b;
    }

    public static void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            f28561a = str;
        }
    }

    public static void C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            e = context;
        }
    }

    public static void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292780", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e4327e", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{str});
        }
    }

    public static void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bcba6f", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        return f28561a;
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cc9cb91", new Object[0])).floatValue();
        }
        return c21.g().getFloat("coldLaunchTime", -1.0f);
    }

    public static float c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae42c500", new Object[]{list})).floatValue();
        }
        return z(list, b());
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9dd34a0", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return -1;
        }
        if (file.getName().toLowerCase().startsWith("arm64")) {
            return 8;
        }
        return 7;
    }

    public static int e() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a676c22", new Object[0])).intValue();
        }
        if (f == 0 && (context = e) != null) {
            f = d(context.getApplicationInfo().nativeLibraryDir);
        }
        return f;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16ad649", new Object[0]);
        }
        return com.taobao.downgrade.a.US_DATE_FORMAT.format(new Date(System.currentTimeMillis()));
    }

    public static float g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12740cd4", new Object[]{new Boolean(z)})).floatValue();
        }
        if (!z) {
            return 0.0f;
        }
        float f2 = lp0.d().b().d;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public static long[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("b22d5df5", new Object[0]);
        }
        long[] n = n();
        long j = n[0];
        return new long[]{j, j - ((n[1] + n[2]) + n[3])};
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de140d0b", new Object[0])).longValue();
        }
        long[] h = h();
        return h[0] - h[1];
    }

    public static float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b92c9193", new Object[0])).floatValue();
        }
        long[] h = h();
        long j = h[0];
        if (j <= 0) {
            return 0.0f;
        }
        return ((float) h[1]) / ((float) j);
    }

    public static int k(Map<String, Integer> map, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d5eb1ab", new Object[]{map, new Float(f2), new Float(f3), new Float(f4), new Float(f5)})).intValue();
        }
        return (int) (((f2 * map.get(com.taobao.downgrade.a.COLD_LAUNCH).intValue()) / 100.0f) + ((f3 * map.get(com.taobao.downgrade.a.RUNTIME_CPU).intValue()) / 100.0f) + ((f4 * map.get(com.taobao.downgrade.a.RUNTIME_MEM).intValue()) / 100.0f) + ((f5 * map.get(com.taobao.downgrade.a.HARDWARE).intValue()) / 100.0f));
    }

    public static float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372ea4ff", new Object[0])).floatValue();
        }
        return -1.0f;
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("138bd136", new Object[0])).intValue();
        }
        if (g == 0) {
            HardWareInfo a2 = rp0.a();
            if (a2 != null) {
                g = a2.j();
            } else {
                g = -1;
            }
        }
        return g;
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf2af8a", new Object[0]);
        }
        return Build.BRAND;
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22c7928", new Object[0]);
        }
        return c21.g().getString("mobileModel", Build.MODEL);
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("905ef917", new Object[0])).intValue();
        }
        return c21.g().getInt("deviceLevel", -1);
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71fc6525", new Object[0])).intValue();
        }
        int i = (int) c21.g().getFloat(ai7.KEY_NEW_SCORE, -1.0f);
        if (i <= 0) {
            return 100;
        }
        return i;
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[0]);
        }
        return d;
    }

    public static String t() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[0]);
        }
        Activity i = c21.i();
        if (i == null || (intent = i.getIntent()) == null) {
            return null;
        }
        return intent.getDataString();
    }

    public static float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b081619", new Object[0])).floatValue();
        }
        if (A() != null) {
            return (float) ((Math.abs(A().hashCode()) % 10000) / 10000.0d);
        }
        return 0.0f;
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff93a260", new Object[0]);
        }
        return c;
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af9607c8", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static float x(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("530cacf4", new Object[]{list})).floatValue();
        }
        return z(list, g(true) * 100.0f);
    }

    public static float y(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b3d2167", new Object[]{list})).floatValue();
        }
        return z(list, j() * 100.0f);
    }

    public static float z(List<String> list, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db182f17", new Object[]{list, new Float(f2)})).floatValue();
        }
        if (list == null) {
            list = a.SCORE;
        }
        if (list.size() < 5) {
            return -1.0f;
        }
        return ((float) (10.0d - (tvn.c(list.get(0), 10.0f) / (tvn.c(list.get(1), 1.0f) + Math.pow(2.7182817f, (-tvn.c(list.get(2), 0.1f)) * (f2 - tvn.c(list.get(3), 50.0f))))))) * tvn.c(list.get(4), 10.0f);
    }

    public static long[] n() {
        long[] jArr = {-1, -1, -1, -1};
        try {
            Method method = Process.class.getMethod("readProcLines", String.class, String[].class, long[].class);
            String[] strArr = {"MemTotal:", "MemFree:", "Buffers:", "Cached:"};
            long[] jArr2 = {30, -30};
            if (method != null) {
                method.invoke(null, "/proc/meminfo", strArr, jArr2);
                System.arraycopy(jArr2, 0, jArr, 0, 4);
            }
            return jArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jArr;
        }
    }
}
