package com.taobao.search.musie;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.taobao.TBActionBar;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_ability.page.MUSPageFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import tb.a6p;
import tb.acq;
import tb.aod;
import tb.c2v;
import tb.cpc;
import tb.dwh;
import tb.g6p;
import tb.gcj;
import tb.iwh;
import tb.k7m;
import tb.npc;
import tb.o4p;
import tb.pwo;
import tb.rox;
import tb.sox;
import tb.t2o;
import tb.vkq;
import tb.w5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSPageActivity extends CustomBaseActivity implements MUSPageFragment.a, npc, aod, cpc, sox, pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBActionView f11558a;
    public MUSPageFragment b;
    public iwh d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public TextView j;
    public String k;
    public final rox c = new rox();
    public final gcj l = new gcj();

    static {
        t2o.a(815792622);
        t2o.a(980418666);
        t2o.a(982515990);
        t2o.a(993001695);
        t2o.a(993002136);
        t2o.a(993002027);
        t2o.a(993001961);
    }

    public static /* synthetic */ Object ipc$super(MUSPageActivity mUSPageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSPageActivity");
        }
    }

    @Override // tb.aod
    public void D2(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f36968", new Object[]{this, str, map});
        } else {
            TLogTracker.k(str, map);
        }
    }

    @Override // tb.cpc
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e450b5", new Object[]{this, str});
        } else {
            this.l.c(str);
        }
    }

    public final void addMSFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e81e7e", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.f)) {
            MUSPageFragment z2 = MUSPageFragment.z2(this.f, this.e, null, null);
            this.b = z2;
            z2.M2(this);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.fl_render, this.b, "ali_mus_fragment_tag");
            beginTransaction.commit();
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void chooseAppBarMode(android.os.Bundle r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.musie.MUSPageActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "2b854301"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            r0 = 8
            r1 = -3
            boolean r2 = r4.isAppBarOverlay()     // Catch: all -> 0x002f, Exception -> 0x0041
            r4.h = r2     // Catch: all -> 0x002f, Exception -> 0x0041
            boolean r2 = r4.isMainHc()     // Catch: all -> 0x002f, Exception -> 0x0041
            r4.g = r2     // Catch: all -> 0x002f, Exception -> 0x0041
            boolean r3 = r4.h     // Catch: all -> 0x002f, Exception -> 0x0041
            if (r3 != 0) goto L_0x0031
            if (r2 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            r4.supportRequestWindowFeature(r0)     // Catch: all -> 0x002f, Exception -> 0x0041
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            goto L_0x0051
        L_0x0031:
            r2 = 9
            r4.supportRequestWindowFeature(r2)     // Catch: all -> 0x002f, Exception -> 0x0041
        L_0x0036:
            android.view.Window r0 = r4.getWindow()
            r0.setFormat(r1)
            super.onCreate(r5)
            goto L_0x0045
        L_0x0041:
            r4.supportRequestWindowFeature(r0)     // Catch: all -> 0x002f
            goto L_0x0036
        L_0x0045:
            androidx.appcompat.app.ActionBar r5 = r4.getSupportActionBar()
            if (r5 == 0) goto L_0x0050
            java.lang.String r0 = ""
            r5.setTitle(r0)
        L_0x0050:
            return
        L_0x0051:
            android.view.Window r2 = r4.getWindow()
            r2.setFormat(r1)
            super.onCreate(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.MUSPageActivity.chooseAppBarMode(android.os.Bundle):void");
    }

    @Override // tb.sox
    public rox e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rox) ipChange.ipc$dispatch("ea3c9be2", new Object[]{this});
        }
        return this.c;
    }

    public final Pair<Boolean, vkq> hideStatusBar() {
        String queryParameter;
        String queryParameter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("aa8b7b1a", new Object[]{this});
        }
        try {
            Uri parse = Uri.parse(this.e);
            queryParameter = parse.getQueryParameter("_wx_statusbar_hidden");
            queryParameter2 = parse.getQueryParameter(CXCommonActivity.NAV_OVERLAY);
        } catch (Exception e) {
            dwh.h("MUSPageActivity", e);
        }
        if (!TextUtils.equals(queryParameter, "true")) {
            if (TextUtils.equals(queryParameter2, "true")) {
            }
            return new Pair<>(Boolean.FALSE, vkq.Undefine);
        }
        return new Pair<>(Boolean.TRUE, vkq.Undefine);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        return hideStatusBar().first.booleanValue();
    }

    public boolean isMainHc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894c9be9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
        } else {
            this.j = (TextView) findViewById(R.id.progress_bar);
        }
    }

    public final boolean m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85a6628a", new Object[]{this})).booleanValue();
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return false;
        }
        return data.getBooleanQueryParameter("isPreload", false);
    }

    public void n3(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9474d51", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        View findViewById = findViewById(R.id.action_bar);
        View findViewById2 = findViewById(R.id.action_bar_container);
        if (z) {
            i = 17170443;
        } else {
            i = 17170445;
        }
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(getResources().getColor(i));
        }
        if (findViewById != null) {
            findViewById.setBackgroundColor(getResources().getColor(i));
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
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment != null) {
            mUSPageFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        iwh iwhVar;
        iwh iwhVar2 = this.d;
        if (iwhVar2 != null) {
            iwhVar2.e(null, menu);
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (o4p.b() && (iwhVar = this.d) != null && !iwhVar.L() && !isIgnoreFestival() && !this.d.K()) {
            FestivalMgr.i().C(this, TBActionBar.ActionBarStyle.NORMAL);
        }
        try {
            try {
                Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mNeedPublicMenuShow");
                declaredField.setAccessible(true);
                z = ((Boolean) declaredField.get(this)).booleanValue();
            } catch (Exception e) {
                dwh.h("error in get mNeedPublicMenuShow from BaseActivity", e);
                z = true;
            }
            if (z) {
                if (menu == null || menu.findItem(R.id.uik_menu_overflow) == null) {
                    TBPublicMenu publicMenu = getPublicMenu();
                    publicMenu.togglePublicMenu(true);
                    menu = publicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
                }
                int i = R.id.uik_menu_overflow;
                if (menu.findItem(i) == null || menu.findItem(i).getActionView() == null) {
                    this.f11558a = getPublicMenu().getCustomOverflow();
                    getPublicMenu().setCustomOverflow(this.f11558a);
                } else {
                    this.f11558a = (TBActionView) menu.findItem(i).getActionView();
                }
            }
        } catch (Exception e2) {
            dwh.b("MUSPageActivity", "error in find overflow menu button. " + e2.getMessage());
        }
        return onCreateOptionsMenu;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TLogTracker.o();
        try {
            MUSPageFragment mUSPageFragment = this.b;
            if (mUSPageFragment != null) {
                mUSPageFragment.onDestroy();
            }
        } catch (Throwable unused) {
        }
        this.l.b();
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    public void onDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877656dd", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
        } else if (TextUtils.isEmpty(data.toString())) {
            finish();
        } else {
            Nav.from(this).toUri(data.buildUpon().appendQueryParameter("hybrid", "true").build().toString());
            finish();
        }
    }

    @Override // tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (processOnBackPressed() || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.k = c2v.getInstance().getCurrentPageName();
        super.onPause();
    }

    @Override // tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            return;
        }
        ScreenType g = ScreenType.g(this);
        if (g != null) {
            aVar.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(g.c()));
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.j.setVisibility(8);
        this.c.o(System.currentTimeMillis());
        MUSMonitor.a aVar2 = ((MUSDKInstance) aVar).getMonitor().e().get(MUSMonitor.KEY_BG_TIME_ALL);
        if (aVar2 != null) {
            this.c.n((int) aVar2.a());
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("MusPage");
        super.onResume();
        if (this.g) {
            n3(this.i);
        } else if (this.h) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
        if (!TextUtils.isEmpty(this.k)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, this.k);
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
        TLogTracker.p();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.q();
    }

    public final void parseIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcc8036", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data != null) {
            this.e = data.toString();
            ScreenType g = ScreenType.g(this);
            if (g != null) {
                this.e = g6p.b(this.e, k7m.KEY_SCREEN_STYLE, ScreenType.h(g.c()));
            }
            if ("true".equals(data.getQueryParameter("wh_muise"))) {
                this.f = this.e;
            } else {
                String queryParameter = data.getQueryParameter("_mus_tpl");
                this.f = queryParameter;
                TextUtils.isEmpty(queryParameter);
            }
            String path = data.getPath();
            if (path != null) {
                setUTPageName(path);
            }
        }
    }

    public final void prepareStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd901", new Object[]{this});
        } else if (hideStatusBar().first.booleanValue()) {
            View findViewById = findViewById(R.id.fl_root);
            findViewById.setFitsSystemWindows(true);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener(this) { // from class: com.taobao.search.musie.MUSPageActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (WindowInsetsCompat) ipChange2.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                    }
                    return windowInsetsCompat.consumeSystemWindowInsets();
                }
            });
        }
    }

    public boolean processOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8522e9b8", new Object[]{this})).booleanValue();
        }
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment == null || mUSPageFragment.isDetached() || !this.b.onBackPressed()) {
            return false;
        }
        return true;
    }

    @Override // tb.cpc
    public void v0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3334777", new Object[]{this, aVar});
        } else {
            this.l.a(aVar);
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        a v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
            return;
        }
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment != null && (v2 = mUSPageFragment.v2()) != null && !v2.isDestroyed()) {
            v2.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(i));
            v2.refresh(null, null);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ScreenType b = ScreenType.b(this);
        if (b != null) {
            b.i(this);
        }
        TLogTracker.s("MusPage");
        this.c.j(System.currentTimeMillis());
        this.c.h(true ^ SearchSdk.sInited);
        try {
            this.c.g(System.currentTimeMillis());
            SearchSdk.init();
            try {
                TaoInit.init();
            } catch (Throwable unused) {
            }
            this.c.f(System.currentTimeMillis());
            String path = getIntent().getData().getPath();
            if (path != null && path.equals("/dinamicx_scan_dev")) {
                super.onCreate(null);
                try {
                    a6p.b("模版" + getIntent().getData().getQueryParameter("inspect_dev_key") + "进入本地开发模式" + getIntent().getData().getQueryParameter("_mus_tpl"));
                } catch (Exception unused2) {
                }
                finish();
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        TLogTracker.t(o4p.i2());
        parseIntent();
        if (TextUtils.isEmpty(this.f)) {
            super.onCreate(null);
            dwh.p("MUSPageActivity", "没有wh_muise=true 或 _mus_tpl, 降级h5");
            onDowngrade();
            return;
        }
        String f = w5p.c().f(this.f);
        if (!TextUtils.isEmpty(f)) {
            this.f = f;
        }
        chooseAppBarMode(null);
        setContentView(R.layout.activity_mus_page);
        l3();
        prepareStatusBar();
        addMSFragment();
        iwh iwhVar = new iwh(this);
        this.d = iwhVar;
        iwhVar.N(this.f);
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment != null) {
            mUSPageFragment.K2(this.d);
            this.b.N2(this);
        }
        this.c.l(m3());
        this.c.i(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        hashMap.put("webUrl", this.e);
        TLogTracker.m(hashMap);
    }

    public final boolean isAppBarOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7663773f", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            dwh.h("MUSPageActivity", e);
        }
        return TextUtils.equals(Uri.parse(this.e).getQueryParameter(CXCommonActivity.NAV_OVERLAY), Boolean.toString(true));
    }
}
