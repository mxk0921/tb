package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ac1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544368);
    }

    public static int a(long[] jArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99617008", new Object[]{jArr, new Long(j)})).intValue();
        }
        if (jArr == null) {
            return -1;
        }
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }
}
