package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NewDetailMaskFrameLayout f29658a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public MUSDKInstance j;
    public boolean k;
    public boolean l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends l5i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;

        public a(boolean z) {
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -295319650) {
                return new Boolean(super.f());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/anim/NewDetailMaskFrameAnimHelper$2");
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
            return true;
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
            } else {
                txj.e(str, str2);
            }
        }

        @Override // tb.l5i
        public void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
            } else {
                txj.f(str, str2, th);
            }
        }

        @Override // tb.l5i
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
            }
            return uxj.a(uxj.this);
        }

        @Override // tb.l5i
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fda44fa5", new Object[]{this})).booleanValue();
            }
            return uxj.g(uxj.this);
        }

        @Override // tb.l5i
        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f123bb74", new Object[]{this})).booleanValue();
            }
            return uxj.h(uxj.this);
        }

        @Override // tb.l5i
        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ee65c79e", new Object[]{this})).booleanValue();
            }
            if (this.c) {
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
            return uxj.d(uxj.this);
        }

        @Override // tb.l5i
        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6428b2", new Object[]{this})).intValue();
            }
            return uxj.c(uxj.this);
        }

        @Override // tb.l5i
        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4629b9ac", new Object[]{this})).intValue();
            }
            return uxj.f(uxj.this);
        }

        @Override // tb.l5i
        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5366272a", new Object[]{this})).intValue();
            }
            return uxj.e(uxj.this);
        }

        @Override // tb.l5i
        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fec598ca", new Object[]{this});
            }
            return txj.TAG_FAST_ANIM;
        }

        @Override // tb.l5i
        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9de920a", new Object[]{this})).intValue();
            }
            return uxj.b(uxj.this);
        }

        @Override // tb.l5i
        public boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdf9c9cb", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.l5i
        public void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2016d0c7", new Object[]{this});
            } else if (uxj.i(uxj.this) != null) {
                uxj.i(uxj.this).onViewDisappear();
            }
        }

        @Override // tb.l5i
        public void z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d01d14", new Object[]{this});
            } else if (uxj.i(uxj.this) != null) {
                uxj.i(uxj.this).onViewAppear();
            }
        }
    }

    static {
        t2o.a(352321607);
    }

    public static /* synthetic */ boolean a(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a54d57c1", new Object[]{uxjVar})).booleanValue();
        }
        return uxjVar.b;
    }

    public static /* synthetic */ int b(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed4cb60f", new Object[]{uxjVar})).intValue();
        }
        return uxjVar.e;
    }

    public static /* synthetic */ int c(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("354c146e", new Object[]{uxjVar})).intValue();
        }
        return uxjVar.f;
    }

    public static /* synthetic */ int d(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d4b72cd", new Object[]{uxjVar})).intValue();
        }
        return uxjVar.g;
    }

    public static /* synthetic */ int e(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c54ad12c", new Object[]{uxjVar})).intValue();
        }
        return uxjVar.h;
    }

    public static /* synthetic */ int f(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4a2f8b", new Object[]{uxjVar})).intValue();
        }
        return uxjVar.i;
    }

    public static /* synthetic */ boolean g(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55498dfb", new Object[]{uxjVar})).booleanValue();
        }
        return uxjVar.c;
    }

    public static /* synthetic */ boolean h(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d48ec5a", new Object[]{uxjVar})).booleanValue();
        }
        return uxjVar.d;
    }

    public static /* synthetic */ MUSDKInstance i(uxj uxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("c05fda5b", new Object[]{uxjVar});
        }
        return uxjVar.j;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1456c4", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e92756f9", new Object[]{this});
        }
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f29658a;
        if (newDetailMaskFrameLayout == null) {
            return "|AnimLayoutIsNull";
        }
        return newDetailMaskFrameLayout.getNewDetailMaskFrameLayoutContext().g();
    }

    public NewDetailMaskFrameLayout l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailMaskFrameLayout) ipChange.ipc$dispatch("32d6e1f3", new Object[]{this});
        }
        return this.f29658a;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e388fb50", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void n() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.b && (newDetailMaskFrameLayout = this.f29658a) != null) {
            newDetailMaskFrameLayout.destroy();
        }
    }

    public void o() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else if (this.b && (newDetailMaskFrameLayout = this.f29658a) != null) {
            newDetailMaskFrameLayout.onFinish();
        }
    }

    public void p(Activity activity, bxj bxjVar) {
        Uri data;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a4de16", new Object[]{this, activity, bxjVar});
            return;
        }
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = (NewDetailMaskFrameLayout) activity.findViewById(R.id.rootAnimFrameLayout);
        this.f29658a = newDetailMaskFrameLayout;
        if (newDetailMaskFrameLayout == null) {
            txj.e(txj.TAG_FAST_ANIM, "setContentViewForMaskFrameLayout mNewDetailMaskFrameLayout is null.");
            this.b = false;
            bxjVar.finishNewDetailContainer();
            return;
        }
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        this.e = byj.R0(deviceScore);
        this.g = byj.A0(deviceScore);
        if (gxj.b()) {
            this.e = (int) (this.e * 1.5f);
            this.g = (int) (this.g * 1.5f);
        }
        this.h = byj.D0();
        this.i = byj.C0();
        this.j = j9x.a();
        activity.overridePendingTransition(0, 0);
        txj.e(txj.TAG_FAST_ANIM, "OnCreate mHasHitWeexOpenImmediatelyPreSendData");
        this.c = byj.N0();
        this.d = r19.p();
        Intent intent = activity.getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            gxq.EXP_ITEM_ARTICLE.equals(data.getQueryParameter(xmo.SP_KEY_ENTRY_EXP));
        }
        if (!this.l || this.k) {
            z = false;
        }
        this.f29658a.setMaskFrameLayoutHandler(new a(z));
        this.f29658a.setParentFrameLayout((FrameLayout) activity.findViewById(R.id.rootParentFrameLayout));
        boolean initAnim = this.f29658a.initAnim();
        this.b = initAnim;
        if (!initAnim) {
            try {
                NewDetailMaskFrameLayout.degradeToOldTransition(activity, R.anim.push_left_in, R.anim.push_left_out);
            } catch (Throwable th) {
                txj.f(txj.TAG_FAST_ANIM, "大概率动画资源不存在，动画降级失败。", th);
            }
        }
    }

    public void q(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4230ef15", new Object[]{this, activity, intent});
            return;
        }
        if (intent != null && intent.getBooleanExtra("realHitMaskFrameAnim", false)) {
            try {
                activity.setTheme(R.style.Theme_NewDetailMainPage_Transparent);
                this.b = true;
                this.f = NewDetailMaskFrameLayout.getAdapterSpeedFromIntent(intent);
            } catch (Throwable th) {
                txj.f(txj.TAG_FAST_ANIM, "未知异常。setTheme 失败。自动降级.", th);
            }
        }
        if (intent != null && intent.getBooleanExtra("onNavHitPreCacheData", false)) {
            this.k = true;
        }
        if (intent != null && intent.getBooleanExtra("extraEnableTraStyleData", false)) {
            this.l = true;
        }
    }
}
