package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class g0a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714397);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("458d011f", new Object[]{str})).booleanValue();
        }
        return c(str, OrangeConfig.getInstance().getConfig("ShortVideo", "ggSourceList", "[\"guangguang\",\"guangguang_follow\"]"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a36fbcc4", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isPullLeftPersonalEnabled", "false"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(String str, String str2) {
        JSONArray parseArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5222f8", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || (parseArray = JSON.parseArray(str2)) == null || (size = parseArray.size()) <= 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(parseArray.getString(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("167f5ffd", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "transferAnimationEnable", "false"));
        } catch (Throwable th) {
            TLog.loge("FullPageConfig", "isTransferAnimationEnabled error", th);
            return false;
        }
    }
}
