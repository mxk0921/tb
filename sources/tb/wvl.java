package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad88820c", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_LIVE_NAME, "");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99570ec0", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_PS_POP_AB, "");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5ec0a2", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_PS_POP_REDIRECT_URL, "");
    }

    public static List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12a630c4", new Object[0]);
        }
        String d = fyt.c().d(fyt.ORANGE_KEY_PS_POP_URLS, "");
        ArrayList arrayList = new ArrayList();
        for (String str : d.split(",")) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("284d937b", new Object[0]);
        }
        return fyt.c().d(fyt.ORANGE_KEY_RM_MIDDLE_PAGES, "");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2386e668", new Object[0])).booleanValue();
        }
        return fyt.c().b(fyt.ORANGE_KEY_PS_POP_ENABLE, Boolean.TRUE);
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45201c9b", new Object[]{str})).booleanValue();
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            TLog.logi(gyt.TLOG_MODULE, "wvl", "abConfig is null");
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(b);
            if (parseObject == null) {
                TLog.loge(gyt.TLOG_MODULE, "wvl", "parse config failed: " + b);
                return false;
            }
            JSONObject jSONObject = parseObject.getJSONObject(str);
            if (jSONObject == null) {
                TLog.loge(gyt.TLOG_MODULE, "wvl", "get channelConfig failed: " + b);
                return false;
            } else if (!"true".equals(jSONObject.getString("quickPass"))) {
                return "true".equals(dyt.a(jSONObject.getString("module"), jSONObject.getString("component"), jSONObject.getString("value")));
            } else {
                lcn.f(RVLLevel.Info, gyt.TLOG_MODULE, "全量开启,无需读取AB配置");
                return true;
            }
        } catch (Exception e) {
            TLog.loge(gyt.TLOG_MODULE, "wvl", "parse config failed: " + b + "; exception: " + e);
            return false;
        }
    }
}
