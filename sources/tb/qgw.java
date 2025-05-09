package tb;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int screenHeight;
    public static final int screenWidth;

    static {
        Display defaultDisplay = ((WindowManager) w9a.g().a().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
        screenHeight = defaultDisplay.getHeight();
        screenWidth = defaultDisplay.getWidth();
    }

    public static int[] a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("37d19a57", new Object[]{view, view2});
        }
        int[] iArr = {0, 0};
        while (view != view2) {
            iArr[1] = iArr[1] + view.getTop();
            iArr[0] = iArr[0] + view.getLeft();
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return iArr;
    }

    public static View[] b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View[]) ipChange.ipc$dispatch("d455c158", new Object[]{viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        return viewArr;
    }

    public static boolean c(Activity activity, View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309b186d", new Object[]{activity, view})).booleanValue();
        }
        if (activity == null || view == null) {
            return false;
        }
        if (activity.getWindow() == null || activity.getWindow().getDecorView() == null) {
            view2 = null;
        } else {
            view2 = activity.getWindow().getDecorView();
        }
        while (view2 != view) {
            if (view.getParent() == null || !(view.getParent() instanceof View)) {
                view = null;
                continue;
            } else {
                view = (View) view.getParent();
                continue;
            }
            if (view == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88664abb", new Object[]{view, view2})).booleanValue();
        }
        int[] a2 = a(view, view2);
        int i = a2[1];
        int height = view.getHeight() + i;
        int i2 = a2[0];
        int width = view.getWidth() + i2;
        if (i >= screenHeight || height <= 0 || width <= 0 || i2 >= screenWidth || height - i <= 0) {
            return false;
        }
        return true;
    }
}
