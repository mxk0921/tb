package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.PowerMsgServiceImpl;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.managers.a;
import com.taobao.tao.powermsg.model.Message;
import com.taobao.tao.powermsg.model.P2P;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097208);
    }

    public static PowerMessage b(BaseMessage baseMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("9217840", new Object[]{baseMessage});
        }
        PowerMessage powerMessage = new PowerMessage();
        if (baseMessage instanceof Message) {
            int i = baseMessage.header.g;
            if (i == 101) {
                powerMessage = new TextPowerMessage();
            } else if (i == 102) {
                powerMessage = new CountPowerMessage();
            } else if (i == 103) {
                powerMessage = new xuf();
            }
            Message message = (Message) baseMessage;
            yg2 yg2Var = message.body;
            powerMessage.from = yg2Var.f32068a;
            powerMessage.to = yg2Var.b;
            powerMessage.timestamp = yg2Var.c;
            powerMessage.tags = yg2Var.e;
            powerMessage.sendFullTags = yg2Var.d;
            powerMessage.data = message.content;
        } else if (baseMessage instanceof P2P) {
            powerMessage.data = ((P2P) baseMessage).content;
        }
        dva dvaVar = baseMessage.header;
        powerMessage.type = dvaVar.g;
        powerMessage.bizCode = baseMessage.bizCode;
        powerMessage.topic = dvaVar.f18091a;
        powerMessage.userId = dvaVar.h;
        powerMessage.qosLevel = baseMessage.qosLevel;
        powerMessage.needAck = baseMessage.needACK;
        powerMessage.priority = dvaVar.b;
        powerMessage.messageId = dvaVar.f;
        powerMessage.fromData();
        return powerMessage;
    }

    public static String c(BaseMessage baseMessage) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d108ff2d", new Object[]{baseMessage});
        }
        if (!(baseMessage instanceof Message) || (strArr = ((Message) baseMessage).body.e) == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("791e1b91", new Object[0])).longValue();
        }
        int a2 = jg4.a(MonitorManager.CONF_DEFAULT_TIME, 2);
        if (a2 < 0) {
            return -1L;
        }
        return a2 * 1000;
    }

    public static PowerMsgServiceImpl e() {
        Object c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            c = ipChange.ipc$dispatch("54cefad7", new Object[0]);
        } else {
            c = mlm.c();
        }
        return (PowerMsgServiceImpl) c;
    }

    public static void f(String str, int i, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3b2acb", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), str2});
        } else {
            g(str, i, i2, i3, str2, d());
        }
    }

    public static void g(String str, int i, int i2, int i3, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2aa559", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), str2, new Long(j)});
            return;
        }
        l2o l2oVar = new l2o(str, i, 0, null, null, i2, 0);
        l2oVar.f = i3;
        l2oVar.h = str2;
        MonitorManager.l(l2oVar, j, false);
    }

    public static void h(ikl<BaseMessage> iklVar, int i) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c3d30c", new Object[]{iklVar, new Integer(i)});
            return;
        }
        int i2 = iklVar.f21366a.header.j;
        if (i2 != -2) {
            if (i2 == 0) {
                i(iklVar, i, d(), false);
                return;
            }
            if (i2 < 0) {
                j = -1;
            } else {
                j = i2 * 1000;
            }
            i(iklVar, i, j, true);
        }
    }

    public static void i(ikl<BaseMessage> iklVar, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22a549c", new Object[]{iklVar, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        String a2 = MonitorManager.a(iklVar.c, iklVar.f21366a.header.f);
        BaseMessage baseMessage = iklVar.f21366a;
        int i2 = baseMessage.bizCode;
        String str = baseMessage.header.f18091a;
        String c = c(baseMessage);
        BaseMessage baseMessage2 = iklVar.f21366a;
        l2o l2oVar = new l2o(a2, 1, i2, str, c, i, a.d(baseMessage2.header.f18091a, c(baseMessage2)).first.intValue());
        l2oVar.f = iklVar.d;
        l2oVar.h = MonitorManager.e(iklVar.e, iklVar.i);
        BaseMessage baseMessage3 = iklVar.f21366a;
        if (baseMessage3 instanceof Message) {
            l2oVar.l = ((Message) baseMessage3).body.c;
        }
        if (z) {
            l2oVar.m = 1;
        }
        MonitorManager.l(l2oVar, j, z);
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8792783b", new Object[]{str});
        }
        return "_default";
    }

    public static boolean k(List<svc> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf4fe9", new Object[]{list, new Long(j)})).booleanValue();
        }
        if (jg4.a("monitor_range_open", 1) == 0) {
            return false;
        }
        long b = jg4.b("monitor_range_mod", 10000L);
        long j2 = p2j.f;
        long j3 = j2 % b;
        MsgLog.e("Utils", Long.valueOf(j2), " report condition >>", Long.valueOf(j3));
        if (jg4.b("monitor_range_left", -10000L) > j3 || j3 > jg4.b("monitor_range_right", 10000L)) {
            return false;
        }
        return true;
    }

    public static BaseMessage l(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMessage) ipChange.ipc$dispatch("f1d9496a", new Object[]{powerMessage});
        }
        powerMessage.toData();
        Message create = Message.create();
        create.bizCode = powerMessage.bizCode;
        create.content = powerMessage.data;
        create.sysCode = 1;
        create.needACK = powerMessage.needAck;
        if (!TextUtils.isEmpty(powerMessage.topic)) {
            create.header.f18091a = powerMessage.topic;
        }
        create.header.g = powerMessage.type;
        if (!TextUtils.isEmpty(powerMessage.from)) {
            create.body.f32068a = powerMessage.from;
        }
        if (!TextUtils.isEmpty(powerMessage.to)) {
            create.body.b = powerMessage.to;
        }
        yg2 yg2Var = create.body;
        yg2Var.c = powerMessage.timestamp;
        create.qosLevel = (byte) powerMessage.qosLevel;
        yg2Var.d = powerMessage.sendFullTags;
        String[] strArr = powerMessage.tags;
        if (strArr != null) {
            yg2Var.e = strArr;
        }
        create.content = powerMessage.data;
        return create;
    }

    public static void a(String str, PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbe405d", new Object[]{str, powerMessage});
            return;
        }
        Integer valueOf = Integer.valueOf(powerMessage.bizCode);
        String str2 = powerMessage.topic;
        Integer valueOf2 = Integer.valueOf(powerMessage.type);
        Boolean valueOf3 = Boolean.valueOf(powerMessage.needAck);
        String str3 = powerMessage.from;
        String str4 = powerMessage.to;
        Long valueOf4 = Long.valueOf(powerMessage.timestamp);
        String str5 = powerMessage.userId;
        Integer valueOf5 = Integer.valueOf(powerMessage.qosLevel);
        Boolean valueOf6 = Boolean.valueOf(powerMessage.sendFullTags);
        String arrays = Arrays.toString(powerMessage.tags);
        byte[] bArr = powerMessage.data;
        MsgLog.c(str, null, "msg:", valueOf, "topic:", str2, "type:", valueOf2, "ack:", valueOf3, "from:", str3, "to:", str4, "timestamp:", valueOf4, "usr", str5, "qos", valueOf5, "sendFullTags", valueOf6, "tags", arrays, "data", Integer.valueOf(bArr != null ? bArr.length : 0));
    }
}
