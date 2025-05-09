package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import tb.t8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qas implements t8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f26637a;
    public ScheduledFuture<?> b;
    public boolean c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qas.this.hideLoading();
            }
        }
    }

    static {
        t2o.a(834666541);
        t2o.a(834666530);
    }

    public qas(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f26637a = bbsVar;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            t8c.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        t8c.a.b(this);
        ScheduledFuture<?> scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // tb.t8c
    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else if (this.c) {
            this.c = false;
            ISplashView splashView = this.f26637a.Z().getSplashView();
            if (splashView != null) {
                splashView.exit();
            }
        }
    }

    @Override // tb.t8c
    public void showLoading() {
        ScheduledExecutorService scheduledExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        ISplashView splashView = this.f26637a.Z().getSplashView();
        if (splashView != null) {
            splashView.showLoading();
        }
        this.c = true;
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        ScheduledFuture<?> scheduledFuture = null;
        if (!(iExecutorService == null || (scheduledExecutor = iExecutorService.getScheduledExecutor()) == null)) {
            scheduledFuture = scheduledExecutor.schedule(new a(), q9s.INSTANCE.U2(), TimeUnit.SECONDS);
        }
        this.b = scheduledFuture;
    }
}
