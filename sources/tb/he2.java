package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.config.RPConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class he2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean[] a(Context context, String str, String[] strArr) {
        List<PrivacyAuthResult> h;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("ff7789a8", new Object[]{context, str, strArr});
        }
        if (TextUtils.isEmpty(str) || strArr.length < 1) {
            ndh.a("BizPermissionWrapper", "checkSelfBizPermissions: permission request with empty scene, permission length: " + strArr.length + " bizName:" + str);
            return new boolean[0];
        }
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        if (ean.h().g()) {
            return zArr;
        }
        List<String> f = ean.h().f();
        for (String str2 : strArr) {
            if (!f.contains(str2)) {
                ndh.a("BizPermissionWrapper", "checkBizPermissions: the permission " + str2 + " does not enable bizPermission, exit");
                return zArr;
            }
        }
        try {
            PrivacyAuthGetParam.b bVar = new PrivacyAuthGetParam.b();
            bVar.b(str, strArr);
            h = br0.h(context, bVar.c());
        } catch (Throwable th) {
            ndh.a("BizPermissionWrapper", "checkSelfBizPermissions: get biz permission with exception " + th);
        }
        if (h == null) {
            ndh.a("BizPermissionWrapper", "checkBizPermission: biz permission result is empty, return false.");
            return zArr;
        }
        for (int i = 0; i < h.size(); i++) {
            Map<String, AuthStatus> permissions = h.get(i).getPermissions();
            if (permissions != null && permissions.containsKey(strArr[i])) {
                if (permissions.get(strArr[i]) == AuthStatus.GRANTED) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
            }
        }
        return zArr;
    }

    public static boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("626d604b", new Object[]{context, str, str2})).booleanValue();
        }
        boolean[] a2 = a(context, str, new String[]{str2});
        if (a2.length < 1) {
            return true;
        }
        return a2[0];
    }

    public static void d(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fa294", new Object[]{context, str, str2, new Integer(i)});
        } else {
            c(context, str, new String[]{str2}, new int[]{i});
        }
    }

    public static void c(Context context, String str, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ffd267", new Object[]{context, str, strArr, iArr});
        } else if (TextUtils.isEmpty(str) || strArr.length < 1 || iArr.length < 1) {
            ndh.a("BizPermissionWrapper", "checkSelfBizPermissions: permission request with empty scene, permission length: " + strArr.length + " bizName:" + str);
        } else {
            try {
                HashMap hashMap = new HashMap();
                RPConfig i = ean.h().i();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i.bizPermissionWhiteList.contains(strArr[i2])) {
                        hashMap.put(strArr[i2], Boolean.valueOf(iArr[i2] == 0));
                    }
                }
                if (hashMap.isEmpty()) {
                    ndh.a("BizPermissionWrapper", "setBizPermissionsStatus: empty permissions to set, exit.");
                    return;
                }
                PrivacyAuthSetParam.a aVar = new PrivacyAuthSetParam.a();
                aVar.b(str, hashMap);
                PrivacyCode k = br0.k(context, aVar.c());
                if (k != PrivacyCode.SUCCESS) {
                    ndh.a("BizPermissionWrapper", "setBizPermissions: set ali privacy failed, with error code " + k);
                }
            } catch (Throwable th) {
                ndh.a("BizPermissionWrapper", "checkSelfBizPermissions: set biz permission result with exception " + th);
            }
        }
    }
}
