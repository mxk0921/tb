package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import tb.ajq;
import tb.ckf;
import tb.qp9;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"T", "Ltb/qp9;", "Lkotlin/coroutines/d;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "(Ltb/qp9;Lkotlin/coroutines/d;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)Ltb/qp9;", "Ljava/time/Duration;", "timeout", "(Ltb/qp9;Ljava/time/Duration;Lkotlin/coroutines/d;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FlowLiveDataConversions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> qp9<T> asFlow(LiveData<T> liveData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qp9) ipChange.ipc$dispatch("4f074b39", new Object[]{liveData});
        }
        ckf.g(liveData, "<this>");
        return yp9.h(yp9.d(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(qp9<? extends T> qp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("a0ff8d5b", new Object[]{qp9Var});
        }
        ckf.g(qp9Var, "<this>");
        return asLiveData$default(qp9Var, (d) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(qp9 qp9Var, d dVar, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("2b2c81e5", new Object[]{qp9Var, dVar, new Long(j), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(qp9Var, dVar, j);
    }

    public static final <T> LiveData<T> asLiveData(qp9<? extends T> qp9Var, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("3e6c082d", new Object[]{qp9Var, dVar});
        }
        ckf.g(qp9Var, "<this>");
        ckf.g(dVar, "context");
        return asLiveData$default(qp9Var, dVar, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(qp9<? extends T> qp9Var, d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("2b71b357", new Object[]{qp9Var, dVar, new Long(j)});
        }
        ckf.g(qp9Var, "<this>");
        ckf.g(dVar, "context");
        LiveData<T> liveData = (LiveData<T>) CoroutineLiveDataKt.liveData(dVar, j, new FlowLiveDataConversions$asLiveData$1(qp9Var, null));
        if (qp9Var instanceof ajq) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                liveData.setValue(((ajq) qp9Var).getValue());
            } else {
                liveData.postValue(((ajq) qp9Var).getValue());
            }
        }
        return liveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(qp9 qp9Var, Duration duration, d dVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("5900bd2f", new Object[]{qp9Var, duration, dVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(qp9Var, duration, dVar);
    }

    public static final <T> LiveData<T> asLiveData(qp9<? extends T> qp9Var, Duration duration, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("b23377b3", new Object[]{qp9Var, duration, dVar});
        }
        ckf.g(qp9Var, "<this>");
        ckf.g(duration, "timeout");
        ckf.g(dVar, "context");
        return asLiveData(qp9Var, dVar, Api26Impl.INSTANCE.toMillis(duration));
    }
}
