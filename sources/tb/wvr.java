package tb;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdeab08", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "dynamic_device_characteristics");
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3944f8e2", new Object[]{activity})).booleanValue();
        }
        if (activity != null && !activity.isDestroyed() && !activity.isFinishing() && TBDeviceUtils.D(activity) && TBDeviceUtils.a(activity) != 2) {
            return false;
        }
        return true;
    }

    public static int[] a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cff6f726", new Object[]{context});
        }
        int[] iArr = new int[2];
        Arrays.fill(iArr, -1);
        if (context == null) {
            return iArr;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager == null) {
            Log.e("windowManager", "getScreenSize: can't find window manager.");
            return iArr;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            Log.e("windowManager", "getScreenSize: can't find default display.");
            return iArr;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        iArr[0] = displayMetrics.widthPixels;
        iArr[1] = displayMetrics.heightPixels;
        return iArr;
    }
}
