package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class os implements zab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691830);
        t2o.a(79691831);
    }

    @Override // tb.zab
    public void b(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eddffdb", new Object[]{this, loVar});
        }
    }
}
