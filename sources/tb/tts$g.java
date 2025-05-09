package tb;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.search.common.TBSearchApi;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.ut.device.UTDevice;
import tb.caa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tts$g implements caa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857499);
        t2o.a(481296421);
    }

    public tts$g() {
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return GetAppKeyFromSecurity.getAppKey(0);
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdff1e4", new Object[]{this});
        }
        return c21.g().getString(ai7.KEY_CPU_BRAND, "unknown");
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c918edee", new Object[]{this})).longValue();
        }
        return TimeStampManager.instance().getCurrentTimeStamp();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2213a1", new Object[]{this})).intValue();
        }
        int a2 = EnvironmentSwitcher.a();
        if (a2 < 0 || a2 > 2) {
            return 0;
        }
        return a2;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22c7928", new Object[]{this});
        }
        return c21.g().getString("mobileModel", Build.MODEL);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82f9ab7e", new Object[]{this});
        }
        return TBSearchApi.getCurrentSVersion();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        return Constants.screen_height;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return Constants.screen_width;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return TaoPackageInfo.getTTID();
    }

    public String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return TaoApplication.getVersion();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        if (Globals.getApplication() == null || Globals.getApplication().getApplicationInfo() == null || (Globals.getApplication().getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d2a674", new Object[]{this})).booleanValue();
        }
        try {
            if (!cvr.INSTANCE.f()) {
                return false;
            }
            if (lg4.d4()) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[]{this})).booleanValue();
        }
        Application application = Globals.getApplication();
        if (application == null || !TBDeviceUtils.p(application)) {
            return false;
        }
        return true;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[]{this})).booleanValue();
        }
        Application application = Globals.getApplication();
        if (application == null || !TBDeviceUtils.P(application)) {
            return false;
        }
        return true;
    }

    public boolean q() {
        Application application;
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ed4783", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29 && (application = Globals.getApplication()) != null && (applicationInfo = application.getApplicationInfo()) != null && applicationInfo.targetSdkVersion >= 29) {
            return true;
        }
        return false;
    }
}
