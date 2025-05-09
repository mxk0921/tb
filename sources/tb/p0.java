package tb;

import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378897);
    }

    public static String a(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6272d35e", new Object[]{str, str2, str3, str4});
        }
        if (nvs.f() && v2s.o().c() != null) {
            return v2s.o().c().c(str, str2, str3, str4);
        }
        try {
            VariationSet activateSync = EVO.activateSync(str, str2, null, null);
            if (!(activateSync == null || (variation = activateSync.getVariation(str3)) == null)) {
                return variation.getValueAsString(str4);
            }
        } catch (Throwable th) {
            r0h.b(t0.TAG, th.getMessage());
        }
        return str4;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d7e6b8", new Object[0])).booleanValue();
        }
        return lrq.b(a("taolive", "channelBackRequestSearch", "backrequestsearch", "false"));
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5406f0cf", new Object[0]);
        }
        return a("taolive", "enableDXABTest", "value", "normal");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfd3d2e", new Object[0])).booleanValue();
        }
        return lrq.b(a("taolive", "enableWalle4Back", "value", "false"));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf15dae2", new Object[0]);
        }
        if (sj7.s(Globals.getApplication()) || sj7.w(Globals.getApplication()) || !nvs.K()) {
            return "old";
        }
        return a("taolive", "channelNewNativeHomePage", "nativeChannelType", "old");
    }

    public static boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33454354", new Object[]{str, str2})).booleanValue();
        }
        if (i("", str, str2)) {
            String[] split = str.split("_");
            if (split.length > 3 && !lrq.a(split[3])) {
                return split[3].equals("liveEqualAltitude");
            }
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd256e2", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("new");
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c4db7fa", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("new_single");
    }

    public static void c(Map<String, List<String>> map, Object obj) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a3fc0a", new Object[]{map, obj});
        } else if (map != null) {
            try {
                if (!map.isEmpty() && (list = map.get("mtop-mdepyixiu")) != null && !list.isEmpty()) {
                    for (String str : list) {
                        JSONArray parseArray = JSON.parseArray(str);
                        if (parseArray != null && !parseArray.isEmpty()) {
                            for (int i = 0; i < parseArray.size(); i++) {
                                Object obj2 = parseArray.get(i);
                                if (obj2 != null) {
                                    UTABTest.activateServer(obj2.toString(), obj);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                r0h.b(t0.TAG, e.getMessage());
            }
        }
    }

    public static boolean i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4feb3bc9", new Object[]{str, str2, str3})).booleanValue();
        }
        return !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str2.startsWith("new_single") && str3.equals("all");
    }
}
