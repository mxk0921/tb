package com.taobao.search.searchdoor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.voiceassistant.context.AssistantContext;
import com.taobao.android.voiceassistant.helper.Objects;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.SearchBaseActivity;
import com.taobao.search.searchdoor.ai.AISearchConfigManager;
import com.taobao.search.searchdoor.ai.NewSearchDoorActivity;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.acq;
import tb.cpc;
import tb.cvr;
import tb.f2c;
import tb.g92;
import tb.gcj;
import tb.hgw;
import tb.hvr;
import tb.ljw;
import tb.mec;
import tb.o4p;
import tb.oic;
import tb.oxb;
import tb.pq;
import tb.pwo;
import tb.r4p;
import tb.t2o;
import tb.tok;
import tb.ua8;
import tb.ude;
import tb.und;
import tb.uo6;
import tb.wyd;
import tb.xnd;
import tb.xrl;
import tb.y1p;
import tb.y91;
import tb.yko;
import tb.zk9;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchDoorActivity extends SearchBaseActivity implements mec, ude, pq, f2c, oic, oxb, cpc, wyd, xnd, pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIFE_CYCLE_DESTROY = 3;
    public static final int LIFE_CYCLE_PAUSE = 2;
    public static final int LIFE_CYCLE_RESUME = 1;
    public static final String PAGE_NAME = "Page_SearchDoor";
    public und b;
    public boolean d;
    public gcj e;
    public int f;
    public ljw h;
    public View j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11609a = false;
    public final uo6 c = new uo6();
    public final boolean g = o4p.Y1();
    public boolean i = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y1p f11610a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.searchdoor.SearchDoorActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class View$OnTouchListenerC0654a implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public View$OnTouchListenerC0654a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 2) {
                    SearchDoorActivity.this.b.B();
                }
                return false;
            }
        }

        public a(y1p y1pVar) {
            this.f11610a = y1pVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            SearchDoorActivity.o3(SearchDoorActivity.this, Objects.findNestedRecyclerView(this.f11610a.f31790a));
            if (SearchDoorActivity.n3(SearchDoorActivity.this) != null) {
                ViewProxy.setOnTouchListener(SearchDoorActivity.n3(SearchDoorActivity.this), new View$OnTouchListenerC0654a());
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements g92.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.g92.d
        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1ec4f6b9", new Object[]{this});
            }
            return SearchDoorActivity.n3(SearchDoorActivity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements g92.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.g92.c
        public void a(ljw ljwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2b4c41", new Object[]{this, ljwVar});
                return;
            }
            SearchDoorActivity.p3(SearchDoorActivity.this, ljwVar);
            SearchDoorActivity.q3(SearchDoorActivity.this);
        }

        @Override // tb.g92.c
        public void onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
            }
        }

        @Override // tb.g92.c
        public void onHide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            }
        }

        @Override // tb.g92.c
        public void onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(815792940);
        t2o.a(993001952);
        t2o.a(993002008);
        t2o.a(976224261);
        t2o.a(815793346);
        t2o.a(993001695);
        t2o.a(815793100);
        t2o.a(993002135);
        t2o.a(993002136);
        t2o.a(815793537);
        t2o.a(815793087);
        t2o.a(993001961);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorActivity searchDoorActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1449595885:
                super.m3();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
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
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1553572081:
                return super.getSystemService((String) objArr[0]);
            case 1565049171:
                super.l3();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorActivity");
        }
    }

    public static /* synthetic */ View n3(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f99b882", new Object[]{searchDoorActivity});
        }
        return searchDoorActivity.j;
    }

    public static /* synthetic */ View o3(SearchDoorActivity searchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3f5f09d6", new Object[]{searchDoorActivity, view});
        }
        searchDoorActivity.j = view;
        return view;
    }

    public static /* synthetic */ ljw p3(SearchDoorActivity searchDoorActivity, ljw ljwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ljw) ipChange.ipc$dispatch("7c1b6c99", new Object[]{searchDoorActivity, ljwVar});
        }
        searchDoorActivity.h = ljwVar;
        return ljwVar;
    }

    public static /* synthetic */ void q3(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b55fe", new Object[]{searchDoorActivity});
        } else {
            searchDoorActivity.A3();
        }
    }

    public static String w3(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e7dc278", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("channelSrp");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter(xrl.G_CHANNELSRP);
        }
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = intent.getStringExtra("channelSrp");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return intent.getStringExtra(xrl.G_CHANNELSRP);
        }
        return queryParameter;
    }

    public static boolean y3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6e9d770", new Object[]{intent})).booleanValue();
        }
        return !TextUtils.isEmpty(w3(intent));
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d769d7", new Object[]{this});
            return;
        }
        ljw ljwVar = this.h;
        if (ljwVar == null || !this.g) {
            return;
        }
        if (this.i) {
            ljwVar.show();
        } else {
            ljwVar.hide();
        }
    }

    @Override // tb.f2c
    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3557b48", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ab09a5", new Object[]{this});
            return;
        }
        finish();
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }

    public void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c849ae", new Object[]{this});
        } else {
            super.m3();
        }
    }

    @Override // tb.cpc
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e450b5", new Object[]{this, str});
        } else {
            this.e.c(str);
        }
    }

    @Override // tb.oxb
    public boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        return this.c.l();
    }

    @Override // tb.f2c
    public boolean J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7b7a4f8", new Object[]{this})).booleanValue();
        }
        try {
            return AssistantContext.get().isAssistantEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // tb.oxb
    public void P(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb2319b", new Object[]{this, zo6Var});
        } else {
            this.c.r(zo6Var);
        }
    }

    @Override // tb.wyd
    public String S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa79083", new Object[]{this});
        }
        return this.b.C();
    }

    @Override // tb.pq
    public y91 U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y91) ipChange.ipc$dispatch("cabd2823", new Object[]{this});
        }
        return new y91.b().b(this.g).c(this.g).f(false).d(81).e(15).a();
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

    @Override // tb.xnd
    public SearchDoorViewPool d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorViewPool) ipChange.ipc$dispatch("567c0283", new Object[]{this});
        }
        return this.b.d();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.b.finish();
    }

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return this.b.getCore();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, "connectivity") || !o4p.M0()) {
            return super.getSystemService(str);
        }
        return getApplicationContext().getSystemService(str);
    }

    @Override // tb.oic
    public boolean i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe267c2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.oxb
    public void j0(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312b88b4", new Object[]{this, zo6Var});
        } else {
            this.c.t(zo6Var);
        }
    }

    @Override // tb.xnd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb438c9", new Object[]{this});
        } else {
            this.b.k();
        }
    }

    @Override // tb.wyd
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94810df4", new Object[]{this})).booleanValue();
        }
        return this.b.l();
    }

    @Override // com.taobao.search.common.SearchBaseActivity
    public void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d48c153", new Object[]{this});
            return;
        }
        super.l3();
        o4p.l("search_onesearch_nx", r4p.KEY_CATMAP, "");
        o4p.H2();
    }

    @Override // com.taobao.search.common.SearchBaseActivity
    public void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a998ec13", new Object[]{this});
        } else {
            this.b.x();
        }
    }

    @Override // tb.xnd
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("370526eb", new Object[]{this})).booleanValue();
        }
        return this.b.n();
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mec
    public boolean o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1b241c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.b.onActivityResult(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        if (o4p.D0() && (i = configuration.uiMode) != 0) {
            if ((i & 48) != 32) {
                z = false;
            }
            if (z != this.d) {
                B3();
            }
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.f11609a = s3();
        this.b = u3();
        if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
            ScreenType.b(this);
        }
        this.c.q(this, true);
        this.d = this.c.l();
        if (E1()) {
            hgw.a(getWindow().getDecorView());
        }
        this.b.z(bundle);
        super.onCreate(bundle);
        this.b.A();
        this.e = new gcj();
        this.i = t3();
        if (bundle == null) {
            hvr.INSTANCE.a(getIntent(), hvr.SOURCE_HOME_TO_SEARCH_DOOR);
        }
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f = 3;
        this.b.destroy();
    }

    public void onEventMainThread(y1p y1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27815f99", new Object[]{this, y1pVar});
        } else {
            zk9.b("com.taobao.android.voiceassistant.helper.Objects", new a(y1pVar));
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        this.b.onNewIntent(intent);
        this.i = t3();
        A3();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f = 2;
        this.b.pause();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.f = 1;
        TLogTracker.s("MainSearchDoor");
        super.onResume();
        this.b.resume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.b.start();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.b.stop();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        this.b.onWindowFocusChanged(z);
    }

    @Override // tb.pq
    public g92 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g92) ipChange.ipc$dispatch("eff749cf", new Object[]{this});
        }
        return new g92.b().b(new c()).c(new b()).a();
    }

    public void r3(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f3c6b9", new Object[]{this, view, new Integer(i)});
        } else {
            this.c.i(view, i);
        }
    }

    public boolean s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d5af992", new Object[]{this})).booleanValue();
        }
        if (!AISearchConfigManager.INSTANCE.d() || !TextUtils.isEmpty(w3(getIntent())) || !Localization.n()) {
            return false;
        }
        cvr cvrVar = cvr.INSTANCE;
        if (cvrVar.f() || cvrVar.h()) {
            return false;
        }
        return true;
    }

    public final boolean t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca286d7e", new Object[]{this})).booleanValue();
        }
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getQueryParameter(xrl.G_CHANNELSRP);
                if (TextUtils.isEmpty(str)) {
                    str = data.getQueryParameter("channelSrp");
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(xrl.G_CHANNELSRP);
            }
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra("channelSrp");
            }
        }
        return ua8.INSTANCE.a(str);
    }

    public und u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (und) ipChange.ipc$dispatch("f998f7aa", new Object[]{this});
        }
        if (this.f11609a) {
            return new NewSearchDoorActivity(this);
        }
        return new tok(this);
    }

    @Override // tb.cpc
    public void v0(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3334777", new Object[]{this, aVar});
        } else {
            this.e.a(aVar);
        }
    }

    public boolean v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("695dabf9", new Object[]{this})).booleanValue();
        }
        return this.b.y();
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            this.b.w(i);
        }
    }

    public int x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52ec830e", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public boolean z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8df0af3", new Object[]{this})).booleanValue();
        }
        return this.f11609a;
    }
}
