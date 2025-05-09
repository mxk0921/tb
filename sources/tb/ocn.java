package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.common.WXConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ocn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("riverlogger".equals(str)) {
                ocn.a(OrangeConfig.getInstance().getConfigs("riverlogger"));
            }
        }
    }

    static {
        t2o.a(649068556);
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9b172e", new Object[]{map});
        } else {
            b(map);
        }
    }

    public static void b(Map<String, String> map) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0eaf5a", new Object[]{map});
            return;
        }
        String str = map.get(WXConfig.logLevel);
        if (str != null && (parseInt = Integer.parseInt(str)) >= RVLLevel.Off.value && parseInt <= RVLLevel.Verbose.value) {
            lcn.m(RVLLevel.valueOf(parseInt, RVLLevel.Info));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"riverlogger"}, new a(), true);
        } catch (NoClassDefFoundError unused) {
        }
    }
}
