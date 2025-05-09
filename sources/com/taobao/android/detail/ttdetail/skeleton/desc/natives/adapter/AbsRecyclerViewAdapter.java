package com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsRecyclerViewAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6887a;
    public final int b;
    public final int c;
    public int d = 1;

    static {
        t2o.a(912262316);
    }

    public AbsRecyclerViewAdapter(Context context) {
        this.f6887a = context;
        this.c = context.getResources().getColor(R.color.tt_detail_desc_normal_background);
        this.b = context.getResources().getColor(R.color.tt_detail_desc_measure_background_color);
    }

    public static /* synthetic */ Object ipc$super(AbsRecyclerViewAdapter absRecyclerViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/AbsRecyclerViewAdapter");
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1607399", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        int i2 = this.d;
        if (i2 <= 0) {
            return;
        }
        if ((i / i2) % 2 == 0) {
            viewHolder.itemView.setBackgroundColor(this.b);
        } else {
            viewHolder.itemView.setBackgroundColor(this.c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return null;
    }
}
