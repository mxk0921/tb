package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120501);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[0]);
        } else {
            fsw.i("WVMicroPublish", WVMicorPublishPlugin.class, true);
        }
    }
}
