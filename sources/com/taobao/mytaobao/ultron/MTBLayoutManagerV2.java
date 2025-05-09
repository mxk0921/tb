package com.taobao.mytaobao.ultron;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xvc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/taobao/mytaobao/ultron/MTBLayoutManagerV2;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ltb/xvc;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTBLayoutManagerV2 extends LinearLayoutManager implements xvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11322a;
    public boolean b = true;

    static {
        t2o.a(745538038);
        t2o.a(745538033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTBLayoutManagerV2(Context context, int i, boolean z) {
        super(context, i, z);
        ckf.h(context, "context");
    }

    public static /* synthetic */ Object ipc$super(MTBLayoutManagerV2 mTBLayoutManagerV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 1273305472:
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MTBLayoutManagerV2");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        y(view, i);
        try {
            super.addView(view, i);
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 addView: " + th);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        return super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        if (!ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            StringBuilder sb = new StringBuilder("MTBLayoutManagerV2 error: 子线程removeView, view=");
            sb.append(view != null ? view.toString() : null);
            sb.append(", thread=");
            Thread currentThread = Thread.currentThread();
            ckf.c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            TLog.loge("mtbMainLink", sb.toString());
        }
        try {
            super.removeView(view);
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 removeView: child=" + view + " exp=" + th);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            return;
        }
        if (!ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            StringBuilder sb = new StringBuilder("MTBLayoutManagerV2 error: 子线程removeViewAt, index=");
            sb.append(i);
            sb.append(", thread=");
            Thread currentThread = Thread.currentThread();
            ckf.c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            TLog.loge("mtbMainLink", sb.toString());
        }
        try {
            super.removeViewAt(i);
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 removeViewAt: index=" + i + ' ' + th);
            throw th;
        }
    }

    @Override // tb.xvc
    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969c738f", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.f11322a) {
            return super.scrollVerticallyBy(i, recycler, state);
        }
        this.f11322a = false;
        return 0;
    }

    @Override // tb.xvc
    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6ac84c", new Object[]{this, new Boolean(z)});
        } else {
            this.f11322a = z;
        }
    }

    public final void y(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82633e9", new Object[]{this, view, new Integer(i)});
            return;
        }
        try {
            String str = null;
            if (!ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
                StringBuilder sb = new StringBuilder("MTBLayoutManagerV2 error: 子线程addView, view=");
                sb.append(view != null ? view.toString() : null);
                sb.append(", thread=");
                Thread currentThread = Thread.currentThread();
                ckf.c(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                TLog.loge("mtbMainLink", sb.toString());
            }
            ViewParent parent = view != null ? view.getParent() : null;
            if (!(parent instanceof RecyclerView)) {
                parent = null;
            }
            RecyclerView recyclerView = (RecyclerView) parent;
            if (recyclerView != null && recyclerView.indexOfChild(view) == -1) {
                recyclerView.removeView(view);
                StringBuilder sb2 = new StringBuilder("MTBLayoutManagerV2 异常addView， child=");
                if (view != null) {
                    str = view.toString();
                }
                sb2.append(str);
                sb2.append(", index=");
                sb2.append(i);
                sb2.append(", thread=");
                Thread currentThread2 = Thread.currentThread();
                ckf.c(currentThread2, "Thread.currentThread()");
                sb2.append(currentThread2.getName());
                TLog.loge("mtbMainLink", sb2.toString());
            }
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 considerTraceExp: " + th);
        }
    }
}
