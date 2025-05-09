package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.d;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.mn2;
import tb.rr7;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/CoroutineLiveData;", "target", "Lkotlin/coroutines/d;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/d;)V", "Landroidx/lifecycle/LiveData;", "source", "Ltb/rr7;", "emitSource", "(Landroidx/lifecycle/LiveData;Ltb/ar4;)Ljava/lang/Object;", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "coroutineContext", "Lkotlin/coroutines/d;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final d coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, d dVar) {
        ckf.g(coroutineLiveData, "target");
        ckf.g(dVar, "context");
        this.target = coroutineLiveData;
        this.coroutineContext = dVar.plus(zq7.c().N0());
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("93a862aa", new Object[]{this, t, ar4Var});
        }
        Object c = mn2.c(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t, null), ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, ar4<? super rr7> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e4e0dd5", new Object[]{this, liveData, ar4Var});
        }
        return mn2.c(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), ar4Var);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6657bd17", new Object[]{this});
        }
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoroutineLiveData) ipChange.ipc$dispatch("eff3b96b", new Object[]{this});
        }
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a36217", new Object[]{this, coroutineLiveData});
            return;
        }
        ckf.g(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
