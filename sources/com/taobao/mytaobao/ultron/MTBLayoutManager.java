package com.taobao.mytaobao.ultron;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xvc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/taobao/mytaobao/ultron/MTBLayoutManager;", "Lcom/alibaba/android/ultron/ext/vlayout/VirtualLayoutManager;", "Ltb/xvc;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTBLayoutManager extends VirtualLayoutManager implements xvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean K;

    static {
        t2o.a(745538037);
        t2o.a(745538033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTBLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        ckf.h(context, "context");
    }

    public static /* synthetic */ Object ipc$super(MTBLayoutManager mTBLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MTBLayoutManager");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        y0(view, i);
        try {
            super.addView(view, i);
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManager addView: " + th);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        if (!ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            StringBuilder sb = new StringBuilder("MTBLayoutManager error: 子线程removeView, view=");
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
            TLog.loge("mtbMainLink", "MTBLayoutManager removeView: child=" + view + " exp=" + th);
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
            StringBuilder sb = new StringBuilder("MTBLayoutManager error: 子线程removeViewAt, index=");
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
            TLog.loge("mtbMainLink", "MTBLayoutManager removeViewAt: index=" + i + ' ' + th);
            throw th;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.K) {
            return super.scrollVerticallyBy(i, recycler, state);
        }
        this.K = false;
        return 0;
    }

    @Override // tb.xvc
    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6ac84c", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public final void y0(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82633e9", new Object[]{this, view, new Integer(i)});
            return;
        }
        try {
            String str = null;
            if (!ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
                StringBuilder sb = new StringBuilder("MTBLayoutManager error: 子线程addView, view=");
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
                StringBuilder sb2 = new StringBuilder("MTBLayoutManager 异常addView， child=");
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
            TLog.loge("mtbMainLink", "MTBLayoutManager considerTraceExp: " + th);
        }
    }
}
