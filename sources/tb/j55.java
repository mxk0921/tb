package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(440402011);
    }

    public static void a(Context context, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd9dd93", new Object[]{context, runnable, runnable2});
        } else {
            a.c(context, Build.VERSION.SDK_INT >= 33 ? new String[]{t4p.CAMERA} : new String[]{t4p.CAMERA}).w("").A(runnable).z(runnable2).m();
        }
    }
}
