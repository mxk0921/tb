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
public class xog implements wnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Long> f31498a = new ConcurrentHashMap<>();

    static {
        t2o.a(628097281);
        t2o.a(628097083);
    }

    @Override // tb.wnb
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("525af3e5", new Object[]{this, command});
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f31498a;
        int i = command.sysCode;
        int i2 = command.bizCode;
        String str = command.header.f18091a;
        rg2 rg2Var = command.body;
        concurrentHashMap.put(e(i, i2, str, rg2Var.c, rg2Var.d), Long.valueOf(System.currentTimeMillis() + (command.body.b * 1000)));
        return null;
    }

    public Ack b(ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("e55c6787", new Object[]{this, iklVar});
        }
        int i = iklVar.b;
        BaseMessage baseMessage = iklVar.f21366a;
        int i2 = baseMessage.bizCode;
        dva dvaVar = baseMessage.header;
        if (!d(i, i2, dvaVar.f18091a, baseMessage.type, dvaVar.g)) {
            return null;
        }
        Ack ack = new Ack(iklVar.f21366a);
        ack.setStatus(4001);
        iklVar.f21366a = ack;
        iklVar.b = ack.sysCode;
        return ack;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2075c7fa", new Object[]{this, str})).booleanValue();
        }
        Long l = this.f31498a.get(str);
        if (l == null || System.currentTimeMillis() > l.longValue()) {
            this.f31498a.remove(str);
            return false;
        }
        MsgLog.i("CMD_Limit", "limit:", str);
        return true;
    }

    public boolean d(int i, int i2, String str, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6746e65", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (c(e(i, -1, null, -1, -1)) || c(e(i, i2, null, -1, -1)) || c(e(i, i2, str, -1, -1)) || c(e(i, i2, str, i3, -1)) || c(e(i, i2, str, i3, i4))) {
            return true;
        }
        return false;
    }

    public final String e(int i, int i2, String str, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f967153", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (i2 > 0) {
            sb.append(f7l.PLUS);
            sb.append(i2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(f7l.PLUS);
            sb.append(str);
        }
        if (i3 > 0) {
            sb.append(f7l.PLUS);
            sb.append(i3);
        }
        if (i4 > 0) {
            sb.append(f7l.PLUS);
            sb.append(i4);
        }
        return sb.toString();
    }
}
