package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class t9y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097498);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
