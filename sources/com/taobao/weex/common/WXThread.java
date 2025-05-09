package com.taobao.weex.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.tools.LogDetail;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXThread extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SafeCallback implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "SafeCallback";
        public final Handler.Callback mCallback;

        static {
            t2o.a(985661586);
        }

        public SafeCallback(Handler.Callback callback) {
            this.mCallback = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            boolean isApkDebugable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            try {
                Handler.Callback callback = this.mCallback;
                if (callback != null) {
                    return callback.handleMessage(message);
                }
                return false;
            } finally {
                if (!isApkDebugable) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SafeRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "SafeRunnable";
        private WeakReference<WXSDKInstance> mInstance;
        public final Runnable mTask;
        private LogDetail mTimelineLog;

        static {
            t2o.a(985661587);
        }

        public SafeRunnable(Runnable runnable) {
            this(runnable, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<WXSDKInstance> weakReference;
            WXSDKInstance wXSDKInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.mTask != null) {
                    LogDetail logDetail = this.mTimelineLog;
                    if (logDetail != null) {
                        logDetail.taskStart();
                    }
                    this.mTask.run();
                    LogDetail logDetail2 = this.mTimelineLog;
                    if (logDetail2 != null) {
                        logDetail2.taskEnd();
                    }
                }
            } catch (Throwable th) {
                if (!WXEnvironment.isApkDebugable()) {
                    WXLogUtils.w(TAG, th);
                } else {
                    WXLogUtils.e(TAG, "SafeRunnable run throw expection:" + th.getMessage());
                    throw th;
                }
            }
            if (this.mTimelineLog != null && (weakReference = this.mInstance) != null && (wXSDKInstance = weakReference.get()) != null) {
                wXSDKInstance.R.addLog(this.mTimelineLog);
            }
        }

        public SafeRunnable(Runnable runnable, String str) {
            this(runnable, null, str);
        }

        public SafeRunnable(Runnable runnable, WXSDKInstance wXSDKInstance, String str) {
            this.mTimelineLog = null;
            this.mTask = runnable;
            if (str != null) {
                LogDetail logDetail = new LogDetail();
                this.mTimelineLog = logDetail;
                logDetail.info.platform = TimeCalculator.PLATFORM_ANDROID;
                logDetail.name(str);
                this.mInstance = new WeakReference<>(wXSDKInstance);
            }
        }
    }

    static {
        t2o.a(985661585);
    }

    public WXThread(String str) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public static /* synthetic */ Object ipc$super(WXThread wXThread, String str, Object... objArr) {
        if (str.hashCode() == -1052580006) {
            return new Boolean(super.quit());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXThread");
    }

    public static Runnable secure(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("a095c018", new Object[]{runnable}) : secure(runnable, null, null);
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.mHandler;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return super.quit();
    }

    public static Runnable secure(Runnable runnable, WXSDKInstance wXSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("340f8458", new Object[]{runnable, wXSDKInstance, str}) : (runnable == null || (runnable instanceof SafeRunnable)) ? runnable : new SafeRunnable(runnable, wXSDKInstance, str);
    }

    public boolean isWXThreadAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaf746e3", new Object[]{this})).booleanValue();
        }
        return (this.mHandler == null || getLooper() == null || !isAlive()) ? false : true;
    }

    public WXThread(String str, Handler.Callback callback) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper(), secure(callback));
    }

    public static Handler.Callback secure(Handler.Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler.Callback) ipChange.ipc$dispatch("f5070da0", new Object[]{callback}) : (callback == null || (callback instanceof SafeCallback)) ? callback : new SafeCallback(callback);
    }

    public WXThread(String str, int i, Handler.Callback callback) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper(), secure(callback));
    }

    public WXThread(String str, int i) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper());
    }
}
