package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.PluginInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705482);
    }

    public static List<PluginInfo> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98cf637f", new Object[]{str});
        }
        return JSON.parseArray(str, PluginInfo.class);
    }
}
