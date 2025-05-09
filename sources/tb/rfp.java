package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ea4ffa8f", new Object[]{context});
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static void b(Context context, cxe cxeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60b7412", new Object[]{context, cxeVar});
        } else {
            sfp.a().d(context, cxeVar);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{str});
        } else {
            sfp.a().f(str);
        }
    }

    public static boolean d(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3457324d", new Object[]{intent, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public static boolean e(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15022", new Object[]{context, intent, new Integer(i)})).booleanValue();
        }
        if (context == null || intent == null) {
            return false;
        }
        if (!ut4.b(intent)) {
            return d(intent, false);
        }
        try {
            sfp.a().b().a(context, intent, i);
            return f(intent);
        } catch (Exception e) {
            e.printStackTrace();
            return d(intent, true);
        }
    }

    public static boolean f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59db0221", new Object[]{intent})).booleanValue();
        }
        if (sfp.a().c() != null) {
            sfp.a().c().a(intent);
        }
        return true;
    }

    public static void g(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645948d1", new Object[]{context, intent, new Integer(i)});
        } else if (!e(context, intent, i) && !e(context, a(context), i) && !e(context, h(), i) && sfp.a().c() != null) {
            osk c = sfp.a().c();
            c.b(new Exception("cann't start activity with intent：" + h().toString()), h());
        }
    }

    public static Intent h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("aa931420", new Object[0]);
        }
        return new Intent("android.settings.SETTINGS");
    }

    public static synchronized void i(Context context, int i, osk oskVar) {
        synchronized (rfp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c237e6c", new Object[]{context, new Integer(i), oskVar});
            } else if (context != null) {
                sfp.a().g(oskVar);
                g(context, pyl.e().c(), i);
            }
        }
    }
}
