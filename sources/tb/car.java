package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.zcache.prefetch")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class car extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                yxr.b(2);
            }
        }
    }

    static {
        t2o.a(708837503);
    }

    public static /* synthetic */ Object ipc$super(car carVar, String str, Object... objArr) {
        if (str.hashCode() == 418368253) {
            super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/zcache/TBBuyZCacheAspectImpl");
    }

    @Override // tb.ms
    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        if (AliBuyPerfSwitcher.enableLogicPerf() && AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(cgVar.a())) {
            dn.b().postDelayed(new a(), 3000L);
        }
    }
}
