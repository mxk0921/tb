package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lgc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InfoFlowItemAnimator extends DefaultItemAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lgc.a f10675a;

    static {
        t2o.a(486539690);
    }

    public InfoFlowItemAnimator(lgc.a aVar) {
        this.f10675a = aVar;
    }

    public static /* synthetic */ Object ipc$super(InfoFlowItemAnimator infoFlowItemAnimator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/config/InfoFlowItemAnimator");
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede046bf", new Object[]{this, viewHolder});
        } else {
            this.f10675a.e(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859a690d", new Object[]{this, viewHolder});
        } else {
            this.f10675a.f(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7771f80", new Object[]{this, viewHolder});
        } else {
            this.f10675a.g(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3141ce", new Object[]{this, viewHolder});
        } else {
            this.f10675a.k(viewHolder);
        }
    }
}
