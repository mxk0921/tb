package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ycw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001990);
    }

    public static void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e714122", new Object[]{view, new Boolean(z)});
        } else if (z) {
            ViewCompat.setImportantForAccessibility(view, 1);
        } else {
            ViewCompat.setImportantForAccessibility(view, 4);
        }
    }

    public static void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8523d71", new Object[]{viewGroup});
        } else if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    a(childAt, true);
                }
            }
        }
    }

    public static void c(ViewGroup viewGroup, View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3df8c8e", new Object[]{viewGroup, view});
        } else if (viewGroup != null && view != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a(childAt, z);
                }
            }
        }
    }
}
