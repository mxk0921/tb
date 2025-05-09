package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29085f6f", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            TLog.logi(gyt.TLOG_MODULE, "dyt", "invalid params: " + str + "," + str2 + "," + str3);
            return "";
        }
        VariationSet activate = UTABTest.activate(str2, str);
        if (activate == null) {
            TLog.logi(gyt.TLOG_MODULE, "dyt", "variationSet is null");
            return "";
        }
        Variation variation = activate.getVariation(str3);
        if (variation != null) {
            return variation.getValueAsString("");
        }
        TLog.logi(gyt.TLOG_MODULE, "dyt", "variation is null");
        return "";
    }
}
