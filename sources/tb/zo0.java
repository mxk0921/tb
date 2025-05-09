package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.IDXHardwareInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zo0 implements IDXHardwareInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.IDXHardwareInterface
    public int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        int b = qp0.b();
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return -1;
    }
}
