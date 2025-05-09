package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.a;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p78 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final String HOME_COMPLIANCE_KEY = "TB_SHOPPING_PROCESS";
    public static final String KEY = "EditionPosition";

    static {
        t2o.a(729809255);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83d2ae57", new Object[0])).booleanValue();
        }
        boolean b = b(a.d(Globals.getApplication(), "TB_SHOPPING_PROCESS", new String[]{ACCESS_FINE_LOCATION}));
        bqa.d(KEY, "enablePosition 走合规,是否获取到权限：" + b);
        return b;
    }

    public static boolean b(qzl qzlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfe6fe2", new Object[]{qzlVar})).booleanValue();
        }
        int i = 0;
        boolean z = false;
        while (true) {
            String[] strArr = qzlVar.f27021a;
            if (i < strArr.length) {
                if (TextUtils.equals(strArr[i], ACCESS_FINE_LOCATION)) {
                    if (qzlVar.b[i] == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i++;
            } else {
                bqa.d(KEY, "isGrantedLocationPermission permissionResult " + z);
                return z;
            }
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68e7f07", new Object[]{context, str});
        } else {
            o78.C(context, str, a());
        }
    }
}
