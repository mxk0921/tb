package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class al9 implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f15809a = new ArrayList<>();
    public final ArrayList<c> b = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                al9.c(al9.this);
            } else if (i == 2) {
                al9.b(al9.this);
            } else if (i == 50) {
                al9.a(al9.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                return;
            }
            Object[] d = al9.d(al9.this);
            if (d != null) {
                for (Object obj : d) {
                    ((d) obj).onTabChanged(i, str);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void onActivityCreate(String str);

        void onBackground();

        void onExit();

        void onForeground();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void onTabChanged(int i, String str);
    }

    static {
        t2o.a(676331529);
    }

    public al9() {
        c21.c(new a());
        com.taobao.tao.navigation.a.h(new b());
    }

    public static /* synthetic */ void a(al9 al9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30a28f4", new Object[]{al9Var});
        } else {
            al9Var.h();
        }
    }

    public static /* synthetic */ void b(al9 al9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff74013", new Object[]{al9Var});
        } else {
            al9Var.i();
        }
    }

    public static /* synthetic */ void c(al9 al9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece45732", new Object[]{al9Var});
        } else {
            al9Var.g();
        }
    }

    public static /* synthetic */ Object[] d(al9 al9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("b447d272", new Object[]{al9Var});
        }
        return al9Var.f();
    }

    public final Object[] e() {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("9d328e8e", new Object[]{this});
        }
        synchronized (this.b) {
            try {
                if (this.b.size() > 0) {
                    objArr = this.b.toArray();
                } else {
                    objArr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objArr;
    }

    public final Object[] f() {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("4e032b0c", new Object[]{this});
        }
        synchronized (this.f15809a) {
            try {
                if (this.f15809a.size() > 0) {
                    objArr = this.f15809a.toArray();
                } else {
                    objArr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objArr;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e != null) {
            for (Object obj : e) {
                ((c) obj).onBackground();
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e != null) {
            for (Object obj : e) {
                ((c) obj).onExit();
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e != null) {
            for (Object obj : e) {
                ((c) obj).onForeground();
            }
        }
    }

    public void j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ade756", new Object[]{this, cVar});
            return;
        }
        synchronized (this.b) {
            this.b.add(cVar);
        }
    }

    public void k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856c73ee", new Object[]{this, dVar});
            return;
        }
        synchronized (this.f15809a) {
            this.f15809a.add(dVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        Object[] e = e();
        if (e != null) {
            for (Object obj : e) {
                ((c) obj).onActivityCreate(activity.getClass().getName());
            }
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
