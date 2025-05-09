package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ain {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_LOAD_ON_FLING = true;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15763a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f6d337", new Object[0]);
        }
        String str = Build.CPU_ABI;
        if (str == null || str.length() == 0 || str.equals("Unknown")) {
            str = "armeabi";
        }
        return str.toLowerCase();
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1b4dd", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfaea77", new Object[0])).booleanValue();
        }
        if (f15763a == null) {
            f15763a = Boolean.valueOf(TextUtils.equals(a(), "x86"));
        }
        return f15763a.booleanValue();
    }
}
