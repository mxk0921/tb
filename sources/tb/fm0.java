package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class fm0 implements zpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989891);
        t2o.a(301990033);
    }

    @Override // tb.zpb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f307c84e", new Object[]{this});
        }
    }
}
