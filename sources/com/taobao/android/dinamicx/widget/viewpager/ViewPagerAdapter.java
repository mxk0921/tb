package com.taobao.android.dinamicx.widget.viewpager;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LruCache;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.j;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.bi6;
import tb.h36;
import tb.hxb;
import tb.kl6;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ViewPagerAdapter extends PagerAdapter implements j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXViewPager f7525a;
    public List<DXWidgetNode> b;
    public final o c;
    public final Context d;
    public Set<Integer> f;
    public ExistedPosition g;
    public int i;
    public final LinkedHashMap<Integer, View> e = new LinkedHashMap<>();
    public final LinkedHashMap<Integer, SparseArray<Parcelable>> j = new LinkedHashMap<>();
    public final boolean k = zg5.I2();
    public final LruCache<Integer, Integer> h = new LruCache<>(zg5.f3());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ExistedPosition extends LruCache<Integer, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ViewGroup b;

        static {
            t2o.a(444597701);
        }

        public ExistedPosition(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(ExistedPosition existedPosition, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/ViewPagerAdapter$ExistedPosition");
        }

        /* renamed from: a */
        public void entryRemoved(boolean z, Integer num, Integer num2, Integer num3) {
            ViewGroup viewGroup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55b46058", new Object[]{this, new Boolean(z), num, num2, num3});
            } else if (z && (viewGroup = this.b) != null) {
                ViewPagerAdapter.this.o(viewGroup, num);
            }
        }
    }

    static {
        t2o.a(444597700);
        t2o.a(444596511);
    }

    public ViewPagerAdapter(DXViewPager dXViewPager, List<DXWidgetNode> list, Context context) {
        this.f7525a = dXViewPager;
        this.b = list;
        this.c = new o(dXViewPager.getDXRuntimeContext().s(), 3, UUID.randomUUID().toString());
        this.d = context;
        q();
        DinamicXEngine.Y0(this);
    }

    public static /* synthetic */ Object ipc$super(ViewPagerAdapter viewPagerAdapter, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/ViewPagerAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (obj instanceof ViewGroup) {
            u((View) obj, sparseArray);
        }
        this.j.put(Integer.valueOf(i), sparseArray);
        DXViewPager dXViewPager = this.f7525a;
        if (!(dXViewPager == null || !this.k || (dXRuntimeContext = dXViewPager.getDXRuntimeContext()) == null || dXRuntimeContext.L() == null || this.f7525a.W() == null || dXRuntimeContext.L().getDxNestedScrollerViewMap() == null || this.f7525a.W().hashCode() != dXRuntimeContext.U())) {
            dXRuntimeContext.L().getDxNestedScrollerViewMap().remove(Integer.valueOf(i));
        }
        viewGroup.removeView((View) obj);
        this.e.remove(Integer.valueOf(i));
    }

    @Override // com.taobao.android.dinamicx.j.a
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9b6d4", new Object[]{this});
        }
        if (!DinamicXEngine.j0()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < getCount(); i3++) {
            View j = j(i3);
            if (j instanceof ViewGroup) {
                if (((ViewGroup) j).getChildCount() == 0) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        return "ViewPager itemViewSize: " + i + "; emptyViewSize: " + i2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<DXWidgetNode> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void h(ViewGroup viewGroup, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f515609b", new Object[]{this, viewGroup, new Integer(i), view});
        } else if (i == viewGroup.getChildCount()) {
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        } else if (i < viewGroup.getChildCount()) {
            viewGroup.removeViewAt(i);
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        } else {
            int childCount = i - viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.addView(new View(this.d), new ViewGroup.LayoutParams(-2, -2));
            }
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4011c92", new Object[]{this, new Integer(i)});
        } else if (k() && !((HashSet) this.f).contains(Integer.valueOf(i))) {
            this.g.put(Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.b == null || this.c == null) {
            return null;
        }
        DXNativeFrameLayout dXNativeFrameLayout = new DXNativeFrameLayout(this.d);
        n(i, dXNativeFrameLayout);
        try {
            h(viewGroup, i, dXNativeFrameLayout);
        } catch (Exception e) {
            xv5.b(e);
        }
        SparseArray<Parcelable> sparseArray = this.j.get(Integer.valueOf(i));
        if (sparseArray != null) {
            t(dXNativeFrameLayout, sparseArray);
        }
        return dXNativeFrameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == obj) {
            return true;
        }
        return false;
    }

    public View j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14225116", new Object[]{this, new Integer(i)});
        }
        return this.e.get(Integer.valueOf(i));
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f79e5a9", new Object[]{this})).booleanValue();
        }
        if (this.i < getCount()) {
            return true;
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9202a2f5", new Object[]{this})).booleanValue();
        }
        if (!k() || this.g.size() + ((HashSet) this.f).size() != this.i) {
            return false;
        }
        return true;
    }

    public void m(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7be1f3e", new Object[]{this, dXViewPager});
            return;
        }
        this.f7525a = dXViewPager;
        getCount();
        q();
        for (Map.Entry<Integer, View> entry : this.e.entrySet()) {
            DXWidgetNode dXWidgetNode = this.b.get(entry.getKey().intValue());
            View value = entry.getValue();
            if (!(value instanceof ViewGroup) || ((ViewGroup) value).getChildCount() != 0) {
                DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
                int c = DXWidgetNode.DXMeasureSpec.c(this.f7525a.getMeasuredWidth(), 1073741824);
                int c2 = DXWidgetNode.DXMeasureSpec.c(this.f7525a.getMeasuredHeight(), 1073741824);
                if (dXWidgetNode instanceof bi6) {
                    dXWidgetNode.setLayoutWidth(-1);
                    dXWidgetNode.setLayoutHeight(-1);
                }
                this.c.k(dXWidgetNode, null, value, b, 2, 9, c, c2, entry.getKey().intValue());
            }
        }
    }

    public void n(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca2ca90", new Object[]{this, new Integer(i), view});
        } else if (l()) {
            h36.g("DXViewPageLimit", "instantiateItem maxPage at " + i + "; renderEmptyView");
            this.e.put(Integer.valueOf(i), view);
        } else {
            r(i, view);
            i(i);
        }
    }

    public void o(ViewGroup viewGroup, Integer num) {
        ViewPager W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479c5838", new Object[]{this, viewGroup, num});
            return;
        }
        DXViewPager dXViewPager = this.f7525a;
        if (dXViewPager != null && (W = dXViewPager.W()) != null && num != null && viewGroup != null && num.intValue() != W.getCurrentItem()) {
            if (DinamicXEngine.j0()) {
                h36.g("DXViewPageLimit", "renderItemViewIfEmpty maxPage previous " + num);
            }
            View childAt = viewGroup.getChildAt(num.intValue());
            if (childAt instanceof ViewGroup) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                u(childAt, sparseArray);
                this.j.put(num, sparseArray);
                kl6.e(childAt, null);
                ((ViewGroup) childAt).removeAllViews();
            }
        }
    }

    @Override // com.taobao.android.dinamicx.j.a
    public void onLowMemory() {
        ViewPager W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        DXViewPager dXViewPager = this.f7525a;
        if (!(dXViewPager == null || (W = dXViewPager.W()) == null)) {
            for (int i = 0; i < getCount(); i++) {
                if (this.h.get(Integer.valueOf(i)) == null && i != W.getCurrentItem()) {
                    o(W, Integer.valueOf(i));
                    this.g.remove(Integer.valueOf(i));
                }
            }
        }
    }

    public void p(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5000b664", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        ExistedPosition existedPosition = this.g;
        existedPosition.b = viewGroup;
        existedPosition.put(Integer.valueOf(i), Integer.valueOf(i));
        this.g.b = null;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa12bd0", new Object[]{this});
            return;
        }
        DXViewPager dXViewPager = this.f7525a;
        if (dXViewPager == null) {
            this.f = new HashSet();
            this.i = Integer.MAX_VALUE;
            this.g = new ExistedPosition(this.i);
            return;
        }
        if (dXViewPager.U() != null) {
            this.f = new HashSet(this.f7525a.U());
        } else {
            this.f = new HashSet();
        }
        if (this.i != this.f7525a.V() || this.g == null) {
            int V = this.f7525a.V();
            this.i = V;
            int size = V - this.f.size();
            if (size <= 0) {
                size = this.i;
            }
            ExistedPosition existedPosition = this.g;
            if (existedPosition == null) {
                this.g = new ExistedPosition(size);
                return;
            }
            existedPosition.b = this.f7525a.W();
            this.g.resize(size);
            this.g.b = null;
        }
    }

    public void r(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a403204", new Object[]{this, new Integer(i), view});
            return;
        }
        DXWidgetNode dXWidgetNode = this.b.get(i);
        DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
        f fVar = new f(b.c());
        fVar.b = b.p();
        b.g0(fVar);
        int c = DXWidgetNode.DXMeasureSpec.c(this.f7525a.getMeasuredWidth(), 1073741824);
        int c2 = DXWidgetNode.DXMeasureSpec.c(this.f7525a.getMeasuredHeight(), 1073741824);
        if (dXWidgetNode instanceof bi6) {
            dXWidgetNode.setLayoutWidth(-1);
            dXWidgetNode.setLayoutHeight(-1);
        }
        this.c.k(dXWidgetNode, null, view, b, 2, 9, c, c2, i);
        this.e.put(Integer.valueOf(i), view);
    }

    public void s(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a628f8fb", new Object[]{this, viewGroup, new Integer(i)});
        } else if (i >= 0 && i < getCount() && !((HashSet) this.f).contains(Integer.valueOf(i))) {
            View j = j(i);
            if ((j instanceof ViewGroup) && ((ViewGroup) j).getChildCount() == 0) {
                if (DinamicXEngine.j0()) {
                    h36.g("DXViewPageLimit", "renderItemViewIfEmpty at " + i);
                }
                View j2 = j(i);
                r(i, j2);
                SparseArray<Parcelable> sparseArray = this.j.get(Integer.valueOf(i));
                if (sparseArray != null) {
                    t(j2, sparseArray);
                }
            }
            if (k()) {
                p(viewGroup, i);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        s(viewGroup, i);
        this.h.put(Integer.valueOf(i), Integer.valueOf(i));
    }

    public void t(View view, SparseArray<Parcelable> sparseArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9da250", new Object[]{this, view, sparseArray});
        } else if (view instanceof hxb) {
            DXWidgetNode b = kl6.b(view);
            if (b instanceof DXWidgetNode) {
                ((hxb) view).onRestoreInstanceState(sparseArray.get(b.getAutoId()));
            }
        } else if (view instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    t(viewGroup.getChildAt(i), sparseArray);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void u(View view, SparseArray<Parcelable> sparseArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafd387f", new Object[]{this, view, sparseArray});
        } else if (view instanceof hxb) {
            DXWidgetNode b = kl6.b(view);
            if (b instanceof DXWidgetNode) {
                sparseArray.put(b.getAutoId(), ((hxb) view).onSaveInstanceState());
            }
        } else if (view instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    u(viewGroup.getChildAt(i), sparseArray);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void v(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4ad579", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }
}
