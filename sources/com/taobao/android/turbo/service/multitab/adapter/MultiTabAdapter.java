package com.taobao.android.turbo.service.multitab.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.kqs;
import tb.krs;
import tb.t2o;
import tb.tpu;
import tb.vaj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/turbo/service/multitab/adapter/MultiTabAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MultiTabAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, FrameLayout> f9763a = new LinkedHashMap();
    public List<TabModel> b;
    public final krs c;
    public final kqs d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455552);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455551);
    }

    public MultiTabAdapter(List<TabModel> list, krs krsVar, kqs kqsVar) {
        ckf.g(list, "tabDataList");
        ckf.g(krsVar, "tabRenderHelper");
        ckf.g(kqsVar, "tabComponentManager");
        this.b = list;
        this.c = krsVar;
        this.d = kqsVar;
    }

    public static /* synthetic */ Object ipc$super(MultiTabAdapter multiTabAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/multitab/adapter/MultiTabAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        ckf.g(viewGroup, "container");
        ckf.g(obj, "object");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabAdapter", "销毁子项，position=" + i, null, 4, null);
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public final TabModel i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel) ipChange.ipc$dispatch("423f2306", new Object[]{this, new Integer(i)});
        }
        int size = this.b.size();
        if (i >= 0 && i < size) {
            return this.b.get(i);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabAdapter", "获取Tab数据时越界，position=" + i + ", size=" + size, null, 4, null);
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, "container");
        TabModel i2 = i(i);
        if (i2 == null) {
            return new FrameLayout(viewGroup.getContext());
        }
        String id = i2.getId();
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabAdapter", "实例化子项，position=" + i + "，tabId=" + id, null, 4, null);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f9763a;
        Object obj = linkedHashMap.get(id);
        if (obj == null) {
            obj = new FrameLayout(viewGroup.getContext());
            linkedHashMap.put(id, obj);
        }
        FrameLayout frameLayout = (FrameLayout) obj;
        ViewGroup viewGroup2 = null;
        ViewPager viewPager = (ViewPager) (!(viewGroup instanceof ViewPager) ? null : viewGroup);
        if (viewPager == null || i != viewPager.getCurrentItem()) {
            this.c.d(i, i2, frameLayout);
        } else {
            this.c.f(i, i2, frameLayout, "tabSelected");
        }
        if (frameLayout.getParent() == null) {
            viewGroup.addView(frameLayout);
        } else if (!ckf.b(frameLayout.getParent(), viewGroup)) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = parent;
            }
            ViewGroup viewGroup3 = viewGroup2;
            if (viewGroup3 != null) {
                viewGroup3.removeView(frameLayout);
            }
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        ckf.g(view, "view");
        ckf.g(obj, "object");
        return ckf.b(view, obj);
    }

    public final Set<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("25a5e1cf", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (TabModel tabModel : this.b) {
            hashSet.add(tabModel.getId());
        }
        return hashSet;
    }

    public final FrameLayout k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9060ac23", new Object[]{this, new Integer(i)});
        }
        TabModel i2 = i(i);
        if (i2 != null) {
            return (FrameLayout) ((LinkedHashMap) this.f9763a).get(i2.getId());
        }
        return null;
    }

    public final boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("441ad3df", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TabModel i2 = i(i);
        if (i2 != null) {
            return i2.isDark();
        }
        return false;
    }

    public final boolean m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69defc04", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TabModel i2 = i(i);
        if (i2 != null) {
            return i2.isSupportFestival();
        }
        return false;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a766944a", new Object[]{this});
            return;
        }
        ((LinkedHashMap) this.f9763a).keySet().retainAll(j());
        this.c.g();
    }

    public final void o(List<TabModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
            return;
        }
        ckf.g(list, "tabDataList");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabAdapter", "更新数据，tabDataList=" + list, null, 4, null);
        this.b = list;
        notifyDataSetChanged();
        for (TabModel tabModel : list) {
            this.d.q(tabModel.getId(), tabModel);
        }
        n();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        ckf.g(obj, "object");
        View view = (View) obj;
        for (TabModel tabModel : this.b) {
            if (ckf.b((FrameLayout) ((LinkedHashMap) this.f9763a).get(tabModel.getId()), view)) {
                return i;
            }
            i++;
        }
        return -2;
    }

    public final int h(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("221d1801", new Object[]{this, str})).intValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        for (TabModel tabModel : this.b) {
            if (ckf.b(tabModel.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
