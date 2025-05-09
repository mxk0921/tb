package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v6n extends cx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final kgd b;
    public final cgd c;
    public final tmc d;
    public final lbn e;
    public volatile boolean f = false;
    public final tpm<String> g = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!v6n.d(v6n.this)) {
                RSoLog.d("QJSSoLoader, not use qjs ab, skipped");
            } else {
                v6n.e(v6n.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d("QJSSoLoader, real do check double qjs in maps");
            if (qxm.a(v6n.f(v6n.this))) {
                v6n.g(v6n.this).b("key_qjs_ab_local_enabled", Boolean.FALSE.toString());
                rbn.e("doubleqjs.error", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends uxp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f29816a;
        public boolean b = false;

        public d(Runnable runnable) {
            this.f29816a = runnable;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -857321247) {
                super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/tbadapter/biz/QJSSoLoader$QJSWatcherCallback");
        }

        @Override // tb.uxp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            super.onActivityCreated(activity, bundle);
            if (activity == null) {
                RSoLog.g("QJSSoLoader, QJSWatcherCallback, activity == null !!!");
            } else if (!this.b && trq.d("SearchDoorActivity", activity.getLocalClassName())) {
                this.b = true;
                this.f29816a.run();
            }
        }
    }

    public v6n(hbn hbnVar, kgd kgdVar, cgd cgdVar, tmc tmcVar, lbn lbnVar) {
        super(hbnVar);
        this.b = kgdVar;
        this.c = cgdVar;
        this.d = tmcVar;
        this.e = lbnVar;
        h();
    }

    public static /* synthetic */ boolean d(v6n v6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9e41b09", new Object[]{v6nVar})).booleanValue();
        }
        return v6nVar.f;
    }

    public static /* synthetic */ void e(v6n v6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e228aa4", new Object[]{v6nVar});
        } else {
            v6nVar.i();
        }
    }

    public static /* synthetic */ tpm f(v6n v6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpm) ipChange.ipc$dispatch("f23a0a8", new Object[]{v6nVar});
        }
        return v6nVar.g;
    }

    public static /* synthetic */ tmc g(v6n v6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmc) ipChange.ipc$dispatch("6f1af446", new Object[]{v6nVar});
        }
        return v6nVar.d;
    }

    public static /* synthetic */ Object ipc$super(v6n v6nVar, String str, Object... objArr) {
        if (str.hashCode() == -501213704) {
            return super.load((String) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/tbadapter/biz/QJSSoLoader");
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1deead83", new Object[]{this});
            return;
        }
        RSoLog.d("QJSSoLoader, ready to check double qjs in maps");
        qbn.e(new c(), 3000L);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements tpm<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(v6n v6nVar) {
        }

        /* renamed from: a */
        public boolean test(String str) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            if (!str.endsWith("libquickjs.so") || str.contains("swallows")) {
                z = false;
            }
            if (z) {
                RSoLog.d("QJSSoLoader, filter maps found another qjs ".concat(str));
            }
            return z;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5825a0", new Object[]{this});
        } else if (!this.c.a("key_qjs_double_check_disabled", false)) {
            RSoLog.d("QJSSoLoader, registerWatcher start...");
            this.b.getApp().registerActivityLifecycleCallbacks(new d(new b()));
        }
    }

    @Override // tb.cx1, tb.hbn
    public l6h load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e22015f8", new Object[]{this, str});
        }
        if (!trq.d("quickjs", str)) {
            return super.load(str);
        }
        if (Build.VERSION.SDK_INT < 30) {
            RSoLog.d("QJSSoLoader, load qjs failed, < android 30");
            return l6h.a(str, 1001);
        } else if (!this.d.a("key_qjs_ab_local_enabled", true)) {
            RSoLog.d("QJSSoLoader, load qjs failed, local kv disabled");
            return l6h.a(str, 1002);
        } else if (this.d.a("local_key_qjs_ab_double_before_load", false)) {
            RSoLog.d("QJSSoLoader, load qjs failed, double qjs before load, by local");
            return l6h.a(str, 1004);
        } else if (this.c.a("key_qjs_double_check_disabled", false)) {
            RSoLog.d("QJSSoLoader, load qjs failed, config disabled");
            return l6h.a(str, 1005);
        } else {
            long b2 = uos.b();
            boolean a2 = qxm.a(this.g);
            RSoLog.d("QJSSoLoader, filter proc maps cost = " + (uos.b() - b2));
            if (a2) {
                this.d.b("local_key_qjs_ab_double_before_load", Boolean.TRUE.toString());
                rbn.e("doubleqjs.beforeload.error", "");
                return l6h.a(str, 1003);
            }
            l6h load = super.load(str);
            if (load.i()) {
                RSoLog.d("QJSSoLoader, load qjs succ, enable double qjs check");
                this.f = true;
            }
            if (!this.e.c("quickjs")) {
                this.e.b("quickjs");
            }
            return load;
        }
    }
}
