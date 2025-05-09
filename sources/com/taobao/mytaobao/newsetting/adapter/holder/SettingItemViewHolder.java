package com.taobao.mytaobao.newsetting.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SettingItemViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f11249a;
    public final View b;
    public final ViewGroup c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TUrlImageView g;
    public final TIconFontTextView h;
    public final View i;
    public List<TextView> k;

    static {
        t2o.a(745537815);
        t2o.a(745537775);
    }

    public SettingItemViewHolder(View view) {
        super(view);
        this.f11249a = view.findViewById(R.id.v_setting_page_item_divider);
        this.b = view.findViewById(R.id.v_setting_page_item_group_divider);
        this.c = (ViewGroup) view.findViewById(R.id.v_setting_page_item);
        this.d = (TextView) view.findViewById(R.id.tv_setting_page_item_name);
        this.e = (TextView) view.findViewById(R.id.tv_setting_page_item_subtitle);
        this.f = (TextView) view.findViewById(R.id.tv_setting_page_item_desc);
        this.g = (TUrlImageView) view.findViewById(R.id.iv_setting_page_item_desc_icon);
        this.h = (TIconFontTextView) view.findViewById(R.id.if_setting_page_item_arrow);
        this.i = view.findViewById(R.id.btn_red_dot);
        b0();
    }

    public static /* synthetic */ Object ipc$super(SettingItemViewHolder settingItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/adapter/holder/SettingItemViewHolder");
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4069a6e7", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        arrayList.add(this.d);
        this.k.add(this.e);
        this.k.add(this.f);
    }
}
