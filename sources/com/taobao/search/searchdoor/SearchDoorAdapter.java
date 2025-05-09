package com.taobao.search.searchdoor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDoorAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<BaseSearchDoorFragment> f11614a = new ArrayList<>();
    public final LayoutInflater r;

    static {
        t2o.a(815792945);
    }

    public SearchDoorAdapter(Activity activity) {
        ckf.g(activity, "activity");
        this.r = LayoutInflater.from(activity);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorAdapter searchDoorAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorAdapter");
    }

    public final void a(BaseSearchDoorFragment baseSearchDoorFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56da348d", new Object[]{this, baseSearchDoorFragment});
            return;
        }
        ckf.g(baseSearchDoorFragment, "fragment");
        this.f11614a.add(baseSearchDoorFragment);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.f11614a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        View a2 = this.f11614a.get(i).a(this.r, viewGroup);
        if (viewGroup != null) {
            viewGroup.addView(a2);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        return ckf.b(view, obj);
    }
}
