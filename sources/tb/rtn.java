package tb;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rtn implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f27603a;
    public Thread b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27604a;

        public a(String str) {
            this.f27604a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f27604a);
            rtn rtnVar = rtn.this;
            rtnVar.b = thread;
            return rtnVar.b;
        }
    }

    public rtn(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(str));
        this.f27603a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final boolean c() {
        Thread thread = this.b;
        if (thread == null || thread.getId() != Thread.currentThread().getId()) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            this.f27603a.execute(runnable);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        try {
            this.f27603a.shutdownNow();
        } catch (Exception unused) {
        }
    }
}
