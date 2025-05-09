package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType;
import com.taobao.taobao.R;
import java.util.List;
import tb.pfa;
import tb.t2o;
import tb.w2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveStateMutitabViewpagerAdapter extends PagerAdapter implements PagerSlidingTabStripAType.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<SingleTabBaseView> f8547a;
    public final Context b;

    static {
        t2o.a(295699325);
        t2o.a(295699443);
    }

    public LiveStateMutitabViewpagerAdapter(Context context, List<SingleTabBaseView> list) {
        this.f8547a = list;
        this.b = context;
    }

    public static /* synthetic */ Object ipc$super(LiveStateMutitabViewpagerAdapter liveStateMutitabViewpagerAdapter, String str, Object... objArr) {
        if (str.hashCode() == 50642664) {
            return new Integer(super.getItemPosition(objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/adapter/LiveStateMutitabViewpagerAdapter");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.b
    public View b(int i) {
        ItemCategory itemCategory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff7d487a", new Object[]{this, new Integer(i)});
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_goods_sort_custom_tab2_flexalocal, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (i == 0) {
            layoutParams.setMargins(w2s.c(this.b, 8.0f), 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams);
        List<SingleTabBaseView> list = this.f8547a;
        if (!(list == null || list.size() <= i || (itemCategory = this.f8547a.get(i).getItemCategory()) == null)) {
            ((TextView) inflate.findViewById(R.id.taolive_goods_strip_text)).setText(itemCategory.name);
            AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_strip_image_icon);
            if (!TextUtils.isEmpty(itemCategory.iconUrl)) {
                aliUrlImageView.setImageUrl(itemCategory.iconUrl);
                aliUrlImageView.setVisibility(0);
                pfa.a(this.b, aliUrlImageView, 17.5f);
            } else {
                aliUrlImageView.setVisibility(8);
            }
            inflate.setTag(R.id.tag_category_data, itemCategory);
        }
        return inflate;
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
        return this.f8547a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!(obj instanceof SingleTabBaseView)) {
            return super.getItemPosition(obj);
        }
        int indexOf = this.f8547a.indexOf(obj);
        if (indexOf != -1) {
            return indexOf;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)});
        }
        List<SingleTabBaseView> list = this.f8547a;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.f8547a.get(i).tabName;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        SingleTabBaseView singleTabBaseView = this.f8547a.get(i);
        viewGroup.removeView(singleTabBaseView);
        viewGroup.addView(singleTabBaseView);
        return singleTabBaseView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (obj == view) {
            return true;
        }
        return false;
    }
}
