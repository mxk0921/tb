package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.bean.EnvType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ftf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944517);
    }

    public static void a(EnvType envType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b3241b", new Object[]{envType});
        }
    }
}
