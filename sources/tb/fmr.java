package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fmr implements avd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093367);
        t2o.a(806355873);
    }

    @Override // tb.avd
    public void a(ux9 ux9Var, gtc gtcVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470e78a", new Object[]{this, ux9Var, gtcVar, messageTypeFilter});
        } else {
            e7w.q(ux9Var, gtcVar, messageTypeFilter);
        }
    }

    @Override // tb.avd
    public void b(ux9 ux9Var, gtc gtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a93c4", new Object[]{this, ux9Var, gtcVar});
        } else {
            e7w.u(ux9Var, gtcVar);
        }
    }

    @Override // tb.avd
    public hlc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hlc) ipChange.ipc$dispatch("8c3ccdff", new Object[]{this});
        }
        return imr.b().c();
    }

    @Override // tb.avd
    public void d(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2808154", new Object[]{this, ux9Var, b3dVar});
        } else {
            scw.a(ux9Var, b3dVar);
        }
    }

    @Override // tb.avd
    public void h(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfc0fb", new Object[]{this, ux9Var, b3dVar});
        } else {
            scw.c(ux9Var, b3dVar);
        }
    }
}
