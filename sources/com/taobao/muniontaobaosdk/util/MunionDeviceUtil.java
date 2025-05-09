package com.taobao.muniontaobaosdk.util;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import com.ut.device.UTDevice;
import java.util.Locale;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MunionDeviceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context appContext = Global.getApplication();
    private static String userAgent;
    private static String utdid;

    static {
        t2o.a(1017118865);
    }

    public static String getAccept(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e29d5471", new Object[]{str}) : getAccept(Global.getApplication(), str);
    }

    public static String getUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[0]);
        }
        if (userAgent != null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str = Build.VERSION.RELEASE;
        if (str.length() > 0) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; ");
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language != null) {
            stringBuffer.append(language.toLowerCase());
            String country = locale.getCountry();
            if (country != null) {
                stringBuffer.append("-");
                stringBuffer.append(country.toLowerCase());
            }
        } else {
            stringBuffer.append("en");
        }
        String str2 = Build.MODEL;
        if (str2.length() > 0) {
            stringBuffer.append("; ");
            stringBuffer.append(str2);
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            stringBuffer.append(" Build/");
            stringBuffer.append(str3);
        }
        String str4 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2 (TAOBAO-ANDROID-20130606)";
        userAgent = str4;
        return str4;
    }

    public static String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]) : getUtdid(appContext);
    }

    public static void setAppContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
        } else {
            appContext = context;
        }
    }

    public static String getAccept(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c590753", new Object[]{context, str});
        }
        try {
            return new vu3(context, null).q(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        String str = utdid;
        if (str != null || context == null) {
            return str;
        }
        String utdid2 = UTDevice.getUtdid(context);
        utdid = utdid2;
        return utdid2;
    }
}
