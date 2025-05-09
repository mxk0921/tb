package tb;

import android.content.pm.PackageInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[0]);
        }
        try {
            PackageInfo packageInfo = Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Exception unused) {
            return null;
        }
    }
}
