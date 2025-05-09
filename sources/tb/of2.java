package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class of2 implements wnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Long> f25346a = new ConcurrentHashMap<>();

    static {
        t2o.a(628097279);
        t2o.a(628097083);
    }

    @Override // tb.wnb
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("525af3e5", new Object[]{this, command});
        }
        if (TextUtils.isEmpty(command.header.f18091a) && !command.header.h.equals(p2j.d())) {
            return null;
        }
        dva dvaVar = command.header;
        int i = dvaVar.g;
        if (i == 301) {
            this.f25346a.put(d(command.sysCode, command.bizCode, dvaVar.f18091a, dvaVar.h), Long.valueOf(System.currentTimeMillis() + (command.body.b * 1000)));
            Integer valueOf = Integer.valueOf(command.bizCode);
            dva dvaVar2 = command.header;
            MsgLog.e("CMDBlock", "cmd block:", valueOf, dvaVar2.f18091a, dvaVar2.h, Integer.valueOf(command.body.b));
        } else if (i == 302) {
            this.f25346a.remove(d(command.sysCode, command.bizCode, dvaVar.f18091a, dvaVar.h));
            Integer valueOf2 = Integer.valueOf(command.bizCode);
            dva dvaVar3 = command.header;
            MsgLog.e("CMDBlock", "cmd unBlock:", valueOf2, dvaVar3.f18091a, dvaVar3.h, Integer.valueOf(command.body.b));
        }
        return null;
    }

    public Ack b(ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("e55c6787", new Object[]{this, iklVar});
        }
        BaseMessage baseMessage = iklVar.f21366a;
        if (baseMessage.type != 1 || !c(iklVar.b, baseMessage.bizCode, baseMessage.header.f18091a)) {
            return null;
        }
        Ack ack = new Ack(iklVar.f21366a);
        ack.setStatus(-3002);
        iklVar.f21366a = ack;
        iklVar.b = ack.sysCode;
        return ack;
    }

    public boolean c(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb1d097", new Object[]{this, new Integer(i), new Integer(i2), str})).booleanValue();
        }
        String d = d(i, i2, str, p2j.d());
        Long l = this.f25346a.get(d);
        if (l == null || System.currentTimeMillis() > l.longValue()) {
            this.f25346a.remove(d);
            return false;
        }
        MsgLog.e("CMDBlock", "block:", d);
        return true;
    }

    public final String d(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d693f17", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
        }
        return "" + i + f7l.PLUS + i2 + f7l.PLUS + str + f7l.PLUS + str2;
    }
}
