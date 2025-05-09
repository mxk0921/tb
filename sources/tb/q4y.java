package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q4y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (q4y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
                return;
            }
            lvx d = d(context, str, str2, str3);
            nvx.b(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", d.toString());
        }
    }

    public static synchronized void b(String str) {
        synchronized (q4y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                nvx.a(str);
            }
        }
    }

    public static synchronized void c(Throwable th) {
        synchronized (q4y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            } else {
                nvx.c(th);
            }
        }
    }

    public static lvx d(Context context, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lvx) ipChange.ipc$dispatch("cee72b49", new Object[]{context, str, str2, str3});
        }
        try {
            str4 = context.getPackageName();
        } catch (Throwable unused) {
            str4 = "";
        }
        return new lvx(Build.MODEL, str4, "APPSecuritySDK-TAOBAO", "3.5.0.20240702", str, str2, str3);
    }
}
