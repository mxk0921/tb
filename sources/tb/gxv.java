package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336593085);
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b37ce", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 > i2 || i4 > i) {
            return Math.min(Math.round(i3 / i2), Math.round(i4 / i));
        }
        return 1;
    }

    public static boolean b(Activity activity) {
        Class<?>[] declaredClasses;
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, null, invoke);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Bitmap c(Resources resources, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3b7bccfa", new Object[]{resources, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i, options);
            options.inSampleSize = a(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int d(ActivityInfo activityInfo, Context context) {
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e325298b", new Object[]{activityInfo, context})).intValue();
        }
        if (!(context == null || activityInfo == null)) {
            try {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context.getApplicationContext(), activityInfo.getThemeResource());
                TypedArray obtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{16842836});
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                obtainStyledAttributes.recycle();
                if (resourceId != 0 && "color".equals(contextThemeWrapper.getResources().getResourceTypeName(resourceId)) && Build.VERSION.SDK_INT >= 23) {
                    color = contextThemeWrapper.getResources().getColor(resourceId, null);
                    return color;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static List<Activity> e() {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            declaredField.setAccessible(isAccessible);
            for (Object obj : arrayMap.keySet()) {
                Object obj2 = arrayMap.get(obj);
                if (obj2 != null) {
                    Field declaredField2 = obj2.getClass().getDeclaredField("activity");
                    boolean isAccessible2 = declaredField2.isAccessible();
                    declaredField2.setAccessible(true);
                    Object obj3 = declaredField2.get(obj2);
                    iih iihVar = iih.INSTANCE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("current stack activity = ");
                    if (obj3 == null) {
                        str = "";
                    } else {
                        str = obj3.getClass().getName();
                    }
                    sb.append(str);
                    sb.append(" isFinish = ");
                    sb.append(((Activity) obj3).isFinishing());
                    iihVar.a("stdPopTag", sb.toString());
                    declaredField2.setAccessible(isAccessible2);
                    if (!((Activity) obj3).isFinishing()) {
                        arrayList.add(obj3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static Point f(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("e885353b", new Object[]{context});
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        Point point = new Point();
        if (!abl.R() || Build.VERSION.SDK_INT < 30) {
            windowManager.getDefaultDisplay().getRealSize(point);
        } else {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            point.x = bounds.width();
            bounds2 = currentWindowMetrics.getBounds();
            point.y = bounds2.height();
        }
        return point;
    }

    public static String h(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("692daf86", new Object[]{intent, str});
        }
        if (intent == null || TextUtils.isEmpty(str)) {
            return "";
        }
        String stringExtra = intent.getStringExtra(str);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = j(intent, str);
        }
        if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }

    public static String i(Map map, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eb08d34", new Object[]{map, str, strArr});
        }
        if (map != null && !map.isEmpty() && strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                Object obj = map.get(str2);
                if (obj != null) {
                    return obj.toString();
                }
            }
        }
        return str;
    }

    public static String j(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5b58a3", new Object[]{intent, str});
        }
        if (intent.getData() == null) {
            return null;
        }
        try {
            return intent.getData().getQueryParameter(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean k(ActivityInfo activityInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a55c3f35", new Object[]{activityInfo, context})).booleanValue();
        }
        if (activityInfo == null) {
            return true;
        }
        if (new ContextThemeWrapper(context.getApplicationContext(), activityInfo.getThemeResource()).getTheme().obtainStyledAttributes(new int[]{16842840}).getBoolean(0, false)) {
            return true;
        }
        return false;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
            return true;
        }
        return false;
    }

    public static boolean n(Activity activity, boolean z) {
        boolean translucent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b2f7968", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        if (!abl.N() || activity == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        translucent = activity.setTranslucent(z);
        return translucent;
    }

    public static Context o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9dc62f8f", new Object[]{context});
        }
        for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                return context2;
            }
        }
        return context;
    }

    public static Context p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("18a3166a", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        if (view.getContext() instanceof Activity) {
            return view.getContext();
        }
        while (view.getParent() != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
            if (view.getContext() instanceof Activity) {
                return view.getContext();
            }
        }
        return null;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean m(Context context, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41215765", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        if (context == null || !abl.a(context) || z) {
            return true;
        }
        Point f = f(context);
        int i = f.x;
        int i2 = f.y;
        float f2 = i / (i2 * 2.0f);
        if (f2 <= abl.w()) {
            z2 = false;
        }
        TLog.loge("stdPopTag", "stdPopTag", "current ScreenRatio : " + f2 + " isLargeScreenRatio = " + z2 + " width = " + i + " height = " + i2);
        if (!z2) {
            AppMonitor.Counter.commit("AbilityKit", "AndroidSmallScreenRatio", Build.BRAND + "|" + Build.DEVICE + "|" + Build.MANUFACTURER + "|" + Build.MODEL + "|" + Build.PRODUCT + "|" + f2, 1.0d);
        }
        return z2;
    }
}
