package com.taobao.search.searchdoor.shop;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.a;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.shop.ShopSearchHistoryRepo;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ckf;
import tb.d1a;
import tb.o4p;
import tb.pqp;
import tb.qqp;
import tb.t2o;
import tb.wz3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ShopSearchHistoryRepo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a.g f11676a;
    public final qqp b;
    public final List<ActivateBean> c = new ArrayList();
    public HistoryCellBean d;

    static {
        t2o.a(815793291);
    }

    public ShopSearchHistoryRepo(Context context, String str) {
        ckf.g(context, "context");
        ckf.g(str, "tableName");
        this.b = new qqp(context, str, 0, 4, null);
        HistoryCellBean historyCellBean = new HistoryCellBean();
        historyCellBean.name = Localization.q(R.string.taobao_app_1005_1_16659);
        historyCellBean.type = "nt_history";
        this.d = historyCellBean;
    }

    public static final /* synthetic */ List b(ShopSearchHistoryRepo shopSearchHistoryRepo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("42f5c351", new Object[]{shopSearchHistoryRepo});
        }
        return shopSearchHistoryRepo.c;
    }

    public static final /* synthetic */ qqp c(ShopSearchHistoryRepo shopSearchHistoryRepo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqp) ipChange.ipc$dispatch("25abeb7e", new Object[]{shopSearchHistoryRepo});
        }
        return shopSearchHistoryRepo.b;
    }

    public static final /* synthetic */ void d(ShopSearchHistoryRepo shopSearchHistoryRepo, d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ea72d9", new Object[]{shopSearchHistoryRepo, d1aVar});
        } else {
            shopSearchHistoryRepo.m(d1aVar);
        }
    }

    public static final /* synthetic */ void e(ShopSearchHistoryRepo shopSearchHistoryRepo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f58233d", new Object[]{shopSearchHistoryRepo});
        } else {
            shopSearchHistoryRepo.p();
        }
    }

    public static final xhv s(ShopSearchHistoryRepo shopSearchHistoryRepo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b760f088", new Object[]{shopSearchHistoryRepo});
        }
        ckf.g(shopSearchHistoryRepo, "this$0");
        shopSearchHistoryRepo.h();
        return xhv.INSTANCE;
    }

    public static final void u(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16fdb8", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, "$block");
        d1aVar.invoke();
    }

    public final void f(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13cc2bd", new Object[]{this, activateBean});
            return;
        }
        ckf.g(activateBean, "activateBean");
        Iterator it = ((ArrayList) this.c).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (ckf.b(((ActivateBean) it.next()).keyword, activateBean.keyword)) {
                break;
            } else {
                i++;
            }
        }
        if (i != 0) {
            if (i > 0) {
                ((ArrayList) this.c).remove(i);
            }
            ((ArrayList) this.c).add(0, activateBean);
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7825bcf", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        this.b.b(str);
        ((ArrayList) this.c).clear();
        m(new d1a() { // from class: tb.wnz
            @Override // tb.d1a
            public final Object invoke() {
                xhv s;
                s = ShopSearchHistoryRepo.s(ShopSearchHistoryRepo.this);
                return s;
            }
        });
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c9f1ae", new Object[]{this});
            return;
        }
        a.g gVar = this.f11676a;
        if (gVar != null) {
            HistoryCellBean historyCellBean = this.d;
            historyCellBean.activateItems = this.c;
            gVar.onHistoryDeleted(historyCellBean);
        }
    }

    public final void i(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73b668", new Object[]{this, activateBean});
            return;
        }
        ckf.g(activateBean, "bean");
        ((ArrayList) this.c).remove(activateBean);
        p();
    }

    public final void j(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe77ae4b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        if (((ArrayList) this.c).size() > 0) {
            final ArrayList arrayList = new ArrayList();
            int G = o4p.G(10);
            if (((ArrayList) this.c).size() > G) {
                arrayList.addAll(((ArrayList) this.c).subList(0, G));
            } else {
                arrayList.addAll(this.c);
            }
            Coordinator.execute(new Runnable() { // from class: tb.xnz
                @Override // java.lang.Runnable
                public final void run() {
                    ShopSearchHistoryRepo.t(str, arrayList, this);
                }
            });
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f6d44", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        Coordinator.execute(new ShopSearchHistoryRepo$getAllHistoryData$1(this, str));
    }

    public final HistoryCellBean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryCellBean) ipChange.ipc$dispatch("f56c0069", new Object[]{this});
        }
        return this.d;
    }

    public final void m(final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1572062", new Object[]{this, d1aVar});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.ynz
                @Override // java.lang.Runnable
                public final void run() {
                    ShopSearchHistoryRepo.u(d1a.this);
                }
            });
        }
    }

    public final void n(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cfdc51", new Object[]{this, historyCellBean});
            return;
        }
        ckf.g(historyCellBean, "historyCellBean");
        this.d = historyCellBean;
        List<ActivateBean> list = this.c;
        historyCellBean.activateItems = list;
        ckf.f(list, "activateItems");
        for (ActivateBean activateBean : list) {
            activateBean.suggestRn = historyCellBean.suggestRn;
        }
    }

    public final void o(a.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98e24ff", new Object[]{this, gVar});
        } else {
            this.f11676a = gVar;
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14bded0", new Object[]{this});
            return;
        }
        a.g gVar = this.f11676a;
        if (gVar != null) {
            HistoryCellBean historyCellBean = this.d;
            historyCellBean.activateItems = this.c;
            gVar.onHistoryUpdated(historyCellBean);
        }
    }

    public static final void t(String str, List list, ShopSearchHistoryRepo shopSearchHistoryRepo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f4ccb", new Object[]{str, list, shopSearchHistoryRepo});
            return;
        }
        ckf.g(str, "$id");
        ckf.g(list, "$result");
        ckf.g(shopSearchHistoryRepo, "this$0");
        shopSearchHistoryRepo.b.a(new pqp(str, wz3.a(list)));
    }
}
