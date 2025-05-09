package tb;

import android.taobao.windvane.extra.jsi.WVJsi;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.TMSGraphicsLibraryInit;
import com.taobao.android.weex.b;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j9s extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;

        public a(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVJsi.loadJsi(j9s.this.b.I());
            b.d().c(j9s.this.b.I().getApplication());
            if (TMSGraphicsLibraryInit.e()) {
                j9s.l(j9s.this);
            } else {
                j9s.k(j9s.this, eas.g);
            }
            j9s.this.b.S().c("remoteGfxLoadTime", String.valueOf(System.currentTimeMillis() - this.b));
            j9s.this.b.S().c("remoteGfxFromNetwork", String.valueOf(this.c));
        }
    }

    static {
        t2o.a(834666568);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9s(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(j9s j9sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSCanvasInitStep");
    }

    public static final /* synthetic */ void k(j9s j9sVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3055ce", new Object[]{j9sVar, easVar});
        } else {
            j9sVar.g(easVar);
        }
    }

    public static final /* synthetic */ void l(j9s j9sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd87d24", new Object[]{j9sVar});
        } else {
            j9sVar.i();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSCanvasInitStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
        } else if (q9s.G()) {
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService == null) {
                executor = null;
            } else {
                executor = iExecutorService.getExecutor(ExecutorType.URGENT);
            }
            if (executor == null) {
                g(eas.g);
            } else {
                executor.execute(new a(System.currentTimeMillis(), TMSGraphicsLibraryInit.c()));
            }
        } else {
            i();
        }
    }
}
