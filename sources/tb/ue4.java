package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ue4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438743);
    }

    public ue4() {
        IpChange ipChange = ContainerType.$ipChange;
    }

    public final void a(ContainerType containerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d7461c", new Object[]{this, containerType});
        } else {
            ckf.g(containerType, "<set-?>");
        }
    }
}
