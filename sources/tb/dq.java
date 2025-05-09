package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f18006a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "avsdk_common_thread_pool";
        }
    }

    static {
        t2o.a(774897949);
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("671f543b", new Object[0]);
        }
        ExecutorService c = c(16, new a());
        f18006a = c;
        return c;
    }

    public static ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d61d6421", new Object[0]);
        }
        ExecutorService executorService = f18006a;
        if (executorService == null) {
            return a();
        }
        return executorService;
    }

    public static ExecutorService c(int i, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("c576068b", new Object[]{new Integer(i), qqtVar});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.newFixedThreadPool(i, qqtVar);
        threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ExecutorService d(qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("4cd513a1", new Object[]{qqtVar});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.newSingleThreadExecutor(qqtVar);
        threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
