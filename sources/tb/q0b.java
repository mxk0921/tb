package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.prefork.ViewFactory;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q0b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements pmn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pmn
        public void a(List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd86ffe0", new Object[]{this, list, list2});
            } else {
                q0b.this.f33099a.c("loadCacheAsync");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements jmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f26423a = new AtomicInteger();
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ViewFactory e;
        public final /* synthetic */ Application f;

        public b(int i, String str, String str2, ViewFactory viewFactory, Application application) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = viewFactory;
            this.f = application;
        }

        @Override // tb.jmc
        public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("facf32fb", new Object[]{this, str, awesomeGetContainerInnerData});
                return;
            }
            bqa.d("HomeLoadCacheLauncher", "cache onLoadSuccess : " + str);
            Log.e("HomeLoadCacheLauncher", "cache onLoadSuccess : " + str);
            phg.e("launcher_cache_end_" + str);
            phg.d("launcher_cache_end_" + str);
            if (this.f26423a.incrementAndGet() == this.b) {
                q0b.this.f33099a.c("loadCacheAsyncByMaxThread");
            }
            if (yyj.e().o(str)) {
                dvh.g(this.c, true);
            } else {
                dvh.g(this.d, true);
            }
            if (yyj.e().o(str)) {
                String c = dvh.c(dvh.TASK_LOAD_CACHE_PRE_CREATE_THEME);
                wbo.a().e();
                dvh.g(c, true);
            }
            if (yyj.e().q(str)) {
                xti.a().k(str, awesomeGetContainerInnerData);
            }
            boolean x = vxl.b().x();
            String str2 = dvh.TASK_DX_SUB_PRERENDER;
            if (!x) {
                if (yyj.e().o(str)) {
                    str2 = dvh.TASK_DX_MAIN_PRERENDER;
                }
                String c2 = dvh.c(str2);
                this.e.g(this.f, str);
                dvh.g(c2, true);
            } else if (yyj.e().q(str)) {
                String c3 = dvh.c(str2);
                this.e.g(this.f, str);
                dvh.g(c3, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeLoadCacheLauncher$3");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wbo.a().g(2);
            wbo.a().d();
            wbo.a().f();
        }
    }

    static {
        t2o.a(729809325);
    }

    public static /* synthetic */ Object ipc$super(q0b q0bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeLoadCacheLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Log.e("HomeLoadCacheLauncher", "loadCache start");
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        this.f33099a.p("HomeLoadCacheLauncher", 1);
        super.a(application, hashMap);
        if (f4b.b("fixColdStartOutLinkError", true)) {
            if (!kbq.h(Globals.getApplication()) && !vxl.a()) {
                this.f33099a.c("HomeLoadCacheLauncher");
                return;
            }
        } else if (!vxl.j() && !vxl.a()) {
            this.f33099a.c("HomeLoadCacheLauncher");
            return;
        }
        if (vxl.b().u()) {
            bqa.d("HomeLoadCacheLauncher", "loadCacheAsyncByMaxThread");
            Log.e("HomeLoadCacheLauncher", "loadCacheAsyncByMaxThread");
            if (!vxl.b().J()) {
                d();
            }
            if (!vxl.b().M()) {
                c(application);
            }
        } else {
            bqa.d("HomeLoadCacheLauncher", "loadCacheAsync");
            b();
        }
        this.f33099a.c("HomeLoadCacheLauncher");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0ab227", new Object[]{this});
            return;
        }
        try {
            this.f33099a.p("launcherPreLoadCache", 2);
            this.f33099a.p("loadCacheAsync", 2);
            z4a l = yyj.l();
            ArrayList arrayList = new ArrayList();
            arrayList.add(yyj.e().f());
            arrayList.add(l.f32522a);
            a aVar = new a();
            bqa.d("HomeLoadCacheLauncher", "run task on subThread");
            zza.d(l.f32522a).M(arrayList, aVar);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void c(Application application) {
        ViewFactory f;
        String str = "launcherPreLoadCache";
        str = "HomeLoadCacheLauncher";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be75761", new Object[]{this, application});
            return;
        }
        try {
            bqa.d(str, "loadCacheAsyncByMaxThread");
            Log.e(str, "loadCacheAsyncByMaxThread");
            this.f33099a.p(str, 2);
            this.f33099a.p("loadCacheAsyncByMaxThread", 2);
            String c2 = dvh.c(dvh.TASK_DX_MAIN_LOAD_DATA);
            String c3 = dvh.c(dvh.TASK_DX_SUB_LOAD_DATA);
            z4a l = yyj.l();
            ArrayList arrayList = new ArrayList();
            arrayList.add(l.f32522a);
            arrayList.add(yyj.e().f());
            int size = arrayList.size();
            if (!vxl.b().x()) {
                f = new ViewFactory();
                f.h();
            } else {
                f = ViewFactory.f();
            }
            zza.d(l.f32522a).N(arrayList, true ^ vxl.b().x(), new b(size, c2, c3, f, application));
            phg.e("launcher_cache_start");
            phg.d("launcher_cache_start");
        } finally {
            try {
                this.f33099a.c(str);
            } finally {
            }
        }
        this.f33099a.c(str);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d6cd42", new Object[]{this});
        } else if (!vxl.b().w() && !p7p.k()) {
            new c("homePreCreateHomeView").start();
        }
    }
}
