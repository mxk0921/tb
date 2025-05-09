package androidx.activity;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/activity/FullyDrawnReporterOwner;", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 extends Lambda implements g1a<View, FullyDrawnReporterOwner> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 INSTANCE = new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2();

    public ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 viewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2");
    }

    public final FullyDrawnReporterOwner invoke(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FullyDrawnReporterOwner) ipChange.ipc$dispatch("d4da52ec", new Object[]{this, view});
        }
        ckf.g(view, AdvanceSetting.NETWORK_TYPE);
        Object tag = view.getTag(R.id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
