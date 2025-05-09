package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bq0 implements s8d<SuccPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xp0<aq0> f16542a;

    public bq0(xp0<aq0> xp0Var) {
        if (xp0Var != null) {
            this.f16542a = xp0Var;
            return;
        }
        throw new IllegalArgumentException("aliImageListener must not be null.");
    }

    /* renamed from: a */
    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
        }
        return this.f16542a.a(new kwq(succPhenixEvent));
    }
}
