package com.alibaba.android.ultron.vfw.perf.rebuilddelay;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.hav;
import tb.n7v;
import tb.t2o;
import tb.vav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UltronViewRebuildDelayTask extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f2340a;
    public final RecyclerView b;
    public final LinearLayoutManager c;
    public ConcurrentHashMap<String, Runnable> d;
    public int e = 5;

    static {
        t2o.a(157286695);
    }

    public UltronViewRebuildDelayTask(String str, RecyclerView recyclerView) {
        this.f2340a = str;
        this.b = recyclerView;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.c = (LinearLayoutManager) layoutManager;
            } else if (n7v.a()) {
                throw new IllegalStateException("仅支持LinearLayoutManager");
            }
            recyclerView.addOnScrollListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(UltronViewRebuildDelayTask ultronViewRebuildDelayTask, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/vfw/perf/rebuilddelay/UltronViewRebuildDelayTask");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6938e2", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public void o(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d6448", new Object[]{this, str, runnable});
            return;
        }
        if (this.d == null) {
            this.d = new ConcurrentHashMap<>();
        }
        this.e = vav.e(this.f2340a, "resumeDelayTaskItemCountWhenReachEnd", 5);
        this.d.put(str, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            r();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.c != null && recyclerView.getAdapter() != null && this.c.findLastVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - this.e) {
            s();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.d = null;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406628d1", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.d;
        if (!(concurrentHashMap == null || concurrentHashMap.isEmpty())) {
            hav.d("UltronViewRebuildDelayTask", "滚动停止，恢复刷新任务");
            for (Runnable runnable : this.d.values()) {
                runnable.run();
            }
            this.d.clear();
        }
    }

    public final void s() {
        Runnable remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e737b665", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = this.d;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty() && (remove = this.d.remove(UltronViewRebuildDelayType.rebuildWhenIdleOrLastItemVisible)) != null) {
            remove.run();
        }
    }
}
