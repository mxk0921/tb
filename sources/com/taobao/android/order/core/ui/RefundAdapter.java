package com.taobao.android.order.core.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RefundAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f9159a;

    static {
        t2o.a(614465790);
    }

    public RefundAdapter(View view) {
        this.f9159a = view;
    }

    public static /* synthetic */ Object ipc$super(RefundAdapter refundAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/ui/RefundAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb07792c", new Object[]{this, recyclerViewHolder, new Integer(i)});
        }
    }

    /* renamed from: N */
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("14f1daa8", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new RecyclerViewHolder(this.f9159a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return 1;
    }
}
