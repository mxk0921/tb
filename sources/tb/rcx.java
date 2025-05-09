package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256223);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394a1070", new Object[]{context, str});
        } else {
            bca.b(context, str);
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a38a77", new Object[]{str})).booleanValue();
        }
        return qcx.c(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16b2e4a1", new Object[]{str})).booleanValue();
        }
        return ncx.g(str);
    }
}
