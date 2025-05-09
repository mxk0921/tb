package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.detail2.core.framework.floatwindow.FloatingVideoManager;
import com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ryj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NewDetailVideoFloatManager";

    /* renamed from: a  reason: collision with root package name */
    public boolean f27676a;
    public FloatingVideoManager b;
    public Context c;
    public dh7 d;
    public Runnable f;
    public boolean g;
    public x8e h;
    public final FloatPermissionManager.a i = new a();
    public final FloatPermissionManager e = new FloatPermissionManager();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements FloatPermissionManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager.a
        public void a(boolean z) {
            String str;
            j7c E;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83b6d513", new Object[]{this, new Boolean(z)});
                return;
            }
            txj.e(ryj.TAG, "requestPermission onDenied");
            ryj ryjVar = ryj.this;
            if (z) {
                str = "float_permission_request_denied";
            } else {
                str = "float_permission_timeout_denied";
            }
            ryj.a(ryjVar, str);
            if (ryj.c(ryj.this) != null && (E = ryj.c(ryj.this).E()) != null && E.b() != null) {
                E.b().b();
            }
        }

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager.a
        public void b(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beed50d1", new Object[]{this, new Boolean(z)});
                return;
            }
            txj.e(ryj.TAG, "requestPermission onGranted");
            ryj ryjVar = ryj.this;
            if (z) {
                str = "float_permission_request_granted";
            } else {
                str = "float_permission_has_granted";
            }
            ryj.a(ryjVar, str);
            ryj.b(ryj.this);
        }

        @Override // com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager.a
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
                return;
            }
            txj.e(ryj.TAG, "requestPermission onStartRequest");
            ryj.a(ryj.this, "float_request_permission");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27678a;

        public b(boolean z) {
            this.f27678a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ryj.d(ryj.this, this.f27678a);
            } catch (Throwable th) {
                txj.f(txj.TAG_INSIDE_DETAIL, "未知异常。权限无法正常请求。onPause - requestFloatPermission ", th);
            }
        }
    }

    static {
        t2o.a(352321844);
    }

    public ryj(Context context, dh7 dh7Var) {
        this.c = context;
        this.d = dh7Var;
    }

    public static /* synthetic */ void a(ryj ryjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e548b512", new Object[]{ryjVar, str});
        } else {
            ryjVar.t(str);
        }
    }

    public static /* synthetic */ void b(ryj ryjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e791249", new Object[]{ryjVar});
        } else {
            ryjVar.g();
        }
    }

    public static /* synthetic */ dh7 c(ryj ryjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("faf50719", new Object[]{ryjVar});
        }
        return ryjVar.d;
    }

    public static /* synthetic */ void d(ryj ryjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08b9fe9", new Object[]{ryjVar, new Boolean(z)});
        } else {
            ryjVar.q(z);
        }
    }

    public final boolean e() {
        x3w B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b5104a", new Object[]{this})).booleanValue();
        }
        if (!f()) {
            return false;
        }
        dh7 dh7Var = this.d;
        if (dh7Var == null || (B = dh7Var.B()) == null) {
            txj.a(txj.TAG_INSIDE_DETAIL, "enableInsideDetailPage: mDetailViewEngine is Null, enableInsideDetail is false.");
            return false;
        }
        boolean a2 = ywj.a(B.B(), ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL);
        txj.a(txj.TAG_INSIDE_DETAIL, "enableInsideDetailPage: feature enableInsideDetail , enableInsideDetail is " + a2);
        return a2;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1df51063", new Object[]{this})).booleanValue();
        }
        byj i = i();
        if (i != null) {
            return i.n();
        }
        return false;
    }

    public final void g() {
        j7c E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a319a801", new Object[]{this});
        } else if (this.c != null && (E = this.d.E()) != null) {
            x8e a2 = h8w.a(E);
            this.h = a2;
            Pair<Boolean, Map<String, String>> h = a2.h();
            if (h != null) {
                if (((Boolean) h.first).booleanValue()) {
                    FloatingVideoManager floatingVideoManager = new FloatingVideoManager(this.c, this.h);
                    this.b = floatingVideoManager;
                    floatingVideoManager.m();
                    t("float_extract_video_success");
                    return;
                }
                u("float_extract_video_fail", (Map) h.second);
            }
        }
    }

    public final com.taobao.android.detail2.core.framework.data.global.a h() {
        cxj P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        dh7 dh7Var = this.d;
        if (dh7Var == null || (P = dh7Var.P()) == null) {
            return null;
        }
        return P.j();
    }

    public final byj i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        com.taobao.android.detail2.core.framework.data.global.a h = h();
        if (h != null) {
            return h.N();
        }
        return null;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d470c9", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.f != null) {
            this.f = null;
        }
        FloatingVideoManager floatingVideoManager = this.b;
        if (floatingVideoManager != null) {
            floatingVideoManager.o();
        }
        this.b = null;
        this.d = null;
        this.h = null;
        this.f27676a = false;
        this.c = null;
    }

    public void m(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
        } else {
            if (e()) {
                this.f = new b(z2);
            } else {
                q(z2);
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (e()) {
            p();
        } else {
            o();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bea67e", new Object[]{this});
            return;
        }
        x8e x8eVar = this.h;
        if (x8eVar != null && x8eVar.c()) {
            FloatingVideoManager floatingVideoManager = this.b;
            if (floatingVideoManager != null) {
                floatingVideoManager.k();
                this.b.g();
            }
            this.h.g();
            this.b = null;
            t("float_recover_video");
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae033324", new Object[]{this, new Boolean(z)});
            return;
        }
        Runnable runnable = this.f;
        if (runnable != null && !this.g) {
            this.g = true;
            if (!z) {
                runnable.run();
            }
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e0763", new Object[]{this, new Boolean(z)});
            return;
        }
        txj.a(TAG, "setCanShowMiniPlay canShowFloatVideo: " + z);
        this.f27676a = z;
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c7546e", new Object[]{this, str});
        } else {
            u(str, null);
        }
    }

    public final void u(String str, Map<String, String> map) {
        x3w B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9255d57", new Object[]{this, str, map});
            return;
        }
        dh7 dh7Var = this.d;
        if (dh7Var != null && (B = dh7Var.B()) != null && !TextUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.d.a0().d(B.b, str, "", "", map, B);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47af0a1f", new Object[]{this});
        } else if (e()) {
            txj.e(TAG, "requestPermissionAndShowFloatWindow mInsideDetail set False");
            this.f27676a = false;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2860036c", new Object[]{this});
        } else if (this.f != null && this.g) {
            try {
                o();
            } catch (Throwable th) {
                txj.f(txj.TAG_INSIDE_DETAIL, "未知异常，视频无法正常恢复。recoverVideo - recoverVideoForPending ", th);
            }
            this.g = false;
        }
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc29df1", new Object[]{this, new Boolean(z)});
            return;
        }
        txj.e(TAG, "requestPermissionAndShowFloatWindow " + this.f27676a);
        if (!this.f27676a) {
            dh7 dh7Var = this.d;
            if (dh7Var != null && dh7Var.E() != null && this.d.E().b() != null && !z) {
                this.d.E().b().b();
                return;
            }
            return;
        }
        t("float_check_permission");
        if (e()) {
            txj.e(TAG, "requestPermissionAndShowFloatWindow mInsideDetail is True");
        } else {
            this.f27676a = false;
        }
        this.e.d(this.c, this.i);
    }
}
