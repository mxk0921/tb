package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378910);
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        try {
            if (a(str)) {
                return false;
            }
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static float c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        try {
            if (a(str)) {
                return 0.0f;
            }
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
