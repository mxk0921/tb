package androidx.core.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import tb.ar4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ltb/ar4;", "Ltb/xhv;", "continuation", "<init>", "(Ltb/ar4;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "Ltb/ar4;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ar4<xhv> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(ar4<? super xhv> ar4Var) {
        super(false);
        this.continuation = ar4Var;
    }

    public static /* synthetic */ Object ipc$super(ContinuationRunnable continuationRunnable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/ContinuationRunnable");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
