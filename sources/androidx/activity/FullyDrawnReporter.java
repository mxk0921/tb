package androidx.activity;

import androidx.activity.FullyDrawnReporter;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "Ljava/util/concurrent/Executor;", BaseExecutor.EXECUTOR_SUFFIX, "Lkotlin/Function0;", "Ltb/xhv;", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Ltb/d1a;)V", "postWhenReportersAreDone", "()V", "addReporter", "removeReporter", "callback", "addOnReportDrawnListener", "(Ltb/d1a;)V", "removeOnReportDrawnListener", "fullyDrawnReported", "Ljava/util/concurrent/Executor;", "Ltb/d1a;", OConstant.DIMEN_FILE_LOCK, "Ljava/lang/Object;", "", "reporterCount", TLogTracker.LEVEL_INFO, "", "reportPosted", "Z", "reportedFullyDrawn", "", "onReportCallbacks", "Ljava/util/List;", "Ljava/lang/Runnable;", "reportRunnable", "Ljava/lang/Runnable;", "isFullyDrawnReported", "()Z", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FullyDrawnReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Executor executor;
    private final d1a<xhv> reportFullyDrawn;
    private boolean reportPosted;
    private boolean reportedFullyDrawn;
    private int reporterCount;
    private final Object lock = new Object();
    private final List<d1a<xhv>> onReportCallbacks = new ArrayList();
    private final Runnable reportRunnable = new Runnable() { // from class: tb.x0a
        @Override // java.lang.Runnable
        public final void run() {
            FullyDrawnReporter.reportRunnable$lambda$2(FullyDrawnReporter.this);
        }
    };

    public FullyDrawnReporter(Executor executor, d1a<xhv> d1aVar) {
        ckf.g(executor, BaseExecutor.EXECUTOR_SUFFIX);
        ckf.g(d1aVar, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = d1aVar;
    }

    public final void addOnReportDrawnListener(d1a<xhv> d1aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad040c18", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "callback");
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.onReportCallbacks.add(d1aVar);
                z = false;
            }
        }
        if (z) {
            d1aVar.invoke();
        }
    }

    public final void addReporter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be31f429", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void fullyDrawnReported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7260c5fa", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((d1a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5294e3c8", new Object[]{this})).booleanValue();
        }
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118eed95", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(d1aVar);
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df63b78c", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i = this.reporterCount) > 0) {
                    this.reporterCount = i - 1;
                    postWhenReportersAreDone();
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void postWhenReportersAreDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59ac985", new Object[]{this});
        } else if (!this.reportPosted && this.reporterCount == 0) {
            this.reportPosted = true;
            this.executor.execute(this.reportRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73dad43", new Object[]{fullyDrawnReporter});
            return;
        }
        ckf.g(fullyDrawnReporter, "this$0");
        synchronized (fullyDrawnReporter.lock) {
            try {
                fullyDrawnReporter.reportPosted = false;
                if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                    fullyDrawnReporter.reportFullyDrawn.invoke();
                    fullyDrawnReporter.fullyDrawnReported();
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
