package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class var {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile yar f29898a;

    public static Configuration a(Context context) {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration) ipChange.ipc$dispatch("fbcf4a81", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && (resources = context.getResources()) != null) {
            return resources.getConfiguration();
        }
        return null;
    }

    public static boolean c(Context context) {
        Configuration a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue();
        }
        if (b(context).f31947a && (a2 = a(context)) != null && (a2.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static yar b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yar) ipChange.ipc$dispatch("49c70843", new Object[]{context});
        }
        if (f29898a == null) {
            synchronized (var.class) {
                try {
                    if (f29898a == null) {
                        i7h i7hVar = new i7h(context.getFilesDir().getAbsolutePath());
                        if (!"true".equals(i7hVar.b("tbtheme", "enable_dark_theme"))) {
                            f29898a = new yar(false);
                            return f29898a;
                        }
                        String str = Build.MODEL;
                        String b = i7hVar.b("tbtheme", "dark_theme_model_whitelist");
                        if (b == null) {
                            b = "";
                        }
                        if (!new HashSet(Arrays.asList(b.split(","))).contains(str)) {
                            f29898a = new yar(false);
                            return f29898a;
                        }
                        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                        String b2 = i7hVar.b("tbtheme", "dark_theme_os_whitelist");
                        if (b2 == null) {
                            b2 = "";
                        }
                        if (!new HashSet(Arrays.asList(b2.split(","))).contains(valueOf)) {
                            f29898a = new yar(false);
                            return f29898a;
                        }
                        f29898a = new yar(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29898a;
    }
}
