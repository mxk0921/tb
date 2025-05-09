package com.taobao.search.sf;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.m3.widget.M3ListContainer;
import com.taobao.search.m3.widget.M3WfContainer;
import com.taobao.search.musie.MUSXSearchEventModule;
import com.taobao.search.performance.perf.SFPreloadImpl;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.HashMap;
import tb.acq;
import tb.acx;
import tb.aoo;
import tb.b4p;
import tb.bol;
import tb.bsh;
import tb.c4p;
import tb.cvr;
import tb.f1p;
import tb.fw;
import tb.g1i;
import tb.g92;
import tb.gnh;
import tb.gtf;
import tb.h19;
import tb.h1p;
import tb.h48;
import tb.h9;
import tb.hvr;
import tb.jrh;
import tb.le1;
import tb.ljw;
import tb.m0p;
import tb.mf0;
import tb.n93;
import tb.nbf;
import tb.o02;
import tb.o1p;
import tb.o4p;
import tb.okd;
import tb.okn;
import tb.pg1;
import tb.pq;
import tb.q1p;
import tb.s0p;
import tb.s2d;
import tb.sen;
import tb.t2o;
import tb.ua8;
import tb.wnl;
import tb.wqg;
import tb.xpo;
import tb.xq;
import tb.y3u;
import tb.y54;
import tb.y91;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MainSearchResultActivity extends BaseResultActivity implements pq, ShareContentCallBack, okd, gnh, wqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long O;
    public JSONArray P;
    public JSONObject R;
    public String T;
    public y3u U;
    public ljw W;
    public okn N = null;
    public final boolean Q = o4p.S1();
    public boolean S = true;
    public final boolean V = o4p.M1();
    public final boolean X = o4p.P1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g92.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.g92.c
        public void a(ljw ljwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2b4c41", new Object[]{this, ljwVar});
                return;
            }
            MainSearchResultActivity.Q4(MainSearchResultActivity.this, ljwVar);
            MainSearchResultActivity.R4(MainSearchResultActivity.this);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/MainSearchResultActivity$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                MainSearchResultActivity.L4(MainSearchResultActivity.this);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/MainSearchResultActivity$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                MainSearchResultActivity.M4(MainSearchResultActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/MainSearchResultActivity$3");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                MainSearchResultActivity.N4(MainSearchResultActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(f fVar) {
            }

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        }

        public f() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem.getId() == R.id.tbsearch_add_widget) {
                sen.b("quanjudaohang_widget_click");
                AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq("search").a(MainSearchResultActivity.this));
                HashMap hashMap = new HashMap();
                hashMap.put("popId", "search_widget");
                hashMap.put("bizId", "search");
                hashMap.put("url", o4p.i());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("animation", (Object) nbf.STDPOP_ANIMATION_BOTTOM);
                jSONObject.put("panEnable", (Object) "true");
                jSONObject.put("maxHeight", (Object) "0.8");
                hashMap.put(h9.KEY_POP_CONFIG, jSONObject);
                abilityHubAdapter.z("stdPop", StdPopAbility.API_H5, new xq(), hashMap, new a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements TBPublicMenu.TBOnMenuShowedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(MainSearchResultActivity mainSearchResultActivity) {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuShowedListener
        public void onMenuShowed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91fdc161", new Object[]{this});
            } else {
                sen.j("Page_SearchItemList_quanjudaohang_exposure");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MainSearchResultActivity.O4(MainSearchResultActivity.this) != null && MainSearchResultActivity.O4(MainSearchResultActivity.this).m()) {
                MainSearchResultActivity.O4(MainSearchResultActivity.this).y("timeout", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MainSearchResultActivity.O4(MainSearchResultActivity.this) != null) {
                MainSearchResultActivity.O4(MainSearchResultActivity.this).x("timeout", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements g92.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.g92.d
        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1ec4f6b9", new Object[]{this});
            }
            return MainSearchResultActivity.P4(MainSearchResultActivity.this);
        }
    }

    static {
        t2o.a(815793351);
        t2o.a(976224261);
        t2o.a(927989801);
        t2o.a(815793348);
        t2o.a(815792816);
    }

    public static /* synthetic */ void L4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31568435", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.U4();
        }
    }

    public static /* synthetic */ void M4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7202d4", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.T4();
        }
    }

    public static /* synthetic */ void N4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658d8173", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.e5();
        }
    }

    public static /* synthetic */ okn O4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okn) ipChange.ipc$dispatch("2220f6bd", new Object[]{mainSearchResultActivity});
        }
        return mainSearchResultActivity.N;
    }

    public static /* synthetic */ View P4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e82d2cb3", new Object[]{mainSearchResultActivity});
        }
        mainSearchResultActivity.getClass();
        return null;
    }

    public static /* synthetic */ ljw Q4(MainSearchResultActivity mainSearchResultActivity, ljw ljwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ljw) ipChange.ipc$dispatch("8e617e48", new Object[]{mainSearchResultActivity, ljwVar});
        }
        mainSearchResultActivity.W = ljwVar;
        return ljwVar;
    }

    public static /* synthetic */ void R4(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdfb7bef", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.c5();
        }
    }

    public static /* synthetic */ Object ipc$super(MainSearchResultActivity mainSearchResultActivity, String str, Object... objArr) {
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
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 847445267:
                super.c4();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1751389804:
                super.s4();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/MainSearchResultActivity");
        }
    }

    @Override // tb.gnh
    public M3WfContainer A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3WfContainer) ipChange.ipc$dispatch("3791325e", new Object[]{this});
        }
        return ((SFPreloadImpl) this.E).p();
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void E4() {
        CommonBaseDatasource commonBaseDatasource;
        okn u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d31a2", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null && (u = (commonBaseDatasource = (CommonBaseDatasource) ((acx) bshVar.getModel()).a()).u()) != null) {
            this.N = u;
            f5(commonBaseDatasource, u);
            g5(commonBaseDatasource, u);
        }
    }

    @Override // tb.gnh
    public boolean O(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db7cdd9b", new Object[]{this, str, str2})).booleanValue();
        }
        return ((SFPreloadImpl) this.E).q(str, str2);
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public JSONArray R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7265ff99", new Object[]{this});
        }
        return this.P;
    }

    @Override // tb.gnh
    public void T2(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da36c6f", new Object[]{this, str, str2, fwVar});
        } else {
            ((SFPreloadImpl) this.E).x(str, str2, fwVar);
        }
    }

    public final void T4() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6378cbc3", new Object[]{this});
            return;
        }
        f1p.d();
        W4();
        CommonSearchContext commonSearchContext = this.e;
        if (commonSearchContext != null) {
            if (this.r) {
                str = "PageRebuild";
            } else {
                str = "Default";
            }
            TLogTracker.l(str, commonSearchContext.getParamsSnapshot());
            runOnUiThread(new d());
            if (this.z != null) {
                le1.c();
            }
        }
    }

    @Override // tb.pq
    public y91 U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y91) ipChange.ipc$dispatch("cabd2823", new Object[]{this});
        }
        return new y91.b().b(this.V).c(this.V).f(false).d(81).e(28).a();
    }

    public final void U4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc58df7c", new Object[]{this});
            return;
        }
        TLogTracker.s(q1p.PAGE_NAME_MAIN);
        this.T = aoo.b();
        TLogTracker.t(o4p.i2());
        V4(getIntent());
        b5();
    }

    public final void V4(Intent intent) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413177a", new Object[]{this, intent});
        } else if (intent != null && (data = intent.getData()) != null && "audioAssistance".equals(data.getQueryParameter("from"))) {
            if (cvr.INSTANCE.f()) {
                str = h1p.b.TYPE_ELDER_NEW_VOICE;
            } else {
                str = h1p.b.TYPE_INVERT_ELDER_NEW_VOICE;
            }
            intent.putExtra("from", str);
        }
    }

    public final void W4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc00a10a", new Object[]{this});
        } else {
            X4();
        }
    }

    public final void X4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f788ec", new Object[]{this});
            return;
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            o02 a2 = ((acx) bshVar.getModel()).a();
            if (a2 instanceof CommonBaseDatasource) {
                String s = ((CommonBaseDatasource) a2).s("channelSrp");
                for (String str : o4p.C()) {
                    if (s.equals(str)) {
                        this.S = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public boolean Y3(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c10b3c", new Object[]{this, new Integer(i2), new Integer(i3), intent})).booleanValue();
        }
        if (i2 != 2001) {
            return false;
        }
        mf0.i(i2, i3, intent);
        return true;
    }

    public final ShareContent Y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("dddeb698", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = this.R.getString("businessId");
        shareContent.title = this.R.getString("title");
        String string = this.R.getString("image");
        shareContent.imageUrl = string;
        if (TextUtils.isEmpty(string)) {
            shareContent.imageUrl = s0p.SHARE_IMAGE_URL;
        }
        String string2 = this.R.getString("description");
        shareContent.description = string2;
        if (string2 == null) {
            shareContent.description = Localization.q(R.string.taobao_app_1005_1_16689);
        }
        shareContent.url = this.R.getString("url");
        return shareContent;
    }

    /* renamed from: Z4 */
    public ShareContent getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("50d43d90", new Object[]{this});
        }
        if (!this.S) {
            return null;
        }
        if (this.R == null) {
            return s0p.G2(X3());
        }
        return Y4();
    }

    public long a5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.O;
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

    public final void b5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62dd90b", new Object[]{this});
            return;
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString(MUSXSearchEventModule.KEY_CARRIED_DATA);
                if (!TextUtils.isEmpty(string)) {
                    this.P = n93.c().b(string);
                    extras.remove(MUSXSearchEventModule.KEY_CARRIED_DATA);
                    n93.c().a();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.gnh
    public void c0(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3de3522", new Object[]{this, str, str2, fwVar});
        } else {
            ((SFPreloadImpl) this.E).y(str, str2, fwVar);
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3282fd13", new Object[]{this});
            return;
        }
        super.c4();
        if (V3() != null) {
            this.g.q(DetailPreRequestUtil.PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE, DetailPreRequestUtil.e().d(false));
        }
    }

    public final void c5() {
        o02 o02Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d769d7", new Object[]{this});
        } else if (this.W != null && this.V) {
            ua8 ua8Var = ua8.INSTANCE;
            String str = "";
            if (ua8Var.c(Boolean.valueOf(this.Q), X3().getParam("from", str))) {
                bsh bshVar = this.d;
                if (bshVar != null) {
                    o02Var = ((acx) bshVar.getModel()).a();
                } else {
                    o02Var = null;
                }
                if (o02Var instanceof CommonBaseDatasource) {
                    str = ((CommonBaseDatasource) o02Var).s("channelSrp");
                }
                if (ua8Var.b(str)) {
                    this.W.show();
                    return;
                }
            }
            this.W.hide();
        }
    }

    @Override // tb.okd
    public void d2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4b6f0d", new Object[]{this, jSONObject});
        } else {
            this.R = jSONObject;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d5() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.sf.MainSearchResultActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "6753a805"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            tb.bsh r0 = r4.d
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x001d
            goto L_0x002f
        L_0x001d:
            tb.bsh r0 = r4.d
            android.view.View r0 = r0.getView()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.taobao.search.sf.MainSearchResultActivity$e r2 = new com.taobao.search.sf.MainSearchResultActivity$e
            r2.<init>(r0)
            r1.addOnGlobalLayoutListener(r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.MainSearchResultActivity.d5():void");
    }

    public final void e5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6bc1d3", new Object[]{this});
        } else if (o4p.p1()) {
            y3u y3uVar = new y3u((ViewGroup) findViewById(R.id.fl_top_header), this);
            this.U = y3uVar;
            y3uVar.g();
        }
    }

    public final void f5(CommonBaseDatasource commonBaseDatasource, okn oknVar) {
        FrameLayout frameLayout;
        h hVar;
        bsh bshVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecf991e", new Object[]{this, commonBaseDatasource, oknVar});
        } else if (oknVar != null && oknVar.m()) {
            String g2 = oknVar.g();
            if (!TextUtils.isEmpty(g2)) {
                HashMap hashMap = new HashMap();
                String s = commonBaseDatasource.s("channelSrp");
                if (!TextUtils.isEmpty(s)) {
                    hashMap.put("channelSrp", s);
                }
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                    hashMap.put("sessionId", commonSearchResult.sessionId);
                }
                String tab = commonBaseDatasource.getTab();
                if (!TextUtils.isEmpty(tab)) {
                    hashMap.put("tab", tab);
                }
                this.N.k(hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("itemId", g2);
                try {
                    try {
                        gtf.i().o("Page_SearchList", "dynamic_card_scene", hashMap2, new h48(oknVar));
                        bshVar = this.d;
                    } catch (Exception e2) {
                        b4p.b("MainSearchResultPage", e2.getMessage());
                        ArrayMap arrayMap = new ArrayMap();
                        arrayMap.put("message", e2.getMessage());
                        arrayMap.put(pg1.ATOM_stack, Log.getStackTraceString(e2));
                        sen.f("jarvisTriggerAction", arrayMap);
                        bsh bshVar2 = this.d;
                        if (bshVar2 != null && bshVar2.getView() != 0) {
                            frameLayout = (FrameLayout) this.d.getView();
                            hVar = new h();
                        } else {
                            return;
                        }
                    }
                    if (bshVar != null && bshVar.getView() != 0) {
                        frameLayout = (FrameLayout) this.d.getView();
                        hVar = new h();
                        frameLayout.postDelayed(hVar, o4p.x());
                    }
                } catch (Throwable th) {
                    bsh bshVar3 = this.d;
                    if (!(bshVar3 == null || bshVar3.getView() == 0)) {
                        ((FrameLayout) this.d.getView()).postDelayed(new h(), o4p.x());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        String str = this.T;
        if (str != null) {
            aoo.c(str);
        }
    }

    public final void g5(CommonBaseDatasource commonBaseDatasource, okn oknVar) {
        FrameLayout frameLayout;
        i iVar;
        bsh bshVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30722dc6", new Object[]{this, commonBaseDatasource, oknVar});
        } else if (o4p.x0() && oknVar != null && oknVar.l()) {
            HashMap hashMap = new HashMap();
            String s = commonBaseDatasource.s("channelSrp");
            if (!TextUtils.isEmpty(s)) {
                hashMap.put("channelSrp", s);
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                hashMap.put("sessionId", commonSearchResult.sessionId);
            }
            String tab = commonBaseDatasource.getTab();
            if (!TextUtils.isEmpty(tab)) {
                hashMap.put("tab", tab);
            }
            this.N.i(hashMap);
            if (!o4p.y0() || !this.N.n()) {
                this.N.w();
                return;
            }
            JSONObject h2 = this.N.h();
            if (h2 == null || h2.isEmpty()) {
                this.N.w();
                return;
            }
            String string = h2.getString("jarvisPage");
            String string2 = h2.getString("jarvisEvent");
            if (!TextUtils.isEmpty(string)) {
                try {
                    if (!TextUtils.isEmpty(string2)) {
                        try {
                            gtf.i().o(string, string2, h19.a(h2), new y54(oknVar));
                            bshVar = this.d;
                        } catch (Exception e2) {
                            b4p.b("MainSearchResultPage", e2.getMessage());
                            ArrayMap arrayMap = new ArrayMap();
                            arrayMap.put("message", e2.getMessage());
                            arrayMap.put(pg1.ATOM_stack, Log.getStackTraceString(e2));
                            sen.f("jarvisTriggerAction", arrayMap);
                            bsh bshVar2 = this.d;
                            if (bshVar2 != null && bshVar2.getView() != 0) {
                                frameLayout = (FrameLayout) this.d.getView();
                                iVar = new i();
                            } else {
                                return;
                            }
                        }
                        if (bshVar != null && bshVar.getView() != 0) {
                            frameLayout = (FrameLayout) this.d.getView();
                            iVar = new i();
                            frameLayout.postDelayed(iVar, o4p.x());
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    bsh bshVar3 = this.d;
                    if (!(bshVar3 == null || bshVar3.getView() == 0)) {
                        ((FrameLayout) this.d.getView()).postDelayed(new i(), o4p.x());
                    }
                    throw th;
                }
            }
            this.N.w();
        }
    }

    @Override // tb.gnh
    public void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cea363", new Object[]{this});
        } else {
            ((SFPreloadImpl) this.E).l();
        }
    }

    @Override // tb.gnh
    public M3ListContainer o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3ListContainer) ipChange.ipc$dispatch("1a8c82be", new Object[]{this});
        }
        return ((SFPreloadImpl) this.E).o();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (h4()) {
            this.z = le1.b();
            le1.e();
        }
        this.O = System.currentTimeMillis();
        if (!o4p.P0() && A4()) {
            setTheme(R.style.Theme_SearchResultActivity);
        }
        Handler handler = this.z;
        if (handler != null) {
            handler.post(new b());
        } else {
            U4();
        }
        ScreenType.b(this);
        super.onCreate(bundle);
        Handler handler2 = this.z;
        if (handler2 != null) {
            handler2.post(new c());
        } else {
            T4();
        }
        if (bundle == null) {
            hvr.INSTANCE.a(getIntent(), hvr.SOURCE_HOME_TO_SRP);
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        bsh bshVar = this.d;
        if (bshVar != null) {
            bshVar.postEvent(m0p.a(menu));
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        S4();
        return onCreateOptionsMenu;
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TLogTracker.o();
        this.L.b();
        y3u y3uVar = this.U;
        if (y3uVar != null) {
            y3uVar.f();
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        V4(intent);
        super.onNewIntent(intent);
        c5();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s(q1p.PAGE_NAME_MAIN);
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        bsh bshVar = this.d;
        if (bshVar != null) {
            bundle.putString(aoo.EXTRA_REBUILD_PAGE, ((jrh) ((acx) bshVar.getModel()).d().e()).p());
            bundle.putString(aoo.EXTRA_REBUILD_TAB, ((jrh) ((acx) this.d.getModel()).d().e()).getTab());
            if (this.X) {
                bundle.putString(aoo.EXTRA_REBUILD_TOKEN, this.T);
                bol a2 = bol.a(X3(), (g1i) ((acx) this.d.getModel()).b(), (g1i) ((acx) this.d.getModel()).a(), this.k, true);
                CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) ((acx) this.d.getModel()).b()).getTotalSearchResult();
                if (commonSearchResult == null || !commonSearchResult.newSearch) {
                    aoo.d(this.T, a2);
                }
            }
        }
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        } else {
            b4p.b("MainSearchResultPage", "AFC: onSetActivityTheme");
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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

    @Override // tb.pq
    public g92 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g92) ipChange.ipc$dispatch("eff749cf", new Object[]{this});
        }
        return new g92.b().b(new a()).c(new j()).a();
    }

    @Override // tb.gnh
    public void recycleContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66195dfd", new Object[]{this, view});
        } else {
            ((SFPreloadImpl) this.E).A(view);
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void s4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6864166c", new Object[]{this});
            return;
        }
        if (!this.r) {
            ((SFPreloadImpl) this.E).v(this.d);
        }
        super.s4();
        d5();
    }

    @Override // tb.gnh
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c2de6", new Object[]{this});
        } else {
            ((SFPreloadImpl) this.E).k();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11689a;
        public final /* synthetic */ View b;

        public e(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            int width = this.b.getWidth();
            int height = this.b.getHeight();
            if (width != 0 && height != 0) {
                Rect rect = new Rect();
                this.b.getWindowVisibleDisplayFrame(rect);
                int height2 = rect.height() + SystemBarDecorator.getStatusBarHeight(MainSearchResultActivity.this.getActivity());
                if (height2 < height && !this.f11689a) {
                    this.f11689a = true;
                    int i = height - height2;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (Object) Integer.valueOf(o1p.e(rect.left)));
                    jSONObject.put("y", (Object) Integer.valueOf(o1p.e(rect.bottom)));
                    jSONObject.put("width", (Object) Integer.valueOf(o1p.e(rect.width())));
                    jSONObject.put("height", (Object) Integer.valueOf(o1p.e(i)));
                    wnl.INSTANCE.b(MainSearchResultActivity.this, "keyboard", "rect", jSONObject);
                    c4p.m("SrpKeyboard", "keyboard show, visible height:" + height2 + ", keyboard height:" + i);
                } else if (height2 >= height && this.f11689a) {
                    this.f11689a = false;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) Integer.valueOf(o1p.e(rect.left)));
                    jSONObject2.put("y", (Object) Integer.valueOf(o1p.e(rect.bottom)));
                    jSONObject2.put("width", (Object) Integer.valueOf(o1p.e(rect.width())));
                    jSONObject2.put("height", (Object) 0);
                    wnl.INSTANCE.b(MainSearchResultActivity.this, "keyboard", "rect", jSONObject2);
                    c4p.m("SrpKeyboard", "keyboard hide");
                }
            }
        }
    }

    public final void S4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2fd7f8", new Object[]{this});
            return;
        }
        TBPublicMenu publicMenu = getPublicMenu();
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setTitle("똊:添加到桌面").setUTControlName("quanjudaohang_widget_click").setOrder(1).setNeedLogin(false).setMenuNeedtoBeClosedAfterItemClicked(true).setName(Localization.q(R.string.taobao_app_1005_1_16688)).setId(R.id.tbsearch_add_widget).build();
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        arrayList.add(build);
        publicMenu.addExternalMenus(arrayList, new f());
        publicMenu.setOnMenuShowedListener(new g(this));
    }
}
