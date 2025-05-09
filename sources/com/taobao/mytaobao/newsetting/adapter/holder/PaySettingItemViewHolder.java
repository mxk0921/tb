package com.taobao.mytaobao.newsetting.adapter.holder;

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
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PaySettingItemViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f11248a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public List<TextView> h;

    static {
        t2o.a(745537814);
        t2o.a(745537775);
    }

    public PaySettingItemViewHolder(View view) {
        super(view);
        this.f11248a = view.findViewById(R.id.pay_setting_page_item_divider_narrow);
        this.b = view.findViewById(R.id.pay_setting_page_item_group_divider);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pay_setting_page_item);
        this.c = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_name);
        this.d = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_subtitle);
        this.e = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_desc);
        TIconFontTextView tIconFontTextView = (TIconFontTextView) view.findViewById(R.id.if_pay_setting_page_item_arrow);
        this.f = view.findViewById(R.id.pay_btn_red_dot);
        b0();
    }

    public static /* synthetic */ Object ipc$super(PaySettingItemViewHolder paySettingItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/adapter/holder/PaySettingItemViewHolder");
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4069a6e7", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.add(this.c);
        this.h.add(this.d);
        this.h.add(this.e);
    }
}
