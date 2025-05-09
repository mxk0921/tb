package tb;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lkf implements ComponentCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ns2 f23381a;

    public lkf(mkf mkfVar, ns2 ns2Var) {
        this.f23381a = ns2Var;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ns2 ns2Var = this.f23381a;
        ns2Var.getClass();
        if (uca.f29291a) {
            ns2Var.f24919a = false;
            kkf kkfVar = ns2Var.d;
            if (!(kkfVar instanceof nkf)) {
                if (kkfVar instanceof okf) {
                    ((okf) kkfVar).c = Long.MIN_VALUE;
                } else {
                    boolean z = kkfVar instanceof mkf;
                }
            }
        } else {
            synchronized (ns2Var.f) {
                try {
                    kkf kkfVar2 = ns2Var.d;
                    if (!(kkfVar2 instanceof nkf)) {
                        if (kkfVar2 instanceof okf) {
                            ((okf) kkfVar2).c = Long.MIN_VALUE;
                        } else {
                            boolean z2 = kkfVar2 instanceof mkf;
                        }
                    }
                    ns2Var.f24919a = false;
                    ns2Var.b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }
}
