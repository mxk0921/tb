package tb;

import android.content.Context;
import android.os.Looper;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa8e758f", new Object[]{cls});
        }
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public static boolean c(Context context, int i) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968b28", new Object[]{context, new Integer(i)})).booleanValue();
        }
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(i, typedValue, true);
        } catch (Exception e) {
            xv8.c("TCommon", "get resources type value error=%s", e);
        }
        int i2 = typedValue.type;
        if ((i2 != 1 && i2 != 3) || (charSequence = typedValue.string) == null) {
            return false;
        }
        String charSequence2 = charSequence.toString();
        if (charSequence2.endsWith(".png") || charSequence2.endsWith(".jpg") || charSequence2.endsWith(".webp")) {
            return true;
        }
        return false;
    }
}
