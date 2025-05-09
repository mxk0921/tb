package com.alibaba.android.ultron.vfw.perf.asynccomponent;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PreloadAsyncOnScrollListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Coordinator.TaggedRunnable f2339a;
    public final boolean b;
    public boolean c = false;

    static {
        t2o.a(157286693);
    }

    public PreloadAsyncOnScrollListener(Coordinator.TaggedRunnable taggedRunnable, boolean z) {
        this.f2339a = taggedRunnable;
        this.b = z;
    }

    public static /* synthetic */ Object ipc$super(PreloadAsyncOnScrollListener preloadAsyncOnScrollListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/perf/asynccomponent/PreloadAsyncOnScrollListener");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (this.f2339a == null) {
            UnifyLog.d(PreloadAsyncComponent.TAG, "onScrollStateChanged mLoadAllRunnable is null");
        } else if (!this.c && i != 1) {
            this.c = true;
            UnifyLog.d(PreloadAsyncComponent.TAG, "onScrollStateChanged triger mLoadAllRunnable run when userFingerOffTheScreen mAsyncSendCreateEvent=" + this.b);
            if (this.b) {
                Coordinator.postTask(this.f2339a);
            } else {
                this.f2339a.run();
            }
        }
    }
}
