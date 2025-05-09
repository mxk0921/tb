package com.taobao.login4android.qrcode.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ThreadPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PassportWorker";
    private static volatile ThreadPool sInstance;
    private Handler mHandler;
    private Handler mUiHandler = new Handler(Looper.getMainLooper());
    private HandlerThread mWorkThread;

    static {
        t2o.a(70254979);
    }

    private ThreadPool() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mWorkThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mWorkThread.getLooper());
    }

    public static ThreadPool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPool) ipChange.ipc$dispatch("764d1533", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ThreadPool.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void postDelayed(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{this, runnable, new Long(j)});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public void remove(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0e9209", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.mUiHandler;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
