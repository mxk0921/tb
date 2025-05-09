package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.grs.c;
import com.loc.at;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k7l implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f22449a;
    public final yiw b;

    static {
        t2o.a(970981398);
        t2o.a(970981409);
    }

    public k7l(j1r j1rVar, yiw yiwVar) {
        this.f22449a = j1rVar;
        this.b = yiwVar;
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3cf499", new Object[]{this, threadPoolExecutor});
        } else if (threadPoolExecutor.allowsCoreThreadTimeOut()) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (threadPoolExecutor.getKeepAliveTime(timeUnit) > 1) {
                threadPoolExecutor.setKeepAliveTime(1L, timeUnit);
            }
        }
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f22449a.c("OptHwThread", this.b.a())) {
            try {
                ExecutorService executorService = (ExecutorService) adk.i(c.class).b(at.j).h();
                if (executorService instanceof ThreadPoolExecutor) {
                    a((ThreadPoolExecutor) executorService);
                }
                ExecutorService reportExecutor = HianalyticsHelper.getInstance().getReportExecutor();
                if (reportExecutor instanceof ThreadPoolExecutor) {
                    a((ThreadPoolExecutor) reportExecutor);
                }
                ghh.a("OptHuaweiTask", "succ");
            } catch (Throwable th) {
                ghh.c(th);
                ghh.a("OptHuaweiTask", "exception");
            }
        }
    }
}
