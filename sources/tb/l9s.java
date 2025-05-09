package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(834666525);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802d70a", new Object[0])).booleanValue();
        }
        return q9s.a3("themis_common_config", "enableFixedFrameRate", Boolean.TRUE);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88e6c64", new Object[0])).booleanValue();
        }
        return q9s.a3("themis_graphics_android", "enable_gpu_tracing", Boolean.TRUE);
    }

    public static boolean d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e063cac1", new Object[]{bbsVar})).booleanValue();
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("251f4bfe", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String I3 = q9s.I3("themis_graphics_android", "enable_fixed_frame_rate_white_list", "");
            if (!TextUtils.isEmpty(I3)) {
                TMSLogger.a("TMSCanvasUtils", "[orange] enable_fixed_frame_rate_white_list, value: " + I3);
                JSONArray parseArray = JSON.parseArray(I3);
                if (parseArray != null) {
                    for (int i = 0; i < parseArray.size(); i++) {
                        if (str.equals(parseArray.getString(i))) {
                            TMSLogger.b("TMSCanvasUtils", "[orange] fixed frame rate whitelist hit: " + str);
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSCanvasUtils", "parse enable_fixed_frame_rate_white_list config failed because of ", th);
        }
        return false;
    }
}
