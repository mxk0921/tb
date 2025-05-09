package com.taobao.search.sf;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.aod;
import tb.h6p;
import tb.hgw;
import tb.o4p;
import tb.olo;
import tb.oxb;
import tb.q1p;
import tb.r4p;
import tb.rse;
import tb.sse;
import tb.t2o;
import tb.uo6;
import tb.xnp;
import tb.zo6;
import tb.zpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InshopResultActivity extends CustomBaseActivity implements xnp, aod, oxb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_ITEM_SPM = "a2141.7631671.0.0";
    public static final String CATEGORY_PAGE_SPM = "a2141.7631684.0.0";
    public static final String SEARCH_PAGE_SPM = "a2141.11319901.0.0";
    public static final String SPM = "spm";
    public static final String SPM_CNT = "spm-cnt";

    /* renamed from: a  reason: collision with root package name */
    public zpd f11687a;
    public CommonSearchContext b;
    public String c;
    public final Map<String, String> d = new HashMap();
    public final uo6 e = new uo6();

    static {
        t2o.a(815793350);
        t2o.a(815792533);
        t2o.a(993001695);
        t2o.a(993002135);
    }

    public static /* synthetic */ Object ipc$super(InshopResultActivity inshopResultActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/InshopResultActivity");
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

    @Override // tb.oxb
    public boolean E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        return this.e.l();
    }

    @Override // tb.oxb
    public void P(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb2319b", new Object[]{this, zo6Var});
        } else {
            this.e.r(zo6Var);
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

    @Override // tb.oxb
    public void j0(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312b88b4", new Object[]{this, zo6Var});
        } else {
            this.e.t(zo6Var);
        }
    }

    public final Map<String, Object> l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9bbe2b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", this.b.getKeyword());
        return hashMap;
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
        ((olo) this.f11687a).onDestroy();
    }

    @Override // tb.xnp
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        } else if (map != null) {
            ((HashMap) this.d).clear();
            ((HashMap) this.d).putAll(map);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, this.d);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ((olo) this.f11687a).onPause();
        h6p.i(this.c, null, l3(), this);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s(q1p.PAGE_NAME_INSHOP);
        super.onResume();
        ((olo) this.f11687a).onResume();
        HashMap hashMap = new HashMap(this.d);
        if ("category".equals(this.b.getParam("from", ""))) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Category_List");
            setUTPageName("Page_Shop_Category_List");
            hashMap.put("spm-cnt", CATEGORY_PAGE_SPM);
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search_List");
            setUTPageName("Page_Shop_Search_List");
            hashMap.put("spm-cnt", SEARCH_PAGE_SPM);
        }
        h6p.h(this.c, null, l3(), this);
        hashMap.put(r4p.KEY_MINI_APP, this.b.getParam(r4p.KEY_MINI_APP));
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    @Override // tb.xnp
    public void onSearchRenderEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TLogTracker.s(q1p.PAGE_NAME_INSHOP);
        SearchSdk.init();
        setTheme(R.style.Theme_SearchAnimation);
        ScreenType.b(this);
        this.e.q(this, true);
        super.onCreate(bundle);
        setContentView(R.layout.plugin_test_layout);
        TLogTracker.t(o4p.i2());
        sse.INSTANCE.b(getIntent());
        CommonSearchContext fromMap = CommonSearchContext.fromMap(rse.b(getIntent()));
        this.b = fromMap;
        fromMap.setParam(r4p.KEY_IS_WEEX_SHOP, "true");
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.d);
        if ("category".equals(this.b.getParam("from", ""))) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Category_List");
            this.c = "Page_Shop_Category_List";
            setUTPageName("Page_Shop_Category_List");
            hashMap.put("spm-cnt", CATEGORY_PAGE_SPM);
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search_List");
            this.c = "Page_Shop_Search_List";
            setUTPageName("Page_Shop_Search_List");
            hashMap.put("spm-cnt", SEARCH_PAGE_SPM);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        olo oloVar = new olo(true);
        this.f11687a = oloVar;
        oloVar.K(this);
        ((olo) this.f11687a).B(this, this.b);
        ((olo) this.f11687a).z();
        ((LinearLayout) findViewById(R.id.list_container)).addView(((olo) this.f11687a).getView());
        ((olo) this.f11687a).k();
        TLogTracker.m(this.b.getParamsSnapshot());
        this.e.i(((olo) this.f11687a).getView(), 0);
    }
}
