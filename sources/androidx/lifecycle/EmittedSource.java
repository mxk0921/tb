package androidx.lifecycle;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlinx.coroutines.f;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.mn2;
import tb.nn2;
import tb.rr7;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/EmittedSource;", "Ltb/rr7;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "Ltb/xhv;", "removeSource", "()V", "disposeNow", "(Ltb/ar4;)Ljava/lang/Object;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/MediatorLiveData;", "", "disposed", "Z", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class EmittedSource implements rr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    public EmittedSource(LiveData<?> liveData, MediatorLiveData<?> mediatorLiveData) {
        ckf.g(liveData, "source");
        ckf.g(mediatorLiveData, "mediator");
        this.source = liveData;
        this.mediator = mediatorLiveData;
    }

    public static final /* synthetic */ void access$removeSource(EmittedSource emittedSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c28a05", new Object[]{emittedSource});
        } else {
            emittedSource.removeSource();
        }
    }

    private final void removeSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6166c6", new Object[]{this});
        } else if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    @Override // tb.rr7
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            nn2.b(f.a(zq7.c().N0()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
        }
    }

    public final Object disposeNow(ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("11a8dea2", new Object[]{this, ar4Var});
        }
        Object c = mn2.c(zq7.c().N0(), new EmittedSource$disposeNow$2(this, null), ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }
}
