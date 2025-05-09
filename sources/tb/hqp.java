package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.shop.ShopSearchHistoryRepo;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.i5p;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hqp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HISTORY_GROUP = "nt_history";

    /* renamed from: a  reason: collision with root package name */
    public final lqp f20823a;
    public or7 b;
    public final Map<String, TemplateBean> c = new HashMap();
    public final Map<String, rpc.c> d = new ConcurrentHashMap();
    public ShopSearchHistoryRepo e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
            } else {
                hqp.a(hqp.this, ja0Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends u0p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(hqp hqpVar, String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1569381830) {
                super.accept((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/discovery/ShopSearchActivateModel$2");
        }

        @Override // tb.u0p
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            super.accept(th);
            TLogTracker.i("Default", "-1", th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hk4<ja0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(ja0 ja0Var) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
                return;
            }
            com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
            Intent intent = hqp.b(hqp.this).getActivity().getIntent();
            if (intent == null || intent.getData() == null) {
                XslModule.d().l().d("ShopSearchActivateModel", "No bundleUrl");
            } else {
                cVar.q(intent.getData().toString());
            }
            cVar.r("Page_Shop_Search");
            xjt.c(cVar, ja0Var.j, XslModule.d(), ja0Var.n);
        }
    }

    static {
        t2o.a(815793319);
    }

    public hqp(lqp lqpVar) {
        this.f20823a = lqpVar;
    }

    public static /* synthetic */ void a(hqp hqpVar, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77ac34", new Object[]{hqpVar, ja0Var});
        } else {
            hqpVar.i(ja0Var);
        }
    }

    public static /* synthetic */ lqp b(hqp hqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqp) ipChange.ipc$dispatch("e8c9560", new Object[]{hqpVar});
        }
        return hqpVar.f20823a;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac91042", new Object[]{this, str});
        } else if (this.e != null) {
            ActivateBean activateBean = new ActivateBean();
            activateBean.keyword = str;
            activateBean.groupType = "nt_history";
            this.e.f(activateBean);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7825bcf", new Object[]{this, str});
            return;
        }
        ShopSearchHistoryRepo shopSearchHistoryRepo = this.e;
        if (shopSearchHistoryRepo != null) {
            shopSearchHistoryRepo.g(str);
        }
    }

    public void e(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73b668", new Object[]{this, activateBean});
            return;
        }
        ShopSearchHistoryRepo shopSearchHistoryRepo = this.e;
        if (shopSearchHistoryRepo != null) {
            shopSearchHistoryRepo.i(activateBean);
        }
    }

    public TemplateBean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str});
        }
        return (TemplateBean) ((HashMap) this.c).get(str);
    }

    public rpc.c g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (rpc.c) ((ConcurrentHashMap) this.d).get(str);
    }

    public final List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5543bee9", new Object[]{this});
        }
        return Arrays.asList(o4p.v().split("&"));
    }

    public final void i(ja0 ja0Var) {
        List<ActivateTypedBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b35748f", new Object[]{this, ja0Var});
        } else if (ja0Var == null || (list = ja0Var.g) == null || ((ArrayList) list).size() == 0) {
            b4p.b("ShopSearchActivateModel", "activate cell list is empty");
        } else {
            ((HashMap) this.c).clear();
            Map<String, TemplateBean> map = ja0Var.j;
            if (map != null) {
                ((HashMap) this.c).putAll(map);
            }
            ((ConcurrentHashMap) this.d).putAll(ja0Var.n);
            ArrayList arrayList = new ArrayList();
            List<ActivateTypedBean> list2 = ja0Var.g;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            HistoryCellBean historyCellBean = ja0Var.f;
            if (!(historyCellBean == null || this.e == null)) {
                arrayList.remove(historyCellBean);
                this.e.n(ja0Var.f);
                arrayList.add(0, this.e.l());
            }
            this.f20823a.z2(arrayList);
            this.f20823a.B2(ja0Var.l);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577bfaa1", new Object[]{this, str});
            return;
        }
        ShopSearchHistoryRepo shopSearchHistoryRepo = new ShopSearchHistoryRepo(this.f20823a.getActivity(), "shop_search_history");
        this.e = shopSearchHistoryRepo;
        shopSearchHistoryRepo.o(this.f20823a);
        this.e.k(str);
    }

    public void k(String str, String str2, SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da079", new Object[]{this, str, str2, searchDoorContext});
            return;
        }
        or7 or7Var = this.b;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.b.dispose();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("seller_id", str);
        hashMap.put("shop_id", str2);
        boolean equals = "true".equals(this.f20823a.getModel().w().get(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        List<String> h = h();
        if (h != null) {
            for (String str3 : h) {
                String q = searchDoorContext.q(str3);
                if (!TextUtils.isEmpty(q)) {
                    hashMap.put(str3, q);
                }
            }
        }
        hashMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(equals));
        this.b = new i5p.c().c(new vnp("suggest", hashMap)).b(new ha0("")).d(new v5p("Default")).a().e().i(new c()).j().n(new a(), new b(this, i2p.TYPE_ACTIVATE));
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29feb9e", new Object[]{this, str});
            return;
        }
        ShopSearchHistoryRepo shopSearchHistoryRepo = this.e;
        if (shopSearchHistoryRepo != null) {
            shopSearchHistoryRepo.j(str);
        }
    }
}
