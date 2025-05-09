package anetwork.channel.unified;

import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FutureResponse implements Future<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCanceled;
    private UnifiedRequestTask task;

    static {
        t2o.a(607126131);
    }

    public FutureResponse(UnifiedRequestTask unifiedRequestTask) {
        this.task = unifiedRequestTask;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.isCanceled) {
            this.task.cancelTask();
            this.isCanceled = true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.isCanceled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        throw new RuntimeException("NOT SUPPORT!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Response get() throws InterruptedException, ExecutionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("dc76621f", new Object[]{this});
        }
        throw new RuntimeException("NOT SUPPORT!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Response get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("c3e8b213", new Object[]{this, new Long(j), timeUnit});
        }
        throw new RuntimeException("NOT SUPPORT!");
    }
}
