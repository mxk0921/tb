package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import tb.ar4;
import tb.ckf;
import tb.mn2;
import tb.pg1;
import tb.u1a;
import tb.vbm;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a^\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u00072-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*`\b\u0000\u0010\u0019\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010¨\u0006\u001a"}, d2 = {"T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/EmittedSource;", "addDisposableSource", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Ltb/ar4;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "liveData", "(Lkotlin/coroutines/d;JLtb/u1a;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "(Ljava/time/Duration;Lkotlin/coroutines/d;Ltb/u1a;)Landroidx/lifecycle/LiveData;", "DEFAULT_TIMEOUT", "J", vbm.TYPE_BLOCK, "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CoroutineLiveDataKt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, ar4<? super EmittedSource> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("109ea6aa", new Object[]{mediatorLiveData, liveData, ar4Var});
        }
        return mn2.c(zq7.c().N0(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), ar4Var);
    }

    public static final <T> LiveData<T> liveData(Duration duration, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("3181d478", new Object[]{duration, u1aVar});
        }
        ckf.g(duration, "timeout");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return liveData$default(duration, (d) null, u1aVar, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(d dVar, long j, u1a u1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("17c566d2", new Object[]{dVar, new Long(j), u1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return liveData(dVar, j, u1aVar);
    }

    public static final <T> LiveData<T> liveData(d dVar, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("c45c40c4", new Object[]{dVar, u1aVar});
        }
        ckf.g(dVar, "context");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return liveData$default(dVar, 0L, u1aVar, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("e4039ef2", new Object[]{u1aVar});
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return liveData$default((d) null, 0L, u1aVar, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, d dVar, u1a u1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("b3b3b578", new Object[]{duration, dVar, u1aVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, dVar, u1aVar);
    }

    public static final <T> LiveData<T> liveData(d dVar, long j, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("33a1fa4a", new Object[]{dVar, new Long(j), u1aVar});
        }
        ckf.g(dVar, "context");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return new CoroutineLiveData(dVar, j, u1aVar);
    }

    public static final <T> LiveData<T> liveData(Duration duration, d dVar, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveData) ipChange.ipc$dispatch("b37cab4a", new Object[]{duration, dVar, u1aVar});
        }
        ckf.g(duration, "timeout");
        ckf.g(dVar, "context");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return new CoroutineLiveData(dVar, Api26Impl.INSTANCE.toMillis(duration), u1aVar);
    }
}
