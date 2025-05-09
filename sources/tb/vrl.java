package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f30202a = new HashMap<>();

    static {
        t2o.a(468714712);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("266158e1", new Object[]{str});
        }
        if (str != null) {
            return hxf.b(str).getString("firstFrameUrl");
        }
        return null;
    }

    public static HashMap<String, String> c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9ed35955", new Object[]{fluidContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            hashMap.put("from", sessionParams.c);
        }
        hashMap.put(a7m.VIDEO_PLAY_SCENES, fluidContext.getInstanceConfig().getPlayScenes());
        return hashMap;
    }

    public static String d(FluidContext fluidContext) {
        String str;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bec45ca", new Object[]{fluidContext});
        }
        Pair<String, String> l = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getConfig().l();
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null || (str = sessionParams.d) == null) {
            str = sg7.FAKE_CONTENT_ID;
        }
        if (l == null || (obj = l.first) == null) {
            return str;
        }
        return (String) obj;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af3806f", new Object[]{str});
        }
        JSONObject b = hxf.b(str);
        if (!sz3.b(b)) {
            return b.getString("id");
        }
        return null;
    }

    public static String f(JSONObject jSONObject, Pair<String, String> pair, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfc31e26", new Object[]{jSONObject, pair, new Boolean(z)});
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (z) {
                str = jSONObject2.toJSONString();
            } else {
                str = jSONObject2.getString("resourceStr");
            }
            if (pair == null) {
                return str;
            }
            if (TextUtils.isEmpty((CharSequence) pair.second) || !g8w.b()) {
                return (TextUtils.isEmpty((CharSequence) pair.first) || !g8w.c()) ? str : a(str);
            }
            return a(str);
        } catch (Throwable th) {
            ir9.c("PickPreloadController_ParseUtils", th.getMessage(), th);
            return null;
        }
    }

    public static JSONObject g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68230dc1", new Object[]{uri});
        }
        if (uri != null) {
            return h(l(uri.getQueryParameter("extParams")));
        }
        return null;
    }

    public static JSONObject h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed3629a4", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (sz3.b(parseObject) || !TextUtils.equals(parseObject.getString("target"), "web")) {
                    return parseObject;
                }
                ir9.b("PickPreloadController_ParseUtils", "PickPreloadControllerNew，getExtParamsByQuery: target = web，不承接");
                return null;
            } catch (Exception e) {
                ir9.b("PickPreloadController_ParseUtils", "PickPreloadControllerNew,parseVideoExtParamsByJsonStr" + e.getMessage());
            }
        }
        return null;
    }

    public static String i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7dd9ae8", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("extParams");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(queryParameter);
            if (!sz3.b(parseObject)) {
                return parseObject.getString("sceneSource");
            }
            return null;
        } catch (Exception e) {
            ir9.b("PickPreloadController_ParseUtils", "PickPreloadControllerNew,parseVideoExtParamsScreenSource" + e.getMessage());
            return null;
        }
    }

    public static Pair<String, String> j(Uri uri) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("13cbace8", new Object[]{uri});
        }
        if (uri == null || (g = g(uri)) == null) {
            return null;
        }
        try {
            return new Pair<>(g.getString("id"), g.getString("goodItemId"));
        } catch (Exception e) {
            ir9.b("PickPreloadController_ParseUtils", "parseVideoIdAndItemId" + e.getMessage());
            return null;
        }
    }

    public static String k(MtopResponse mtopResponse, Pair<String, String> pair, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa389ad1", new Object[]{mtopResponse, pair, new Boolean(z)});
        }
        try {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopStat != null) {
                str = mtopStat.fullTraceId;
                ir9.b("PickPreloadController_ParseUtils", "fullTraceId:" + str);
                if (f30202a == null) {
                    f30202a = new HashMap<>();
                }
                if (!TextUtils.isEmpty(str) && f30202a.containsKey(str)) {
                    return f30202a.get(str);
                }
            } else {
                str = null;
            }
            String f = f(JSON.parseObject(new String(mtopResponse.getBytedata())), pair, z);
            if (!TextUtils.isEmpty(str)) {
                f30202a.put(str, f);
            }
            return f;
        } catch (Throwable th) {
            ir9.c("PickPreloadController_ParseUtils", th.getMessage(), th);
            return null;
        }
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1733ec8a", new Object[]{str});
        }
        if (vyr.b() && !TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                Map m = m(parseObject);
                if (m instanceof JSONObject) {
                    parseObject = (JSONObject) m;
                }
                String jSONString = parseObject.toJSONString();
                ir9.b("PickPreloadController_ParseUtils", "tryConvertDoubleToTab3ExtParams, tab3ExtParams=" + jSONString + "; srcExtParams=" + str);
                return jSONString;
            } catch (Exception e) {
                ir9.b("PickPreloadController_ParseUtils", "tryConvertDoubleToTab3ExtParams. error:" + e.getMessage());
            }
        }
        return str;
    }

    public static Map m(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1887dc6e", new Object[]{map});
        }
        if (!vyr.b()) {
            return map;
        }
        try {
            ir9.b("PickPreloadController_ParseUtils", "tryConvertDoubleToTab3ExtParams, srcExtParams=" + map);
            if (!sz3.b(map)) {
                String I = nwv.I(map.get("contentId"), "");
                String I2 = nwv.I(map.get("iconStreams"), "");
                if (!TextUtils.isEmpty(I) && TextUtils.isEmpty(I2)) {
                    map.put("id", I);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("contentId", (Object) I);
                    jSONObject.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, (Object) "content");
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add(jSONObject);
                    map.put("iconStreams", jSONArray.toJSONString());
                }
            }
            ir9.b("PickPreloadController_ParseUtils", "tryConvertDoubleToTab3ExtParams, targetExtParams=" + map);
        } catch (Exception e) {
            ir9.b("PickPreloadController_ParseUtils", "tryConvertDoubleToTab3ExtParams. error:" + e.getMessage());
        }
        return map;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb3c1b6e", new Object[]{str});
        }
        try {
            s0j.a(s0j.GG_VIDEOTAB_VIDEO_DECRYPT);
            ir9.b("PickPreloadController_ParseUtils", "findVideoResource");
            byte[] decode = Base64.decode(str, 2);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(decode, 27, 43);
            byte[] copyOfRange3 = Arrays.copyOfRange(decode, 16, 27);
            byte[] copyOfRange4 = Arrays.copyOfRange(decode, 43, decode.length);
            byte[] bArr = new byte[copyOfRange3.length + copyOfRange4.length];
            System.arraycopy(copyOfRange3, 0, bArr, 0, copyOfRange3.length);
            System.arraycopy(copyOfRange4, 0, bArr, copyOfRange3.length, copyOfRange4.length);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, new SecretKeySpec(copyOfRange2, "AES"), new IvParameterSpec(copyOfRange));
            byte[] doFinal = instance.doFinal(bArr);
            s0j.d(s0j.GG_VIDEOTAB_VIDEO_DECRYPT);
            return new String(doFinal, "utf-8");
        } catch (Throwable th) {
            ir9.b("PickPreloadController_ParseUtils", "find VideoResource fail: " + th.getMessage());
            s0j.b(s0j.GG_VIDEOTAB_VIDEO_DECRYPT, "onError");
            return null;
        }
    }
}
