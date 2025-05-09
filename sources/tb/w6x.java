package tb;

import android.app.Application;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import tb.d5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f30491a = false;
    public static volatile boolean b = false;
    public static volatile boolean c = false;
    public static volatile Throwable d = null;
    public static volatile Throwable e = null;
    public static volatile Throwable f = null;
    public static volatile boolean g = false;
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static Boolean k = Boolean.FALSE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5x.a f30492a;
        public final /* synthetic */ Application b;

        public a(d5x.a aVar, Application application) {
            this.f30492a = aVar;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!w6x.a() || !w6x.b() || !w6x.c()) {
                long e = w6x.e(this.b);
                long j = w6x.j(this.b);
                long i = w6x.i(this.b);
                w6x.d(this.f30492a);
                w6x.f("all", true, e, j, i);
            } else {
                w6x.d(this.f30492a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5x.a f30493a;
        public final /* synthetic */ Application b;

        public b(d5x.a aVar, Application application) {
            this.f30493a = aVar;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!w6x.a() || !w6x.b()) {
                long e = w6x.e(this.b);
                long j = w6x.j(this.b);
                w6x.d(this.f30493a);
                w6x.f("dom", true, e, j, 0L);
            } else {
                w6x.d(this.f30493a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5x.a f30494a;
        public final /* synthetic */ Application b;

        public c(d5x.a aVar, Application application) {
            this.f30494a = aVar;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!w6x.a() || !w6x.c()) {
                long e = w6x.e(this.b);
                long i = w6x.i(this.b);
                w6x.d(this.f30494a);
                w6x.f(h8x.KEY_MUS, true, e, 0L, i);
            } else {
                w6x.d(this.f30494a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5x.a f30495a;
        public final /* synthetic */ Application b;

        public d(d5x.a aVar, Application application) {
            this.f30495a = aVar;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (w6x.a()) {
                w6x.d(this.f30495a);
            } else {
                long e = w6x.e(this.b);
                w6x.d(this.f30495a);
                w6x.f("script", true, e, 0L, 0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;

        public e(String str, boolean z, long j, long j2, long j3) {
            this.d = str;
            this.e = z;
            this.f = j;
            this.g = j2;
            this.h = j3;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexLoader$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            AppMonitor.register(w3x.MODULE_NAME, "weex2init2", new String[]{"wxf", "unicorn", "uikit"}, new String[]{"type", "async"}, false);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("type", this.d);
            create.setValue("async", Boolean.toString(this.e));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("wxf", this.f);
            create2.setValue("unicorn", this.g);
            create2.setValue("uikit", this.h);
            AppMonitor.Stat.commit(w3x.MODULE_NAME, "weex2init2", create, create2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$weex$WeexInstanceMode;

        static {
            int[] iArr = new int[WeexInstanceMode.values().length];
            $SwitchMap$com$taobao$android$weex$WeexInstanceMode = iArr;
            try {
                iArr[WeexInstanceMode.DOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.XR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.CANAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.MUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.SCRIPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(982515794);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return f30491a;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ void d(d5x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fca2ea", new Object[]{aVar});
        } else {
            g(aVar);
        }
    }

    public static /* synthetic */ long e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("884d12b8", new Object[]{application})).longValue();
        }
        return k(application);
    }

    public static /* synthetic */ void f(String str, boolean z, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b762ca76", new Object[]{str, new Boolean(z), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            h(str, z, j2, j3, j4);
        }
    }

    public static void g(d5x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d45d7a", new Object[]{aVar});
        } else if (aVar != null) {
            aVar.a();
        }
    }

    public static void h(String str, boolean z, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f62e55", new Object[]{str, new Boolean(z), new Long(j2), new Long(j3), new Long(j4)});
        } else if (!g) {
            synchronized (w6x.class) {
                try {
                    if (!g) {
                        g = true;
                        AsyncTask.THREAD_POOL_EXECUTOR.execute(new e(str, z, j2, j3, j4));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static long i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bed8cab8", new Object[]{application})).longValue();
        }
        if (b) {
            return 0L;
        }
        synchronized (i) {
            try {
                if (b) {
                    return 0L;
                }
                k(application);
                long uptimeMillis = SystemClock.uptimeMillis();
                o(application);
                b = true;
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                dwh.f("WeexInit", "InitUIKitDone: " + uptimeMillis2);
                return uptimeMillis2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25324e22", new Object[]{application})).longValue();
        }
        if (f30491a) {
            return 0L;
        }
        synchronized (h) {
            try {
                if (f30491a) {
                    return 0L;
                }
                k(application);
                long uptimeMillis = SystemClock.uptimeMillis();
                p(application);
                f30491a = true;
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                dwh.f("WeexInit", "InitUnicornDone: " + uptimeMillis2);
                return uptimeMillis2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long k(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2defb5d", new Object[]{application})).longValue();
        }
        if (c) {
            return 0L;
        }
        synchronized (j) {
            try {
                if (c) {
                    return 0L;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                q(application);
                c = true;
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                dwh.f("WeexInit", "InitWeexFrameworkDone: " + uptimeMillis2);
                return uptimeMillis2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae3e7a54", new Object[0])).booleanValue();
        }
        return k.booleanValue();
    }

    public static void n(WeexInstanceMode weexInstanceMode, Application application, d5x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1b0641", new Object[]{weexInstanceMode, application, aVar});
            return;
        }
        oxh.d().e();
        vsa c2 = oxh.d().c(0);
        if (weexInstanceMode != null) {
            int i2 = f.$SwitchMap$com$taobao$android$weex$WeexInstanceMode[weexInstanceMode.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (!c || !f30491a) {
                    c2.post(new b(aVar, application));
                } else {
                    g(aVar);
                }
            } else if (i2 != 4) {
                if (i2 == 5) {
                    if (c) {
                        g(aVar);
                    } else {
                        c2.post(new d(aVar, application));
                    }
                }
            } else if (!c || !b) {
                c2.post(new c(aVar, application));
            } else {
                g(aVar);
            }
        } else if (!c || !f30491a || !b) {
            c2.post(new a(aVar, application));
        } else {
            g(aVar);
        }
    }

    public static void o(Application application) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34919129", new Object[]{application});
            return;
        }
        u8x.i("WeexInitUIKit");
        try {
            z = w(application, "initUIKit");
        } catch (Throwable th) {
            e = th;
        }
        if (!z) {
            i5x.a(application);
        }
        u8x.j();
    }

    public static void p(Application application) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e698a13", new Object[]{application});
            return;
        }
        u8x.i("WeexInitUnicorn");
        try {
            z = w(application, "initUnicorn");
        } catch (Throwable th) {
            d = th;
        }
        if (!z) {
            i5x.b(application);
        }
        u8x.j();
    }

    public static void q(Application application) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25860ace", new Object[]{application});
            return;
        }
        u8x.i("WeexInitWeexFramework");
        i5x.e();
        f5x.f19038a = application;
        f5x.b = vvh.m();
        try {
            z = w(application, IWXUserTrackAdapter.INIT_FRAMEWORK);
        } catch (Throwable th) {
            f = th;
        }
        if (!z) {
            i5x.c(application);
        }
        v(application);
        u8x.j();
    }

    public static boolean r(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315a9242", new Object[]{weexInstanceMode})).booleanValue();
        }
        if (weexInstanceMode != null) {
            int i2 = f.$SwitchMap$com$taobao$android$weex$WeexInstanceMode[weexInstanceMode.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (!c || !f30491a) {
                    return false;
                }
                return true;
            } else if (i2 != 4) {
                if (i2 != 5) {
                    return true;
                }
                return c;
            } else if (!c || !b) {
                return false;
            } else {
                return true;
            }
        } else if (!c || !f30491a || !b) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean s(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("110abf94", new Object[]{weexInstanceMode})).booleanValue();
        }
        boolean t = t(weexInstanceMode);
        if (t) {
            u(f);
            u(d);
            u(e);
        }
        return t;
    }

    public static boolean t(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c841b1", new Object[]{weexInstanceMode})).booleanValue();
        }
        if (weexInstanceMode != null) {
            int i2 = f.$SwitchMap$com$taobao$android$weex$WeexInstanceMode[weexInstanceMode.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (f == null || d == null) {
                    return false;
                }
                return true;
            } else if (i2 != 4) {
                if (i2 == 5 && f == null) {
                    return false;
                }
                return true;
            } else if (f == null || e == null) {
                return false;
            } else {
                return true;
            }
        } else if (f == null || d == null || e == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void u(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fa812a", new Object[]{th});
        } else if (th != null) {
            dwh.h("HasInitError: ", th);
            Log.e(dwh.TAG, "HasInitError: ", th);
        }
    }

    public static boolean w(Application application, String str) throws Throwable {
        String packageName = application.getPackageName();
        try {
            Class.forName(packageName + ".weex2.AppWeexEngineAutoInit").getDeclaredMethod(str, Application.class).invoke(null, application);
            return true;
        } catch (ClassNotFoundException unused) {
            dwh.e("AppWeexEngineAutoInit class not found");
            dwh.e("No " + packageName + ".weex2.AppWeexEngineAutoInit class, app should provide one");
            return false;
        } catch (NoSuchMethodException unused2) {
            dwh.e("AppWeexEngineAutoInit." + str + " method not found");
            return false;
        } catch (Throwable th) {
            dwh.h("AppWeexEngineAutoInit." + str + " called has exception", th);
            throw th;
        }
    }

    public static void v(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f662fb", new Object[]{application});
        } else if (w4x.i() && application != null) {
            k = Boolean.valueOf(application.getSharedPreferences(TBProfConfig.CONFIG_EXHAUST_DUMP_ENABLE, 0).getBoolean(TBProfConfig.CONFIG_EXHAUST_DUMP_ENABLE, false));
        }
    }

    public static void m(WeexInstanceMode weexInstanceMode, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9f9ecd", new Object[]{weexInstanceMode, application});
        } else if (weexInstanceMode == null) {
            h("all", false, k(application), j(application), i(application));
        } else {
            int i2 = f.$SwitchMap$com$taobao$android$weex$WeexInstanceMode[weexInstanceMode.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                h("dom", false, k(application), j(application), 0L);
            } else if (i2 == 4) {
                h(h8x.KEY_MUS, false, k(application), 0L, i(application));
            } else if (i2 == 5) {
                h("script", false, k(application), 0L, 0L);
            }
        }
    }
}
