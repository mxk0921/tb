package tb;

import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.kit.util.MsgMonitor;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ykm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ykm d = new ykm();

    /* renamed from: a  reason: collision with root package name */
    public boolean f32151a = true;
    public final Map<String, Map<String, Object>> b = Collections.synchronizedMap(new HashMap());
    public int c = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zkm f32152a;
        public final /* synthetic */ long b;

        public a(zkm zkmVar, long j) {
            this.f32152a = zkmVar;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ykm.a(ykm.this, this.f32152a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vxx<Long> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32153a;

        public b(String str) {
            this.f32153a = str;
        }

        /* renamed from: a */
        public void accept(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4e4afce", new Object[]{this, l});
            } else if (ykm.b(ykm.this).remove(this.f32153a) != null) {
                MsgLog.g("PowerMsgFullLinkMgr", "has object key=" + this.f32153a);
                MsgMonitor.commitCount("MKT", "c_full_link_cache_ERR", 1.0d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vxx<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(ykm ykmVar) {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
                return;
            }
            MsgLog.g("PowerMsgFullLinkMgr", "has object throwable=" + Log.getStackTraceString(th));
        }
    }

    static {
        t2o.a(628097100);
    }

    public static /* synthetic */ void a(ykm ykmVar, zkm zkmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db521c0", new Object[]{ykmVar, zkmVar, new Long(j)});
        } else {
            ykmVar.c(zkmVar, j);
        }
    }

    public static /* synthetic */ Map b(ykm ykmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a944fde", new Object[]{ykmVar});
        }
        return ykmVar.b;
    }

    public static ykm l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ykm) ipChange.ipc$dispatch("d5545723", new Object[0]);
        }
        return d;
    }

    public final boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d73bfc15", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (jg4.a("debug_full_link", 1) == 1 || i == 1 || i == 70 || i == 99 || i >= 100) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b88747b6", new Object[]{this})).booleanValue();
        }
        if (this.c == -1) {
            this.c = jg4.a("enable_full_link", 1);
            MsgLog.g("PowerMsgFullLinkMgr", "enableFullLink=" + this.c);
        }
        if (this.c == 0) {
            return false;
        }
        if (this.f32151a) {
            return true;
        }
        MsgLog.g("PowerMsgFullLinkMgr", "commitMsgFullLink hasFullLink= false");
        return false;
    }

    public void f(ikl iklVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dca940a", new Object[]{this, iklVar, new Integer(i)});
        } else {
            g(iklVar, i, 1000);
        }
    }

    public void i(ikl iklVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9902bf28", new Object[]{this, iklVar, new Integer(i)});
        } else {
            g(iklVar, i, 2000);
        }
    }

    public final String k(zkm zkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b0d2621", new Object[]{this, zkmVar});
        }
        return zkmVar.e + zkmVar.d + zkmVar.c;
    }

    public final boolean m(zkm zkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca38c5fc", new Object[]{this, zkmVar})).booleanValue();
        }
        return this.b.containsKey(k(zkmVar));
    }

    public final Map<String, Object> n(zkm zkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4888e142", new Object[]{this, zkmVar});
        }
        String k = k(zkmVar);
        Map<String, Object> map = this.b.get(k);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.b.put(k, hashMap);
        l5y.h(10L, TimeUnit.SECONDS).b(new b(k), new c(this));
        return hashMap;
    }

    public final Map<String, Object> o(zkm zkmVar) {
        Object remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            remove = ipChange.ipc$dispatch("6d238e03", new Object[]{this, zkmVar});
        } else {
            remove = this.b.remove(k(zkmVar));
        }
        return (Map) remove;
    }

    public final void j(zkm zkmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3063222", new Object[]{this, zkmVar, new Boolean(z)});
            return;
        }
        try {
            int i = zkmVar.b;
            if (i <= 1 || i >= 99) {
                zjl.b().execute(new a(zkmVar, SystemClock.elapsedRealtime()));
                return;
            }
            MsgLog.e("PowerMsgFullLinkMgr", "skip step: " + i);
        } catch (Throwable th) {
            MsgLog.f("PowerMsgFullLinkMgr", th, "fullLinkMonitor exception");
        }
    }

    public final void g(ikl iklVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886039", new Object[]{this, iklVar, new Integer(i), new Integer(i2)});
        } else if (e()) {
            if (iklVar == null || iklVar.f21366a == 0) {
                MsgLog.g("PowerMsgFullLinkMgr", "commitMsgFullLink illegal param p=" + iklVar);
                if (iklVar != null) {
                    MsgLog.g("PowerMsgFullLinkMgr", "commitMsgFullLink illegal param =" + iklVar.toString());
                }
            } else if (iklVar.q == 1) {
                zkm zkmVar = new zkm();
                zkmVar.b = i;
                zkmVar.e = iklVar.f21366a.getID();
                zkmVar.f32839a = i2;
                M m = iklVar.f21366a;
                if (m instanceof BaseMessage) {
                    try {
                        BaseMessage baseMessage = (BaseMessage) m;
                        zkmVar.h = baseMessage.type;
                        zkmVar.i = baseMessage.bizCode;
                        dva dvaVar = baseMessage.header;
                        zkmVar.f = Long.parseLong(dvaVar.n.get(RemoteMessageConst.SEND_TIME));
                        zkmVar.g = dvaVar.f18091a;
                    } catch (Exception e) {
                        MsgLog.f("PowerMsgFullLinkMgr", e, "fullLinkParam header err");
                    }
                }
                zkmVar.d = iklVar.d == 2 ? 200 : 100;
                h(zkmVar);
            }
        }
    }

    public void h(zkm zkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677dd894", new Object[]{this, zkmVar});
        } else if (e() && !d(zkmVar.b)) {
            MsgLog.g("PowerMsgFullLinkMgr", "commitMsgFullLink, msgid:", zkmVar.e, "stepid:", Integer.valueOf(zkmVar.b));
            try {
                int i = zkmVar.b;
                if (!(i == 1 || i == 101 || i == 99)) {
                    if (!m(zkmVar)) {
                        MsgLog.g("PowerMsgFullLinkMgr", "not have context param=" + zkmVar.toString());
                        MsgMonitor.commitCount("MKT", "c_full_link_ERR", 1.0d);
                        return;
                    }
                    j(zkmVar, false);
                    int i2 = zkmVar.b;
                    if (i2 == 99 || i2 == 199 || zkmVar.f32839a != 1000) {
                        o(zkmVar);
                        return;
                    }
                    return;
                }
                j(zkmVar, true);
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    this.f32151a = false;
                }
                MsgLog.g("PowerMsgFullLinkMgr", "commitMsgFullLink exception=" + th.getMessage());
            }
        }
    }

    public final void c(zkm zkmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7aa0fbb", new Object[]{this, zkmVar, new Long(j)});
            return;
        }
        try {
            int i = zkmVar.b;
            n(zkmVar);
            Monitor create = Monitor.create();
            xg2 body = create.getBody();
            body.d = 1;
            body.e = 0;
            body.c = 2;
            body.g = new qg2();
            tg2 tg2Var = new tg2();
            if (zkmVar.h == 5) {
                body.g.b = r8;
                tg2[] tg2VarArr = {tg2Var};
            } else {
                body.g.f26735a = r8;
                tg2[] tg2VarArr2 = {tg2Var};
            }
            eh2 eh2Var = new eh2();
            String str = zkmVar.g;
            eh2Var.b = str == null ? "" : str;
            eh2Var.f18574a = zkmVar.i;
            eh2Var.g = com.taobao.tao.powermsg.managers.a.j(str) ? 1 : 2;
            tg2Var.f28699a = eh2Var;
            ug2 ug2Var = new ug2();
            tg2Var.b = r8;
            ug2[] ug2VarArr = {ug2Var};
            ug2Var.f29353a = zkmVar.e;
            ug2Var.f = true;
            ug2Var.h = 1;
            ug2Var.i = i + "";
            long a2 = p70.a();
            ug2Var.d = a2;
            int i2 = (int) (a2 - zkmVar.f);
            ug2Var.e = i2;
            MsgLog.g("PowerMsgFullLinkMgr", "fullLinkMonitor >", "oriMsgId", zkmVar.e, "accsMsgId", create.header.f, "delay", Integer.valueOf(i2));
            ikl iklVar = new ikl(create);
            iklVar.k = 0;
            byte[] protocol = ((Monitor) iklVar.f21366a).toProtocol();
            M m = iklVar.f21366a;
            AccsConnection.DataPackage dataPackage = new AccsConnection.DataPackage(((Monitor) m).routerId, iklVar.b, ((Monitor) m).header.f18091a);
            dataPackage.a(iklVar);
            dataPackage.e().write(protocol);
            ((AccsConnection) stj.c(iklVar.k)).n(dataPackage);
            MsgLog.g("PowerMsgFullLinkMgr", "sendAccsData", create.header.f);
        } catch (Exception e) {
            MsgLog.f("PowerMsgFullLinkMgr", e, "accsMonitor err");
            a71.c(a71.POINT_ACCS_EXCEPTION, e.toString(), vu3.b.GEO_NOT_SUPPORT);
        }
    }
}
