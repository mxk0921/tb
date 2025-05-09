package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class tfa<P extends bdd> implements fvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f28683a;
    public P b;

    static {
        t2o.a(295698848);
        t2o.a(295698845);
    }

    public tfa() {
    }

    @Override // tb.fvc
    public void h(bdd bddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49d1c25", new Object[]{this, bddVar});
        } else {
            this.b = bddVar;
        }
    }

    public tfa(xea xeaVar) {
        this.f28683a = xeaVar;
    }
}
