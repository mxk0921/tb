package androidx.activity;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.acp;
import tb.ckf;
import tb.dcp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "Ltb/xhv;", "set", "(Landroid/view/View;Landroidx/activity/FullyDrawnReporterOwner;)V", "setViewTreeFullyDrawnReporterOwner", "get", "(Landroid/view/View;)Landroidx/activity/FullyDrawnReporterOwner;", "findViewTreeFullyDrawnReporterOwner", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final FullyDrawnReporterOwner get(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FullyDrawnReporterOwner) ipChange.ipc$dispatch("2abc53ce", new Object[]{view});
        }
        ckf.g(view, "<this>");
        return (FullyDrawnReporterOwner) dcp.r(dcp.v(acp.f(view, ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE), ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbb5920", new Object[]{view, fullyDrawnReporterOwner});
            return;
        }
        ckf.g(view, "<this>");
        ckf.g(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
