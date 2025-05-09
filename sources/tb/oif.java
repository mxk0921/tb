package tb;

import android.app.Activity;
import android.app.TabActivity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2;
import com.ut.mini.exposure.TrackerFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fgc f25405a;

    static {
        t2o.a(455082007);
    }

    public final boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e50c6c53", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null || !(activity instanceof TabActivity)) {
            return true;
        }
        return false;
    }

    public final boolean c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73bebe61", new Object[]{this, viewGroup})).booleanValue();
        }
        if (viewGroup.getChildCount() <= 0 || !(viewGroup.getChildAt(0) instanceof TFrameLayoutEx2)) {
            return false;
        }
        return true;
    }

    public final void d(ViewGroup viewGroup, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a94795b", new Object[]{this, viewGroup, activity, str});
            return;
        }
        TFrameLayoutEx2 tFrameLayoutEx2 = new TFrameLayoutEx2(activity);
        tFrameLayoutEx2.setUrl(str);
        tFrameLayoutEx2.setListener(this.f25405a);
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            tFrameLayoutEx2.addView(childAt, childAt.getLayoutParams());
        }
        viewGroup.addView(tFrameLayoutEx2, new ViewGroup.LayoutParams(-1, -1));
    }

    public void e(fgc fgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab314ed", new Object[]{this, fgcVar});
        } else {
            this.f25405a = fgcVar;
        }
    }

    public void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eec6a2", new Object[]{this, activity});
        } else if (b(activity)) {
            try {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        if (childAt != null && (childAt instanceof TFrameLayoutEx2)) {
                            viewGroup.removeViewAt(0);
                            fgh.a("container remove child0");
                        } else if (childAt != null && (childAt instanceof TrackerFrameLayout) && ((TrackerFrameLayout) childAt).getChildCount() > 0) {
                            ((TrackerFrameLayout) childAt).removeViewAt(0);
                            fgh.a("TrackerFrameLayout remove child1");
                        }
                    }
                }
            } catch (Exception e) {
                bcu.b(e.toString());
            }
        }
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834b6f33", new Object[]{this, activity, str});
        } else if (b(activity)) {
            try {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                if (viewGroup != null && viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt != null && (childAt instanceof TrackerFrameLayout)) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (!c(viewGroup2)) {
                            d(viewGroup2, activity, str);
                        }
                    } else if (!c(viewGroup)) {
                        d(viewGroup, activity, str);
                    } else {
                        bcu.a("no attachTrackerFrameLayout " + activity.toString());
                    }
                }
            } catch (Exception e) {
                bcu.b(e.toString());
            }
        }
    }
}
