package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.infoflow.commonsubservice.recbot.impl.dx.eventhandler.DXRecbotRequestQuestionEventHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wue implements bfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809287);
        t2o.a(486539298);
    }

    @Override // tb.bfc
    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713dc6a4", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.V0(z36.DX_PARSER_MAPTOARRAY, new h18(new z36()));
        dinamicXEngine.V0(9422011105736515L, new h18(new h16()));
        dinamicXEngine.V0(hk5.DX_PARSER_FESTIVAL, new h18(new hk5()));
        dinamicXEngine.V0(w18.DX_PARSER_HGETFROMCURRENTMODEL, new h18(new w18()));
        dinamicXEngine.V0(vl5.DX_PARSER_HGETDATA, new h18(new vl5()));
    }

    @Override // tb.bfc
    public void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614092cb", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(fqa.DX_EVENT_HSAVEDATA, new g18(new fqa()));
        dinamicXEngine.W0(h28.DX_EVENT_HSETTOCURRENTMODEL, new g18(new h28()));
        dinamicXEngine.W0(pln.RECBOTTAPEVENT, new g18(new pln()));
        dinamicXEngine.W0(DXRecbotRequestQuestionEventHandler.DX_EVENT_RECBOTREQUESTQUESTION, new g18(new DXRecbotRequestQuestionEventHandler()));
    }
}
