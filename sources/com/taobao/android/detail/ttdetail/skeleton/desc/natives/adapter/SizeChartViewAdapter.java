package com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import java.util.ArrayList;
import tb.m0q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SizeChartViewAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6892a;
    public final ArrayList<SizeChartItemModel> b;
    public int d;
    public int c = m0q.DEFAULT_WIDTH;
    public final int e = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BodyViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f6893a;

        static {
            t2o.a(912262323);
        }

        public BodyViewHolder(SizeChartViewAdapter sizeChartViewAdapter, RecyclerView recyclerView) {
            super(recyclerView);
            this.f6893a = recyclerView;
        }

        public static /* synthetic */ Object ipc$super(BodyViewHolder bodyViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/SizeChartViewAdapter$BodyViewHolder");
        }

        public RecyclerView b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("d7db73f", new Object[]{this});
            }
            return this.f6893a;
        }
    }

    static {
        t2o.a(912262322);
    }

    public SizeChartViewAdapter(Context context, ArrayList<SizeChartItemModel> arrayList) {
        this.f6892a = context;
        this.b = arrayList;
    }

    public static /* synthetic */ Object ipc$super(SizeChartViewAdapter sizeChartViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/SizeChartViewAdapter");
    }

    public int M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("160fce17", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            int i2 = this.b.get(i).maxLength * m0q.DEFAULT_TEXT_SIZE;
            int i3 = m0q.DEFAULT_TEXT_PADDING;
            return i2 + i3 + i3;
        } catch (Exception unused) {
            return m0q.DEFAULT_WIDTH;
        }
    }

    public void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void O(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edbef15", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<SizeChartItemModel> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof BodyViewHolder) {
            int M = M(i);
            int i2 = this.c;
            if (i2 > M) {
                M = i2;
            }
            O(viewHolder.itemView, M, this.d);
            RecyclerView b0 = ((BodyViewHolder) viewHolder).b0();
            b0.setLayoutManager(new LinearLayoutManager(this.f6892a, 1, false));
            SizeChartViewColumnAdapter sizeChartViewColumnAdapter = new SizeChartViewColumnAdapter(this.f6892a, this.b.get(i));
            sizeChartViewColumnAdapter.U(M);
            sizeChartViewColumnAdapter.T(true);
            sizeChartViewColumnAdapter.Q(this.e, false);
            b0.setAdapter(sizeChartViewColumnAdapter);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        RecyclerView recyclerView = new RecyclerView(this.f6892a);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        return new BodyViewHolder(this, recyclerView);
    }
}
