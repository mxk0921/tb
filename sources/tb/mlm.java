package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.PowerMsgServiceImpl;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static rbd f24122a;

    static {
        t2o.a(628097225);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[0]);
        } else if (!p2j.h()) {
            MsgMonitor.a("MKT", "c_pipe_init", 1.0d);
            MsgLog.g("PowerMsgService", "not inited success");
        }
    }

    public static void b(int i, String str, Map<String, Double> map, boolean z, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f580588", new Object[]{new Integer(i), str, map, new Boolean(z), ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "countValue bizCode=" + i + " topic=" + str);
        c().countValue(i, str, map, z, ibdVar, objArr);
    }

    public static synchronized rbd c() {
        rbd rbdVar;
        synchronized (mlm.class) {
            a();
            if (f24122a == null) {
                try {
                    IpChange ipChange = PowerMsgServiceImpl.$ipChange;
                    f24122a = (rbd) PowerMsgServiceImpl.class.newInstance();
                } catch (Exception e) {
                    MsgLog.g("PowerMsgService", "IPowerMsgService getImpl failed = " + e.getMessage());
                    e.printStackTrace();
                }
            }
            rbdVar = f24122a;
            if (rbdVar == null) {
                throw new RuntimeException("IPowerMsgService is null");
            }
        }
        return rbdVar;
    }

    public static kbd d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kbd) ipChange.ipc$dispatch("e087bb9c", new Object[]{new Integer(i), str});
        }
        return c().getStableDispatcher(e(i, str));
    }

    public static String e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e533a8", new Object[]{new Integer(i), str});
        }
        return i + "_" + str;
    }

    public static void p(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23553a", new Object[]{new Integer(i), str, str2, str3, str4, str5, ibdVar, sjlVar, objArr});
        } else {
            c().subscribe(i, str, str2, str3, str4, str5, ibdVar, sjlVar, objArr);
        }
    }

    public static void r(int i, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fc75a1", new Object[]{new Integer(i), str, str2, str3, str4, ibdVar, objArr});
        } else {
            c().subscribe(i, str, str2, str3, str4, ibdVar, objArr);
        }
    }

    public static void s(int i, String str, String str2, String str3, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6202752b", new Object[]{new Integer(i), str, str2, str3, ibdVar, objArr});
        } else {
            c().subscribe(i, str, str2, null, str3, ibdVar, objArr);
        }
    }

    public static void u(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd4f33", new Object[]{new Integer(i), str, str2, str3, str4, str5, ibdVar, sjlVar, objArr});
        } else {
            c().unSubscribe(i, str, str2, str3, str4, str5, ibdVar, sjlVar, objArr);
        }
    }

    public static void v(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a141a7e", new Object[]{new Integer(i), str, str2, str3, str4, str5, ibdVar, objArr});
        } else {
            c().unSubscribe(i, str, str2, str3, str4, str5, ibdVar, objArr);
        }
    }

    public static void w(int i, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ad8748", new Object[]{new Integer(i), str, str2, str3, str4, ibdVar, objArr});
        } else {
            c().unSubscribe(i, str, str2, str3, str4, ibdVar, objArr);
        }
    }

    public static void x(int i, String str, String str2, String str3, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8b7292", new Object[]{new Integer(i), str, str2, str3, ibdVar, objArr});
        } else {
            c().unSubscribe(i, str, str2, null, str3, ibdVar, objArr);
        }
    }

    public static boolean f(int i, String str, sjl sjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a514315a", new Object[]{new Integer(i), str, sjlVar})).booleanValue();
        }
        MsgLog.g("PowerMsgService", "queryMessagesByStream ");
        return c().queryMessagesByStream(i, str, sjlVar);
    }

    public static int g(int i, String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a29c1063", new Object[]{new Integer(i), str, kbdVar})).intValue();
        }
        MsgLog.g("PowerMsgService", "registerDispatcher bizCode=" + i + " sub=" + str + " msgDispatcher=" + kbdVar);
        return c().registerDispatcher(i, str, kbdVar);
    }

    public static int h(int i, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c07019", new Object[]{new Integer(i), kbdVar})).intValue();
        }
        MsgLog.g("PowerMsgService", "registerDispatcher bizCode=" + i + " msgDispatcher=" + kbdVar);
        return c().registerDispatcher(i, null, kbdVar);
    }

    public static void i(int i, String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09f0635", new Object[]{new Integer(i), str, kbdVar});
            return;
        }
        MsgLog.g("PowerMsgService", "registerStableDispatcher bizCode=" + i + " msgDispatcher=" + kbdVar);
        c().registerStableDispatcher(e(i, str), kbdVar);
    }

    @Deprecated
    public static void j(int i, PowerMessage powerMessage, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b301645d", new Object[]{new Integer(i), powerMessage, new Integer(i2)});
            return;
        }
        MsgLog.g("PowerMsgService", "report " + PowerMessage.safeToString(powerMessage));
        c().report(i, powerMessage, i2);
    }

    public static void k(int i, PowerMessage powerMessage, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998375aa", new Object[]{new Integer(i), powerMessage, ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "sendMessage " + PowerMessage.safeToString(powerMessage));
        c().sendMessage(i, powerMessage, ibdVar, objArr);
    }

    public static void l(int i, String str, int i2, int i3, int i4, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af477c77", new Object[]{new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "sendRequest bizCode=" + i + " topic=" + str + " type=" + i2 + " index=" + i3 + " pageSize=" + i4);
        c().sendRequest(i, str, i2, i3, i4, ibdVar, objArr);
    }

    public static void m(int i, PowerMessage powerMessage, sjl sjlVar, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b567543b", new Object[]{new Integer(i), powerMessage, sjlVar, ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "sendStreamMessage " + powerMessage.bizCode + "|" + powerMessage.topic);
        c().sendStreamMessage(i, powerMessage, sjlVar, ibdVar, objArr);
    }

    public static void n(int i, TextPowerMessage textPowerMessage, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cd04c1", new Object[]{new Integer(i), textPowerMessage, ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "sendText " + PowerMessage.safeToString(textPowerMessage));
        c().sendText(i, textPowerMessage, ibdVar, objArr);
    }

    public static void o(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{new Integer(i), str, new Integer(i2)});
            return;
        }
        MsgLog.g("PowerMsgService", "setMsgFetchMode bizCode=" + i + " topic=" + str + " type=" + i2);
        c().setMsgFetchMode(i, str, i2);
    }

    public static void t(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f1ba8", new Object[]{new Integer(i), str});
            return;
        }
        MsgLog.g("PowerMsgService", "unRegisterStableDispatcher bizCode=" + i);
        c().unRegisterStableDispatcher(e(i, str));
    }

    public static void q(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fff8497", new Object[]{new Integer(i), str, str2, str3, str4, str5, ibdVar, objArr});
            return;
        }
        MsgLog.g("PowerMsgService", "subscribe bizCode=" + i + " topic=" + str + " channel=" + str2 + " from=" + str3 + " bizTag" + str4 + " ext=" + str5);
        c().subscribe(i, str, str2, str3, str4, str5, ibdVar, objArr);
    }
}
