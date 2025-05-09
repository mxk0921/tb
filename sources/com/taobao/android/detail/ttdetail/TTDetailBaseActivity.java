package com.taobao.android.detail.ttdetail;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.inside.TTDInsideController;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acq;
import tb.b5m;
import tb.bw3;
import tb.cg2;
import tb.ens;
import tb.ew3;
import tb.ez9;
import tb.gx9;
import tb.hr0;
import tb.jwj;
import tb.mng;
import tb.mpe;
import tb.nos;
import tb.nsk;
import tb.ntc;
import tb.pq4;
import tb.q84;
import tb.sbf;
import tb.t2o;
import tb.tgh;
import tb.xns;
import tb.ygw;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailBaseActivity extends AppCompatActivity implements ntc<nsk>, ITBPublicMenu, jwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String r = "TTDetailBaseActivity";

    /* renamed from: a  reason: collision with root package name */
    public TBPublicMenu f6618a;
    public boolean b;
    public TTDetailPageManager c;
    public String d;
    public Map<String, String> e;
    public ens f;
    public mng g;
    public FrameLayout h;
    public FragmentManager i;
    public android.app.FragmentManager j;
    public long o;
    public long p;
    public final FragmentManager.OnBackStackChangedListener k = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailBaseActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeCancelled() {
            gx9.a(this);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            gx9.b(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
            gx9.c(this, backEventCompat);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
            gx9.d(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
            } else if (TTDetailBaseActivity.l3(TTDetailBaseActivity.this).getBackStackEntryCount() == 0) {
                TTDetailBaseActivity.m3(TTDetailBaseActivity.this).v0();
            }
        }
    };
    public final FragmentManager.OnBackStackChangedListener l = new a();
    public final ntc<bw3> m = new b();
    public final ntc<ew3> n = new c();
    public final long q = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements FragmentManager.OnBackStackChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
            } else if (TTDetailBaseActivity.n3(TTDetailBaseActivity.this).getBackStackEntryCount() == 0) {
                TTDetailBaseActivity.m3(TTDetailBaseActivity.this).v0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ntc<bw3> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ntc
        public ThreadMode W2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
            }
            return ThreadMode.MainThread;
        }

        /* renamed from: a */
        public boolean y1(bw3 bw3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ea0293f", new Object[]{this, bw3Var})).booleanValue();
            }
            TTDetailBaseActivity.m3(TTDetailBaseActivity.this).v0();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ntc<ew3> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ntc
        public ThreadMode W2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
            }
            return ThreadMode.MainThread;
        }

        /* renamed from: a */
        public boolean y1(ew3 ew3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("390ff4a7", new Object[]{this, ew3Var})).booleanValue();
            }
            TTDetailBaseActivity.m3(TTDetailBaseActivity.this).v0();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements TTDInsideController.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a4cb911", new Object[]{this});
            } else {
                TTDetailBaseActivity.o3(TTDetailBaseActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem.getId() == R.id.uik_menu_home) {
                TTDetailBaseActivity.this.finish();
            }
        }
    }

    static {
        t2o.a(912261140);
        t2o.a(912261362);
        t2o.a(927989771);
        t2o.a(912261761);
    }

    public static /* synthetic */ Object ipc$super(TTDetailBaseActivity tTDetailBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 143326307:
                super.onBackPressed();
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
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTDetailBaseActivity");
        }
    }

    public static /* synthetic */ androidx.fragment.app.FragmentManager l3(TTDetailBaseActivity tTDetailBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (androidx.fragment.app.FragmentManager) ipChange.ipc$dispatch("56f8c21", new Object[]{tTDetailBaseActivity});
        }
        return tTDetailBaseActivity.i;
    }

    public static /* synthetic */ TTDetailPageManager m3(TTDetailBaseActivity tTDetailBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailPageManager) ipChange.ipc$dispatch("d21c3e46", new Object[]{tTDetailBaseActivity});
        }
        return tTDetailBaseActivity.c;
    }

    public static /* synthetic */ android.app.FragmentManager n3(TTDetailBaseActivity tTDetailBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.app.FragmentManager) ipChange.ipc$dispatch("6887fec6", new Object[]{tTDetailBaseActivity});
        }
        return tTDetailBaseActivity.j;
    }

    public static /* synthetic */ void o3(TTDetailBaseActivity tTDetailBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca506723", new Object[]{tTDetailBaseActivity});
        } else {
            tTDetailBaseActivity.u3();
        }
    }

    public void A3(ens ensVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f1fea8", new Object[]{this, ensVar});
            return;
        }
        this.f = ensVar;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager != null) {
            tTDetailPageManager.b1(ensVar);
        }
    }

    public void B3(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a22443", new Object[]{this, map});
            return;
        }
        this.e = map;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager != null) {
            tTDetailPageManager.c1(map);
        }
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b97b2d9", new Object[]{this});
            return;
        }
        View i0 = this.c.i0();
        if (!ygw.b(this.h, i0)) {
            this.h.addView(i0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // tb.jwj
    public final ze7 Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("c4f6dd52", new Object[]{this});
        }
        return this.c.e0();
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
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

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.b = true;
        boolean Z = this.c.Z();
        this.b = false;
        if (!Z) {
            v3();
        }
    }

    @Override // tb.jwj
    public final boolean g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4f98094", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        if (this.f6618a == null) {
            TBPublicMenu tBPublicMenu = new TBPublicMenu(this);
            this.f6618a = tBPublicMenu;
            try {
                tBPublicMenu.setDefaultPublicMenuClickListener(new e());
            } catch (Throwable unused) {
            }
        }
        return this.f6618a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.c.u0(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!this.c.x0()) {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0 || getFragmentManager().getBackStackEntryCount() > 0 || isFinishing()) {
                super.onBackPressed();
            } else {
                p3();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        pq4.b(this);
        q84.f(this, new ez9());
        xns.d(this);
        super.onDestroy();
        q84.m(this, this);
        q84.m(this, this.m);
        q84.m(this, this.n);
        this.c.z0();
        mpe.f(this);
        cg2.k(this.c.e0().i().b());
        t3();
        this.i.removeOnBackStackChangedListener(this.k);
        this.j.removeOnBackStackChangedListener(this.l);
        String str = r;
        tgh.b(str, "TTDetailBaseActivity onDestroy() Context: " + hashCode());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.c.A0(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.c.B0(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.c.D0();
        TBPublicMenu tBPublicMenu = this.f6618a;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        try {
            b5m.A().commitLeave("Page_Detail", this.c.f0(), this, new String[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        this.o = System.currentTimeMillis();
        super.onRestart();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onRestart(): " + (this.p - this.o));
        this.o = this.p;
        this.c.E0();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onRestart(): " + (this.p - this.o));
        this.o = this.p;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.o = System.currentTimeMillis();
        super.onResume();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onResume(): " + (this.p - this.o));
        this.o = this.p;
        this.c.F0();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onResume(): " + (this.p - this.o));
        this.o = this.p;
        TBPublicMenu tBPublicMenu = this.f6618a;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        xns.c(this);
        try {
            b5m.A().commitEnter("Page_Detail", this.c.f0(), this, UtUtils.i(hr0.c().getPageAllProperties(this)));
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.o = System.currentTimeMillis();
        super.onStart();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onStart(): " + (this.p - this.o));
        this.o = this.p;
        this.c.G0();
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onStart(): " + (this.p - this.o));
        this.o = this.p;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.c.H0();
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472d8ea1", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString(getString(R.string.tt_detail_zzb_key_page), "Page_Detail");
        String f0 = this.c.f0();
        if (!TextUtils.isEmpty(f0)) {
            bundle2.putString(getString(R.string.tt_detail_zzb_key_id), f0);
        }
        Map<String, String> j0 = this.c.j0();
        if (j0 != null && !j0.isEmpty()) {
            Bundle bundle3 = new Bundle();
            for (Map.Entry<String, String> entry : j0.entrySet()) {
                bundle3.putString(entry.getKey(), entry.getValue());
            }
            bundle2.putBundle(getString(R.string.tt_detail_zzb_key_extparams), bundle3);
        }
        bundle.putBundle(getString(R.string.tt_detail_zzb_key_bundle), bundle2);
        return bundle;
    }

    public final ze7 q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.c.e0();
    }

    public TTDetailPageManager r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailPageManager) ipChange.ipc$dispatch("3db3ecfc", new Object[]{this});
        }
        return this.c;
    }

    public final void s3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c2419c", new Object[]{this, new Boolean(z)});
            return;
        }
        TTDetailPageManager tTDetailPageManager = new TTDetailPageManager(this, getIntent());
        this.c = tTDetailPageManager;
        tTDetailPageManager.T0(this.d);
        this.c.c1(this.e);
        this.c.b1(this.f);
        this.c.Z0(this.g);
        this.c.d1();
        this.c.a1(this);
        this.c.y0(z);
        this.c.Y0(new d());
        C3();
        this.i = getSupportFragmentManager();
        this.j = getFragmentManager();
        this.i.addOnBackStackChangedListener(this.k);
        this.j.addOnBackStackChangedListener(this.l);
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f103e6", new Object[]{this});
            return;
        }
        String f0 = this.c.f0();
        if (!TextUtils.isEmpty(f0)) {
            Intent intent = new Intent();
            intent.setAction("TBWillLeaveDetailNotification");
            intent.putExtra("itemId", f0);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562f6e75", new Object[]{this});
            return;
        }
        if (!this.b) {
            this.c.Z();
        }
        v3();
    }

    public final void v3() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a2d7d8", new Object[]{this});
            return;
        }
        tgh.a("TTDetailBaseActivity.realFinish");
        xns.d(this);
        super.finish();
        Boolean bool = Boolean.TRUE;
        Map<String, Boolean> map = DevFeature.mFeature;
        if (bool.equals(map.get(DevFeature.sBottomInBottomOut))) {
            i = R.anim.tt_detail_activity_inside_close_enter;
        } else {
            i = R.anim.tt_detail_activity_close_enter;
        }
        if (bool.equals(map.get(DevFeature.sBottomInBottomOut))) {
            i2 = R.anim.tt_detail_activity_inside_close_exit;
        } else {
            i2 = R.anim.tt_detail_activity_close_exit;
        }
        overridePendingTransition(i, i2);
    }

    /* renamed from: w3 */
    public boolean y1(nsk nskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78ded992", new Object[]{this, nskVar})).booleanValue();
        }
        onBackPressed();
        return true;
    }

    public void x3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9d14c", new Object[]{this, str});
            return;
        }
        this.d = str;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager != null) {
            tTDetailPageManager.T0(str);
        }
    }

    public final String y3(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bb970c", new Object[]{this, map, mtopResponse, new Integer(i)});
        }
        return this.c.U0(map, mtopResponse, i);
    }

    public final void z3(mng mngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2880432", new Object[]{this, mngVar});
            return;
        }
        this.g = mngVar;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager != null) {
            tTDetailPageManager.Z0(mngVar);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.o = System.currentTimeMillis();
        sbf.d(this);
        boolean f = sbf.f(this);
        if (f) {
            sbf.a(this, true);
            getWindow().addFlags(2);
            getWindow().setDimAmount(0.5f);
        }
        super.onCreate(bundle);
        Boolean bool = Boolean.TRUE;
        Map<String, Boolean> map = DevFeature.mFeature;
        if (bool.equals(map.get(DevFeature.sBottomInBottomOut))) {
            i = R.anim.tt_detail_activity_inside_open_enter;
        } else {
            i = R.anim.tt_detail_activity_open_enter;
        }
        if (bool.equals(map.get(DevFeature.sBottomInBottomOut))) {
            i2 = R.anim.tt_detail_activity_inside_open_exit;
        } else {
            i2 = R.anim.tt_detail_activity_open_exit;
        }
        overridePendingTransition(i, i2);
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onCreate(): " + (this.p - this.o));
        this.o = this.p;
        mpe.k(this);
        setContentView(R.layout.activity_new_ttdetail);
        if (f) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.tt_detail_inside_root_stub);
            if (viewStub != null) {
                this.h = (FrameLayout) viewStub.inflate().findViewById(R.id.fl_tt_detail_inside_container);
            } else {
                this.h = (FrameLayout) findViewById(R.id.fl_tt_detail_inside_container);
            }
        } else {
            this.h = (FrameLayout) findViewById(R.id.fl_tt_detail_container);
        }
        s3(f);
        nos.b(this, getWindow(), true ^ f);
        nos.c(getWindow(), -1);
        q84.i(this, nsk.class, this);
        q84.i(this, bw3.class, this.m);
        q84.i(this, ew3.class, this.n);
        PerformanceUtils.o(this, "initPage", this.q);
        this.p = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onCreate(): " + (this.p - this.o));
        this.o = this.p;
    }
}
