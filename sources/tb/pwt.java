package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f26364a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(pwt pwtVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "tinct-thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final pwt f26365a = new pwt();

        public static /* synthetic */ pwt a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pwt) ipChange.ipc$dispatch("acb7d4cf", new Object[0]);
            }
            return f26365a;
        }
    }

    public pwt() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(2, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this), new ThreadPoolExecutor.AbortPolicy());
        this.f26364a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static pwt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwt) ipChange.ipc$dispatch("891b1a2a", new Object[0]);
        }
        return b.a();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f26364a.execute(runnable);
        }
    }
}
