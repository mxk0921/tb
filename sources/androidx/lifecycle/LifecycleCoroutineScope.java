package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.ckf;
import tb.nn2;
import tb.pg1;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\r\u0010\fJ8\u0010\u000e\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Ltb/uu4;", "<init>", "()V", "Lkotlin/Function2;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "Lkotlinx/coroutines/m;", "launchWhenCreated", "(Ltb/u1a;)Lkotlinx/coroutines/m;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class LifecycleCoroutineScope implements uu4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.uu4
    public abstract /* synthetic */ d getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    @Deprecated(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final m launchWhenCreated(u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        m b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("b7194c5d", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        b = nn2.b(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, u1aVar, null), 3, null);
        return b;
    }

    @Deprecated(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final m launchWhenResumed(u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        m b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("dff8ac0e", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        b = nn2.b(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, u1aVar, null), 3, null);
        return b;
    }

    @Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final m launchWhenStarted(u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        m b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("28947724", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        b = nn2.b(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, u1aVar, null), 3, null);
        return b;
    }
}
