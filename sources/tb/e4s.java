package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$sdk$thread$ThreadPoolType;

        static {
            int[] iArr = new int[ThreadPoolType.values().length];
            $SwitchMap$com$taobao$taolive$sdk$thread$ThreadPoolType = iArr;
            try {
                iArr[ThreadPoolType.MTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$thread$ThreadPoolType[ThreadPoolType.IO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static final ThreadPoolExecutor INSTANCE = e.a(ThreadPoolType.IO);

        static {
            t2o.a(806356421);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static final ThreadPoolExecutor INSTANCE = e.a(ThreadPoolType.MTOP);

        static {
            t2o.a(806356422);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d {
        public static final ThreadPoolExecutor INSTANCE = e.a(ThreadPoolType.NORMAL);

        static {
            t2o.a(806356423);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements qqt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ThreadPoolType f18277a;

            public a(ThreadPoolType threadPoolType) {
                this.f18277a = threadPoolType;
            }

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "live-" + this.f18277a.name() + "-thread";
            }
        }

        static {
            t2o.a(806356424);
        }

        public static ThreadPoolExecutor a(ThreadPoolType threadPoolType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadPoolExecutor) ipChange.ipc$dispatch("af16dad6", new Object[]{threadPoolType});
            }
            ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(3, new a(threadPoolType));
            o3s.b("TLiveThreadPools", "创建线程池，类型：" + threadPoolType.name() + "， 线程池: " + newFixedThreadPool);
            if (!(newFixedThreadPool instanceof ThreadPoolExecutor)) {
                return null;
            }
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }
    }

    static {
        t2o.a(806356419);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3692afbf", new Object[0])).booleanValue();
        }
        if (!d4s.e("enableCommonThreadPool", true) || !d4s.c("enableCommonThreadPool", "enableCommonThreadPool", false)) {
            return false;
        }
        return true;
    }

    public static ThreadPoolExecutor b(ThreadPoolType threadPoolType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c2e62716", new Object[]{threadPoolType});
        }
        if (!a() || threadPoolType == null) {
            return null;
        }
        int i = a.$SwitchMap$com$taobao$taolive$sdk$thread$ThreadPoolType[threadPoolType.ordinal()];
        if (i == 1) {
            return c.INSTANCE;
        }
        if (i != 2) {
            return d.INSTANCE;
        }
        return b.INSTANCE;
    }
}
