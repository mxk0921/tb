package com.taobao.android.dinamicx.widget.viewpager;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LazyViewPagerAdapter extends ViewPagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final SparseArray<View> l = new SparseArray<>();

    static {
        t2o.a(444597699);
    }

    public LazyViewPagerAdapter(DXViewPager dXViewPager, List<DXWidgetNode> list, Context context) {
        super(dXViewPager, list, context);
    }

    public static /* synthetic */ Object ipc$super(LazyViewPagerAdapter lazyViewPagerAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        } else if (hashCode == 705961164) {
            super.destroyItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/viewpager/LazyViewPagerAdapter");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.viewpager.ViewPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            super.destroyItem(viewGroup, i, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.viewpager.ViewPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        View y = y(i);
        this.l.put(i, y);
        return y;
    }

    @Override // com.taobao.android.dinamicx.widget.viewpager.ViewPagerAdapter, androidx.viewpager.widget.PagerAdapter
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

    @Override // com.taobao.android.dinamicx.widget.viewpager.ViewPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        z(viewGroup, i);
        super.setPrimaryItem(viewGroup, i, obj);
    }

    public boolean w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b867e0f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.l.get(i) != null) {
            return true;
        }
        return false;
    }

    public final String x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afd68a90", new Object[]{this, new Integer(i)});
        }
        return "LazyViewPagerAdapter:" + i;
    }

    public View y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("afd28b5a", new Object[]{this, new Integer(i)});
        }
        List<DXWidgetNode> list = this.b;
        if (list == null || this.c == null) {
            return null;
        }
        DXWidgetNode dXWidgetNode = list.get(i);
        DXNativeFrameLayout dXNativeFrameLayout = new DXNativeFrameLayout(this.d);
        DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
        f fVar = new f(b.c());
        fVar.b = b.p();
        b.g0(fVar);
        return dXNativeFrameLayout;
    }

    public View z(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b3c4844", new Object[]{this, viewGroup, new Integer(i)});
        }
        View findViewWithTag = viewGroup.findViewWithTag(x(i));
        if (findViewWithTag == null) {
            findViewWithTag = this.l.get(i);
            r(i, findViewWithTag);
            try {
                h(viewGroup, i, findViewWithTag);
            } catch (Exception e) {
                xv5.b(e);
            }
            findViewWithTag.setTag(x(i));
            this.l.remove(i);
            SparseArray<Parcelable> sparseArray = this.j.get(Integer.valueOf(i));
            if (sparseArray != null) {
                t(findViewWithTag, sparseArray);
            }
        }
        return findViewWithTag;
    }
}
