package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k6c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecycleViewAdapterDataObserver extends RecyclerView.AdapterDataObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k6c<RecyclerView> f10679a;

    static {
        t2o.a(486539695);
    }

    public RecycleViewAdapterDataObserver(k6c<RecyclerView> k6cVar) {
        this.f10679a = k6cVar;
    }

    public static /* synthetic */ Object ipc$super(RecycleViewAdapterDataObserver recycleViewAdapterDataObserver, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1902625302:
                super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1756146412:
                super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1389471316:
                super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            case -1172900388:
                super.onChanged();
                return null;
            case -238222724:
                super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1882209744:
                super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/config/RecycleViewAdapterDataObserver");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            return;
        }
        super.onChanged();
        this.f10679a.t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeChanged(i, i2);
        this.f10679a.u(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeInserted(i, i2);
        this.f10679a.j(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        super.onItemRangeMoved(i, i2, i3);
        this.f10679a.K(i, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onItemRangeRemoved(i, i2);
        this.f10679a.r(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        super.onItemRangeChanged(i, i2, obj);
        this.f10679a.G(i, i2, obj);
    }
}
