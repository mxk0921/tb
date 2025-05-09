package com.taobao.search.musie.pager;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ckf;
import tb.mxh;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbSlideAdapter extends RecyclerView.Adapter<SlideViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSDKInstance f11593a;
    public final ArrayList<ywh> b = new ArrayList<>();

    static {
        t2o.a(815792761);
    }

    public TbSlideAdapter(MUSDKInstance mUSDKInstance) {
        ckf.g(mUSDKInstance, "instance");
        this.f11593a = mUSDKInstance;
    }

    public static /* synthetic */ Object ipc$super(TbSlideAdapter tbSlideAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/TbSlideAdapter");
    }

    /* renamed from: M */
    public void onBindViewHolder(SlideViewHolder slideViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc2cf30", new Object[]{this, slideViewHolder, new Integer(i)});
        } else if (slideViewHolder != null) {
            ywh ywhVar = this.b.get(i);
            ckf.f(ywhVar, "get(...)");
            slideViewHolder.b0(ywhVar, this.f11593a);
        }
    }

    /* renamed from: N */
    public SlideViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SlideViewHolder) ipChange.ipc$dispatch("968dc568", new Object[]{this, viewGroup, new Integer(i)});
        }
        MUSView a2 = mxh.a(this.f11593a);
        ckf.f(a2, "acquireMUSView(...)");
        return new SlideViewHolder(a2);
    }

    /* renamed from: O */
    public void onViewAttachedToWindow(SlideViewHolder slideViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5237ad", new Object[]{this, slideViewHolder});
        } else if (slideViewHolder != null) {
            slideViewHolder.d0();
        }
    }

    public final void P(List<? extends ywh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79fbad3", new Object[]{this, list});
            return;
        }
        ckf.g(list, "list");
        this.b.clear();
        this.b.addAll(list);
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        Iterator<ywh> it = this.b.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ywh next = it.next();
            ckf.f(next, "next(...)");
            ywh ywhVar = next;
            MUSView n = ywhVar.n();
            if (n != null) {
                n.release(true);
            }
            MUSView n2 = ywhVar.n();
            if (n2 != null) {
                n2.setInstance(null);
            }
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
}
