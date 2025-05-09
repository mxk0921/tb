package androidx.lifecycle.viewmodel.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.n;
import tb.ckf;
import tb.uu4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Ltb/uu4;", "Lkotlin/coroutines/d;", "coroutineContext", "<init>", "(Lkotlin/coroutines/d;)V", "coroutineScope", "(Ltb/uu4;)V", "Ltb/xhv;", "close", "()V", "Lkotlin/coroutines/d;", "getCoroutineContext", "()Lkotlin/coroutines/d;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CloseableCoroutineScope implements AutoCloseable, uu4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final d coroutineContext;

    public CloseableCoroutineScope(d dVar) {
        ckf.g(dVar, "coroutineContext");
        this.coroutineContext = dVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            n.d(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // tb.uu4
    public d getCoroutineContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6bf2ebb4", new Object[]{this});
        }
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(uu4 uu4Var) {
        this(uu4Var.getCoroutineContext());
        ckf.g(uu4Var, "coroutineScope");
    }
}
