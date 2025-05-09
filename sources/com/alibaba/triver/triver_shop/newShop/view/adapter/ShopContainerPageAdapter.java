package com.alibaba.triver.triver_shop.newShop.view.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqd;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopContainerPageAdapter extends FragmentPagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public aqd f3175a;

    static {
        t2o.a(766509793);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopContainerPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        ckf.g(fragmentManager, "fm");
    }

    public static /* synthetic */ Object ipc$super(ShopContainerPageAdapter shopContainerPageAdapter, String str, Object... objArr) {
        if (str.hashCode() == 705961164) {
            super.destroyItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/adapter/ShopContainerPageAdapter");
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            super.destroyItem(viewGroup, i, obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return h().getCount();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        return h().getItem(i);
    }

    public final aqd h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqd) ipChange.ipc$dispatch("6a825d64", new Object[]{this});
        }
        aqd aqdVar = this.f3175a;
        if (aqdVar != null) {
            return aqdVar;
        }
        ckf.y("shopPageProvider");
        throw null;
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5355e1e0", new Object[]{this, new Integer(i)});
            return;
        }
        Fragment item = getItem(i);
        if (item instanceof ShopStandardFragment) {
            ((ShopStandardFragment) item).z2();
        }
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bf3007", new Object[]{this, new Integer(i)});
            return;
        }
        Fragment item = getItem(i);
        if (item instanceof ShopStandardFragment) {
            ((ShopStandardFragment) item).A2();
        }
    }

    public final void k(aqd aqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498b1562", new Object[]{this, aqdVar});
            return;
        }
        ckf.g(aqdVar, "<set-?>");
        this.f3175a = aqdVar;
    }
}
