package com.etao.feimagesearch;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.base.IrpV2Controller;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a8m;
import tb.acq;
import tb.ckf;
import tb.hgw;
import tb.imf;
import tb.o4p;
import tb.oxb;
import tb.qrl;
import tb.t2o;
import tb.uo6;
import tb.v7m;
import tb.wxi;
import tb.xfw;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImmerseIrpActivity extends FEISBaseActivity implements oxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public imf b;
    public int c = 1;
    public IrpManager d;
    public v7m e;
    public uo6 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            ImmerseIrpActivity.this.setContentView(view);
            return null;
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return null;
        }
    }

    static {
        t2o.a(730857478);
        t2o.a(993002135);
    }

    public static /* synthetic */ Object ipc$super(ImmerseIrpActivity immerseIrpActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ImmerseIrpActivity");
        }
    }

    public static final /* synthetic */ v7m l3(ImmerseIrpActivity immerseIrpActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v7m) ipChange.ipc$dispatch("a645d982", new Object[]{immerseIrpActivity});
        }
        return immerseIrpActivity.e;
    }

    public static final /* synthetic */ int m3(ImmerseIrpActivity immerseIrpActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82c8e647", new Object[]{immerseIrpActivity})).intValue();
        }
        return immerseIrpActivity.c;
    }

    public static final /* synthetic */ void n3(ImmerseIrpActivity immerseIrpActivity, imf imfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2943b25b", new Object[]{immerseIrpActivity, imfVar});
        } else {
            immerseIrpActivity.b = imfVar;
        }
    }

    @Override // tb.oxb
    public boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        uo6 uo6Var = this.f;
        if (uo6Var != null) {
            return uo6Var.l();
        }
        ckf.y("darkModeHelper");
        throw null;
    }

    @Override // tb.oxb
    public void P(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb2319b", new Object[]{this, zo6Var});
            return;
        }
        uo6 uo6Var = this.f;
        if (uo6Var != null) {
            uo6Var.r(zo6Var);
        } else {
            ckf.y("darkModeHelper");
            throw null;
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

    @Override // tb.oxb
    public void closeViewDarkMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dae15", new Object[]{this, view});
        } else if (view != null && o4p.v0()) {
            hgw.a(view);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.oxb
    public void j0(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312b88b4", new Object[]{this, zo6Var});
            return;
        }
        uo6 uo6Var = this.f;
        if (uo6Var != null) {
            uo6Var.t(zo6Var);
        } else {
            ckf.y("darkModeHelper");
            throw null;
        }
    }

    public final void o3(Bundle bundle, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49206cec", new Object[]{this, bundle, map});
            return;
        }
        long g = qrl.g(map.get("sessionId"), -1L);
        v7m q = a8m.q(Long.valueOf(g));
        if (q == null) {
            finish();
            return;
        }
        this.e = q;
        IrpDatasource p = a8m.p(Long.valueOf(g));
        ckf.d(p);
        this.d = new IrpManager(p);
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        o3(bundle, IrpV2Controller.Companion.a(getIntent()));
        p3();
        uo6 uo6Var = new uo6();
        uo6Var.s(0);
        uo6Var.q(this, true);
        uo6Var.i(getWindow().getDecorView(), 0);
        this.f = uo6Var;
        q3();
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c = 5;
        TLogTracker.o();
        imf imfVar = this.b;
        if (imfVar != null) {
            imfVar.K();
        }
        imf imfVar2 = this.b;
        if (imfVar2 != null) {
            imfVar2.D();
        }
        this.c = 5;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.c = 3;
        TLogTracker.q();
        imf imfVar = this.b;
        if (imfVar != null) {
            imfVar.L();
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.c = 2;
        TLogTracker.p();
        imf imfVar = this.b;
        if (imfVar != null) {
            imfVar.M();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        imf imfVar = this.b;
        if (imfVar != null) {
            imfVar.N();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.c = 4;
        imf imfVar = this.b;
        if (imfVar != null) {
            imfVar.O();
        }
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b055c7d", new Object[]{this});
            return;
        }
        IrpManager irpManager = this.d;
        if (irpManager != null) {
            new imf(this, null, irpManager, new a(), new ImmerseIrpActivity$initRootWidget$2(this));
        } else {
            ckf.y("irpManager");
            throw null;
        }
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5d4c3a", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("spm-cnt", "a2141.2648391");
        IrpManager irpManager = this.d;
        if (irpManager != null) {
            String y = irpManager.b().y();
            if (y == null) {
                y = "";
            }
            linkedHashMap.put("pssource", y);
            IrpManager irpManager2 = this.d;
            if (irpManager2 != null) {
                String value = irpManager2.b().B().getValue();
                ckf.f(value, "irpManager.datasource.photoFrom.value");
                linkedHashMap.put(wxi.KEY_PHOTO_FROM, value);
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, linkedHashMap);
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_PhotoSearchElim_WAI");
                return;
            }
            ckf.y("irpManager");
            throw null;
        }
        ckf.y("irpManager");
        throw null;
    }
}
