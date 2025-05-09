package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h9l implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587942);
        t2o.a(613416995);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else {
            ry8.b().d("homepage_switch", OrangeConfig.getInstance().getConfigs(str));
        }
    }
}
