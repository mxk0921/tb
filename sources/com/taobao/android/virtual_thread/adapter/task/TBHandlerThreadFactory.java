package com.taobao.android.virtual_thread.adapter.task;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.config.StubConfig;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.ghh;
import tb.j1r;
import tb.t2o;
import tb.wsa;
import tb.yiw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBHandlerThreadFactory implements wsa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SharedHandlerThread[] mHighSharedHandlerThreads;
    private final SharedHandlerThread[] mSharedHandlerThreads;
    private final yiw mStrategy;
    private j1r mSwitcher;
    private volatile int mSharedCount = 0;
    private volatile int highSharedCount = 0;
    private final Set<Looper> looperSet = new CopyOnWriteArraySet();

    static {
        t2o.a(970981406);
    }

    public TBHandlerThreadFactory(j1r j1rVar, yiw yiwVar) {
        this.mSharedHandlerThreads = new SharedHandlerThread[j1rVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 15)];
        this.mHighSharedHandlerThreads = new SharedHandlerThread[j1rVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 5)];
        this.mSwitcher = j1rVar;
        this.mStrategy = yiwVar;
    }

    private boolean isGlobalLooper(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5c44e4", new Object[]{this, looper})).booleanValue();
        }
        return this.looperSet.contains(looper);
    }

    public void quit(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8118f", new Object[]{this, looper});
        } else if (!isGlobalLooper(looper)) {
            looper.quit();
        }
    }

    public void quitSafely(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3579cd95", new Object[]{this, looper});
        } else if (!isGlobalLooper(looper)) {
            looper.quitSafely();
        }
    }

    public void setSwitcher(j1r j1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313178dc", new Object[]{this, j1rVar});
        } else {
            this.mSwitcher = j1rVar;
        }
    }

    @Override // tb.wsa.a
    public HandlerThread handlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("aec3b7b7", new Object[]{this, str});
        }
        if (!this.mSwitcher.c("use_global_handler", this.mStrategy.a()) || StubConfig.isExcludeThread(str)) {
            return new HandlerThread(str);
        }
        int i = this.mSharedCount + 1;
        this.mSharedCount = i;
        int length = i % this.mSharedHandlerThreads.length;
        this.mSharedCount = length;
        SharedHandlerThread[] sharedHandlerThreadArr = this.mSharedHandlerThreads;
        if (sharedHandlerThreadArr[length] == null) {
            synchronized (sharedHandlerThreadArr) {
                try {
                    SharedHandlerThread[] sharedHandlerThreadArr2 = this.mSharedHandlerThreads;
                    if (sharedHandlerThreadArr2[length] == null) {
                        sharedHandlerThreadArr2[length] = new SharedHandlerThread("global-handler" + length);
                        this.looperSet.add(this.mSharedHandlerThreads[length].getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ghh.a("SharedHandler", str, "in shared handler");
        return this.mSharedHandlerThreads[length];
    }

    @Override // tb.wsa.a
    public HandlerThread highHandlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("90793a79", new Object[]{this, str});
        }
        if (!this.mSwitcher.c("use_global_handler", this.mStrategy.a()) || StubConfig.isExcludeThread(str)) {
            return new HandlerThread(str);
        }
        int i = this.highSharedCount + 1;
        this.highSharedCount = i;
        int length = i % this.mHighSharedHandlerThreads.length;
        this.highSharedCount = length;
        SharedHandlerThread[] sharedHandlerThreadArr = this.mHighSharedHandlerThreads;
        if (sharedHandlerThreadArr[length] == null) {
            synchronized (sharedHandlerThreadArr) {
                try {
                    SharedHandlerThread[] sharedHandlerThreadArr2 = this.mHighSharedHandlerThreads;
                    if (sharedHandlerThreadArr2[length] == null) {
                        sharedHandlerThreadArr2[length] = new SharedHandlerThread("global-high-handler" + length);
                        this.looperSet.add(this.mHighSharedHandlerThreads[length].getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ghh.a("SharedHandler", str, "in high shared handler");
        return this.mHighSharedHandlerThreads[length];
    }
}
