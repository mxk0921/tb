package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217738);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7814d455", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("wopc_jae_rules");
        if (configs != null) {
            for (String str : configs.keySet()) {
                String str2 = configs.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }
}
