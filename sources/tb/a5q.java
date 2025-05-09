package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a5q implements an2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z4q f15555a;
    public final /* synthetic */ long b;

    public a5q(z4q z4qVar, long j) {
        this.f15555a = z4qVar;
        this.b = j;
    }

    @Override // tb.an2
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5256d3", new Object[]{this});
        } else {
            agh.h("SmartAutoDetector", "mnnNetWorker onMainBuildSucceed");
        }
    }

    @Override // tb.an2
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911f63fa", new Object[]{this});
        } else {
            agh.c("SmartAutoDetector", "mnnNetWorker onMainBuildFailed");
        }
    }

    @Override // tb.an2
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb7f373", new Object[]{this});
            return;
        }
        agh.r("AutoDetect", "SmartAutoDetector", "mnnNetWorker onBuildFailed");
        mzu.n(p73.f25916a, "prepareFailed_plt_smart_camera", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
        z4q.l(this.f15555a).set(true);
        z4q.x(this.f15555a, false);
    }

    @Override // tb.an2
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cbb67a", new Object[]{this});
            return;
        }
        agh.r("AutoDetect", "SmartAutoDetector", "mnnNetWorker onBuildSucceed");
        if (!caa.q() || !lg4.I0()) {
            z4q.m(this.f15555a).set(true);
            mzu.n(p73.f25916a, "prepareSuccess_plt_smart_camera", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            z4q.l(this.f15555a).set(false);
            z4q.x(this.f15555a, false);
            ss3 j = z4q.j(this.f15555a);
            if (j != null) {
                j.destroy();
            }
            z4q.w(this.f15555a, null);
            return;
        }
        agh.c("SmartAutoDetector", "Mock MNN build failed");
        a();
    }
}
