package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.h52;
import tb.no6;
import tb.oo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class id0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224387);
    }

    public static hd0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd0) ipChange.ipc$dispatch("faa3b517", new Object[0]);
        }
        return new hd0();
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a69875e", new Object[]{dinamicXEngine});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.V0(yh5.DX_PARSER_ADAMCONFIG, new yh5());
            dinamicXEngine.W0(tb5.DX_EVENT_ADAMEVENTHANDLER, new tb5());
        }
    }

    public static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdda0de", new Object[]{dinamicXEngine});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.V0(jl5.DX_PARSER_GETTAOGLOBALSETTING, new jl5());
            dinamicXEngine.V0(jn5.DX_PARSER_ISTOPINULTRONGROUP, new jn5(true));
            dinamicXEngine.V0(jn5.DX_PARSER_ISBOTTOMINULTRONGROUP, new jn5(false));
            dinamicXEngine.V0(lt5.DX_PARSER_ULTRONGLOBALDATA, new lt5());
            dinamicXEngine.V0(nt5.DX_PARSER_ULTRONPARENTDXDATA, new nt5());
            dinamicXEngine.V0(ot5.DX_PARSER_ULTRONPARENTKEY, new ot5());
            dinamicXEngine.V0(pt5.DX_PARSER_ULTRONREQUESTDATA, new pt5());
            dinamicXEngine.V0(o76.DX_PARSER_ULTRONFREENODEDATA, new o76());
            dinamicXEngine.V0(p76.DX_PARSER_ULTRONFREENODETEMPLATEINFO, new p76());
            dinamicXEngine.V0(-3364302697346699741L, new jv5());
            if (dinamicXEngine.v() != null) {
                dinamicXEngine.v().i(h52.DAMBATCHUPDATECOMPONENT, new h52.b());
                dinamicXEngine.v().i(no6.DAMREMOVECOMPONENT, new no6.a());
                dinamicXEngine.v().i(oo6.DAMUPDATECOMPONENT, new oo6.b());
            }
        }
    }
}
