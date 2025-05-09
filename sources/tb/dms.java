package tb;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TS.umbrella";

    static {
        t2o.a(329253020);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1ebd8f", new Object[]{str, str2, str3, str4, str5, map});
        } else if (cns.f() || c(str5)) {
            String subEdition = TBSpeed.getSubEdition();
            if (subEdition != null) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("speedBucket", subEdition);
                map.put("process", GlobalAppRuntimeInfo.getCurrentProcess());
            }
            UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
            bVar.d(str3).b(map);
            UmbrellaInfo a2 = bVar.a();
            if (a2 != null && !TextUtils.isEmpty(a2.mainBizName)) {
                String str6 = UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST;
                String jsonString = a2.toJsonString();
                AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", str6, jsonString);
                zdh.a(TAG, "commitSuccessStability, point:" + str6 + ", info:" + jsonString);
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        UmbrellaInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80feadea", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (cns.f() || c(str5)) {
            String subEdition = TBSpeed.getSubEdition();
            if (subEdition != null) {
                if (map == null) {
                    map = new HashMap<>(2);
                }
                map.put("speedBucket", subEdition);
                map.put("process", GlobalAppRuntimeInfo.getCurrentProcess());
            }
            UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
            bVar.d(str3).b(map);
            if (!TextUtils.isEmpty(str6) && (a2 = bVar.a()) != null) {
                String str8 = UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST;
                String jsonString = a2.toJsonString();
                AppMonitor.Alarm.commitFail("Page_Trade_Govern", str8, jsonString, str6, str7);
                zdh.a(TAG, "commitFailureStability, point:" + str8 + ", errorCode:" + str6 + ", info:" + jsonString);
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c19dbb2", new Object[]{str})).booleanValue();
        }
        double c = zms.c(wms.CONFIG_KEY_SAMPLE_RATIO, 5.0E-4d);
        if (!TextUtils.isEmpty(str)) {
            c = zms.c("sample_ratio_" + str, c);
        }
        return c > Math.random();
    }
}
