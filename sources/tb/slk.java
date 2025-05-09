package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class slk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055303);
    }

    public static long a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33286eba", new Object[]{bArr, new Integer(i), new Integer(i2)})).longValue();
        }
        int i3 = i2 + i;
        long j = 0;
        boolean z = true;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            if (b == 32 || b == 48) {
                if (!z) {
                    if (b == 32) {
                        break;
                    }
                } else {
                    continue;
                    i++;
                }
            }
            j = (j << 3) + (b - 48);
            z = false;
            i++;
        }
        return j;
    }
}
