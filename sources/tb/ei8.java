package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ei8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199579);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9a4029", new Object[]{str, th});
        } else {
            b(str, th, 1.0f);
        }
    }

    public static void b(String str, Throwable th, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ae2cb7", new Object[]{str, th, new Float(f)});
            return;
        }
        try {
            String a2 = sgq.a(th);
            String str2 = "";
            int e = vav.e(c9x.CART_BIZ_NAME, "subStackTraceLength", 300);
            if (a2 != null) {
                str2 = a2.substring(0, e);
            }
            ub3.h(str, "错误堆栈：" + str2, f);
        } catch (Exception unused) {
        }
    }
}
