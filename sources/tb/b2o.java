package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097063);
    }

    public static boolean a(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71500252", new Object[]{iklVar})).booleanValue();
        }
        if (iklVar.f21366a.type() != 5 || !iklVar.f21366a.needACK()) {
            return false;
        }
        ikl iklVar2 = new ikl(iklVar);
        iklVar2.f21366a = new Ack(iklVar.f21366a);
        MsgLog.i("ReplyManager", "reply ack >", iklVar.f21366a.routerId());
        MsgLog.d("ReplyManager", iklVar2);
        l5y.m(iklVar2).a(MsgRouter.e().j());
        return true;
    }
}
