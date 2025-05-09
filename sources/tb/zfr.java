package tb;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tbicontext.TBILifecycleManager;
import com.taobao.weex.common.WXModule;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zfr<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jd2<T> f32730a;
    public ViewGroup b;
    public final jfr<T> c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements z3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.z3o
        public void a(dq6 dq6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de567a88", new Object[]{this, dq6Var});
                return;
            }
            ckf.g(dq6Var, "error");
            if (zfr.t(zfr.this)) {
                wfr.INSTANCE.b("TBIPageManager", "requestData on failed, cur state is destroyed");
            } else {
                zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnRequestFinish, null);
            }
        }

        @Override // tb.z3o
        public void b(qd2 qd2Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de5157b", new Object[]{this, qd2Var});
                return;
            }
            ckf.g(qd2Var, "bizData");
            if (zfr.t(zfr.this)) {
                wfr.INSTANCE.b("TBIPageManager", "requestData on response, cur state is destroyed");
                return;
            }
            zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnRequestFinish, null);
            zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnProcessDataStart, null);
            T a2 = zfr.this.a().d().a(qd2Var);
            zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnProcessDataFinish, null);
            if (a2 != null) {
                zfr.this.r(a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public final void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnAppForeground, null);
            } else if (i == 1) {
                zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnAppBackground, null);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zfr.this.a().g().b(TBILifecycleManager.TBILifeCycleEnum.OnRenderFinish, null);
            }
        }
    }

    static {
        t2o.a(803209264);
    }

    public zfr(jfr<T> jfrVar) {
        ckf.g(jfrVar, "baseContext");
        this.c = jfrVar;
    }

    public static final /* synthetic */ boolean t(zfr zfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5edb7a6a", new Object[]{zfrVar})).booleanValue();
        }
        return zfrVar.d;
    }

    public final jfr<T> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfr) ipChange.ipc$dispatch("d7e4a2da", new Object[]{this});
        }
        return this.c;
    }

    public final ViewGroup b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            return viewGroup;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae524430", new Object[]{this});
        } else if (this.b == null) {
            this.b = this.c.f().a();
        }
    }

    public final void d(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnActivityResult, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent});
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        jd2<T> jd2Var = this.f32730a;
        if (jd2Var == null || !jd2Var.d()) {
            return false;
        }
        return true;
    }

    public final void f(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        c();
        this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnCreate, null);
        this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnRequestStart, null);
        jd2<T> jd2Var = this.f32730a;
        if (jd2Var != null) {
            jd2Var.g(bundle, new a());
        }
        c21.c(new b());
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d = true;
        this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnDestroy, null);
        this.c.j();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnPause, null);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnRestart, null);
        }
    }

    public final void k(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnRestoreInstanceState, bundle);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnResume, null);
        }
    }

    public final void m(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnSaveInstanceState, bundle);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnStart, null);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnStop, null);
        }
    }

    public final void p(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd44c4", new Object[]{this, bundle});
            return;
        }
        try {
            jd2<T> jd2Var = this.f32730a;
            if (jd2Var != null) {
                jd2Var.f(bundle);
            }
        } catch (Throwable th) {
            wfr.INSTANCE.c("TBIPageManager", "preload error", th);
        }
    }

    public final void q(jd2<T> jd2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a379075e", new Object[]{this, jd2Var});
        } else {
            this.f32730a = jd2Var;
        }
    }

    public final void r(T t) {
        List<na4<?>> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, t});
            return;
        }
        wfr wfrVar = wfr.INSTANCE;
        wfrVar.a("TBIPageManager", "set data");
        if (this.d) {
            wfrVar.b("TBIPageManager", "set state cur state is destroyed");
            return;
        }
        c();
        this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnRenderStart, null);
        jd2<T> jd2Var = this.f32730a;
        if (jd2Var != null && (e = jd2Var.e(t)) != null) {
            this.c.d().f(t);
            this.c.f().b(e);
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.post(new c());
            } else {
                ckf.y("rootView");
                throw null;
            }
        }
    }

    public final void s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "<set-?>");
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        ckf.g(strArr, "permissions");
        ckf.g(iArr, WXModule.GRANT_RESULTS);
        this.c.g().b(TBILifecycleManager.TBILifeCycleEnum.OnRequestPermissionResult, new Serializable[]{Integer.valueOf(i), strArr, iArr});
    }
}
