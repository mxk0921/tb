package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ph2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMERCIAL_AD_NORMAL = "commercialAdNormal";
    public static final String COMMERCIAL_AD_VIDEO = "commercialAdVideo";
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_OTHER = 2;
    public static final int TYPE_VIDEO = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f26089a = Arrays.asList(BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON, "commercialAdNormal", "commercialAdVideo");
    public static final List<String> b = Arrays.asList("image", BootImageInfo.BIZ_TYPE_VIDEO_ICON);
    public static final List<String> c = Arrays.asList("commercialAdNormal", "commercialAdVideo");
    public static final List<String> d = Arrays.asList(BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON);
    public static final List<String> e = Arrays.asList("commercialAdNormal", "image", BootImageInfo.BIZ_TYPE_COLD_START_AD);
    public static final List<String> f = Arrays.asList("commercialAdVideo", BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON);

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8da3cb", new Object[]{str})).booleanValue();
        }
        return b.contains(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("762a1cd5", new Object[]{str})).booleanValue();
        }
        return c.contains(str);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28479ea7", new Object[]{str})).booleanValue();
        }
        return f26089a.contains(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7bd04a8", new Object[]{str})).booleanValue();
        }
        return d.contains(str);
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("86c40e5d", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
        JSONObject jSONObject6 = jSONObject3.getJSONObject("item");
        if (jSONObject6 == null || (jSONObject4 = jSONObject6.getJSONObject("0")) == null) {
            return null;
        }
        JSONObject jSONObject7 = jSONObject4.getJSONObject("content");
        jSONObject7.put(i2b.TRACK_EXPOSURE_PARAM, (Object) jSONObject5);
        return jSONObject7;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14015ac4", new Object[]{str});
        }
        return h(nwi.BIZ_CODE, str);
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9757fd3a", new Object[]{str, str2});
        }
        String substring = str2.substring(str2.lastIndexOf("/") + 1);
        tm1.a("BootImageDataUtils", "getLocalVideoPath: " + substring);
        File file = new File(di2.k(str), substring);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        tm1.a("BootImageDataUtils", "getLocalVideoPath: " + file + " ,no exist");
        return null;
    }

    public static JSONObject i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a9532a0", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null) {
            return null;
        }
        return jSONObject3.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
    }

    public static JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f2d85fb", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null || (jSONObject4 = jSONObject3.getJSONObject("item")) == null || (jSONObject5 = jSONObject4.getJSONObject("0")) == null) {
            return null;
        }
        return jSONObject5.getJSONObject("content");
    }

    public static JSONArray k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a0f582a0", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("bizData")) == null || (jSONObject3 = jSONObject2.getJSONObject("taobao-splash")) == null) {
            return null;
        }
        return jSONObject3.getJSONArray("data");
    }

    public static int l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c7c85b9", new Object[]{str})).intValue();
        }
        if (e.contains(str)) {
            return 1;
        }
        if (f.contains(str)) {
            return 0;
        }
        return 2;
    }

    public static JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e924854", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            tm1.a("BootImageDataUtils", "parseSplashBaseData data null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("containers");
        if (jSONObject2 == null) {
            tm1.a("BootImageDataUtils", "parseSplashBaseData container null");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("splash_home_base");
        if (jSONObject3 != null) {
            return jSONObject3.getJSONObject("base");
        }
        tm1.a("BootImageDataUtils", "parseSplashBaseData splashHomeBase null");
        return null;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bcfb621", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            tm1.a("BootImageDataUtils", "enableGeneralSplash base null updateOriginalSplashData");
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("topViewSplashSection");
        if (jSONObject2 == null) {
            tm1.a("BootImageDataUtils", "enableGeneralSplash topViewSplash null updateOriginalSplashData");
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
        if (jSONObject3 == null) {
            tm1.a("BootImageDataUtils", "enableGeneralSplash topViewSplash ext null updateOriginalSplashData");
            return false;
        } else if (jSONObject3.getBooleanValue("enableGeneralSplash")) {
            return true;
        } else {
            tm1.a("BootImageDataUtils", "enableGeneralSplash topViewSplash enableGeneralSplash false updateOriginalSplashData");
            return false;
        }
    }

    static {
        t2o.a(736100415);
    }
}
