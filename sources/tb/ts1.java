package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.managers.MsgManager;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.util.List;
import java.util.Map;
import tb.x9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ts1<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BROKEN_LINE = 3;
    public static final String CONNECTION_CODE = "ConnectionCode";
    public static final String CONNECTION_TYPE = "ConnectionType";
    public static final String TAG = "BaseConnection";

    /* renamed from: a  reason: collision with root package name */
    public int f28920a;
    public int b;
    public f<List<ikl>, T> c;
    public g<h<R>, List<ikl>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements lzx<String, l5y<x9o.a>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28922a;

        public b(ts1 ts1Var, String str) {
            this.f28922a = str;
        }

        /* renamed from: a */
        public l5y<x9o.a> apply(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l5y) ipChange.ipc$dispatch("c9a536a8", new Object[]{this, str});
            }
            return l5y.l(MsgRouter.e().h().a(this.f28922a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vxx<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(ts1 ts1Var) {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            } else {
                MsgLog.g(ts1.TAG, "onReceive error", th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(ts1 ts1Var) {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            if (MsgLog.k(MsgLog.Level.D)) {
                MsgLog.d(ts1.TAG, iklVar);
            }
            M m = iklVar.f21366a;
            if (m instanceof Ack) {
                x9o.a b = MsgRouter.e().h().b(null, iklVar.f21366a.getID());
                if (b != null) {
                    iklVar.n = b.f31238a.n;
                    l5y.m(iklVar).a(b);
                }
                ykm.l().i(iklVar, 99);
                return false;
            } else if (m.type() == 3) {
                l5y.m(iklVar).a(MsgRouter.e().c());
                MsgMonitor.a("MKT", ErrorType.CRASH, 1.0d);
                ykm.l().f(iklVar, 99);
                return false;
            } else {
                DataReceiveMonitor dataReceiveMonitor = iklVar.o;
                if (dataReceiveMonitor != null) {
                    dataReceiveMonitor.upFilterTime = SystemClock.elapsedRealtime();
                }
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements lzx<List<ikl>, l5y<ikl>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f28923a;

        public e(ts1 ts1Var, h hVar) {
            this.f28923a = hVar;
        }

        /* renamed from: a */
        public l5y<ikl> apply(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l5y) ipChange.ipc$dispatch("1378d50f", new Object[]{this, list});
            }
            for (ikl iklVar : list) {
                DataReceiveMonitor dataReceiveMonitor = iklVar.o;
                if (dataReceiveMonitor != null) {
                    dataReceiveMonitor.parseMapTime = SystemClock.elapsedRealtime();
                }
                if (iklVar.f21366a instanceof MessageFrame) {
                    StreamFullLinkMonitor streamFullLinkMonitor = this.f28923a.f;
                    iklVar.p = streamFullLinkMonitor;
                    if (streamFullLinkMonitor != null) {
                        streamFullLinkMonitor.setPmReceivedTime(p70.a());
                    }
                }
            }
            return l5y.l(list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f<T, R> extends i9y<T, R> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g<T, R> extends i9y<T, R> {
        Ack a(int i, Map<String, Object> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h<R> {
        public static final int MSG_FULL_LINK_KEY = 30;
        public static final int MSG_FULL_LINK_KEY_NEW = 0;

        /* renamed from: a  reason: collision with root package name */
        public final String f28924a;
        public final int b;
        public final String c;
        public final R d;
        public long e;
        public StreamFullLinkMonitor f;
        public final Map<Integer, String> g;

        static {
            t2o.a(628097082);
        }

        public h(String str, int i, String str2, R r) {
            this.f28924a = str;
            this.b = i;
            this.c = str2;
            this.d = r;
        }

        public h(String str, int i, String str2, R r, Map<Integer, String> map) {
            this.f28924a = str;
            this.b = i;
            this.c = str2;
            this.d = r;
            this.g = map;
        }
    }

    static {
        t2o.a(628097074);
    }

    public static String d(BaseMessage baseMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a212741", new Object[]{baseMessage, new Boolean(z)});
        }
        String e2 = e(baseMessage.routerId, baseMessage.sysCode, baseMessage.bizCode, baseMessage.header.f18091a);
        if (baseMessage.type != 7 && !z) {
            return e2;
        }
        return e2 + "id:" + baseMessage.getID();
    }

    public static String e(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff0af206", new Object[]{str, new Integer(i), new Integer(i2), str2});
        }
        String str3 = "sys:" + i + "biz:" + i2 + "t:" + str2;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return "ip:" + str + str3;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f9282d4", new Object[]{this})).booleanValue();
        }
        if (this.b < 3) {
            return true;
        }
        return false;
    }

    public f<List<ikl>, T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("86237d1f", new Object[]{this});
        }
        return this.c;
    }

    public g<h<R>, List<ikl>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7ac09413", new Object[]{this});
        }
        return this.d;
    }

    public abstract void h(ikl iklVar);

    public void i(f<List<ikl>, T> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78770e7", new Object[]{this, fVar});
        } else {
            this.c = fVar;
        }
    }

    public void j(g<h<R>, List<ikl>> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf79e5af", new Object[]{this, gVar});
        } else {
            this.d = gVar;
        }
    }

    public abstract int k(int i, String str);

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return this.f28920a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vxx<x9o.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f28921a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        public a(int i, Map map, String str) {
            this.f28921a = i;
            this.b = map;
            this.c = str;
        }

        /* renamed from: a */
        public void accept(x9o.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1800d4a5", new Object[]{this, aVar});
            } else if (aVar != null) {
                Ack ack = new Ack(aVar.f31238a.f21366a);
                ts1 ts1Var = ts1.this;
                int i = this.f28921a;
                Map map = this.b;
                int k = ts1Var.k(i, (String) (map != null ? map.get("re_msg") : null));
                ack.setStatus(k);
                ikl iklVar = new ikl(ack);
                iklVar.c = this.c;
                iklVar.n = aVar.f31238a.n;
                l5y.m(iklVar).a(aVar);
                if (-30000 == k || 1000 == k) {
                    ts1.this.b = 0;
                    MsgMonitor.f("MKT", "MKT_ACCS_RATE");
                    return;
                }
                ts1 ts1Var2 = ts1.this;
                int i2 = ts1Var2.b;
                if (i2 < 3) {
                    ts1Var2.b = i2 + 1;
                }
                MsgMonitor.c("MKT", "MKT_ACCS_RATE", "" + this.f28921a, null);
            }
        }
    }

    public void f(h<R> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b30d2a8", new Object[]{this, hVar});
        } else if (hVar != null && c() != null) {
            a71.b(a71.POINT_PARSE_MESSAGE, "");
            MsgLog.i(TAG, "receive >>>", hVar.c, hVar.f28924a, Integer.valueOf(hVar.b));
            hVar.e = SystemClock.elapsedRealtime();
            l5y.m(hVar).I(gay.a()).z(c()).s(new e(this, hVar)).w(new d(this)).p(new c(this)).a(MsgRouter.e().d());
        } else if (!p2j.g()) {
            MsgLog.g(TAG, "receive >>> receive is null", "type:", Integer.valueOf(this.f28920a), "receive is null?", Boolean.valueOf(hVar == null));
            a71.a(a71.POINT_PARSE_MESSAGE, "", "", "receive is null");
        } else {
            throw new Error("Converter2Msg " + this.f28920a + " not set");
        }
    }

    public void g(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327e61f3", new Object[]{this, str, new Integer(i), map});
            return;
        }
        MsgLog.i(TAG, "type:", Integer.valueOf(this.f28920a), str, "response:", Integer.valueOf(i), "service:", map != null ? map.get("service_id") : null);
        l5y.m(str).I(gay.a()).s(new b(this, str)).K(new a(i, map, str));
        if (map != null) {
            try {
                StreamFullLinkMonitor g2 = MsgManager.g(str);
                if (g2 != null) {
                    if (map.containsKey("accsUpTime")) {
                        g2.setAccsUpTime(Long.parseLong(map.get("accsUpTime") + ""));
                    }
                    if (map.containsKey("send2NetworkStartTime")) {
                        g2.setSend2NetworkStartTime(Long.parseLong(map.get("send2NetworkStartTime") + ""));
                    }
                    if (map.containsKey("send2NetworkEndTime")) {
                        g2.setSend2NetworkEndTime(Long.parseLong(map.get("send2NetworkEndTime") + ""));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
