package tb;

import com.alibaba.android.ultron.engine.protocol.Linkage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286480);
    }

    public static Linkage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Linkage) ipChange.ipc$dispatch("b735f927", new Object[0]);
        }
        return new Linkage();
    }
}
