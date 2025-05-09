package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class t1m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMEI = "imei";
    public static final String IMSI = "imsi";
    public static final String MACADDRESS = "mac_address";

    /* renamed from: a  reason: collision with root package name */
    public static String f28418a = "";
    public static String b = "";

    static {
        t2o.a(775946269);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d62833c", new Object[0]);
        }
        StringBuffer stringBuffer = new StringBuffer();
        long currentTimeMillis = System.currentTimeMillis();
        String l = Long.toString(currentTimeMillis);
        stringBuffer.append(l.substring(l.length() - 5));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(Build.MODEL.replaceAll(" ", ""));
        while (stringBuffer2.length() < 6) {
            stringBuffer2.append('0');
        }
        stringBuffer.append(stringBuffer2.substring(0, 6));
        Random random = new Random(currentTimeMillis);
        long j = 0;
        while (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j = random.nextLong();
        }
        stringBuffer.append(Long.toHexString(j).substring(0, 4));
        return stringBuffer.toString();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9baa5d", new Object[]{context});
        }
        if (!TextUtils.isEmpty(f28418a)) {
            return f28418a;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("imei", null);
        if (string == null || string.length() == 0) {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
                if (proxy_getDeviceId == null || proxy_getDeviceId.length() == 0) {
                    proxy_getDeviceId = a();
                }
                string = proxy_getDeviceId.replaceAll(" ", "").trim();
                while (string.length() < 15) {
                    string = "0".concat(string);
                }
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("imei", string);
                edit.apply();
            } else {
                string = "";
            }
        }
        String trim = string.trim();
        f28418a = trim;
        return trim;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b0848f", new Object[]{context});
        }
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("imsi", null);
        if (string == null || string.length() == 0) {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                String proxy_getSubscriberId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
                if (proxy_getSubscriberId == null || proxy_getSubscriberId.length() == 0) {
                    proxy_getSubscriberId = a();
                }
                string = proxy_getSubscriberId.replaceAll(" ", "").trim();
                while (string.length() < 15) {
                    string = "0".concat(string);
                }
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("imsi", string);
                edit.apply();
            } else {
                string = "";
            }
        }
        b = string;
        return string;
    }
}
