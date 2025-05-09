package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class wt extends et implements xab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOBAL_DATA_LOADING_HANDLE = "globalDataAliBuyLoadingHandle";
    public static final String GLOBAL_DATA_LOADING_TASK = "globalDataAliBuyLoadingTask";
    public static final String USERDATA_KEY_STATUS_MANAGER = "userdata.status.manager";
    public static final Object h = new Object();
    public Boolean f;
    public AURANextRPCEndpoint g;

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
                return;
            }
            wt.this.L0();
            wt.J0(wt.this);
        }
    }

    static {
        t2o.a(301989959);
        t2o.a(79691952);
    }

    public static /* synthetic */ void J0(wt wtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bedaa58", new Object[]{wtVar});
        } else {
            wtVar.T0();
        }
    }

    public static /* synthetic */ Object ipc$super(wt wtVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -82900270) {
            super.Q((AURANextRPCEndpoint) objArr[0]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/extension/aspect/AbsAliBuyLoadingExtension");
        }
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebfa1ae", new Object[]{this});
        } else {
            dn.f(new a(), 0L);
        }
    }

    public abstract void L0();

    public final boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9aaed2e", new Object[]{this})).booleanValue();
        }
        if (this.f == null) {
            this.f = (Boolean) L().h("enableAsyncThread", Boolean.class, Boolean.FALSE);
        }
        Boolean bool = this.f;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public alq N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alq) ipChange.ipc$dispatch("4abf90a5", new Object[]{this});
        }
        return (alq) L().g(USERDATA_KEY_STATUS_MANAGER, alq.class);
    }

    public boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace63239", new Object[]{this})).booleanValue();
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) L().g("aliBuyPreload", AtomicBoolean.class);
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return false;
        }
        return true;
    }

    @Override // tb.et, tb.vbb
    public void Q(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0f0ad2", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        super.Q(aURANextRPCEndpoint);
        this.g = aURANextRPCEndpoint;
        U0();
    }

    public boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1766a2", new Object[]{this})).booleanValue();
        }
        AURANextRPCEndpoint aURANextRPCEndpoint = this.g;
        if (aURANextRPCEndpoint == null || !"mtop.trade.order.build".equals(aURANextRPCEndpoint.getApi())) {
            return false;
        }
        if (this.g.getDataParams() == null || !this.g.getDataParams().containsKey("forceShowLoading")) {
            return true;
        }
        return false;
    }

    public void R0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6c45cc", new Object[]{this, runnable});
            return;
        }
        AURAGlobalData B = B();
        if (B != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            B.update(GLOBAL_DATA_LOADING_TASK, runnable);
            B.update(GLOBAL_DATA_LOADING_HANDLE, handler);
            handler.postDelayed(runnable, 3000L);
        }
    }

    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88720830", new Object[]{this});
            return;
        }
        AURAGlobalData B = B();
        if (B != null) {
            Runnable runnable = (Runnable) B.get(GLOBAL_DATA_LOADING_TASK, Runnable.class);
            Handler handler = (Handler) B.get(GLOBAL_DATA_LOADING_HANDLE, Handler.class);
            if (runnable != null && handler != null) {
                ck.g().e("removeTask");
                handler.removeCallbacks(runnable);
            }
        }
    }

    public final synchronized void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167ce08", new Object[]{this});
            return;
        }
        synchronized (h) {
            AURAFlowData x = x();
            if (x != null) {
                x.update("flowDataAliBuyLoadingFinish", "true");
            }
        }
    }

    public abstract void U0();

    @Override // tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
        } else {
            K0();
        }
    }

    @Override // tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
        } else if ((M0() && dl.PARSE_SERVICE_CODE.equals(cgVar.b())) || pm.RENDER_SERVICE_CODE.equals(cgVar.b())) {
            K0();
        }
    }

    @Override // tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
        }
    }

    @Override // tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
        }
    }

    @Override // tb.et, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.et, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        L0();
    }

    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1450ee", new Object[]{this})).booleanValue();
        }
        synchronized (h) {
            try {
                AURAFlowData x = x();
                if (x == null) {
                    return false;
                }
                return "true".equals((String) x.get("flowDataAliBuyLoadingFinish", String.class));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
