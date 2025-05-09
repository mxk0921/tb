package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d63 extends pv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AutoSize_CaptureHybridView";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857576);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d63.c0(d63.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else if (mUSDKInstance != null) {
                d63 d63Var = d63.this;
                if (mUSDKInstance.getRenderRoot() != null) {
                    d63Var.R().removeView(mUSDKInstance.getRenderRoot());
                }
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            pdc x = d63.this.m().x();
            if (x != null) {
                x.v(Integer.valueOf(i), str);
            }
            agh.r("Dynamic", d63.TAG, "onJSException: type=" + i + ", errorMsg=" + ((Object) str));
            String valueOf = String.valueOf(i);
            if (str == null) {
                str = "unknown";
            }
            n73.r(valueOf, str);
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                return;
            }
            agh.r("Dynamic", d63.TAG, "onPrepareSuccess");
            n73.p();
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            pdc x = d63.this.m().x();
            if (x != null) {
                x.v(Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            agh.r("Dynamic", d63.TAG, "onRenderFailed: type=" + i + ", errorMsg=" + ((Object) str));
            n73.r(String.valueOf(i), str == null ? "unknown" : str);
            pdc x = d63.this.m().x();
            if (x != null) {
                x.k(Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            agh.r("Dynamic", d63.TAG, sxl.RENDER_SUCCESS_TIME);
            if (aVar != null && !lg4.A1() && !d63.this.m().T() && !aVar.isDestroyed()) {
                n73.s();
                d63.this.Y(true);
                d63.d0(d63.this, aVar.getRenderRoot());
                d63.this.V();
                aVar.getRenderRoot().setBackground(new BitmapDrawable(d63.b0(d63.this).getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
                pdc x = d63.this.m().x();
                if (x != null) {
                    x.a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(d63.TAG);
            this.d = str;
            this.e = str2;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/CaptureHybridView$onGetTemplateUrl$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            zwh.Companion.a(d63.this.Q(), this.d, this.e, d63.this.O(), null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(WVMicorPublishPlugin.TEMPLATE_URL, this.d);
            xhv xhvVar = xhv.INSTANCE;
            TLogTracker.r("Default", "HybridLoad", linkedHashMap);
        }
    }

    static {
        t2o.a(730857575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d63(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(rccVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static final /* synthetic */ Activity b0(d63 d63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c32e67d0", new Object[]{d63Var});
        }
        return d63Var.c;
    }

    public static final /* synthetic */ void c0(d63 d63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce93e7e", new Object[]{d63Var});
        } else {
            d63Var.f0();
        }
    }

    public static final /* synthetic */ void d0(d63 d63Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65acd1cd", new Object[]{d63Var, view});
        } else {
            d63Var.j0(view);
        }
    }

    public static /* synthetic */ Object ipc$super(d63 d63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/CaptureHybridView");
    }

    @Override // tb.pv1
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        n73.c(p().getPssource(), true);
        e0();
        if (lg4.C0()) {
            f0();
        } else {
            m().j(new b());
        }
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3185cdf", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.b f = com.taobao.android.weex_framework.b.f();
        Activity activity = this.c;
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        String str = p().pageUrl;
        if (str == null) {
            str = pov.a("https://h5.m.taobao.com/tusou/index.html", p().getExtraParams());
        }
        mUSInstanceConfig.p(str);
        xhv xhvVar = xhv.INSTANCE;
        com.taobao.android.weex_framework.a c2 = f.c(activity, mUSInstanceConfig);
        X(c2);
        if (!TextUtils.isEmpty(ScreenType.h(J()))) {
            c2.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(J()));
        }
        c2.setTag("ali_ms_navigation", new j63((AppCompatActivity) this.c));
        c2.registerRenderListener(new c());
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af717407", new Object[]{this});
            return;
        }
        String S = S();
        if (S != null && S.length() > 0) {
            i0(S);
        } else {
            h0();
        }
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82a14cb", new Object[]{this});
            return;
        }
        agh.h(TAG, "loadTemplateWithoutBackSourceLink");
        String X1 = lg4.X1();
        if (X1 == null || X1.length() == 0) {
            g0();
        } else {
            i0(X1);
        }
    }

    public final void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfd52f", new Object[]{this, str});
            return;
        }
        agh.h(TAG, ckf.p("onGetTemplateUrl: ", str));
        if (Q() == null) {
            agh.c(TAG, "mMuiseInstance is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = lg4.V1();
        }
        a0(str);
        n73.n(str);
        String a2 = pov.a("https://h5.m.taobao.com/tusou/index.html", p().getExtraParams());
        ckf.f(a2, "appendQueryParameter(\n  …geModel.extraParams\n    )");
        vpt.g("renderMuise", new d(str, a2));
    }

    public final void j0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10e9a12", new Object[]{this, view});
        } else if (view != null) {
            R().addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5792182e", new Object[]{this});
            return;
        }
        mzu.n(p73.f25916a, "loadTemplateWithCachedUrl", 19999, new String[0]);
        String f = PltTemplatesManager.f(PltTemplatesManager.d());
        if (f == null || TextUtils.isEmpty(f)) {
            f = lg4.V1();
        }
        agh.h(TAG, ckf.p("loadTemplateWithCachedUrl ", f));
        ckf.d(f);
        i0(f);
    }
}
