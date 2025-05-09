package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oc1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f25295a = new AtomicBoolean(true);
    public static final int mUtEvent = 2101;
    public static final String mUtPageName = "Page_ARTC";
    public static final String utSeparator = "^^^";

    static {
        t2o.a(395313314);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7053c2", new Object[]{str});
        } else {
            b(str, "api");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b212a852", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        long time = new Date().getTime();
        hashMap.put(tmu.MTP, "api");
        hashMap.put(tmu.UT_PARAM, str);
        hashMap.put("time", String.valueOf(time));
        kd0.a("ArtcInfo", JSON.toJSONString(hashMap));
        if (f25295a.get()) {
            d("Page_ARTC", 2101, str2, hashMap);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996e6f4b", new Object[]{str, str2});
            return;
        }
        ArtcLog.i(str, str2, new Object[0]);
        b(str2, "api");
    }

    public static void d(String str, int i, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7edc5f", new Object[]{str, new Integer(i), str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, "", "", map).build());
        }
    }
}
