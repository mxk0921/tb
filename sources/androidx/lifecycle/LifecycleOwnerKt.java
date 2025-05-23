package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleScope", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LifecycleOwnerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleCoroutineScope) ipChange.ipc$dispatch("d5644344", new Object[]{lifecycleOwner});
        }
        ckf.g(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
