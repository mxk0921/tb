package tb;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ej1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUGE_KEY = "version";
    public static final String AUGE_LOCAL_BIZ_CODE = "auge_local_biz_code";
    public static final String BREAK_UP_TIME = "break_up_time";
    public static final int DEFAULT_DELAY_TIME = 30;
    public static final String GROUP_NAME = "augesdk_android_config";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            String config = OrangeConfig.getInstance().getConfig(ej1.GROUP_NAME, ej1.BREAK_UP_TIME, "30");
            dj1.e(ej1.BREAK_UP_TIME, config);
            hj1.a(jj1.LOG_TAG, "orange获取到的最大打散时间=" + config + "s");
        }
    }

    public static synchronized void a(String str) {
        synchronized (ej1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c28c8a68", new Object[]{str});
            } else {
                dj1.a(str);
            }
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[0]);
        }
        String b = dj1.b(AUGE_LOCAL_BIZ_CODE, "");
        hj1.a(jj1.LOG_TAG, "getBizCode === 获取的bizCode：" + b);
        return b;
    }

    public static int c() {
        String str = "30";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a10564ab", new Object[0])).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, BREAK_UP_TIME, str);
            if (!TextUtils.isEmpty(config)) {
                return Integer.parseInt(config);
            }
            String b = dj1.b(BREAK_UP_TIME, str);
            if (!TextUtils.isEmpty(b)) {
                str = b;
            }
            return Integer.parseInt(str);
        } catch (Exception e) {
            hj1.b(jj1.LOG_TAG, "getBreakUpTime ===  获取最大打散时间异常 " + e);
            return 30;
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95cf663d", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
            }
            ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.READ_PHONE_STATE"}, 122);
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{context});
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 && telephonyManager != null) {
                return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager);
            }
            return "";
        } catch (Exception e) {
            hj1.b(jj1.LOG_TAG, "AugeCommonUtils === getIMSI异常了：" + e.getMessage());
            return "";
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39079d78", new Object[0]);
        }
        return dj1.b(gj1.GROUP_DATA_EXPIRE_TIME, "0");
    }

    public static int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad8aa78", new Object[]{new Integer(i)})).intValue();
        }
        if (i <= 0) {
            return 30;
        }
        return new Random().nextInt(i);
    }

    public static boolean h(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5022f9e", new Object[]{str})).booleanValue();
        }
        try {
            j = Long.parseLong(str);
        } catch (Exception e) {
            hj1.b(jj1.LOG_TAG, e.getMessage());
            j = 0;
        }
        if (System.currentTimeMillis() > j) {
            return true;
        }
        return false;
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc79e61", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{GROUP_NAME}, new a(), false);
        }
    }

    public static void j(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206f3bb4", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            String b = dj1.b(AUGE_LOCAL_BIZ_CODE, "");
            if (TextUtils.isEmpty(b)) {
                str2 = str;
            } else {
                str2 = b + "," + str;
            }
            dj1.e(AUGE_LOCAL_BIZ_CODE, str2);
            hj1.a(jj1.LOG_TAG, "saveBizCode === 存储的bizCode：" + str);
        }
    }
}
