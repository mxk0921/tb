package com.alibaba.android.ultron.vfw.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.f9v;
import tb.mgw;
import tb.rew;
import tb.t2o;
import tb.xh8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RecyclerViewAdapter";

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f2306a;
    public final List<IDMComponent> b = new ArrayList();
    public final rew c;

    static {
        t2o.a(157286554);
        t2o.a(157286553);
    }

    public RecyclerViewAdapter(ViewEngine viewEngine) {
        this.f2306a = viewEngine;
        this.c = (rew) viewEngine.a0(rew.class);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewAdapter recyclerViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/adapter/RecyclerViewAdapter");
    }

    public final void M(IDMComponent iDMComponent, int i) {
        ConcurrentHashMap<String, Object> safeExtMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756fcab9", new Object[]{this, iDMComponent, new Integer(i)});
        } else if (iDMComponent != null && (safeExtMap = iDMComponent.getSafeExtMap()) != null) {
            safeExtMap.put("ultronDMComponentIndex", Integer.valueOf(i));
        }
    }

    /* renamed from: N */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb07792c", new Object[]{this, recyclerViewHolder, new Integer(i)});
        } else if (i >= ((ArrayList) this.b).size()) {
            f9v.q(xh8.a(this.f2306a.I()).c(TAG).message("onBindViewHolder IndexOutOfBounds"));
        } else {
            IDMComponent iDMComponent = (IDMComponent) ((ArrayList) this.b).get(i);
            if (iDMComponent != null) {
                M(iDMComponent, i);
                this.c.b(recyclerViewHolder, iDMComponent);
            }
        }
    }

    /* renamed from: O */
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("14f1daa8", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (-1 == i) {
            return new RecyclerViewHolder(mgw.a(this.f2306a.K()));
        }
        return this.c.c(viewGroup, i);
    }

    public List<IDMComponent> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.b;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.c.f((IDMComponent) ((ArrayList) this.b).get(i));
    }

    public void setData(List<IDMComponent> list) {
        rew rewVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        if (list != null) {
            ((ArrayList) this.b).clear();
            ((ArrayList) this.b).addAll(list);
        }
        if (this.f2306a.o0() && (rewVar = this.c) != null) {
            rewVar.j(this.b);
        }
    }
}
