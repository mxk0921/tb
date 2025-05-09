package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Fb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f2553a;
    public final /* synthetic */ Gb b;

    public Fb(Gb gb, Runnable runnable) {
        this.b = gb;
        this.f2553a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f2553a.run();
        } catch (Throwable th) {
            th.printStackTrace();
            Logging.e(Gb.c, "file process error", th);
        }
    }
}
