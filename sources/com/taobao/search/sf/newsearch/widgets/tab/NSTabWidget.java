package com.taobao.search.sf.newsearch.widgets.tab;

import android.app.Activity;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.musie.tab.TbTabView;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import tb.acx;
import tb.auc;
import tb.kr1;
import tb.o02;
import tb.oxb;
import tb.phw;
import tb.prs;
import tb.qxd;
import tb.smt;
import tb.t2o;
import tb.ude;
import tb.vdd;
import tb.vfw;
import tb.vrd;
import tb.wdd;
import tb.y64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NSTabWidget extends phw<List<TabBean>, TbTabView, acx<? extends o02<? extends BaseSearchResult, ?>>> implements qxd, wdd, vrd, auc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int f = DensityUtil.dip2px(Globals.getApplication(), 42.0f);
    public static final int g = DensityUtil.dip2px(Globals.getApplication(), 18.0f);
    public static final int h = DensityUtil.dip2px(Globals.getApplication(), 16.0f);
    public static final int i = Color.parseColor("#FF5500");
    public static final int j = Color.parseColor("#111111");
    public static final int k = DensityUtil.dip2px(Globals.getApplication(), 17.0f);

    /* renamed from: a  reason: collision with root package name */
    public TbTabView f11701a;
    public final prs b;
    public final prs c;
    public qxd d;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewPager f11703a;

        public a(NSTabWidget nSTabWidget, ViewPager viewPager) {
            this.f11703a = viewPager;
        }

        @Override // tb.qxd
        public void D(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i)});
            } else {
                this.f11703a.setCurrentItem(i, true);
            }
        }
    }

    static {
        t2o.a(815793444);
        t2o.a(815792773);
        t2o.a(815793583);
        t2o.a(993001511);
        t2o.a(993001866);
    }

    public NSTabWidget(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        prs.a aVar = new prs.a();
        int i2 = h;
        prs b = aVar.d(i2).c(j).b();
        prs b2 = new prs.a().d(i2).c(-1).b();
        prs b3 = new prs.a().d(g).c(i).a(true).b();
        this.b = b;
        this.c = b3;
        vdd vddVar = (vdd) getModel().d().h(vdd.CONFIG_KEY);
        if (vddVar != null) {
            vddVar.l2(this);
        }
        if (t2()) {
            this.b = b2;
        }
    }

    public static /* synthetic */ Object ipc$super(NSTabWidget nSTabWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/tab/NSTabWidget");
    }

    public static /* synthetic */ TbTabView q2(NSTabWidget nSTabWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbTabView) ipChange.ipc$dispatch("b8d0aed6", new Object[]{nSTabWidget});
        }
        return nSTabWidget.f11701a;
    }

    @Override // tb.qxd
    public void D(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i2)});
            return;
        }
        qxd qxdVar = this.d;
        if (qxdVar != null) {
            qxdVar.D(i2);
        }
    }

    @Override // tb.vrd
    public void D0(MetaResult<? extends y64> metaResult, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae5d4ba", new Object[]{this, metaResult, viewPager});
            return;
        }
        bindWithData(metaResult.getTabs());
        if (!this.e) {
            this.e = true;
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.search.sf.newsearch.widgets.tab.NSTabWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i2, float f2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
                    } else {
                        NSTabWidget.q2(NSTabWidget.this).setTabSelected(i2);
                    }
                }
            });
            v2(new a(this, viewPager));
        }
        if (metaResult.getTabs() != null) {
            int size = metaResult.getTabs().size();
            for (int i2 = 0; i2 < size; i2++) {
                if (metaResult.getTabs().get(i2).isSelected) {
                    if (i2 > 0) {
                        viewPager.setCurrentItem(i2, false);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // tb.auc
    public void K0(boolean z, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f2)});
        }
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        } else {
            ((TbTabView) getView()).setVisibility(0);
        }
    }

    @Override // tb.auc
    public void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i2)});
        }
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return null;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "NSTabWidget";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        } else {
            ((TbTabView) getView()).setVisibility(8);
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: s2 */
    public void bindWithData(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8ea7e5", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
            this.f11701a.setVisibility(8);
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (TabBean tabBean : list) {
                arrayList.add(new smt(tabBean.showText));
            }
            this.f11701a.setTabs(arrayList);
        }
    }

    public final boolean t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (getActivity() instanceof oxb) {
            return ((oxb) getActivity()).E1();
        }
        return false;
    }

    /* renamed from: u2 */
    public TbTabView onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbTabView) ipChange.ipc$dispatch("eb3fefa2", new Object[]{this});
        }
        TbTabView tbTabView = new TbTabView(getActivity());
        this.f11701a = tbTabView;
        tbTabView.setLayoutParams(new ViewGroup.LayoutParams(-1, f));
        this.f11701a.setFillViewport(true);
        this.f11701a.setPadding(0, 0);
        this.f11701a.setItemInset(k);
        this.f11701a.setStyle(this.b, this.c);
        this.f11701a.setTabClickListener(this);
        return this.f11701a;
    }

    public void v2(qxd qxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8365b8", new Object[]{this, qxdVar});
        } else {
            this.d = qxdVar;
        }
    }

    @Override // tb.wdd
    public void w1(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
            return;
        }
        if (!t2()) {
            this.b.g(sFPromotionBean.d);
        }
        this.c.g(sFPromotionBean.e);
        TbTabView tbTabView = this.f11701a;
        if (tbTabView != null) {
            tbTabView.setStyle(this.b, this.c);
        }
    }
}
