package com.taobao.android.detail.core.standard.widget.lightoff.gallery;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gkc;
import tb.mog;
import tb.pfh;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LightOffGalleryAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mog f6593a;
    public gkc b;
    public final List<LightOffItemModel> c = new ArrayList(10);
    public final Map<String, Class<? extends ILightOffViewModel>> d;
    public View e;

    static {
        t2o.a(438304838);
    }

    public LightOffGalleryAdapter(mog mogVar) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.f6593a = mogVar;
        hashMap.put(PictureViewModel.TYPE, PictureViewModel.class);
    }

    public static /* synthetic */ Object ipc$super(LightOffGalleryAdapter lightOffGalleryAdapter, String str, Object... objArr) {
        if (str.hashCode() == 272159538) {
            return super.instantiateItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/gallery/LightOffGalleryAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            viewGroup.removeView((View) obj);
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

    public final View h(LightOffItemModel lightOffItemModel) {
        mog mogVar = this.f6593a;
        mogVar.getClass();
        Class cls = (Class) ((HashMap) this.d).get(lightOffItemModel.type);
        if (cls == null) {
            return null;
        }
        try {
            ILightOffViewModel iLightOffViewModel = (ILightOffViewModel) cls.newInstance();
            View view = iLightOffViewModel.getView(mogVar.f24181a, lightOffItemModel, this.b);
            if (view != null) {
                view.setTag(iLightOffViewModel);
            }
            return view;
        } catch (Exception e) {
            String a2 = pfh.a("LightOffGalleryAdapter", BTags.XLightOff);
            tgh.b(a2, "createItemView exception:" + e.getMessage());
            return null;
        }
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("808b106f", new Object[]{this});
        }
        return this.e;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(this.f6593a.f24181a);
        LightOffItemModel lightOffItemModel = (LightOffItemModel) ((ArrayList) this.c).get(i);
        if (lightOffItemModel == null) {
            return super.instantiateItem(viewGroup, i);
        }
        View h = h(lightOffItemModel);
        if (h == null) {
            return frameLayout;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(h, layoutParams);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
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

    public void j(gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea877773", new Object[]{this, gkcVar});
        } else {
            this.b = gkcVar;
        }
    }

    public void k(List<LightOffItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de283eb7", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.c).clear();
        ((ArrayList) this.c).addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (obj instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            if (viewGroup2.getChildCount() > 0) {
                this.e = viewGroup2.getChildAt(0);
            }
        }
    }
}
