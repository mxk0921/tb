package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<a> f17644a = new ArrayList<>();
    public static int b = -1;
    public static Pair<Integer, Integer> c = new Pair<>(0, 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(Context context, Configuration configuration);
    }

    public static void a(Activity activity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4082ae", new Object[]{activity});
        } else if (!TBAutoSizeConfig.x().S()) {
            if (TBDeviceUtils.P(activity)) {
                hl1 c2 = hl1.c(activity);
                if (ig4.m().v(activity)) {
                    i = 4;
                } else {
                    i = -1;
                }
                if (c2 != null) {
                    c2.a(i);
                } else if (hl1.b(activity.getContentResolver()) == 1) {
                    cfl.b(activity, i);
                }
            } else if (!TBDeviceUtils.p(activity) || !wvr.b(activity)) {
                cfl.c(activity, 1);
            } else {
                cfl.c(activity, 3);
            }
        }
    }

    public static boolean b(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d72cc6", new Object[]{context, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i <= 0) {
            Log.e("TBAutoSize", "autoSize: screenInDp can't be negative, exit!");
            return false;
        } else if (context.getResources().getConfiguration().screenWidthDp == i && !z) {
            return false;
        } else {
            int H = TBAutoSizeConfig.x().H(context);
            if (H == -1) {
                Log.e("TBAutoSize", "autoSize: screenWidth can't be negative, exit!");
                return false;
            }
            int i2 = (int) (((H * 1.0f) / i) * 160.0f);
            if (ig4.m().E() || ig4.m().n().contains(Build.BRAND)) {
                l(context, i2, i);
            }
            g(context);
            ArrayList<a> arrayList = f17644a;
            synchronized (arrayList) {
                try {
                    Iterator<a> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().a(context, context.getResources().getConfiguration());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Log.e("TBAutoSize", "autoSize for " + context.getClass().getName() + " and targetDensityDpi is " + i2);
            return true;
        }
    }

    public static int c(Context context, boolean z) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94a2c2f5", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (b < 0 || z) {
            if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return 0;
            }
            b = displayMetrics.widthPixels;
        }
        return b;
    }

    public static int e(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7569b2f", new Object[]{context, new Boolean(z)})).intValue();
        }
        return TBAutoSizeConfig.x().C(context, z);
    }

    public static int f(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba74224a", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (ig4.m().z()) {
            return TBAutoSizeConfig.x().K(context, z);
        }
        return TBAutoSizeConfig.x().I(context, z);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5be2c3", new Object[]{context});
            return;
        }
        if (ig4.m().A()) {
            if (context instanceof Activity) {
                DinamicXEngine.G0((Activity) context, true);
            } else {
                DinamicXEngine.H0(true);
            }
            tl7.g(true);
        }
        mtq.d(context);
        if (context.getClass().getName().equals(obq.BIZ_NAME)) {
            com.taobao.tao.navigation.a.l();
        }
    }

    public static Rect h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e8c9f9d1", new Object[]{str});
        }
        String[] split = str.replace('-', ',').split(",");
        if (split.length != 4) {
            return null;
        }
        return new Rect(asl.a(split[0].trim()), asl.a(split[1].trim()), asl.a(split[2].trim()), asl.a(split[3].trim()));
    }

    public static void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add4f173", new Object[]{aVar});
            return;
        }
        ArrayList<a> arrayList = f17644a;
        synchronized (arrayList) {
            arrayList.add(aVar);
        }
    }

    public static void l(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970f28f4", new Object[]{context, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (context instanceof Activity) {
                Configuration configuration = context.getResources().getConfiguration();
                configuration.densityDpi = i;
                configuration.screenWidthDp = i2;
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                Configuration configuration2 = ((Activity) context).getApplication().getResources().getConfiguration();
                configuration2.densityDpi = i;
                configuration2.screenWidthDp = i2;
                ((Activity) context).getApplication().getResources().updateConfiguration(configuration2, ((Activity) context).getApplication().getResources().getDisplayMetrics());
                ((Activity) context).getApplication().getResources().getDisplayMetrics().widthPixels = context.getResources().getDisplayMetrics().widthPixels;
            } else if (context instanceof Application) {
                Configuration configuration3 = context.getResources().getConfiguration();
                configuration3.densityDpi = i;
                configuration3.screenWidthDp = i2;
                context.getResources().updateConfiguration(configuration3, context.getResources().getDisplayMetrics());
            }
            Resources system = Resources.getSystem();
            Configuration configuration4 = system.getConfiguration();
            configuration4.densityDpi = i;
            configuration4.screenWidthDp = i2;
            system.updateConfiguration(configuration4, system.getDisplayMetrics());
        } catch (Exception e) {
            TLog.loge("TBAutoSize", "updateConfiguration", e);
        }
    }

    public static Pair<Integer, Integer> d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("665abf89", new Object[]{context, new Boolean(z)});
        }
        if (!TBDeviceUtils.p(context) || !ig4.m().K() || context == null) {
            Pair<Integer, Integer> pair = new Pair<>(0, 0);
            c = pair;
            return pair;
        } else if (!z) {
            return c;
        } else {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if ("huawei".equals(lowerCase) || "honor".equals(lowerCase) || "xiaomi".equals(lowerCase) || TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE.equals(lowerCase)) {
                Activity y = TBAutoSizeConfig.x().y();
                if (context instanceof Activity) {
                    y = (Activity) context;
                }
                if (y == null || TBDeviceUtils.D(y) || TBDeviceUtils.E(y)) {
                    Pair<Integer, Integer> pair2 = new Pair<>(0, 0);
                    c = pair2;
                    return pair2;
                }
                String configuration = context.getResources().getConfiguration().toString();
                TLog.loge("TBAutoSize", context + "getScreenWidth: " + configuration);
                int indexOf = configuration.indexOf("mAppBounds=Rect(");
                Rect h = h(configuration.substring(indexOf + 16, configuration.indexOf(f7l.BRACKET_END_STR, indexOf)));
                int indexOf2 = configuration.indexOf("mMaxBounds=Rect(");
                Rect h2 = h(configuration.substring(indexOf2 + 16, configuration.indexOf(f7l.BRACKET_END_STR, indexOf2)));
                if (h == null || h2 == null || h.width() == h2.width() || configuration.contains("mRotation=ROTATION_180")) {
                    Pair<Integer, Integer> pair3 = new Pair<>(0, 0);
                    c = pair3;
                    return pair3;
                }
                Pair<Integer, Integer> pair4 = new Pair<>(Integer.valueOf(rhx.b(y)), Integer.valueOf(h2.width()));
                c = pair4;
                return pair4;
            }
            Pair<Integer, Integer> pair5 = new Pair<>(0, 0);
            c = pair5;
            return pair5;
        }
    }

    public static boolean j(Context context, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0494f9", new Object[]{context, new Float(f), new Integer(i)})).booleanValue();
        }
        if (f <= 0.0f || i <= 0) {
            Log.e("TBAutoSize", "autoSize: density or screenInDp can't be negative, exit!");
            return false;
        }
        if (ig4.m().E() || ig4.m().n().contains(Build.BRAND)) {
            l(context, (int) (160.0f * f), i);
        }
        g(context);
        ArrayList<a> arrayList = f17644a;
        synchronized (arrayList) {
            try {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(context, context.getResources().getConfiguration());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Log.e("TBAutoSize", "reset for " + context.getClass().getName() + " density=" + f);
        return true;
    }

    public static void k(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9444558f", new Object[]{activity, new Boolean(z)});
            return;
        }
        TLog.loge("TBAutoSize", "setActivityFullScreen; isFullScreen: " + z + " activity" + activity);
        if (!TBDeviceUtils.D(activity) || !z) {
            TBAutoSizeConfig.x().g0(false);
            activity.setRequestedOrientation(1);
            a(activity);
            return;
        }
        TBAutoSizeConfig.x().g0(true);
        cfl.c(activity, 0);
    }
}
