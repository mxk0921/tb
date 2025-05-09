package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.SecondPageFactory;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23409a;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23410a;

        public a(String str) {
            this.f23410a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity a2 = od0.D().f().a();
            if (a2 == null) {
                tfs.f("mainActivity exit, cancel preload");
            } else if (!lma.a()) {
                TurboEngineConfig.a a3 = TurboEngineConfig.a();
                a3.d(a2);
                a3.i(this.f23410a);
                a3.g(kpu.d(false));
                a3.f(kpu.c());
                a3.h(a2);
                spu.f(a3.a()).onReady();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kpu.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23411a;

        public c(String str) {
            this.f23411a = str;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else {
                lma.b(this.f23411a);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                lma.b(this.f23411a);
            }
        }
    }

    static {
        t2o.a(502267993);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return c();
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            f(str);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d26046b", new Object[0])).booleanValue();
        }
        if (f23409a) {
            return true;
        }
        try {
            fhb f = od0.D().f();
            if (f == null) {
                return false;
            }
            if (f.F(1)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c387f4a6", new Object[0]);
        } else if (!b) {
            nfs.c();
            cr9.e(o.J());
            erm.b();
            vmi.a();
            SecondPageFactory.b(SecondPageFactory.SecondPageType.GG_PROFILE, ra7.class);
            WindvanePluginRegister.a();
            uru.Companion.a().e();
            it8.b();
            b = true;
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c1f6d0", new Object[]{context});
        } else if (zrt.Companion.a()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b());
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a15788", new Object[]{str});
        } else {
            nwv.z0(new a(str), true);
        }
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e2262a", new Object[]{new Boolean(z)});
        } else {
            f23409a = z;
        }
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8432e6", new Object[]{context, str});
            return;
        }
        d();
        tfs.f("startPreloadGuang");
        if (TextUtils.isEmpty(str)) {
            tfs.d("page url is empty, cancel preload");
        } else if (akt.c() && od0.D().f().a() == null) {
            tfs.d("TBMain is null, cancel preload");
        } else if (!akt.q2("disableTab2Preload") && !c()) {
            kpu.h(new c(str));
            jz7.Companion.k(null);
        }
    }
}
