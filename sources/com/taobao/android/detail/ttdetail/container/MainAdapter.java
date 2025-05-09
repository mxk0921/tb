package com.taobao.android.detail.ttdetail.container;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cva;
import tb.oa4;
import tb.sx9;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.zy9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f6727a = 0.0f;
    public float b = 0.0f;
    public final List<sx9> c = new ArrayList(5);
    public final Map<Integer, LinkedList<View>> d = new ConcurrentHashMap();

    static {
        t2o.a(912261506);
    }

    public static /* synthetic */ Object ipc$super(MainAdapter mainAdapter, String str, Object... objArr) {
        if (str.hashCode() == 190603819) {
            return new Float(super.getPageWidth(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/MainAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (view.getParent() == null) {
            Object tag = view.getTag(R.id.tt_detail_view_pager_reused_id);
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                view.setTag(R.id.tt_detail_view_pager_reused_position, Integer.valueOf(i));
                h(intValue, view);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.c).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (this.f6727a <= 0.0f) {
            float pageWidth = super.getPageWidth(i);
            q(i, pageWidth);
            return pageWidth;
        } else if (getCount() != 1 || !vbl.t0()) {
            sx9 l = l(i);
            if (l != null) {
                float a2 = cva.a(l.D(), this.f6727a, this.b);
                q(i, a2);
                return a2;
            }
            float pageWidth2 = super.getPageWidth(i);
            q(i, pageWidth2);
            return pageWidth2;
        } else {
            q(i, 1.0f);
            return 1.0f;
        }
    }

    public final void h(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd60c3d", new Object[]{this, new Integer(i), view});
        } else if (view != null) {
            LinkedList linkedList = (LinkedList) ((ConcurrentHashMap) this.d).get(Integer.valueOf(i));
            if (linkedList == null) {
                linkedList = new LinkedList();
                ((ConcurrentHashMap) this.d).put(Integer.valueOf(i), linkedList);
            }
            linkedList.offer(view);
            int size = linkedList.size();
            if (size > 4) {
                tgh.b("MainAdapter", "warning viewType: " + i + " cached to much with size: " + size);
            }
        }
    }

    public <C extends oa4> C i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            C c = (C) ((oa4) it.next()).findComponent(str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        sx9 sx9Var = (sx9) ((ArrayList) this.c).get(i);
        sx9Var.setData("componentCreateIndex", Integer.valueOf(i));
        sx9Var.create();
        sx9Var.getFrameSize(zy9.d(viewGroup.getWidth(), Integer.MIN_VALUE), zy9.d(viewGroup.getHeight(), 0));
        int componentViewType = sx9Var.getComponentViewType();
        View k = k(componentViewType, i);
        View componentView = sx9Var.getComponentView(k);
        float pageWidth = getPageWidth(i);
        if (!(k == null || componentView == k)) {
            tgh.b("MainAdapter", "instantiateItem pos: " + i + " create newView not reuseView cacheView( " + k + " ) is not same with newView( " + componentView + " )");
        }
        if (componentView == k) {
            Object tag = componentView.getTag(R.id.tt_detail_view_pager_reused_width_factor);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                if (Float.compare(pageWidth, floatValue) != 0) {
                    tgh.b("MainAdapter", "instantiateItem pos: " + i + " oldWidthFactor( " + floatValue + " ) is not same with newWidthFactor( " + pageWidth + " )");
                    componentView.setTag(R.id.tt_detail_view_pager_reused_id, Integer.valueOf(componentViewType));
                    componentView.setTag(R.id.tt_detail_view_pager_reused_width_factor, Float.valueOf(pageWidth));
                    TTViewPager.LayoutParams layoutParams = new TTViewPager.LayoutParams();
                    layoutParams.c = z;
                    layoutParams.b = z;
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    ((ViewGroup.LayoutParams) layoutParams).height = -1;
                    viewGroup.addView(componentView, layoutParams);
                    sx9Var.willAppear();
                    return componentView;
                }
            }
        }
        z = false;
        componentView.setTag(R.id.tt_detail_view_pager_reused_id, Integer.valueOf(componentViewType));
        componentView.setTag(R.id.tt_detail_view_pager_reused_width_factor, Float.valueOf(pageWidth));
        TTViewPager.LayoutParams layoutParams2 = new TTViewPager.LayoutParams();
        layoutParams2.c = z;
        layoutParams2.b = z;
        ((ViewGroup.LayoutParams) layoutParams2).width = -1;
        ((ViewGroup.LayoutParams) layoutParams2).height = -1;
        viewGroup.addView(componentView, layoutParams2);
        sx9Var.willAppear();
        return componentView;
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

    public <C extends oa4> C j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            C c = (C) ((oa4) it.next()).findComponentByUltronName(str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public final View k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7fdf773a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        LinkedList linkedList = (LinkedList) ((ConcurrentHashMap) this.d).get(Integer.valueOf(i));
        if (linkedList == null) {
            return null;
        }
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            View view = (View) linkedList.get(size);
            Object tag = view.getTag(R.id.tt_detail_view_pager_reused_position);
            if ((tag instanceof Integer) && i2 == ((Integer) tag).intValue() && linkedList.remove(view) && view.getParent() == null) {
                return view;
            }
        }
        View view2 = (View) linkedList.poll();
        if (view2 == null || view2.getParent() != null) {
            return null;
        }
        return view2;
    }

    public <F extends sx9> F l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ((sx9) ipChange.ipc$dispatch("1de96a82", new Object[]{this, new Integer(i)}));
        }
        if (i <= -1 || i >= ((ArrayList) this.c).size()) {
            return null;
        }
        return (F) ((sx9) ((ArrayList) this.c).get(i));
    }

    public List<sx9> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.c;
    }

    public void n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f)});
        } else {
            this.f6727a = f;
        }
    }

    public void o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b95dd1", new Object[]{this, new Float(f)});
        } else {
            this.b = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    public <F extends sx9> void p(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de283eb7", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.c).clear();
        if (list != null) {
            ((ArrayList) this.c).addAll(list);
        }
    }

    public final void q(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217deafc", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        sx9 l = l(i);
        if (l != null) {
            l.setData("framePageWidthRatio", Float.valueOf(f));
        }
    }
}
