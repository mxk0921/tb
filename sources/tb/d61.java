package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.android.spdy.spduLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class d61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f17611a;
    public static boolean b;
    public static volatile boolean c;
    public static volatile long d;
    public static final CopyOnWriteArraySet<c> e = new CopyOnWriteArraySet<>();
    public static final Application.ActivityLifecycleCallbacks f = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile int f17612a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
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
                return;
            }
            this.f17612a++;
            if (d61.d()) {
                d61.h();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            this.f17612a--;
            if (this.f17612a <= 0 && !d61.d()) {
                this.f17612a = 0;
                d61.g();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17613a;

        public b(boolean z) {
            this.f17613a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = d61.a().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                try {
                    if (this.f17613a) {
                        cVar.foreground();
                    } else {
                        cVar.background();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface c {
        void background();

        void foreground();
    }

    public static /* synthetic */ CopyOnWriteArraySet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]);
        }
        return e;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60dc4062", new Object[0])).longValue();
        }
        return d;
    }

    public static void c(Context context) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else if (context != null) {
            try {
                f17611a = context;
                if (!b) {
                    Context context2 = f17611a;
                    if (context2 instanceof Application) {
                        application = (Application) context2;
                    } else {
                        application = (Application) context2.getApplicationContext();
                    }
                    if (application != null) {
                        application.registerActivityLifecycleCallbacks(f);
                        b = true;
                        return;
                    }
                    spduLog.Tloge("tnetsdk.AppLifeCycle", null, "AppLifecycle initialize fail", "context", context);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean d() {
        if (!b) {
            try {
                IpChange ipChange = GlobalAppRuntimeInfo.$ipChange;
                return ((Boolean) GlobalAppRuntimeInfo.class.getMethod("isAppBackground", new Class[0]).invoke(GlobalAppRuntimeInfo.class, new Object[0])).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        } else if (f17611a == null || c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cffec24d", new Object[0])).booleanValue();
        }
        if (!d() || d <= 0 || System.currentTimeMillis() - d <= 60000) {
            return false;
        }
        return true;
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b3e7", new Object[]{new Boolean(z)});
        } else {
            frt.b(new b(z));
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[0]);
        } else if (!d()) {
            spduLog.Tloge("tnetsdk.AppLifeCycle", null, "[onBackground]", new Object[0]);
            c = true;
            d = System.currentTimeMillis();
            f(false);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[0]);
        } else if (d()) {
            spduLog.Tloge("tnetsdk.AppLifeCycle", null, "[onForeground]", new Object[0]);
            c = false;
            f(true);
        }
    }
}
