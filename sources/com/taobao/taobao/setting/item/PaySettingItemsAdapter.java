package com.taobao.taobao.setting.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taobao.setting.item.PaySettingItem;
import java.util.List;
import tb.bau;
import tb.cv9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PaySettingItemsAdapter extends RecyclerView.Adapter<PaySettingItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12959a;
    public final LayoutInflater b;
    public List<PaySettingItem> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PaySettingItem f12960a;

        public a(PaySettingItem paySettingItem) {
            this.f12960a = paySettingItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                bau.b(PaySettingItemsAdapter.M(PaySettingItemsAdapter.this), this.f12960a.event);
            }
        }
    }

    public PaySettingItemsAdapter(Context context) {
        this.f12959a = context;
        this.b = LayoutInflater.from(context);
    }

    public static /* synthetic */ Context M(PaySettingItemsAdapter paySettingItemsAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("183db95c", new Object[]{paySettingItemsAdapter});
        }
        return paySettingItemsAdapter.f12959a;
    }

    public static /* synthetic */ Object ipc$super(PaySettingItemsAdapter paySettingItemsAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/setting/item/PaySettingItemsAdapter");
    }

    /* renamed from: N */
    public void onBindViewHolder(PaySettingItemViewHolder paySettingItemViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c096f1", new Object[]{this, paySettingItemViewHolder, new Integer(i)});
            return;
        }
        PaySettingItem paySettingItem = this.c.get(i);
        cv9.a().b(paySettingItemViewHolder, paySettingItemViewHolder.d.getContext());
        if (paySettingItem.divider) {
            paySettingItemViewHolder.f12958a.setVisibility(8);
            paySettingItemViewHolder.b.setVisibility(0);
        } else {
            paySettingItemViewHolder.f12958a.setVisibility(0);
            paySettingItemViewHolder.b.setVisibility(8);
        }
        String str = paySettingItem.itemTitle;
        if (str != null) {
            paySettingItemViewHolder.d.setText(str);
        } else {
            paySettingItemViewHolder.d.setText("");
        }
        String str2 = paySettingItem.itemSubtitle;
        if (str2 != null) {
            paySettingItemViewHolder.e.setText(str2);
            paySettingItemViewHolder.e.setVisibility(0);
        } else {
            paySettingItemViewHolder.e.setVisibility(8);
        }
        String str3 = paySettingItem.itemDesc;
        if (str3 != null) {
            paySettingItemViewHolder.f.setText(str3);
            paySettingItemViewHolder.f.setVisibility(0);
        } else {
            paySettingItemViewHolder.f.setVisibility(8);
        }
        if (paySettingItem.redIcon) {
            paySettingItemViewHolder.h.setVisibility(0);
        } else {
            paySettingItemViewHolder.h.setVisibility(8);
        }
        List<PaySettingItem.SettingsEvent> list = paySettingItem.event;
        if (list == null || list.size() <= 0) {
            paySettingItemViewHolder.g.setVisibility(4);
        } else {
            paySettingItemViewHolder.g.setVisibility(0);
            paySettingItemViewHolder.c.setTag(paySettingItem.itemTitle);
        }
        ViewProxy.setOnClickListener(paySettingItemViewHolder.itemView, new a(paySettingItem));
    }

    /* renamed from: O */
    public PaySettingItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PaySettingItemViewHolder) ipChange.ipc$dispatch("f2f4a2c7", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new PaySettingItemViewHolder(this.b.inflate(R.layout.pay_setting_page_item, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<PaySettingItem> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setData(List<PaySettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else if (list != null) {
            this.c = list;
            notifyDataSetChanged();
        }
    }
}
