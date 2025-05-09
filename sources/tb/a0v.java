package tb;

import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a0v implements UTClientConfigMgr.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593197);
        t2o.a(962592832);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        UTClientConfigMgr.c().e(new a0v());
    }

    @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "ut_event";
    }

    @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
    public void onChange(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
        } else {
            a(str);
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("UTBehaviorConfigListener", "parseConfig value", str);
        long j = 0;
        String str2 = "";
        if (!hsq.f(str)) {
            try {
                Map map = (Map) JSON.parseObject(str, Map.class);
                String valueOf = (map == null || map.size() <= 0) ? str2 : String.valueOf(map.get("config_dir"));
                if (!hsq.f(valueOf)) {
                    j = Long.parseLong(valueOf.substring(valueOf.lastIndexOf("/") + 1));
                }
                str2 = valueOf;
            } catch (Exception unused) {
            }
        }
        b0v.updateConfig(str2, j);
    }
}
