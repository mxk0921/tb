package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h5m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699953);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("317cb457", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse == null || parse2 == null || !TextUtils.equals(parse.getHost(), parse2.getHost())) {
            return false;
        }
        return true;
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7dcec", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        if (str.contains("?" + str2 + "=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2 + "=" + str3;
        }
        return str + "?" + str2 + "=" + str3;
    }

    public static int c(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            int i2 = displayMetrics.heightPixels;
            int i3 = displayMetrics.widthPixels;
            if (i2 <= i3) {
                i2 = i3;
            }
            int height = windowManager.getDefaultDisplay().getHeight();
            int width = windowManager.getDefaultDisplay().getWidth();
            if (height <= width) {
                height = width;
            }
            i = i2 - height;
            return (int) (i / displayMetrics.density);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }
}
