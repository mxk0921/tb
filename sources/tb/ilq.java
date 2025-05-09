package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ilq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093539);
    }

    public static boolean a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d677e99", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var instanceof air) {
            return ((air) ux9Var).L0();
        }
        return false;
    }

    public static void b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bc861c", new Object[]{ux9Var});
        } else if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            String valueOf = String.valueOf((System.currentTimeMillis() - airVar.d0) / 1000);
            VideoInfo c0 = up6.c0(airVar);
            if (c0 != null && c0.broadCaster != null && "1".equals(c0.roomStatus)) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", valueOf);
                hashMap.put("isPageUnVisible", String.valueOf(airVar.e0));
                hashMap.put("isInsideDetail", String.valueOf(up6.u0(airVar)));
                hashMap.put("isInsideDetailFull", String.valueOf(a(airVar)));
                if (v2s.o().E() != null) {
                    v2s.o().E().track4Click("Page_TaobaoLiveWatch", "TaoLiveStayTimeDev", hashMap);
                }
                airVar.d0 = System.currentTimeMillis();
            }
        }
    }
}
