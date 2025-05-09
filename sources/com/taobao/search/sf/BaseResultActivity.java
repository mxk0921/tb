package com.taobao.search.sf;

import android.animation.AnimatorListenerAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.performance.perf.SFPreloadImpl;
import com.taobao.search.refactor.MSController;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.search.sf.util.MultiValueParamArrayMap;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.bridge.JSCallback;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.acx;
import tb.aod;
import tb.aoo;
import tb.ayf;
import tb.b64;
import tb.bcq;
import tb.bol;
import tb.bqg;
import tb.bsh;
import tb.c4p;
import tb.cbk;
import tb.cpc;
import tb.cpt;
import tb.cql;
import tb.cvr;
import tb.eca;
import tb.f1p;
import tb.f64;
import tb.f6p;
import tb.fml;
import tb.g1i;
import tb.g54;
import tb.gcj;
import tb.grh;
import tb.gu6;
import tb.h02;
import tb.h19;
import tb.h1p;
import tb.h6p;
import tb.hgw;
import tb.hj8;
import tb.i3p;
import tb.j3p;
import tb.jjx;
import tb.jrh;
import tb.juc;
import tb.jyf;
import tb.k08;
import tb.k1p;
import tb.kae;
import tb.kld;
import tb.l3p;
import tb.l5b;
import tb.l7x;
import tb.lml;
import tb.m8j;
import tb.mdd;
import tb.mec;
import tb.n1p;
import tb.n4m;
import tb.o4m;
import tb.o4p;
import tb.oad;
import tb.oen;
import tb.oxb;
import tb.p4m;
import tb.pec;
import tb.qeq;
import tb.r4p;
import tb.rim;
import tb.rnd;
import tb.sen;
import tb.snl;
import tb.srl;
import tb.t2o;
import tb.tnl;
import tb.ude;
import tb.uin;
import tb.uo6;
import tb.uz;
import tb.v5p;
import tb.vfw;
import tb.vjx;
import tb.vxm;
import tb.vyd;
import tb.whj;
import tb.wll;
import tb.wr3;
import tb.wyd;
import tb.x2;
import tb.xfn;
import tb.xop;
import tb.xpo;
import tb.y2p;
import tb.y4p;
import tb.yak;
import tb.yj4;
import tb.yko;
import tb.yno;
import tb.z1x;
import tb.z8t;
import tb.zak;
import tb.zo6;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseResultActivity extends CustomBaseActivity implements ude, mec, rnd, cbk.a, pec, vyd, aod, oad, cpc, oxb, n4m, wyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup A;
    public int B;
    public kld E;
    public x2 G;
    public boolean H;
    public whj K;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11678a;
    public boolean b;
    public boolean c;
    public bsh d;
    public CommonSearchContext e;
    public CommonBaseDatasource f;
    public tnl<? extends CommonBaseDatasource> g;
    public String h;
    public Map<String, String> i;
    public Map<String, String> j;
    public boolean l;
    public boolean n;
    public long o;
    public Toolbar p;
    public String u;
    public rim v;
    public Handler z;
    public ArrayList<SearchBarTagBean> k = new ArrayList<>();
    public boolean m = false;
    public volatile boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public final uo6 w = new uo6();
    public final p4m x = new p4m(this);
    public boolean y = false;
    public boolean C = false;
    public boolean D = false;
    public boolean F = false;
    public boolean I = false;
    public String J = "";
    public final gcj L = new gcj();
    public Boolean M = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Toolbar f11679a;

        public a(Toolbar toolbar) {
            this.f11679a = toolbar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (BaseResultActivity.l3(BaseResultActivity.this)) {
                BaseResultActivity baseResultActivity = BaseResultActivity.this;
                if (baseResultActivity.z != null) {
                    Window.Callback callback = baseResultActivity.getWindow().getCallback();
                    BaseResultActivity.m3(BaseResultActivity.this, this.f11679a);
                    BaseResultActivity.this.getWindow().setCallback(callback);
                    return;
                }
            }
            BaseResultActivity.n3(BaseResultActivity.this, this.f11679a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bundle c;

        public b(Bundle bundle) {
            this.c = bundle;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/BaseResultActivity$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                BaseResultActivity.o3(BaseResultActivity.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/BaseResultActivity$3");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                BaseResultActivity.p3(BaseResultActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f11680a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d dVar = d.this;
                BaseResultActivity.r3(BaseResultActivity.this, dVar.f11680a);
            }
        }

        public d(Intent intent) {
            this.f11680a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseResultActivity.this.runOnUiThread(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11682a;

        public e(ViewGroup viewGroup) {
            this.f11682a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ViewGroup viewGroup = this.f11682a;
            if (viewGroup == null) {
                ViewGroup viewGroup2 = (ViewGroup) BaseResultActivity.this.findViewById(R.id.fl_root_view);
                if (viewGroup2 != null) {
                    viewGroup2.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
                } else if (BaseResultActivity.s3(BaseResultActivity.this) != null) {
                    BaseResultActivity.s3(BaseResultActivity.this).addView(view, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    BaseResultActivity.this.setContentView(view);
                }
            } else {
                viewGroup.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ bsh c;
        public final /* synthetic */ jrh d;

        public f(bsh bshVar, jrh jrhVar) {
            this.c = bshVar;
            this.d = jrhVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/BaseResultActivity$7");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.x2(this.d.L0());
            if (o4p.C1("preloadInitPage2") && !BaseResultActivity.this.r) {
                this.c.N2();
            }
            BaseResultActivity baseResultActivity = BaseResultActivity.this;
            bsh bshVar = this.c;
            baseResultActivity.d = bshVar;
            bshVar.attachToContainer();
            ((juc) BaseResultActivity.this.d.t2()).commit();
            BaseResultActivity.this.s4();
        }
    }

    static {
        t2o.a(815793329);
        t2o.a(993002008);
        t2o.a(993001952);
        t2o.a(815793765);
        t2o.a(815792274);
        t2o.a(815793372);
        t2o.a(815793347);
        t2o.a(815793536);
        t2o.a(993001695);
        t2o.a(815793422);
        t2o.a(993002136);
        t2o.a(993002135);
        t2o.a(815792422);
        t2o.a(815793537);
    }

    public static /* synthetic */ Object ipc$super(BaseResultActivity baseResultActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1954109976:
                return new Boolean(super.isInMultiWindowMode());
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
            case -373608451:
                return super.getSupportActionBar();
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 523352648:
                super.setSupportActionBar((Toolbar) objArr[0]);
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
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 1918621354:
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue(), (Configuration) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/BaseResultActivity");
        }
    }

    public static boolean k4(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a16a96", new Object[]{context})).booleanValue();
        }
        if (context instanceof BaseResultActivity) {
            return ((BaseResultActivity) context).j4();
        }
        return false;
    }

    public static /* synthetic */ boolean l3(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb884ba9", new Object[]{baseResultActivity})).booleanValue();
        }
        return baseResultActivity.D;
    }

    public static /* synthetic */ void m3(BaseResultActivity baseResultActivity, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0f239c", new Object[]{baseResultActivity, toolbar});
        } else {
            super.setSupportActionBar(toolbar);
        }
    }

    public static /* synthetic */ void n3(BaseResultActivity baseResultActivity, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318afd5d", new Object[]{baseResultActivity, toolbar});
        } else {
            super.setSupportActionBar(toolbar);
        }
    }

    public static /* synthetic */ void o3(BaseResultActivity baseResultActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effcd852", new Object[]{baseResultActivity, bundle});
        } else {
            baseResultActivity.E3(bundle);
        }
    }

    public static /* synthetic */ void p3(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b2d321", new Object[]{baseResultActivity});
        } else {
            baseResultActivity.D3();
        }
    }

    public static /* synthetic */ CommonBaseDatasource q3(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("67d1dbc2", new Object[]{baseResultActivity});
        }
        return baseResultActivity.f;
    }

    public static /* synthetic */ void r3(BaseResultActivity baseResultActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74b19c", new Object[]{baseResultActivity, intent});
        } else {
            baseResultActivity.a4(intent);
        }
    }

    public static /* synthetic */ ViewGroup s3(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("85fb6b97", new Object[]{baseResultActivity});
        }
        return baseResultActivity.A;
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd29fb1c", new Object[]{this});
            return;
        }
        G4();
        z3();
    }

    public boolean A4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5494e5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void B4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16dfda", new Object[]{this, jSONObject});
            return;
        }
        MetaChildPageWidget T3 = T3();
        if (T3 != null) {
            T3.o3(jSONObject);
        }
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc04de0d", new Object[]{this});
            return;
        }
        f1p.f();
        x3();
        l5b.g(this);
        w3();
    }

    public void C4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390fd75", new Object[]{this});
        } else {
            super.finish();
        }
    }

    @Override // tb.n4m
    public void D(o4m o4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876541ae", new Object[]{this, o4mVar});
        } else {
            this.x.D(o4mVar);
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

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6378cbc3", new Object[]{this});
            return;
        }
        try {
            bcq.a().f(this, "taowise_android_aar");
            bcq.a().f(this, "tbsearch_remote");
        } catch (Exception unused) {
        }
        C3();
        B3();
        xop.o();
        this.f.setPageTraceSession(this);
        if (this.r) {
            runOnUiThread(new h02(this));
        }
        IpChange ipChange2 = g54.$ipChange;
        ((SFPreloadImpl) this.E).m();
        t3();
    }

    public final void D4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6b51c8", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = this.e;
        if (commonSearchContext != null && (this instanceof MainSearchResultActivity) && TextUtils.isEmpty(commonSearchContext.getKeyword()) && getIntent() != null) {
            String param = this.e.getParam("from");
            StringBuilder sb = new StringBuilder("url=");
            String dataString = getIntent().getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                try {
                    dataString = URLEncoder.encode(dataString, "utf-8");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            sb.append(dataString);
            sb.append(",from=");
            sb.append(param);
            TBS.Adv.ctrlClicked("Page_SearchItemList", CT.Button, "SearchEmptyKeyword", sb.toString());
        }
    }

    @Override // tb.cpc
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e450b5", new Object[]{this, str});
        } else {
            this.L.c(str);
        }
    }

    @Override // tb.oxb
    public boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        return this.w.l();
    }

    public final void E3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ebfbd8", new Object[]{this, bundle});
            return;
        }
        SearchSdk.init();
        z8t.d(getCore());
        this.f11678a = bqg.b(getIntent());
        this.c = true ^ y4p.g();
        zzo.c.a().b(o4p.R1());
        boolean m4 = m4(bundle);
        this.r = m4;
        if (!m4) {
            d4();
            A3();
        }
        CommonBaseDatasource commonBaseDatasource = this.f;
        if (commonBaseDatasource != null) {
            commonBaseDatasource.x(this.u, false);
        }
        e4();
        y4();
        ((SFPreloadImpl) this.E).n();
    }

    public void E4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d31a2", new Object[]{this});
        }
    }

    public void F3(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13cfde1", new Object[]{this, map});
            return;
        }
        ArrayList<SearchBarTagBean> arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        J3(map, false);
    }

    public final void F4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0fb30", new Object[]{this});
        } else if (this.e != null && this.f != null) {
            Map<String, String> b2 = cql.b(getIntent());
            this.e.updateParams(b2);
            this.f.setParams(b2);
        }
    }

    public final void G3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db13d6d", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        O3(hashMap);
        JSONObject d2 = h19.d(jSONObject, "params");
        if (d2 != null) {
            for (String str : d2.keySet()) {
                hashMap.put(str, d2.getString(str));
            }
        }
        F3(hashMap);
    }

    public final void G4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5665cc20", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = this.e;
        if (commonSearchContext != null) {
            String param = commonSearchContext.getParam(wll.ALI_TRACK_ID);
            if (!TextUtils.isEmpty(param)) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache(wll.ALI_TRACK_ID, param);
            }
        }
    }

    public void H3(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d334c3", new Object[]{this, map});
        } else {
            J3(map, false);
        }
    }

    public final void H4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f56ec44", new Object[]{this});
        } else if (this.j != null) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(this.j);
        }
    }

    public final void I3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8bdad6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            c4p.n("BaseResultActivity", "doRefreshAuction: paramsObject is null");
        } else {
            JSONObject d2 = h19.d(jSONObject, "params");
            if (d2 == null) {
                c4p.n("BaseResultActivity", "doRefreshAuction: realParamsObject is null");
                return;
            }
            CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) V3().e();
            for (String str : d2.keySet()) {
                String string = d2.getString(str);
                if (string == null) {
                    string = "";
                }
                commonBaseDatasource.setParam(str, string);
            }
            commonBaseDatasource.doRefreshListSearch();
        }
    }

    public final void I4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285b9689", new Object[]{this});
            return;
        }
        String str = this.h;
        if (TextUtils.isEmpty(str)) {
            c4p.m("BaseResultActivity", "currentPageName is null ");
            str = "Page_SearchItemList";
        }
        if (!TextUtils.isEmpty(str)) {
            setUTPageName(str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, str);
        }
    }

    @Override // tb.rnd
    public List<SearchBarTagBean> J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("248771f1", new Object[]{this});
        }
        return this.k;
    }

    public void J3(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee5a109", new Object[]{this, map, new Boolean(z)});
            return;
        }
        P3(map, z);
        B3();
    }

    public final void J4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4103ff1", new Object[]{this});
        } else if (this.i != null) {
            HashMap hashMap = new HashMap(this.i);
            String str = (String) hashMap.remove("utparam-cnt");
            if (!TextUtils.isEmpty(str)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this, str);
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        }
    }

    public final void K3(JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ea188b", new Object[]{this, jSONObject, aVar, aVar2});
        } else if (jSONObject == null) {
            c4p.n("BaseResultActivity", "doNewSearch: paramsObject is null");
        } else {
            JSONObject d2 = h19.d(jSONObject, "params");
            if (d2 == null) {
                c4p.n("BaseResultActivity", "doNewSearch: realParamsObject is null");
                return;
            }
            CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) V3().e();
            for (String str : d2.keySet()) {
                String string = d2.getString(str);
                if (string == null) {
                    string = "";
                }
                commonBaseDatasource.setParam(str, string);
                if (CommonSearchContext.sOtherTabWhiteList.contains(str)) {
                    X3().setParam(str, string);
                }
            }
            commonBaseDatasource.setParam(r4p.KEY_TB_2024, String.valueOf(this.C));
            commonBaseDatasource.doNewSearch();
        }
    }

    public final void K4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16954cc", new Object[]{this});
            return;
        }
        I4();
        J4();
        H4();
    }

    public void L3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c93b012", new Object[]{this, jSONObject});
        } else if (o4p.w1()) {
            n4(jSONObject);
        } else {
            SearchBarTagBean fromJson = SearchBarTagBean.fromJson(jSONObject);
            if (fromJson != null) {
                u3(fromJson);
            }
        }
    }

    public void M3(SearchBarTagBean searchBarTagBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca94045", new Object[]{this, searchBarTagBean, str});
            return;
        }
        MultiValueParamArrayMap multiValueParamArrayMap = new MultiValueParamArrayMap();
        O3(multiValueParamArrayMap);
        String keyword = ((CommonBaseDatasource) V3().e()).getKeyword();
        StringBuilder sb = new StringBuilder(keyword);
        Iterator<SearchBarTagBean> it = this.k.iterator();
        while (it.hasNext()) {
            SearchBarTagBean next = it.next();
            Map<String, String> params = next.getParams();
            if (params != null) {
                multiValueParamArrayMap.putAll(params);
            }
            String q = next.getQ();
            if (!TextUtils.isEmpty(q)) {
                sb.append(" ");
                sb.append(q);
            }
        }
        multiValueParamArrayMap.put("q", keyword);
        multiValueParamArrayMap.put(r4p.KEY_TAG_SEARCH_KEYWORD, sb.toString());
        multiValueParamArrayMap.put("onTag", searchBarTagBean.getDescription());
        multiValueParamArrayMap.put("tagAction", str);
        H3(multiValueParamArrayMap);
    }

    public final void O3(Map<String, String> map) {
        CommonBaseDatasource commonBaseDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940e0794", new Object[]{this, map});
        } else if (V3() != null && (commonBaseDatasource = (CommonBaseDatasource) V3().e()) != null) {
            eca.a(map, commonBaseDatasource.getParamsSnapShot());
            if (j4() && o4p.p1()) {
                map.put(r4p.KEY_POP_UP_HEIGHT, this.e.getParam(r4p.KEY_POP_UP_HEIGHT));
                map.put(r4p.KEY_POP_UP, this.e.getParam(r4p.KEY_POP_UP));
            }
            String tab = commonBaseDatasource.getTab();
            if (!TextUtils.isEmpty(tab)) {
                map.put("tab", tab);
            }
            String paramValue = commonBaseDatasource.getParamValue("m");
            if (!TextUtils.isEmpty(paramValue)) {
                map.put("m", paramValue);
            }
            String paramValue2 = commonBaseDatasource.getParamValue(r4p.KEY_HAS_TAB);
            if (!TextUtils.isEmpty(paramValue2)) {
                map.put(r4p.KEY_HAS_TAB, paramValue2);
            }
        }
    }

    @Override // tb.oxb
    public void P(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb2319b", new Object[]{this, zo6Var});
        } else {
            this.w.r(zo6Var);
        }
    }

    @Override // tb.vyd
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91b06817", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.n4m
    public boolean Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdab9ba", new Object[]{this})).booleanValue();
        }
        return this.x.Q2();
    }

    public final Map<String, Object> Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9bbe2b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", W3());
        String param = this.e.getParam("lastQ");
        if (!TextUtils.isEmpty(param)) {
            hashMap.put("lastQuery", param);
        }
        return hashMap;
    }

    public JSONArray R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7265ff99", new Object[]{this});
        }
        return null;
    }

    @Override // tb.wyd
    public String S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa79083", new Object[]{this});
        }
        return this.J;
    }

    @Override // tb.n4m
    public void S2(o4m o4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96dd215", new Object[]{this, o4mVar});
        } else {
            this.x.S2(o4mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    public final View S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            return bshVar.getView();
        }
        return null;
    }

    public final MetaChildPageWidget T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("d8437ff1", new Object[]{this});
        }
        bsh bshVar = this.d;
        if (bshVar == null) {
            return null;
        }
        return bshVar.H2();
    }

    public final String U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd85fc1", new Object[]{this});
        }
        String param = this.e.getParam("fallbackSpm");
        if (TextUtils.isEmpty(param)) {
            return "a2141.7631557.0.0";
        }
        return param;
    }

    public tnl V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnl) ipChange.ipc$dispatch("1c77a5ac", new Object[]{this});
        }
        return this.g;
    }

    public String W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d62ef27", new Object[]{this});
        }
        CommonBaseDatasource commonBaseDatasource = this.f;
        if (commonBaseDatasource != null) {
            return commonBaseDatasource.getKeyword();
        }
        return "";
    }

    public CommonSearchContext X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchContext) ipChange.ipc$dispatch("7b0c1d9", new Object[]{this});
        }
        return this.e;
    }

    public boolean Y3(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c10b3c", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        return false;
    }

    public final void Z3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7eb7385", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("tab");
        if (!TextUtils.isEmpty(string)) {
            JSONObject d2 = h19.d(jSONObject, "params");
            if (d2 != null) {
                for (Map.Entry<String, Object> entry : d2.entrySet()) {
                    this.e.setTabParams(string, entry.getKey(), entry.getValue().toString());
                }
            }
            bsh bshVar = this.d;
            if (bshVar != null) {
                ((MSController) bshVar.G2()).v0(string, d2);
            }
        }
    }

    public void c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3282fd13", new Object[]{this});
        } else if (V3() != null) {
            tnl V3 = V3();
            Boolean bool = Boolean.TRUE;
            V3.q("showSceneLayer", bool);
            V3().q("standaloneSearchBar", bool);
            V3().q("cellListenerFactory", new k08());
            V3().q("trimMemory", Boolean.valueOf(y4p.u()));
        }
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

    @Override // tb.vyd
    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77333509", new Object[]{this})).booleanValue();
        }
        if (this.m || this.n) {
            return true;
        }
        return false;
    }

    public final void e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ceaeeb", new Object[]{this});
            return;
        }
        this.l = true;
        o4p.d1();
        this.n = cpt.a();
        i3p.c h = getCore().f().h();
        l3p l3pVar = l3p.INSTANCE;
        h.c(l3pVar.i());
        getCore().f().h().f21078a = l3pVar.e();
        getCore().f().h().c = y4p.k();
        getCore().f().h().f = o4p.I1();
        o4p.J2();
        uz.j = o4p.G0();
        l3pVar.j();
        i3p.c h2 = getCore().f().h();
        y4p.s();
        h2.getClass();
        i3p.c h3 = getCore().f().h();
        new qeq();
        h3.getClass();
        j3p.g().f().h().d = true;
        j3p.g().f().h().e = true;
        this.F = o4p.r1();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        whj whjVar = this.K;
        if (whjVar != null) {
            whjVar.c();
        }
        CommonSearchContext commonSearchContext = this.e;
        if (commonSearchContext == null || !commonSearchContext.isPopupSrp() || this.v == null || !N3()) {
            super.finish();
        } else {
            this.v.k();
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

    @Override // androidx.appcompat.app.AppCompatActivity
    public ActionBar getSupportActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("e9bb2ffd", new Object[]{this});
        }
        try {
            return super.getSupportActionBar();
        } catch (Throwable unused) {
            return null;
        }
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

    @Override // com.taobao.tao.BaseActivity
    public Toolbar getToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("2f69ac9b", new Object[]{this});
        }
        return this.p;
    }

    public boolean h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24874b4", new Object[]{this})).booleanValue();
        }
        return o4p.n2();
    }

    public final boolean i4(Intent intent) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1d8a334", new Object[]{this, intent})).booleanValue();
        }
        Intent intentForUri = Nav.from(this).intentForUri(intent.getData());
        if (intentForUri == null || (component = intentForUri.getComponent()) == null || TextUtils.equals(component.getClassName(), MainSearchResultActivity.class.getName())) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return o2();
    }

    @Override // android.app.Activity
    public boolean isInMultiWindowMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b86a5e8", new Object[]{this})).booleanValue();
        }
        if (!this.F) {
            return super.isInMultiWindowMode();
        }
        if (this.M == null) {
            this.M = Boolean.valueOf(super.isInMultiWindowMode());
        }
        return this.M.booleanValue();
    }

    @Override // tb.oxb
    public void j0(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312b88b4", new Object[]{this, zo6Var});
        } else {
            this.w.t(zo6Var);
        }
    }

    public boolean j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4da21fa", new Object[]{this})).booleanValue();
        }
        CommonSearchContext commonSearchContext = this.e;
        if (commonSearchContext == null || !commonSearchContext.isPopupSrp()) {
            return false;
        }
        return true;
    }

    @Override // tb.wyd
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94810df4", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public final void n4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d510145c", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("q", this.e.getKeyword());
        O3(hashMap);
        JSONArray jSONArray = new JSONArray();
        Iterator<SearchBarTagBean> it = this.k.iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.toJSON(it.next()));
        }
        jSONArray.add(jSONObject);
        hashMap.put(h1p.KEY_SEARCH_BAR_TAG, jSONArray.toJSONString());
        Nav.from(this).toUri(f6p.c(h1p.SEARCHLIST_H5, hashMap));
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
        return this.q;
    }

    public final void o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b19654", new Object[]{this});
            return;
        }
        try {
            bsh bshVar = this.d;
            if (bshVar != null) {
                bshVar.destroyAndRemoveFromParent();
            }
        } catch (Exception e2) {
            c4p.o("BaseResultActivity", "pageWidget销毁失败，请检查log", e2);
        }
        if (this.f != null) {
            c4p.m("BaseResultActivity", "destroy datasource: " + this.f);
            if (this.f.isSubscribed(this)) {
                this.f.unsubscribe(this);
            }
            this.f.destroy();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        bsh bshVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (!Y3(i, i2, intent) && !o4p.i0() && (bshVar = this.d) != null) {
            bshVar.postEvent(fml.a(i, i2, intent));
        }
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
            if (z != this.H) {
                w4();
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.o = System.currentTimeMillis();
        this.E = new SFPreloadImpl(this);
        f4();
        Handler handler = this.z;
        if (handler != null) {
            handler.post(new b(bundle));
        } else {
            E3(bundle);
        }
        this.w.q(this, false);
        this.H = this.w.k();
        if (A4()) {
            setTheme(R.style.Theme_SearchAnimation);
        }
        super.onCreate(bundle);
        if (this.z != null) {
            DelegateLayout delegateLayout = new DelegateLayout(this);
            this.A = delegateLayout;
            setContentView(delegateLayout);
            this.z.post(new c());
        } else {
            D3();
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        hj8.d().o(this);
        RpxConfigVM.Companion.l(this);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.B = 3;
        o4();
        DetailPreRequestUtil.e().i(this.u, false);
        hj8.d().s(this);
        whj whjVar = this.K;
        if (whjVar != null) {
            whjVar.c();
        }
        jyf.Companion.a(this);
        this.x.b();
        ((SFPreloadImpl) this.E).j();
    }

    public void onEventMainThread(y2p y2pVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
        } else if (!((CommonSearchResult) this.f.getTotalSearchResult()).newSearch && this.K != null && o4p.s1()) {
            kae h = this.K.h();
            if (h instanceof m8j) {
                m8j m8jVar = (m8j) h;
                if (m8jVar.getModel().e() instanceof CommonBaseDatasource) {
                    CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) m8jVar.getModel().e();
                    if (commonBaseDatasource.getTotalSearchResult() != 0) {
                        if (((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).noResultMod == null) {
                            i = ((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).getTotalResult();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("totalResults", (Object) String.valueOf(i));
                        this.K.d("searchFinish", jSONObject);
                    }
                }
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        sen.e("Back");
        supportFinishAfterTransition();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        super.onMultiWindowModeChanged(z, configuration);
        this.M = Boolean.valueOf(z);
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        Handler handler = this.z;
        if (handler != null) {
            handler.post(new d(intent));
        } else {
            a4(intent);
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
        onKeyDown(4, null);
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.B = 2;
        WXSDKEngine.setActivityNavBarSetter(null);
        p4();
        if (!TextUtils.isEmpty(this.h)) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
        IpChange ipChange2 = ayf.$ipChange;
        String str = this.h;
        if (this.i != null) {
            hashMap = new HashMap(this.i);
        } else {
            hashMap = null;
        }
        h6p.i(str, null, hashMap, this);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.B = 1;
        WXSDKEngine.setActivityNavBarSetter(new l7x(this));
        K4();
        if (!TextUtils.isEmpty(this.h)) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        }
        q4();
        if (!TextUtils.isEmpty(this.h)) {
            h6p.h(this.h, null, Q3(), this);
        }
        jyf.Companion.d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.D = true;
    }

    public final void p4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5125710", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.onCtxPauseInternal();
        }
        x2 x2Var = this.G;
        if (x2Var != null) {
            x2Var.c();
        }
        ((SFPreloadImpl) this.E).w();
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("pageName", "n_search");
        bundle.putParcelable(jjx.ZZB_BUNDLE_KEY, bundle2);
        if (this.e != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("q", this.e.getParam("q"));
            bundle.putParcelable("extraInfo", bundle3);
        }
        return bundle;
    }

    public final void q4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9197c901", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.onCtxResumeInternal();
        }
        x2 x2Var = this.G;
        if (x2Var != null) {
            x2Var.d();
        }
        E4();
        ((SFPreloadImpl) this.E).B();
    }

    @Override // tb.cbk.a
    public void r2(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfe7a2d", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            onEventMainThread(f64.a(str, jSONObject, zak.a(jSCallback), zak.a(jSCallback2)));
        }
    }

    public void r4(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5036db8", new Object[]{this, commonBaseDatasource});
        }
    }

    public void s4() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6864166c", new Object[]{this});
            return;
        }
        uo6 uo6Var = this.w;
        View S3 = S3();
        rim rimVar = this.v;
        if (rimVar != null) {
            i = rimVar.o();
        }
        uo6Var.i(S3, i);
        this.G = new x2(this.d);
        int i2 = this.B;
        if (i2 == 1) {
            q4();
            t4();
        } else if (i2 == 2) {
            p4();
        } else if (i2 == 3) {
            o4();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void setSupportActionBar(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f31ba48", new Object[]{this, toolbar});
        } else {
            runOnUiThread(new a(toolbar));
        }
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb77573b", new Object[]{this});
        } else if (((jrh) this.f) != null) {
            mdd b2 = vxm.b.b(snl.f28161a.f(this).b());
            b2.a("afcColdContext", String.valueOf(this.f11678a));
            b2.a("pageRebuild", String.valueOf(this.r));
            b2.a(z1x.PRE_REQUEST, String.valueOf(this.s));
            b2.a("navPreRequest", String.valueOf(this.t));
        }
    }

    public final void t4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc48b30e", new Object[]{this});
        } else if (TextUtils.isEmpty(this.h) && o4p.w0()) {
            if (this.i == null) {
                HashMap hashMap = new HashMap();
                this.i = hashMap;
                hashMap.put("spm-cnt", U3());
            }
            this.h = "Page_SearchItemList";
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, this.i);
            h6p.h(this.h, null, Q3(), this);
        }
    }

    public void u4(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdb560f", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.postEvent(f64.a(str, jSONObject, zak.a(jSCallback), zak.a(jSCallback2)));
        }
    }

    @Override // tb.cpc
    public void v0(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3334777", new Object[]{this, aVar});
        } else {
            this.L.a(aVar);
        }
    }

    public void v3(AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64167f79", new Object[]{this, animatorListenerAdapter});
            return;
        }
        rim rimVar = this.v;
        if (rimVar != null) {
            rimVar.g(animatorListenerAdapter);
        } else {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public final void v4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f854e5", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String obj = jSONObject.remove("id").toString();
            if (!TextUtils.isEmpty(obj)) {
                CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) ((acx) this.d.getModel()).a();
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                ArrayMap arrayMap = new ArrayMap();
                if (commonSearchResult != null) {
                    arrayMap.put("sessionid", commonSearchResult.getMainInfo().rn);
                }
                arrayMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(this.e.getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN)));
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    String obj2 = entry.getValue().toString();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(obj2)) {
                        arrayMap.put(key, obj2);
                    }
                }
                commonBaseDatasource.u().q(obj, arrayMap);
            }
        }
    }

    public void w3() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c064f95", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null && TextUtils.isEmpty(data.getQueryParameter(r4p.KEY_MONITOR_COUNTRY))) {
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(r4p.KEY_MONITOR_COUNTRY, k1p.a());
            intent.setData(buildUpon.build());
        }
    }

    public final void w4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ab09a5", new Object[]{this});
            return;
        }
        finish();
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }

    @Override // tb.pec
    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e4ee00", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    @Override // tb.n4m
    public void x1(M3CellBean m3CellBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fa9677", new Object[]{this, m3CellBean, new Boolean(z)});
        } else {
            this.x.x1(m3CellBean, z);
        }
    }

    public void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d48c153", new Object[]{this});
            return;
        }
        c4p.m("BaseResultActivity", "checkAndUpdateInActivity");
        oen.z();
    }

    public void x4(SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36065779", new Object[]{this, searchBarTagBean});
            return;
        }
        ArrayList<SearchBarTagBean> arrayList = this.k;
        if (arrayList != null && arrayList.contains(searchBarTagBean)) {
            this.k.remove(searchBarTagBean);
            M3(searchBarTagBean, "cancel");
        }
    }

    @Override // tb.oad
    public whj y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whj) ipChange.ipc$dispatch("b16337", new Object[]{this});
        }
        if (this.K == null) {
            this.K = new whj(this);
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            ((MSController) bshVar.e).U0(this.K);
        }
        return this.K;
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7ecffb", new Object[]{this});
            return;
        }
        MetaChildPageWidget T3 = T3();
        if (T3 != null) {
            T3.F2();
        }
    }

    public final void y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17589320", new Object[]{this});
        } else if (o4p.j2()) {
            c4p.m("BaseResultActivity", "从外部分享进行搜索禁用");
        } else {
            Intent intent = getIntent();
            String action = intent.getAction();
            String type = intent.getType();
            if ("android.intent.action.SEND".equals(action) && Constants.SHARETYPE.equals(type)) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                String stringExtra2 = intent.getStringExtra("android.intent.extra.TITLE");
                c4p.m("BaseResultActivity", "send: text=" + stringExtra + ", title=" + stringExtra2);
                if (!TextUtils.isEmpty(stringExtra)) {
                    intent.putExtra("q", stringExtra);
                    c4p.m("BaseResultActivity", "putExtra: q=" + stringExtra);
                }
            }
        }
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ab100d", new Object[]{this});
        } else if (this.e != null) {
            HashMap hashMap = new HashMap();
            String param = this.e.getParam(yj4.PARAM_ENTRY_UT_PARAM);
            if (!TextUtils.isEmpty(param)) {
                hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, param);
            }
            String param2 = this.e.getParam("entryScm");
            if (!TextUtils.isEmpty(param2)) {
                hashMap.put("entryScm", param2);
            }
            String param3 = this.e.getParam("entrySpm");
            if (!TextUtils.isEmpty(param3)) {
                hashMap.put("entrySpm", param3);
            }
            if (!hashMap.isEmpty()) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this, JSON.toJSONString(hashMap));
            }
        }
    }

    public void z4(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7bfcdf", new Object[]{this, toolbar});
        } else {
            this.p = toolbar;
        }
    }

    public boolean N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a31ba6", new Object[]{this})).booleanValue();
        }
        return true ^ "false".equals(this.e.getParamIncludingGlobal("tbsearch_popup_animated"));
    }

    public final void b4(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9231151a", new Object[]{this, commonBaseDatasource});
        } else if (commonBaseDatasource != null) {
            List asList = Arrays.asList(o4p.J());
            if (asList.contains("g_jump")) {
                this.m = false;
            } else {
                this.m = TextUtils.equals(this.e.getParam("g_jump"), "true");
                commonBaseDatasource.getCurrentParam().setParam(h1p.a.a(h1p.a.PARAM_KEY_IS_NEW_SEARCH_JUMP), String.valueOf(this.m));
            }
            if (this.m) {
                if (!asList.contains(h1p.a.PARAM_KEY_LIST_START_INDEX)) {
                    commonBaseDatasource.getCurrentParam().setParam(h1p.a.a(h1p.a.PARAM_KEY_LIST_START_INDEX), this.e.getParam(h1p.a.PARAM_KEY_LIST_START_INDEX));
                }
                if (!asList.contains(h1p.a.PARAM_KEY_FIRST_RN)) {
                    commonBaseDatasource.getCurrentParam().setParam(h1p.a.a(h1p.a.PARAM_KEY_FIRST_RN), this.e.getParam(h1p.a.PARAM_KEY_FIRST_RN));
                }
                if (!asList.contains(h1p.a.PARAM_KEY_COMBO_PAGE)) {
                    commonBaseDatasource.getCurrentParam().setParam(h1p.a.a(h1p.a.PARAM_KEY_COMBO_PAGE), this.e.getParam(h1p.a.PARAM_KEY_COMBO_PAGE));
                }
            }
        }
    }

    public final void d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd690be", new Object[]{this});
            return;
        }
        Map<String, String> b2 = cql.b(getIntent());
        g4(b2);
        if (!b2.containsKey(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE) && y4p.q()) {
            b2.put(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE, "true");
        }
        if (!SearchDoorActivity.y3(getIntent()) && Localization.n()) {
            this.C = y4p.t();
            this.J = y4p.a();
        }
        b2.put(r4p.KEY_TB_2024, String.valueOf(this.C));
        P3(b2, true);
    }

    public final boolean l4(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a73dce19", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        try {
            str = intent.getStringExtra(h1p.KEY_IS_REFRESH);
        } catch (Throwable unused) {
            str = "";
        }
        return "true".equals(str);
    }

    public void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2122b8d6", new Object[]{this});
            return;
        }
        this.m = TextUtils.equals(this.e.getParam("g_jump"), "true");
        TextUtils.equals(this.e.getParam(r4p.KEY_JARVIS_DISABLED, ""), "true");
        this.g = new tnl<>(this.f, this.e);
        jrh jrhVar = (jrh) this.f;
        jrhVar.L0().h = this.e;
        jrhVar.L0().V0(this.E);
        jrhVar.L0().Y0(this.k);
        jrhVar.L0().R0(this);
        this.g = jrhVar.L0().v();
        jrhVar.L0().S0(R3());
        c4();
        this.g.f().k(this.o);
        ViewGroup viewGroup = null;
        xfn xfnVar = this.f instanceof g1i ? new xfn(yak.f31939a, (g1i) this.f) : null;
        jrhVar.L0().W0(xfnVar);
        b64 b64Var = new b64(this.g, this.f, xfnVar);
        if (this.e.isPopupSrp() && !this.y && o4p.p1()) {
            this.y = true;
            setContentView(R.layout.tbsearch_mini_search);
        }
        b64Var.j(true);
        if (!o4p.u0() && wr3.SIGNAL.equals(this.e.getKeyword())) {
            getCore().e().f(true);
            yko ykoVar = uin.f29403a;
            if (ykoVar != null) {
                ykoVar.e().f(true);
            }
        }
        jrhVar.L0().v().f().k(this.o);
        grh grhVar = new grh(getCore());
        if (ScreenType.IS_FOLDABLE || ScreenType.IS_PAD) {
            grhVar.J0(true);
        }
        if (this.e.isPopupSrp()) {
            if (this.e.isPopupDrag()) {
                grhVar.z1();
            } else if (this.e.isPopupIcon()) {
                grhVar.A1();
            } else if (this.e.isPopupCloseStyle()) {
                grhVar.y1();
            }
        } else if (this.e.isDynamicSearchBar()) {
            grhVar.L1();
        }
        grhVar.C0(o2());
        grhVar.w0(true);
        if (this.e.isGallerySrp()) {
            grhVar.O0(0);
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            if (bshVar.getView() != 0 && (((FrameLayout) this.d.getView()).getParent() instanceof ViewGroup)) {
                viewGroup = (ViewGroup) ((FrameLayout) this.d.getView()).getParent();
                viewGroup.removeView(this.d.getView());
            }
            this.d.destroyAndRemoveFromParent();
        }
        bsh bshVar2 = new bsh(grhVar, this, this, jrhVar.L0().t(), null, new e(viewGroup));
        bshVar2.ensureView();
        bshVar2.w3();
        bshVar2.v3();
        bshVar2.d3();
        bshVar2.subscribeEvent(this);
        runOnUiThread(new f(bshVar2, jrhVar));
        if (this.e.isPopupSrp()) {
            rim rimVar = this.v;
            if (rimVar != null) {
                rimVar.i();
                rim rimVar2 = new rim(bshVar2, this);
                this.v = rimVar2;
                rimVar2.j(false);
            } else {
                rim rimVar3 = new rim(bshVar2, this);
                this.v = rimVar3;
                rimVar3.j(N3());
            }
        }
        D4();
    }

    public final void P3(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef460dd8", new Object[]{this, map, new Boolean(z)});
            return;
        }
        vjx.a(this);
        if (map == null) {
            this.e = CommonSearchContext.fromIntent(getIntent());
        } else {
            this.e = CommonSearchContext.fromMap(map);
        }
        if (TextUtils.isEmpty(this.e.getParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN))) {
            CommonSearchContext commonSearchContext = this.e;
            cvr cvrVar = cvr.INSTANCE;
            commonSearchContext.setParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(cvrVar.f()));
            this.e.setParam(r4p.KEY_GRAY_HAIR, String.valueOf(cvrVar.f()));
        }
        this.e.init();
        CommonBaseDatasource a2 = z ? n1p.b().a(this.e.getDatasourceToken()) : null;
        if (a2 != null) {
            c4p.m("BaseResultActivity", "存在预加载datasource");
            this.s = true;
            this.f = a2;
            r4(a2);
            if (getIntent() != null) {
                this.t = getIntent().getBooleanExtra(h1p.KEY_NAV_PRE_REQUEST, false);
            }
        } else {
            c4p.m("BaseResultActivity", "不存在预加载datasource，创建新的datasource");
            this.f = gu6.b(true, this.e, getCore());
            this.s = false;
        }
        if (this.f11678a) {
            this.f.setParam("isPassiveLaunch", "true");
            this.f.setParam("isPreloadRequest", String.valueOf(!this.c));
        }
        if (z) {
            CommonBaseDatasource commonBaseDatasource = this.f;
            commonBaseDatasource.f11697a = this.o;
            commonBaseDatasource.b = this.f11678a;
            commonBaseDatasource.c = !this.c;
        }
        b4(this.f);
        this.f.subscribePreSearch(this, -10);
        if (this.f.getSrpLifeCycleWatcher() != null) {
            this.f.getSrpLifeCycleWatcher().v(this.f instanceof jrh);
        }
        if (this.f.isFirstSearchDone()) {
            c4p.m("BaseResultActivity", "非首次搜索，不请求");
        } else if (!this.f11678a || this.b || !this.c) {
            c4p.m("BaseResultActivity", "首次搜索，发起请求");
            this.f.a();
            int e2 = srl.e(this.e.getParam(h1p.a.PARAM_KEY_COMBO_PAGE), -1);
            if (e2 > 0) {
                this.f.doNewSearchWithAssignPage(e2);
            } else {
                this.f.doNewSearch();
            }
        } else {
            c4p.D("BaseResultActivity", "海关极简链路唤端，且需要等待换链完成，onCreate中不发起请求", new Object[0]);
        }
        if (!this.f.isSubscribed(this)) {
            this.f.subscribe(this);
        }
    }

    public final void a4(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e03458", new Object[]{this, intent});
        } else if (l4(intent)) {
            V3().e().doNewSearch();
        } else if (!this.f11678a) {
            y4();
            F3(null);
        } else if (i4(intent)) {
            c4p.D("BaseResultActivity", "海关极简链路换链完成，跳出搜索。新链接：" + intent.getData(), new Object[0]);
            Nav.from(this).toUri(intent.getData());
            finish();
        } else if (this.c && !this.b) {
            this.b = true;
            c4p.D("BaseResultActivity", "海关极简链路换链完成，发起首次搜索", new Object[0]);
            F4();
            this.f.doNewSearch();
        }
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68548e6", new Object[]{this});
            return;
        }
        try {
            if (getIntent().getBooleanExtra(r4p.IS_IMMERSIVE, true)) {
                this.q = y4p.i();
            }
            this.u = DetailPreRequestUtil.e().c(false);
        } catch (Exception unused) {
            this.q = true;
        }
        try {
            k1p.d();
        } catch (Throwable unused2) {
            c4p.n("BaseResultActivity", "update country code error");
        }
    }

    public final void g4(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce656c2", new Object[]{this, map});
            return;
        }
        String remove = map.remove(h1p.KEY_SEARCH_BAR_TAG);
        if (!TextUtils.isEmpty(remove)) {
            try {
                JSONArray parseArray = JSON.parseArray(remove);
                if (parseArray != null) {
                    StringBuilder sb = new StringBuilder(map.get("q"));
                    for (int i = 0; i < parseArray.size(); i++) {
                        SearchBarTagBean fromJson = SearchBarTagBean.fromJson(parseArray.getJSONObject(i));
                        if (fromJson != null) {
                            this.k.add(fromJson);
                            Map<String, String> params = fromJson.getParams();
                            if (params != null) {
                                map.putAll(params);
                            }
                            String q = fromJson.getQ();
                            if (!TextUtils.isEmpty(q)) {
                                sb.append(" ");
                                sb.append(q);
                            }
                            map.put("onTag", fromJson.getDescription());
                            map.put("tagAction", ThemisConfig.SCENE_SELECT);
                        }
                    }
                    map.put(r4p.KEY_TAG_SEARCH_KEYWORD, sb.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean m4(Bundle bundle) {
        bol a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a687ce47", new Object[]{this, bundle})).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) bundle.getString(aoo.EXTRA_REBUILD_PAGE, ""));
        jSONObject.put("tabName", (Object) bundle.getString(aoo.EXTRA_REBUILD_TAB, ""));
        zzo.c.a().c(jSONObject);
        if (!o4p.P1()) {
            return false;
        }
        String string = bundle.getString(aoo.EXTRA_REBUILD_TOKEN, "");
        if (!(TextUtils.isEmpty(string) || (a2 = aoo.a(string)) == null || a2.d() == null)) {
            this.e = a2.d();
            if (a2.e()) {
                this.f = new jrh(a2.b(), true, getCore(), new yno(new v5p("PageRebuild")));
                MSController mSController = new MSController(getCore());
                mSController.V0(this.E);
                jrh jrhVar = (jrh) this.f;
                mSController.f8936a = jrhVar;
                jrhVar.a1(mSController);
                ((jrh) this.f).X0();
                r4(this.f);
                this.k = a2.c();
                this.f.getCurrentParam().setParam(h1p.a.a(h1p.a.PARAM_KEY_LIST_START_INDEX), String.valueOf(((g1i) this.f).d0()));
                return true;
            }
        }
        return false;
    }

    public void u3(SearchBarTagBean searchBarTagBean) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486d6f96", new Object[]{this, searchBarTagBean});
        } else if (searchBarTagBean != null && this.k != null) {
            if (TextUtils.equals(searchBarTagBean.getType(), "append")) {
                this.k.add(searchBarTagBean);
            } else if (TextUtils.equals(searchBarTagBean.getType(), "update")) {
                while (true) {
                    if (i >= this.k.size()) {
                        i = -1;
                        break;
                    } else if (TextUtils.equals(this.k.get(i).getType(), "update")) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    this.k.add(searchBarTagBean);
                } else {
                    this.k.set(i, searchBarTagBean);
                }
            }
            M3(searchBarTagBean, ThemisConfig.SCENE_SELECT);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r3.equals("closeLeftBar") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEventMainThread(tb.f64 r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.sf.BaseResultActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "9a23ff93"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            if (r7 == 0) goto L_0x00c1
            java.lang.String r3 = r7.f19044a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x00c1
        L_0x0021:
            java.lang.String r3 = r7.f19044a
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1346841084: goto L_0x0081;
                case -1289673356: goto L_0x0078;
                case -906336856: goto L_0x006c;
                case 2161725: goto L_0x0060;
                case 443574479: goto L_0x0054;
                case 674818956: goto L_0x0048;
                case 1733653986: goto L_0x003c;
                case 2014054120: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = -1
            goto L_0x008c
        L_0x0030:
            java.lang.String r0 = "refreshAuction"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x002e
        L_0x003a:
            r0 = 7
            goto L_0x008c
        L_0x003c:
            java.lang.String r0 = "tagSearch"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x002e
        L_0x0046:
            r0 = 6
            goto L_0x008c
        L_0x0048:
            java.lang.String r0 = "jumpToTab"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x002e
        L_0x0052:
            r0 = 5
            goto L_0x008c
        L_0x0054:
            java.lang.String r0 = "showLeftBar"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x002e
        L_0x005e:
            r0 = 4
            goto L_0x008c
        L_0x0060:
            java.lang.String r0 = "searchOption"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006a
            goto L_0x002e
        L_0x006a:
            r0 = 3
            goto L_0x008c
        L_0x006c:
            java.lang.String r0 = "search"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x002e
        L_0x0076:
            r0 = 2
            goto L_0x008c
        L_0x0078:
            java.lang.String r1 = "closeLeftBar"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x008c
            goto L_0x002e
        L_0x0081:
            java.lang.String r0 = "prepareCompassRequest"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x008b
            goto L_0x002e
        L_0x008b:
            r0 = 0
        L_0x008c:
            switch(r0) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009c;
                case 6: goto L_0x0096;
                case 7: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x00c1
        L_0x0090:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.I3(r7)
            goto L_0x00c1
        L_0x0096:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.L3(r7)
            goto L_0x00c1
        L_0x009c:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.Z3(r7)
            goto L_0x00c1
        L_0x00a2:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.B4(r7)
            goto L_0x00c1
        L_0x00a8:
            com.alibaba.fastjson.JSONObject r0 = r7.b
            tb.f64$a r1 = r7.c
            tb.f64$a r7 = r7.d
            r6.K3(r0, r1, r7)
            goto L_0x00c1
        L_0x00b2:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.G3(r7)
            goto L_0x00c1
        L_0x00b8:
            r6.y3()
            goto L_0x00c1
        L_0x00bc:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.v4(r7)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.BaseResultActivity.onEventMainThread(tb.f64):void");
    }

    public void onEventMainThread(lml lmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c94836", new Object[]{this, lmlVar});
            return;
        }
        String str = lmlVar.f23422a;
        if (TextUtils.isEmpty(str)) {
            c4p.n("BaseResultActivity", "pageName为空，不更新2001埋点");
        } else if (TextUtils.equals(str, this.h)) {
            this.I = true;
            c4p.m("BaseResultActivity", "pageName没有变化，不更新2001埋点，只更新properties");
            this.i = lmlVar.b;
            J4();
        } else {
            if (!TextUtils.isEmpty(this.h) && this.I) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
                h6p.i(this.h, null, this.i != null ? new HashMap(this.i) : null, this);
            }
            this.h = lmlVar.f23422a;
            this.i = lmlVar.b;
            this.j = lmlVar.c;
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            h6p.h(this.h, null, Q3(), this);
            K4();
            this.I = true;
        }
    }
}
