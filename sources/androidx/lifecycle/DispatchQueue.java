package androidx.lifecycle;

import androidx.lifecycle.DispatchQueue;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.d;
import tb.ckf;
import tb.fzh;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "Ltb/xhv;", "enqueue", "(Ljava/lang/Runnable;)V", "pause", "resume", "finish", "drainQueue", "", "canRun", "()Z", "Lkotlin/coroutines/d;", "context", "dispatchAndEnqueue", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "paused", "Z", "finished", "isDraining", "Ljava/util/Queue;", "queue", "Ljava/util/Queue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DispatchQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fd2a52", new Object[]{dispatchQueue, runnable});
            return;
        }
        ckf.g(dispatchQueue, "this$0");
        ckf.g(runnable, "$runnable");
        dispatchQueue.enqueue(runnable);
    }

    private final void enqueue(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f75db8d", new Object[]{this, runnable});
        } else if (this.queue.offer(runnable)) {
            drainQueue();
        } else {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
    }

    public final boolean canRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89fafa6", new Object[]{this})).booleanValue();
        }
        if (this.finished || !this.paused) {
            return true;
        }
        return false;
    }

    public final void dispatchAndEnqueue(d dVar, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f507622", new Object[]{this, dVar, runnable});
            return;
        }
        ckf.g(dVar, "context");
        ckf.g(runnable, "runnable");
        fzh N0 = zq7.c().N0();
        if (N0.isDispatchNeeded(dVar) || canRun()) {
            N0.dispatch(dVar, new Runnable() { // from class: tb.sq7
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue.this, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    public final void drainQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74590a00", new Object[]{this});
        } else if (!this.isDraining) {
            try {
                this.isDraining = true;
                while (!this.queue.isEmpty() && canRun()) {
                    Runnable poll = this.queue.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
            } finally {
                this.isDraining = false;
            }
        }
    }

    public final void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.paused = true;
        }
    }

    public final void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.paused) {
            if (!this.finished) {
                this.paused = false;
                drainQueue();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
    }
}
