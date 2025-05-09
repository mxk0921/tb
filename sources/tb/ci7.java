package tb;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ci7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489033);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c4a887", new Object[]{context});
            return;
        }
        String b = vg0.c().b("is_get_device_imei", "false");
        if (TextUtils.equals("false", b)) {
            vp9.a("linkx", "DeviceIdentificationUtils === getDeviceIdentification === 是否获取imei：" + b);
            return;
        }
        String b2 = b(context, 0);
        String b3 = b(context, 1);
        HashMap hashMap = new HashMap();
        hashMap.put("imei1", b2);
        hashMap.put("imei2", b3);
        hashMap.put("oaid", TFCCommonUtils.k(context));
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("version", Build.VERSION.RELEASE);
        ah0.d("imei_info_android", "", "", hashMap);
    }

    public static String b(Context context, int i) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (String) telephonyManager.getClass().getDeclaredMethod("getImei", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
        } catch (Throwable th) {
            vp9.a("linkx", "DeviceIdentificationUtils === getIMEIIndex === 获取imei异常：" + th);
            return "";
        }
    }
}
