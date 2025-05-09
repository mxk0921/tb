package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nve implements ntd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqc f24975a;

    static {
        t2o.a(486539597);
        t2o.a(488636506);
    }

    public nve(dqc dqcVar) {
        this.f24975a = dqcVar;
    }

    @Override // tb.ntd
    public dqc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqc) ipChange.ipc$dispatch("39bcb153", new Object[]{this});
        }
        return this.f24975a;
    }
}
