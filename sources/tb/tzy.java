package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321990);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b56c1637", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) Math.ceil(f * ((l0z.c(context) * 1.0d) / 375.0d));
    }

    public static float b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("690a1dbf", new Object[]{context})).floatValue();
        }
        return l0z.d(context, e(context));
    }

    public static int c(aqz aqzVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("927e1988", new Object[]{aqzVar, context})).intValue();
        }
        return a(context, d(context, aqzVar) + b(context));
    }

    public static float d(Context context, aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("961261b3", new Object[]{context, aqzVar})).floatValue();
        }
        return i0z.c(aqzVar, i0z.DRESS_UP_NAV_BAR_HEIGHT, 44);
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
