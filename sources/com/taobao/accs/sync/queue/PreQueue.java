package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.f2r;
import tb.pmo;
import tb.q0e;
import tb.t2o;
import tb.yqt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreQueue extends BaseQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PreQueue";
    private ScheduledFuture future;
    private q0e listener;
    private long timeoutInMill = 30000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PreQueue.access$000(PreQueue.this) != null) {
                PreQueue.access$000(PreQueue.this).onTimeout();
            }
        }
    }

    static {
        t2o.a(343933196);
    }

    public PreQueue(int i, Comparator<f2r> comparator) {
        super(i, comparator);
    }

    public static /* synthetic */ q0e access$000(PreQueue preQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0e) ipChange.ipc$dispatch("6b7846a5", new Object[]{preQueue});
        }
        return preQueue.listener;
    }

    public static /* synthetic */ Object ipc$super(PreQueue preQueue, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272099756:
                super.clear();
                return null;
            case -838545804:
                return new Boolean(super.offer((f2r) objArr[0]));
            case -340895956:
                return super.poll();
            case 555707029:
                return new Boolean(super.isNext((f2r) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/sync/queue/PreQueue");
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        updateTimeout();
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public /* bridge */ /* synthetic */ boolean isNext(f2r f2rVar) {
        return super.isNext(f2rVar);
    }

    public void updateTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40be80df", new Object[]{this});
            return;
        }
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null) {
            try {
                scheduledFuture.cancel(false);
                this.future = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!isEmpty()) {
            this.future = yqt.e().schedule(new a(), this.timeoutInMill, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public boolean offer(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce04ce74", new Object[]{this, f2rVar})).booleanValue();
        }
        if (!super.offer(f2rVar)) {
            return false;
        }
        pmo.c(TAG, "offer", "msg", f2rVar);
        updateTimeout();
        return true;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue
    public f2r poll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f2r) ipChange.ipc$dispatch("4a99abdd", new Object[]{this});
        }
        f2r f2rVar = (f2r) super.poll();
        updateTimeout();
        return f2rVar;
    }

    public void setTimeout(long j, q0e q0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf57c63", new Object[]{this, new Long(j), q0eVar});
            return;
        }
        pmo.c(TAG, "setTimeoutInMill = " + j + "ms", new Object[0]);
        if (j > 100) {
            this.timeoutInMill = j;
        }
        this.listener = q0eVar;
    }
}
