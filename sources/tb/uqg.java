package tb;

import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488967);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3db288", new Object[]{str, str2});
            return;
        }
        try {
            TLog.loge("linkManager", str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e9af8", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(tmu.CURRENT_TIME, AfcUtils.g() + "");
        map.put(RVConstants.EXTRA_RES_LAUNCH_PARAMS, TbFcLinkInit.instance().launchParams + "");
        try {
            ah0.c(19999, str, str2, str3, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
