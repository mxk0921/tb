package com.taobao.tao.sharepanel.common;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bpf;
import tb.ma4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CommonAdapter<T extends ma4> extends RecyclerView.Adapter<ItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12756a;
    public final List<T> b;
    public final boolean c;
    public final JSONObject d;

    static {
        t2o.a(666894545);
    }

    public CommonAdapter(Context context, List<T> list) {
        this(context, list, false, null);
    }

    public static /* synthetic */ Object ipc$super(CommonAdapter commonAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/common/CommonAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15510954", new Object[]{this, itemViewHolder, new Integer(i)});
        } else {
            itemViewHolder.b0(this.b.get(i), i);
        }
    }

    /* renamed from: N */
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemViewHolder) ipChange.ipc$dispatch("7c86a544", new Object[]{this, viewGroup, new Integer(i)});
        }
        return bpf.a(this.f12756a, i, this.c, this.d);
    }

    public void O(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb2c0bf", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.b.get(i).c().index;
    }

    public CommonAdapter(Context context, List<T> list, boolean z, JSONObject jSONObject) {
        this.f12756a = context;
        this.b = list;
        this.c = z;
        this.d = jSONObject;
    }
}
