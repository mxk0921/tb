package com.taobao.adaemon;

import com.android.alibaba.ip.runtime.IpChange;
import tb.s55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DaemonWorker f6145a;

    public c(DaemonWorker daemonWorker) {
        this.f6145a = daemonWorker;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!DaemonWorker.c(this.f6145a)) {
            s55.g("Worker", "not started", new Object[0]);
        } else {
            s55.g("Worker", "stop", new Object[0]);
            DaemonWorker.e(this.f6145a, false);
            ProcessController.getInstance().unregisterProcessListener(DaemonWorker.j(this.f6145a));
            if (DaemonWorker.k(this.f6145a) > 0 && DaemonWorker.l(this.f6145a) != null && DaemonWorker.m(this.f6145a) != null) {
                DaemonWorker.m(this.f6145a).unregisterReceiver(DaemonWorker.l(this.f6145a));
            }
        }
    }
}
