package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tmu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_KEY = "appKey";
    public static final String BIZ_ID = "bizId";
    public static final String CHANNEL_ID = "channelId";
    public static final String CURRENT_TIME = "currentTime";
    public static final String DEVICE_ID = "deviceId";
    public static final String MTP = "mtp";
    public static final String MTP_API = "api";
    public static final String MTP_ERROR = "error";
    public static final String MTP_PERF = "perf";
    public static final String POINT_INFO = "ArtcInfo";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String USER_ID = "userId";
    public static final int UT_EVENT = 2101;
    public static final String UT_PAGE_NAME = "Page_ARTC";
    public static final String UT_PARAM = "prm";
    public static final String UT_SEPARATOR = "^^^";
    public static final String UT_TYPE = "utType";

    /* renamed from: a  reason: collision with root package name */
    public static kju f28809a = new kju();

    static {
        t2o.a(395313655);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba71470", new Object[]{map});
            return;
        }
        map.put(CURRENT_TIME, String.valueOf(System.currentTimeMillis()));
        kju kjuVar = f28809a;
        if (kjuVar != null) {
            map.put("userId", kjuVar.f22712a);
            map.put("deviceId", f28809a.b);
            f28809a.getClass();
            map.put("bizId", "");
            map.put("appKey", f28809a.c);
            map.put("sdkVersion", f28809a.d);
            map.put(UT_TYPE, "grtn");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b212a852", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put(MTP, str);
        hashMap.put(UT_PARAM, str2);
        c(str, hashMap);
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff029fd", new Object[]{str, map});
            return;
        }
        kd0.a("ArtcInfo", JSON.toJSONString(map));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ARTC", 2101, str, "", "", map).build());
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc6f7b4", new Object[]{str});
        } else {
            b("api", i(f28809a.e, str));
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d291c7e", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("channelId", str2);
        hashMap.put(MTP, "api");
        hashMap.put(UT_PARAM, str);
        c("api", hashMap);
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65353a8", new Object[]{str, str2});
            return;
        }
        h(str2);
        TrtcLog.j(str + "-ut", str2);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332cfa96", new Object[]{str, str2});
            return;
        }
        h(str2);
        TrtcLog.i(str, str2);
    }

    public static String i(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c3f1350", new Object[]{objArr});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i]);
            if (i != objArr.length - 1) {
                sb.append("^^^");
            }
        }
        return sb.toString();
    }

    public static void j(kju kjuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f9c9d7", new Object[]{kjuVar});
        } else {
            f28809a = kjuVar;
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("412c6e5f", new Object[]{str});
            return;
        }
        String str2 = f28809a.e;
        b("api", i(str2, "CUSTOM", "trace", "{" + str + "}"));
    }
}
