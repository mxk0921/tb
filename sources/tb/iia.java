package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63012c35", new Object[]{application})).booleanValue();
        }
        if (application.getApplicationInfo().targetSdkVersion <= 33 || Build.VERSION.SDK_INT <= 33) {
            return false;
        }
        return true;
    }

    public static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85815c5", new Object[]{application})).booleanValue();
        }
        int identifier = application.getResources().getIdentifier("ttid", "string", application.getPackageName());
        if (identifier == 0) {
            return false;
        }
        return application.getString(identifier).equalsIgnoreCase("212200");
    }
}
