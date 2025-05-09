package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import tb.a2s;
import tb.h2s;
import tb.scu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class im0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989914);
    }

    public static void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ad4af9", new Object[]{sVar});
            return;
        }
        sVar.k().v().j("-8184561642900287420", as0.class, "validatesData");
        sVar.k().v().j("3653929102547346655", wr0.class, "sequenceData");
    }

    public static void b(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eeb9c82", new Object[]{sVar});
            return;
        }
        sVar.s(1544903441687469454L, new ph());
        sVar.s(-489609274268614298L, new tm0());
    }

    public static void c(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe8fab6", new Object[]{sVar});
            return;
        }
        sVar.u(a2s.DX_WIDGET_ID, new a2s.b());
        sVar.u(h2s.WIDGET_ID, new h2s.a());
        sVar.u(scu.DXTBBUYTEXTINPUTVIEW_TBBUYTEXTINPUTVIEW, new scu.c());
    }
}
