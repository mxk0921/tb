package androidx.lifecycle.viewmodel.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import tb.ckf;
import tb.jxq;
import tb.uu4;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ltb/uu4;", "asCloseable", "(Ltb/uu4;)Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "", "VIEW_MODEL_SCOPE_KEY", "Ljava/lang/String;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CloseableCoroutineScopeKt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(uu4 uu4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CloseableCoroutineScope) ipChange.ipc$dispatch("93f60bc1", new Object[]{uu4Var});
        }
        ckf.g(uu4Var, "<this>");
        return new CloseableCoroutineScope(uu4Var);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CloseableCoroutineScope) ipChange.ipc$dispatch("8ab40472", new Object[0]);
        }
        try {
            dVar = zq7.c().N0();
        } catch (IllegalStateException unused) {
            dVar = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(dVar.plus(jxq.b(null, 1, null)));
    }
}
