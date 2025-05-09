package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.impl.TBTMSSDK;
import com.taobao.themis.taobao.impl.TMS;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aes implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15696a;

        public a(Context context) {
            this.f15696a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSSDK.initTBTMS(this.f15696a);
            }
        }
    }

    static {
        t2o.a(847249495);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TMSUniAppNavProcess";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Context applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null) {
            return true;
        }
        Uri data = intent.getData();
        if (data != null && !data.isHierarchical()) {
            return true;
        }
        try {
            Context d = zmjVar.d();
            applicationContext = d == null ? null : d.getApplicationContext();
        } catch (Throwable th) {
            TMSLogger.c("TMS", "themis init fail", th);
        }
        if (applicationContext == null) {
            return true;
        }
        abs.c(applicationContext);
        boolean a2 = h8s.f(applicationContext, "enableAsyncInitTask").a();
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService == null || !a2) {
            TBTMSSDK.initTBTMS(applicationContext);
        } else {
            iExecutorService.getExecutor(ExecutorType.NORMAL).execute(new a(applicationContext));
        }
        if ((!q9s.z1() || !tsq.I(String.valueOf(data), "tbopen://", false, 2, null)) && ges.m(data) && !intent.getBooleanExtra("disableHook", false)) {
            return !TMS.startApp(intent, zmjVar, TMSSolutionType.UNIAPP);
        }
        return true;
    }
}
