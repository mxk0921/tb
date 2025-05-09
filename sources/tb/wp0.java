package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wp0 implements s8d<FailPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xp0<vp0> f30832a;

    public wp0(xp0<vp0> xp0Var) {
        if (xp0Var != null) {
            this.f30832a = xp0Var;
            return;
        }
        throw new IllegalArgumentException("aliImageListener must not be null.");
    }

    /* renamed from: a */
    public boolean onHappen(FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
        }
        return this.f30832a.a(new fy8(failPhenixEvent));
    }
}
