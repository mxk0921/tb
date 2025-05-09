package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.pvs;
import tb.t2o;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f13279a = true;
    public final TaoLiveRecyclerView b;

    static {
        t2o.a(779093436);
    }

    public TaoLiveLayoutManager(Context context, int i, boolean z, TaoLiveRecyclerView taoLiveRecyclerView) {
        super(context, i, z);
        this.b = taoLiveRecyclerView;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveLayoutManager taoLiveLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1043006560) {
            return super.onFocusSearchFailed((View) objArr[0], ((Number) objArr[1]).intValue(), (RecyclerView.Recycler) objArr[2], (RecyclerView.State) objArr[3]);
        }
        if (hashCode == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/sdk/controller/TaoLiveLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.f13279a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1d4fba0", new Object[]{this, view, new Integer(i), recycler, state});
        }
        if (!pvs.s1()) {
            return super.onFocusSearchFailed(view, i, recycler, state);
        }
        TLog.loge("tblive", "TaoLiveLayoutManager", "onFocusSearchFailed, return null");
        return null;
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        x5t.h("TaoLiveLayoutManager", "layoutManager real updateScrollEnabled " + z);
        this.f13279a = z;
        if (!z) {
            this.b.setTag(R.id.tag_kill_up_down, c);
        } else {
            this.b.setTag(R.id.tag_kill_up_down, null);
        }
    }
}
