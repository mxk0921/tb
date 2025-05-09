package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.dwa;
import tb.fb7;
import tb.sqa;
import tb.xa7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782464);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a7fdb", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(6136827152325085276L, new g18(new y86()));
        dinamicXEngine.W0(a96.DX_EVENT_ROVERLAYGUIDE, new g18(new a96()));
        dinamicXEngine.W0(r66.DX_EVENT_OPENHOSTTARGETURLHANDLER, new g18(new r66()));
        dinamicXEngine.J0(fb7.GATEWAYTRIGGEREVENT, new fb7.a());
        dinamicXEngine.J0(xa7.DELETECARDBYBIZCODE, new xa7.a());
        dinamicXEngine.J0(dwa.DISMISS, new dwa.a());
        dinamicXEngine.J0(sqa.HOMEPAGETOAST, new sqa.a());
        dinamicXEngine.V0(6584495743641924598L, new h18(new zl5()));
    }
}
