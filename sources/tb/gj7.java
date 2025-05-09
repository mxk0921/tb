package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.ScreenType;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782514);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        return TBDeviceUtils.p(Globals.getApplication());
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        return TBAutoSizeConfig.x().R(context);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1709c060", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        boolean T = TBAutoSizeConfig.x().T(context);
        if (!a()) {
            return T;
        }
        if ((T || d(context)) && !b(context)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[0])).booleanValue();
        }
        return TBDeviceUtils.P(Globals.getApplication());
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("477a23f8", new Object[]{context})).booleanValue();
        }
        ScreenType D = TBAutoSizeConfig.x().D(context);
        fve.e("DeviceUtil", "screenType: " + D);
        return D == ScreenType.SMALL || D == ScreenType.MIN;
    }
}
