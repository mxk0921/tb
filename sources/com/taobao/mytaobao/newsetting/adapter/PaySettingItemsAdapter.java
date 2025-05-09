package com.taobao.mytaobao.newsetting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.adapter.holder.PaySettingItemViewHolder;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PaySettingItemsAdapter extends RecyclerView.Adapter<PaySettingItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutInflater f11243a;

    static {
        t2o.a(745537808);
    }

    public PaySettingItemsAdapter(Context context) {
        this.f11243a = LayoutInflater.from(context);
    }

    public static /* synthetic */ Object ipc$super(PaySettingItemsAdapter paySettingItemsAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/adapter/PaySettingItemsAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(PaySettingItemViewHolder paySettingItemViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a2d932", new Object[]{this, paySettingItemViewHolder, new Integer(i)});
            return;
        }
        throw null;
    }

    /* renamed from: N */
    public PaySettingItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PaySettingItemViewHolder) ipChange.ipc$dispatch("3d8592e2", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new PaySettingItemViewHolder(this.f11243a.inflate(R.layout.new_mytaobao_pay_setting_page_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return 0;
    }
}
