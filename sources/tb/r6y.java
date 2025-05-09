package tb;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r6y {
    public static String a(String str) {
        Context a2 = sq4.a();
        if (a2 == null) {
            return "";
        }
        try {
            return a2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            x5y.c("f", "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            x5y.c("f", "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            x5y.c("f", "throwable");
            return "";
        }
    }
}
