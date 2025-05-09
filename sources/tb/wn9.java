package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wn9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661540);
    }

    public static boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("182d10e8", new Object[]{new Float(f), new Float(f2)})).booleanValue();
        }
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
            return true;
        } else if (Math.abs(f2 - f) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}
