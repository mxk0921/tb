package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;
import tb.v0v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WalleStreamSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ThreadPoolExecutor mSerialExecutor;
    private boolean mInitialized = false;
    public boolean DEBUG = false;
    private final String TAG = "WalleStreamSource";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WalleUtEventJava {
        public String mArg1;
        public String mArg2;
        public String mArg3;
        public long mBeginTime;
        public long mDuration;
        public int mEventId;
        public boolean mH5Pv;
        public String mKey;
        public String mPageName;
        public Map<String, String> mProperties;

        static {
            t2o.a(1034944662);
        }

        public WalleUtEventJava() {
        }

        public WalleUtEventJava(v0v v0vVar) {
            this.mKey = v0vVar.getKey();
            this.mEventId = v0vVar.getEventId();
            this.mPageName = v0vVar.getPageName();
            this.mArg1 = v0vVar.getArg1();
            this.mArg2 = v0vVar.getArg2();
            this.mArg3 = v0vVar.getArg3();
            this.mBeginTime = v0vVar.getBeginTime();
            this.mDuration = Long.parseLong(v0vVar.getArg3());
            this.mProperties = v0vVar.getProperties();
            this.mH5Pv = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f14212a = 0;

        public a(WalleStreamSource walleStreamSource) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder("walle_sp_t");
            int i = this.f14212a;
            this.f14212a = 1 + i;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WalleStreamSource f14213a = new WalleStreamSource();

        static {
            t2o.a(1034944661);
        }

        public static /* synthetic */ WalleStreamSource a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WalleStreamSource) ipChange.ipc$dispatch("aa54b9f4", new Object[0]);
            }
            return f14213a;
        }
    }

    static {
        t2o.a(1034944659);
    }

    public WalleStreamSource() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(this));
        this.mSerialExecutor = threadPoolExecutor;
        if (this.DEBUG) {
            LogUtil.d("StreamProcessing", "WalleStreamSource Constructor called in thread: " + Thread.currentThread().getName());
        }
        threadPoolExecutor.prestartAllCoreThreads();
        threadPoolExecutor.execute(new Runnable() { // from class: tb.gxw
            @Override // java.lang.Runnable
            public final void run() {
                WalleStreamSource.this.lambda$new$3();
            }
        });
    }

    public static WalleStreamSource getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WalleStreamSource) ipChange.ipc$dispatch("1c34b8cf", new Object[0]);
        }
        return b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beginEvent$4(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dbfed7", new Object[]{this, v0vVar});
            return;
        }
        try {
            nativeBeginEvent(new WalleUtEventJava(v0vVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "beginEvent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$endEvent$7(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b9d26", new Object[]{this, v0vVar});
            return;
        }
        try {
            nativeEndEvent(new WalleUtEventJava(v0vVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "endEvent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b0a99", new Object[]{this});
            return;
        }
        this.mInitialized = true;
        if (this.DEBUG) {
            LogUtil.d("StreamProcessing", "WalleStreamSource Constructor created thread: " + Thread.currentThread().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEvent$8(WalleUtEventJava walleUtEventJava) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d25bad", new Object[]{this, walleUtEventJava});
            return;
        }
        try {
            nativeSendEvent(walleUtEventJava);
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "sendEvent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEventMap$9(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f82f202", new Object[]{this, map});
            return;
        }
        try {
            nativeSendEventMap(map);
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "sendEventMap", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEvent$6(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560e7cf", new Object[]{this, v0vVar});
            return;
        }
        try {
            nativeUpdateEvent(new WalleUtEventJava(v0vVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "updateEvent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEventPageName$5(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb09a96", new Object[]{this, v0vVar});
            return;
        }
        try {
            nativeUpdateEventPageName(new WalleUtEventJava(v0vVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "updateEventPageName", e);
        }
    }

    public static native void nativeBeginEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeEndEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeSendEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeSendEventMap(Map<String, String> map);

    public static native void nativeUpdateEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeUpdateEventPageName(WalleUtEventJava walleUtEventJava);

    public void beginEvent(final v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.dxw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$beginEvent$4(v0vVar);
                }
            });
        }
    }

    public void endEvent(final v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.hxw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$endEvent$7(v0vVar);
                }
            });
        }
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        return this.mInitialized;
    }

    public void sendEvent(final WalleUtEventJava walleUtEventJava) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ae95f6", new Object[]{this, walleUtEventJava});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.fxw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$sendEvent$8(walleUtEventJava);
                }
            });
        }
    }

    public void sendEventMap(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed18fd4", new Object[]{this, map});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.jxw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$sendEventMap$9(map);
                }
            });
        }
    }

    public void updateEvent(final v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.exw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$updateEvent$6(v0vVar);
                }
            });
        }
    }

    public void updateEventPageName(final v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
        } else if (WalleStreamListener.isStreamProcessingInitialized()) {
            this.mSerialExecutor.execute(new Runnable() { // from class: tb.ixw
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$updateEventPageName$5(v0vVar);
                }
            });
        }
    }
}
