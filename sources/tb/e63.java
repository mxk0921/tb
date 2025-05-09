package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import tb.b6x;
import tb.t5x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class e63 extends pv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AutoSize_CaptureHybridViewV2";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296635);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onPrepareSuccess");
            n73.p();
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onRenderFailed: type=" + weexErrorType + ", errorMsg=" + ((Object) str));
            n73.r(String.valueOf(weexErrorType), str == null ? "unknown" : str);
            pdc x = e63.this.m().x();
            if (x != null) {
                x.k(weexErrorType == null ? null : Integer.valueOf(weexErrorType.ordinal()), str);
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                return;
            }
            com.taobao.android.weex_framework.a Q = e63.this.Q();
            if (Q != null) {
                e63 e63Var = e63.this;
                if (Q.getRenderRoot() != null) {
                    e63Var.R().removeView(Q.getRenderRoot());
                }
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            } else {
                agh.r("Dynamic", e63.TAG, "onExecuteSuccess:");
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onEngineException: type=" + weexErrorType + ", errorMsg=" + ((Object) str));
            pdc x = e63.this.m().x();
            if (x != null) {
                x.v(weexErrorType == null ? null : Integer.valueOf(weexErrorType.ordinal()), str);
            }
            String valueOf = String.valueOf(weexErrorType);
            if (str == null) {
                str = "unknown";
            }
            n73.r(valueOf, str);
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onScriptException: type=" + weexErrorType + ", errorMsg=" + ((Object) str));
            pdc x = e63.this.m().x();
            if (x != null) {
                x.v(weexErrorType == null ? null : Integer.valueOf(weexErrorType.ordinal()), str);
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onExecuteFailed: type=" + weexErrorType + ", errorMsg=" + ((Object) str));
            pdc x = e63.this.m().x();
            if (x != null) {
                x.v(weexErrorType == null ? null : Integer.valueOf(weexErrorType.ordinal()), str);
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            agh.r("Dynamic", e63.TAG, "onInitFailed: isCache=" + z + ", type=" + weexErrorType + ", errorMsg=" + ((Object) str));
            String valueOf = String.valueOf(weexErrorType);
            if (str == null) {
                str = "unknown";
            }
            n73.r(valueOf, str);
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            agh.r("Dynamic", e63.TAG, ckf.p("onRenderSuccess: isRefresh=", Boolean.valueOf(z)));
            if (!z && !e63.this.P() && !lg4.A1() && !e63.this.m().T()) {
                n73.s();
                e63.this.Y(true);
                e63.this.V();
                e63.d0(e63.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e63.c0(e63.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ t5x.a c;

        public e(t5x.a aVar) {
            this.c = aVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/CaptureHybridViewV2$initMuiseInstance$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.c.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b6x.a f18309a;
            public final /* synthetic */ e63 b;

            public a(b6x.a aVar, e63 e63Var) {
                this.f18309a = aVar;
                this.b = e63Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b6x.a aVar = this.f18309a;
                WeexInstance b = aVar == null ? null : aVar.b(this.b.I());
                e63 e63Var = this.b;
                if (b != null) {
                    WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) b;
                    e63Var.X(weexInstanceImpl.getAdapterMUSInstance());
                    if (e63Var.U()) {
                        e63.d0(e63Var);
                    } else if (e63Var.P()) {
                        weexInstanceImpl.destroy();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex.WeexInstanceImpl");
                }
            }
        }

        public f() {
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
            } else {
                e63.this.R().post(new a(aVar, e63.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.e63.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bfd58f3", new Object[]{this, str});
            } else {
                e63.b0(e63.this, str);
            }
        }
    }

    static {
        t2o.a(481296634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e63(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(rccVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static final /* synthetic */ void b0(e63 e63Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a46e2d4", new Object[]{e63Var, str});
        } else {
            e63Var.g0(str);
        }
    }

    public static final /* synthetic */ void c0(e63 e63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71efd8f", new Object[]{e63Var});
        } else {
            e63Var.i0();
        }
    }

    public static final /* synthetic */ void d0(e63 e63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb7789", new Object[]{e63Var});
        } else {
            e63Var.l0();
        }
    }

    public static /* synthetic */ Object ipc$super(e63 e63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/CaptureHybridViewV2");
    }

    @Override // tb.pv1
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (ast.INSTANCE.a()) {
            m().j(new d());
        } else {
            i0();
        }
    }

    public final void e0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c574a794", new Object[]{this, view});
        } else if (view != null) {
            R().addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final j6x f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j6x) ipChange.ipc$dispatch("ee022656", new Object[]{this});
        }
        return new c();
    }

    public final void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1269ace9", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = lg4.V1();
        }
        a0(str);
        n73.n(str);
        String str2 = p().pageUrl;
        if (str2 == null) {
            str2 = pov.a("https://h5.m.taobao.com/tusou/index.html", p().getExtraParams());
            ckf.f(str2, "appendQueryParameter(\"ht…extraParams\n            )");
        }
        JSONObject O = O();
        t5x b2 = com.taobao.android.weex.b.b(I(), str2, WeexInstanceMode.MUS, WeexRenderType.UIKIT, null, null);
        ckf.f(b2, "createInstanceAsync(\n   …KIT, null, null\n        )");
        b2.c(caa.h(caa.c()), caa.g(caa.c()));
        b2.initWithURL(str);
        b2.addInstanceListener(f0());
        if (!TextUtils.isEmpty(ScreenType.h(J()))) {
            b2.updateInstanceEnv(k7m.KEY_SCREEN_STYLE, WeexValueImpl.ofString(ScreenType.h(J())));
        }
        b2.setTag("ali_ms_navigation", new j63((AppCompatActivity) this.c));
        WeexValueImpl ofJSONObject = WeexValueImpl.ofJSONObject(O);
        ckf.f(ofJSONObject, "ofJSONObject(params)");
        b2.render(ofJSONObject);
        t5x.a b3 = b2.b(new f());
        ckf.f(b3, "@SuppressLint(\"Restricte…       }\n        })\n    }");
        vpt.g("AutoSize_CaptureHybridViewV2initMuiseInstance", new e(b3));
    }

    public final void h0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0f6ee5", new Object[]{this, bVar});
            return;
        }
        String S = S();
        if (S != null && S.length() > 0) {
            bVar.a(S);
        } else {
            k0(bVar);
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc384fa", new Object[]{this});
            return;
        }
        n73.c(p().getPssource(), true);
        h0(new g());
    }

    public final void k0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dae3a9", new Object[]{this, bVar});
            return;
        }
        agh.h(TAG, "loadTemplateWithoutBackSourceLink");
        String X1 = lg4.X1();
        if (X1 == null || X1.length() == 0) {
            j0(bVar);
        } else {
            bVar.a(X1);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0326c0", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a Q = Q();
        if (Q != null) {
            e0(Q.getRenderRoot());
            Q.getRenderRoot().setBackground(new BitmapDrawable(this.c.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
            pdc x = m().x();
            if (x != null) {
                x.a();
            }
        }
    }

    public final void j0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e93160c", new Object[]{this, bVar});
            return;
        }
        mzu.n(p73.f25916a, "loadTemplateWithCachedUrl", 19999, new String[0]);
        String f2 = PltTemplatesManager.f(PltTemplatesManager.d());
        if (f2 == null || TextUtils.isEmpty(f2)) {
            f2 = lg4.V1();
        }
        agh.h(TAG, ckf.p("loadTemplateWithCachedUrl ", f2));
        bVar.a(f2);
    }
}
