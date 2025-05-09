package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ia extends ThreadPoolExecutor.DiscardOldestPolicy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f2558a = new AtomicInteger(0);
    public final /* synthetic */ Ja b;

    public Ia(Ja ja) {
        this.b = ja;
    }

    public static /* synthetic */ Object ipc$super(Ia ia, String str, Object... objArr) {
        if (str.hashCode() == -1083873583) {
            super.rejectedExecution((Runnable) objArr[0], (ThreadPoolExecutor) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Ia");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy, java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            return;
        }
        super.rejectedExecution(runnable, threadPoolExecutor);
        StringBuilder a2 = Kb.a("input sample too frequently ,task discard#");
        a2.append(this.f2558a.incrementAndGet());
        Logging.e(Ja.f2560a, a2.toString());
    }
}
