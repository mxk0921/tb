package com.taobao.android.fluid.framework.list.render;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.render.a;
import com.taobao.android.fluid.framework.list.render.b;
import tb.t2o;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f7861a;
    public final uq9 b;
    public final SparseArray<View> c = new SparseArray<>();
    public final MultiRecyclerViewAdapter d;

    static {
        t2o.a(468714483);
    }

    public RecyclerViewHolder(View view, uq9 uq9Var, MultiRecyclerViewAdapter multiRecyclerViewAdapter, a.C0421a aVar, b.a aVar2) {
        super(view);
        this.b = uq9Var;
        this.d = multiRecyclerViewAdapter;
        this.f7861a = new a(uq9Var, aVar, aVar2);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewHolder recyclerViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/RecyclerViewHolder");
    }

    public <T extends View> T b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        return (T) getView(i);
    }

    public MultiRecyclerViewAdapter c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiRecyclerViewAdapter) ipChange.ipc$dispatch("df6d9fce", new Object[]{this});
        }
        return this.d;
    }

    public a d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("77ea311d", new Object[]{this});
        }
        return this.f7861a;
    }

    public uq9 e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("13f857fc", new Object[]{this});
        }
        return this.b;
    }

    public <T extends View> T getView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)}));
        }
        T t = (T) this.c.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.c.put(i, t2);
        return t2;
    }
}
