package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.NCBusinessContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mlz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737485);
    }

    public mlz(NCBusinessContext nCBusinessContext) {
        ckf.g(nCBusinessContext, "businessContext");
        nCBusinessContext.c();
    }

    public final void a(vqz vqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0b31f0", new Object[]{this, vqzVar});
        } else if (vqzVar != null) {
            vqzVar.run();
        }
    }
}
