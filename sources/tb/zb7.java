package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zb7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297592);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        Application c = caa.c();
        if (c == null) {
            return 0;
        }
        return (int) (f * c.getResources().getDisplayMetrics().density);
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7ca4172", new Object[]{new Float(f)})).floatValue();
        }
        Application c = caa.c();
        if (c == null) {
            return 0.0f;
        }
        return f * c.getResources().getDisplayMetrics().density;
    }
}
