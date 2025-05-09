package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28950a = 2.0f;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        float f = this.f28950a;
        if (f > 4.0d) {
            return 10;
        }
        if (f >= 4.0d) {
            return 9;
        }
        if (f < 3.2d) {
            if (f >= 3.1d) {
                return 7;
            }
            if (f >= 3.0d) {
                return 6;
            }
            if (f >= 2.0d) {
                return 3;
            }
        }
        return 8;
    }
}
