package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.SFSrpConfig;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.android.xsearchplugin.weex.SFWeexSDK;
import com.taobao.tao.Globals;
import java.util.WeakHashMap;
import tb.l4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile yko b;

    /* renamed from: a  reason: collision with root package name */
    public static Context f21742a = Globals.getApplication();
    public static final WeakHashMap<Activity, Long> c = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            try {
                j3p.e().put(activity, Long.valueOf(System.currentTimeMillis()));
                c4p.D("[XS.page]", "[Page enter] Activity: %s, url: %s", activity, activity.getIntent().getData());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            try {
                c4p.D("[XS.page]", "[Page exit] Activity: %s, url: %s", activity, activity.getIntent().getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            try {
                c4p.D("[XS.page]", "[Page background] Activity: %s, url: %s", activity, activity.getIntent().getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            try {
                c4p.D("[XS.page]", "[Page foreground] Activity: %s, url: %s", activity, activity.getIntent().getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean[] f21743a;
        public fj4 b;
        public String c;

        static {
            t2o.a(993001570);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public final void a(yko ykoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3779953d", new Object[]{this, ykoVar});
                return;
            }
            try {
                SFMuiseSDK.install(ykoVar);
            } catch (Throwable th) {
                c4p.o("SearchFrameSDK", "muise: ", th);
            }
        }

        public final void b(yko ykoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa059adb", new Object[]{this, ykoVar});
                return;
            }
            try {
                SFSrpConfig.install(ykoVar);
            } catch (Throwable th) {
                c4p.o("SearchFrameSDK", "rcmd: ", th);
            }
        }

        public final void c(yko ykoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1416843b", new Object[]{this, ykoVar});
                return;
            }
            try {
                SFWeexSDK.install(ykoVar);
            } catch (Throwable th) {
                c4p.o("SearchFrameSDK", "weex: ", th);
            }
        }

        public b e(float f, int i, int i2, int i3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9e270a41", new Object[]{this, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), str});
            }
            ej4.f18611a = i2;
            ej4.b = i3;
            ej4.c = str;
            this.f21743a[1] = true;
            return this;
        }

        public b f(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("62bf483b", new Object[]{this, context});
            }
            j3p.a(context);
            this.f21743a[0] = true;
            return this;
        }

        public b g(l4p.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6b5bebb7", new Object[]{this, aVar});
            }
            l4p.f23109a = aVar;
            this.f21743a[3] = true;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c82c6942", new Object[]{this, str});
            }
            this.c = str;
            this.f21743a[2] = true;
            return this;
        }

        public b i(fj4 fj4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("59073dcb", new Object[]{this, fj4Var});
            }
            this.b = fj4Var;
            this.f21743a[4] = true;
            return this;
        }

        public b() {
            this.f21743a = new boolean[5];
        }

        public yko d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yko) ipChange.ipc$dispatch("70e8b6c7", new Object[]{this});
            }
            for (boolean z : this.f21743a) {
                if (!z) {
                    throw new IllegalStateException("sdk init not finished");
                }
            }
            yko ykoVar = new yko(this.b);
            ykoVar.r().b(this.c);
            ykoVar.o().e(new q5j(ykoVar));
            ykoVar.o().f(new q7b(ykoVar));
            ykoVar.o().g(new q7b(ykoVar));
            ykoVar.l().r(this.b.isDebug());
            c4p.q(this.b.isDebug());
            c(ykoVar);
            a(ykoVar);
            b(ykoVar);
            if (j3p.b() == null) {
                j3p.c(ykoVar);
                try {
                    vvh.e().get("app").put("serverVersion", this.b.a());
                } catch (Throwable unused) {
                }
                try {
                    j3p.d();
                } catch (Throwable unused2) {
                }
            }
            return ykoVar;
        }
    }

    static {
        t2o.a(993001568);
    }

    public static /* synthetic */ Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9047446", new Object[]{context});
        }
        f21742a = context;
        return context;
    }

    public static /* synthetic */ yko b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("2be93f48", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ yko c(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("1448719b", new Object[]{ykoVar});
        }
        b = ykoVar;
        return ykoVar;
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            i();
        }
    }

    public static WeakHashMap<Activity, Long> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("a231920c", new Object[0]);
        }
        return c;
    }

    public static Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return f21742a;
    }

    public static yko g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("17b4b9a2", new Object[0]);
        }
        return b;
    }

    public static b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9284d440", new Object[0]);
        }
        c4p.m("SearchFrameSDK", "start init search framework");
        return new b(null);
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e2238f", new Object[0]);
            return;
        }
        Context context = f21742a;
        if (context != null) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }
}
