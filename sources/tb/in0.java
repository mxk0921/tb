package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.performance.jsTracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class in0 extends jt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, do0> c = new HashMap();
    public long d;
    public long e;
    public long f;

    static {
        t2o.a(301989993);
    }

    public static /* synthetic */ Object ipc$super(in0 in0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/perf/AliBuyPerformanceAspectExtension");
    }

    @Override // tb.jt
    public void B(cg cgVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727c41e1", new Object[]{this, cgVar, new Boolean(z), new Long(j), new Long(j2)});
        } else if (!J0(cgVar.a())) {
            String b = cgVar.b();
            String str = "after_" + b;
            ((HashMap) this.c).put(str, new do0("after_" + b, j, j2));
            do0 do0Var = (do0) ((HashMap) this.c).get(b);
            if (do0Var != null) {
                do0Var.c(j);
            }
        }
    }

    public final boolean J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0266d4", new Object[]{this, str})).booleanValue();
        }
        return AliBuyPresenterImpl.PRELOAD_MAIN_PAGE_FLOW.equals(str);
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c37c476", new Object[]{this});
            return;
        }
        AURAGlobalData r = r();
        if (r != null) {
            HashMap hashMap = new HashMap();
            long j = 0;
            for (do0 do0Var : ((HashMap) this.c).values()) {
                String b = do0Var.b();
                long a2 = do0Var.a();
                if (!TextUtils.isEmpty(b) && a2 != 0) {
                    hashMap.put(b, Long.valueOf(a2));
                    j += a2;
                }
            }
            hashMap.put("aspectTime", Long.valueOf((this.e - this.d) - j));
            r.update("globalDataPerformanceStage", hashMap);
            r.update("globalDataPerformanceRenderStartStage", Long.valueOf(this.f));
            r.update("globalDataPerformanceFlowStartStage", Long.valueOf(this.d));
        }
    }

    @Override // tb.jt
    public void L(cg cgVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d817cc3f", new Object[]{this, cgVar, new Long(j), new Long(j2)});
        } else if (!J0(cgVar.a())) {
            this.d = j;
            ((HashMap) this.c).put("beforeFlowAspectTime", new do0("beforeFlowAspectTime", j, j2));
        }
    }

    @Override // tb.jt
    public void m0(cg cgVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1c01da", new Object[]{this, cgVar, new Long(j), new Long(j2)});
        } else if (!J0(cgVar.a())) {
            String b = cgVar.b();
            String str = "before_" + b;
            ((HashMap) this.c).put(str, new do0("before_" + b, j, j2));
            if (pm.RENDER_SERVICE_CODE.equals(b)) {
                this.f = j2;
            }
            ((HashMap) this.c).put(b, new do0(b, j2));
        }
    }

    @Override // tb.jt
    public void x(cg cgVar, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68094a2e", new Object[]{this, cgVar, new Boolean(z), new Long(j), new Long(j2)});
        } else if (!J0(cgVar.a())) {
            this.e = j2;
            ((HashMap) this.c).put("afterFlowAspectTime", new do0("afterFlowAspectTime", j, j2));
            if (!z) {
                K0();
            }
        }
    }
}
