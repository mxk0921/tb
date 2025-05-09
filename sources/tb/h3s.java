package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h3s implements kzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092283);
        t2o.a(806356097);
    }

    @Override // tb.kzb
    public dgl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgl) ipChange.ipc$dispatch("fa22f592", new Object[]{this});
        }
        lp0.e f = lp0.d().f();
        dgl dglVar = new dgl();
        dglVar.f17798a = f.f23479a;
        return dglVar;
    }

    @Override // tb.kzb
    public int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        return qp0.b();
    }
}
