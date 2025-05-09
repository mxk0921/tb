package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237728);
    }

    public static boolean a(OrangeConfig orangeConfig, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f28ce2", new Object[]{orangeConfig, str, new Boolean(z)})).booleanValue();
        }
        String config = orangeConfig.getConfig("taopai", str, null);
        if (config == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(config);
        } catch (Exception unused) {
            return z;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("taopai", str, str2);
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c514a541", new Object[0]);
        }
        return d(b("preload_resource_list", "[\"algorithm_PixelAIHDRNet\"]"));
    }

    public static List<String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf67ee71", new Object[]{str});
        }
        try {
            return JSON.parseArray(str, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("521d9b8", new Object[0])).booleanValue();
        }
        return a(OrangeConfig.getInstance(), "mai_depend_check_open", true) && !f();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5765451", new Object[0])).booleanValue();
        }
        return a(OrangeConfig.getInstance(), "resource_preload_check_update", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17d55d94", new Object[0])).booleanValue();
        }
        return a(OrangeConfig.getInstance(), "use_tp_editor_api", false);
    }
}
