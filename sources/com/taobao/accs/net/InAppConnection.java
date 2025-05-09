package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.CustomDataFrameCb;
import anet.channel.IAuth;
import anet.channel.ISessionListener;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.MessageHandler;
import com.taobao.accs.init.Launcher_InitAgooLifecycle;
import com.taobao.accs.internal.ACCSRestartService;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.ut.monitor.AccsForegroundMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.brt;
import tb.bxf;
import tb.c71;
import tb.d2r;
import tb.gva;
import tb.h1p;
import tb.h5d;
import tb.hkq;
import tb.j8l;
import tb.l70;
import tb.lef;
import tb.m8l;
import tb.mh1;
import tb.o2j;
import tb.r5q;
import tb.t2o;
import tb.vu3;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InAppConnection extends BaseConnection implements CustomDataFrameCb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean I;
    public static volatile long J = 0;
    public static final Map<String, String> K = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.net.InAppConnection.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/net/InAppConnection$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > 200) {
                return true;
            }
            return false;
        }
    };
    public static i L;
    public byte[] E;
    public final Runnable F;
    public ScheduledFuture x;
    public r5q y;
    public int z;
    public String u = "InAppConn_";
    public boolean v = true;
    public long w = 3600000;
    public volatile boolean A = true;
    public final Runnable B = new Runnable() { // from class: tb.jse
        @Override // java.lang.Runnable
        public final void run() {
            InAppConnection.this.s0();
        }
    };
    public Boolean C = null;
    public final ISessionListener D = new a();
    public final Set<String> G = Collections.synchronizedSet(new HashSet());
    public final IHeartbeat H = new h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Message f6082a;

        public c(Message message) {
            this.f6082a = message;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1099
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.InAppConnection.c.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6083a;
        public final /* synthetic */ boolean b;

        public d(String str, boolean z) {
            this.f6083a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Message g = InAppConnection.this.e.g(this.f6083a);
            if (g != null) {
                InAppConnection.this.e.t(g, -9);
                InAppConnection.this.B(this.f6083a, this.b, "receive data time out");
                String o = InAppConnection.this.o();
                ALog.e(o, this.f6083a + "-> receive data time out!", new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6084a;
        public final /* synthetic */ int b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ TnetSpdySession d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Map f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements k {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cfdd5af7", new Object[]{this, bArr});
                    return;
                }
                try {
                    e eVar = e.this;
                    MessageHandler messageHandler = InAppConnection.this.e;
                    String host = eVar.d.getHost();
                    e eVar2 = e.this;
                    messageHandler.s(bArr, host, eVar2.e, eVar2.f);
                } catch (Throwable th) {
                    ALog.e(InAppConnection.this.o(), "onDataScheduled2 err", th, new Object[0]);
                    c71.c("accs", BaseMonitor.COUNT_VERIFY, "onDataScheduled2", vu3.b.GEO_NOT_SUPPORT);
                }
            }
        }

        public e(int i, int i2, byte[] bArr, TnetSpdySession tnetSpdySession, long j, Map map) {
            this.f6084a = i;
            this.b = i2;
            this.c = bArr;
            this.d = tnetSpdySession;
            this.e = j;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.e(InAppConnection.this.o(), "onDataScheduled", "dataid", Integer.valueOf(this.f6084a), "frameType", Integer.valueOf(this.b));
            if (this.b == 200 || (InAppConnection.this.w() && this.b == 202)) {
                try {
                    InAppConnection.this.e.s(this.c, this.d.getHost(), this.e, this.f);
                } catch (Throwable th) {
                    ALog.e(InAppConnection.this.o(), "onDataScheduled err", th, new Object[0]);
                }
            } else if (!InAppConnection.this.w() || this.b != 201) {
                String o = InAppConnection.this.o();
                ALog.e(o, "drop frame len:" + this.c.length + " frameType" + this.b, new Object[0]);
            } else {
                InAppConnection.a0(InAppConnection.this, this.c, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6086a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        public f(int i, boolean z, int i2) {
            this.f6086a = i;
            this.b = z;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message.Id id;
            Message D;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f6086a > 0) {
                Message.Id id2 = new Message.Id(this.f6086a, "");
                Iterator<Message.Id> it = InAppConnection.this.e.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        id = null;
                        break;
                    }
                    id = it.next();
                    if (id.equals(id2)) {
                        break;
                    }
                }
                if (!(id == null || (D = InAppConnection.this.e.D(id.getDataId())) == null)) {
                    if (this.b) {
                        if (!InAppConnection.this.E(D, 2000)) {
                            InAppConnection.this.e.t(D, this.c);
                        }
                        if (D.getNetPermanceMonitor() != null) {
                            c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", vu3.b.GEO_NOT_SUPPORT);
                        }
                    } else {
                        InAppConnection.this.e.t(D, this.c);
                    }
                }
            }
            int i = this.f6086a;
            if (i < 0 && this.b) {
                InAppConnection.this.F(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                InAppConnection inAppConnection = InAppConnection.this;
                if (inAppConnection.d != null && !TextUtils.isEmpty(inAppConnection.i())) {
                    ALog.i(InAppConnection.this.o(), "mTryStartServiceRunable bindapp", new Object[0]);
                    InAppConnection.this.Q();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements IHeartbeat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // anet.channel.heartbeat.IHeartbeat
        public void reSchedule() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            }
        }

        @Override // anet.channel.heartbeat.IHeartbeat
        public void start(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
            } else if (InAppConnection.m0(InAppConnection.this) != null) {
                InAppConnection.m0(InAppConnection.this).start(session);
            }
        }

        @Override // anet.channel.heartbeat.IHeartbeat
        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else if (InAppConnection.m0(InAppConnection.this) != null) {
                InAppConnection.m0(InAppConnection.this).stop();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j implements IAuth {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6090a;
        public final String b;
        public final InAppConnection c;
        public final String d;

        static {
            t2o.a(343933170);
            t2o.a(607125518);
        }

        public j(InAppConnection inAppConnection, String str) {
            this.b = inAppConnection.o();
            this.c = inAppConnection;
            this.d = str;
        }

        public static /* synthetic */ String a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("eb1acc18", new Object[]{jVar});
            }
            return jVar.b;
        }

        public static /* synthetic */ InAppConnection b(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InAppConnection) ipChange.ipc$dispatch("f074421c", new Object[]{jVar});
            }
            return jVar.c;
        }

        public static /* synthetic */ void c(j jVar, Session session, IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c80d40", new Object[]{jVar, session, authCallback});
            } else {
                jVar.e(session, authCallback);
            }
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6ac6fb", new Object[]{this, session, authCallback});
                return;
            }
            d(session);
            if (j8l.x(this.c.d)) {
                InAppConnection inAppConnection = this.c;
                session.request(new Request.Builder().setUrl(inAppConnection.d(h1p.HTTPS_PREFIX + this.d + "/")).build(), new a(session, authCallback));
                return;
            }
            c71.c("accs", BaseMonitor.COUNT_POINT_REGID_DISABLE, "regId disable", vu3.b.GEO_NOT_SUPPORT);
            e(session, authCallback);
        }

        public final void d(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("686b1786", new Object[]{this, session});
                return;
            }
            try {
                if (InAppConnection.c0() == null) {
                    InAppConnection.d0(new i());
                    InAppConnection.c0().a(this.c);
                }
                session.registerEventcb(3456, InAppConnection.c0());
            } catch (Exception e) {
                ALog.e(this.b, "registerSessionEvent err", e, new Object[0]);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements RequestCb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Session f6091a;
            public final /* synthetic */ IAuth.AuthCallback b;

            public a(Session session, IAuth.AuthCallback authCallback) {
                this.f6091a = session;
                this.b = authCallback;
            }

            @Override // anet.channel.RequestCb
            public void onDataReceive(ByteArray byteArray, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                }
            }

            @Override // anet.channel.RequestCb
            public void onFinish(int i, String str, RequestStatistic requestStatistic) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[Catch: all -> 0x0060, Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:8:0x003a, B:10:0x004c, B:16:0x0066, B:18:0x006c, B:19:0x007a, B:22:0x0082, B:31:0x00a2), top: B:40:0x003a, outer: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
            @Override // anet.channel.RequestCb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onResponseCode(int r8, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9) {
                /*
                    Method dump skipped, instructions count: 227
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.InAppConnection.j.a.onResponseCode(int, java.util.Map):void");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements RequestCb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IAuth.AuthCallback f6092a;
            public final /* synthetic */ int b;
            public final /* synthetic */ long c;

            public b(IAuth.AuthCallback authCallback, int i, long j) {
                this.f6092a = authCallback;
                this.b = i;
                this.c = j;
            }

            @Override // anet.channel.RequestCb
            public void onDataReceive(ByteArray byteArray, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                }
            }

            @Override // anet.channel.RequestCb
            public void onFinish(int i, String str, RequestStatistic requestStatistic) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                } else if (i < 0) {
                    ALog.e(j.a(j.this), "auth onFinish", "statusCode", Integer.valueOf(i));
                    this.f6092a.onAuthFail(i, "onFinish auth fail");
                }
            }

            @Override // anet.channel.RequestCb
            public void onResponseCode(int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    return;
                }
                if (i == 200) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (j.b(j.this).v()) {
                        c71.c("accs", BaseMonitor.COUNT_FAKE_CONN, "auth", vu3.b.GEO_NOT_SUPPORT);
                    }
                    this.f6092a.onAuthSuccess();
                    if (j8l.u() && BaseConnection.t == 0) {
                        if (this.b == BaseConnection.t) {
                            j.b(j.this).N(true);
                        }
                        ALog.e(j.a(j.this), "sendServerPingSignal after auth", new Object[0]);
                        InAppConnection.m0(j.b(j.this)).A(true);
                    }
                    InAppConnection.b0(j.b(j.this));
                    try {
                        long parseLong = Long.parseLong(map.get("x-auth-time").get(0)) - ((this.c + elapsedRealtime) / 2);
                        long abs = Math.abs(parseLong - BaseConnection.s);
                        ALog.e(j.a(j.this), "time sync", "deltaTime", Long.valueOf(parseLong), "timeDiff", Long.valueOf(abs), "authSpentTime", Long.valueOf(elapsedRealtime - this.c));
                        c71.c("accs", "delta_time", "", abs);
                        BaseConnection.s = parseLong;
                    } catch (Exception e) {
                        ALog.e(j.a(j.this), "parse aserver date err", e, new Object[0]);
                    }
                } else {
                    this.f6092a.onAuthFail(i, "auth fail");
                }
                Map<String, String> header = UtilityImpl.getHeader(map);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(j.a(j.this), "auth", "header", header);
                }
                String str = header.get("x-at");
                if (!TextUtils.isEmpty(str)) {
                    j.b(j.this).k = str;
                }
                j.b(j.this).l = header.get("x-gw-unit");
                ALog.e(j.a(j.this), "aserver info", TBImageFlowMonitor.VIA, header.get(TBImageFlowMonitor.VIA), mh1.PRICE_UNIT, j.b(j.this).l);
            }
        }

        public final void e(Session session, IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbad47e", new Object[]{this, session, authCallback});
            } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.c.r)) {
                if (session != null) {
                    session.close();
                }
                ALog.e(this.b, "current process is not allowed to startAuthRequest", new Object[0]);
            } else {
                this.c.P();
                InAppConnection inAppConnection = this.c;
                this.f6090a = inAppConnection.c(h1p.HTTPS_PREFIX + this.d + "/accs/");
                ALog.e(this.b, "auth", "utdid", UtilityImpl.getDeviceId(this.c.d), "hash", Integer.valueOf(hashCode()), MonitorItemConstants.KEY_URL, this.f6090a);
                session.request(new Request.Builder().setUrl(this.f6090a).build(), new b(authCallback, BaseConnection.t, SystemClock.elapsedRealtime()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
    }

    static {
        t2o.a(343933158);
        t2o.a(607125512);
        t2o.a(343933157);
    }

    public InAppConnection(Context context, int i2, String str, int i3) {
        super(context, i2, str);
        g gVar = new g();
        r0(str);
        M(i3);
        brt.h().schedule(gVar, 120000L, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void Y(InAppConnection inAppConnection, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6608c8", new Object[]{inAppConnection, new Boolean(z)});
        } else {
            inAppConnection.o0(z);
        }
    }

    public static /* synthetic */ void Z(InAppConnection inAppConnection, Context context, String str, boolean z, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbcf700", new Object[]{inAppConnection, context, str, new Boolean(z), new Integer(i2), str2});
        } else {
            inAppConnection.E0(context, str, z, i2, str2);
        }
    }

    public static /* synthetic */ void a0(InAppConnection inAppConnection, byte[] bArr, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a6e27", new Object[]{inAppConnection, bArr, kVar});
        } else {
            inAppConnection.q0(bArr, kVar);
        }
    }

    public static /* synthetic */ void b0(InAppConnection inAppConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a5b539", new Object[]{inAppConnection});
        } else {
            inAppConnection.G0();
        }
    }

    public static /* synthetic */ i c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("58f588db", new Object[0]);
        }
        return L;
    }

    public static /* synthetic */ i d0(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("4682df63", new Object[]{iVar});
        }
        L = iVar;
        return iVar;
    }

    public static /* synthetic */ void e0(InAppConnection inAppConnection, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dbe5d6", new Object[]{inAppConnection, context, new Boolean(z)});
        } else {
            inAppConnection.x0(context, z);
        }
    }

    public static /* synthetic */ boolean f0(InAppConnection inAppConnection, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64cb2dd1", new Object[]{inAppConnection, new Boolean(z)})).booleanValue();
        }
        inAppConnection.A = z;
        return z;
    }

    public static /* synthetic */ Boolean g0(InAppConnection inAppConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b2eda085", new Object[]{inAppConnection});
        }
        return inAppConnection.C;
    }

    public static /* synthetic */ Boolean h0(InAppConnection inAppConnection, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f28e1004", new Object[]{inAppConnection, bool});
        }
        inAppConnection.C = bool;
        return bool;
    }

    public static /* synthetic */ ISessionListener i0(InAppConnection inAppConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISessionListener) ipChange.ipc$dispatch("4c3cd358", new Object[]{inAppConnection});
        }
        return inAppConnection.D;
    }

    public static /* synthetic */ Object ipc$super(InAppConnection inAppConnection, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -479758732) {
            return new Boolean(super.q((Context) objArr[0]));
        }
        if (hashCode == 324918672) {
            super.M(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/net/InAppConnection");
    }

    public static /* synthetic */ void j0(InAppConnection inAppConnection, TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97aad511", new Object[]{inAppConnection, connectInfo});
        } else {
            inAppConnection.y0(connectInfo);
        }
    }

    public static /* synthetic */ Map k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("211cf3f3", new Object[0]);
        }
        return K;
    }

    public static /* synthetic */ String l0(InAppConnection inAppConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5e9e69c", new Object[]{inAppConnection});
        }
        return inAppConnection.u;
    }

    public static /* synthetic */ r5q m0(InAppConnection inAppConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5q) ipChange.ipc$dispatch("4fd0bbd3", new Object[]{inAppConnection});
        }
        return inAppConnection.y;
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void C(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72fd39", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            brt.j().execute(new Runnable() { // from class: tb.hse
                @Override // java.lang.Runnable
                public final void run() {
                    InAppConnection.this.w0();
                }
            });
        }
    }

    public final byte[] C0(byte[] bArr, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5b6cdfc5", new Object[]{this, bArr, kVar});
        }
        while (bArr != null && bArr.length >= 4) {
            int i2 = ((bArr[2] & 255) << 8) | ((bArr[3] & 255) + 4);
            if (i2 == bArr.length) {
                ((e.a) kVar).a(bArr);
                return null;
            } else if (i2 > bArr.length) {
                return bArr;
            } else {
                ((e.a) kVar).a(Arrays.copyOf(bArr, i2));
                int length = bArr.length - i2;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i2, bArr2, 0, length);
                if (length <= 0) {
                    return null;
                }
                bArr = bArr2;
            }
        }
        return bArr;
    }

    public final void E0(Context context, String str, boolean z, int i2, String str2) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cc28f6", new Object[]{this, context, str, new Boolean(z), new Integer(i2), str2});
            return;
        }
        b bVar = new b(context, str, z, i2, str2);
        if (tb.h.d()) {
            j2 = 1000;
        } else {
            j2 = 500;
        }
        brt.m(bVar, j2, TimeUnit.MILLISECONDS);
    }

    public void F0(String str, boolean z, long j2) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89368a40", new Object[]{this, str, new Boolean(z), new Long(j2)});
            return;
        }
        d dVar = new d(str, z);
        if (w()) {
            scheduledThreadPoolExecutor = brt.i();
        } else {
            scheduledThreadPoolExecutor = brt.h();
        }
        scheduledThreadPoolExecutor.schedule(dVar, j2, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.BaseConnection
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.u;
    }

    public final void q0(byte[] bArr, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cf6e82", new Object[]{this, bArr, kVar});
            return;
        }
        byte[] bArr2 = this.E;
        if (bArr2 == null) {
            this.E = C0(bArr, kVar);
            return;
        }
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.E.length, bArr.length);
        this.E = C0(bArr3, kVar);
    }

    public final void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        this.u += str;
        this.y = new r5q(this, BaseConnection.t);
    }

    public final void x0(final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222cb4d1", new Object[]{this, context, new Boolean(z)});
        } else if (I) {
            brt.m(new Runnable() { // from class: tb.kse
                @Override // java.lang.Runnable
                public final void run() {
                    InAppConnection.this.t0(context, z);
                }
            }, 100L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9c0fa6", new Object[]{this, str});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6081a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        public b(Context context, String str, boolean z, int i, String str2) {
            this.f6081a = context;
            this.b = str;
            this.c = z;
            this.d = i;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.accs.connection.state.a.v().A(this.f6081a)) {
                try {
                    ALog.e(InAppConnection.l0(InAppConnection.this), "sendConnectInfoToAccsByService", new Object[0]);
                    Intent intent = new Intent(Constants.ACTION_RECEIVE);
                    intent.setPackage(this.f6081a.getPackageName());
                    intent.setClassName(this.f6081a, xd0.msgService);
                    intent.putExtra("command", 103);
                    intent.putExtra("host", this.b);
                    intent.putExtra(Constants.KEY_CENTER_HOST, true);
                    if (!this.c) {
                        intent.putExtra("errorCode", this.d);
                        intent.putExtra(Constants.KEY_ERROR_DETAIL, this.e);
                    }
                    intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, this.c);
                    intent.putExtra(Constants.KEY_TYPE_INAPP, true);
                    intent.putExtra(Constants.KEY_INVOKE_MAIN, true ^ com.taobao.accs.connection.state.a.v().A(this.f6081a));
                    lef.f(this.f6081a, intent);
                } catch (Throwable th) {
                    ALog.e(InAppConnection.l0(InAppConnection.this), "sendConnectInfoToAccsByService err", th, new Object[0]);
                }
            }
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74fcd4e", new Object[]{this});
            return;
        }
        ALog.e(o(), "registerSessionListener", new Object[0]);
        try {
            SessionCenter.getInstance(this.i.getAppKey()).registerAccsSessionListener(this.D);
        } catch (Throwable th) {
            ALog.e(o(), "registerSessionListener err", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ALog.e(o(), "shut down", new Object[0]);
        this.v = false;
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ALog.e(o(), "close", new Object[0]);
        try {
            SessionCenter.getInstance(this.i.getAppKey()).unregisterAccsSessionListener(this.D);
        } catch (Exception e2) {
            ALog.e(o(), "close error", e2, new Object[0]);
        }
    }

    @Override // anet.channel.CustomDataFrameCb
    public void onException(int i2, int i3, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce0ebe", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z), str, map});
            return;
        }
        String o = o();
        ALog.e(o, "errorId:" + i3 + "detail:" + str + " dataId:" + i2 + " needRetry:" + z, new Object[0]);
        brt.h().execute(new f(i2, z, i3));
    }

    public r5q p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5q) ipChange.ipc$dispatch("d1d43ce6", new Object[]{this});
        }
        if (this.y == null) {
            ALog.e(this.u, "null SmartHb", new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_FULL_VERIFY, "null SmartHb", vu3.b.GEO_NOT_SUPPORT);
        }
        return this.y;
    }

    public final /* synthetic */ void t0(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce7713f", new Object[]{this, context, new Boolean(z)});
        } else if (UtilityImpl.isChannelProcess(context) && com.taobao.accs.connection.state.a.v().A(context)) {
            ALog.e(o(), "notifyConnectionChanged2Main", new Object[0]);
            Intent intent = new Intent(Constants.ACTION_CHANNEL_CONNECTION_CHANGED);
            intent.setClassName(context.getPackageName(), xd0.msgService);
            intent.putExtra("c", z);
            lef.f(context, intent);
            I = false;
        }
    }

    public final /* synthetic */ void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c1f3b", new Object[]{this});
            return;
        }
        List<IHeartBeat> h2 = h();
        if (h2 == null) {
            ALog.e(this.u, "onPingSuccess, empty listener", new Object[0]);
            return;
        }
        for (IHeartBeat iHeartBeat : h2) {
            try {
                iHeartBeat.onPingSuccess(this.r);
            } catch (IPCException e2) {
                ALog.e(this.u, "onPingSuccess callback err", e2, new Object[0]);
            }
        }
    }

    public final /* synthetic */ void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4306039e", new Object[]{this});
            return;
        }
        List<IHeartBeat> h2 = h();
        if (h2 != null) {
            for (IHeartBeat iHeartBeat : h2) {
                try {
                    iHeartBeat.onPingTimeout(this.r);
                } catch (IPCException e2) {
                    ALog.e(this.u, "onPingSuccess callback err", e2, new Object[0]);
                }
            }
        }
    }

    public final void y0(TaoBaseService.ConnectInfo connectInfo) {
        ArrayList<AccsConnectStateListener> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33093b8f", new Object[]{this, connectInfo});
            return;
        }
        if (m8l.w()) {
            arrayList = GlobalClientInfo.getInstance(this.d).getConnectionListenerList(this.r);
        } else {
            arrayList = g();
        }
        if (arrayList == null) {
            ALog.e(this.u, "try notifyConnectionChangedListener, but list NULL!", new Object[0]);
            return;
        }
        Iterator<AccsConnectStateListener> it = arrayList.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            AccsConnectStateListener next = it.next();
            try {
                if (connectInfo.connected) {
                    next.onConnected(connectInfo);
                } else {
                    next.onDisconnected(connectInfo);
                }
            } catch (Exception e2) {
                ALog.e(o(), "onConnectionChanged callback error", e2, new Object[0]);
                if (e2 instanceof IPCException) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(next);
                }
            }
        }
        if (arrayList2 != null && !com.taobao.accs.connection.state.a.v().A(this.d)) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                R((AccsConnectStateListener) it2.next());
            }
        }
    }

    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b628659", new Object[]{this});
            return;
        }
        ALog.e(this.u, "onPingSuccess", new Object[0]);
        this.z = 0;
        J = 0L;
        AccsForegroundMonitor.refreshOnlineTime(this.d);
        if (this.y != null && !m8l.z() && this.y.v()) {
            this.y.D(false);
        }
        ACCSRestartService.a(this.d);
        brt.d().execute(new Runnable() { // from class: tb.ise
            @Override // java.lang.Runnable
            public final void run() {
                InAppConnection.this.u0();
            }
        });
    }

    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbab4b7", new Object[]{this});
            return;
        }
        ALog.e(this.u, "onPingTimeout", new Object[0]);
        int i2 = this.z + 1;
        this.z = i2;
        if (this.y != null && i2 >= 3 && m8l.u()) {
            this.y.D(true);
        }
        if (NetworkStatusHelper.isConnected() && !r() && v()) {
            ALog.e(this.u, "bg fake connection", new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_FAKE_CONN, "conn_bg", vu3.b.GEO_NOT_SUPPORT);
        }
        brt.d().execute(new Runnable() { // from class: tb.gse
            @Override // java.lang.Runnable
            public final void run() {
                InAppConnection.this.v0();
            }
        });
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void B(String str, boolean z, String str2) {
        Session a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a9814b", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        try {
            Message D = this.e.D(str);
            if (!(D == null || D.host == null || (a2 = l70.a(SessionCenter.getInstance(this.i.getAppKey()), D.host.toString(), 0L, this.r)) == null)) {
                if (z) {
                    ALog.e(o(), "close session by time out", new Object[0]);
                    a2.close(true);
                } else {
                    a2.ping(true);
                }
            }
        } catch (Exception e2) {
            ALog.e(o(), "onTimeOut", e2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988443e", new Object[]{this});
            return;
        }
        try {
            if (s()) {
                Session a2 = l70.a(SessionCenter.getInstance(this.i.getAppKey()), l(null), 0L, this.r);
                ALog.e(o(), "reConnecting", "appkey", this.i.getAppKey(), "host", this.i.getInappHost(), MspGlobalDefine.SESSION, a2);
                if (a2 != null) {
                    AwcnConfig.setAccsReconnectionDelayPeriod(0);
                    a2.close(true);
                }
            }
        } catch (Exception e2) {
            ALog.e(o(), "reConnect error", e2, new Object[0]);
        }
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe3cc6f", new Object[]{this});
        } else if (this.i.isAccsHeartbeatEnable()) {
            ALog.e(o(), "startAccsHeartBeat", new Object[0]);
            ScheduledFuture scheduledFuture = this.x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledThreadPoolExecutor h2 = brt.h();
            Runnable runnable = this.B;
            long j2 = this.w;
            this.x = h2.scheduleAtFixedRate(runnable, j2, j2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public synchronized void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ALog.e(o(), "start", new Object[0]);
        if (q(this.d)) {
            this.v = true;
        }
    }

    public final boolean n0(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e91e1efa", new Object[]{this, message, new Boolean(z)})).booleanValue();
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.r)) {
            if (UtilityImpl.isChannelProcess(this.d)) {
                ALog.e(o(), "send in main", new Object[0]);
                Intent intent = new Intent(Constants.ACTION_SENDMESSAGE_INMAIN);
                intent.setClassName(this.d.getPackageName(), xd0.msgService);
                intent.putExtra("m", message);
                intent.putExtra("c", z);
                intent.putExtra("tag", this.r);
                lef.f(this.d, intent);
                return false;
            } else if (UtilityImpl.isMainProcess(this.d)) {
                try {
                    ConnectionServiceManager instance = ConnectionServiceManager.getInstance();
                    if (!instance.isProxyConnection(this.r) && instance.isAllWeather(this.r)) {
                        ALog.e(o(), "force-proxy conn", new Object[0]);
                        instance.onChannelConnectionChanged(true);
                    }
                    int i2 = message.retryTimes;
                    if (i2 > 9) {
                        ALog.e(o(), "reject msg, retryTimes > 9", new Object[0]);
                        c71.c("accs", BaseMonitor.COUNT_RETRY_MULTI, message.getDataId(), message.retryTimes);
                        return false;
                    }
                    message.retryTimes = i2 + 1;
                    ALog.e(o(), "send in channel", new Object[0]);
                    instance.getConnectionWrapper(this.r).send(message, z);
                    return false;
                } catch (IPCException unused) {
                    String o = o();
                    ALog.e(o, "not running or msg null! " + this.v, new Object[0]);
                }
            }
        }
        return true;
    }

    public final void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfc011", new Object[]{this, new Boolean(z)});
        } else if (v()) {
            if (!z) {
                try {
                    if (BaseConnection.t == 1 && UtilityImpl.isNetworkConnected(this.d) && J > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - J;
                        if (elapsedRealtime >= 10000 && elapsedRealtime <= 11000) {
                            c71.c("accs", BaseMonitor.COUNT_FAKE_CONN, MonitorItemConstants.WS_MONITOR_TITLE_CONN, vu3.b.GEO_NOT_SUPPORT);
                            ALog.e(o(), "fake connection", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    ALog.e(o(), "connectionMonitor error", th, new Object[0]);
                    c71.c("accs", BaseMonitor.COUNT_VERIFY, "connectionMonitor", vu3.b.GEO_NOT_SUPPORT);
                    return;
                }
            }
            Boolean bool = this.C;
            if ((bool == null || bool.booleanValue() != z) && "default".equals(this.r)) {
                if (z) {
                    AccsForegroundMonitor.online(this.d);
                } else {
                    AccsForegroundMonitor.offline();
                }
                if (UtilityImpl.isChannelProcess(this.d)) {
                    ACCSRestartService.a(this.d);
                }
            }
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public boolean q(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3677674", new Object[]{this, context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            ALog.e(o(), "initAwcn", th, new Object[0]);
        }
        if (this.g) {
            return true;
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.r)) {
            return false;
        }
        super.q(context);
        if (UtilityImpl.isMainProcessAlive(context)) {
            if (UtilityImpl.isChannelProcess(context)) {
            }
            ALog.e(o(), "register accs session listener", new Object[0]);
            SessionCenter.getInstance(this.i.getAppKey()).registerAccsSessionListener(this.D);
            String inappHost = this.i.getInappHost();
            if (t() || !this.i.isKeepalive()) {
                ALog.d(o(), "initAwcn close keepalive", new Object[0]);
                z = false;
            } else {
                z = true;
            }
            AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
            D0(SessionCenter.getInstance(this.i.getAppKey()), inappHost, z);
            this.g = true;
            ALog.e(o(), "initAwcn success!", new Object[0]);
            return true;
        }
        AwcnConfig.setSendConnectInfoByService(false);
        if (!UtilityImpl.isChannelProcess(context)) {
            ALog.e(o(), "setSendConnectInfoByService(false)", new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_VERIFY, "setSendConnectInfoByService", vu3.b.GEO_NOT_SUPPORT);
        }
        ALog.e(o(), "register accs session listener", new Object[0]);
        SessionCenter.getInstance(this.i.getAppKey()).registerAccsSessionListener(this.D);
        String inappHost2 = this.i.getInappHost();
        if (t()) {
        }
        ALog.d(o(), "initAwcn close keepalive", new Object[0]);
        z = false;
        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        D0(SessionCenter.getInstance(this.i.getAppKey()), inappHost2, z);
        this.g = true;
        ALog.e(o(), "initAwcn success!", new Object[0]);
        return true;
    }

    @Override // com.taobao.accs.net.BaseConnection
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        ALog.e(this.u, "isConnected", "state", Boolean.valueOf(this.A));
        return this.A;
    }

    public final /* synthetic */ void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98b9e6a", new Object[]{this});
            return;
        }
        ALog.d(o(), "sendAccsHeartbeatMessage", new Object[0]);
        try {
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, new bxf.a().d("dataType", "pingreq").c("timeInterval", Long.valueOf(this.w)).a().toString().getBytes("utf-8"), UUID.randomUUID().toString());
            accsRequest.setTarget("accs-iot");
            accsRequest.setTargetServiceName("sal");
            L(Message.buildRequest(this.d, l(null), o(), this.i.getStoreId(), this.d.getPackageName(), Constants.TARGET_SERVICE, accsRequest, true), true);
        } catch (Exception e2) {
            ALog.e(o(), "send accs heartbeat message", e2, new Object[0]);
        }
    }

    public final /* synthetic */ void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff88b00", new Object[]{this});
        } else if (!this.g) {
        } else {
            if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.r)) {
                ALog.e(o(), "Current process is not allowed to ping", new Object[0]);
                return;
            }
            try {
                D0(SessionCenter.getInstance(this.i.getAppKey()), this.i.getInappHost(), this.i.isKeepalive());
                Session b2 = l70.b(SessionCenter.getInstance(this.i.getAppKey()), l(null), ConnType.TypeLevel.SPDY, 0L, this.r);
                ALog.e(o(), "try session ping", MspGlobalDefine.SESSION, b2);
                if (b2 != null) {
                    int pingTimeout = this.i.getPingTimeout();
                    if (m8l.x()) {
                        l70.f(b2, Integer.valueOf(pingTimeout));
                    } else if (pingTimeout > 0) {
                        b2.ping(true, pingTimeout);
                    } else {
                        b2.ping(true);
                    }
                }
            } catch (Exception e2) {
                ALog.e(o(), "ping error", e2, new Object[0]);
            }
        }
    }

    public void B0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71210801", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            ALog.e(o(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
        } else {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(o(), "onReceiveAccsHeartbeatResp", "data", jSONObject);
            }
            try {
                int i2 = jSONObject.getInt("timeInterval");
                if (i2 == -1) {
                    ScheduledFuture scheduledFuture = this.x;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        return;
                    }
                    return;
                }
                long j2 = i2 * 1000;
                if (this.w != j2) {
                    if (i2 == 0) {
                        j2 = 3600000;
                    }
                    this.w = j2;
                    ScheduledFuture scheduledFuture2 = this.x;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                    }
                    ScheduledThreadPoolExecutor h2 = brt.h();
                    Runnable runnable = this.B;
                    long j3 = this.w;
                    this.x = h2.scheduleAtFixedRate(runnable, j3, j3, TimeUnit.MILLISECONDS);
                }
            } catch (JSONException e2) {
                ALog.e(o(), "onReceiveAccsHeartbeatResp", "e", e2.getMessage());
            }
        }
    }

    public void D0(SessionCenter sessionCenter, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ae5e1f", new Object[]{this, sessionCenter, str, new Boolean(z)});
        } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.r)) {
            ALog.e(o(), "current process is not allowed to connect", new Object[0]);
        } else if (!this.G.contains(str)) {
            if (this.y == null) {
                this.y = new r5q(this, BaseConnection.t);
                hkq.b("accs", BaseMonitor.COUNT_FULL_VERIFY, "smart init", vu3.b.GEO_NOT_SUPPORT);
            }
            sessionCenter.registerSessionInfo(SessionInfo.create(str, z, true, (IAuth) new j(this, str), this.H, (CustomDataFrameCb) this));
            sessionCenter.registerPublicKey(str, this.i.getInappPubKey());
            this.G.add(str);
            ALog.e(o(), "registerSessionInfo", "host", str);
        }
    }

    public void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ab4eef", new Object[]{this});
            return;
        }
        String inappHost = this.i.getInappHost();
        SessionCenter instance = SessionCenter.getInstance(this.i.getAppKey());
        if (instance == null) {
            ALog.w(o(), "updateConfig not need update", new Object[0]);
            return;
        }
        instance.unregisterSessionInfo(inappHost);
        ALog.w(o(), "updateConfig unregisterSessionInfo", "host", inappHost);
        if (this.G.contains(inappHost)) {
            this.G.remove(inappHost);
            ALog.w(o(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
        }
    }

    public void I0(AccsClientConfig accsClientConfig) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
        } else if (accsClientConfig == null) {
            ALog.i(o(), "updateConfig null", new Object[0]);
        } else if (accsClientConfig.equals(this.i)) {
            ALog.w(o(), "updateConfig not any changed", new Object[0]);
        } else {
            ALog.e(o(), "updateConfig", "config", accsClientConfig);
            if (!this.g) {
                this.i = accsClientConfig;
                q(this.d);
                return;
            }
            try {
                ALog.w(o(), "updateConfig", "old", this.i, "new", accsClientConfig);
                String inappHost = accsClientConfig.getInappHost();
                SessionCenter instance = SessionCenter.getInstance(this.i.getAppKey());
                if (instance == null) {
                    ALog.w(o(), "updateConfig not need update", new Object[0]);
                    return;
                }
                H0();
                this.i = accsClientConfig;
                if (!TextUtils.isEmpty(this.b) && !this.b.equals(this.i.getAppKey())) {
                    c71.c("accs", BaseMonitor.COUNT_APPKEY_CHANGED, "", vu3.b.GEO_NOT_SUPPORT);
                }
                this.b = this.i.getAppKey();
                this.r = this.i.getTag();
                String str = ConnType.PK_ACS;
                if (this.i.getInappPubKey() == 10 || this.i.getInappPubKey() == 11) {
                    str = "open";
                }
                ALog.i(o(), "update config register new conn protocol host:", this.i.getInappHost());
                StrategyTemplate.getInstance().registerConnProtocol(this.i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
                if (!t() || !this.i.isKeepalive()) {
                    ALog.i(o(), "updateConfig close keepalive", new Object[0]);
                    z = false;
                }
                D0(instance, inappHost, z);
            } catch (Throwable th) {
                ALog.e(o(), "updateConfig", th, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void L(Message message, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a72f4ab", new Object[]{this, message, new Boolean(z)});
        } else if (n0(message, z)) {
            if (!this.v || message == null) {
                String o = o();
                ALog.e(o, "not running or msg null! " + this.v, new Object[0]);
                return;
            }
            P();
            if (v()) {
                scheduledThreadPoolExecutor = brt.j();
            } else {
                scheduledThreadPoolExecutor = brt.l();
            }
            try {
                if ((!w() || !Constants.TARGET_SYNC.equals(message.getTarget())) && scheduledThreadPoolExecutor.getQueue().size() > 1000) {
                    throw new RejectedExecutionException("accs");
                }
                if (UtilityImpl.isServiceIdPrintLog(message.serviceId)) {
                    ALog.e(o(), "sendMessage schedule", "dataId", message.getDataId());
                }
                ScheduledFuture<?> schedule = scheduledThreadPoolExecutor.schedule(new c(message), message.delyTime, TimeUnit.MILLISECONDS);
                if (message.getType() == 1 && message.cunstomDataId != null) {
                    if (message.isControlFrame() && e(message.cunstomDataId)) {
                        this.e.f(message);
                    }
                    ((ConcurrentHashMap) this.e.b).put(message.cunstomDataId, schedule);
                }
                NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                if (netPermanceMonitor != null) {
                    netPermanceMonitor.setConnType(this.c);
                    netPermanceMonitor.onEnterQueueData();
                }
            } catch (RejectedExecutionException unused) {
                this.e.t(message, 70008);
                String o2 = o();
                ALog.e(o2, "send queue full count:" + scheduledThreadPoolExecutor.getQueue().size(), "dataId", message.dataId);
            } catch (Throwable th) {
                this.e.t(message, -8);
                ALog.e(o(), "send error", th, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.net.BaseConnection
    public void M(int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ddd90", new Object[]{this, new Integer(i2)});
            return;
        }
        ALog.e(o(), "setForeBackStateInApp", "state", Integer.valueOf(i2), "smartHeartbeat", Boolean.valueOf(this.y != null));
        super.M(i2);
        r5q r5qVar = this.y;
        if (r5qVar != null) {
            r5qVar.B(i2);
        }
        if (i2 != 0) {
            z = false;
        }
        N(z);
    }

    @Override // com.taobao.accs.net.BaseConnection
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5301f18f", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) ((ConcurrentHashMap) this.e.b).get(str);
        boolean cancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (cancel) {
            ALog.e(o(), "cancel", "customDataId", str);
        }
        return cancel;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i implements EventCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public InAppConnection f6089a;

        static {
            t2o.a(343933169);
            t2o.a(607125636);
        }

        public void a(InAppConnection inAppConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f10bff9c", new Object[]{this, inAppConnection});
            } else {
                this.f6089a = inAppConnection;
            }
        }

        @Override // anet.channel.entity.EventCb
        public void onEvent(Session session, int i, Event event) {
            String str;
            int i2;
            ArrayList<AccsConnectStateListener> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
                return;
            }
            try {
                if (i == 128) {
                    this.f6089a.z0();
                } else if (i == 2048) {
                    ALog.e("ACCSEventCb", "connection.ping() timeout", new Object[0]);
                    this.f6089a.A0();
                } else if (i == 256 || i == 1024) {
                    String valueOf = String.valueOf(i);
                    if (event != null) {
                        i2 = event.errorCode;
                        str = event.errorDetail;
                    } else {
                        str = valueOf;
                        i2 = -1;
                    }
                    ALog.e("ACCSEventCb", "conn fail", "err_code", Integer.valueOf(i2), "err_detail", str, "connection", Boolean.valueOf(this.f6089a == null));
                    c71.a("accs", BaseMonitor.ALARM_CONNECT_RESULT, "", String.valueOf(i2), str);
                    if (this.f6089a != null) {
                        TaoBaseService.ConnectInfo connectInfo = new TaoBaseService.ConnectInfo(null, true, true, i2, str);
                        if (m8l.w()) {
                            arrayList = GlobalClientInfo.getInstance(this.f6089a.d).getConnectionListenerList(this.f6089a.r);
                        } else {
                            arrayList = this.f6089a.g();
                        }
                        Iterator<AccsConnectStateListener> it = arrayList.iterator();
                        while (it.hasNext()) {
                            AccsConnectStateListener next = it.next();
                            if (next instanceof AccsConnectStateListener2) {
                                ((AccsConnectStateListener2) next).onConnectFail(connectInfo);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                ALog.e("ACCSEventCb", "sessionEventCb err", th, new Object[0]);
            }
        }
    }

    @Override // anet.channel.CustomDataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i2, int i3, int i4, Map<String, Object> map) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2636add6", new Object[]{this, tnetSpdySession, bArr, new Integer(i2), new Integer(i3), new Integer(i4), map});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e(o(), "onDataReceive", "type", Integer.valueOf(i3), "dataid", Integer.valueOf(i2));
        }
        AccsForegroundMonitor.refreshOnlineTime(this.d);
        if (m8l.C() && w() && i4 != bArr.length) {
            bArr = Arrays.copyOf(bArr, i4);
        }
        if (this.y != null) {
            if (w()) {
                if (TimeMeter.a(TimeMeter.TAG_MSG_RESCHEDULE_HB, 5000L)) {
                    this.y.z();
                }
            } else if (!m8l.z()) {
                this.y.reSchedule();
            }
        }
        if (map != null) {
            map.put(Constants.KEY_DATA_RECEIVED_TIME, Long.valueOf(n()));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (v()) {
            scheduledThreadPoolExecutor = brt.h();
        } else {
            scheduledThreadPoolExecutor = brt.e();
        }
        scheduledThreadPoolExecutor.execute(new e(i2, i3, bArr, tnetSpdySession, currentTimeMillis, map));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ISessionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final void a(Context context, boolean z) {
            List<String> k;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21e6c005", new Object[]{this, context, new Boolean(z)});
            } else if (z) {
                AwcnConfig.setAccsReconnectionDelayPeriod(10000);
                Collection<Message> i = InAppConnection.this.e.i();
                List<String> q = j8l.q(context, 0, Constants.SP_FILE_NAME);
                if (!(i == null || q == null || q.isEmpty())) {
                    for (Message message : i) {
                        if (!message.isAck && !message.isTimeOut()) {
                            String str = message.serviceId;
                            if (!TextUtils.isEmpty(str) && q.contains(str) && !InAppConnection.k0().containsKey(message.getDataId())) {
                                InAppConnection.this.E(message, 0);
                                InAppConnection.k0().put(message.getDataId(), null);
                            }
                        }
                    }
                }
                c71.b("accs", BaseMonitor.ALARM_CONNECT_RESULT, "");
                if (UtilityImpl.isMainProcess(context)) {
                    Launcher_InitAgooLifecycle.monitorConnected();
                }
                if (!(InAppConnection.g0(InAppConnection.this) == null || InAppConnection.g0(InAppConnection.this).booleanValue() || (k = m8l.k(7)) == null)) {
                    for (String str2 : k) {
                        d2r.b().i(str2, null);
                    }
                }
            }
        }

        @Override // anet.channel.ISessionListener
        public void onConnectionChanged(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e661809b", new Object[]{this, intent});
            } else if (intent == null) {
                ALog.e(InAppConnection.this.o(), "onConnectionChanged", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "null");
            } else {
                Context context = GlobalClientInfo.getContext();
                boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                String stringExtra = intent.getStringExtra("host");
                String o = InAppConnection.this.o();
                ALog.e(o, "onConnectionChanged", "currentHost", h1p.HTTPS_PREFIX + InAppConnection.this.i.getInappHost(), "changeHost", stringExtra, "state", Boolean.valueOf(booleanExtra), "process", h5d.f(), "hash", Integer.valueOf(InAppConnection.this.hashCode()));
                if ((h1p.HTTPS_PREFIX + InAppConnection.this.i.getInappHost()).equals(stringExtra)) {
                    gva.a(context).e();
                    InAppConnection.Y(InAppConnection.this, booleanExtra);
                    b(context, booleanExtra, intent);
                }
            }
        }

        public final void b(Context context, boolean z, Intent intent) {
            TaoBaseService.ConnectInfo connectInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c5c5e7", new Object[]{this, context, new Boolean(z), intent});
                return;
            }
            String stringExtra = intent.getStringExtra("host");
            int intExtra = intent.getIntExtra("errorCode", -1);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
            boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
            if (!AwcnConfig.isSendConnectInfoByService() && UtilityImpl.isMainProcessAlive(InAppConnection.this.d)) {
                if (UtilityImpl.isChannelProcess(context)) {
                    InAppConnection.Z(InAppConnection.this, context, stringExtra, z, intExtra, stringExtra2);
                } else {
                    AwcnConfig.setSendConnectInfoByService(true);
                }
            }
            a(context, z);
            if (z) {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra, booleanExtra2);
            } else {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra, booleanExtra2, intExtra, stringExtra2);
            }
            connectInfo.connected = z;
            InAppConnection.e0(InAppConnection.this, context, z);
            InAppConnection inAppConnection = InAppConnection.this;
            InAppConnection.f0(inAppConnection, InAppConnection.h0(inAppConnection, Boolean.valueOf(z)).booleanValue());
            if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(InAppConnection.this.r)) {
                ALog.e(InAppConnection.this.o(), "onConnectionChanged not allow to notify", new Object[0]);
                SessionCenter.getInstance(InAppConnection.this.i.getAppKey()).unregisterAccsSessionListener(InAppConnection.i0(InAppConnection.this));
                return;
            }
            if (intent.getBooleanExtra("isSendConnectInfoByService", false)) {
                ALog.e(InAppConnection.this.o(), "onConnectionChanged, distribute message", new Object[0]);
                o2j.d(InAppConnection.this.d, intent);
            }
            InAppConnection.j0(InAppConnection.this, connectInfo);
        }
    }
}
