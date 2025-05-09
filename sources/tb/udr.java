package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class udr extends ThreadPoolExecutor {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f29313a = new AtomicInteger(1);
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ckf.g(runnable, "runnable");
            return new Thread(runnable, this.b + '-' + this.f29313a.getAndIncrement());
        }
    }

    static {
        t2o.a(1031798816);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udr(int i, int i2, long j, String str) {
        super(i, i2, j, TimeUnit.SECONDS, new LinkedBlockingQueue(512), new a(str), new ThreadPoolExecutor.DiscardOldestPolicy());
        ckf.g(str, "preName");
    }
}
