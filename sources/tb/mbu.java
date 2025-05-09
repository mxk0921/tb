package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mbu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String ARG_ENTRY_SPM = "entrySpm";
    public static final String ARG_SPM_CNT = "spm-cnt";
    public static final String ARG_SPM_URL = "spm-url";
    public static final String CLICK_CHANNEL = "home_channel_clck";
    public static final String CLICK_CHANNEL_BOX = "home_channelbox_clck";
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String PAGE_FOLLOW = "Page_TaobaoLive_follow";
    public static final String PAGE_SELECTED = "Page_TaobaoLive_jingxuan";
    public static final String PAGE_SINGLELIVE = "Page_Home_zhibotab";
    public static final String PAGE_TAOLIVE = "Page_TaobaoLive";
    public static final String SHOW_CHANNEL_BOX = "home_channelbox_show";
    public static final String SPM_FOLLOW = "a2141.taolive_follow";
    public static final String SPM_SELECTED = "a2141.8001240";
    public static final String SPM_SINGLELIVE = "a21gtk.b99812389";
    public static final String TAOLIVE_SPM_CNT_STR = "spm-cnt=a2141.8001240";

    static {
        t2o.a(310378915);
    }

    public static void a(JSONObject jSONObject, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ecbfb0", new Object[]{jSONObject, b0hVar});
        } else if (b0hVar != null && jSONObject != null) {
            b0hVar.a(jSONObject);
        }
    }

    public static void b(String str, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca8c5a0", new Object[]{str, b0hVar});
        } else if (b0hVar != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            b0hVar.a(jSONObject);
        }
    }

    public static void c(String str, String str2, String str3, String str4, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd00b5", new Object[]{str, str2, str3, str4, b0hVar});
        } else if (b0hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject.put("requestType", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) str3);
            jSONObject2.put("apiVersion", (Object) str4);
            jSONObject.put("traceInfo", (Object) jSONObject2);
            jSONObject.put("networkQoS", (Object) h());
            b0hVar.b(jSONObject);
        }
    }

    public static void e(String str, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427ea33c", new Object[]{str, b0hVar});
        } else {
            f(str, b0hVar, null);
        }
    }

    public static void f(String str, b0h b0hVar, Map<String, String> map) {
        TabManager.TabBottom tabBottom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a888d8c9", new Object[]{str, b0hVar, map});
        } else if (b0hVar != null && (tabBottom = b0hVar.x) != null && tabBottom.tabUT != null) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(yj4.STAIN_TRACK_PAGE, "Button-lpm_channel_monitor");
            Map<String, String> i = i(b0hVar.x.tabUT.getString("spm"), b0hVar);
            if (i != null && !i.isEmpty()) {
                if (map != null) {
                    i.putAll(map);
                }
                i.put("componentSession", b0hVar.f16112a);
                i.put("action", str);
                i.put("entryLiveSource", b0hVar.f);
                i.put("entrySpm", b0hVar.g);
                i.put("time", System.currentTimeMillis() + "");
                JSONArray s = b0hVar.s();
                if (s == null) {
                    s = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", (Object) str);
                TabManager.TabBottom tabBottom2 = b0hVar.x;
                if (tabBottom2 == null || "jingxuan".equals(tabBottom2.channelType)) {
                    TabManager.TabUp tabUp = b0hVar.y;
                    if (tabUp != null) {
                        jSONObject.put("tabType", (Object) tabUp.channelType);
                    }
                } else {
                    jSONObject.put("tabType", (Object) b0hVar.x.channelType);
                }
                s.add(jSONObject);
                i.put("roomEvents", Uri.encode(s.toJSONString()));
                i.put("networkQoS", h());
                if (b0hVar.i() != null) {
                    i.putAll(b0hVar.i());
                }
                uTHitBuilders$UTControlHitBuilder.setProperties(i);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    public static void g(b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35572794", new Object[]{b0hVar});
        } else if (b0hVar != null && nvs.L()) {
            HashMap hashMap = new HashMap();
            JSONArray o = b0hVar.o();
            if (o == null) {
                o = new JSONArray();
            }
            hashMap.put("liveChannelEvents", Uri.encode(o.toJSONString()));
            hashMap.put("sessionId", b0hVar.p());
            hashMap.put("deviceLevel", String.valueOf(sj7.c()));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TaobaoLive", 19999, "Page_TaobaoLive_tbLiveChannelPerformance", "", "0", hashMap).build());
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ea6a34f", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        if (globalNetworkQuality == 0) {
            return "unknow";
        }
        if (globalNetworkQuality == 1) {
            return "poor";
        }
        if (globalNetworkQuality == 2) {
            return "NORMAL";
        }
        if (globalNetworkQuality != 3) {
            return "normal";
        }
        return "excellent";
    }

    public static Map<String, String> i(String str, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("451531cd", new Object[]{str, b0hVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", b0hVar.g);
        }
        return hashMap;
    }

    public static void j(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sessionId", wca.b());
        uTHitBuilders$UTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void k(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sessionId", wca.b());
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
    }

    public static void l(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98bbee", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void d(String str, String str2, MtopResponse mtopResponse, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e303aee4", new Object[]{str, str2, mtopResponse, b0hVar});
        } else if (mtopResponse != null && b0hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject.put("requestType", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) mtopResponse.getApi());
            jSONObject2.put("apiVersion", (Object) mtopResponse.getV());
            if (!(mtopResponse.getHeaderFields() == null || mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2) == null || mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).size() <= 0)) {
                jSONObject2.put("traceID", (Object) mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
            }
            jSONObject.put("traceInfo", (Object) jSONObject2);
            jSONObject.put("networkQoS", (Object) h());
            b0hVar.b(jSONObject);
        }
    }
}
