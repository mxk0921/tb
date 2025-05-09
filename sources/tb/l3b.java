package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final f0b f23086a = f0b.i();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements jmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f23087a = new AtomicInteger();
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public a(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // tb.jmc
        public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("facf32fb", new Object[]{this, str, awesomeGetContainerInnerData});
                return;
            }
            bqa.d("HomePreloadCacheLauncher", "cache onLoadSuccess : " + str);
            if (this.f23087a.incrementAndGet() == this.b) {
                l3b.a().c("launcherFirstPreLoadCache");
                phg.e("launcherPreLoadCache_end");
                phg.d("launcherPreLoadCache_end");
                dvh.g(this.c, true);
            }
        }
    }

    static {
        t2o.a(729809334);
    }

    public static /* synthetic */ f0b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f0b) ipChange.ipc$dispatch("ef9b3fc3", new Object[0]);
        }
        return f23086a;
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (vxl.b().x()) {
            if (dvh.o()) {
                dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
            }
            String c = dvh.c(dvh.TASK_PRE_LOAD_CACHE);
            if (vxl.j() || vxl.a()) {
                if (vxl.b().u()) {
                    bqa.d("HomePreloadCacheLauncher", "loadCacheAsyncByMaxThread");
                    c(application, c);
                }
                if (vxl.b().J()) {
                    x2b.m(application);
                }
            }
        }
    }

    public static void c(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b3caeb", new Object[]{application, str});
            return;
        }
        try {
            bqa.d("HomePreloadCacheLauncher", "loadCacheAsyncByMaxThread");
            f23086a.p("launcherFirstPreLoadCache", 2);
            phg.e("launcherPreLoadCache_start");
            z4a l = yyj.l();
            imn c = yyj.e().c();
            if (c == null) {
                c = new imn(application, l.b);
                yyj.e().u(c);
                zza.l(c);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(l.f32522a);
            arrayList.add(yyj.e().f());
            c.N(arrayList, true, new a(arrayList.size(), str));
            phg.d("launcherPreLoadCache_start");
        } catch (Throwable th) {
            TLog.loge("HomePreloadCacheLauncher", "LauncherPreLoadCache error", th);
        }
    }
}
