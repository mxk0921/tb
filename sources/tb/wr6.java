package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cccd80c2", new Object[]{this, str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "modifyDataPriorityList", "");
        if (TextUtils.isEmpty(config)) {
            return "mytaobao".equals(str);
        }
        String[] split = config.split(",");
        if (split.length == 1) {
            return split[0].equals(str);
        }
        for (String str2 : split) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
