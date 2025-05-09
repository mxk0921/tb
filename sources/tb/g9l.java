package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g9l implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809279);
        t2o.a(613416995);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        if (!(map == null || (str2 = map.get("configVersion")) == null)) {
            configs.put(xmo.SP_KEY_ORANGE_CONFIG_VERSION, str2);
        }
        qy8.d().g(configs);
        t98.b().c();
    }
}
