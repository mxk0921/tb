package com.taobao.search.searchdoor.sf;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.a;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.eno;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDoorViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String HIDE_DISCOVERY = "hideSearchDiscovery";
    public static final String HIDE_SPOT_KEY = "hideWidgetNew";

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f11642a;
    public boolean b;
    public boolean c;
    public boolean f;
    public View h;
    public final ThreadPoolExecutor i;
    public final njg d = a.b(new d1a() { // from class: tb.ymz
        @Override // tb.d1a
        public final Object invoke() {
            LinearLayout r;
            r = SearchDoorViewPool.r(SearchDoorViewPool.this);
            return r;
        }
    });
    public final njg e = a.b(new d1a() { // from class: tb.zmz
        @Override // tb.d1a
        public final Object invoke() {
            LayoutInflater t;
            t = SearchDoorViewPool.t(SearchDoorViewPool.this);
            return t;
        }
    });
    public final ReentrantLock g = new ReentrantLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(815793089);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(815793088);
    }

    public SearchDoorViewPool(WeakReference<Activity> weakReference) {
        ckf.g(weakReference, "context");
        this.f11642a = weakReference;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.anz
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread s;
                s = SearchDoorViewPool.s(runnable);
                return s;
            }
        });
        this.i = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: tb.bnz
            @Override // java.lang.Runnable
            public final void run() {
                SearchDoorViewPool.q(SearchDoorViewPool.this);
            }
        });
    }

    public static final void q(SearchDoorViewPool searchDoorViewPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75684993", new Object[]{searchDoorViewPool});
            return;
        }
        ckf.g(searchDoorViewPool, "this$0");
        Activity activity = searchDoorViewPool.f11642a.get();
        if (activity != null) {
            searchDoorViewPool.b = ckf.b(eno.d(activity, HIDE_SPOT_KEY, ""), "true");
            searchDoorViewPool.c = ckf.b(eno.d(activity, HIDE_DISCOVERY, ""), "true");
        }
    }

    public static final LinearLayout r(SearchDoorViewPool searchDoorViewPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("70eac013", new Object[]{searchDoorViewPool});
        }
        ckf.g(searchDoorViewPool, "this$0");
        Activity activity = searchDoorViewPool.f11642a.get();
        if (activity == null) {
            activity = Globals.getApplication();
        }
        return new LinearLayout(activity);
    }

    public static final Thread s(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("384be249", new Object[]{runnable});
        }
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setName("SearchDoorViewPool");
        return thread;
    }

    public static final LayoutInflater t(SearchDoorViewPool searchDoorViewPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("13c194d9", new Object[]{searchDoorViewPool});
        }
        ckf.g(searchDoorViewPool, "this$0");
        Activity activity = searchDoorViewPool.f11642a.get();
        if (activity == null) {
            activity = Globals.getApplication();
        }
        return LayoutInflater.from(activity);
    }

    public static final void u(SearchDoorViewPool searchDoorViewPool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ef5732", new Object[]{searchDoorViewPool, new Boolean(z)});
            return;
        }
        ckf.g(searchDoorViewPool, "this$0");
        searchDoorViewPool.g(z);
    }

    public static final void v(SearchDoorViewPool searchDoorViewPool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a1f538", new Object[]{searchDoorViewPool, new Boolean(z)});
            return;
        }
        ckf.g(searchDoorViewPool, "this$0");
        Activity activity = searchDoorViewPool.f11642a.get();
        if (activity != null) {
            eno.f(activity, HIDE_DISCOVERY, String.valueOf(z));
        }
    }

    public static final void w(SearchDoorViewPool searchDoorViewPool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d8ff79", new Object[]{searchDoorViewPool, new Boolean(z)});
            return;
        }
        ckf.g(searchDoorViewPool, "this$0");
        Activity activity = searchDoorViewPool.f11642a.get();
        if (activity != null) {
            eno.f(activity, HIDE_SPOT_KEY, String.valueOf(z));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.f) {
            this.f = true;
            this.i.shutdownNow();
        }
    }

    public final LinearLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("7611c729", new Object[]{this});
        }
        return (LinearLayout) this.d.getValue();
    }

    public final LayoutInflater f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("7c055a1a", new Object[]{this});
        }
        return (LayoutInflater) this.e.getValue();
    }

    /* JADX WARN: Finally extract failed */
    public final View g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cda08615", new Object[]{this, new Boolean(z)});
        }
        this.g.lock();
        try {
            View view = this.h;
            if (view != null) {
                this.g.unlock();
                return view;
            }
            View inflate = f().inflate(SearchBarWidget.getLayoutId(z), (ViewGroup) e(), false);
            this.h = inflate;
            ckf.d(inflate);
            this.g.unlock();
            return inflate;
        } catch (Exception unused) {
            this.g.unlock();
            return null;
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c49c0c0f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19ef46ce", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void j(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc5ef2b", new Object[]{this, new Boolean(z)});
        } else if (!this.f) {
            this.i.execute(new Runnable() { // from class: tb.cnz
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDoorViewPool.u(SearchDoorViewPool.this, z);
                }
            });
        }
    }

    public final void k(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bf7961", new Object[]{this, new Boolean(z)});
        } else if (!this.f) {
            this.i.execute(new Runnable() { // from class: tb.xmz
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDoorViewPool.v(SearchDoorViewPool.this, z);
                }
            });
        }
    }

    public final void l(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e68482", new Object[]{this, new Boolean(z)});
        } else if (!this.f) {
            this.i.execute(new Runnable() { // from class: tb.dnz
                @Override // java.lang.Runnable
                public final void run() {
                    SearchDoorViewPool.w(SearchDoorViewPool.this, z);
                }
            });
        }
    }
}
