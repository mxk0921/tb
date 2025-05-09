package com.alipay.security.mobile.api;

import android.content.Context;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorApiAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ExecutorService mExecutor;
    private static Future<String> mRunningThread;

    private static synchronized void closeThread() {
        synchronized (AuthenticatorApiAgent.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d76121a9", new Object[0]);
                return;
            }
            try {
                Future<String> future = mRunningThread;
                if (future != null && !future.isDone()) {
                    mRunningThread.cancel(true);
                    mRunningThread = null;
                }
            } catch (Exception unused) {
            }
            try {
                ExecutorService executorService = mExecutor;
                if (executorService != null) {
                    executorService.shutdownNow();
                    mExecutor = null;
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Deprecated
    public static synchronized String getPayAuthData(final Context context, final String str) {
        String str2;
        Exception e;
        synchronized (AuthenticatorApiAgent.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9116059", new Object[]{context, str});
            }
            String str3 = "";
            try {
                closeThread();
                mExecutor = null;
                mRunningThread = null;
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.alipay.security.mobile.api.AuthenticatorApiAgent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        return new Thread(runnable, "AuthenticatorApi-Thread");
                    }
                });
                mExecutor = newSingleThreadExecutor;
                Future<String> submit = newSingleThreadExecutor.submit(new Callable<String>() { // from class: com.alipay.security.mobile.api.AuthenticatorApiAgent.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.Callable
                    public String call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this}) : AuthenticatorApi.getPayAuthData(context, str);
                    }
                });
                mRunningThread = submit;
                str2 = submit.get(2L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                e = e2;
            }
            try {
                closeThread();
            } catch (Exception e3) {
                e = e3;
                str3 = str2;
                AuthenticatorLOG.error(e);
                str2 = str3;
                return str2;
            }
            return str2;
        }
    }
}
