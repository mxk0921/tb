package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", StEvent.CURRENT_VIEW, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends Lambda implements g1a<View, View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 viewTreeLifecycleOwner$findViewTreeLifecycleOwner$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1");
    }

    public final View invoke(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("377c36f5", new Object[]{this, view});
        }
        ckf.g(view, StEvent.CURRENT_VIEW);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
