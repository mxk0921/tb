package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        if (hardWareInfo == null) {
            return 0;
        }
        int i = hardWareInfo.c;
        if (i >= 16) {
            return 10;
        }
        if (i >= 8) {
            return 9;
        }
        if (i >= 6) {
            return 8;
        }
        if (i >= 4) {
            return 6;
        }
        if (i >= 2) {
            return 4;
        }
        return 2;
    }
}
