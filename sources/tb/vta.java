package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        int i2 = hardWareInfo.k;
        if (i2 == 0 || (i = hardWareInfo.l) == 0) {
            return 5;
        }
        float f2 = hardWareInfo.m;
        float f3 = 10.0f;
        if (f2 <= 1.4f) {
            f = 1.0f;
        } else if (f2 <= 1.5f) {
            f = 2.0f;
        } else if (f2 <= 2.0f) {
            f = 4.0f;
        } else if (f2 <= 2.5f) {
            f = 6.0f;
        } else if (f2 <= 3.0f) {
            f = 8.0f;
        } else if (f2 <= 3.5f) {
            f = 9.0f;
        } else {
            f = 10.0f;
        }
        int i3 = i2 * i;
        if (i3 < 8847360) {
            if (i3 >= 3686400) {
                f3 = 9.0f;
            } else if (i3 > 2073600) {
                f3 = 8.0f;
            } else if (i3 == 2073600) {
                f3 = 7.0f;
            } else if (i3 > 921600) {
                f3 = 6.0f;
            } else if (i3 >= 921600) {
                f3 = 4.0f;
            } else if (i3 >= 786432) {
                f3 = 3.0f;
            } else if (i3 >= 614400) {
                f3 = 2.0f;
            } else {
                f3 = 1.0f;
            }
        }
        return Math.round((f + f3) / 2.0f);
    }
}
