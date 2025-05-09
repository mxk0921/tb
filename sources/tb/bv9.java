package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792599);
    }

    public void a(fw fwVar, boolean z) {
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56acc1eb", new Object[]{this, fwVar, new Boolean(z)});
            return;
        }
        if (z) {
            f = Float.valueOf(h3p.d(true));
        } else {
            f = null;
        }
        fwVar.T(f);
    }
}
