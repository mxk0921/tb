package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class war {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecef35d2", new Object[]{view});
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue();
        }
        return false;
    }

    public static int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9821d931", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return i2;
    }
}
