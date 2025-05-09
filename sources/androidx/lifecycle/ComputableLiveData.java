package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.ComputableLiveData;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u0012\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", BaseExecutor.EXECUTOR_SUFFIX, "<init>", "(Ljava/util/concurrent/Executor;)V", "Ltb/xhv;", "invalidate", "()V", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", FactoryType.TYPE_INVALID, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata_release", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ComputableLiveData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public ComputableLiveData() {
        this(null, 1, null);
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87ec0d", new Object[0]);
        }
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9517a39c", new Object[0]);
        }
    }

    public abstract T compute();

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ffaaecc0", new Object[]{this});
        }
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("bd1e689b", new Object[]{this});
        }
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("e61cf6dd", new Object[]{this});
        }
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("14016fc3", new Object[]{this});
        }
        return this.liveData;
    }

    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else {
            ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
        }
    }

    public ComputableLiveData(Executor executor) {
        ckf.g(executor, BaseExecutor.EXECUTOR_SUFFIX);
        this.executor = executor;
        LiveData<T> computableLiveData$_liveData$1 = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            public static /* synthetic */ Object ipc$super(ComputableLiveData$_liveData$1 computableLiveData$_liveData$12, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/ComputableLiveData$_liveData$1");
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
                } else {
                    this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
                }
            }
        };
        this._liveData = computableLiveData$_liveData$1;
        this.liveData = computableLiveData$_liveData$1;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: tb.fe4
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: tb.ge4
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(ComputableLiveData.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b8f6f4", new Object[]{computableLiveData});
            return;
        }
        ckf.g(computableLiveData, "this$0");
        boolean hasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && hasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52991392", new Object[]{computableLiveData});
            return;
        }
        ckf.g(computableLiveData, "this$0");
        do {
            if (computableLiveData.computing.compareAndSet(false, true)) {
                T t = null;
                z = false;
                while (computableLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        t = (T) computableLiveData.compute();
                        z = true;
                    } catch (Throwable th) {
                        computableLiveData.computing.set(false);
                        throw th;
                    }
                }
                if (z) {
                    computableLiveData.getLiveData().postValue(t);
                }
                computableLiveData.computing.set(false);
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, tb.a07 r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000e
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            tb.ckf.f(r1, r2)
        L_0x000e:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, tb.a07):void");
    }
}
