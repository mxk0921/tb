package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t5p extends rz<TabLayout, pib> implements qib, TabLayout.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public NxTabLayout d;
    public SFPromotionBean e;
    public SFPromotionBean f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f28503a;

        public a(int i) {
            this.f28503a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TabLayout.f tabAt = t5p.Q(t5p.this).getTabAt(this.f28503a);
            if (tabAt != null) {
                tabAt.l();
            }
        }
    }

    static {
        t2o.a(815793794);
        t2o.a(993001693);
    }

    public static /* synthetic */ NxTabLayout Q(t5p t5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NxTabLayout) ipChange.ipc$dispatch("94ec5474", new Object[]{t5pVar});
        }
        return t5pVar.d;
    }

    public static /* synthetic */ Object ipc$super(t5p t5pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/tab/SearchSrpTabView");
    }

    public final void R(SFPromotionBean sFPromotionBean) {
        TabBean W;
        veq veqVar;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2ff859", new Object[]{this, sFPromotionBean});
        } else if (sFPromotionBean != null) {
            boolean V = V();
            for (int i3 = 0; i3 < this.d.getTabCount(); i3++) {
                TabLayout.f tabAt = this.d.getTabAt(i3);
                if (!(tabAt == null || (W = P().W(tabAt)) == null || (veqVar = (veq) tabAt.h()) == null)) {
                    if ("img".equals(W.showType)) {
                        U(W, veqVar);
                    } else if (V) {
                        String str = W.showText;
                        if (W.isSelected) {
                            i2 = sFPromotionBean.e;
                        } else {
                            i2 = -1;
                        }
                        veqVar.g(str, i2);
                    } else {
                        String str2 = W.showText;
                        if (W.isSelected) {
                            i = sFPromotionBean.e;
                        } else {
                            i = sFPromotionBean.d;
                        }
                        veqVar.g(str2, i);
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public TabLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("47547738", new Object[]{this, context, viewGroup});
        }
        NxTabLayout nxTabLayout = (NxTabLayout) LayoutInflater.from(context).inflate(R.layout.tbsearch_nx_tab, viewGroup, false);
        this.d = nxTabLayout;
        nxTabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.d;
    }

    /* renamed from: T */
    public TabLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("b904a075", new Object[]{this});
        }
        return this.d;
    }

    public final void U(TabBean tabBean, veq veqVar) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c3010", new Object[]{this, tabBean, veqVar});
            return;
        }
        if (tabBean.isSelected) {
            i = this.e.e;
        } else {
            i = this.e.d;
        }
        if (V()) {
            if (tabBean.isSelected) {
                i = this.e.e;
            } else {
                i = -1;
            }
        }
        if (!TextUtils.isEmpty(tabBean.templateImage)) {
            str = tabBean.templateImage;
            if (!V()) {
                veqVar.c.setColorFilter(i);
            } else if (tabBean.isSelected) {
                veqVar.c.setColorFilter(i);
            } else {
                veqVar.c.clearColorFilter();
            }
        } else {
            if (tabBean.isSelected) {
                str = tabBean.activeImage;
            } else {
                str = tabBean.normalImage;
            }
            veqVar.g(tabBean.showText, i);
        }
        veqVar.e(tabBean.isSelected);
        if (!TextUtils.isEmpty(str)) {
            veqVar.c(str, tabBean.imageWidth, tabBean.imageHeight, tabBean.showText);
        }
    }

    public final boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(this.d.getContext() instanceof oxb) || !((oxb) this.d.getContext()).E1()) {
            return false;
        }
        return true;
    }

    public void W(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7be", new Object[]{this, sFPromotionBean});
            return;
        }
        this.e = sFPromotionBean;
        if (this.f == null) {
            R(sFPromotionBean);
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5858aeca", new Object[]{this});
            return;
        }
        this.f = null;
        R(this.e);
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1032112", new Object[]{this});
            return;
        }
        SFPromotionBean sFPromotionBean = new SFPromotionBean();
        sFPromotionBean.f11550a = 10001;
        sFPromotionBean.c = -1;
        sFPromotionBean.b = null;
        int color = this.c.getResources().getColor(R.color.tbsearch_srp_tab_text_unselected);
        int color2 = this.c.getResources().getColor(R.color.tbsearch_tab_selected);
        sFPromotionBean.d = color;
        sFPromotionBean.e = color2;
        this.f = sFPromotionBean;
        R(sFPromotionBean);
    }

    @Override // tb.qib
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c8ee3b", new Object[]{this, fVar});
        }
    }

    @Override // tb.qib
    public void s(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a72c3f", new Object[]{this, viewPager, new Boolean(z)});
            return;
        }
        TabLayout T = getView();
        T.setTabMode(0);
        T.addOnTabSelectedListener((TabLayout.d) this);
        T.setupWithViewPager(viewPager);
    }

    @Override // tb.qib
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.d.setVisibility(0);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca6e1a1", new Object[]{this, fVar});
            return;
        }
        TabBean W = P().W(fVar);
        if (W == null) {
            b4p.b("MySrpTabView", "onTabUnselected: fail to get tab bean");
            return;
        }
        W.isSelected = false;
        veq veqVar = (veq) fVar.h();
        if (veqVar != null) {
            if ("img".equals(W.showType)) {
                U(W, veqVar);
                return;
            }
            veqVar.g(W.showText, this.e.d);
            veqVar.e(W.isSelected);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.f fVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48ba408", new Object[]{this, fVar});
            return;
        }
        TabBean W = P().W(fVar);
        if (W == null) {
            b4p.b("MySrpTabView", "onTabSelected: fail to get tab bean");
            return;
        }
        W.isSelected = true;
        if (!TextUtils.isEmpty(W.bizName)) {
            sen.e(W.bizName);
        }
        if (((veq) fVar.h()) != null) {
            boolean V = V();
            SFPromotionBean sFPromotionBean = this.e;
            SFPromotionBean sFPromotionBean2 = this.f;
            if (sFPromotionBean2 != null) {
                sFPromotionBean = sFPromotionBean2;
            }
            for (int i2 = 0; i2 < this.d.getTabCount(); i2++) {
                TabLayout.f tabAt = this.d.getTabAt(i2);
                if (tabAt != null) {
                    TabBean W2 = P().W(tabAt);
                    veq veqVar = (veq) tabAt.h();
                    if (veqVar != null) {
                        if ("img".equals(W2.showType)) {
                            U(W2, veqVar);
                        } else {
                            if (V) {
                                veqVar.g(W2.showText, W2.isSelected ? sFPromotionBean.e : -1);
                            } else {
                                String str = W2.showText;
                                if (W2.isSelected) {
                                    i = sFPromotionBean.e;
                                } else {
                                    i = sFPromotionBean.d;
                                }
                                veqVar.g(str, i);
                            }
                            veqVar.e(W2.isSelected);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.qib
    public void r() {
        TabBean W;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2e729", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.d.getContext());
        boolean V = V();
        if (from != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.getTabCount(); i3++) {
                TabLayout.f tabAt = this.d.getTabAt(i3);
                if (!(tabAt == null || (W = P().W(tabAt)) == null)) {
                    veq veqVar = new veq(from, this.d.getContext(), ((acx) ((s5p) P()).getWidget().getModel()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
                    tabAt.r(veqVar);
                    tabAt.o(veqVar.f29966a);
                    ViewGroup viewGroup = (ViewGroup) veqVar.f29966a.getParent();
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                    }
                    if ("img".equals(W.showType)) {
                        U(W, veqVar);
                    } else {
                        if (V) {
                            veqVar.g(W.showText, W.isSelected ? this.e.e : -1);
                        } else {
                            String str = W.showText;
                            if (W.isSelected) {
                                i = this.e.e;
                            } else {
                                i = this.e.d;
                            }
                            veqVar.g(str, i);
                        }
                        veqVar.e(W.isSelected);
                    }
                    if (W.isSelected) {
                        i2 = i3;
                    }
                }
            }
            this.d.post(new a(i2));
        }
    }
}
