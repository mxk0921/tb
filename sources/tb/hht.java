package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.ncm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782584);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3b2b9e", new Object[]{dinamicXEngine});
        } else {
            dinamicXEngine.J0(ncm.DELETEHOSTCARD, new ncm.a());
        }
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713dc6a4", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.V0(ik5.DX_PARSER_FETCHICONLINE, new h18(new ik5()));
        dinamicXEngine.V0(yk5.DX_PARSER_GETFEEDBACKPOPANCHORINFO, new yk5());
    }

    public static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614092cb", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(v06.DX_EVENT_ICONHORIZONTALSCROLL, new g18(new v06()));
        dinamicXEngine.W0(cy5.DX_EVENT_GATEWAYREQUEST, new g18(new cy5()));
    }

    public static void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cb311a", new Object[]{dinamicXEngine});
            return;
        }
        rcm.a(dinamicXEngine);
        c(dinamicXEngine);
        b(dinamicXEngine);
        a(dinamicXEngine);
    }
}
