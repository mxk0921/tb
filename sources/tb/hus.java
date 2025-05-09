package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSDeviceType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hus INSTANCE = new hus();

    static {
        t2o.a(1003487237);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue();
        }
        if (KSDeviceType.PAD == mhr.M().getType()) {
            return true;
        }
        return false;
    }
}
