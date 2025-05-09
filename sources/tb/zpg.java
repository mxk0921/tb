package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.mtop.LinkMtopCommonRequest;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class zpg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSISTANT_API = "mtop.taobao.growth.afc.linkInfo.assistant.equity";
    public static final String DESK_TOP_API = "mtop.taobao.afc.android.desktop";
    public static final String DESK_TOP_COIN_API = "mtop.coingame.farm.task.biz.update";
    public static final String GET_MSG_API = "mtop.taobao.yuntai.doAction";
    public static final String VERSION = "1.0";
    public static final String VERSION_2 = "2.0";
    public static final String WIDGET_DYNAMIC_TOP_API = "mtop.alibaba.mobile.desktop.link.get";
    public static final String WIDGET_TOP_API = "mtop.taobao.growth.starlink.config.get";

    /* renamed from: a  reason: collision with root package name */
    public static zpg f32932a;

    static {
        t2o.a(1030750292);
    }

    public static synchronized zpg b() {
        synchronized (zpg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zpg) ipChange.ipc$dispatch("87b22d69", new Object[0]);
            }
            zpg zpgVar = f32932a;
            if (zpgVar != null) {
                return zpgVar;
            }
            try {
                int i = MtopRequest.f15411a;
                f32932a = new LinkMtopCommonRequest();
            } catch (ClassNotFoundException unused) {
            }
            irg.a("link_tag", "LinkCommonRequest === TBRequest实例: " + f32932a.toString());
            return f32932a;
        }
    }

    public static final String c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71169801", new Object[]{str, new Long(j)});
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("&&");
        sb.append(j);
        sb.append("&&_$#%151Safe");
        return jsg.i(sb.toString());
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4071db1", new Object[]{this, map});
            return;
        }
        String str = map.get("appKey");
        if (str == null) {
            str = map.get("appkey");
        }
        long currentTimeMillis = System.currentTimeMillis();
        map.put("t", String.valueOf(currentTimeMillis));
        map.put("requestId", c(str, currentTimeMillis));
    }

    public abstract void d(String str, String str2, Map<String, String> map, boolean z, boolean z2, boolean z3, xrg xrgVar);
}
