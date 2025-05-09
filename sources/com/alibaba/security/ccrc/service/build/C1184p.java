package com.alibaba.security.ccrc.service.build;

import android.os.Process;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.AbstractC1176l;
import com.alibaba.security.ccrc.service.build.C1184p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.p  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1184p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2612a = "ThreadUtils";
    public static final ThreadPoolExecutor b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, (Runtime.getRuntime().availableProcessors() * 2) + 1, 20L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1192ta("wukong_thread_pool"));
        b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        Process.setThreadPriority(10);
        runnable.run();
    }

    public static Future<?> b(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("865d2efd", new Object[]{runnable});
        }
        return b.submit(new Runnable() { // from class: tb.ruz
            @Override // java.lang.Runnable
            public final void run() {
                C1184p.a(runnable);
            }
        });
    }

    public static void a(final Runnable runnable, long j, final AbstractC1176l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24514362", new Object[]{runnable, new Long(j), lVar});
        } else if (lVar.a()) {
            runnable.run();
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Timer().schedule(new C1182o(b(new Runnable() { // from class: tb.suz
                @Override // java.lang.Runnable
                public final void run() {
                    C1184p.a(AbstractC1176l.this, countDownLatch, runnable);
                }
            })), j);
        }
    }

    public static /* synthetic */ void a(AbstractC1176l lVar, CountDownLatch countDownLatch, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5838dc", new Object[]{lVar, countDownLatch, runnable});
            return;
        }
        while (!lVar.a()) {
            try {
                countDownLatch.await(1L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                StringBuilder a2 = Kb.a("future task has been canceled ");
                a2.append(e.getMessage());
                Logging.w(f2612a, a2.toString());
            }
        }
        runnable.run();
    }
}
