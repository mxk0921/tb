package tb;

import android.app.Activity;
import android.content.res.TypedArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(85983301);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e21965a", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }
}
