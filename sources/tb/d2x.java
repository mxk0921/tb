package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d2x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(852492330);
    }

    public static final boolean a(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ae4e2a", new Object[]{view, new Float(f), new Float(f2)})).booleanValue();
        }
        ckf.g(view, "<this>");
        return b(view, (int) f, (int) f2);
    }

    public static final boolean b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afb68a", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ckf.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i3;
        if (i2 > view.getMeasuredHeight() + i4 || i2 < i4 || i > measuredWidth || i < i3) {
            return false;
        }
        return true;
    }
}
