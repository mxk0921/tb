package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b7q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SMART_LAYER_PAGE_NAME = "Page_SmartLayer";

    static {
        t2o.a(295699809);
    }

    public static HashMap<String, String> a(g6q g6qVar, l6q l6qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6d292303", new Object[]{g6qVar, l6qVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(g6qVar == null || l6qVar == null)) {
            HashMap<String, String> hashMap2 = g6qVar.h;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            hashMap.put("liveSource", l6qVar.b);
            hashMap.put(RequestConfig.KEY_ANCHOR_ID, l6qVar.c);
            hashMap.put("entryLiveSource", l6qVar.d);
            hashMap.put("liveId", l6qVar.e);
            hashMap.put("type", g6qVar.e);
            String str = "0";
            hashMap.put("isPreload", l6qVar.v ? "1" : str);
            if (l6qVar.w) {
                str = "1";
            }
            hashMap.put("isPreloadMode", str);
            hashMap.put("clientSmartId", g6qVar.b);
            hashMap.put("spm", l6qVar.i);
            hashMap.put("entrySpm", l6qVar.j);
        }
        return hashMap;
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("674261fd", new Object[]{activity})).booleanValue();
        }
        if (activity == null || TextUtils.isEmpty(activity.getClass().getName())) {
            return false;
        }
        return TextUtils.equals(activity.getClass().getName(), FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY);
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eda7b20", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return String.valueOf(obj.hashCode());
    }

    public static void d(g6q g6qVar, l6q l6qVar, SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208d0195", new Object[]{g6qVar, l6qVar, smartLayerConstant$SmartLayerStage, str, str2});
        } else if (g6qVar != null && l6qVar != null) {
            HashMap<String, String> a2 = a(g6qVar, l6qVar);
            if (TextUtils.isEmpty(str)) {
                str = "Error_" + smartLayerConstant$SmartLayerStage.stage;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = smartLayerConstant$SmartLayerStage.stage + "发生错误";
            }
            a2.put("errorCode", str);
            a2.put("errorMessage", str2);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(SMART_LAYER_PAGE_NAME, 2201, smartLayerConstant$SmartLayerStage.stage, "Error", "0", a2).build());
        }
    }

    public static void e(g6q g6qVar, l6q l6qVar, SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c09c2b", new Object[]{g6qVar, l6qVar, smartLayerConstant$SmartLayerStage, smartLayerConstant$SmartLayerStage2, hashMap});
        } else if (g6qVar != null && l6qVar != null) {
            HashMap<String, String> a2 = a(g6qVar, l6qVar);
            if (hashMap != null) {
                a2.putAll(hashMap);
            }
            long c = l6qVar.c(smartLayerConstant$SmartLayerStage);
            long c2 = l6qVar.c(smartLayerConstant$SmartLayerStage2);
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage3 = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER;
            long j = c - c2;
            long c3 = c - l6qVar.c(smartLayerConstant$SmartLayerStage3);
            if (smartLayerConstant$SmartLayerStage == smartLayerConstant$SmartLayerStage3) {
                j = 0;
                c3 = 0;
            }
            a2.put("duration", String.valueOf(j));
            a2.put("totalDuration", String.valueOf(c3));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(SMART_LAYER_PAGE_NAME, 2201, smartLayerConstant$SmartLayerStage.stage, "", "0", a2).build());
        }
    }
}
