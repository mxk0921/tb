package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.qp9;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Ltb/qp9;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "(Ltb/qp9;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Ltb/qp9;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FlowExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> qp9<T> flowWithLifecycle(qp9<? extends T> qp9Var, Lifecycle lifecycle, Lifecycle.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qp9) ipChange.ipc$dispatch("e8244466", new Object[]{qp9Var, lifecycle, state});
        }
        ckf.g(qp9Var, "<this>");
        ckf.g(lifecycle, "lifecycle");
        ckf.g(state, "minActiveState");
        return yp9.d(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, qp9Var, null));
    }

    public static /* synthetic */ qp9 flowWithLifecycle$default(qp9 qp9Var, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qp9) ipChange.ipc$dispatch("de6d261c", new Object[]{qp9Var, lifecycle, state, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(qp9Var, lifecycle, state);
    }
}
