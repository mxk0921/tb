package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.ErrorMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eep implements wnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097282);
        t2o.a(628097083);
    }

    @Override // tb.wnb
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("525af3e5", new Object[]{this, command});
        }
        ErrorMessage errorMessage = new ErrorMessage(command);
        errorMessage.header.c = 2021;
        l5y.m(new ikl(errorMessage)).a(MsgRouter.e().d());
        return null;
    }
}
