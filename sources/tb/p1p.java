package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001974);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        Context f2 = j3p.f();
        if (f2 == null) {
            return 0;
        }
        return (int) (f * f2.getResources().getDisplayMetrics().density);
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7ca4172", new Object[]{new Float(f)})).floatValue();
        }
        Context f2 = j3p.f();
        if (f2 == null) {
            return 0.0f;
        }
        return f * f2.getResources().getDisplayMetrics().density;
    }

    public static int c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f78b", new Object[]{new Float(f)})).intValue();
        }
        Context f2 = j3p.f();
        if (f2 == null) {
            return 0;
        }
        return (int) (f / f2.getResources().getDisplayMetrics().density);
    }

    public static float d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3abeafc4", new Object[]{new Float(f)})).floatValue();
        }
        Context f2 = j3p.f();
        if (f2 == null) {
            return 0.0f;
        }
        return f / f2.getResources().getDisplayMetrics().density;
    }
}
