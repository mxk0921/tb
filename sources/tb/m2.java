package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.x9b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m2 implements x9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249414);
        t2o.a(839909548);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            x9b.b.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            x9b.b.b(this);
        }
    }
}
