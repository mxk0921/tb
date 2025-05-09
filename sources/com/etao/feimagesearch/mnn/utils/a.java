package com.etao.feimagesearch.mnn.utils;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.MnnUtils;
import com.etao.feimagesearch.nn.NetConfig;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.jzu;
import tb.lg4;
import tb.t2o;
import tb.tk1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "_actions";
    public static final String KEY_CID = "_cid";
    public static final String KEY_CLIENT_EXP_CONFIG_STRING = "_clientExpConfigString";
    public static final String KEY_CONFIG_STRING = "_configString";
    public static final String KEY_DEVICE_LEVEL = "_deviceLevel";
    public static final String KEY_FORMAT = "_format";
    public static final String KEY_IMAGE = "_image";
    public static final String KEY_IMAGE_HEIGHT = "_image_height";
    public static final String KEY_IMAGE_WIDTH = "_image_width";
    public static final String KEY_QUERY_SRC = "_querySrc";
    public static final String KEY_STRATEGY = "_strategy";
    public static final String KEY_USER_ZOOM = "_userZoomed";

    /* renamed from: a  reason: collision with root package name */
    public static final int f4783a = lg4.P2();

    static {
        t2o.a(481297084);
        p();
        q();
        o();
        l();
    }

    public static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a53b791e", new Object[]{map});
        }
        Object obj = map.get("extraInfo");
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                int length = str.length();
                int i = f4783a;
                if (length > i) {
                    return str.substring(0, i);
                }
                return str;
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
        return "";
    }

    public static void b(tk1 tk1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8b560c", new Object[]{tk1Var});
        } else {
            d("alinnAutoDetectResult", tk1Var);
        }
    }

    public static void c(NetConfig netConfig, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5b5565", new Object[]{netConfig, new Long(j)});
        } else {
            jzu.d("PltAlgo", "alinnRunUnitBuildSuccess", k(j), i(netConfig));
        }
    }

    public static void d(String str, tk1 tk1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a663f5", new Object[]{str, tk1Var});
            return;
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(tk1Var.b()));
        hashMap.put("call_algo_times", Double.valueOf(tk1Var.a()));
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("process_result", tk1Var.c());
        hashMap2.put("success", "" + tk1Var.e());
        hashMap2.put("use_origin_image", "" + tk1Var.f());
        jzu.d("PltAlgo", str, hashMap, hashMap2);
    }

    public static void e(NetConfig netConfig, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4d7832", new Object[]{netConfig, new Long(j), str, str2});
        } else {
            jzu.d("PltAlgo", "mnnRunUnitBuildFailed", k(j), j(netConfig, str, str2));
        }
    }

    public static void f(NetConfig netConfig, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97ca174", new Object[]{netConfig, new Long(j)});
        } else {
            jzu.d("PltAlgo", "mnnRunUnitBuildSuccess", k(j), i(netConfig));
        }
    }

    public static HashMap<String, Object> g(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ba253c46", new Object[]{bitmap});
        }
        return h(bitmap, KEY_IMAGE);
    }

    public static HashMap<String, Object> h(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1d49c941", new Object[]{bitmap, str});
        }
        MnnUtils.MnnImageFormat a2 = MnnUtils.a(bitmap);
        if (a2 == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>(10);
        hashMap.put(KEY_IMAGE_HEIGHT, Integer.valueOf(bitmap.getHeight()));
        hashMap.put(KEY_IMAGE_WIDTH, Integer.valueOf(bitmap.getWidth()));
        hashMap.put(KEY_FORMAT, Integer.valueOf(a2.getMnnFormatValue()));
        hashMap.put(str, new MNNCVImage(bitmap));
        return hashMap;
    }

    public static HashMap<String, String> i(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("71f6bd45", new Object[]{netConfig});
        }
        HashMap<String, String> hashMap = new HashMap<>(4);
        if (netConfig != null) {
            hashMap.put("name", netConfig.name);
            hashMap.put("type", netConfig.type);
        }
        return hashMap;
    }

    public static HashMap<String, String> j(NetConfig netConfig, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("eb0684e9", new Object[]{netConfig, str, str2});
        }
        HashMap<String, String> i = i(netConfig);
        i.put("errorCode", str);
        i.put("errorMsg", str2);
        return i;
    }

    public static HashMap<String, Double> k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("39755dda", new Object[]{new Long(j)});
        }
        HashMap<String, Double> hashMap = new HashMap<>(4);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j));
        return hashMap;
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b119d3a6", new Object[0]);
        } else {
            jzu.m("PltAlgo", "mnnAdvanceDetectionResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9d3c91", new Object[0]);
        } else {
            jzu.m("PltAlgo", "alinnAutoDetectResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44250d7", new Object[0]);
        } else {
            jzu.m("PltAlgo", "alinnRunUnitBuildSuccess", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type"));
        }
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79f3160", new Object[0]);
        } else {
            jzu.m("PltAlgo", "mnnAutoDetectResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d804a8", new Object[0]);
        } else {
            jzu.m("PltAlgo", "mnnRunUnitBuildFailed", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type", "errorCode", "errorMsg"));
        }
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5650526", new Object[0]);
        } else {
            jzu.m("PltAlgo", "mnnRunUnitBuildSuccess", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type"));
        }
    }
}
