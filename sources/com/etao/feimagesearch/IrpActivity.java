package com.etao.feimagesearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.guide.PltNewUser;
import com.etao.feimagesearch.newresult.base.IrpV2Controller;
import com.etao.feimagesearch.result.IrpOverlaySlice;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import tb.acq;
import tb.b8m;
import tb.bw1;
import tb.cw1;
import tb.g1a;
import tb.hgw;
import tb.lg4;
import tb.lpc;
import tb.mf0;
import tb.mzu;
import tb.nv8;
import tb.o4p;
import tb.ohi;
import tb.oxb;
import tb.pmf;
import tb.pwo;
import tb.t2o;
import tb.ude;
import tb.uo6;
import tb.vlf;
import tb.wlf;
import tb.xhv;
import tb.yak;
import tb.yko;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IrpActivity extends FEISBaseActivity implements vlf, lpc, oxb, pwo, ude {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wlf b = new wlf();
    public final List<MUSOverlay> c = new ArrayList(5);
    public uo6 d = null;
    public final ohi e = new ohi(true, new a(this));
    public final nv8 f = new b(this);
    public bw1 g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements g1a<String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(IrpActivity irpActivity) {
        }

        /* renamed from: a */
        public xhv invoke(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("32558f08", new Object[]{this, str});
            }
            mzu.i("Page_PhotoSearchResult", "plt_2023_screenshot", "path", str);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends nv8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ISBaseActivity iSBaseActivity) {
            super(iSBaseActivity);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/IrpActivity$2");
        }

        @Override // tb.ta0
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("390fd75", new Object[]{this});
            } else {
                IrpActivity.this.n3();
            }
        }

        @Override // tb.ta0
        public boolean c(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("29ba8789", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
            }
            return IrpActivity.l3(IrpActivity.this, i, keyEvent);
        }
    }

    static {
        t2o.a(730857481);
        t2o.a(481297415);
        t2o.a(986710021);
        t2o.a(993002135);
        t2o.a(993001961);
        t2o.a(993002008);
    }

    public static /* synthetic */ Object ipc$super(IrpActivity irpActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -315360737:
                return new Boolean(super.onKeyUp(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/IrpActivity");
        }
    }

    public static /* synthetic */ boolean l3(IrpActivity irpActivity, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca9bf7e", new Object[]{irpActivity, new Integer(i), keyEvent})).booleanValue();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // tb.lpc
    public void C1(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0a6d10", new Object[]{this, mUSOverlay});
        } else {
            ((ArrayList) this.c).add(mUSOverlay);
        }
    }

    @Override // tb.lpc
    public MUSOverlaySlice C2(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlaySlice) ipChange.ipc$dispatch("e7ed98aa", new Object[]{this, context, mUSView, mUSOverlay, mUSOverlayView});
        }
        return new IrpOverlaySlice(context, mUSView, mUSOverlay, mUSOverlayView);
    }

    @Override // tb.oxb
    public boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        uo6 uo6Var = this.d;
        if (uo6Var == null) {
            return false;
        }
        return uo6Var.l();
    }

    @Override // tb.oxb
    public void P(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb2319b", new Object[]{this, zo6Var});
            return;
        }
        uo6 uo6Var = this.d;
        if (uo6Var != null) {
            uo6Var.r(zo6Var);
        }
    }

    @Override // tb.vlf
    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6bfa225", new Object[]{this});
        }
        return this.g.c();
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            if (((ArrayList) this.c).isEmpty()) {
                finish();
                return true;
            }
            List<MUSOverlay> list = this.c;
            ((MUSOverlay) ((ArrayList) list).get(((ArrayList) list).size() - 1)).fireEvent("close", null);
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.g.a();
        }
    }

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return yak.f31939a;
    }

    @Override // tb.vlf
    public cw1 getPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cw1) ipChange.ipc$dispatch("b6eec51d", new Object[]{this});
        }
        return this.g.d();
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
        uo6 uo6Var = this.d;
        if (uo6Var != null) {
            uo6Var.t(zo6Var);
        }
    }

    public boolean m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f995e6b1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390fd75", new Object[]{this});
        } else {
            super.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            mf0.i(i, i2, intent);
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        pmf.t0();
        TLogTracker.s("IrpResult");
        super.onCreate(bundle);
        b8m.INSTANCE.c();
        if (lg4.A()) {
            TaoInit.loadXSearchSync();
        }
        if (lg4.q0()) {
            this.d = new uo6();
        }
        uo6 uo6Var = this.d;
        if (uo6Var != null) {
            uo6Var.s(0);
            this.d.q(this, true);
            this.d.i(getWindow().getDecorView(), 0);
        }
        ScreenType b2 = ScreenType.b(this);
        IrpV2Controller irpV2Controller = new IrpV2Controller(this.f, IrpV2Controller.x(getIntent()));
        this.g = irpV2Controller;
        irpV2Controller.v(bundle, m3());
        PltNewUser.markPltUsed(this);
        if (b2 != null) {
            b2.i(this);
        }
        pmf.s0();
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g.f();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return this.g.g(i, keyEvent);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        pmf.J0(true);
        this.g.h();
        this.e.g(this);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f2f21", new Object[]{this, new Boolean(z)});
        } else {
            super.onPointerCaptureChanged(z);
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("IrpResult");
        super.onResume();
        this.g.i();
        this.e.f(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.g.j(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.g.l();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.g.m();
    }

    @Override // tb.vlf
    public wlf p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wlf) ipChange.ipc$dispatch("207a8c5c", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.lpc
    public void s2(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2468ce1d", new Object[]{this, mUSOverlay});
        } else {
            ((ArrayList) this.c).remove(mUSOverlay);
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            this.g.k(Integer.valueOf(i));
        }
    }
}
