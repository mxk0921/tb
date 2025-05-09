package tb;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.autosize.TBDeviceUtils;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class s1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27747a;

    static {
        t2o.a(589300098);
        ConfigStoreManager.getInstance();
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fa933d3", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getAndroidId]error ---" + th.toString());
            return null;
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e42240e", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
            if (proxy_getDeviceId != null) {
                return proxy_getDeviceId.trim();
            }
            return proxy_getDeviceId;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getOriginalImei]error ---" + th.toString());
            return null;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a756fe40", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            String proxy_getSubscriberId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
            if (proxy_getSubscriberId != null) {
                return proxy_getSubscriberId.trim();
            }
            return proxy_getSubscriberId;
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getOriginalImsi]error ---" + th.toString());
            return null;
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e962e456", new Object[]{context});
        }
        try {
            String str = Build.VERSION.RELEASE;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            StringBuilder sb = new StringBuilder(32);
            sb.append("MTOPSDK/3.1.1.7 (Android;");
            sb.append(str);
            sb.append(";");
            sb.append(str2);
            sb.append(";");
            sb.append(str3);
            sb.append(f7l.BRACKET_END_STR);
            try {
                if (SwitchConfig.getInstance().uaAddDeviceType()) {
                    if (TextUtils.isEmpty(f27747a)) {
                        if (TBDeviceUtils.p(context)) {
                            f27747a = "Fold";
                        } else if (TBDeviceUtils.P(context)) {
                            f27747a = "Pad";
                        } else {
                            f27747a = "Phone";
                        }
                    }
                    sb.append(" ");
                    sb.append("DeviceType");
                    sb.append(f7l.BRACKET_START_STR);
                    sb.append(f27747a);
                    sb.append(f7l.BRACKET_END_STR);
                }
            } catch (Throwable unused) {
            }
            return sb.toString();
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getPhoneBaseInfo] error ---" + th.toString());
            return "";
        }
    }

    public static String e() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.PhoneInfo", "[getSerialNum]error ---" + th.toString());
            return null;
        }
    }
}
