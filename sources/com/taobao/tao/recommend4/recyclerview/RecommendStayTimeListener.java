package com.taobao.tao.recommend4.recyclerview;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.imn;
import tb.lrj;
import tb.m5a;
import tb.pb6;
import tb.pof;
import tb.py;
import tb.t2o;
import tb.tit;
import tb.uqa;
import tb.ynf;
import tb.z4a;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendStayTimeListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<z4a> h;

    /* renamed from: a  reason: collision with root package name */
    public z4a f12707a;
    public List<py> b;
    public int c;
    public List<SectionModel> d;
    public int e = -1;
    public ViewPager.OnPageChangeListener f;
    public ViewPager g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RecommendStayTimeListener.b(RecommendStayTimeListener.this);
            }
        }
    }

    static {
        t2o.a(729810053);
        ArrayList arrayList = new ArrayList(3);
        h = arrayList;
        arrayList.add(z4a.REC_ORDER_LIST_CATAPULT);
        arrayList.add(z4a.REC_PAY_SUCCESS);
        arrayList.add(z4a.REC_CART);
        arrayList.add(z4a.REC_ORDER_LIST);
        arrayList.add(z4a.REC_ORDER_DETAIL);
        arrayList.add(z4a.REC_LOGISTICS);
        arrayList.add(z4a.REC_CONFIRM_RECEIPT);
    }

    public RecommendStayTimeListener(z4a z4aVar) {
        L(z4aVar);
    }

    public static /* synthetic */ void b(RecommendStayTimeListener recommendStayTimeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e48084", new Object[]{recommendStayTimeListener});
        } else {
            recommendStayTimeListener.K();
        }
    }

    public static /* synthetic */ Object ipc$super(RecommendStayTimeListener recommendStayTimeListener, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/recyclerview/RecommendStayTimeListener");
        }
    }

    public static /* synthetic */ ViewPager o(RecommendStayTimeListener recommendStayTimeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("e32a95ec", new Object[]{recommendStayTimeListener});
        }
        return recommendStayTimeListener.g;
    }

    public static /* synthetic */ void p(RecommendStayTimeListener recommendStayTimeListener, ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a39fa7b", new Object[]{recommendStayTimeListener, childRecyclerView, new Integer(i)});
        } else {
            recommendStayTimeListener.s(childRecyclerView, i);
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29fbe", new Object[]{this});
            return;
        }
        List<py> list = this.b;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((py) it.next()).n();
            }
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a7b6a4", new Object[]{this})).booleanValue();
        }
        z4a z4aVar = this.f12707a;
        if (z4aVar == z4a.REC_ORDER_LIST_CATAPULT || z4aVar == z4a.REC_ORDER_LIST) {
            return true;
        }
        return false;
    }

    public void E(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dce2f97", new Object[]{this, childRecyclerView});
        } else {
            I(childRecyclerView);
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            m5a.a().g(new a(), 0L);
        }
    }

    public void G(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91f01c6", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!(recyclerView instanceof ChildRecyclerView)) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onWindowVisibilityChanged, view not ChildRecyclerView, discard");
        } else if (i != 0 || x(recyclerView)) {
            s((ChildRecyclerView) recyclerView, i);
        } else {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onWindowVisibilityChanged, view not onScreen, discard");
        }
    }

    public final void I(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6972a98", new Object[]{this, childRecyclerView});
        } else if (C()) {
            if (this.f != null) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "already register viewPager listener, discard");
                return;
            }
            ViewPager v = v(childRecyclerView);
            this.g = v;
            if (v == null) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "viewPager is null, discard");
                return;
            }
            ViewPager.OnPageChangeListener t = t(childRecyclerView);
            this.f = t;
            this.g.addOnPageChangeListener(t);
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "register viewPager listener success");
        }
    }

    public final void K() {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4036f37d", new Object[]{this});
        } else if (C() && (onPageChangeListener = this.f) != null && (viewPager = this.g) != null) {
            viewPager.removeOnPageChangeListener(onPageChangeListener);
            this.f = null;
            this.g = null;
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "remove viewPager listener success");
        }
    }

    public void L(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
            return;
        }
        this.f12707a = z4aVar;
        if (((ArrayList) h).contains(z4aVar)) {
            ArrayList arrayList = new ArrayList(2);
            this.b = arrayList;
            arrayList.add(new ynf(z4aVar.c, z4aVar.f32522a));
            this.b.add(new pof(z4aVar.c, z4aVar.f32522a));
            return;
        }
        this.b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && (recyclerView instanceof ChildRecyclerView)) {
            r((ChildRecyclerView) recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (recyclerView instanceof ChildRecyclerView) {
            r((ChildRecyclerView) recyclerView);
        }
    }

    public final void r(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648b5eef", new Object[]{this, childRecyclerView});
        } else if (this.b != null) {
            int u = u(childRecyclerView);
            this.c = u;
            if (u != Integer.MAX_VALUE) {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((py) it.next()).a(childRecyclerView, this.c);
                }
            }
        }
    }

    public final void s(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f426ff8", new Object[]{this, childRecyclerView, new Integer(i)});
        } else if (!z(this.e, i)) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, visible not change, discard. current=" + this.e);
        } else {
            this.e = i;
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, change visibility to " + i);
            if (i == 0) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, start calculate");
                r(childRecyclerView);
                return;
            }
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, start leave");
            B();
        }
    }

    public final ViewPager.OnPageChangeListener t(final ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("8a179641", new Object[]{this, childRecyclerView});
        }
        return new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.recommend4.recyclerview.RecommendStayTimeListener.2
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
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                try {
                    uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onPageSelected");
                    if (RecommendStayTimeListener.o(RecommendStayTimeListener.this).findFocus() == childRecyclerView.getNestedScrollParent()) {
                        RecommendStayTimeListener.p(RecommendStayTimeListener.this, childRecyclerView, 0);
                    } else {
                        RecommendStayTimeListener.p(RecommendStayTimeListener.this, childRecyclerView, 4);
                    }
                } catch (Throwable th) {
                    uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", th.getMessage());
                }
            }
        };
    }

    public final int u(RecyclerView recyclerView) {
        String str;
        imn d;
        AwesomeGetContainerInnerData q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6353dba", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null || (d = zza.d((str = this.f12707a.f32522a))) == null || (q = d.q(str)) == null) {
            return Integer.MAX_VALUE;
        }
        List<SectionModel> sections = q.getSections();
        if (this.d == sections) {
            return this.c;
        }
        this.d = sections;
        if (sections == null || sections.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < sections.size(); i++) {
            if (!w(sections.get(i))) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final ViewPager v(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("d9bc1a58", new Object[]{this, childRecyclerView});
        }
        if (childRecyclerView == null) {
            return null;
        }
        lrj nestedScrollParent = childRecyclerView.getNestedScrollParent();
        if (!(nestedScrollParent instanceof ViewGroup)) {
            return null;
        }
        ViewParent viewParent = (ViewGroup) nestedScrollParent;
        while (viewParent != null) {
            viewParent = viewParent.getParent();
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "getViewPager, target:".concat(viewParent.getClass().getSimpleName()));
            if (!(viewParent instanceof ViewPager)) {
                if (viewParent instanceof ViewGroup) {
                    if (viewParent instanceof ViewPager.DecorView) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return (ViewPager) viewParent;
            }
        }
        return null;
    }

    public final boolean x(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4228eb1a", new Object[]{this, recyclerView})).booleanValue();
        }
        if (recyclerView == null || recyclerView.getContext() == null || !recyclerView.isShown()) {
            return false;
        }
        int[] iArr = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (i < 0 || i > pb6.s(recyclerView.getContext())) {
            return false;
        }
        return true;
    }

    public final boolean z(int i, int i2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3acc5ee3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return true;
        }
        return false;
    }

    public final boolean w(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afed0e7", new Object[]{this, sectionModel})).booleanValue();
        }
        return (sectionModel == null || sectionModel.getJSONObject("template") == null || !TextUtils.equals("one", tit.c(sectionModel.getJSONObject("template")))) ? false : true;
    }
}
