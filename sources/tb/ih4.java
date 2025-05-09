package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.StringUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ih4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "mytaobao_switch";

    static {
        t2o.a(745538191);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c9dc565", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return b(GROUP_NAME, str, z);
    }

    public static boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b247f19f", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return b("mpm_data_switch", str, z);
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd78aaca", new Object[]{str, new Integer(i)})).intValue();
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig(GROUP_NAME, str, "" + i);
        TLog.logd("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            return i;
        }
    }

    public static JSONObject e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9580ff7f", new Object[]{str, jSONObject});
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, str, "");
        TLog.loge("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        try {
            return TextUtils.isEmpty(config) ? jSONObject : JSON.parseObject(config);
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP_NAME, str, str2);
        TLog.logd("mytaobao.ConfigUtil", "key = " + str + ", value=" + config);
        return config;
    }

    public static boolean b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5896d07c", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig(str, str2, "" + z);
        if (!StringUtil.isEmpty(config)) {
            TLog.loge("mytaobao.ConfigUtil", "key = " + str2 + ", value=" + config);
            return "true".equals(config.trim().toLowerCase());
        }
        TLog.loge("mytaobao.ConfigUtil", "key = " + str2 + ", value is empty!");
        return false;
    }
}
