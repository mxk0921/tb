package com.taobao.android.turbo.service.drawer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.a07;
import tb.at4;
import tb.ckf;
import tb.cy7;
import tb.dy7;
import tb.qpu;
import tb.qy7;
import tb.r6o;
import tb.t2o;
import tb.tpu;
import tb.xyh;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/turbo/service/drawer/adapter/DrawerContainerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DrawerContainerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public Map<DrawerModel.DrawerGravity, DrawerModel> f9760a;
    public final Map<DrawerModel.DrawerGravity, FrameLayout> b;
    public final qpu c;
    public final xyh d;
    public final qy7 e;
    public final cy7 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455527);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455526);
    }

    public DrawerContainerAdapter(PageModel pageModel, qpu qpuVar, xyh xyhVar, qy7 qy7Var, cy7 cy7Var) {
        ckf.g(pageModel, "pageData");
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(xyhVar, "mainContainerComponent");
        ckf.g(qy7Var, "drawerRenderHelper");
        ckf.g(cy7Var, "drawerComponentManager");
        this.c = qpuVar;
        this.d = xyhVar;
        this.e = qy7Var;
        this.f = cy7Var;
        Map<DrawerModel.DrawerGravity, DrawerModel> drawers = pageModel.getDrawers();
        this.f9760a = drawers == null ? kotlin.collections.a.h() : drawers;
        this.b = new LinkedHashMap();
    }

    public static /* synthetic */ Object ipc$super(DrawerContainerAdapter drawerContainerAdapter, String str, Object... objArr) {
        if (str.hashCode() == 190603819) {
            return new Float(super.getPageWidth(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/drawer/adapter/DrawerContainerAdapter");
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
        tpu.a.b(aVar, "DrawerContainerAdapter", "销毁子项，position=" + i, null, 4, null);
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.f9760a.size() + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        ckf.g(obj, "object");
        View view = (View) obj;
        if (ckf.b(view, (FrameLayout) this.d.getView())) {
            return n();
        }
        if (ckf.b(view, (FrameLayout) ((LinkedHashMap) this.b).get(DrawerModel.DrawerGravity.LEFT))) {
            return m();
        }
        if (ckf.b(view, (FrameLayout) ((LinkedHashMap) this.b).get(DrawerModel.DrawerGravity.RIGHT))) {
            return p();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        DrawerModel.DrawerGravity j = j(i);
        if (j == null) {
            return super.getPageWidth(i);
        }
        DrawerModel h = h(j);
        if (h == null) {
            return super.getPageWidth(i);
        }
        Context context = this.c.getContext();
        return at4.a.c(at4.Companion, context, Integer.valueOf(h.getWidth()), false, 4, null) / r6o.Companion.h(context);
    }

    public final DrawerModel h(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel) ipChange.ipc$dispatch("ab7c2d57", new Object[]{this, drawerGravity});
        }
        ckf.g(drawerGravity, "drawerGravity");
        return this.f9760a.get(drawerGravity);
    }

    public final Set<DrawerModel.DrawerGravity> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e215603b", new Object[]{this});
        }
        return this.f9760a.keySet();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, "container");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerAdapter", "实例化子项，position=" + i, null, 4, null);
        if (i == n()) {
            return s(viewGroup);
        }
        DrawerModel.DrawerGravity j = j(i);
        if (j != null) {
            Context context = viewGroup.getContext();
            ckf.f(context, "container.context");
            FrameLayout o = o(j, context);
            r(viewGroup, i, j, o);
            if (o.getParent() == null) {
                viewGroup.addView(o);
            } else if (!ckf.b(o.getParent(), viewGroup)) {
                ViewParent parent = o.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(o);
                }
                viewGroup.addView(o);
            }
            return o;
        }
        tpu.a.b(aVar, "DrawerContainerAdapter", "实例化子项，未知的位置", null, 4, null);
        return new FrameLayout(viewGroup.getContext());
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

    public final DrawerModel.DrawerGravity j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("479a7989", new Object[]{this, new Integer(i)});
        }
        if (i == m()) {
            return DrawerModel.DrawerGravity.LEFT;
        }
        if (i == p()) {
            return DrawerModel.DrawerGravity.RIGHT;
        }
        return null;
    }

    public final DrawerModel.DrawerGravity k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("1e2cde54", new Object[]{this, str});
        }
        ckf.g(str, "drawerId");
        for (Map.Entry<DrawerModel.DrawerGravity, DrawerModel> entry : this.f9760a.entrySet()) {
            DrawerModel.DrawerGravity key = entry.getKey();
            if (ckf.b(entry.getValue().getId(), str)) {
                return key;
            }
        }
        return null;
    }

    public final FrameLayout l(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("494a81dc", new Object[]{this, drawerGravity});
        }
        ckf.g(drawerGravity, "drawerGravity");
        return (FrameLayout) ((LinkedHashMap) this.b).get(drawerGravity);
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c844c11", new Object[]{this})).intValue();
        }
        if (!this.f9760a.containsKey(DrawerModel.DrawerGravity.LEFT)) {
            return -2;
        }
        return 0;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f132d55", new Object[]{this})).intValue();
        }
        return this.f9760a.containsKey(DrawerModel.DrawerGravity.LEFT) ? 1 : 0;
    }

    public final FrameLayout o(DrawerModel.DrawerGravity drawerGravity, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ce6f2ee1", new Object[]{this, drawerGravity, context});
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Object obj = linkedHashMap.get(drawerGravity);
        if (obj == null) {
            obj = new FrameLayout(context);
            linkedHashMap.put(drawerGravity, obj);
        }
        return (FrameLayout) obj;
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21b0e3ba", new Object[]{this})).intValue();
        }
        boolean containsKey = this.f9760a.containsKey(DrawerModel.DrawerGravity.LEFT);
        boolean containsKey2 = this.f9760a.containsKey(DrawerModel.DrawerGravity.RIGHT);
        if (!containsKey && containsKey2) {
            return 1;
        }
        if (!containsKey || !containsKey2) {
            return -2;
        }
        return 2;
    }

    public final boolean q(DrawerModel.DrawerGravity drawerGravity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c438caf", new Object[]{this, drawerGravity})).booleanValue();
        }
        ckf.g(drawerGravity, "drawerGravity");
        int i2 = dy7.$EnumSwitchMapping$0[drawerGravity.ordinal()];
        if (i2 == 1) {
            i = m();
        } else if (i2 == 2) {
            i = p();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (getPageWidth(i) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void r(ViewGroup viewGroup, int i, DrawerModel.DrawerGravity drawerGravity, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49692e21", new Object[]{this, viewGroup, new Integer(i), drawerGravity, frameLayout});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerAdapter", "渲染抽屉，position=" + i + "，drawerGravity=" + drawerGravity, null, 4, null);
        if (!(viewGroup instanceof ViewPager)) {
            viewGroup = null;
        }
        ViewPager viewPager = (ViewPager) viewGroup;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : -1;
        if (i == currentItem) {
            tpu.a.b(aVar, "DrawerContainerAdapter", "渲染抽屉，位置和当前位置相等", null, 4, null);
            DrawerModel h = h(drawerGravity);
            if (h != null) {
                this.e.b(drawerGravity, h, frameLayout);
            } else {
                tpu.a.b(aVar, "DrawerContainerAdapter", "渲染抽屉，位置和当前位置相等，抽屉数据为空", null, 4, null);
            }
        } else {
            tpu.a.b(aVar, "DrawerContainerAdapter", "渲染抽屉，位置和当前位置不相等，currentItem=" + currentItem, null, 4, null);
        }
    }

    public final View s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("568017da", new Object[]{this, viewGroup});
        }
        tpu.a.b(tpu.Companion, "DrawerContainerAdapter", "渲染主容器", null, 4, null);
        FrameLayout frameLayout = (FrameLayout) this.d.getView();
        if (frameLayout == null) {
            frameLayout = (FrameLayout) this.d.createView();
        }
        if (frameLayout.getParent() == null) {
            viewGroup.addView(frameLayout);
        } else if (!ckf.b(frameLayout.getParent(), viewGroup)) {
            ViewParent parent = frameLayout.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(frameLayout);
            }
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    public final void t() {
        DrawerModel.DrawerGravity[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a766944a", new Object[]{this});
            return;
        }
        for (DrawerModel.DrawerGravity drawerGravity : DrawerModel.DrawerGravity.values()) {
            if (!this.f9760a.containsKey(drawerGravity)) {
                this.b.remove(drawerGravity);
            }
        }
    }

    public final void u(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196fef19", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerAdapter", "更新数据，data=" + pageModel, null, 4, null);
        Map<DrawerModel.DrawerGravity, DrawerModel> drawers = pageModel.getDrawers();
        if (drawers == null) {
            drawers = kotlin.collections.a.h();
        }
        this.f9760a = drawers;
        notifyDataSetChanged();
        this.d.updateData(pageModel);
        for (Map.Entry<DrawerModel.DrawerGravity, DrawerModel> entry : this.f9760a.entrySet()) {
            this.f.o(entry.getKey(), entry.getValue());
        }
        t();
    }
}
