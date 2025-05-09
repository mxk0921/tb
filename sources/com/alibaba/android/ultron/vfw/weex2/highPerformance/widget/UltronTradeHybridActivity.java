package com.alibaba.android.ultron.vfw.weex2.highPerformance.widget;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.acq;
import tb.d9c;
import tb.dbv;
import tb.gcv;
import tb.hav;
import tb.lbv;
import tb.nbv;
import tb.nz0;
import tb.obv;
import tb.qbv;
import tb.t2o;
import tb.v9v;
import tb.ybv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronTradeHybridActivity extends BaseActivity implements d9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2381a;
    public com.taobao.android.weex_framework.a b;
    public UltronTradeHybridDialogFragment c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements TradeHybridInstanceFactory.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f2382a;

        public a(Bundle bundle) {
            this.f2382a = bundle;
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216a9675", new Object[]{this});
                return;
            }
            hav.d("UltronTradeHybridActivity", "onInstanceCreateFail");
            UltronTradeHybridActivity.p3(UltronTradeHybridActivity.this, this.f2382a);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory.a
        public void c(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6223ad72", new Object[]{this, aVar});
            } else if (!TradeHybridDataFactory.INSTANCE.v(UltronTradeHybridActivity.n3(UltronTradeHybridActivity.this))) {
                hav.g("UltronTradeHybridActivity", "onInstanceBizReady:", "not hit prerequest");
            } else if (aVar == null || aVar.isDestroyed()) {
                hav.g("UltronTradeHybridActivity", "onInstanceBizReady:", "instance is invalid");
            } else {
                String r = TradeHybridDataFactory.r(UltronTradeHybridActivity.n3(UltronTradeHybridActivity.this));
                if (TextUtils.isEmpty(r)) {
                    hav.g("UltronTradeHybridActivity", "onInstanceBizReady:", "uniqueKey is empty");
                } else {
                    TradeHybridDataFactory.h(aVar, r);
                }
            }
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory.a
        public void b(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("934c8d27", new Object[]{this, aVar});
            } else if (aVar == null) {
                hav.g("UltronTradeHybridActivity", "onInstanceReady:", "instance is null");
            } else {
                aVar.resetContext(UltronTradeHybridActivity.this.getActivity());
                View renderRoot = aVar.getRenderRoot();
                if (renderRoot == null) {
                    hav.g("UltronTradeHybridActivity", "onInstanceReady:", "renderRootView is null");
                    return;
                }
                if (renderRoot.getParent() instanceof ViewGroup) {
                    ((ViewGroup) renderRoot.getParent()).removeView(renderRoot);
                }
                ViewGroup.LayoutParams layoutParams = renderRoot.getLayoutParams();
                if (layoutParams == null) {
                    renderRoot.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                UltronTradeHybridActivity ultronTradeHybridActivity = UltronTradeHybridActivity.this;
                UltronTradeHybridActivity.m3(ultronTradeHybridActivity, UltronTradeHybridActivity.o3(ultronTradeHybridActivity, UltronTradeHybridActivity.n3(ultronTradeHybridActivity), aVar, true));
                UltronTradeHybridActivity.l3(UltronTradeHybridActivity.this).M2(UltronTradeHybridActivity.this.getActivity(), this.f2382a);
            }
        }
    }

    static {
        t2o.a(157286949);
        t2o.a(336592968);
    }

    public static /* synthetic */ Object ipc$super(UltronTradeHybridActivity ultronTradeHybridActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/widget/UltronTradeHybridActivity");
        }
    }

    public static /* synthetic */ UltronTradeHybridDialogFragment l3(UltronTradeHybridActivity ultronTradeHybridActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("2c9c4330", new Object[]{ultronTradeHybridActivity});
        }
        return ultronTradeHybridActivity.c;
    }

    public static /* synthetic */ UltronTradeHybridDialogFragment m3(UltronTradeHybridActivity ultronTradeHybridActivity, UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("3f620267", new Object[]{ultronTradeHybridActivity, ultronTradeHybridDialogFragment});
        }
        ultronTradeHybridActivity.c = ultronTradeHybridDialogFragment;
        return ultronTradeHybridDialogFragment;
    }

    public static /* synthetic */ String n3(UltronTradeHybridActivity ultronTradeHybridActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6197b048", new Object[]{ultronTradeHybridActivity});
        }
        return ultronTradeHybridActivity.f2381a;
    }

    public static /* synthetic */ UltronTradeHybridDialogFragment o3(UltronTradeHybridActivity ultronTradeHybridActivity, String str, com.taobao.android.weex_framework.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("c8e9dd0f", new Object[]{ultronTradeHybridActivity, str, aVar, new Boolean(z)});
        }
        return ultronTradeHybridActivity.r3(str, aVar, z);
    }

    public static /* synthetic */ void p3(UltronTradeHybridActivity ultronTradeHybridActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef2fa7e", new Object[]{ultronTradeHybridActivity, bundle});
        } else {
            ultronTradeHybridActivity.C3(bundle);
        }
    }

    public final void C3(Bundle bundle) {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acef1f6", new Object[]{this, bundle});
            return;
        }
        boolean x3 = x3(this.b);
        if (x3) {
            aVar = this.b;
        } else {
            aVar = com.alibaba.android.ultron.vfw.weex2.a.g().d(getActivity(), this.f2381a, UltronTradeHybridInstanceRenderMode.UNSPECIFIC);
        }
        this.c = r3(this.f2381a, aVar, x3);
        if (getIntent() != null) {
            lbv.r(this.c, this.f2381a, getIntent().getExtras());
        }
        this.c.M2(this, bundle);
    }

    public final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a00177", new Object[]{this, bundle});
        } else if (getIntent() == null || getIntent().getData() == null || TextUtils.isEmpty(getIntent().getData().toString())) {
            hav.g("UltronTradeHybridActivity", "initParams:", "invalid url");
        } else {
            this.f2381a = getIntent().getData().toString();
            b(bundle);
            if (!A3()) {
                Object m = qbv.j().m(this.f2381a);
                if (m instanceof com.taobao.android.weex_framework.a) {
                    this.b = (com.taobao.android.weex_framework.a) m;
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.d9c
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = this.c;
        if (ultronTradeHybridDialogFragment == null || !ultronTradeHybridDialogFragment.g3()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (this.e) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.f) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 4 || getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            return super.onKeyDown(i, keyEvent);
        }
        getSupportFragmentManager().popBackStack();
        return true;
    }

    public final void q3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4899e917", new Object[]{this, bundle});
            return;
        }
        String r = TradeHybridDataFactory.r(this.f2381a);
        TradeHybridInstanceFactory.r(r);
        TradeHybridInstanceFactory.l(r, new a(bundle));
    }

    public final UltronTradeHybridDialogFragment r3(String str, com.taobao.android.weex_framework.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("be3a9f97", new Object[]{this, str, aVar, new Boolean(z)});
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return new UltronTradeHybridDialogFragment.b().b("UltronTradeHybridActivity").c("UltronTradeHybridActivity").j(str).i(aVar).h(z).g(false).d(R.id.fragmentContainer).f(displayMetrics.widthPixels).e(displayMetrics.heightPixels).a();
    }

    public final void w3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002b7ef", new Object[]{this, bundle});
            return;
        }
        setContentView(R.layout.ultron_weex2_high_performance_activity_layout);
        View findViewById = findViewById(R.id.hybridRootContainer);
        if (this.e && findViewById != null) {
            findViewById.setBackgroundColor(Color.parseColor("#00000000"));
        }
        if (TradeHybridInstanceFactory.INSTANCE.o(this.f2381a)) {
            q3(bundle);
        } else {
            C3(bundle);
        }
    }

    public boolean y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dfa5d76", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void B3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50558503", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            hav.g("UltronTradeHybridActivity", "switchInnerFragment:", "pageUrl is empty");
        } else {
            try {
                Object m = qbv.j().m(str);
                com.taobao.android.weex_framework.a aVar = m instanceof com.taobao.android.weex_framework.a ? (com.taobao.android.weex_framework.a) m : null;
                boolean x3 = x3(aVar);
                hav.g("UltronTradeHybridActivity", "switchInnerFragment:", "innerFragment is PreRenderReady? " + x3);
                if (!x3) {
                    aVar = com.alibaba.android.ultron.vfw.weex2.a.g().d(this, str, UltronTradeHybridInstanceRenderMode.UNSPECIFIC);
                }
                UltronTradeHybridDialogFragment r3 = r3(str, aVar, x3);
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out, R.anim.push_right_in, R.anim.push_right_out);
                beginTransaction.replace(R.id.fragmentContainer, r3);
                beginTransaction.addToBackStack(null);
                if (!getSupportFragmentManager().isStateSaved()) {
                    beginTransaction.commit();
                } else {
                    beginTransaction.commitAllowingStateLoss();
                }
                this.f = true;
            } catch (Throwable th) {
                hav.g("UltronTradeHybridActivity", "switchInnerFragment:", "onException: " + th);
            }
        }
    }

    public final void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae17755", new Object[]{this, bundle});
        } else if (!TextUtils.isEmpty(this.f2381a)) {
            if (bundle != null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "tidyQueryInDeathRecovery", true)) {
                if (this.f2381a.contains("navAsyncPrerender=true")) {
                    this.f2381a = this.f2381a.replace("navAsyncPrerender=true", "navAsyncPrerender=false");
                }
                if (this.f2381a.contains("navAsyncPrerequest=true")) {
                    this.f2381a = this.f2381a.replace("navAsyncPrerequest=true", "navAsyncPrerequest=false");
                }
            }
            String c = obv.c(this.f2381a);
            if (!TextUtils.isEmpty(c)) {
                this.f2381a = HybridPreRenderHelper.g(this.f2381a, HybridPreRenderHelper.j("", c));
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        a(bundle);
        v3();
        super.onCreate(bundle);
        w3(bundle);
        if (bundle != null) {
            nbv.a(nbv.a.a("tradeHybridContainerRebuild").success(false).sampling(0.001f));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        t3();
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "clearCachePreRequestPool", true)) {
            gcv.a("");
        }
    }

    public final boolean A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c10013", new Object[]{this})).booleanValue();
        }
        if (TradeHybridInstanceFactory.INSTANCE.o(this.f2381a)) {
            return true;
        }
        if (!TextUtils.isEmpty(this.f2381a) && TextUtils.equals(obv.c(this.f2381a), dbv.BIZ_LOGISTICS) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "skipPreRenderByOthers", true)) {
            return !this.f2381a.contains("sourceFrom=order");
        }
        return false;
    }

    public final boolean s3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4055e30", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null || !UltronTradeHybridSwitcherHelper.INSTANCE.o()) {
            return false;
        }
        Object tag = aVar.getTag("tradeHostFragment");
        if (!(tag instanceof UltronWeex2DialogFragment)) {
            return false;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = (UltronWeex2DialogFragment) tag;
        boolean b3 = ultronWeex2DialogFragment.b3();
        boolean W2 = ultronWeex2DialogFragment.W2();
        boolean a3 = ultronWeex2DialogFragment.a3();
        hav.g("UltronTradeHybridActivity", "checkFragmentStatus:", "isRenderReady: " + b3 + ", isBizReady: " + W2 + ", isRenderException: " + a3);
        return b3 && W2 && !a3;
    }

    public final void t3() {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b1e5b3", new Object[]{this});
            return;
        }
        try {
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "releaseWeexInsOnDestroy", true)) {
                UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = this.c;
                if (ultronTradeHybridDialogFragment != null) {
                    if (ultronTradeHybridDialogFragment.S2() != null) {
                        this.c.C2();
                    }
                    this.c = null;
                    z = true;
                } else {
                    z = false;
                }
                com.taobao.android.weex_framework.a aVar = this.b;
                if (aVar != null) {
                    aVar.destroy();
                    this.b = null;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getSupportFragmentManager() == null || getSupportFragmentManager().getFragments() == null || getSupportFragmentManager().getFragments().isEmpty()) {
                    z3 = false;
                } else {
                    z3 = false;
                    for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                        if ((fragment instanceof UltronTradeHybridDialogFragment) && ((UltronTradeHybridDialogFragment) fragment).S2() != null) {
                            ((UltronTradeHybridDialogFragment) fragment).C2();
                            z3 = true;
                        }
                    }
                }
                float d = v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "releaseWeexInsOnDestroySampling", 1.0E-5f);
                nbv.a(nbv.a.a("releaseWeexInsOnDestroy").success(false).message("destroyInstanceOnDestroy! fragmentInvalid: " + z + ", fragmentInsInvalid: " + z3 + ", prerenderInsInvalid: " + z2).sampling(d));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:34:0x0058). Please submit an issue!!! */
    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
        } else if (TextUtils.isEmpty(this.f2381a)) {
            hav.g("UltronTradeHybridActivity", "initStyle:", "mUrl is empty");
        } else {
            Uri parse = Uri.parse(this.f2381a);
            try {
                if (TextUtils.equals(parse.getQueryParameter(CXCommonActivity.NAV_OVERLAY), "true")) {
                    supportRequestWindowFeature(9);
                } else {
                    supportRequestWindowFeature(8);
                }
            } catch (Exception e) {
                hav.g("UltronTradeHybridActivity", "initStyle:", e.toString());
            }
            try {
                if (TextUtils.equals(parse.getQueryParameter(CXCommonActivity.NAV_HIDDEN), "true")) {
                    getSupportActionBar().hide();
                }
            } catch (Exception e2) {
                hav.g("UltronTradeHybridActivity", "initStyle:", e2.toString());
            }
            String queryParameter = parse.getQueryParameter("wx_statusbar_hidden");
            String queryParameter2 = parse.getQueryParameter("_wx_statusbar_hidden");
            if (TextUtils.equals(queryParameter, "true") || TextUtils.equals(queryParameter2, "true")) {
                this.d = true;
            }
            try {
                if (TextUtils.equals(parse.getQueryParameter("pageType"), "pop")) {
                    this.e = true;
                    lbv.b(this, parse);
                    nz0.b(this);
                    getWindow().setBackgroundDrawableResource(R.color.transparent);
                    overridePendingTransition(0, 0);
                }
            } catch (Exception e3) {
                hav.g("UltronTradeHybridActivity", "initStyle:", e3.toString());
            }
        }
    }

    public final boolean x3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ff984a6", new Object[]{this, aVar})).booleanValue();
        }
        ybv a2 = ybv.a(aVar);
        if (a2 != null) {
            boolean e = a2.e();
            boolean c = a2.c();
            boolean d = a2.d();
            hav.g("UltronTradeHybridActivity", "isPreRenderReady:", "isRenderReady: " + e + ", isBizReady: " + c + ", isRenderException: " + d);
            return e && c && !d;
        }
        hav.g("UltronTradeHybridActivity", "isPreRenderReady:", "preRenderStatus is null, " + this.f2381a);
        return s3(aVar);
    }
}
