package com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.taobao.R;
import tb.m0q;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SizeChartViewColumnAdapter extends AbsRecyclerViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final SizeChartItemModel e;
    public final int f;
    public boolean h;
    public boolean j;
    public int g = m0q.DEFAULT_WIDTH;
    public int i = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BodyViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f6894a;
        public final TextView b;
        public final View c;
        public final View d;

        static {
            t2o.a(912262325);
        }

        public BodyViewHolder(SizeChartViewColumnAdapter sizeChartViewColumnAdapter, View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.tv_desc_size_chart_recommend);
            this.f6894a = (TextView) view.findViewById(R.id.tv_desc_size_chart_item);
            this.c = view.findViewById(R.id.v_detail_size_chart_top_div);
            this.d = view.findViewById(R.id.v_detail_size_chart_bottom_div);
        }

        public static /* synthetic */ Object ipc$super(BodyViewHolder bodyViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/SizeChartViewColumnAdapter$BodyViewHolder");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class TitleViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f6895a;
        public final TextView b;
        public final View c;

        static {
            t2o.a(912262326);
        }

        public TitleViewHolder(SizeChartViewColumnAdapter sizeChartViewColumnAdapter, View view) {
            super(view);
            this.f6895a = (TextView) view.findViewById(R.id.item_tv);
            this.b = (TextView) view.findViewById(R.id.tip);
            this.c = view.findViewById(R.id.divider);
        }

        public static /* synthetic */ Object ipc$super(TitleViewHolder titleViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/SizeChartViewColumnAdapter$TitleViewHolder");
        }

        public View b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a7676f31", new Object[]{this});
            }
            return this.c;
        }

        public TextView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("68deeaa5", new Object[]{this});
            }
            return this.b;
        }

        public TextView getTextView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this});
            }
            return this.f6895a;
        }
    }

    static {
        t2o.a(912262324);
    }

    public SizeChartViewColumnAdapter(Context context, SizeChartItemModel sizeChartItemModel) {
        super(context);
        this.f = 0;
        this.e = sizeChartItemModel;
        try {
            this.f = sizeChartItemModel.rowData.size() + 1;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(SizeChartViewColumnAdapter sizeChartViewColumnAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1441289013) {
            super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/SizeChartViewColumnAdapter");
    }

    public String N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef7918e4", new Object[]{this, new Integer(i)});
        }
        try {
            if (i == 0) {
                return this.e.title;
            }
            return this.e.rowData.get((i % this.f) - 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue();
        }
        try {
            int i = this.e.maxLength * m0q.DEFAULT_TEXT_SIZE;
            int i2 = m0q.DEFAULT_TEXT_PADDING;
            return i + i2 + i2;
        } catch (Exception unused) {
            return m0q.DEFAULT_WIDTH;
        }
    }

    public boolean P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb3c969", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public void Q(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2b289c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.i = i;
        this.j = z;
        notifyDataSetChanged();
    }

    public void S(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149bb9ae", new Object[]{this, view, new Integer(i)});
            return;
        }
        int i2 = m0q.DEFAULT_HEIGHT;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744f7a87", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        notifyDataSetChanged();
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (P(i)) {
            return 0;
        }
        return 1;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(viewHolder, i);
        int i2 = 8;
        if (viewHolder instanceof BodyViewHolder) {
            BodyViewHolder bodyViewHolder = (BodyViewHolder) viewHolder;
            bodyViewHolder.f6894a.setText(N(i));
            if (this.i == i) {
                TextView textView = bodyViewHolder.b;
                if (this.j) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                bodyViewHolder.itemView.setBackgroundResource(R.drawable.tt_detail_size_chart_recommend_line_bg);
                bodyViewHolder.c.setVisibility(0);
                bodyViewHolder.d.setVisibility(0);
            }
        } else if (viewHolder instanceof TitleViewHolder) {
            TitleViewHolder titleViewHolder = (TitleViewHolder) viewHolder;
            titleViewHolder.getTextView().setText(N(i));
            if (!TextUtils.isEmpty(this.e.tip)) {
                TextView c0 = titleViewHolder.c0();
                c0.setText(this.e.tip);
                c0.setVisibility(0);
            }
            if (this.h) {
                titleViewHolder.b0().setVisibility(0);
            } else {
                titleViewHolder.b0().setVisibility(8);
            }
        }
        int O = O();
        int i3 = this.g;
        if (i3 > O) {
            O = i3;
        }
        S(viewHolder.itemView, O);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            return new TitleViewHolder(this, LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_desc_measures_title_item, (ViewGroup) null));
        }
        return new BodyViewHolder(this, LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_include_desc_size_chart_title_column, (ViewGroup) null));
    }
}
