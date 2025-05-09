package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f25129a = -2;
    public static boolean b = true;
    public static volatile FutureTask<Void> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Callable<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f25130a;

        public a(Application application) {
            this.f25130a = application;
        }

        /* renamed from: a */
        public Void call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
            }
            o3x.a(this.f25130a);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WeexAbilityInit$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                o3x.b().run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Future<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public Integer get() throws InterruptedException, ExecutionException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("239d7ac4", new Object[]{this});
            }
            return Integer.valueOf(o3x.c());
        }

        /* renamed from: c */
        public Integer get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("5008feb8", new Object[]{this, new Long(j), timeUnit});
            }
            return Integer.valueOf(o3x.c());
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(980418602);
    }

    public static /* synthetic */ void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c1348", new Object[]{application});
        } else {
            h(application);
        }
    }

    public static /* synthetic */ FutureTask b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("daa4e7c9", new Object[0]);
        }
        return c;
    }

    public static int c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        int i2 = f25129a;
        if (i2 > -2) {
            return i2 + 1;
        }
        if (b) {
            try {
                lp0.e f = lp0.d().f();
                if (f == null) {
                    i = -1;
                } else {
                    i = f.f23479a;
                }
                f25129a = i;
            } catch (Throwable unused) {
                b = false;
                f25129a = -1;
            }
        } else {
            f25129a = -1;
        }
        return f25129a + 1;
    }

    public static void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67e0e6", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.initUIKit");
        f5x.r = !g(r3x.d());
        u8x.j();
    }

    public static void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5463d0", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.initUnicorn");
        u8x.j();
    }

    public static void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970ecf8b", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.initWeexFramework");
        mq0.a();
        FutureTask<Void> futureTask = c;
        if (futureTask != null) {
            try {
                futureTask.get(3000L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                dwh.e("InitZCacheTimeout");
            }
        }
        u8x.j();
    }

    public static void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4baa9bed", new Object[]{application});
            return;
        }
        try {
            ppx.b();
        } catch (Throwable th) {
            dwh.e(dwh.m(th));
        }
        try {
            yox.q("Weex", c4x.d(), c4x.a());
        } catch (Throwable th2) {
            dwh.e(dwh.m(th2));
        }
    }

    public static void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7315eeb1", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.setupUIKitConfig");
        f5x.s = d1m.class;
        f5x.t = yvh.class;
        u8x.j();
    }

    public static void j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313b2db", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.setupUnicornConfig");
        u8x.j();
    }

    public static void k(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e75d096", new Object[]{application});
            return;
        }
        u8x.i("WeexAbilityInit.setupWeexFrameworkConfig");
        c = new FutureTask<>(new a(application));
        oxh.d().c(1).post(new b());
        f5x.j = tow.class;
        f5x.l = dvw.class;
        f5x.m = x3x.class;
        f5x.i = uow.class;
        f5x.d = new c();
        if (f5x.e == null || f5x.f == null) {
            String a2 = yaa.f().a();
            String b2 = yaa.f().b();
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b2)) {
                String str = " AliApp(" + a2 + "/" + b2 + f7l.BRACKET_END_STR;
                if (f5x.e == null) {
                    f5x.e = str;
                }
                if (f5x.f == null) {
                    f5x.f = str;
                }
            }
        }
        u8x.j();
    }

    public static boolean g(mce mceVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956a4d99", new Object[]{mceVar})).booleanValue();
        }
        try {
            if (mceVar != null) {
                str = mceVar.getConfig("alimuise", "renderNodeDisable", "");
            } else {
                str = OrangeConfig.getInstance().getConfig("alimuise", "renderNodeDisable", "");
            }
            return TextUtils.equals(str, "true");
        } catch (Throwable unused) {
            return false;
        }
    }
}
