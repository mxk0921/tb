package com.alipay.mobile.monitor.track.spm.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TrackerExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f4277a;

    public TrackerExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue());
        this.f4277a = threadPoolExecutor;
        threadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void commitTracker(BaseTracker baseTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d472f64c", new Object[]{this, baseTracker});
        } else {
            this.f4277a.execute(new TrackerDispatcher(baseTracker));
        }
    }
}
