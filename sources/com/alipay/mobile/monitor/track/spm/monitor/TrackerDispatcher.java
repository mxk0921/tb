package com.alipay.mobile.monitor.track.spm.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmLogCator;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TrackerDispatcher implements Comparable, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f4276a = TrackerDispatcher.class.getSimpleName();
    private BaseTracker b;

    public TrackerDispatcher(BaseTracker baseTracker) {
        this.b = baseTracker;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            String str = this.f4276a;
            SpmLogCator.debug(str, "run request:" + this.b);
            this.b.commit();
        } catch (Exception e) {
            SpmLogCator.error(this.f4276a, e);
        }
    }
}
