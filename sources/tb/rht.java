package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29085f6f", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            TLog.logi(sht.TLOG_MODULE, "rht", "invalid params: " + str + "," + str2 + "," + str3);
            return "";
        }
        VariationSet activate = UTABTest.activate(str2, str);
        if (activate == null) {
            TLog.logi(sht.TLOG_MODULE, "rht", "variationSet is null");
            return "";
        }
        Variation variation = activate.getVariation(str3);
        if (variation != null) {
            return variation.getValueAsString("");
        }
        TLog.logi(sht.TLOG_MODULE, "rht", "variation is null");
        return "";
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45201c9b", new Object[]{str})).booleanValue();
        }
        String c = vht.c();
        if (TextUtils.isEmpty(c)) {
            TLog.logi(sht.TLOG_MODULE, "rht", "abConfig is null");
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(c);
            if (parseObject == null) {
                TLog.loge(sht.TLOG_MODULE, "rht", "parse config failed: " + c);
                return false;
            }
            JSONObject jSONObject = parseObject.getJSONObject(str);
            if (jSONObject == null) {
                TLog.loge(sht.TLOG_MODULE, "rht", "get channelConfig failed: " + c);
                return false;
            } else if (!"true".equals(jSONObject.getString("quickPass"))) {
                return "true".equals(a(jSONObject.getString("module"), jSONObject.getString("component"), jSONObject.getString("value")));
            } else {
                lcn.f(RVLLevel.Info, sht.TLOG_MODULE, "实验全量开启,无需读取AB配置");
                return true;
            }
        } catch (Exception e) {
            TLog.loge(sht.TLOG_MODULE, "rht", "parse config failed: " + c + "; exception: " + e);
            return false;
        }
    }
}
