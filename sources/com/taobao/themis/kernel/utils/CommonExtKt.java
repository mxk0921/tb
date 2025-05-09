package com.taobao.themis.kernel.utils;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.d1a;
import tb.dyd;
import tb.gld;
import tb.kdb;
import tb.njg;
import tb.o9s;
import tb.p8s;
import tb.pg1;
import tb.rio;
import tb.swd;
import tb.t2o;
import tb.u9h;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class CommonExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f13598a = new Handler(Looper.getMainLooper());
    public static final njg b = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, CommonExtKt$handler$2.INSTANCE);

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ d1a f13599a;

        public a(d1a d1aVar) {
            this.f13599a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13599a.invoke();
            }
        }
    }

    static {
        t2o.a(839909944);
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6903d9db", new Object[0])).booleanValue();
        }
        return ckf.b(Looper.getMainLooper(), Looper.myLooper());
    }

    public static final Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[0]);
        }
        return c();
    }

    public static final Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[0]);
        }
        return (Handler) b.getValue();
    }

    public static final ITMSPage d(kdb kdbVar, int i) {
        swd W;
        ITMSPage pageByIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("f7cbb2f9", new Object[]{kdbVar, new Integer(i)});
        }
        ckf.g(kdbVar, "<this>");
        bbs g = g(kdbVar);
        if (g == null || (W = g.W()) == null || (pageByIndex = W.getPageByIndex(0)) == null) {
            return null;
        }
        dyd dydVar = (dyd) pageByIndex.getExtension(dyd.class);
        if (dydVar != null) {
            return dydVar.b1(i);
        }
        if (i == 0) {
            return pageByIndex;
        }
        return null;
    }

    public static final int e(int i, int i2) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c3a9ad", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null) {
            application = null;
        } else {
            application = iEnvironmentService.getApplicationContext();
        }
        if (application == null) {
            return i2;
        }
        return (i * application.getResources().getDisplayMetrics().widthPixels) / 750;
    }

    public static final int f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56b2007c", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > 0) {
            return (i2 * i) / 750;
        }
        return e(i2, i3);
    }

    public static final bbs g(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("4a8f66f7", new Object[]{kdbVar});
        }
        ckf.g(kdbVar, "<this>");
        ITMSPage h = h(kdbVar);
        if (h == null) {
            return null;
        }
        return h.getInstance();
    }

    public static final ITMSPage h(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a906b40", new Object[]{kdbVar});
        }
        ckf.g(kdbVar, "<this>");
        IMegaAdapter iMegaAdapter = (IMegaAdapter) p8s.b(IMegaAdapter.class);
        if (iMegaAdapter == null) {
            return null;
        }
        return iMegaAdapter.getPageFromAbilityContext(kdbVar);
    }

    public static final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[0]);
        }
        Object g = p8s.g(IEnvironmentService.class);
        ckf.f(g, "getNotNull(IEnvironmentService::class.java)");
        return ((Object) Build.MODEL) + "(Android/" + ((Object) Build.VERSION.RELEASE) + ") AliApp(TB/" + ((Object) ((IEnvironmentService) g).getAppVersion()) + ") Ariver/1.0.13.6";
    }

    public static final boolean j() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null) {
            application = null;
        } else {
            application = iEnvironmentService.getApplicationContext();
        }
        if (o9s.g(application) || u9h.b()) {
            return true;
        }
        return false;
    }

    public static final void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d364d15", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        if (a()) {
            runnable.run();
        } else {
            f13598a.postAtFrontOfQueue(runnable);
        }
    }

    public static final void l(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd8a84c", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        f13598a.removeCallbacks(runnable);
    }

    public static final gld m(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gld) ipChange.ipc$dispatch("fe3a06cc", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return (gld) bbsVar.getExtension(rio.class);
    }

    public static final void n(Runnable runnable) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        if (a()) {
            runnable.run();
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.UI)) != null) {
            executor.execute(runnable);
        }
    }

    public static final void o(d1a<xhv> d1aVar) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fdbac1", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        if (ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            d1aVar.invoke();
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.UI)) != null) {
            executor.execute(new a(d1aVar));
        }
    }

    public static final void p(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4d50ef", new Object[]{runnable, new Long(j)});
            return;
        }
        ckf.g(runnable, "runnable");
        f13598a.postDelayed(runnable, j);
    }

    public static final void q(d1a<xhv> d1aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437a9a6", new Object[]{d1aVar, new Long(j)});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        f13598a.postDelayed(new a(d1aVar), j);
    }

    public static /* synthetic */ void r(d1a d1aVar, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831a3b56", new Object[]{d1aVar, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 32;
        }
        q(d1aVar, j);
    }
}
