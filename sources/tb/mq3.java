package tb;

import android.app.Activity;
import android.content.pm.PackageManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mq3 {
    public static boolean a(Activity activity) {
        try {
            activity.getApplicationContext().getPackageManager().getPackageInfo("cn.cyberIdentity.certification", 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
