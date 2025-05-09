package com.taobao.taolive.room.ui.view.recyclermoreload;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FixDataObserver extends RecyclerView.AdapterDataObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f13259a;

    static {
        t2o.a(779093308);
    }

    public FixDataObserver(RecyclerView recyclerView) {
        this.f13259a = recyclerView;
    }

    public static /* synthetic */ Object ipc$super(FixDataObserver fixDataObserver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/recyclermoreload/FixDataObserver");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f13259a.getAdapter() instanceof RecyclerArrayAdapter) {
            RecyclerArrayAdapter recyclerArrayAdapter = (RecyclerArrayAdapter) this.f13259a.getAdapter();
            if (recyclerArrayAdapter.Q() > 0 && recyclerArrayAdapter.P() == i2) {
                this.f13259a.scrollToPosition(0);
            }
        }
    }
}
