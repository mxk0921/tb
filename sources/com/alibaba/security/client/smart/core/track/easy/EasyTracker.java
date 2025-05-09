package com.alibaba.security.client.smart.core.track.easy;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.C1177la;
import com.alibaba.security.ccrc.service.build.C1181na;
import com.alibaba.security.ccrc.service.build.ThreadFactoryC1192ta;
import com.alibaba.security.client.smart.core.track.ITrack;
import com.alibaba.security.client.smart.core.track.easy.EasyTracker;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EasyTracker implements ITrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EasyTracker";
    public static volatile EasyTracker mEasyTracker;
    public final AtomicBoolean hasInit = new AtomicBoolean(false);
    public final C1177la mLogBuffer;
    public final ThreadPoolExecutor mThreadPoolExecutor;
    public final C1181na mTrackUpload;

    public EasyTracker(Context context) {
        C1177la laVar = new C1177la();
        this.mLogBuffer = laVar;
        laVar.a(context);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1192ta("track_manager"));
        this.mThreadPoolExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.mTrackUpload = new C1181na(context);
    }

    private void doTrace(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e2fa29", new Object[]{this, trackLog});
            return;
        }
        this.mTrackUpload.a(this.mLogBuffer);
        synchronized (EasyTracker.class) {
            this.mTrackUpload.b();
        }
        this.mLogBuffer.a(trackLog);
        if (this.mLogBuffer.a(this.mTrackUpload.a())) {
            this.mTrackUpload.a(this.mLogBuffer, "threshold");
        }
    }

    public static EasyTracker getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EasyTracker) ipChange.ipc$dispatch("90e49506", new Object[]{context});
        }
        if (mEasyTracker == null) {
            synchronized (EasyTracker.class) {
                try {
                    if (mEasyTracker == null) {
                        mEasyTracker = new EasyTracker(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mEasyTracker;
    }

    private void uploadDiskCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1da616b", new Object[]{this});
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.v68
                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.this.b();
                }
            });
        }
    }

    public void doUploadOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbde514", new Object[]{this});
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.t68
                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.this.a();
                }
            });
        }
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public Executor getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this});
        }
        return this.mThreadPoolExecutor;
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.hasInit.compareAndSet(false, true)) {
            uploadDiskCache();
        }
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public void trace(final TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facdadbe", new Object[]{this, trackLog});
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.u68
                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.this.a(trackLog);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4926222", new Object[]{this, trackLog});
        } else {
            doTrace(trackLog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.mTrackUpload.b(this.mLogBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.mTrackUpload.a(this.mLogBuffer, Baggage.Amnet.SECURITY_INSTANT);
        }
    }
}
