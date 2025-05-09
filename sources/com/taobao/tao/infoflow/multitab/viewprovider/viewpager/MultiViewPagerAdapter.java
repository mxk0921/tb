package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bve;
import tb.d9j;
import tb.fuq;
import tb.r5a;
import tb.s5a;
import tb.t2o;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MultiViewPagerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final fuq b;
    public final List<a.c> c;
    public ViewGroup e;

    /* renamed from: a  reason: collision with root package name */
    public final List<JSONObject> f12487a = new ArrayList();
    public final List<Integer> d = new CopyOnWriteArrayList();

    static {
        t2o.a(729809590);
    }

    public MultiViewPagerAdapter(fuq fuqVar, List<a.c> list) {
        this.b = fuqVar;
        this.c = list;
    }

    public static /* synthetic */ Object ipc$super(MultiViewPagerAdapter multiViewPagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/viewpager/MultiViewPagerAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        d9j.c("MultiViewPagerAdapter", "destroyItem container remove: " + i);
        if (i <= ((CopyOnWriteArrayList) this.d).size() - 1) {
            ((CopyOnWriteArrayList) this.d).remove(i);
        }
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f12487a).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!bve.m() || !vxl.j() || !(obj instanceof View)) {
            return -2;
        }
        View view = (View) obj;
        int i = R.id.multi_tab_container_type;
        if (!(view.getTag(i) instanceof String)) {
            return -2;
        }
        int i2 = R.id.multi_tab_position;
        if (!(view.getTag(i2) instanceof Integer)) {
            return -2;
        }
        int i3 = R.id.multi_tab_identifier;
        if (!(view.getTag(i3) instanceof String)) {
            return -2;
        }
        String str = (String) view.getTag(i3);
        if (!TextUtils.equals((String) view.getTag(i), this.b.j(((Integer) view.getTag(i2)).intValue())) || !TextUtils.equals(str, s5a.h())) {
            return -2;
        }
        return -1;
    }

    public List<JSONObject> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a2b4797", new Object[]{this});
        }
        return this.f12487a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        d9j.c("MultiViewPagerAdapter", "instantiateItem position: " + i);
        this.e = viewGroup;
        View h = h(viewGroup, i);
        ((CopyOnWriteArrayList) this.d).add(Integer.valueOf(i));
        if (i == this.b.n() && vxl.j()) {
            h.setTag(R.id.multi_tab_container_type, this.b.j(i));
            h.setTag(R.id.multi_tab_position, Integer.valueOf(i));
            h.setTag(R.id.multi_tab_identifier, s5a.h());
        }
        return h;
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

    public void j(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cae5029", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!((CopyOnWriteArrayList) this.d).contains(Integer.valueOf(i)) || this.e == null || z) {
            d9j.c("MultiViewPagerAdapter", "reRenderTabView : " + i);
            this.b.F(i);
            notifyDataSetChanged();
        } else {
            this.e.removeView(this.b.w(i));
            h(this.e, i);
            d9j.c("MultiViewPagerAdapter", "reRenderTabView 替换 : " + i);
        }
    }

    public void k(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0fcd15", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.f12487a).clear();
        if (list != null) {
            ((ArrayList) this.f12487a).addAll(list);
        }
        d9j.c("MultiViewPagerAdapter", "setTabData,tabSize" + ((ArrayList) this.f12487a).size());
        notifyDataSetChanged();
    }

    public final View h(ViewGroup viewGroup, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b9b9b1e6", new Object[]{this, viewGroup, new Integer(i)});
        }
        View e = this.b.e(viewGroup, i);
        if (e == null) {
            e = new View(viewGroup.getContext());
            d9j.c("MultiViewPagerAdapter", "sub tab createView error: " + i);
        }
        if (e.getParent() != null) {
            ((ViewGroup) e.getParent()).removeView(e);
        }
        ((CopyOnWriteArrayList) this.d).add(Integer.valueOf(i));
        try {
            StringBuilder sb = new StringBuilder("addTabView container is null:");
            if (viewGroup != null) {
                z = false;
            }
            sb.append(z);
            sb.append("View is null: false");
            d9j.c("MultiViewPagerAdapter", sb.toString());
            int visibility = e.getVisibility();
            d9j.c("MultiViewPagerAdapter", "addTabView view visible:" + visibility);
            viewGroup.addView(e);
        } catch (Exception e2) {
            d9j.c("MultiViewPagerAdapter", "MultiViewPagerAddTabViewException:" + e2.getMessage());
            r5a.i("Page_Home", 19999, "MultiViewPagerAddTabViewException", "exception=" + e2.getMessage());
        }
        if (this.b.A(i)) {
            for (a.c cVar : this.c) {
                cVar.a(i);
            }
        }
        return e;
    }
}
