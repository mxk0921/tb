package tb;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.AppMonitorStatTable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile dp f;
    public tp b;
    public xp c;
    public Application d;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f17992a = false;
    public final Runnable e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (dp.a(dp.this)) {
                dp.this.d(gp.a(), null, null);
                dp.a(dp.this).notify();
            }
        }
    }

    public dp() {
        new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ Runnable a(dp dpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("34cd4702", new Object[]{dpVar});
        }
        return dpVar.e;
    }

    public static synchronized dp h() {
        synchronized (dp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dp) ipChange.ipc$dispatch("9529c86b", new Object[0]);
            }
            if (f == null && f == null) {
                f = new dp();
            }
            return f;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e8f93d", new Object[]{this});
        } else if (!this.f17992a) {
            Log.e("AVFSAdapterManager", "- Unexpected: AVFSAdapterManager ensureInitialized", new UnsupportedOperationException());
            d(gp.a(), null, null);
        }
    }

    public void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f108c42", new Object[]{this, application});
        } else {
            d(application, null, null);
        }
    }

    public synchronized void d(Application application, xp xpVar, tp tpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81e7315", new Object[]{this, application, xpVar, tpVar});
        } else if (!this.f17992a) {
            i(application, xpVar, tpVar);
        }
    }

    public Application e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        b();
        Application application = this.d;
        if (application != null) {
            return application;
        }
        throw new RuntimeException("AVFSAdapterManager not initialized!");
    }

    public xp f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xp) ipChange.ipc$dispatch("4770d0f7", new Object[]{this});
        }
        b();
        return this.c;
    }

    public tp g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tp) ipChange.ipc$dispatch("7a6f9176", new Object[]{this});
        }
        b();
        tp tpVar = this.b;
        if (tpVar != null) {
            return tpVar;
        }
        throw new RuntimeException("AVFSAdapterManager not initialized!");
    }

    public final void i(Application application, xp xpVar, tp tpVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f58e7b", new Object[]{this, application, xpVar, tpVar});
            return;
        }
        this.d = application;
        if (xpVar == null) {
            try {
                IpChange ipChange2 = AppMonitor.$ipChange;
                IpChange ipChange3 = AppMonitorStatTable.$ipChange;
                this.c = new yp();
            } catch (ClassNotFoundException unused) {
            }
        } else {
            this.c = xpVar;
        }
        if (tpVar == null) {
            this.b = new ep();
        } else {
            this.b = tpVar;
        }
        if (this.d == null) {
            z = false;
        }
        this.f17992a = z;
        Log.e("AVFSAdapterManager", "- AVFSAdapterManager initialize: mInitialized=" + this.f17992a);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        return this.f17992a;
    }
}
