package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286685);
    }

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a4fe4d", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }
}
