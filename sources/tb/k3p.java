package tb;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.alibaba.ability.localization.Localization;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.SFSrpConfig;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.jarvis.SearchJarvisCallback;
import com.taobao.search.jarvis.SearchJarvisInputProvider;
import com.taobao.search.jarvis.action.SearchFetchAction;
import com.taobao.search.jarvis.action.SearchRerankAction;
import com.taobao.search.m3.widget.M3ListCellWidget;
import com.taobao.search.m3.widget.M3WfCellWidget;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryWidget;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.HotSpotsWidget;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.ActivateGroupWidget;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.HistoryCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.suggest.cells.SuggestItemCellWidget;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.SuggestCellBean;
import com.taobao.search.sf.widgets.preposefilter.perf.OriginPreposeFilterBean;
import com.taobao.tao.TaoApplication;
import tb.i3p;
import tb.l4p;
import tb.rg3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22385a = false;
    public static i3p b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<Void, HandlerThread> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public HandlerThread a(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HandlerThread) ipChange.ipc$dispatch("960e2132", new Object[]{this, r5});
            }
            return wsa.a("tb-search-thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements l4p.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.l4p.a
        public void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c95e3928", new Object[]{this, context, str});
            } else {
                Nav.from(context).toUri(str);
            }
        }
    }

    static {
        t2o.a(815793412);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ebfda3", new Object[0]);
            return;
        }
        SFSrpConfig.a aVar = (SFSrpConfig.a) b.e();
        if (Localization.n()) {
            aVar.b(new lum(false), jdx.PREPOSE_FILTER_CREATOR);
        } else {
            aVar.b(new lum(false), jdx.RECYCLER_PREPOSE_FILTER_CREATOR);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f622f2", new Object[0]);
            return;
        }
        synchronized ("SearchFrameworkInitManager") {
            try {
                if (!f22385a) {
                    f22385a = true;
                    ga0 b2 = s1p.c().b();
                    r1p<ActivateTypedBean> a2 = s1p.c().a();
                    ListStyle listStyle = ListStyle.LIST;
                    a2.e(listStyle, HistoryCellBean.class, HistoryCellViewHolder.CREATOR);
                    a2.e(listStyle, CombineHistoryCellBean.class, HistoryCellViewHolder.COMBINE_CREATOR);
                    a2.e(listStyle, ActivateCellBean.class, ActivateGroupWidget.CREATOR);
                    a2.e(listStyle, HotSpots.class, HotSpotsWidget.Companion.a());
                    a2.e(listStyle, GuessDiscoveryCellBean.class, GuessDiscoveryWidget.Companion.a());
                    b2.b(new j24());
                    b2.b(new oma());
                    b2.b(new w6b());
                    b2.b(new cya());
                    b2.b(new x90());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1171d82d", new Object[0]);
            return;
        }
        s1p.c().d().e(ListStyle.LIST, SuggestCellBean.class, SuggestItemCellWidget.CREATOR);
        s1p.c().b().b(new rwq());
        d();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e8cf1c", new Object[0]);
            return;
        }
        c4p.m("SearchFrameworkInitManager", "init search framework");
        b4p.q(rv6.a());
        i3p.b c = b.c();
        c.a("TaobaoPhoneSearch");
        c.c("https://market.wapa.taobao.com/app/etaowireless/m-search-chitu/chitupanel/index.html");
        c.b("http://admin.search.taobao.com/chitu/ChituApiLog/requestUpload");
        b.h().a("TBSearch.");
        b.h().f("search");
        b.h().g("s.m.taobao.com");
        b.h().e(i6p.class);
        i3p.a b2 = b.b();
        gxt gxtVar = new gxt();
        rg3.b bVar = ah3.TIPS_CREATOR;
        b2.b(gxtVar, bVar, bVar);
        qy4 qy4Var = new qy4();
        rg3.b bVar2 = ah3.CROSS_TIPS_CREATOR;
        b2.b(qy4Var, bVar2, bVar2);
        mnh mnhVar = new mnh();
        M3ListCellWidget.b bVar3 = M3ListCellWidget.Companion;
        rg3.b a2 = bVar3.a();
        M3WfCellWidget.b bVar4 = M3WfCellWidget.Companion;
        b2.a("nt_auction_newindustry", mnhVar, a2, bVar4.a());
        b2.a("nt_tmallAuction", new mnh(), bVar3.a(), bVar4.a());
        b2.a("nt_auction_ad_video_2019", new mnh(), bVar3.a(), bVar4.a());
        b2.a("nt_ad_auction_live", new mnh(), bVar3.a(), bVar4.a());
        b2.a("nt_auction_2019", new mnh(), bVar3.a(), bVar4.a());
        b2.b(new mnh(), bVar3.a(), bVar4.a());
        b2.b(new sx6(), ah3.DEFAULT_AUCTION_CELL_LIST_CREATOR, ah3.DEFAULT_AUCTION_CELL_WF_CREATOR);
        h67 h67Var = new h67();
        rg3.b bVar5 = ah3.DEFAULT_SHOP_CELL_CREATOR;
        b2.b(h67Var, bVar5, bVar5);
        kbf kbfVar = new kbf();
        rg3.b bVar6 = ah3.INSHOP_AUCTION_2020_LIST_CREATOR;
        rg3.b bVar7 = ah3.INSHOP_AUCTION_2020_WF_CREATOR;
        b2.a("nt_inshop_auction_radius", kbfVar, bVar6, bVar7);
        b2.b(new kbf(), bVar6, bVar7);
        SFSrpConfig.a aVar = (SFSrpConfig.a) b.e();
        aVar.b(new slo(), jdx.ONESEARCH_CREATOR);
        aVar.b(new dmo(), jdx.TOPBAR_CREATOR);
        c();
        aVar.a(new mum(true), OriginPreposeFilterBean.class, jdx.RECYCLER_PREPOSE_FILTER_CREATOR);
        aVar.b(new llo(), jdx.INSHOP_TOPBAR_CREATOR);
        aVar.d(jdx.TAB_VIEW_CREATOR);
        aVar.c(jdx.TAB_PRESENTER_CREATOR);
        aVar.b(new eaa(), jdx.GLOBAL_ADDRESS_CREATOR);
        ((SFSrpConfig.b) b.g()).a(new tlo(), jdx.PROMOTION_FILTER_WIDGET_CREATOR);
        b.n(new a());
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void b(fj4 fj4Var, Context context, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1943326e", new Object[]{fj4Var, context, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        k8j.a((Application) context.getApplicationContext());
        yko ykoVar = yak.f31939a;
        if (ykoVar == null) {
            ykoVar = j3p.h().f(context).e(f, i2, i, a(context), TaoApplication.getVersion()).h("tbsearch_preference").g(new b()).i(fj4Var).d();
            yak.f31939a = ykoVar;
        }
        ykoVar.f().b().c(SearchMuiseViewHolder.CREATOR);
        ykoVar.f().i().a(j4p.CREATOR);
        ykoVar.f().h().b(y4p.m());
        ykoVar.h().b(a54.CONVERTER_NAME, new a54());
        yak.f31939a = ykoVar;
        b = ykoVar.f();
        bhv.b(ykoVar, zvr.u(ykoVar));
        bhv.a(ykoVar, new nlo());
        ykoVar.i().o(new zzo());
        etf etfVar = new etf();
        etfVar.m(false);
        etfVar.n(false);
        etfVar.o(new v3p());
        etfVar.q(SearchJarvisCallback.class);
        etfVar.p(SearchJarvisInputProvider.class);
        etfVar.j(CredentialRpcData.ACTION_FETCH, SearchFetchAction.class);
        etfVar.j("rerank", SearchRerankAction.class);
        ykoVar.f().l(etfVar);
        vvh.f30279a = l3p.INSTANCE.e();
        uz.j = o4p.G0();
        ykoVar.f().h().d(w5p.c());
    }
}
