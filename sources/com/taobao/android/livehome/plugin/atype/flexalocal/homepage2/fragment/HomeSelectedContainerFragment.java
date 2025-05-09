package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotWordResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotwordResponseData;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveHomeViewPager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TextBannerView;
import com.taobao.android.nav.Nav;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b0e;
import tb.b0h;
import tb.cdc;
import tb.gt9;
import tb.ixf;
import tb.j5h;
import tb.lrq;
import tb.m1e;
import tb.m1h;
import tb.mbu;
import tb.nlc;
import tb.nvs;
import tb.o3s;
import tb.p0;
import tb.p9m;
import tb.pg1;
import tb.qw0;
import tb.qws;
import tb.qyg;
import tb.r0h;
import tb.r90;
import tb.sj7;
import tb.t2o;
import tb.vu3;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeSelectedContainerFragment extends HomeMainBaseFragment implements XTabLayout.e, XTabLayout.d, nlc, m1e, cdc, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String U = HomeSelectedContainerFragment.class.getSimpleName();
    public static final Map<String, String> V = new HashMap<String, String>(3) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.7
        {
            put("jingxuan", mbu.PAGE_SELECTED);
            put("followTab", mbu.PAGE_FOLLOW);
            put("singleLiveTab", mbu.PAGE_SINGLELIVE);
        }
    };
    public static final Map<String, String> W = new HashMap<String, String>(3) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.8
        {
            put("jingxuan", mbu.SPM_SELECTED);
            put("followTab", mbu.SPM_FOLLOW);
            put("singleLiveTab", mbu.SPM_SINGLELIVE);
        }
    };
    public View A;
    public TextView B;
    public TextBannerView C;
    public TextView D;
    public XTabLayout E;
    public SelectedViewPagerAdapter F;
    public com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a G;
    public TabManager.TabBottom H;
    public String I;
    public String J;
    public List<TabManager.TabUp> K;
    public TaoLiveHotwordResponseData L;
    public boolean M;
    public LinearLayout N;
    public Handler O;
    public Fragment P;
    public boolean R;
    public boolean S;
    public String t;
    public String u;
    public String v;
    public View x;
    public LiveHomeViewPager y;
    public ViewGroup z;
    public String w = "jingxuan";
    public final int Q = 200;
    public final b0e T = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SelectedViewPagerAdapter extends FragmentStatePagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<TabManager.TabUp> f8816a = new ArrayList();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public int f;
        public String g;
        public String h;
        public final b0h i;

        static {
            t2o.a(310378668);
        }

        public SelectedViewPagerAdapter(Context context, FragmentManager fragmentManager, List<TabManager.TabUp> list, String str, String str2, String str3, String str4, b0h b0hVar) {
            super(fragmentManager);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.i = b0hVar;
            m(list);
        }

        public static /* synthetic */ Object ipc$super(SelectedViewPagerAdapter selectedViewPagerAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeSelectedContainerFragment$SelectedViewPagerAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return ((ArrayList) this.f8816a).size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        public String h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("85ca5f2b", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= ((ArrayList) this.f8816a).size()) {
                return "";
            }
            return ((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelType;
        }

        public TabManager.TabUp i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabManager.TabUp) ipChange.ipc$dispatch("4d81d71c", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= ((ArrayList) this.f8816a).size()) {
                return null;
            }
            return (TabManager.TabUp) ((ArrayList) this.f8816a).get(i);
        }

        public void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d317601", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }

        public void l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("490c0c83", new Object[]{this, new Integer(i)});
            } else {
                this.f = i;
            }
        }

        public void m(List<TabManager.TabUp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f0a7ddf", new Object[]{this, list});
                return;
            }
            this.f8816a.clear();
            if (list != null) {
                this.f8816a.addAll(list);
            }
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= ((ArrayList) this.f8816a).size()) {
                return new Fragment();
            }
            if (((ArrayList) this.f8816a).get(i) != null) {
                Bundle bundle = new Bundle();
                if (i == this.f) {
                    bundle.putBoolean("entry_channeltype", true);
                }
                bundle.putString("entry_bottom_channeltype", this.h);
                bundle.putString("business_type", ((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelType);
                bundle.putInt(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, ((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelId);
                bundle.putSerializable("tab_top", (Serializable) ((ArrayList) this.f8816a).get(i));
                bundle.putString("entryLiveSource", this.g);
                if (j5h.a(((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelType, this.d)) {
                    bundle.putString("START_CONTENT_ID", this.b);
                    bundle.putString("START_SUB_CONTENT_ID", this.c);
                    bundle.putString("query_params", this.e);
                }
                if (((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)) != null) {
                    if (j5h.a("followTab", ((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelType)) {
                        return HomeFollowDXFragment.m3(bundle, this.i);
                    }
                    if (j5h.a("jingxuan", ((TabManager.TabUp) ((ArrayList) this.f8816a).get(i)).channelType)) {
                        return HomeSelectedFragment.H3(bundle, this.i);
                    }
                }
            }
            return new Fragment();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                HomeSelectedContainerFragment.this.p.m().b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
            if (!HomeSelectedContainerFragment.h3(homeSelectedContainerFragment, HomeSelectedContainerFragment.g3(homeSelectedContainerFragment), "搜索")) {
                Nav from = Nav.from(HomeSelectedContainerFragment.this.getContext());
                from.toUri(nvs.m0() + "&search_entry=singleLiveTab");
                HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.q3(homeSelectedContainerFragment2, HomeSelectedContainerFragment.p3(homeSelectedContainerFragment2).getCurrentItem(), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b0e
        public void a(Map<String, String> map, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7179c2bb", new Object[]{this, map, new Integer(i)});
                return;
            }
            HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
            if (!HomeSelectedContainerFragment.h3(homeSelectedContainerFragment, HomeSelectedContainerFragment.r3(homeSelectedContainerFragment), "搜索")) {
                if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this) == null) {
                    r90.b(HomeSelectedContainerFragment.this.getContext());
                } else if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsDataList != null && HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsDataList.size() > i) {
                    TaoliveSearchHotWords taoliveSearchHotWords = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsDataList.get(i);
                    if (taoliveSearchHotWords != null) {
                        HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                        HomeSelectedContainerFragment.u3(homeSelectedContainerFragment2, homeSelectedContainerFragment2.getContext(), HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url, taoliveSearchHotWords.word, taoliveSearchHotWords.type, taoliveSearchHotWords.url, taoliveSearchHotWords.rightInfo, taoliveSearchHotWords.utParams, false);
                    }
                } else if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData != null) {
                    HomeSelectedContainerFragment homeSelectedContainerFragment3 = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.u3(homeSelectedContainerFragment3, homeSelectedContainerFragment3.getContext(), HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url, HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.word, HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.type, HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.url, HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.rightInfo, HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.utParams, false);
                }
                HomeSelectedContainerFragment homeSelectedContainerFragment4 = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.q3(homeSelectedContainerFragment4, HomeSelectedContainerFragment.p3(homeSelectedContainerFragment4).getCurrentItem(), map);
            }
        }

        @Override // tb.b0e
        public void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6823922", new Object[]{this, map});
            } else if (map != null) {
                HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.v3(homeSelectedContainerFragment, HomeSelectedContainerFragment.p3(homeSelectedContainerFragment).getCurrentItem(), map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements com.taobao.live.home.widget.tab.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.live.home.widget.tab.d
        public View a(XTabLayout.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("93219b7c", new Object[]{this, gVar});
            }
            return HomeSelectedContainerFragment.this.G.f(gVar.m);
        }
    }

    static {
        t2o.a(310378658);
        t2o.a(806355547);
        t2o.a(806355546);
        t2o.a(806355483);
        t2o.a(310378672);
        t2o.a(310378670);
    }

    public static HomeSelectedContainerFragment K3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedContainerFragment) ipChange.ipc$dispatch("5ed053b8", new Object[]{bundle, b0hVar});
        }
        HomeSelectedContainerFragment homeSelectedContainerFragment = new HomeSelectedContainerFragment();
        homeSelectedContainerFragment.setArguments(bundle);
        homeSelectedContainerFragment.f3(b0hVar);
        return homeSelectedContainerFragment;
    }

    public static /* synthetic */ Activity g3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("573b5c32", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.f10969a;
    }

    public static /* synthetic */ boolean h3(HomeSelectedContainerFragment homeSelectedContainerFragment, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5018457", new Object[]{homeSelectedContainerFragment, activity, str})).booleanValue();
        }
        return homeSelectedContainerFragment.y3(activity, str);
    }

    public static /* synthetic */ void i3(HomeSelectedContainerFragment homeSelectedContainerFragment, Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbfcf0d", new Object[]{homeSelectedContainerFragment, context, str, str2, str3, str4, rightInfo, str5});
        } else {
            homeSelectedContainerFragment.H3(context, str, str2, str3, str4, rightInfo, str5);
        }
    }

    public static /* synthetic */ Object ipc$super(HomeSelectedContainerFragment homeSelectedContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2049624054:
                super.X2();
                return null;
            case -1990827289:
                super.W2();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 303778162:
                super.T2();
                return null;
            case 999033108:
                super.U2();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeSelectedContainerFragment");
        }
    }

    public static /* synthetic */ void j3(HomeSelectedContainerFragment homeSelectedContainerFragment, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5491c6c8", new Object[]{homeSelectedContainerFragment, new Integer(i), map});
        } else {
            homeSelectedContainerFragment.T3(i, map);
        }
    }

    public static /* synthetic */ Activity k3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1a9abde1", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.f10969a;
    }

    public static /* synthetic */ boolean l3(HomeSelectedContainerFragment homeSelectedContainerFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5367a4ee", new Object[]{homeSelectedContainerFragment, new Boolean(z)})).booleanValue();
        }
        homeSelectedContainerFragment.S = z;
        return z;
    }

    public static /* synthetic */ void m3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3de029", new Object[]{homeSelectedContainerFragment});
        } else {
            homeSelectedContainerFragment.I3();
        }
    }

    public static /* synthetic */ void n3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4a1aaa", new Object[]{homeSelectedContainerFragment});
        } else {
            homeSelectedContainerFragment.W3();
        }
    }

    public static /* synthetic */ TextView o3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d50cec9f", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.B;
    }

    public static /* synthetic */ LiveHomeViewPager p3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeViewPager) ipChange.ipc$dispatch("d321fec", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.y;
    }

    public static /* synthetic */ void q3(HomeSelectedContainerFragment homeSelectedContainerFragment, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894e1bdb", new Object[]{homeSelectedContainerFragment, new Integer(i), map});
        } else {
            homeSelectedContainerFragment.U3(i, map);
        }
    }

    public static /* synthetic */ Activity r3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a7b79cae", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.f10969a;
    }

    public static /* synthetic */ TaoLiveHotwordResponseData s3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("ab94aad1", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.L;
    }

    public static /* synthetic */ TaoLiveHotwordResponseData t3(HomeSelectedContainerFragment homeSelectedContainerFragment, TaoLiveHotwordResponseData taoLiveHotwordResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("766a2ff9", new Object[]{homeSelectedContainerFragment, taoLiveHotwordResponseData});
        }
        homeSelectedContainerFragment.L = taoLiveHotwordResponseData;
        return taoLiveHotwordResponseData;
    }

    public static /* synthetic */ void u3(HomeSelectedContainerFragment homeSelectedContainerFragment, Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40c030", new Object[]{homeSelectedContainerFragment, context, str, str2, str3, str4, rightInfo, str5, new Boolean(z)});
        } else {
            homeSelectedContainerFragment.G3(context, str, str2, str3, str4, rightInfo, str5, z);
        }
    }

    public static /* synthetic */ void v3(HomeSelectedContainerFragment homeSelectedContainerFragment, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35127ddf", new Object[]{homeSelectedContainerFragment, new Integer(i), map});
        } else {
            homeSelectedContainerFragment.X3(i, map);
        }
    }

    public static /* synthetic */ Activity w3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f833dd2a", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.f10969a;
    }

    public static /* synthetic */ TextBannerView x3(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextBannerView) ipChange.ipc$dispatch("2fc97580", new Object[]{homeSelectedContainerFragment});
        }
        return homeSelectedContainerFragment.C;
    }

    public final String A3() {
        LiveHomeViewPager liveHomeViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2610f59f", new Object[]{this});
        }
        SelectedViewPagerAdapter selectedViewPagerAdapter = this.F;
        if (selectedViewPagerAdapter == null || (liveHomeViewPager = this.y) == null) {
            return "";
        }
        return selectedViewPagerAdapter.h(liveHomeViewPager.getCurrentItem());
    }

    public final TabManager.TabUp D3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabManager.TabUp) ipChange.ipc$dispatch("2f07106f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            if (i2 == i) {
                return this.K.get(i2);
            }
        }
        return null;
    }

    public int E3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc67eb2c", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.K.size(); i++) {
            TabManager.TabUp tabUp = this.K.get(i);
            if (!lrq.a(tabUp.channelType) && tabUp.channelType.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final Map<String, String> F3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43de2332", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        b0h b0hVar = this.p;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.p.g);
        }
        return hashMap;
    }

    public final void G3(Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5, boolean z) {
        String str6;
        String str7;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5e903a", new Object[]{this, context, str, str2, str3, str4, rightInfo, str5, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString(TaoliveSearchHotWords.TYPE_WORD, str2);
            bundle.putString("type", str3);
            bundle.putString("url", str4);
            if ("followTab".equals(this.p.y.channelType)) {
                if (str.contains("?")) {
                    str6 = str.concat("&search_entry=follow");
                } else {
                    str6 = str.concat("?search_entry=follow");
                }
            } else if (!"jingxuan".equals(this.p.y.channelType)) {
                str6 = str;
            } else if (str.contains("?")) {
                str6 = str.concat("&search_entry=jingxuan");
            } else {
                str6 = str.concat("?search_entry=jingxuan");
            }
            if (z) {
                if (!TextUtils.isEmpty(str2)) {
                    str6 = str6 + "&keyword=" + Uri.encode(str2);
                }
                str7 = str6 + "&fcc_match_query=path&path=result";
            } else {
                str7 = str6 + "&fcc_match_query=path&path=middle";
            }
            if (!TextUtils.isEmpty(str2)) {
                str7 = str7 + "&word=" + Uri.encode(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                str7 = str7 + "&type=" + Uri.encode(str3);
            }
            if (rightInfo != null) {
                str7 = str7 + "&rightInfo=" + Uri.encode(JSON.toJSONString(rightInfo));
            }
            if (!TextUtils.isEmpty(str)) {
                str7 = str7 + "&url=" + Uri.encode(str4);
            }
            String str8 = str7 + "&androidKeyboard=true";
            if (!TextUtils.isEmpty(str5) && (parseObject = JSON.parseObject(str5)) != null && !parseObject.isEmpty()) {
                if (nvs.u0()) {
                    parseObject.remove("utLogMap");
                }
                str8 = str8 + "&searchUtParams=" + Uri.encode(parseObject.toJSONString());
            }
            Nav.from(context).withExtras(bundle).toUri(str8);
        }
    }

    public final void H3(Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1241b527", new Object[]{this, context, str, str2, str3, str4, rightInfo, str5});
        } else if (!TextUtils.isEmpty(str4)) {
            Nav.from(context).toUri(str4);
        } else {
            G3(context, str, str2, str3, str4, rightInfo, str5, true);
        }
    }

    public final void I3() {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232eac64", new Object[]{this});
            return;
        }
        View view = this.x;
        if (view != null && !this.R && (viewStub = (ViewStub) view.findViewById(R.id.live_search_stub)) != null) {
            viewStub.setLayoutResource(R.layout.live_search_big_flexalocal);
            this.z = (ViewGroup) viewStub.inflate();
            this.D = (TextView) this.x.findViewById(R.id.live_search_right_btn);
            if (this.z != null) {
                e4();
                this.D.setVisibility(0);
                this.D.setOnClickListener(new d());
                this.z.setOnClickListener(new e());
            }
            this.B = (TextView) this.x.findViewById(R.id.live_search_tips);
            TextBannerView textBannerView = (TextBannerView) this.x.findViewById(R.id.live_search_tips_new);
            this.C = textBannerView;
            textBannerView.setItemListener(this.T);
            d4();
            this.R = true;
        }
    }

    public final void J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d22146", new Object[]{this});
        } else if (this.q && this.r && !this.M) {
            O3();
            if (qw0.a()) {
                Handler handler = this.O;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1000, 2000L);
                }
            } else {
                S3();
            }
            this.M = true;
        }
    }

    public void L3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b48a0a", new Object[]{this, new Boolean(z)});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--onSelectedUpdate mSelected:" + this.s);
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (liveHomeViewPager != null && this.F != null) {
            Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedBaseFragment) {
                ((HomeSelectedBaseFragment) fragment).i3(z);
            }
        }
    }

    public void M3() {
        XTabLayout xTabLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f417359b", new Object[]{this});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--onTabAppearUpdate mSelected:" + this.s);
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (!(liveHomeViewPager == null || this.F == null)) {
            int currentItem = liveHomeViewPager.getCurrentItem();
            Fragment fragment = this.P;
            if (fragment instanceof HomeSelectedFragment) {
                ((HomeSelectedFragment) fragment).L3(this.G.m());
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.G;
            if (!(aVar == null || (xTabLayout = this.E) == null)) {
                aVar.q(xTabLayout.getTabAt(currentItem));
            }
            Fragment fragment2 = (Fragment) this.F.instantiateItem((ViewGroup) this.y, currentItem);
            this.P = fragment2;
            if (fragment2 instanceof HomeSelectedFragment) {
                HomeSelectedFragment homeSelectedFragment = (HomeSelectedFragment) fragment2;
                if (!homeSelectedFragment.r) {
                    homeSelectedFragment.T2();
                }
            } else if (fragment2 instanceof HomeSelectedBaseFragment) {
                HomeSelectedBaseFragment homeSelectedBaseFragment = (HomeSelectedBaseFragment) fragment2;
                if (!homeSelectedBaseFragment.r) {
                    homeSelectedBaseFragment.T2();
                }
                this.G.A(true);
            }
            a4();
            b4(currentItem);
        }
        R3(true);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return U;
    }

    public void N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e33bd", new Object[]{this});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--onTabDisappearUpdate mSelected:" + this.s);
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (!(liveHomeViewPager == null || this.F == null)) {
            Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedBaseFragment) {
                ((HomeSelectedBaseFragment) fragment).U2();
            }
        }
        R3(false);
    }

    public void P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede548eb", new Object[]{this});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (liveHomeViewPager != null && this.F != null) {
            Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedBaseFragment) {
                ((HomeSelectedBaseFragment) fragment).g3();
            }
        }
    }

    public final List<TaoliveSearchHotWords> Q3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9a060b9", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return JSON.parseArray(str, TaoliveSearchHotWords.class);
    }

    public final void R3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa8ea37", new Object[]{this, new Boolean(z)});
        } else if (z) {
            TextBannerView textBannerView = this.C;
            if (textBannerView != null) {
                textBannerView.startViewAnimator();
            }
        } else {
            TextBannerView textBannerView2 = this.C;
            if (textBannerView2 != null) {
                textBannerView2.stopViewAnimator();
            }
        }
    }

    public final void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17700648", new Object[]{this});
        } else {
            new qws(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    HomeSelectedContainerFragment.l3(HomeSelectedContainerFragment.this, true);
                    if ((baseOutDo instanceof TaoLiveHotWordResponse) && (baseOutDo.getData() instanceof TaoLiveHotwordResponseData)) {
                        HomeSelectedContainerFragment.t3(HomeSelectedContainerFragment.this, ((TaoLiveHotWordResponse) baseOutDo).getData());
                        HomeSelectedContainerFragment.m3(HomeSelectedContainerFragment.this);
                        HomeSelectedContainerFragment.n3(HomeSelectedContainerFragment.this);
                        mbu.d("RequestSuccess", "firstRequest", mtopResponse, HomeSelectedContainerFragment.this.p);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        onError(i, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    HomeSelectedContainerFragment.l3(HomeSelectedContainerFragment.this, true);
                    if (HomeSelectedContainerFragment.o3(HomeSelectedContainerFragment.this) != null) {
                        HomeSelectedContainerFragment.o3(HomeSelectedContainerFragment.this).setVisibility(0);
                        HomeSelectedContainerFragment.o3(HomeSelectedContainerFragment.this).setText(nvs.k0());
                    }
                    if (HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this) != null) {
                        HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this).setVisibility(8);
                    }
                    mbu.d("requestError", "firstRequest", mtopResponse, HomeSelectedContainerFragment.this.p);
                }
            }).j(this.p, this.f10969a);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (liveHomeViewPager != null) {
            liveHomeViewPager.setCanScroll(true);
        }
        J3();
        if (this.s) {
            M3();
        }
    }

    public final void T3(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843f191c", new Object[]{this, new Integer(i), map});
            return;
        }
        List<TabManager.TabUp> list = this.K;
        if (list != null && i >= 0 && i < list.size() && this.K.get(i) != null) {
            Map<String, String> F3 = F3(this.K.get(i).spm);
            if (map != null) {
                F3.putAll(map);
            }
            p9m.c("searchbutton", F3);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.U2();
        if (this.s) {
            N3();
        }
    }

    public final void U3(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48526688", new Object[]{this, new Integer(i), map});
            return;
        }
        List<TabManager.TabUp> list = this.K;
        if (list != null && i >= 0 && i < list.size() && this.K.get(i) != null) {
            Map<String, String> F3 = F3(this.K.get(i).spm);
            if (map != null) {
                F3.putAll(map);
            }
            p9m.c("searchbox", F3);
        }
    }

    public final void V3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725127b8", new Object[]{this, new Integer(i)});
            return;
        }
        List<TabManager.TabUp> list = this.K;
        if (list != null && i >= 0 && i < list.size() && this.K.get(i) != null) {
            p9m.g("Show-searchbox", F3(this.K.get(i).spm));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.W2();
        R3(false);
    }

    public final void W3() {
        TextBannerView textBannerView;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c0a39b", new Object[]{this});
            return;
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData = this.L;
        if (!(taoLiveHotwordResponseData == null || (str = taoLiveHotwordResponseData.hotWords) == null)) {
            try {
                taoLiveHotwordResponseData.hotWordsData = (TaoliveSearchHotWords) JSON.parseObject(str, TaoliveSearchHotWords.class);
                TaoliveSearchHotWords taoliveSearchHotWords = this.L.hotWordsData;
                if (!(taoliveSearchHotWords == null || taoliveSearchHotWords.word == null)) {
                    TextBannerView textBannerView2 = this.C;
                    if (textBannerView2 != null) {
                        textBannerView2.setVisibility(0);
                    }
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.B.setText(this.L.hotWordsData.word);
                    }
                }
            } catch (Exception e2) {
                r0h.b(U, e2.getMessage());
            }
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData2 = this.L;
        if (taoLiveHotwordResponseData2 != null && taoLiveHotwordResponseData2.hotWordsList != null) {
            try {
                TextBannerView textBannerView3 = this.C;
                if (textBannerView3 != null) {
                    textBannerView3.setVisibility(0);
                }
                TextView textView2 = this.B;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TaoLiveHotwordResponseData taoLiveHotwordResponseData3 = this.L;
                taoLiveHotwordResponseData3.hotWordsDataList = Q3(taoLiveHotwordResponseData3.hotWordsList);
                List<TaoliveSearchHotWords> list = this.L.hotWordsDataList;
                if (list != null && (textBannerView = this.C) != null) {
                    textBannerView.setWithLabelDatas(list);
                }
            } catch (Exception e3) {
                r0h.b(U, e3.getMessage());
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.X2();
        R3(true);
        if (this.S && nvs.a() && p0.b()) {
            S3();
        }
    }

    public final void X3(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828d7377", new Object[]{this, new Integer(i), map});
            return;
        }
        List<TabManager.TabUp> list = this.K;
        if (list != null && i >= 0 && i < list.size() && this.K.get(i) != null) {
            Map<String, String> F3 = F3(this.K.get(i).spm);
            F3.putAll(map);
            p9m.g("Show-shaded_word", F3);
        }
    }

    public void Y3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e1d343", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.G;
        if (aVar != null) {
            aVar.A(z);
        }
    }

    public final void Z3(int i) {
        try {
            IpChange ipChange = ViewPager.$ipChange;
            Field declaredField = ViewPager.class.getDeclaredField("mCurItem");
            declaredField.setAccessible(true);
            declaredField.setInt(this.y, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a4() {
        b0h b0hVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ddf883", new Object[]{this});
            return;
        }
        I3();
        W3();
        View view = this.A;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.z != null) {
            d4();
            if (!(!nvs.n() || (b0hVar = this.p) == null || b0hVar.y == null || (viewGroup = this.z) == null)) {
                viewGroup.setVisibility(0);
            }
            R3(true);
        }
    }

    public final void b4(int i) {
        LinearLayout linearLayout;
        FrameLayout.LayoutParams layoutParams;
        XTabLayout.g tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc1de01", new Object[]{this, new Integer(i)});
        } else if (this.E.getTabAt(i) != null) {
            int E3 = E3("singleLiveTab");
            if (E3 < 0 || (tabAt = this.E.getTabAt(E3)) == null || tabAt.r() == null) {
                linearLayout = null;
                layoutParams = null;
            } else {
                linearLayout = (LinearLayout) tabAt.r().getCustomView().findViewById(R.id.tab_item);
                layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.E.getLayoutParams();
            if (getContext() != null) {
                ViewGroup viewGroup = this.z;
                if (viewGroup == null || viewGroup.getVisibility() != 0) {
                    View view = this.A;
                    if (view != null && view.getVisibility() == 0) {
                        layoutParams2.width = qw0.l() - qw0.d(getContext(), 67.0f);
                        this.E.setLayoutParams(layoutParams2);
                        if (linearLayout != null && layoutParams != null) {
                            layoutParams.width = (layoutParams2.width - this.G.j()) - qw0.d(this.f10969a, 2.0f);
                            linearLayout.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                    return;
                }
                layoutParams2.width = (qw0.l() - qw0.d(getContext(), this.Q + 46)) - ((int) Math.max((double) vu3.b.GEO_NOT_SUPPORT, sj7.v(getContext()) ? (qw0.l() * 0.4d) - qw0.d(getContext(), this.Q) : 0.0d));
                this.E.setLayoutParams(layoutParams2);
                if (linearLayout != null && layoutParams != null) {
                    layoutParams.width = (layoutParams2.width - this.G.j()) - qw0.d(this.f10969a, 2.0f);
                    linearLayout.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (liveHomeViewPager != null && this.F != null) {
            Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedBaseFragment) {
                ((HomeSelectedBaseFragment) fragment).d3();
            }
        }
    }

    public final void d4() {
        b0h b0hVar;
        TabManager.TabUp tabUp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801abc94", new Object[]{this});
        } else if (nvs.n() && (b0hVar = this.p) != null && (tabUp = b0hVar.y) != null && this.z != null) {
            if ("followTab".equals(tabUp.channelType)) {
                this.z.setBackgroundResource(R.drawable.live_search_follow_bg_flexalocal);
            } else {
                this.z.setBackgroundResource(R.drawable.live_search_bg_flexalocal);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (!(liveHomeViewPager == null || this.F == null)) {
            int childCount = liveHomeViewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, i);
                if (fragment instanceof HomeSelectedBaseFragment) {
                    ((HomeSelectedBaseFragment) fragment).h3();
                }
            }
            b4(this.y.getCurrentItem());
        }
        e4();
    }

    public final void e4() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e4e3f6", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.z;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            b0h b0hVar = this.p;
            if (b0hVar != null && b0hVar.c() != null) {
                if (sj7.v(this.p.c())) {
                    i = (int) Math.max(qw0.d(this.p.c(), this.Q), qw0.l() * 0.4d);
                } else {
                    i = qw0.d(this.p.c(), this.Q);
                }
                int d2 = qw0.d(this.p.c(), 30.0f);
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(i, d2);
                }
                layoutParams.width = i;
                layoutParams.height = d2;
                this.z.setLayoutParams(layoutParams);
            }
        }
    }

    public final int getEnterIndex(List<TabManager.TabUp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45000c3b", new Object[]{this, list})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (j5h.a(this.w, list.get(i).channelType)) {
                return i;
            }
        }
        return 1;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        String str;
        LiveHomeViewPager liveHomeViewPager;
        TabManager.TabUp i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        SelectedViewPagerAdapter selectedViewPagerAdapter = this.F;
        if (selectedViewPagerAdapter == null || (liveHomeViewPager = this.y) == null || (i = selectedViewPagerAdapter.i(liveHomeViewPager.getCurrentItem())) == null) {
            str = "";
        } else {
            str = i.pageName;
        }
        if (lrq.a(str)) {
            return (String) ((HashMap) V).get(A3());
        }
        return str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1000) {
            TextBannerView textBannerView = this.C;
            if (textBannerView != null) {
                textBannerView.setCanAnimation(false);
            }
            S3();
        }
        return false;
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.d
    public void k2(XTabLayout.g gVar) {
        TabManager.TabUp D3;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a102736b", new Object[]{this, gVar});
        } else if (gVar != null && (D3 = D3(gVar.o())) != null && (jSONObject = D3.tabUT) != null) {
            String string = jSONObject.getString(pg1.ATOM_EXT_button);
            String string2 = jSONObject.getString("spm");
            if (!lrq.a(string)) {
                p9m.c(string, F3(string2));
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.t = arguments.getString("START_CONTENT_ID");
            this.u = arguments.getString("START_SUB_CONTENT_ID");
        }
        qyg.c().f(this);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.y;
        if (liveHomeViewPager != null && this.F != null) {
            Fragment fragment = (Fragment) this.F.instantiateItem((ViewGroup) this.y, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedFragment) {
                ((HomeSelectedFragment) fragment).onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if ("true".equals(this.p.e)) {
                this.w = "singleLiveTab";
            } else {
                this.w = arguments.getString("START_CHANNEL_TYPE", "jingxuan");
            }
            this.v = arguments.getString("query_params", "");
            TabManager.TabBottom tabBottom = (TabManager.TabBottom) arguments.getSerializable("tab_bottom");
            this.H = tabBottom;
            if (tabBottom != null) {
                this.I = tabBottom.channelType;
                this.K = B3();
            }
            this.J = arguments.getString("entryLiveSource", "");
        }
        this.p.L(this);
        this.p.I(this);
        this.O = new Handler(this);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        r0h.b("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        r0h.b("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView super");
        if (this.x == null) {
            View inflate = layoutInflater.inflate(R.layout.live_selected_fragment_flexalocal, viewGroup, false);
            this.x = inflate;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.homepage2_toolbar);
            this.N = linearLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin += qw0.d(this.f10969a, this.p.m);
            }
            this.N.setLayoutParams(layoutParams);
            this.y = (LiveHomeViewPager) this.x.findViewById(R.id.live_selected_vp);
            View findViewById = this.x.findViewById(R.id.homepage2_back);
            if (findViewById != null) {
                ViewProxy.setOnClickListener(findViewById, new a());
            }
            View findViewById2 = this.x.findViewById(R.id.homepage_toptab_search);
            this.A = findViewById2;
            ViewProxy.setOnClickListener(findViewById2, new b());
            this.E = (XTabLayout) this.x.findViewById(R.id.homepage2_tab_layout);
        }
        J3();
        r0h.b("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView end");
        return this.x;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        qyg.c().j(this);
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.G;
        if (aVar != null) {
            aVar.o();
        }
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b0h b0hVar = this.p;
        if (b0hVar != null && b0hVar.k() != null) {
            this.p.I(null);
        }
    }

    @Override // tb.nlc
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (j5h.a("com.taobao.taolive.follow.number.changed", str) && (obj instanceof TabManager.TabUp) && this.G != null && !"followTab".equals(this.w)) {
            TabManager.TabUp tabUp = (TabManager.TabUp) obj;
            TabManager.q().u(tabUp);
            this.G.y(tabUp);
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.e
    public void onTabReselected(XTabLayout.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6330981d", new Object[]{this, gVar});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--onTabReselected mSelected:" + this.s);
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.G;
        if (aVar != null) {
            aVar.p(gVar);
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.e
    public void onTabUnselected(XTabLayout.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0e8b83", new Object[]{this, gVar});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--onTabUnselected mSelected:" + this.s);
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a aVar = this.G;
        if (aVar != null && gVar != null) {
            aVar.r(gVar);
            if (E3("jingxuan") > -1 && gVar.o() == E3("jingxuan")) {
                this.G.g();
            }
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        if (this.q) {
            L3(z);
            R3(z);
            this.p.R(z);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbaa01", new Object[]{this});
        }
    }

    public final String z3() {
        String str;
        LiveHomeViewPager liveHomeViewPager;
        TabManager.TabUp i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b54fda9", new Object[]{this});
        }
        SelectedViewPagerAdapter selectedViewPagerAdapter = this.F;
        if (selectedViewPagerAdapter == null || (liveHomeViewPager = this.y) == null || (i = selectedViewPagerAdapter.i(liveHomeViewPager.getCurrentItem())) == null) {
            str = "";
        } else {
            str = i.spm;
        }
        if (lrq.a(str)) {
            return (String) ((HashMap) W).get(A3());
        }
        return str;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            TaoliveSearchHotWords.RightInfo rightInfo;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
            if (!HomeSelectedContainerFragment.h3(homeSelectedContainerFragment, HomeSelectedContainerFragment.w3(homeSelectedContainerFragment), "搜索")) {
                StringBuilder sb = new StringBuilder(nvs.m0());
                if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this) != null && !TextUtils.isEmpty(HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url)) {
                    sb = new StringBuilder(HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url);
                }
                HashMap hashMap = new HashMap();
                String str7 = "";
                if (HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this) != null) {
                    TaoliveSearchHotWords clickItemData = HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this).getClickItemData();
                    if (clickItemData != null) {
                        String str8 = clickItemData.utParams;
                        String str9 = clickItemData.source;
                        str2 = clickItemData.url;
                        str3 = clickItemData.type;
                        String str10 = clickItemData.word;
                        rightInfo = clickItemData.rightInfo;
                        str6 = str9;
                        str5 = str8;
                        str7 = str10;
                    } else if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this) == null || HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData == null) {
                        str6 = str7;
                        str2 = str6;
                        str3 = str2;
                        rightInfo = null;
                        str5 = str3;
                    } else {
                        String str11 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.utParams;
                        str6 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.source;
                        String str12 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.url;
                        String str13 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.type;
                        String str14 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.word;
                        rightInfo = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.rightInfo;
                        str5 = str11;
                        str7 = str14;
                        str3 = str13;
                        str2 = str12;
                    }
                    hashMap.put("query", str7);
                    hashMap.put("shaded_word_type", str6);
                    hashMap.putAll(ixf.a(str5));
                    str4 = str7;
                    str = str5;
                } else {
                    str4 = str7;
                    str3 = str4;
                    str2 = str3;
                    str = str2;
                    rightInfo = null;
                }
                HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.i3(homeSelectedContainerFragment2, homeSelectedContainerFragment2.getContext(), sb.toString(), str4, str3, str2, rightInfo, str);
                if (HomeSelectedContainerFragment.p3(HomeSelectedContainerFragment.this) != null) {
                    HomeSelectedContainerFragment homeSelectedContainerFragment3 = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.j3(homeSelectedContainerFragment3, HomeSelectedContainerFragment.p3(homeSelectedContainerFragment3).getCurrentItem(), hashMap);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            TaoliveSearchHotWords.RightInfo rightInfo;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
            if (!HomeSelectedContainerFragment.h3(homeSelectedContainerFragment, HomeSelectedContainerFragment.k3(homeSelectedContainerFragment), "搜索")) {
                StringBuilder sb = new StringBuilder(nvs.m0());
                if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this) != null && !TextUtils.isEmpty(HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url)) {
                    sb = new StringBuilder(HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).url);
                }
                if ("followTab".equals(HomeSelectedContainerFragment.this.p.y.channelType)) {
                    sb.append("&search_entry=follow");
                } else if ("jingxuan".equals(HomeSelectedContainerFragment.this.p.y.channelType)) {
                    sb.append("&search_entry=jingxuan");
                }
                HashMap hashMap = new HashMap();
                if (nvs.Q()) {
                    Nav.from(HomeSelectedContainerFragment.this.getContext()).toUri(sb.toString());
                } else {
                    String str7 = "";
                    if (HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this) != null) {
                        TaoliveSearchHotWords clickItemData = HomeSelectedContainerFragment.x3(HomeSelectedContainerFragment.this).getClickItemData();
                        if (clickItemData != null) {
                            String str8 = clickItemData.utParams;
                            String str9 = clickItemData.source;
                            str2 = clickItemData.url;
                            str3 = clickItemData.type;
                            String str10 = clickItemData.word;
                            rightInfo = clickItemData.rightInfo;
                            str6 = str9;
                            str5 = str8;
                            str7 = str10;
                        } else if (HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this) == null || HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData == null) {
                            str6 = str7;
                            str2 = str6;
                            str3 = str2;
                            rightInfo = null;
                            str5 = str3;
                        } else {
                            String str11 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.utParams;
                            str6 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.source;
                            String str12 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.url;
                            String str13 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.type;
                            String str14 = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.word;
                            rightInfo = HomeSelectedContainerFragment.s3(HomeSelectedContainerFragment.this).hotWordsData.rightInfo;
                            str5 = str11;
                            str7 = str14;
                            str3 = str13;
                            str2 = str12;
                        }
                        hashMap.put("query", str7);
                        hashMap.put("shaded_word_type", str6);
                        hashMap.putAll(ixf.a(str5));
                        str4 = str7;
                        str = str5;
                    } else {
                        str4 = str7;
                        str3 = str4;
                        str2 = str3;
                        str = str2;
                        rightInfo = null;
                    }
                    HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.u3(homeSelectedContainerFragment2, homeSelectedContainerFragment2.getContext(), sb.toString(), str4, str3, str2, rightInfo, str, false);
                }
                HomeSelectedContainerFragment homeSelectedContainerFragment3 = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.q3(homeSelectedContainerFragment3, HomeSelectedContainerFragment.p3(homeSelectedContainerFragment3).getCurrentItem(), hashMap);
            }
        }
    }

    public final List<TabManager.TabUp> C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bf74916", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!lrq.a(this.I) && j5h.a("jingxuan", this.I)) {
            TabManager.TabUp tabUp = new TabManager.TabUp();
            tabUp.name = gt9.TEXT_UNFOLLOW_DEFAULT;
            tabUp.channelType = "followTab";
            arrayList.add(tabUp);
            TabManager.TabUp tabUp2 = new TabManager.TabUp();
            tabUp2.name = "发现";
            tabUp2.channelId = 0;
            tabUp2.channelType = "jingxuan";
            arrayList.add(tabUp2);
        }
        return arrayList;
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e87814", new Object[]{this});
        } else if (this.y != null) {
            int enterIndex = getEnterIndex(this.K);
            HashMap hashMap = new HashMap();
            hashMap.put("enterIndex", String.valueOf(enterIndex));
            if (!lrq.a(this.J)) {
                hashMap.put("liveSource", String.valueOf(this.J));
            }
            if (enterIndex != 1) {
                p9m.g("tbLiveChannelEnterIndexOther", hashMap);
            } else {
                p9m.g("tbLiveChannelEnterIndexFaXian", hashMap);
            }
            m1h.b("tbLiveChannelEnterIndex", "enterIndex=" + enterIndex);
            this.p.y = this.K.get(enterIndex);
            this.y.setOffscreenPageLimit(5);
            if (this.F == null) {
                r0h.d(U, "container first init, topTabs");
                SelectedViewPagerAdapter selectedViewPagerAdapter = new SelectedViewPagerAdapter(getContext(), getChildFragmentManager(), this.K, this.t, this.u, this.w, this.v, this.p);
                this.F = selectedViewPagerAdapter;
                selectedViewPagerAdapter.k(this.J);
                this.F.j(this.I);
                this.F.l(enterIndex);
                if (enterIndex != 0) {
                    Z3(enterIndex);
                }
                this.y.setAdapter(this.F);
            } else {
                r0h.d(U, "container refresh, topTabs");
                this.F.m(this.K);
                this.F.notifyDataSetChanged();
            }
            SelectedViewPagerAdapter selectedViewPagerAdapter2 = this.F;
            LiveHomeViewPager liveHomeViewPager = this.y;
            this.P = (Fragment) selectedViewPagerAdapter2.instantiateItem((ViewGroup) liveHomeViewPager, liveHomeViewPager.getCurrentItem());
            if (this.E != null) {
                this.G = new com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a(this.x, getContext(), this.E, this.K, this.p);
                this.E.setXTabCustomListener(new f());
                this.E.setupWithViewPager(this.y);
                this.E.setOnTabSelectedListener(this);
                this.E.setOnTabClickListener(this);
                this.G.A(true);
                b0h b0hVar = this.p;
                if (b0hVar != null) {
                    b0hVar.U(this.G);
                }
            }
            String str = U;
            r0h.d(str, "onTabReady selected top index is " + enterIndex);
            this.y.setCurrentItem(enterIndex);
            V3(enterIndex);
            if ("followTab".equals(this.w)) {
                this.G.l(this.E.getTabAt(enterIndex));
            }
            c4();
            mbu.e("CHANGE_TAB", this.p);
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.e
    public void onTabSelected(XTabLayout.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f34dea", new Object[]{this, gVar});
        } else if (gVar != null) {
            String str = U;
            r0h.b(str, "onTabSelected tab " + gVar.o());
            LiveHomeViewPager liveHomeViewPager = this.y;
            if (liveHomeViewPager != null) {
                liveHomeViewPager.setCanScroll(true);
            }
            gVar.B("");
            this.p.y = this.K.get(gVar.o());
            LiveHomeViewPager liveHomeViewPager2 = this.y;
            if (liveHomeViewPager2 != null) {
                liveHomeViewPager2.setCurrentItem(gVar.o());
            }
            if (gVar.o() == E3("jingxuan")) {
                qyg.c().e("com.taobao.taolive.top.tab.change", Boolean.TRUE);
            } else {
                qyg.c().e("com.taobao.taolive.top.tab.change", Boolean.FALSE);
            }
            M3();
            if (this.G != null && E3("followTab") > -1 && gVar.o() == E3("followTab")) {
                this.G.l(gVar);
            }
            V3(gVar.o());
            mbu.e("CHANGE_TAB", this.p);
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        String z3 = z3();
        if (z3 != null) {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("spm-url", z3);
            s2(hashMap2);
            hashMap.put("spm-cnt", z3);
        }
        return hashMap;
    }

    public final List<TabManager.TabUp> B3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2fbe61df", new Object[]{this});
        }
        List<TabManager.TabUp> list = this.H.topTab;
        if (list == null) {
            list = C3();
        }
        if (list.size() > 2) {
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if ("singleLiveTab".equals(list.get(i).channelType)) {
                    list.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
        return list;
    }

    public final void c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d123f703", new Object[]{this});
            return;
        }
        List<TabManager.TabUp> list = this.K;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                TabManager.TabUp tabUp = list.get(i);
                JSONObject jSONObject = tabUp.tabUT;
                if (jSONObject != null) {
                    p9m.g(jSONObject.getString("show"), F3(tabUp.tabUT.getString("spm")));
                }
            }
        }
    }

    public final boolean y3(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffcc4531", new Object[]{this, activity, str})).booleanValue();
        }
        try {
            boolean y = xpr.y(this.f10969a);
            String str2 = U;
            o3s.b(str2, "NonageServiceX, checkChildrenExpireByToast: " + y);
            if (!y) {
                return false;
            }
            Locale.getDefault();
            Toast.makeText(activity, "当前处于未成年人模式中，无法使用" + str + "功能", 1).show();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
