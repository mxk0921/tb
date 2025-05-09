package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f29768a = {"mtop.tblive.recommend.video.simple.query", "mtop.tblive.live.recommend.home", "mtop.tblive.recommend.updown.lives", zxg.LIVE_DETAIL_QUERY};

    public static void b(alc alcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef0decc", new Object[]{alcVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("liveid", str);
        }
        hashMap.put("reason", MonitorMediaPlayer.mornitorPlayerError);
        l.c("liveBlackScreen", JSON.toJSONString(hashMap));
        alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveBlackScreen", MonitorMediaPlayer.mornitorPlayerError, hashMap);
    }

    public static void e(alc alcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b628f21", new Object[]{alcVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "LivePlayTimeout");
        hashMap.put(PopConst.POP_EVENT_ID_KEY, 19999);
        l.c("liveBlackScreen", JSON.toJSONString(hashMap));
        alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveBlackScreen", "LivePlayTimeout", hashMap);
    }

    public static void f(alc alcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1642d1d3", new Object[]{alcVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "updownLivesDataEmpty");
        l.c("liveUnscrollable", JSON.toJSONString(hashMap));
        alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveUnscrollable", "updownLivesDataEmpty", hashMap);
    }

    public static void g(alc alcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e7db44", new Object[]{alcVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "recommendHomeDataEmpty");
        l.c("liveBlackScreen", JSON.toJSONString(hashMap));
        alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveBlackScreen", "recommendHomeDataEmpty", hashMap);
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38777eb5", new Object[]{str, new Boolean(z)});
        } else if (Arrays.asList(f29768a).contains(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "TNode");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19999);
            jSONObject.put("arg1", (Object) str);
            String str2 = "fail";
            jSONObject.put("arg2", (Object) (z ? "success" : str2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", (Object) str);
            if (z) {
                str2 = "success";
            }
            jSONObject2.put("status", (Object) str2);
            jSONObject.put("args", (Object) jSONObject2);
            TrackerModule.commit(new d.j(null, jSONObject, null), false);
        }
    }

    public static void c(alc alcVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f9053d", new Object[]{alcVar, obj});
        } else if (obj instanceof NetResponse) {
            String api = ((NetResponse) obj).getApi();
            a(api, false);
            if (api.equals("mtop.tblive.live.recommend.home")) {
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "recommendHomeRequestError");
                l.c("liveBlackScreen", hashMap.toString());
                alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveBlackScreen", "recommendHomeRequestError", hashMap);
            } else if (api.equals("mtop.tblive.recommend.updown.lives")) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", "updownLivesRequestError");
                l.c("liveUnscrollable", hashMap2.toString());
                alcVar.getTrackTint().g(g2e.MODULE_LIVE, "liveUnscrollable", "updownLivesRequestError", hashMap2);
            }
        }
    }

    public static void d(alc alcVar, Object obj) {
        NetResponse netResponse;
        org.json.JSONObject dataJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d064d376", new Object[]{alcVar, obj});
        } else if ((obj instanceof NetResponse) && (dataJsonObject = (netResponse = (NetResponse) obj).getDataJsonObject()) != null) {
            String api = netResponse.getApi();
            a(api, true);
            if (api.equals("mtop.tblive.live.recommend.home")) {
                if (!dataJsonObject.has("liveUrlList") || dataJsonObject.isNull("liveUrlList")) {
                    g(alcVar);
                    return;
                }
                try {
                    Object obj2 = dataJsonObject.get("liveUrlList");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        g(alcVar);
                    }
                } catch (JSONException unused) {
                    g(alcVar);
                }
            } else if (!api.equals("mtop.tblive.recommend.updown.lives")) {
            } else {
                if (!dataJsonObject.has("model") || dataJsonObject.isNull("model")) {
                    f(alcVar);
                    return;
                }
                try {
                    Object obj3 = dataJsonObject.get("model");
                    if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                        f(alcVar);
                    }
                } catch (JSONException unused2) {
                    f(alcVar);
                }
            }
        }
    }

    static {
        t2o.a(779092124);
    }
}
