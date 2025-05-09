package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.managers.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class moq implements MsgRouter.b, MsgRouter.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONF_SEND_SWITCH = "send_switch";
    public static final String CONF_SEND_SWITCH_OPEN = "0";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ikl<BaseMessage>> f24191a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            if (moq.c(moq.this, 303, iklVar) || moq.c(moq.this, 301, iklVar)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            ikl iklVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            M m = iklVar.f21366a;
            if (m instanceof AccsConnInfo) {
                for (a.C0718a aVar : com.taobao.tao.powermsg.managers.a.c()) {
                    if (aVar.f12584a == 2) {
                        try {
                            int parseInt = Integer.parseInt(aVar.j.keyAt(0).split("c:")[0]);
                            aVar.g = true;
                            x4u f = com.taobao.tao.powermsg.managers.a.f(parseInt, aVar.b);
                            if (f == null) {
                                mlm.q(parseInt, aVar.b, aVar.d, aVar.e, aVar.c, aVar.f, null, new Object[0]);
                            } else if (f.a() != null && n8l.e()) {
                                mlm.p(parseInt, aVar.b, aVar.d, aVar.e, aVar.c, aVar.f, null, f.a(), new Object[0]);
                            }
                        } catch (Exception e) {
                            MsgLog.g("Strategy", "buildResponseStrategy err", e);
                        }
                        MsgLog.e("Strategy", "buildResponseStrategy AccsConnInfo:" + aVar);
                    }
                }
            } else if (!(1000 == m.statusCode() || (iklVar2 = (ikl) moq.d(moq.this).remove(iklVar.f21366a.getID())) == null)) {
                MsgLog.g("Strategy", ((BaseMessage) iklVar2.f21366a).getID(), Integer.valueOf(iklVar2.k), "failed retry another connection");
                iklVar2.k = moq.e(iklVar2.k);
                l5y.m(iklVar2).K(MsgRouter.e().g());
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(628097203);
        t2o.a(628097061);
        t2o.a(628097062);
    }

    public static /* synthetic */ void b(moq moqVar, ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3df42a5", new Object[]{moqVar, iklVar});
        } else {
            moqVar.a(iklVar);
        }
    }

    public static /* synthetic */ boolean c(moq moqVar, int i, ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10555121", new Object[]{moqVar, new Integer(i), iklVar})).booleanValue();
        }
        return moqVar.h(i, iklVar);
    }

    public static /* synthetic */ HashMap d(moq moqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e2b4a8c7", new Object[]{moqVar});
        }
        return moqVar.f24191a;
    }

    public static /* synthetic */ int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("158ee0fc", new Object[]{new Integer(i)})).intValue();
        }
        return i(i);
    }

    public static int i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e59fef", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 0;
        }
        return 1;
    }

    public final void a(ikl<BaseMessage> iklVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697f78cd", new Object[]{this, iklVar});
            return;
        }
        BaseMessage baseMessage = iklVar.f21366a;
        int i2 = baseMessage.header.g;
        if (i2 == 402 || i2 == 403 || (i = baseMessage.type) == 2 || i == 1) {
            this.f24191a.put(baseMessage.getID(), iklVar);
            return;
        }
        ts1 c2 = stj.c(iklVar.k);
        if (c2 == null || !c2.a()) {
            MsgLog.i("Strategy", iklVar.f21366a.getID(), Integer.valueOf(iklVar.k), "connection is broken");
            iklVar.k = i(iklVar.k);
        }
    }

    public jzx<ikl> f(jzx<ikl> jzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("f020171d", new Object[]{this, jzxVar});
        }
        return jzxVar.f(new c());
    }

    public jzx<ikl> g(jzx<ikl> jzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("87426c36", new Object[]{this, jzxVar});
        }
        return jzxVar.f(new b()).e(new a());
    }

    public final boolean h(int i, ikl<BaseMessage> iklVar) {
        Ack b2;
        Ack b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b417253a", new Object[]{this, new Integer(i), iklVar})).booleanValue();
        }
        wnb b4 = MsgRouter.e().b().b(i);
        if (!(b4 == null || iklVar == null)) {
            if (i == 301 && (b4 instanceof of2) && (b3 = ((of2) b4).b(iklVar)) != null) {
                iklVar.f21366a = b3;
                iklVar.b = b3.sysCode;
                l5y.m(iklVar).a(MsgRouter.e().c());
                MsgLog.g("Strategy", "addBlackList", iklVar.f21366a.getID());
                return true;
            } else if (i == 303 && (b4 instanceof xog) && (b2 = ((xog) b4).b(iklVar)) != null) {
                iklVar.f21366a = b2;
                iklVar.b = b2.sysCode;
                l5y.m(iklVar).a(MsgRouter.e().c());
                MsgLog.g("Strategy", "flowLimit", iklVar.f21366a.getID());
                return true;
            }
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<ikl, ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public ikl apply(ikl iklVar) {
            xg2 body;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ikl) ipChange.ipc$dispatch("769ce9e1", new Object[]{this, iklVar});
            }
            int i2 = p2j.j;
            if (i2 == 0 || i2 == 1) {
                iklVar.k = i2;
                return iklVar;
            } else if (iklVar.m) {
                iklVar.k = 0;
                return iklVar;
            } else {
                M m = iklVar.f21366a;
                boolean z = ((BaseMessage) m).type == 7;
                if (z) {
                    try {
                        if ((m instanceof Monitor) && (body = ((Monitor) m).getBody()) != null) {
                            if (body.d == 1) {
                                z = false;
                            }
                        }
                    } catch (Throwable th) {
                        MsgLog.f("Strategy", th, "isMonitorByMtop err");
                    }
                }
                BaseMessage baseMessage = (BaseMessage) iklVar.f21366a;
                int i3 = baseMessage.msgType;
                if (i3 == 8 || i3 == 10 || z || (i = baseMessage.header.g) == 405) {
                    iklVar.k = 1;
                } else {
                    int i4 = baseMessage.type;
                    if (i4 == 6 || i == 402 || i == 403 || i4 == 2 || i4 == 1) {
                        iklVar.k = 0;
                    }
                    if ("0".equals(jg4.c(moq.CONF_SEND_SWITCH, "0"))) {
                        moq.b(moq.this, iklVar);
                    }
                }
                MsgLog.e("Strategy", ((BaseMessage) iklVar.f21366a).getID(), Integer.valueOf(((BaseMessage) iklVar.f21366a).type()), Integer.valueOf(((BaseMessage) iklVar.f21366a).subType()), "connection use", Integer.valueOf(iklVar.k));
                return iklVar;
            }
        }
    }
}
