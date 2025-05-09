package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dai.realtimedebug.RealtimeDebugConfig;
import com.taobao.mrt.MRT;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tqh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REALTIME_DEBUG = "WVTaobaoDeviceAIWithParam";

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69762b9", new Object[0]);
        } else {
            c(b(), true);
        }
    }

    public static String b() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdd3bdc5", new Object[0]);
        }
        Context g = MRT.g();
        if (g == null || (sharedPreferences = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString("realtime_debug_config", "");
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be945a5", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.equals("startRealtimeDebug", str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return c(str2, false);
    }

    public static void e(String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107baafe", new Object[]{str});
            return;
        }
        Context g = MRT.g();
        if (g != null && (sharedPreferences = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0)) != null) {
            sharedPreferences.edit().putString("realtime_debug_config", str).apply();
        }
    }

    public static boolean c(String str, boolean z) {
        RealtimeDebugConfig realtimeDebugConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786b94f1", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            realtimeDebugConfig = (RealtimeDebugConfig) JSON.parseObject(str, RealtimeDebugConfig.class);
        } catch (Throwable th) {
            kgh.t("MRTRealtimeDebugHandle", "", th);
            realtimeDebugConfig = null;
        }
        if (realtimeDebugConfig == null && TextUtils.isEmpty(realtimeDebugConfig.debugId)) {
            return false;
        }
        kgh.g(realtimeDebugConfig.debugId);
        kgh.p(realtimeDebugConfig.clog);
        if (!z) {
            if (realtimeDebugConfig.permanentTest) {
                e(str);
            } else {
                e("");
            }
        }
        kgh.b("MRTRealtimeDebugHandle", "开启实时调试模式。");
        return true;
    }
}
