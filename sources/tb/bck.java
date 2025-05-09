package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bck implements xuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<ack> f16318a = new ThreadLocal<>();

    static {
        t2o.a(315621411);
        t2o.a(315621380);
    }

    @Override // tb.xuo
    public paq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("7a0bb35f", new Object[]{this});
        }
        ack ackVar = this.f16318a.get();
        if (ackVar == null) {
            return null;
        }
        return ackVar.e();
    }

    @Override // tb.xuo
    public vuo b(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vuo) ipChange.ipc$dispatch("cd66b952", new Object[]{this, paqVar});
        }
        return new ack(this, paqVar);
    }
}
