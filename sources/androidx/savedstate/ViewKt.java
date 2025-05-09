package androidx.savedstate;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "savedstate-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @ReplaceWith(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateRegistryOwner) ipChange.ipc$dispatch("b98fdf", new Object[]{view});
        }
        ckf.g(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
