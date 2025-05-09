package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dm8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a11deb9a", new Object[]{message})).booleanValue();
        }
        if (!ra.f(message.what)) {
            return false;
        }
        try {
            if (!a(message)) {
                whh.a("ExceptionHandler", "failed fallback to home");
                return false;
            }
        } catch (Exception e) {
            whh.b("ExceptionHandler", "failed fallback to home", e);
        }
        return true;
    }

    public static boolean a(Message message) throws Exception {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f3cb54e", new Object[]{message})).booleanValue();
        }
        adk i = adk.i(message.obj);
        if (Build.VERSION.SDK_INT >= 28) {
            IBinder iBinder = (IBinder) i.b("mActivityToken").h();
            if (iBinder == null) {
                whh.a("ExceptionHandler", "token == null");
                return false;
            }
            Map map = (Map) adk.i(ra.b()).b("mActivities").h();
            if (map == null) {
                return false;
            }
            Object obj = map.get(iBinder);
            if (obj == null) {
                whh.a("ExceptionHandler", "activityClientRecord == null");
                return false;
            }
            activity = (Activity) adk.i(obj).b("activity").h();
        } else {
            activity = (Activity) i.b("activity").h();
        }
        if (activity == null) {
            whh.a("ExceptionHandler", "activity == null");
            return false;
        }
        whh.a("ExceptionHandler", activity.getClass().getSimpleName());
        activity.finish();
        Context applicationContext = activity.getApplicationContext();
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
        if (launchIntentForPackage == null) {
            whh.a("ExceptionHandler", "launchIntent == null");
            return false;
        }
        applicationContext.startActivity(launchIntentForPackage.addFlags(268468224));
        return true;
    }

    public static boolean c(Message message, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fab438", new Object[]{message, th})).booleanValue();
        }
        if (th instanceof WindowManager.BadTokenException) {
            return b(message);
        }
        if (th instanceof IllegalStateException) {
            String message2 = th.getMessage();
            return message2 != null && message2.contains("Activity top position already set to onTop");
        } else if (th instanceof IllegalArgumentException) {
            String message3 = th.getMessage();
            return message3 != null && message3.contains("not attached to window manager");
        } else {
            int i = message.what;
            return 134 == i || 137 == i;
        }
    }
}
