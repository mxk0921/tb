package tb;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class km0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990101);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be5e9886", new Object[]{context})).intValue();
        }
        return c(context, 16843499);
    }

    public static int c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("840de2b3", new Object[]{context, new Integer(i)})).intValue();
        }
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            int dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0);
            typedArray.recycle();
            return dimensionPixelSize;
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
