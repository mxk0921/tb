package tb;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hy9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hy9 b = new hy9();

    /* renamed from: a  reason: collision with root package name */
    public final Map<IPage, List<yu1>> f20961a = new HashMap();

    public static hy9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hy9) ipChange.ipc$dispatch("2e2f804a", new Object[0]);
        }
        return b;
    }

    public void b(Activity activity, vex vexVar, IPage iPage) {
        ey9 ey9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f993c6", new Object[]{this, activity, vexVar, iPage});
        } else if (iPage instanceof cll) {
            if (Build.VERSION.SDK_INT >= 24) {
                ey9Var = new ey9((cll) iPage);
            } else {
                ey9Var = null;
            }
            fyo fyoVar = new fyo(activity, vexVar, ey9Var);
            fyoVar.i();
            fyoVar.d(iPage);
            d(iPage, fyoVar);
            hyo hyoVar = new hyo(activity, vexVar, ey9Var);
            hyoVar.i();
            hyoVar.d(iPage);
            d(iPage, hyoVar);
        }
    }

    public void c(IPage iPage) {
        List<yu1> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1267eea", new Object[]{this, iPage});
        } else if ((iPage instanceof cll) && (list = (List) ((HashMap) this.f20961a).get(((cll) iPage).y())) != null) {
            for (yu1 yu1Var : list) {
                yu1Var.d(iPage);
            }
        }
    }

    public final void d(IPage iPage, yu1 yu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ea3b6c", new Object[]{this, iPage, yu1Var});
            return;
        }
        if (!((HashMap) this.f20961a).containsKey(iPage)) {
            ((HashMap) this.f20961a).put(iPage, new ArrayList());
        }
        ((List) ((HashMap) this.f20961a).get(iPage)).add(yu1Var);
    }

    public void e(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bba0113", new Object[]{this, iPage});
            return;
        }
        List<yu1> list = (List) ((HashMap) this.f20961a).get(iPage);
        if (list != null) {
            for (yu1 yu1Var : list) {
                yu1Var.l(iPage);
                yu1Var.h();
            }
            ((HashMap) this.f20961a).remove(iPage);
        }
    }

    public void f(IPage iPage) {
        List<yu1> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec81ddf1", new Object[]{this, iPage});
        } else if ((iPage instanceof cll) && (list = (List) ((HashMap) this.f20961a).get(((cll) iPage).y())) != null) {
            for (yu1 yu1Var : list) {
                yu1Var.l(iPage);
            }
        }
    }
}
