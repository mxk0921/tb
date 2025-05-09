package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.loading")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bm0 extends wt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bm0.V0(bm0.this);
            }
        }
    }

    static {
        t2o.a(301989963);
    }

    public static /* synthetic */ void V0(bm0 bm0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b62b28", new Object[]{bm0Var});
        } else {
            bm0Var.W0();
        }
    }

    public static /* synthetic */ Object ipc$super(bm0 bm0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/aspect/AliBuyAspectLifecycleLoadingExtension");
    }

    @Override // tb.wt
    public void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (!O0()) {
            S0();
            alq N0 = N0();
            if (N0 != null) {
                ck.g().e("dismissLoading");
                N0.b();
            }
        }
    }

    @Override // tb.wt
    public void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else if (Q0()) {
            R0(new a());
        } else {
            W0();
        }
    }

    public final void W0() {
        alq N0;
        AURAFlowData x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55659750", new Object[]{this});
        } else if (!O0() && (N0 = N0()) != null && (x = x()) != null) {
            N0.l(Boolean.valueOf("aura.workflow.adjust".equals(x.getFlowCode())));
        }
    }
}
