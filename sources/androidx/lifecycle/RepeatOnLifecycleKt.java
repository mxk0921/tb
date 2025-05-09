package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlinx.coroutines.f;
import tb.ar4;
import tb.dkf;
import tb.pg1;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\n\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Ltb/uu4;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Ltb/u1a;Ltb/ar4;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Ltb/u1a;Ltb/ar4;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RepeatOnLifecycleKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("25ff06b1", new Object[]{lifecycle, state, u1aVar, ar4Var});
        }
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return xhv.INSTANCE;
        } else {
            Object b = f.b(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, u1aVar, null), ar4Var);
            return b == dkf.d() ? b : xhv.INSTANCE;
        }
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("720e8d22", new Object[]{lifecycleOwner, state, u1aVar, ar4Var});
        }
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, u1aVar, ar4Var);
        return repeatOnLifecycle == dkf.d() ? repeatOnLifecycle : xhv.INSTANCE;
    }
}
