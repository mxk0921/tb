package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXViewPageOnTabChangeEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import com.taobao.android.dinamicx.widget.viewpager.LazyViewPagerAdapter;
import com.taobao.android.dinamicx.widget.viewpager.ViewPagerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.bi6;
import tb.bmv;
import tb.c4o;
import tb.jb6;
import tb.mf6;
import tb.mw5;
import tb.ql6;
import tb.qub;
import tb.r26;
import tb.t2o;
import tb.xv5;
import tb.xxl;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXViewPager extends DXAbsContainerBaseLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIEWPAGER_DATASOURCE = -5948810534719014123L;
    public static final long DXVIEWPAGER_ENABLELAZYLOAD = 4265396554456303765L;
    public static final int DXVIEWPAGER_ENABLELAZYLOAD_TRUE = 1;
    public static final long DXVIEWPAGER_ENABLESCROLL_ANDROID = -5660415192656710902L;
    public static final long DXVIEWPAGER_FIXMULTINESTEDSCROLL_ANDROID = -8291848680749278880L;
    public static final long DXVIEWPAGER_ONCREATE = 5288680013941347641L;
    public static final long DXVIEWPAGER_ONTABCHANGED = -7836695228328867158L;
    public static final long DXVIEWPAGER_PAGELIMITKEEPINDEXES = 5075676565731354373L;
    public static final long DXVIEWPAGER_PAGELIMITSIZE = 3249025493328468804L;
    public static final long DXVIEWPAGER_RECURSIVESEARCHRL = -6303840311879476771L;
    public static final long DXVIEWPAGER_SCROLLENABLED = -8352681166307095225L;
    public static final int DXVIEWPAGER_SCROLLENABLED_TRUE = 1;
    public static final long DXVIEWPAGER_SELECTED = 6456471229575806289L;
    public static final long DXVIEWPAGER_VIEWPAGER = -4553855868367056749L;
    public String j;
    public Set<Integer> k;
    public boolean m;
    public int p;
    public int q;
    public int s;
    public WeakReference<ViewPager> v;
    public JSONArray w;
    public p x;
    public SparseBooleanArray y;
    public int h = 1;
    public boolean i = false;
    public int l = Integer.MAX_VALUE;
    public boolean n = true;
    public boolean o = false;
    public int r = -1;
    public int t = 3;
    public int u = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f7405a;

        public a(JSONArray jSONArray) {
            this.f7405a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = -1;
            try {
                i = this.f7405a.getIntValue(0);
                if (this.f7405a.size() > 1) {
                    z = this.f7405a.getBooleanValue(1);
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
            if (i >= 0 && DXViewPager.C(DXViewPager.this) != null && DXViewPager.C(DXViewPager.this).get() != null) {
                ((ViewPager) DXViewPager.C(DXViewPager.this).get()).setCurrentItem(i, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXViewPager.L(DXViewPager.this, DXViewPager.this.y().get(DXViewPager.G(DXViewPager.this)));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXWidgetNode f7407a;

        public c(DXWidgetNode dXWidgetNode) {
            this.f7407a = dXWidgetNode;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXWidgetNode dXWidgetNode = this.f7407a;
            if (dXWidgetNode != null) {
                ((DXRecyclerLayout) dXWidgetNode).a1();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597433);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXViewPager();
        }
    }

    static {
        t2o.a(444597427);
    }

    public static /* synthetic */ WeakReference C(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("278cf402", new Object[]{dXViewPager});
        }
        return dXViewPager.v;
    }

    public static /* synthetic */ int D(DXViewPager dXViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8a8cc5f", new Object[]{dXViewPager, new Integer(i)})).intValue();
        }
        dXViewPager.u = i;
        return i;
    }

    public static /* synthetic */ int E(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db027e70", new Object[]{dXViewPager})).intValue();
        }
        int i = dXViewPager.u;
        dXViewPager.u = 1 + i;
        return i;
    }

    public static /* synthetic */ int F(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a8147a9", new Object[]{dXViewPager})).intValue();
        }
        return dXViewPager.t;
    }

    public static /* synthetic */ int G(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d59cea", new Object[]{dXViewPager})).intValue();
        }
        return dXViewPager.q;
    }

    public static /* synthetic */ int H(DXViewPager dXViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb15721d", new Object[]{dXViewPager, new Integer(i)})).intValue();
        }
        dXViewPager.q = i;
        return i;
    }

    public static /* synthetic */ void I(DXViewPager dXViewPager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a84a498", new Object[]{dXViewPager, new Integer(i), new Integer(i2)});
        } else {
            dXViewPager.Y(i, i2);
        }
    }

    public static /* synthetic */ int J(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("167e476c", new Object[]{dXViewPager})).intValue();
        }
        return dXViewPager.r;
    }

    public static /* synthetic */ int K(DXViewPager dXViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8217db", new Object[]{dXViewPager, new Integer(i)})).intValue();
        }
        dXViewPager.r = i;
        return i;
    }

    public static /* synthetic */ void L(DXViewPager dXViewPager, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf12f9b5", new Object[]{dXViewPager, dXWidgetNode});
        } else {
            dXViewPager.h0(dXWidgetNode);
        }
    }

    public static /* synthetic */ int M(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6926f1ee", new Object[]{dXViewPager})).intValue();
        }
        return dXViewPager.s;
    }

    public static /* synthetic */ int N(DXViewPager dXViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efeebd99", new Object[]{dXViewPager, new Integer(i)})).intValue();
        }
        dXViewPager.s = i;
        return i;
    }

    public static /* synthetic */ SparseBooleanArray O(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseBooleanArray) ipChange.ipc$dispatch("f210622f", new Object[]{dXViewPager});
        }
        return dXViewPager.y;
    }

    public static /* synthetic */ Object ipc$super(DXViewPager dXViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2006646564:
                return super.y();
            case -1888777308:
                super.z((DXRuntimeContext) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -630327606:
                super.sendBroadcastEvent((DXEvent) objArr[0]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 1825628053:
                return super.invokeRefMethod((String) objArr[0], (JSONArray) objArr[1]);
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXViewPager");
        }
    }

    public ViewPagerAdapter P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPagerAdapter) ipChange.ipc$dispatch("383c365", new Object[]{this, context});
        }
        if (this.i) {
            return new LazyViewPagerAdapter(this, y(), context);
        }
        return new ViewPagerAdapter(this, y(), context);
    }

    public final DXWidgetNode Q(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5ee1c607", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return dXWidgetNode;
        }
        if (dXWidgetNode.getChildrenCount() <= 0 || (list = dXWidgetNode.children) == null) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode2 : list) {
            DXWidgetNode Q = Q(dXWidgetNode2);
            if (Q instanceof DXRecyclerLayout) {
                return Q;
            }
        }
        return null;
    }

    public final boolean R(DXWidgetNode dXWidgetNode, DXNestedScrollerView dXNestedScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dd00ed3", new Object[]{this, dXWidgetNode, dXNestedScrollerView})).booleanValue();
        }
        if (dXWidgetNode != null) {
            View D = dXWidgetNode.getDXRuntimeContext().D();
            if ((dXWidgetNode instanceof DXRecyclerLayout) && dXWidgetNode.getVisibility() == 0) {
                S(dXNestedScrollerView);
                e0((DXRecyclerLayout) dXWidgetNode, dXNestedScrollerView);
                return true;
            } else if (dXWidgetNode.getVisibility() == 0 && (D instanceof RecyclerView) && D.canScrollVertically(-1)) {
                S(dXNestedScrollerView);
                dXNestedScrollerView.setCurrentChild((RecyclerView) D);
                return true;
            } else if (dXWidgetNode.children != null && dXWidgetNode.getChildrenCount() > 0) {
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.children) {
                    if (R(dXWidgetNode2, dXNestedScrollerView)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void S(DXNestedScrollerView dXNestedScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde799e5", new Object[]{this, dXNestedScrollerView});
        } else if (zg5.G2()) {
            dXNestedScrollerView.setChildReachTop(false);
        }
    }

    public ArrayList<DXWidgetNode> T(int i, List<Object> list, List<DXWidgetNode> list2) {
        ql6 ql6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4322d5c", new Object[]{this, new Integer(i), list, list2});
        }
        Iterator<DXWidgetNode> it = list2.iterator();
        do {
            ql6 ql6Var2 = null;
            if (!it.hasNext()) {
                ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
                int i2 = 0;
                while (i2 < list.size()) {
                    Object obj = list.get(i2);
                    if (getDxv3VariableInfo() != null) {
                        ql6Var = getDxv3VariableInfo().b();
                    } else {
                        ql6Var = ql6Var2;
                    }
                    for (DXWidgetNode dXWidgetNode : list2) {
                        DXRuntimeContext b2 = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
                        b2.q0(obj);
                        b2.r0(i2);
                        if (getDxv3VariableInfo() != null) {
                            b2.s0(ql6Var);
                        }
                        if (this.m) {
                            b2.t0(i2);
                        }
                        HashMap hashMap = new HashMap();
                        b2.j0(hashMap);
                        hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i2));
                        List<Object> list3 = this.f7360a;
                        if (list3 instanceof JSONArray) {
                            hashMap.put(c4o.KEY_DATA_SOURCE, mw5.F((JSONArray) list3));
                        } else if (b2.j() != null) {
                            List<Object> list4 = this.f7360a;
                            if (list4 instanceof Object) {
                                hashMap.put(c4o.KEY_DATA_SOURCE, mw5.L(list4));
                            }
                        }
                        DXWidgetNode c2 = r26.c(dXWidgetNode, b2, false);
                        c2.setParentWidget(this);
                        arrayList.add(c2);
                    }
                    i2++;
                    ql6Var2 = null;
                }
                return arrayList;
            }
        } while (!(it.next() instanceof bi6));
        ArrayList<DXWidgetNode> arrayList2 = new ArrayList<>();
        if (!list2.isEmpty() && list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj2 = list.get(i3);
                DXWidgetNode dXWidgetNode2 = null;
                for (int i4 = 0; i4 < list2.size() && (dXWidgetNode2 = v(list2.get(i4), obj2, i3, null)) == null; i4++) {
                }
                if (dXWidgetNode2 == null) {
                    dXWidgetNode2 = new DXWidgetNode();
                    DXRuntimeContext b3 = getDXRuntimeContext().b(this);
                    if (this.m) {
                        b3.t0(i3);
                    }
                    dXWidgetNode2.setDXRuntimeContext(b3);
                    dXWidgetNode2.setVisibility(2);
                }
                arrayList2.add(dXWidgetNode2);
            }
        }
        return arrayList2;
    }

    public Set<Integer> U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d05cdd1b", new Object[]{this});
        }
        return this.k;
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d1b75d1", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public ViewPager W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        WeakReference<ViewPager> weakReference = this.v;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void X(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fe9059", new Object[]{this, viewPager});
        } else {
            viewPager.setOffscreenPageLimit(99);
        }
    }

    public final void Y(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a08d39", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (y() != null && y().size() != 0) {
            int size = y().size();
            if (i >= 0 && i < size) {
                DXWidgetNode dXWidgetNode = y().get(i);
                if (this.o) {
                    dXWidgetNode = Q(dXWidgetNode);
                }
                if (dXWidgetNode instanceof DXRecyclerLayout) {
                    ((DXRecyclerLayout) dXWidgetNode).m1();
                }
            }
            if (i2 >= 0 && i2 < size) {
                DXWidgetNode dXWidgetNode2 = y().get(i2);
                if (this.o) {
                    dXWidgetNode2 = Q(dXWidgetNode2);
                }
                if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                    ((DXRecyclerLayout) dXWidgetNode2).triggerExposure();
                    jb6.o(new c(dXWidgetNode2), 300L);
                }
            }
        }
    }

    public void Z() {
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfc5245", new Object[]{this});
            return;
        }
        try {
            hashSet = new HashSet();
            String str = this.j;
            if (str != null) {
                for (String str2 : str.split(",")) {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                }
            }
        } catch (Throwable unused) {
            hashSet = new HashSet();
        }
        this.k = hashSet;
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3cce7d", new Object[]{this});
            return;
        }
        SparseBooleanArray sparseBooleanArray = this.y;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.clear();
            this.y.put(this.q, true);
        }
    }

    public void b0(ViewPager viewPager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990759c5", new Object[]{this, viewPager, context});
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            viewPager.setAdapter(P(context));
        } else if (adapter.getCount() != y().size()) {
            viewPager.setAdapter(P(context));
        } else if (adapter instanceof ViewPagerAdapter) {
            ViewPagerAdapter viewPagerAdapter = (ViewPagerAdapter) adapter;
            viewPagerAdapter.v(y());
            adapter.notifyDataSetChanged();
            viewPagerAdapter.m(this);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXViewPager();
    }

    public void c0(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            d0(i, z, 0);
        }
    }

    public void d0(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b88561", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXNativeViewPagerView) {
            ((DXNativeViewPagerView) D).setCurrentItem(i, z, i2);
        } else if (D instanceof ViewPager) {
            ((ViewPager) D).setCurrentItem(i, z);
        }
    }

    public final void e0(DXRecyclerLayout dXRecyclerLayout, DXNestedScrollerView dXNestedScrollerView) {
        WaterfallLayout q0;
        RecyclerView k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a75baf2", new Object[]{this, dXRecyclerLayout, dXNestedScrollerView});
        } else if (dXRecyclerLayout != null && (q0 = dXRecyclerLayout.q0()) != null && (k = q0.k()) != null) {
            dXNestedScrollerView.setCurrentChild(k);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.w == null) {
            this.w = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXViewPager.5
                {
                    add("changeTo");
                }
            };
            this.w.addAll(super.exportMethods());
        }
        return this.w;
    }

    public void f0(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9800bf11", new Object[]{this, pVar});
        } else {
            this.x = pVar;
        }
    }

    public void g0(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd0e609", new Object[]{this, new Integer(i), str});
        } else {
            B(i, str, "DX_VIEWPAGER", "DX_VIEWPAGER_ERROR");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXVIEWPAGER_PAGELIMITSIZE) {
            return Integer.MAX_VALUE;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXVIEWPAGER_PAGELIMITKEEPINDEXES) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j, tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (mf6.TYPE_SELECTED.equals(str)) {
            return Integer.valueOf(this.p);
        }
        return super.getNodePropByKey(str);
    }

    public final void h0(DXWidgetNode dXWidgetNode) {
        DXRuntimeContext dXRuntimeContext;
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa08000", new Object[]{this, dXWidgetNode});
            return;
        }
        DXRootView L = getDXRuntimeContext().L();
        if (dXWidgetNode == null) {
            dXRuntimeContext = null;
        } else {
            dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        }
        DXNestedScrollerView dxNestedScrollerView = L.getDxNestedScrollerView(dXRuntimeContext);
        if (dxNestedScrollerView == null) {
            return;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            S(dxNestedScrollerView);
            e0((DXRecyclerLayout) dXWidgetNode, dxNestedScrollerView);
            return;
        }
        if (!(dXWidgetNode == null || (list = dXWidgetNode.children) == null || list.size() <= 0)) {
            if (!this.o) {
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.children) {
                    View D = dXWidgetNode2.getDXRuntimeContext().D();
                    if ((dXWidgetNode2 instanceof DXRecyclerLayout) && dXWidgetNode2.getVisibility() == 0) {
                        S(dxNestedScrollerView);
                        e0((DXRecyclerLayout) dXWidgetNode2, dxNestedScrollerView);
                        return;
                    } else if (dXWidgetNode2.getVisibility() == 0 && (D instanceof RecyclerView)) {
                        S(dxNestedScrollerView);
                        dxNestedScrollerView.setCurrentChild((RecyclerView) D);
                        return;
                    }
                }
            } else if (R(dXWidgetNode, dxNestedScrollerView)) {
                return;
            }
        }
        if (!this.m) {
            dxNestedScrollerView.clearChildList();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONObject invokeRefMethod(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cd0df95", new Object[]{this, str, jSONArray});
        }
        str.hashCode();
        if (!str.equals("changeTo")) {
            return super.invokeRefMethod(str, jSONArray);
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            jb6.n(new a(jSONArray));
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXViewPager)) {
            super.onClone(dXWidgetNode, z);
            DXViewPager dXViewPager = (DXViewPager) dXWidgetNode;
            this.f7360a = dXViewPager.f7360a;
            this.p = dXViewPager.p;
            this.y = dXViewPager.y;
            this.x = dXViewPager.x;
            this.w = dXViewPager.w;
            this.v = dXViewPager.v;
            this.q = dXViewPager.q;
            this.r = dXViewPager.r;
            this.s = dXViewPager.s;
            this.t = dXViewPager.t;
            this.u = dXViewPager.u;
            this.h = dXViewPager.h;
            this.i = dXViewPager.i;
            this.j = dXViewPager.j;
            this.k = dXViewPager.k;
            this.l = dXViewPager.l;
            this.m = dXViewPager.m;
            this.n = dXViewPager.n;
            this.o = dXViewPager.o;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        postEvent(new DXEvent(5288680013941347641L));
        DXNativeViewPagerView dXNativeViewPagerView = new DXNativeViewPagerView(context);
        X(dXNativeViewPagerView);
        this.v = new WeakReference<>(dXNativeViewPagerView);
        if (getDXRuntimeContext().L().getDxNestedScrollerView(getDXRuntimeContext()) != null) {
            getDXRuntimeContext().L().getDxNestedScrollerView(getDXRuntimeContext()).clearChildList();
        }
        return dXNativeViewPagerView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (DXWidgetNode.DXMeasureSpec.a(i2) != 1073741824) {
            super.onMeasure(i, DXWidgetNode.DXMeasureSpec.c(getDXRuntimeContext().H().getMeasuredHeight(), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        int i2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof ViewPager) {
            DXRootView L = getDXRuntimeContext().L();
            if (L != null && this.m) {
                L.initDxNestedScrollerViewMap();
            }
            ViewPager viewPager = (ViewPager) view;
            if (viewPager instanceof DXNativeViewPagerView) {
                DXNativeViewPagerView dXNativeViewPagerView = (DXNativeViewPagerView) viewPager;
                if (this.h == 1) {
                    z = true;
                } else {
                    z = false;
                }
                dXNativeViewPagerView.setScrollable(z);
                dXNativeViewPagerView.setEnableScroll_Android(this.n);
            }
            this.v = new WeakReference<>(viewPager);
            b0(viewPager, context);
            if (this.q == 0) {
                this.y.put(0, true);
            }
            this.r = this.q;
            if (y() != null) {
                i = y().size();
            } else {
                i = 0;
            }
            final int i3 = i - 1;
            viewPager.clearOnPageChangeListeners();
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.dinamicx.widget.DXViewPager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public final void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8627fb24", new Object[]{this, new Float(f)});
                        return;
                    }
                    DXEvent dXEvent = new DXEvent(5288751146867425108L);
                    HashMap hashMap = new HashMap();
                    hashMap.put(xxl.PERCENT, mw5.I(f));
                    dXEvent.setArgs(hashMap);
                    DXViewPager.this.postEvent(dXEvent);
                }

                public final void b() {
                    JSONObject jSONObject;
                    int i4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4e2babc5", new Object[]{this});
                        return;
                    }
                    DXViewPager dXViewPager = DXViewPager.this;
                    List<Object> list = dXViewPager.f7360a;
                    if (list == null || !(list instanceof JSONArray) || DXViewPager.G(dXViewPager) >= DXViewPager.this.f7360a.size()) {
                        jSONObject = null;
                    } else {
                        DXViewPager dXViewPager2 = DXViewPager.this;
                        jSONObject = ((JSONArray) dXViewPager2.f7360a).getJSONObject(DXViewPager.G(dXViewPager2));
                    }
                    boolean z2 = DXViewPager.O(DXViewPager.this).get(DXViewPager.G(DXViewPager.this));
                    if (!z2) {
                        DXViewPager.O(DXViewPager.this).put(DXViewPager.G(DXViewPager.this), true);
                    }
                    if (DXViewPager.M(DXViewPager.this) == 2 || DXViewPager.M(DXViewPager.this) == 1) {
                        i4 = 2;
                    } else {
                        DXRuntimeContext dXRuntimeContext = DXViewPager.this.getDXRuntimeContext();
                        if (dXRuntimeContext != null) {
                            View D = dXRuntimeContext.D();
                            if (D instanceof DXNativeViewPagerView) {
                                i4 = ((DXNativeViewPagerView) D).getIndexChangeType();
                            }
                        }
                        i4 = 0;
                    }
                    DXViewPager.this.postEvent(new DXViewPageOnTabChangeEvent(DXViewPager.G(DXViewPager.this), DXViewPager.J(DXViewPager.this), jSONObject, !z2, i4));
                    DXViewPager dXViewPager3 = DXViewPager.this;
                    DXViewPager.K(dXViewPager3, DXViewPager.G(dXViewPager3));
                    DXViewPager.D(DXViewPager.this, 0);
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i4)});
                        return;
                    }
                    if (i4 == 0 && DXViewPager.G(DXViewPager.this) != DXViewPager.J(DXViewPager.this)) {
                        b();
                    }
                    DXViewPager.N(DXViewPager.this, i4);
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i4, float f, int i5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i4), new Float(f), new Integer(i5)});
                    } else if (f > 0.0f && DXViewPager.E(DXViewPager.this) % DXViewPager.F(DXViewPager.this) == 0) {
                        a((f + i4) / i3);
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i4)});
                    } else if (i4 < DXViewPager.this.y().size()) {
                        DXViewPager dXViewPager = DXViewPager.this;
                        DXViewPager.I(dXViewPager, DXViewPager.G(dXViewPager), i4);
                        DXViewPager.H(DXViewPager.this, i4);
                        if (DXViewPager.G(DXViewPager.this) != DXViewPager.J(DXViewPager.this)) {
                            b();
                        }
                        if (DXViewPager.this.dXRuntimeContext.L().getDxNestedScrollerView(DXViewPager.this.getDXRuntimeContext()) != null) {
                            DXViewPager.L(DXViewPager.this, DXViewPager.this.y().get(i4));
                        }
                    }
                }
            });
            if (this.m && getDXRuntimeContext() != null) {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                if (W() == null) {
                    i2 = -1;
                } else {
                    i2 = W().hashCode();
                }
                dXRuntimeContext.u0(i2);
            }
            p pVar = this.x;
            if (pVar != null) {
                pVar.A(this);
            }
            jb6.o(new b(), 100L);
            if (viewPager instanceof DXNativeViewPagerView) {
                ((DXNativeViewPagerView) viewPager).setCurrentItem(this.q, false, 1);
            } else {
                viewPager.setCurrentItem(this.q, false);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 6456471229575806289L) {
            this.p = i;
            this.q = i;
        } else if (j == -8352681166307095225L) {
            this.h = i;
        } else if (j == DXVIEWPAGER_ENABLELAZYLOAD) {
            if (i != 1) {
                z = false;
            }
            this.i = z;
        } else if (j == DXVIEWPAGER_PAGELIMITSIZE) {
            this.l = i;
        } else if (j == DXVIEWPAGER_FIXMULTINESTEDSCROLL_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.m = z;
        } else if (j == DXVIEWPAGER_ENABLESCROLL_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.n = z;
        } else if (j == DXVIEWPAGER_RECURSIVESEARCHRL) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (zg5.p3()) {
            super.onSetListAttribute(j, jSONArray);
        } else if (j == -5948810534719014123L) {
            this.f7360a = jSONArray;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXVIEWPAGER_PAGELIMITKEEPINDEXES) {
            this.j = str;
            Z();
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (!zg5.C4()) {
            super.sendBroadcastEvent(dXEvent);
        } else {
            postEvent(dXEvent);
            List<DXWidgetNode> y = y();
            if (y != null && !y.isEmpty() && (i = this.q) >= 0 && i < y.size()) {
                y.get(this.q).sendBroadcastEvent(dXEvent);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public List<DXWidgetNode> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("886500dc", new Object[]{this});
        }
        return super.y();
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public void z(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b8ba4", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        super.z(dXRuntimeContext, i);
        if (this.m) {
            dXRuntimeContext.t0(i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (this.d == null) {
            ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
            this.d = arrayList;
            arrayList.addAll(getChildren());
        }
        if (this.f7360a == null) {
            this.f7360a = new JSONArray();
        }
        if (this.y == null) {
            this.y = new SparseBooleanArray();
        }
        Iterator<DXWidgetNode> it = this.d.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        ArrayList<DXWidgetNode> T = T(0, this.f7360a, this.d);
        A(T);
        removeAllChild();
        setDisableFlatten(true);
        if (T == null || T.size() == 0) {
            g0(f.DX_ERROR_CODE_RECYCLER_LAYOUT_231001, "生成的子节点为空，或者数量为 0");
        }
    }
}
