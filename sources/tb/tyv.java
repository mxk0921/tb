package tb;

import android.content.res.Resources;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912752);
    }

    public static int dpToPx(float f, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9a51b2a", new Object[]{new Float(f), resources})).intValue();
        }
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
