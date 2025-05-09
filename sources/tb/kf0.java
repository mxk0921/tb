package tb;

import android.content.Context;
import com.ali.user.mobile.utils.DeviceUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kf0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_LARGESCREENSTYLE_VAL = "address_largescreenstyle";
    public static final String ORANGE_POP_LARGESCREENSTYLE_VAL = "more_address_largescreenstyle";
    public static final String TAG = "address.AddressNavUtils";

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e709a16", new Object[]{context, str});
        }
        return b(context, ORANGE_LARGESCREENSTYLE_VAL, str);
    }

    public static String b(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2a8cc0c", new Object[]{context, str, str2});
        }
        try {
            OrangeConfig instance = OrangeConfig.getInstance();
            if (DeviceUtils.isPortraitStatus(context)) {
                str3 = "fullscreen";
            } else {
                str3 = "split";
            }
            String str4 = "largescreenstyle=" + instance.getConfig("receiverAddressConfig", str, str3);
            if (str2.contains("?")) {
                str2 = str2 + "&" + str4;
            } else {
                str2 = str2 + "?" + str4;
            }
            AdapterForTLog.logd(TAG, "preHandleUri " + str2);
            mtv.c("addressUrl", str2, "", null);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "preHandleUri error dump", th);
        }
        return str2;
    }
}
