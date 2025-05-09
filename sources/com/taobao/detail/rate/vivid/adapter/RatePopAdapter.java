package com.taobao.detail.rate.vivid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.hhn;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/detail/rate/vivid/adapter/RatePopAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/taobao/detail/rate/vivid/adapter/RatePopAdapter$RatePopViewHolder;", "RatePopViewHolder", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RatePopAdapter extends RecyclerView.Adapter<RatePopViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<hhn> f10372a;
    public final u1a<Integer, hhn, xhv> b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/detail/rate/vivid/adapter/RatePopAdapter$RatePopViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class RatePopViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f10373a;
        public final TUrlImageView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatePopViewHolder(View view) {
            super(view);
            ckf.g(view, "itemView");
            View findViewById = view.findViewById(R.id.pop_item_title);
            if (findViewById != null) {
                this.f10373a = (TextView) findViewById;
                View findViewById2 = view.findViewById(R.id.pop_item_icon);
                if (findViewById2 != null) {
                    this.b = (TUrlImageView) findViewById2;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }

        public static /* synthetic */ Object ipc$super(RatePopViewHolder ratePopViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/adapter/RatePopAdapter$RatePopViewHolder");
        }

        public final TUrlImageView b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("cf8c6246", new Object[]{this});
            }
            return this.b;
        }

        public final TextView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("680f299d", new Object[]{this});
            }
            return this.f10373a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ hhn c;

        public a(int i, hhn hhnVar) {
            this.b = i;
            this.c = hhnVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RatePopAdapter.M(RatePopAdapter.this).invoke(Integer.valueOf(this.b), this.c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatePopAdapter(List<hhn> list, u1a<? super Integer, ? super hhn, xhv> u1aVar) {
        ckf.g(list, "items");
        ckf.g(u1aVar, "itemClickListener");
        this.f10372a = list;
        this.b = u1aVar;
    }

    public static final /* synthetic */ u1a M(RatePopAdapter ratePopAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("cab9f313", new Object[]{ratePopAdapter});
        }
        return ratePopAdapter.b;
    }

    public static /* synthetic */ Object ipc$super(RatePopAdapter ratePopAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/adapter/RatePopAdapter");
    }

    /* renamed from: N */
    public void onBindViewHolder(RatePopViewHolder ratePopViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc606aa7", new Object[]{this, ratePopViewHolder, new Integer(i)});
            return;
        }
        ckf.g(ratePopViewHolder, "holder");
        hhn hhnVar = this.f10372a.get(i);
        ratePopViewHolder.c0().setText(hhnVar.b());
        ratePopViewHolder.b0().setImageUrl(hhnVar.a());
        ViewProxy.setOnClickListener(ratePopViewHolder.itemView, new a(i, hhnVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f10372a.size();
    }

    /* renamed from: O */
    public RatePopViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RatePopViewHolder) ipChange.ipc$dispatch("ead34f51", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rate_pop_item, viewGroup, false);
        ckf.f(inflate, "view");
        return new RatePopViewHolder(inflate);
    }
}
