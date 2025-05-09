package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tcw implements gf4, wdh, zyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093617);
        t2o.a(774897666);
        t2o.a(774897671);
        t2o.a(774897672);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e8e23b", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59698e3f", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // tb.gf4
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
