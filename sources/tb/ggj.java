package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ggj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808910);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[0]);
            return;
        }
        hgj.h();
        uqa.b("recmdPrefetch", "MyTaoBaoOccasionNotify", "离开我淘了");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[0]);
            return;
        }
        hgj.i();
        uqa.b("recmdPrefetch", "MyTaoBaoOccasionNotify", "进入我淘了");
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8ef134", new Object[]{jSONObject});
        } else if (!f4b.b("disableUpdateMyTaoPreloadProtocol", false)) {
            hgj.j(jSONObject);
            uqa.b("recmdPrefetch", "MyTaoBaoOccasionNotify", "我淘接口请求回来了");
        }
    }
}
