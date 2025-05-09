package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlinx.coroutines.JobSupport;
import tb.ckf;
import tb.jxq;
import tb.qp9;
import tb.sng;
import tb.yp9;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Ltb/qp9;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Ltb/qp9;", "eventFlow", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LifecycleKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleCoroutineScope) ipChange.ipc$dispatch("952da0e1", new Object[]{lifecycle});
        }
        ckf.g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, ((JobSupport) jxq.b(null, 1, null)).plus(zq7.c().N0()));
        } while (!sng.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final qp9<Lifecycle.Event> getEventFlow(Lifecycle lifecycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qp9) ipChange.ipc$dispatch("7eec2829", new Object[]{lifecycle});
        }
        ckf.g(lifecycle, "<this>");
        return yp9.x(yp9.d(new LifecycleKt$eventFlow$1(lifecycle, null)), zq7.c().N0());
    }
}
