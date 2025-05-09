package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.StringUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<vyt> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef3ab65d", new Object[0]);
        }
        try {
            List<vyt> parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("tmg_launcher", "tmg_launcher_add_task", ""), vyt.class);
            return parseArray == null ? Collections.emptyList() : parseArray;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b09f467a", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("tmg_mini_zcache", str, "");
        if (StringUtil.isEmpty(config)) {
            return null;
        }
        return Arrays.asList(config.split(","));
    }

    public static List<vyt> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57f1c157", new Object[0]);
        }
        try {
            List<vyt> parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("tmg_launcher", "tmg_launcher_rm_task", ""), vyt.class);
            return parseArray == null ? Collections.emptyList() : parseArray;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }
}
