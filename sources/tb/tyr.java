package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79cd80ae", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "degradeNavBeforeProcess", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isWaterDisable error", th);
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c07dd94", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isBlackLightVideoDrawableEnabled", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isBlackLightVideoDrawableEnabled error", th);
            return false;
        }
    }

    public static boolean c(String str) {
        JSONArray parseArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa64435", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("ShortVideo", "degradeToOldTypeList", "[\"taobaoerlou\",\"taolive\",\"taobaolive\",\"shop2018_double11\",\"gohi_home\",\"default\",\"preview\",\"shop_collect\",\"contentPlat\"]");
            if (TextUtils.isEmpty(config) || (parseArray = JSON.parseArray(config)) == null || (size = parseArray.size()) <= 0) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(parseArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isDegradeToOld error", th);
            return false;
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("458d011f", new Object[]{str})).booleanValue();
        }
        return h(str, OrangeConfig.getInstance().getConfig("ShortVideo", "ggSourceList", "[\"guangguang\",\"guangguang_follow\"]"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb309510", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isNativeFullScreenEnabled", "true"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isNativeFullScreenEnabled error", th);
            return false;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f58d201d", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isNativeFullScreenForceEnabled", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isNativeFullScreenForceEnabled error", th);
            return false;
        }
    }

    public static boolean g() {
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

    public static boolean h(String str, String str2) {
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

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("167f5ffd", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "transferAnimationEnable", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isTransferAnimationEnabled error", th);
            return false;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24284f26", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isWaterDisable", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isWaterDisable error", th);
            return false;
        }
    }

    public static boolean k(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37fa893", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        if (!e()) {
            return true;
        }
        if (f()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("type");
        return !TextUtils.isEmpty(queryParameter) && c(queryParameter);
    }
}
