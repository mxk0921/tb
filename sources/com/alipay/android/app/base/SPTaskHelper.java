package com.alipay.android.app.base;

import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SPTaskHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean DEBUG;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f3472a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, (Runtime.getRuntime().availableProcessors() * 2) + 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new ThreadFactory() { // from class: com.alipay.android.app.base.SPTaskHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f3473a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "SafepayTaskHelper #" + this.f3473a.getAndIncrement());
            }
        }, new RejectedExecutionHandler() { // from class: com.alipay.android.app.base.SPTaskHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor2});
                    return;
                }
                throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor2.toString());
            }
        });
        f3472a = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            f3472a.execute(runnable);
        }
    }
}
