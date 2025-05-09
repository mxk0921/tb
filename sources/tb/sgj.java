package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538206);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda2704", new Object[]{new Integer(i)})).intValue();
        }
        Application application = Globals.getApplication();
        return (i * Math.min(pb6.s(application), pb6.r(application))) / 375;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0ad042", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8e4686", new Object[]{context})).booleanValue();
        }
        try {
            return d.c(context);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void d(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd1e6ed", new Object[]{imageView, new Integer(i)});
            return;
        }
        String r = uuo.r(i);
        if (imageView instanceof TUrlImageView) {
            ((TUrlImageView) imageView).setImageUrl(r);
            imageView.setImageResource(i);
            return;
        }
        imageView.setImageResource(i);
    }

    public static void e(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8800c720", new Object[]{imageView, str});
        } else if (!TextUtils.isEmpty(str)) {
            int f = f(str);
            if (f != 0) {
                d(imageView, f);
            } else if (imageView instanceof TUrlImageView) {
                ((TUrlImageView) imageView).setImageUrl(str);
            }
        }
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("219fdf36", new Object[]{str})).intValue();
        }
        Uri parse = Uri.parse(str);
        if (!zk4.CONTACTS_INFO_NOT_EMPTY_STATUS.equals(parse.getScheme())) {
            return 0;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        return application.getResources().getIdentifier(parse.getHost(), zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, application.getPackageName());
    }

    public static float g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d239cf79", new Object[]{new Float(f)})).floatValue();
        }
        Application application = Globals.getApplication();
        if (Float.isNaN(f)) {
            return f;
        }
        float s = (f * 750.0f) / pb6.s(application);
        double d = s;
        if (d <= 0.005d || s >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7df1f84f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.equals(scheme, "https")) {
            buildUpon.scheme("https");
        }
        return buildUpon.toString();
    }
}
