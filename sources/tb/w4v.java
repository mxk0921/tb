package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.b;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1dde", new Object[]{str, str2, str3, str4});
        } else {
            c(str, str2, str3, str4, 2101);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a000842f", new Object[]{str, str2, str3, str4});
        } else {
            c(str, str2, str3, str4, 2201);
        }
    }

    public static void c(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0a8b54", new Object[]{str, str2, str3, str4, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("augeTrackInfo", str4);
        String str5 = str + "_" + str2 + "_" + str3;
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Home", i, "Page_Home_Show-bottomBar", str5, null, hashMap).build());
        TLog.loge(y9a.c(), "UTWrapper", "commonMarkAndAlienEffectSendUT bizType:" + str + " arg2:" + str5 + " trackInfo:" + str4 + " eventId:" + i);
    }

    public static void d(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e8ef", new Object[]{list});
        } else if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", (Object) bVar.v());
                Map<String, String> r = bVar.r();
                if (r != null) {
                    jSONObject.put("spm", (Object) r.get("spm-url"));
                } else {
                    jSONObject.put("spm", (Object) null);
                }
                jSONArray.add(jSONObject);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("TabItem", jSONArray.toJSONString());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_MainTab", 2201, "ShowTab", null, null, hashMap).build());
        }
    }
}
