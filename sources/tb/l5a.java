package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l5a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ORANGE = "hOrange";
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        t2o.a(475005034);
    }

    public static String b(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc65f0c2", new Object[]{context, str, str2});
        }
        try {
            if (TBSpeed.isSpeedEdition(context, KEY_ORANGE)) {
                str3 = py8.b().a("homepage_switch", str, str2);
            } else {
                str3 = OrangeConfig.getInstance().getConfig("homepage_switch", str, str2);
            }
            s3a.a(str + "=" + str3);
            return str3;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2caaa64f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        String b = b(context, str, z + "");
        return TextUtils.isEmpty(b) ? z : b.trim().toLowerCase().equals("true");
    }
}
