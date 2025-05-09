package tb;

import android.app.Application;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321703);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8af3f28", new Object[]{str, th});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (b()) {
            Application application = Globals.getApplication();
            Toast.makeText(application, "DebugError:" + str + " case:" + th, 1).show();
            txj.f("new_detail异常", str, th);
        } else if (th == null) {
            txj.e("new_detail异常", str);
        } else {
            txj.f("new_detail异常", str, th);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return cw6.b();
    }
}
