package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter;

import android.content.Context;
import android.os.Bundle;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.task.FingerprintTask;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.MessageCenter;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FingerprintAdapter sInstance;
    private static Object sInstanceLock = new Object();
    private Context mContext;
    private ExecutorService mExecutor;
    private Future<?> mRunningThread;

    private FingerprintAdapter(Context context) {
        this.mContext = context;
    }

    private synchronized void closeThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76121a9", new Object[]{this});
            return;
        }
        try {
            Future<?> future = this.mRunningThread;
            if (future != null && !future.isDone()) {
                this.mRunningThread.cancel(true);
            }
        } catch (Exception unused) {
        }
        try {
            ExecutorService executorService = this.mExecutor;
            if (executorService != null) {
                executorService.shutdownNow();
            }
        } catch (Exception unused2) {
        }
        try {
            Future<?> future2 = this.mRunningThread;
            if (future2 != null && future2.isDone()) {
                this.mRunningThread = null;
            }
        } catch (Exception unused3) {
        }
        try {
            ExecutorService executorService2 = this.mExecutor;
            if (executorService2 != null && executorService2.isTerminated()) {
                this.mExecutor = null;
            }
        } catch (Exception unused4) {
        }
    }

    public static FingerprintAdapter getInstance(Context context) {
        FingerprintAdapter fingerprintAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintAdapter) ipChange.ipc$dispatch("3c8e004b", new Object[]{context});
        }
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    sInstance = new FingerprintAdapter(context);
                }
                fingerprintAdapter = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fingerprintAdapter;
    }

    public synchronized void handleAsyncMessage(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d80b5a", new Object[]{this, bundle});
            return;
        }
        try {
            closeThread();
            this.mExecutor = null;
            this.mRunningThread = null;
            this.mExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter.FingerprintAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    return new Thread(runnable, "FingerprintThread");
                }
            });
            this.mRunningThread = this.mExecutor.submit(new FingerprintTask(this.mContext, bundle));
            if (bundle != null) {
                bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            }
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            finishAuth(FingerprintDataUtil.constructResultBundle(6, 101), bundle);
        }
    }

    public synchronized void finishAuth(Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71909e2", new Object[]{this, bundle, bundle2});
            return;
        }
        if (bundle != null) {
            MessageCenter.sendResponseMessage(this.mContext, bundle);
            int i = bundle.getInt(AuthenticatorMessage.KEY_RESULT);
            int i2 = bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            BioBehaviorUtils instance = BioBehaviorUtils.getInstance();
            instance.add(bundle2, "leave bioSDK with result:" + i);
            BioBehaviorUtils.getInstance().commit(bundle2);
            if (!((i2 == 3 || i2 == 9) && i == 102)) {
                TrackEvent ins = TrackEvent.getIns();
                ins.event(bundle2, "leave bioSDK with result:" + i);
            }
        }
        closeThread();
    }
}
