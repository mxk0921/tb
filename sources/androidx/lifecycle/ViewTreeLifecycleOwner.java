package androidx.lifecycle;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.acp;
import tb.ckf;
import tb.dcp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Ltb/xhv;", "set", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "setViewTreeLifecycleOwner", "get", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;", "findViewTreeLifecycleOwner", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewTreeLifecycleOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final LifecycleOwner get(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleOwner) ipChange.ipc$dispatch("672b7e92", new Object[]{view});
        }
        ckf.g(view, "<this>");
        return (LifecycleOwner) dcp.r(dcp.v(acp.f(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418d37e4", new Object[]{view, lifecycleOwner});
            return;
        }
        ckf.g(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
