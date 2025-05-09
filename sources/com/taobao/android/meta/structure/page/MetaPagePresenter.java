package com.taobao.android.meta.structure.page;

import android.util.SparseArray;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.page.MetaChildPageAdapter;
import com.taobao.android.meta.structure.page.MetaPagePresenter;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.List;
import tb.acx;
import tb.asi;
import tb.bsi;
import tb.ckf;
import tb.d1a;
import tb.iuc;
import tb.juc;
import tb.ksi;
import tb.njg;
import tb.o02;
import tb.ox;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaPagePresenter extends ox<juc, ksi<a<asi, MetaResult<asi>>, asi, bsi, MetaResult<asi>>> implements iuc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MetaChildPageWidget b;
    public int c;
    public int d;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<MetaChildPageWidget> f8942a = new SparseArray<>();
    public int e = -1;
    public final njg f = kotlin.a.b(new d1a() { // from class: tb.gfz
        @Override // tb.d1a
        public final Object invoke() {
            MetaChildPageAdapter d;
            d = MetaPagePresenter.d(MetaPagePresenter.this);
            return d;
        }
    });

    static {
        t2o.a(993001541);
        t2o.a(993001538);
    }

    public static final MetaChildPageAdapter d(MetaPagePresenter metaPagePresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageAdapter) ipChange.ipc$dispatch("e383c80c", new Object[]{metaPagePresenter});
        }
        ckf.g(metaPagePresenter, "this$0");
        return new MetaChildPageAdapter(metaPagePresenter);
    }

    public static /* synthetic */ Object ipc$super(MetaPagePresenter metaPagePresenter, String str, Object... objArr) {
        if (str.hashCode() == -170288889) {
            super.bind(objArr[0], objArr[1], (yko) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/page/MetaPagePresenter");
    }

    @Override // tb.iuc
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9233479a", new Object[]{this});
            return;
        }
        getIView().k(n0());
        getIView().a(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.meta.structure.page.MetaPagePresenter$initPager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(MetaPagePresenter$initPager$1 metaPagePresenter$initPager$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/page/MetaPagePresenter$initPager$1");
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else {
                    MetaPagePresenter.this.o0(i);
                }
            }
        });
    }

    @Override // tb.iuc
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3ebfb3", new Object[]{this});
            return;
        }
        bsi c = ((acx) getWidget().getModel()).c();
        boolean Y = c.Y();
        c.S0(false);
        MetaChildPageWidget metaChildPageWidget = this.b;
        if (metaChildPageWidget != null) {
            metaChildPageWidget.destroyAndRemoveFromParent();
        }
        this.b = null;
        c.S0(Y);
    }

    @Override // tb.iuc
    public TabBean H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBean) ipChange.ipc$dispatch("25ebc215", new Object[]{this, new Integer(i)});
        }
        return n0().h().get(i);
    }

    @Override // tb.iuc
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7bbd6f", new Object[]{this});
            return;
        }
        acx<a<asi, MetaResult<asi>>> s = getWidget().G2().s();
        ckf.e(s, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<out com.taobao.android.meta.data.MetaCombo, out com.taobao.android.meta.data.MetaResult<out com.taobao.android.meta.data.MetaCombo>>>");
        MetaChildPageWidget B2 = getWidget().B2(s);
        B2.attachToContainer();
        B2.b(this.c);
        B2.m3(getIView().getViewPager());
        B2.u(this.d);
        B2.init();
        this.b = B2;
    }

    @Override // tb.iuc
    public MetaChildPageWidget V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("6d0218d", new Object[]{this});
        }
        return y(this.e);
    }

    @Override // tb.iuc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        if (this.f8942a.size() != 0) {
            int size = this.f8942a.size();
            for (int i2 = 0; i2 < size; i2++) {
                MetaChildPageWidget valueAt = this.f8942a.valueAt(i2);
                if (valueAt != null) {
                    valueAt.b(i);
                }
            }
        }
    }

    @Override // tb.iuc
    public void c0(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56510678", new Object[]{this, list});
            return;
        }
        ckf.g(list, "tabs");
        n0().h().clear();
        n0().h().addAll(list);
        n0().notifyDataSetChanged();
    }

    @Override // tb.iuc
    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5747b99", new Object[]{this, new Integer(i)});
        } else {
            n0().i(i);
        }
    }

    @Override // tb.iuc
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return n0().getCount();
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    /* renamed from: l0 */
    public void bind(juc jucVar, ksi<a<asi, MetaResult<asi>>, asi, bsi, MetaResult<asi>> ksiVar, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47455fc9", new Object[]{this, jucVar, ksiVar, ykoVar});
            return;
        }
        ckf.d(ksiVar);
        ((acx) ksiVar.getModel()).d().f().l(System.currentTimeMillis());
        super.bind(jucVar, ksiVar, ykoVar);
    }

    public final MetaChildPageAdapter n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageAdapter) ipChange.ipc$dispatch("4cac931b", new Object[]{this});
        }
        return (MetaChildPageAdapter) this.f.getValue();
    }

    public void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31350e24", new Object[]{this, new Integer(i)});
        } else if (this.f8942a.size() != 0 && this.e != i) {
            MetaChildPageWidget metaChildPageWidget = this.f8942a.get(i);
            if (metaChildPageWidget != null) {
                ((acx) getWidget().getModel()).d().o(((acx) metaChildPageWidget.getModel()).e());
            } else {
                metaChildPageWidget = null;
            }
            MetaChildPageWidget metaChildPageWidget2 = this.f8942a.get(this.e);
            if (metaChildPageWidget2 != null) {
                BaseMetaPageController<a<asi, MetaResult<asi>>, asi, MetaResult<asi>> G2 = getWidget().G2();
                o02 e = ((acx) metaChildPageWidget2.getModel()).e();
                ckf.f(e, "getScopeDatasource(...)");
                G2.g((a) e, metaChildPageWidget2);
                metaChildPageWidget2.c3();
            }
            this.e = i;
            if (metaChildPageWidget != null) {
                metaChildPageWidget.u(this.d);
                BaseMetaPageController<a<asi, MetaResult<asi>>, asi, MetaResult<asi>> G22 = getWidget().G2();
                o02 e2 = ((acx) metaChildPageWidget.getModel()).e();
                ckf.f(e2, "getScopeDatasource(...)");
                G22.B((a) e2, metaChildPageWidget);
                metaChildPageWidget.b3();
                getIView().q(metaChildPageWidget);
            }
        }
    }

    @Override // tb.iuc
    public void u(int i) {
        MetaChildPageWidget metaChildPageWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c912d9a", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        if (this.f8942a.size() != 0 && (metaChildPageWidget = this.f8942a.get(this.e)) != null) {
            metaChildPageWidget.u(i);
        }
    }

    @Override // tb.iuc
    public MetaChildPageWidget y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaChildPageWidget) ipChange.ipc$dispatch("84796990", new Object[]{this, new Integer(i)});
        }
        if (n0().getCount() > 0 && this.b != null && i >= 0) {
            BaseMetaPageController<a<asi, MetaResult<asi>>, asi, MetaResult<asi>> G2 = getWidget().G2();
            o02 b = ((acx) getWidget().getModel()).b();
            ckf.f(b, "getInitDatasource(...)");
            if (G2.a(i, (a) b)) {
                ((a) ((acx) getWidget().getModel()).b()).setIndex(i);
                this.f8942a.put(i, this.b);
                MetaChildPageWidget metaChildPageWidget = this.b;
                ckf.d(metaChildPageWidget);
                metaChildPageWidget.b(this.c);
                MetaChildPageWidget metaChildPageWidget2 = this.b;
                ckf.d(metaChildPageWidget2);
                metaChildPageWidget2.u(this.d);
                MetaChildPageWidget metaChildPageWidget3 = this.b;
                ckf.d(metaChildPageWidget3);
                metaChildPageWidget3.f3(true);
                this.b = null;
            }
        }
        MetaChildPageWidget metaChildPageWidget4 = this.f8942a.get(i);
        if (metaChildPageWidget4 != null) {
            return metaChildPageWidget4;
        }
        if (i < 0 || i >= n0().getCount()) {
            return null;
        }
        MetaChildPageWidget A2 = getWidget().A2(i);
        this.f8942a.put(i, A2);
        A2.attachToContainer();
        A2.b(this.c);
        A2.m3(getIView().getViewPager());
        A2.u(this.d);
        A2.init();
        return A2;
    }
}
