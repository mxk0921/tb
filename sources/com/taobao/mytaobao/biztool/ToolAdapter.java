package com.taobao.mytaobao.biztool;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/taobao/mytaobao/biztool/ToolAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ToolAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f11206a = new JSONArray();
    public g1a<? super Integer, xhv> b;
    public final int c;
    public int d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView.ViewHolder b;

        public a(RecyclerView.ViewHolder viewHolder) {
            this.b = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g1a<Integer, xhv> M = ToolAdapter.this.M();
            if (M != null) {
                M.invoke(Integer.valueOf(((MyToolViewHolder) this.b).getAdapterPosition()));
            }
        }
    }

    static {
        t2o.a(745537672);
    }

    public ToolAdapter(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static /* synthetic */ Object ipc$super(ToolAdapter toolAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/ToolAdapter");
    }

    public final g1a<Integer, xhv> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("8d9d9f3d", new Object[]{this});
        }
        return this.b;
    }

    public final void N(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f24db", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i;
        this.e = i2;
    }

    public final void O(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4457adb", new Object[]{this, jSONArray});
            return;
        }
        ckf.h(jSONArray, "list");
        this.f11206a.clear();
        this.f11206a.addAll(jSONArray);
    }

    public final void P(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a72579", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f11206a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        Long l = this.f11206a.getJSONObject(i).getLong("mtbUniId");
        ckf.c(l, "mDataList.getJSONObject(…tion).getLong(\"mtbUniId\")");
        return l.longValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        ckf.h(viewHolder, "holder");
        if (viewHolder instanceof MyToolViewHolder) {
            View view = viewHolder.itemView;
            ckf.c(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = this.d;
            if (!(i2 == i3 && layoutParams.height == this.e)) {
                layoutParams.width = i3;
                layoutParams.height = this.e;
                View view2 = viewHolder.itemView;
                ckf.c(view2, "holder.itemView");
                view2.setLayoutParams(layoutParams);
            }
            JSONObject jSONObject = this.f11206a.getJSONObject(i);
            ckf.c(jSONObject, "mDataList.getJSONObject(position)");
            ((MyToolViewHolder) viewHolder).b0(jSONObject, new a(viewHolder));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.h(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mytaobao_tool_mine_edit_viewholder, viewGroup, false);
        ckf.c(inflate, "itemView");
        return new MyToolViewHolder(inflate, this.c, this.d, this.e);
    }
}
