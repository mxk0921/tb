package tb;

import android.app.Application;
import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b98 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f16264a = -1;

    static {
        t2o.a(1032847446);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return Globals.getApplication();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2a2dd8b", new Object[0])).intValue();
        }
        return emp.c(a(), "envType", emp.d(EnvironmentSwitcher.SPKEY_ENV, 0));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return TaoPackageInfo.getTTID();
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{context})).booleanValue();
        }
        if (f16264a == -1) {
            if (e(context)) {
                f16264a = 1;
            } else {
                f16264a = 0;
            }
        }
        if (f16264a == 1) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a5b2832", new Object[]{context})).booleanValue();
        }
        boolean p = TBDeviceUtils.p(context);
        if (TBDeviceUtils.P(context) || p) {
            return true;
        }
        return false;
    }
}
