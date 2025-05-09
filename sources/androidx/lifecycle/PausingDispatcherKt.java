package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.ar4;
import tb.mn2;
import tb.pg1;
import tb.u1a;
import tb.uu4;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\u000b\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\t\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\u000b\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\t\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\u000b\u001aK\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "Ltb/uu4;", "Ltb/ar4;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;Ltb/u1a;Ltb/ar4;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Ltb/u1a;Ltb/ar4;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Ltb/u1a;Ltb/ar4;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PausingDispatcherKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1f6504c3", new Object[]{lifecycleOwner, u1aVar, ar4Var}) : whenCreated(lifecycleOwner.getLifecycle(), u1aVar, ar4Var);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dd7d32b2", new Object[]{lifecycleOwner, u1aVar, ar4Var}) : whenResumed(lifecycleOwner.getLifecycle(), u1aVar, ar4Var);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6aa2df5c", new Object[]{lifecycleOwner, u1aVar, ar4Var}) : whenStarted(lifecycleOwner.getLifecycle(), u1aVar, ar4Var);
    }

    @Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("92526d02", new Object[]{lifecycle, state, u1aVar, ar4Var});
        }
        return mn2.c(zq7.c().N0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, u1aVar, null), ar4Var);
    }

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenCreated(Lifecycle lifecycle, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d15145d6", new Object[]{lifecycle, u1aVar, ar4Var}) : whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, u1aVar, ar4Var);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenResumed(Lifecycle lifecycle, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bbe1de87", new Object[]{lifecycle, u1aVar, ar4Var}) : whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, u1aVar, ar4Var);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStarted(Lifecycle lifecycle, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("15596f9d", new Object[]{lifecycle, u1aVar, ar4Var}) : whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, u1aVar, ar4Var);
    }
}
