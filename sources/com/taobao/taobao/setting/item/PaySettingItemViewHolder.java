package com.taobao.taobao.setting.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.ArrayList;
import java.util.List;
import tb.cv9;
import tb.w7c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PaySettingItemViewHolder extends RecyclerView.ViewHolder implements w7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f12958a;
    public final View b;
    public final ViewGroup c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TIconFontTextView g;
    public final View h;
    public int i = 1;
    public List<TextView> j;

    public PaySettingItemViewHolder(View view) {
        super(view);
        this.f12958a = view.findViewById(R.id.pay_setting_page_item_divider_narrow);
        this.b = view.findViewById(R.id.pay_setting_page_item_group_divider);
        this.c = (ViewGroup) view.findViewById(R.id.pay_setting_page_item);
        this.d = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_name);
        this.e = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_subtitle);
        this.f = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_desc);
        this.g = (TIconFontTextView) view.findViewById(R.id.if_pay_setting_page_item_arrow);
        this.h = view.findViewById(R.id.pay_btn_red_dot);
        b0();
        cv9.a().b(this, view.getContext());
    }

    public static /* synthetic */ Object ipc$super(PaySettingItemViewHolder paySettingItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/setting/item/PaySettingItemViewHolder");
    }

    public List<ViewGroup> Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb804342", new Object[]{this});
        }
        return null;
    }

    public int a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20dfd238", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4069a6e7", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        arrayList.add(this.d);
        this.j.add(this.e);
        this.j.add(this.f);
    }

    public void w1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92466b6a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public List<TextView> z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f56ad7a", new Object[]{this});
        }
        return this.j;
    }
}
