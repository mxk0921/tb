package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.managers.a;
import com.taobao.tao.powermsg.model.Report;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ni4 implements wnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097280);
        t2o.a(628097083);
    }

    @Override // tb.wnb
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("525af3e5", new Object[]{this, command});
        }
        List<a.C0718a> c = a.c();
        if (command.header.c == 1000) {
            for (a.C0718a aVar : c) {
                if (a.i(aVar.b, aVar.c) && aVar.h == 5) {
                    ikl iklVar = new ikl(Report.create());
                    M m = iklVar.f21366a;
                    ((Report) m).header.c = 1000;
                    ((Report) m).header.g = 504;
                    ((Report) m).header.f18091a = aVar.b;
                    ((Report) m).setBizTag(aVar.c);
                    MsgLog.i("ConnectionCmdProcessor", "report ", aVar.b);
                    MsgLog.d("ConnectionCmdProcessor", iklVar);
                    l5y.m(iklVar).a(MsgRouter.e().j());
                }
            }
            return null;
        }
        for (a.C0718a aVar2 : c) {
            if (a.i(aVar2.b, aVar2.c) && aVar2.h == 5) {
                MsgLog.i("ConnectionCmdProcessor", "pushFlag ", aVar2.b);
                iyv.e().getPullManager().e(aVar2.b, aVar2.c, 0);
            }
        }
        return null;
    }
}
