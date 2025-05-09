package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d6s implements nqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(855638021);
        t2o.a(767557678);
    }

    @Override // tb.nqi
    public bqi a(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqi) ipChange.ipc$dispatch("69de1660", new Object[]{this, apiVar});
        }
        return c(apiVar);
    }

    @Override // tb.nqi
    public void b(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f440a4", new Object[]{this, apiVar});
            return;
        }
        try {
            GlobalClientInfo.getInstance(apiVar.f15918a).registerListener(apiVar.c, (AccsAbstractDataListener) new p4s());
            s5s s = j5s.j().s();
            String str = b6s.f;
            s.b(str, "MSG INIT", "初始化消息通道");
            j5s.j().s().b(str, "MSG INIT", "初始化消息通道成功");
        } catch (Exception e) {
            Log.e("tlogMessage", "registerDataListener failure : ", e);
            j5s.j().s().a(b6s.f, "MSG INIT", e);
            TLogEventHelper.b("ut_tlog_accs_init_err", ErrorCode.CODE_EXC, e.getMessage());
        }
    }

    @Override // tb.nqi
    public bqi c(api apiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqi) ipChange.ipc$dispatch("d8fe4844", new Object[]{this, apiVar});
        }
        try {
            ACCSManager.sendRequest(apiVar.f15918a, "userid", apiVar.c, apiVar.b.getBytes(), null);
            bqi bqiVar = new bqi();
            j5s.j().s().b(b6s.f, "SEND MSG", "异步发送消息完成");
            return bqiVar;
        } catch (Exception e) {
            Log.e("tlogMessage", "send accs message failure : ", e);
            j5s.j().s().a(b6s.f, "SEND MSG", e);
            TLogEventHelper.b("ut_tlog_accs_send_err", ErrorCode.CODE_EXC, e.getMessage());
            return null;
        }
    }
}
