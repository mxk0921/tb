package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<ThreadPoolExecutor> f24926a = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(nsi nsiVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MetaRequestManagerThread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class b<Input, Output> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001843);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a19e4504", new Object[]{bVar})).booleanValue();
            }
            throw null;
        }

        public static /* synthetic */ Object b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("9f933733", new Object[]{bVar});
            }
            throw null;
        }
    }

    static {
        t2o.a(993001839);
    }

    public nsi() {
        new Handler(Looper.getMainLooper());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        int size = this.f24926a.size();
        for (int i = 0; i < size; i++) {
            this.f24926a.valueAt(i).shutdownNow();
        }
        this.f24926a.clear();
    }

    public ThreadPoolExecutor b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("5cd87627", new Object[]{this, new Integer(i)});
        }
        ThreadPoolExecutor threadPoolExecutor = this.f24926a.get(i);
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.f24926a.put(i, threadPoolExecutor2);
        return threadPoolExecutor2;
    }
}
