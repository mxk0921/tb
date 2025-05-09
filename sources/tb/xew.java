package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1001390093);
    }

    public static final void a(si8 si8Var, e3c e3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8184b0f6", new Object[]{si8Var, e3cVar});
            return;
        }
        ckf.g(si8Var, "<this>");
        ckf.g(e3cVar, "event");
        String b = ((OpenSingleViewController.p.a.C0752a) e3cVar).b();
        if (ckf.b(b, "onClick")) {
            si8Var.j(e3cVar);
        } else if (ckf.b(b, "onRetry")) {
            si8Var.k(e3cVar);
        }
    }
}
