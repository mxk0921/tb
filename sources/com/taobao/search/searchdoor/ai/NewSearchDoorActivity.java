package com.taobao.search.searchdoor.ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.SearchDoorAdapter;
import com.taobao.search.searchdoor.SearchDoorFragment;
import com.taobao.search.searchdoor.ai.NewSearchDoorActivity;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.RpxConfigVM;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.ckf;
import tb.h9o;
import tb.o4p;
import tb.oxb;
import tb.sen;
import tb.t2o;
import tb.und;
import tb.wqs;
import tb.xho;
import tb.yko;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class NewSearchDoorActivity implements und, zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorActivity f11639a;
    public SearchDoorAdapter d;
    public ViewPager e;
    public AITabIndicator f;
    public TUrlImageView g;
    public final SearchDoorFragment b = new SearchDoorFragment();
    public final AISearchDoorFragment c = new AISearchDoorFragment();
    public final ArrayList<wqs> h = new ArrayList<>(2);

    static {
        t2o.a(815793059);
        t2o.a(815792935);
        t2o.a(993002134);
    }

    public NewSearchDoorActivity(SearchDoorActivity searchDoorActivity) {
        ckf.g(searchDoorActivity, "activity");
        this.f11639a = searchDoorActivity;
    }

    public static final /* synthetic */ AISearchDoorFragment c(NewSearchDoorActivity newSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AISearchDoorFragment) ipChange.ipc$dispatch("6a523c18", new Object[]{newSearchDoorActivity});
        }
        return newSearchDoorActivity.c;
    }

    public static final /* synthetic */ AITabIndicator e(NewSearchDoorActivity newSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AITabIndicator) ipChange.ipc$dispatch("e9961e6e", new Object[]{newSearchDoorActivity});
        }
        return newSearchDoorActivity.f;
    }

    public static final /* synthetic */ SearchDoorFragment f(NewSearchDoorActivity newSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorFragment) ipChange.ipc$dispatch("e4b7a87d", new Object[]{newSearchDoorActivity});
        }
        return newSearchDoorActivity.b;
    }

    public static final /* synthetic */ void h(NewSearchDoorActivity newSearchDoorActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4c71ba", new Object[]{newSearchDoorActivity, new Integer(i)});
        } else {
            newSearchDoorActivity.q(i);
        }
    }

    public static final void v(NewSearchDoorActivity newSearchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76741916", new Object[]{newSearchDoorActivity, view});
            return;
        }
        ckf.g(newSearchDoorActivity, "this$0");
        newSearchDoorActivity.f11639a.finish();
    }

    @Override // tb.und
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fa639a", new Object[]{this});
        } else {
            this.b.D2().y();
        }
    }

    @Override // tb.und
    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbaff8b5", new Object[]{this});
        }
        return "";
    }

    @Override // tb.und
    public SearchDoorViewPool d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorViewPool) ipChange.ipc$dispatch("567c0283", new Object[]{this});
        }
        return this.b.D2().w();
    }

    @Override // tb.und
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.onDestroy();
        this.b.onDestroy();
    }

    @Override // tb.und
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.b.D2().q();
        }
    }

    @Override // tb.und
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        yko u = this.b.D2().u();
        ckf.f(u, "getCore(...)");
        return u;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e015c242", new Object[]{this});
        } else {
            sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button_AiTab-ClkRefresh", 2101, null);
        }
    }

    public final void j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c13eef", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            if (!this.f11639a.E1()) {
                str = "https://gw.alicdn.com/imgextra/i3/O1CN01p6tMBc1DuSLl46Vnu_!!6000000000276-2-tps-96-96.png";
            } else {
                str = "https://gw.alicdn.com/imgextra/i3/O1CN01v1lkm31Kogfk0vbdX_!!6000000001211-2-tps-96-96.png";
            }
            tUrlImageView.setImageUrl(str);
            AITabIndicator aITabIndicator = this.f;
            if (aITabIndicator != null) {
                aITabIndicator.refresh(false);
                if (this.f11639a.E1()) {
                    this.f11639a.findViewById(R.id.root_view).setBackgroundColor(h9o.a(R.color.tbsearch_main_card_bg_night));
                    return;
                }
                return;
            }
            ckf.y("aiTabIndicator");
            throw null;
        }
        ckf.y("btnBack");
        throw null;
    }

    @Override // tb.und
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb438c9", new Object[]{this});
        } else {
            this.b.D2().E();
        }
    }

    @Override // tb.und
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94810df4", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.und
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("370526eb", new Object[]{this})).booleanValue();
        }
        return this.b.D2().A();
    }

    public final JSONObject o(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("152f5673", new Object[]{this, jSONArray, new Integer(i)});
        }
        if (jSONArray != null && i < jSONArray.size()) {
            return jSONArray.getJSONObject(i);
        }
        return null;
    }

    @Override // tb.und
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.b.D2().J(i, i2, intent);
        }
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        j();
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            p(viewPager.getCurrentItem());
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    @Override // tb.und
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.b.D2().N(intent);
    }

    @Override // tb.und
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b.B2(z);
        this.c.B2(z);
    }

    public final void p(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178120e2", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.h.size();
        for (int i3 = 0; i3 < size; i3++) {
            wqs wqsVar = this.h.get(i3);
            ckf.f(wqsVar, "get(...)");
            TextView b = wqsVar.b();
            if (i == i3) {
                if (!this.f11639a.E1()) {
                    i2 = R.color.tbsearch_ai_tab_text_color;
                } else {
                    i2 = R.color.tbsearch_ai_tab_text_color_night;
                }
            } else if (!this.f11639a.E1()) {
                i2 = R.color.tbsearch_ai_tab_text_color_nor_selected;
            } else {
                i2 = R.color.tbsearch_ai_tab_text_color_nor_selected_night;
            }
            b.setTextColor(ResourcesCompat.getColor(this.f11639a.getResources(), i2, null));
        }
    }

    @Override // tb.und
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.c.onPause();
        this.b.onPause();
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88931c8e", new Object[]{this, new Integer(i)});
            return;
        }
        p(i);
        if (i == 0) {
            this.b.A2(true);
            this.c.A2(false);
            return;
        }
        AISearchDoorFragment aISearchDoorFragment = this.c;
        SearchDoorContext v = this.b.D2().v();
        ckf.f(v, "getSearchContext(...)");
        aISearchDoorFragment.M2(v);
        this.b.A2(false);
        this.c.A2(true);
        i();
    }

    @Override // tb.und
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.c.onResume();
        this.b.onResume();
    }

    @Override // tb.und
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    @Override // tb.und
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        }
    }

    @Override // tb.und
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            RpxConfigVM.Companion.l(this.f11639a);
        }
    }

    @Override // tb.und
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a998ec13", new Object[]{this});
        } else {
            this.b.D2().V();
        }
    }

    @Override // tb.und
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("695dabf9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.und
    public void z(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a786b48e", new Object[]{this, bundle});
            return;
        }
        if (bundle != null) {
            bundle.clear();
        }
        this.b.K2(this.f11639a);
        this.c.K2(this.f11639a);
        this.b.J2();
    }

    public static final void t(NewSearchDoorActivity newSearchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727a9835", new Object[]{newSearchDoorActivity, view});
            return;
        }
        ckf.g(newSearchDoorActivity, "this$0");
        ViewPager viewPager = newSearchDoorActivity.e;
        if (viewPager == null) {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        } else if (viewPager.getCurrentItem() != 1) {
            ViewPager viewPager2 = newSearchDoorActivity.e;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(1, true);
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
    }

    public static final void u(NewSearchDoorActivity newSearchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a37a76", new Object[]{newSearchDoorActivity, view});
            return;
        }
        ckf.g(newSearchDoorActivity, "this$0");
        ViewPager viewPager = newSearchDoorActivity.e;
        if (viewPager == null) {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        } else if (viewPager.getCurrentItem() != 1) {
            ViewPager viewPager2 = newSearchDoorActivity.e;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(1, true);
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
    }

    @Override // tb.und
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a27443", new Object[]{this});
            return;
        }
        this.f11639a.setContentView(R.layout.activity_ai_search_door);
        SearchDoorActivity searchDoorActivity = this.f11639a;
        if (!(searchDoorActivity instanceof oxb)) {
            searchDoorActivity = null;
        }
        if (searchDoorActivity != null) {
            searchDoorActivity.P(this);
        }
        SearchDoorAdapter searchDoorAdapter = new SearchDoorAdapter(this.f11639a);
        this.d = searchDoorAdapter;
        searchDoorAdapter.a(this.b);
        SearchDoorAdapter searchDoorAdapter2 = this.d;
        if (searchDoorAdapter2 != null) {
            searchDoorAdapter2.a(this.c);
            this.b.E2();
            ViewGroup.LayoutParams layoutParams = this.f11639a.findViewById(R.id.ll_tab).getLayoutParams();
            ckf.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = SystemBarDecorator.getStatusBarHeight(this.f11639a);
            TUrlImageView tUrlImageView = (TUrlImageView) this.f11639a.findViewById(R.id.btn_back);
            this.g = tUrlImageView;
            if (tUrlImageView != null) {
                xho.c(tUrlImageView);
                tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: tb.qiz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewSearchDoorActivity.v(NewSearchDoorActivity.this, view);
                    }
                });
                ViewPager viewPager = (ViewPager) this.f11639a.findViewById(R.id.vp_content);
                this.e = viewPager;
                if (viewPager != null) {
                    SearchDoorAdapter searchDoorAdapter3 = this.d;
                    if (searchDoorAdapter3 != null) {
                        viewPager.setAdapter(searchDoorAdapter3);
                        this.b.s2();
                        ArrayList<wqs> arrayList = this.h;
                        View findViewById = this.f11639a.findViewById(R.id.tv_tab1);
                        ckf.f(findViewById, "findViewById(...)");
                        arrayList.add(new wqs((TextView) findViewById, null));
                        ArrayList<wqs> arrayList2 = this.h;
                        View findViewById2 = this.f11639a.findViewById(R.id.tv_tab2);
                        ckf.f(findViewById2, "findViewById(...)");
                        arrayList2.add(new wqs((TextView) findViewById2, (TUrlImageView) this.f11639a.findViewById(R.id.iv_tab)));
                        m();
                        AITabIndicator aITabIndicator = (AITabIndicator) this.f11639a.findViewById(R.id.ai_tab_indicator);
                        this.f = aITabIndicator;
                        if (aITabIndicator != null) {
                            aITabIndicator.attachToTabs(this.h);
                            q(0);
                            j();
                            ViewPager viewPager2 = this.e;
                            if (viewPager2 != null) {
                                viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.search.searchdoor.ai.NewSearchDoorActivity$postCreate$3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                    public void onPageScrollStateChanged(int i) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                                        }
                                    }

                                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                    public void onPageScrolled(int i, float f, int i2) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                                            return;
                                        }
                                        AITabIndicator e = NewSearchDoorActivity.e(NewSearchDoorActivity.this);
                                        if (e != null) {
                                            e.updatePos(i, f);
                                            SearchDoorContext v = NewSearchDoorActivity.f(NewSearchDoorActivity.this).D2().v();
                                            if (v != null) {
                                                NewSearchDoorActivity.c(NewSearchDoorActivity.this).M2(v);
                                            }
                                            if (i == 0 && f > 0.0f) {
                                                NewSearchDoorActivity.c(NewSearchDoorActivity.this).J2();
                                                return;
                                            }
                                            return;
                                        }
                                        ckf.y("aiTabIndicator");
                                        throw null;
                                    }

                                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                    public void onPageSelected(int i) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                                        } else {
                                            NewSearchDoorActivity.h(NewSearchDoorActivity.this, i);
                                        }
                                    }
                                });
                                sen.m(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Button_AiTab-QueryExposure", 2201, null);
                                return;
                            }
                            ckf.y(OrderConfigs.VIEWPAGER);
                            throw null;
                        }
                        ckf.y("aiTabIndicator");
                        throw null;
                    }
                    ckf.y("adapter");
                    throw null;
                }
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
            ckf.y("btnBack");
            throw null;
        }
        ckf.y("adapter");
        throw null;
    }

    public static final void s(NewSearchDoorActivity newSearchDoorActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b51b5f4", new Object[]{newSearchDoorActivity, view});
            return;
        }
        ckf.g(newSearchDoorActivity, "this$0");
        ViewPager viewPager = newSearchDoorActivity.e;
        if (viewPager != null) {
            viewPager.setCurrentItem(0, true);
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    public final void m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d33efa8", new Object[]{this});
            return;
        }
        JSONObject h = o4p.h();
        JSONArray jSONArray = h != null ? h.getJSONArray("tabs") : null;
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            wqs wqsVar = this.h.get(i);
            ckf.f(wqsVar, "get(...)");
            wqs wqsVar2 = wqsVar;
            TextView b = wqsVar2.b();
            TUrlImageView a2 = wqsVar2.a();
            xho.a(b);
            if (i == 0) {
                JSONObject o = o(jSONArray, 0);
                if (o == null || (str = o.getString("text")) == null) {
                    str = this.f11639a.getString(R.string.tbsearch_ai_tab_one);
                }
                b.setText(str);
                b.setOnClickListener(new View.OnClickListener() { // from class: tb.riz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewSearchDoorActivity.s(NewSearchDoorActivity.this, view);
                    }
                });
            } else if (i != 1) {
                continue;
            } else {
                ckf.d(a2);
                a2.setVisibility(8);
                b.setOnClickListener(new View.OnClickListener() { // from class: tb.siz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewSearchDoorActivity.t(NewSearchDoorActivity.this, view);
                    }
                });
                a2.setOnClickListener(new View.OnClickListener() { // from class: tb.tiz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewSearchDoorActivity.u(NewSearchDoorActivity.this, view);
                    }
                });
                JSONObject o2 = o(jSONArray, 1);
                if (o2 != null) {
                    b.setText(o2.getString("text"));
                    JSONArray jSONArray2 = o2.getJSONArray("badges");
                    if (jSONArray2 != null) {
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                            long longValue = jSONObject.getLongValue("startTime");
                            long longValue2 = jSONObject.getLongValue("endTime");
                            long currentTimeMillis = System.currentTimeMillis();
                            if (longValue <= currentTimeMillis && currentTimeMillis <= longValue2) {
                                a2.setVisibility(0);
                                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                                RpxConfigVM.a aVar = RpxConfigVM.Companion;
                                layoutParams.width = aVar.h(this.f11639a, jSONObject.getIntValue("width") / 2);
                                a2.getLayoutParams().height = aVar.h(this.f11639a, jSONObject.getIntValue("height") / 2);
                                a2.setImageUrl(jSONObject.getString("url"));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                b.setText(R.string.tbsearch_ai_tab_two);
            }
        }
    }
}
