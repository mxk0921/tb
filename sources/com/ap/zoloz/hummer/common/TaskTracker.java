package com.ap.zoloz.hummer.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dfb;
import tb.f9b;
import tb.qzd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isLive;
    public f9b mHummerContext;
    public dfb mIAlertManagerCallback;
    public qzd mITaskTrackerCallback;
    public TaskConfig mTaskConfig;

    static {
        t2o.a(245366852);
    }

    public abstract void forceQuit();

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.isLive = false;
        f9b f9bVar = this.mHummerContext;
        if (f9bVar != null) {
            f9bVar.q();
            this.mHummerContext = null;
        }
        this.mITaskTrackerCallback = null;
        this.mIAlertManagerCallback = null;
    }

    public abstract void run(f9b f9bVar, TaskConfig taskConfig, qzd qzdVar);
}
