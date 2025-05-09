package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499256);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98630b09", new Object[]{str})).booleanValue();
        }
        return "cart".equals(str);
    }
}
