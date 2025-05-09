package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.ExpressionPanelRecyclerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.iw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EmojiPanelPagerAdapter extends PagerAdapter implements PagerSlidingTabStripAType.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ExpressionPanelRecyclerView> f8588a;
    public final Context b;
    public final List<View> c = new ArrayList();

    static {
        t2o.a(295699474);
        t2o.a(295699443);
    }

    public EmojiPanelPagerAdapter(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Object ipc$super(EmojiPanelPagerAdapter emojiPanelPagerAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 50642664) {
            return new Integer(super.getItemPosition(objArr[0]));
        }
        if (hashCode == 446347441) {
            return super.getPageTitle(((Number) objArr[0]).intValue());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/adapter/EmojiPanelPagerAdapter");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.b
    public View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff7d487a", new Object[]{this, new Integer(i)});
        }
        if (((ArrayList) this.c).size() > i) {
            return (View) ((ArrayList) this.c).get(i);
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.taolive_expression_tab_custom_view_flexalocal, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, iw0.a(this.b, 12.0f), 0);
        layoutParams.width = iw0.a(this.b, 42.0f);
        layoutParams.height = iw0.a(this.b, 30.0f);
        inflate.setBackgroundResource(R.drawable.taolive_room_emoji_change_selector_flexalocal);
        inflate.setLayoutParams(layoutParams);
        ((ArrayList) this.c).add(inflate);
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
        List<ExpressionPanelRecyclerView> list = this.f8588a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        List<ExpressionPanelRecyclerView> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!(obj instanceof RecyclerView) || (list = this.f8588a) == null) {
            return super.getItemPosition(obj);
        }
        int indexOf = list.indexOf(obj);
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
        return super.getPageTitle(i);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4337bedc", new Object[]{this});
            return;
        }
        this.f8588a = null;
        notifyDataSetChanged();
    }

    public void i(List<ExpressionPanelRecyclerView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6029d862", new Object[]{this, list});
            return;
        }
        this.f8588a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<ExpressionPanelRecyclerView> list = this.f8588a;
        if (list == null) {
            return null;
        }
        ExpressionPanelRecyclerView expressionPanelRecyclerView = list.get(i);
        viewGroup.removeView(expressionPanelRecyclerView);
        viewGroup.addView(expressionPanelRecyclerView);
        return expressionPanelRecyclerView;
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
