package tb;

import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fa1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f19136a;

    public static File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a037a810", new Object[0]);
        }
        return acq.p().o().getFilesDir();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719b2f56", new Object[0]);
        }
        try {
            return acq.p().o().getPackageManager().getPackageInfo(acq.p().o().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    static {
        t2o.a(677380188);
        File a2 = a();
        String b = b();
        f19136a = new File(a2, "splitcompat/" + b + "/native-libraries/com_taobao_plugin").getAbsolutePath();
    }
}
