package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Object> f20644a = new HashMap<>(25);

    public static <T> T a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5bd93bae", new Object[]{str, t});
        }
        T t2 = (T) f20644a.get(str);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static HashMap<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8abc9da6", new Object[0]);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isDebuggable", Boolean.valueOf(cw6.b()));
        hashMap.put("process", LauncherRuntime.c);
        hashMap.put("packageName", LauncherRuntime.b);
        hashMap.put("ttid", LauncherRuntime.d);
        Boolean bool = Boolean.TRUE;
        hashMap.put("isNextLaunch", bool);
        hashMap.put("launchStartTime", Long.valueOf(LauncherRuntime.f8166a));
        hashMap.put("appVersion", LauncherRuntime.e);
        hashMap.put("packageTag", LauncherRuntime.f);
        hashMap.put("deviceId", UTDevice.getUtdid(LauncherRuntime.g));
        hashMap.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(EnvironmentSwitcher.a()));
        hashMap.put("projectId", EnvironmentSwitcher.c());
        hashMap.put(OConstant.LAUNCH_ONLINEAPPKEY, GetAppKeyFromSecurity.getAppKey(0));
        hashMap.put(OConstant.LAUNCH_PREAPPKEY, GetAppKeyFromSecurity.getAppKey(0));
        hashMap.put("constantAppkey", Constants.appkey);
        if (cw6.b()) {
            hashMap.put(OConstant.LAUNCH_TESTAPPKEY, GetAppKeyFromSecurity.getAppKey(2));
        } else {
            hashMap.put(OConstant.LAUNCH_TESTAPPKEY, "");
        }
        hashMap.put("isUserTracklogEnable", Boolean.valueOf(BuiltConfig.getBoolean(R.string.userTrackLogEnable)));
        hashMap.put("isMiniPackage", Boolean.FALSE);
        hashMap.put("checkSessionInvalid", Boolean.valueOf(Login.checkSessionValid()));
        hashMap.put("sid", Login.getSid());
        hashMap.put("userId", Login.getUserId());
        hashMap.put("speedFlag", "");
        hashMap.put("ngLaunch", bool);
        hashMap.put("currentLocale", Locale.getDefault().getLanguage());
        hashMap.put("loginScheduleAsync", bool);
        return hashMap;
    }

    public static HashMap<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bd683e30", new Object[]{str});
        }
        if ("InitLoginParam".equals(str)) {
            HashMap<String, Object> hashMap = f20644a;
            hashMap.put("checkSessionInvalid", Boolean.valueOf(Login.checkSessionValid()));
            hashMap.put("sid", Login.getSid());
            hashMap.put("userId", Login.getUserId());
        }
        if ("InitBasicParam".equals(str)) {
            f20644a.putAll(b());
        }
        return f20644a;
    }
}
