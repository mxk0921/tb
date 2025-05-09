package tb;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793443);
    }

    public static final boolean a(int i, int i2, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e1d6997", new Object[]{new Integer(i), new Integer(i2), viewGroup})).booleanValue();
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        if (!o4p.N0()) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (!childAt.canScrollVertically(1) && !childAt.canScrollVertically(-1)) {
                if ((childAt instanceof ViewGroup) && (z = a(i, i2, (ViewGroup) childAt))) {
                    break;
                }
            } else {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains(i, i2)) {
                    return true;
                }
            }
        }
        return z;
    }
}
