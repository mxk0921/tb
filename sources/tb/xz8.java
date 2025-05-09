package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static xz8 b = null;

    /* renamed from: a  reason: collision with root package name */
    public q83 f31736a;

    static {
        t2o.a(245366925);
    }

    public static synchronized xz8 a() {
        synchronized (xz8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xz8) ipChange.ipc$dispatch("12499ba3", new Object[0]);
            }
            if (b == null) {
                b = new xz8();
            }
            return b;
        }
    }

    public void b(q83 q83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17136f63", new Object[]{this, q83Var});
        } else {
            this.f31736a = q83Var;
        }
    }

    public void c(vpx vpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fb1b4f", new Object[]{this, vpxVar});
            return;
        }
        q83 q83Var = this.f31736a;
        if (q83Var != null) {
            ((FalconCardNativeActivityNew) q83Var).q3(vpxVar);
        }
        this.f31736a = null;
        b = null;
    }
}
