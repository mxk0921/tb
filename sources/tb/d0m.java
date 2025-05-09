package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.AddressSDKDelegate;
import com.taobao.location.client.TBLocationClient;
import com.taobao.runtimepermission.a;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74aea68e", new Object[]{context, str})).booleanValue();
        }
        try {
            boolean f = TBLocationClient.f();
            if (b()) {
                AdapterForTLog.loge("AddressUtil", "address checkBizPermissionUtil:  old=" + f);
                return f;
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                qzl d = a.d(context, str, new String[]{p78.ACCESS_FINE_LOCATION});
                if (d.b[0] == 0) {
                    AdapterForTLog.loge("AddressUtil", "address checkBizPermissionUtil PERMISSION_GRANTED:  old=" + f);
                    return f;
                }
                AdapterForTLog.loge("AddressUtil", "address checkBizPermission: denied with msg " + d.c[0]);
                return false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("745ef637", new Object[0])).booleanValue();
        }
        return "false".equals(Integer.valueOf(AddressSDKDelegate.n("addressPermission", "true")));
    }
}
