package tb;

import android.text.Layout;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710253);
    }

    public static int a(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0c1344", new Object[]{layout})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        return layout.getHeight();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff9eba39", new Object[0])).intValue();
        }
        return vvh.n() ? 1 : 0;
    }

    public static int c(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9dabab1", new Object[]{layout})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    public static int d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d031c002", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, i3);
        }
        if (mode == 0) {
            return i3;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
    }
}
