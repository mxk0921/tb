package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class sz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NewDetailMaskFrameLayout f28369a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends l5i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean g;

        public b(boolean z) {
            this.g = z;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -295319650) {
                return new Boolean(super.f());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/anim/DressUpMaskFrameAnimHelper$setContentViewForMaskFrameLayout$1");
        }

        @Override // tb.l5i
        public boolean B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("517f71f8", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.l5i
        public boolean F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b08c31b9", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.l5i
        public boolean J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("966081bf", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.l5i
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75a85d94", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "tag");
            ckf.g(str2, "msg");
            tpu.Companion.a(str, str2, null);
        }

        @Override // tb.l5i
        public void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
                return;
            }
            ckf.g(str, "tag");
            ckf.g(str2, "msg");
            ckf.g(th, "throwable");
            tpu.Companion.a(str, str2, th);
        }

        @Override // tb.l5i
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
            }
            return sz7.this.j();
        }

        @Override // tb.l5i
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fda44fa5", new Object[]{this})).booleanValue();
            }
            return sz7.e(sz7.this);
        }

        @Override // tb.l5i
        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f123bb74", new Object[]{this})).booleanValue();
            }
            return sz7.f(sz7.this);
        }

        @Override // tb.l5i
        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ee65c79e", new Object[]{this})).booleanValue();
            }
            if (this.g) {
                return true;
            }
            return super.f();
        }

        @Override // tb.l5i
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e6421f56", new Object[]{this})).intValue();
            }
            return sz7.a(sz7.this);
        }

        @Override // tb.l5i
        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6428b2", new Object[]{this})).intValue();
            }
            return sz7.b(sz7.this);
        }

        @Override // tb.l5i
        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4629b9ac", new Object[]{this})).intValue();
            }
            return sz7.c(sz7.this);
        }

        @Override // tb.l5i
        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5366272a", new Object[]{this})).intValue();
            }
            return sz7.d(sz7.this);
        }

        @Override // tb.l5i
        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fec598ca", new Object[]{this});
            }
            return qz7.TAG_FAST_ANIM;
        }

        @Override // tb.l5i
        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9de920a", new Object[]{this})).intValue();
            }
            return sz7.g(sz7.this);
        }

        @Override // tb.l5i
        public boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdf9c9cb", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.l5i
        public void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2016d0c7", new Object[]{this});
            }
        }

        @Override // tb.l5i
        public void z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d01d14", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(918552610);
    }

    public static final /* synthetic */ int a(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a556a84e", new Object[]{sz7Var})).intValue();
        }
        return sz7Var.g;
    }

    public static final /* synthetic */ int b(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78bd16d0", new Object[]{sz7Var})).intValue();
        }
        return sz7Var.f;
    }

    public static final /* synthetic */ int c(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("660cf4b8", new Object[]{sz7Var})).intValue();
        }
        return sz7Var.i;
    }

    public static final /* synthetic */ int d(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79672358", new Object[]{sz7Var})).intValue();
        }
        return sz7Var.h;
    }

    public static final /* synthetic */ boolean e(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8fbaa7", new Object[]{sz7Var})).booleanValue();
        }
        return sz7Var.c;
    }

    public static final /* synthetic */ boolean f(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14f7d2ac", new Object[]{sz7Var})).booleanValue();
        }
        return sz7Var.d;
    }

    public static final /* synthetic */ int g(sz7 sz7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3660b5a", new Object[]{sz7Var})).intValue();
        }
        return sz7Var.e;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1456c4", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e388fb50", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void k() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.b && (newDetailMaskFrameLayout = this.f28369a) != null && newDetailMaskFrameLayout != null) {
            newDetailMaskFrameLayout.destroy();
        }
    }

    public final void l(Activity activity, xfb xfbVar) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86d7897", new Object[]{this, activity, xfbVar});
            return;
        }
        ckf.g(activity, "activity");
        View findViewById = activity.findViewById(R.id.rootAnimFrameLayout);
        FrameLayout frameLayout = null;
        if (!(findViewById instanceof NewDetailMaskFrameLayout)) {
            findViewById = null;
        }
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = (NewDetailMaskFrameLayout) findViewById;
        this.f28369a = newDetailMaskFrameLayout;
        if (newDetailMaskFrameLayout == null) {
            qz7.a(qz7.TAG_FAST_ANIM, "setContentViewForMaskFrameLayout mNewDetailMaskFrameLayout is null.", null);
            this.b = false;
            if (xfbVar != null) {
                xfbVar.M2();
            } else {
                qz7.a(qz7.TAG_FAST_ANIM, "异常: animPageContainer is null.", null);
            }
        } else {
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            this.e = iz7.f(deviceScore);
            this.g = iz7.b(deviceScore);
            if (kz7.a()) {
                this.e = (int) (this.e * 1.5f);
                this.g = (int) (this.g * 1.5f);
            }
            this.h = iz7.d();
            this.i = iz7.c();
            activity.overridePendingTransition(0, 0);
            qz7.a(qz7.TAG_FAST_ANIM, "OnCreate mHasHitWeexOpenImmediatelyPreSendData", null);
            this.c = iz7.e();
            this.d = iz7.a();
            activity.getIntent();
            if (!this.k || this.j) {
                z = false;
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = this.f28369a;
            ckf.d(newDetailMaskFrameLayout2);
            newDetailMaskFrameLayout2.setMaskFrameLayoutHandler(new b(z));
            View findViewById2 = activity.findViewById(R.id.rootParentFrameLayout);
            if (findViewById2 instanceof FrameLayout) {
                frameLayout = findViewById2;
            }
            FrameLayout frameLayout2 = frameLayout;
            NewDetailMaskFrameLayout newDetailMaskFrameLayout3 = this.f28369a;
            if (newDetailMaskFrameLayout3 != null) {
                newDetailMaskFrameLayout3.setParentFrameLayout(frameLayout2);
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout4 = this.f28369a;
            if (newDetailMaskFrameLayout4 != null) {
                z2 = newDetailMaskFrameLayout4.initAnim();
            }
            this.b = z2;
            if (!z2) {
                try {
                    NewDetailMaskFrameLayout.degradeToOldTransition(activity, R.anim.push_left_in, R.anim.push_left_out);
                } catch (Throwable th) {
                    qz7.a(qz7.TAG_FAST_ANIM, "大概率动画资源不存在，动画降级失败。", th);
                }
            }
        }
    }

    public final void m(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4230ef15", new Object[]{this, activity, intent});
            return;
        }
        ckf.g(activity, "activity");
        if (intent != null && intent.getBooleanExtra("realHitMaskFrameAnim", false)) {
            try {
                ixy.Companion.a(activity);
                this.b = true;
                this.f = NewDetailMaskFrameLayout.getAdapterSpeedFromIntent(intent);
                qz7.a(qz7.TAG_FAST_ANIM, "setTheme 成功了", null);
            } catch (Throwable th) {
                qz7.a(qz7.TAG_FAST_ANIM, "未知异常。setTheme 失败。自动降级.", th);
            }
        }
        if (intent != null && intent.getBooleanExtra("onNavHitPreCacheData", false)) {
            this.j = true;
        }
        if (intent != null && intent.getBooleanExtra("extraEnableTraStyleData", false)) {
            this.k = true;
        }
    }
}
