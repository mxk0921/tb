package tb;

import android.os.Build;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return 10;
        }
        if (i >= 24) {
            return 9;
        }
        if (i >= 23) {
            return 8;
        }
        return 7;
    }
}
