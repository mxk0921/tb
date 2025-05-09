package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class GravityCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    private GravityCompat() {
    }

    public static void apply(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff17d5", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), rect, rect2, new Integer(i4)});
        } else {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }
    }

    public static void applyDisplay(int i, Rect rect, Rect rect2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c59bbb", new Object[]{new Integer(i), rect, rect2, new Integer(i2)});
        } else {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    public static int getAbsoluteGravity(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db55acfb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void apply(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a7175", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), rect, new Integer(i4), new Integer(i5), rect2, new Integer(i6)});
        } else {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }
    }
}
