package tb;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cfl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBAutoSize.Orientation";

    public static boolean a(Activity activity) {
        try {
            Field declaredField = Class.forName("com.android.internal.R$styleable").getDeclaredField("Window");
            declaredField.setAccessible(true);
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes((int[]) declaredField.get(null));
            Method declaredMethod = ActivityInfo.class.getDeclaredMethod("isTranslucentOrFloating", TypedArray.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34f1606", new Object[]{activity, new Integer(i)});
        } else {
            d(activity, i, false);
        }
    }

    public static void c(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd43c8e3", new Object[]{activity, new Integer(i)});
        } else {
            d(activity, i, true);
        }
    }

    public static void d(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e28204c", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity != null) {
            if (Build.VERSION.SDK_INT == 26) {
                if (a(activity)) {
                    TLog.loge(TAG, "isTranslucentOrFloating is true, No orientation set");
                    return;
                }
                TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(0, new int[]{16842840});
                if (obtainStyledAttributes != null && obtainStyledAttributes.getBoolean(0, false)) {
                    TLog.loge(TAG, "windowIsTranslucent is true, No orientation set");
                    return;
                } else if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
            }
            int requestedOrientation = activity.getRequestedOrientation();
            if (z || i != requestedOrientation) {
                activity.setRequestedOrientation(i);
            }
        }
    }
}
