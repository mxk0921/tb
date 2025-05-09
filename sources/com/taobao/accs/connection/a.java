package com.taobao.accs.connection;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.a;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import tb.brt;
import tb.c71;
import tb.czv;
import tb.h;
import tb.h1p;
import tb.h5d;
import tb.lef;
import tb.m8l;
import tb.ndv;
import tb.re;
import tb.t2o;
import tb.tv9;
import tb.va8;
import tb.vu3;
import tb.wi4;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends wi4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b connLock = new b();
    public String d;
    public final Context c = GlobalClientInfo.getContext();
    public final Map<String, IConnection> e = new ConcurrentHashMap();
    public Boolean f = null;
    public volatile boolean g = false;
    public boolean h = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.accs.connection.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0311a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.accs.connection.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0312a implements IChannelConnListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0312a() {
            }

            @Override // com.taobao.accs.connection.IChannelConnListener
            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                    return;
                }
                ALog.e("AllWeatherConnectionService", "onChannelStart()", new Object[0]);
                a.connLock.d(UtilityImpl.getChannelProcessName(a.k(a.this)));
            }
        }

        public RunnableC0311a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            StringBuilder sb = new StringBuilder("onBackground scheduling, ctx==null? ");
            if (a.k(a.this) != null) {
                z = false;
            }
            sb.append(z);
            ALog.e("AllWeatherConnectionService", sb.toString(), new Object[0]);
            try {
                IChannelConnection iChannelConnection = (IChannelConnection) re.m(new ComponentName(a.k(a.this), AccsIPCProvider.class), IChannelConnection.class, new Pair[0]);
                for (String str : a.l(a.this).keySet()) {
                    iChannelConnection.start(str, tv9.h().i(), new C0312a());
                }
            } catch (IPCException e) {
                ALog.e("AllWeatherConnectionService", "IChannelConnection err", e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933048);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2072255840) {
            super.h((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/AllWeatherConnectionService");
    }

    public static /* synthetic */ Context k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("45737321", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ Map l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47e2141f", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6ba45a", new Object[0]);
        } else if (h.e()) {
            ALog.e("AllWeatherConnectionService", "init MainBinder in getConnection", new Object[0]);
            AccsMainCenter.h().i(true);
        }
    }

    @Override // tb.wi4
    public IConnection a(String str, AccsClientConfig accsClientConfig) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("e4a78d1a", new Object[]{this, str, accsClientConfig});
        }
        if (((ConcurrentHashMap) this.e).get(str) == null) {
            this.d = str;
            String c = connLock.c(h5d.f());
            if (TextUtils.isEmpty(c) || c.equals(this.c.getPackageName())) {
                z = true;
            } else {
                z = false;
            }
            if (!czv.g(this.c) || !z) {
                try {
                    if (UtilityImpl.isMainProcess(this.c)) {
                        brt.b(new Runnable() { // from class: tb.pt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.o();
                            }
                        });
                        GlobalClientInfo.getInstance(this.c).recoverListener(str);
                    }
                    if (tv9.h().i() != 1 || !UtilityImpl.isForeground(GlobalClientInfo.mContext)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (UtilityImpl.isChannelProcess(this.c)) {
                        this.f30712a = new ConnectionWrapper(accsClientConfig, i);
                        this.b = false;
                    } else {
                        this.f30712a = (IConnection) re.m(new ComponentName(this.c, AccsIPCProvider.class), IConnection.class, new Pair(AccsClientConfig.class, accsClientConfig), new Pair(Integer.class, Integer.valueOf(i)));
                        this.b = true;
                    }
                } catch (IPCException e) {
                    m(str);
                    ALog.e("AllWeatherConnectionService", "getConnection err ", e, new Object[0]);
                }
            } else {
                this.f30712a = new ConnectionWrapper(str);
                this.b = false;
            }
            if (this.f30712a != null) {
                ((ConcurrentHashMap) this.e).put(str, this.f30712a);
            }
            ALog.e("AllWeatherConnectionService", "getConnection-aw", "isUsingARanger", Boolean.valueOf(this.b), Constants.KEY_CONFIG_TAG, str);
        }
        return (IConnection) ((ConcurrentHashMap) this.e).get(str);
    }

    @Override // tb.wi4
    public List<IConnection> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e9d0a061", new Object[]{this});
        }
        try {
            return Arrays.asList(((ConcurrentHashMap) this.e).values().toArray(new IConnection[0]));
        } catch (Exception e) {
            ALog.e("AllWeatherConnectionService", "getConnections err", e, new Object[0]);
            return null;
        }
    }

    @Override // tb.wi4
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("454be8ed", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.wi4
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else if (this.g) {
            ALog.e("AllWeatherConnectionService", "onBackground() but already downGrade", new Object[0]);
        } else if (!this.h) {
            this.h = true;
            ALog.e("AllWeatherConnectionService", "onBackground schedule start", new Object[0]);
            brt.h().schedule(new RunnableC0311a(), 5L, TimeUnit.SECONDS);
        }
    }

    @Override // tb.wi4
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4899a3b", new Object[]{this, new Boolean(z)});
            return;
        }
        ALog.e("AllWeatherConnectionService", "onConnectionStateChanged", "connected", Boolean.valueOf(z), "isUsingARanger", Boolean.valueOf(this.b));
        if (z && !this.b) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.e).entrySet()) {
                r((String) entry.getKey(), (IConnection) entry.getValue());
            }
        }
    }

    @Override // tb.wi4
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db20c54", new Object[]{this});
            return;
        }
        for (String str : ((ConcurrentHashMap) this.e).keySet()) {
            if (this.b && m8l.w()) {
                q();
            }
            try {
                GlobalClientInfo.getInstance(re.r()).recoverListener(str);
            } catch (Throwable th) {
                ALog.e("AllWeatherConnectionService", "on processStateListener global error", th, new Object[0]);
            }
            if (m8l.w()) {
                GlobalClientInfo.getInstance(re.r()).recoverConnectionListener(str);
            }
            try {
                h(str);
                IConnection a2 = a(str, AccsClientConfig.getConfigByTag(str));
                a2.start();
                a2.setForeBackState(tv9.h().i());
            } catch (Throwable th2) {
                ALog.e("AllWeatherConnectionService", "on processStateListener connection_service error", th2, new Object[0]);
            }
        }
    }

    @Override // tb.wi4
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
            return;
        }
        super.h(str);
        if (str != null) {
            ((ConcurrentHashMap) this.e).remove(str);
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f595d26", new Object[]{this, str});
            return;
        }
        ALog.e("AllWeatherConnectionService", ndv.UMB_FEATURE_DOWN_GRADE, Constants.KEY_CONFIG_TAG, str);
        this.g = true;
        connLock.d(this.c.getPackageName());
        if (UtilityImpl.isMainProcess(this.c)) {
            if (this.b) {
                h(str);
            }
            va8.removeConnection(this.c, str);
        }
        if (((ConcurrentHashMap) this.e).get(str) == null) {
            this.f30712a = new ConnectionWrapper(str);
            this.b = false;
            ((ConcurrentHashMap) this.e).put(str, this.f30712a);
            try {
                this.f30712a.start();
            } catch (IPCException e) {
                ALog.e("AllWeatherConnectionService", "downGrade err", e, new Object[0]);
            }
        }
        if (UtilityImpl.isChannelProcessAlive(this.c)) {
            Intent intent = new Intent(Constants.ACTION_CLOSE_CONNECTION);
            intent.putExtra(Constants.KEY_CONFIG_TAG, str);
            intent.setClassName(this.c.getPackageName(), xd0.channelService);
            lef.f(this.c, intent);
        }
        c71.c("accs", BaseMonitor.COUNT_FULL_VERIFY, ndv.UMB_FEATURE_DOWN_GRADE, vu3.b.GEO_NOT_SUPPORT);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b180577", new Object[]{this});
        } else {
            brt.d().execute(new Runnable() { // from class: tb.qt0
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.p();
                }
            });
        }
    }

    public final void r(String str, IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d061452", new Object[]{this, str, iConnection});
            return;
        }
        try {
            BaseConnection connection = ((ConnectionWrapper) iConnection).getConnection();
            if (connection instanceof InAppConnection) {
                h(str);
                AwcnConfig.setSendConnectInfoByService(false);
                ((InAppConnection) connection).H0();
            }
            IConnection connectionWrapper = ConnectionServiceManager.getInstance().getConnectionWrapper(str);
            connectionWrapper.setForeBackState(tv9.h().i());
            if (m8l.w()) {
                GlobalClientInfo.getInstance(this.c).recoverConnectionListener(str);
                return;
            }
            ArrayList<AccsConnectStateListener> g = connection.g();
            if (g != null) {
                Iterator<AccsConnectStateListener> it = g.iterator();
                while (it.hasNext()) {
                    connectionWrapper.registerConnectStateListener(it.next());
                }
            }
        } catch (Throwable th) {
            ALog.e("AllWeatherConnectionService", "channelConnListener err", th, Constants.KEY_CONFIG_TAG, str);
        }
    }

    public final /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e83dd65", new Object[]{this});
            return;
        }
        ArrayList<AccsConnectStateListener> connectionListenerList = GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).getConnectionListenerList(this.d);
        if (connectionListenerList == null) {
            ALog.e("AllWeatherConnectionService", "try notifyConnDisconnected, but list NULL!", new Object[0]);
            return;
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(this.d);
        if (configByTag == null) {
            ALog.e("AllWeatherConnectionService", "notifyConnDisconnected, cfg is NULL!", new Object[0]);
            return;
        }
        TaoBaseService.ConnectInfo connectInfo = new TaoBaseService.ConnectInfo(h1p.HTTPS_PREFIX + configByTag.getInappHost(), true, true, -101, "process dead");
        connectInfo.connected = false;
        Iterator<AccsConnectStateListener> it = connectionListenerList.iterator();
        while (it.hasNext()) {
            AccsConnectStateListener next = it.next();
            if (next != null) {
                try {
                    ALog.e("AllWeatherConnectionService", "notifyConnDisconnected: " + next.getClass().getName(), new Object[0]);
                    next.onDisconnected(connectInfo);
                } catch (Throwable th) {
                    ALog.e("AllWeatherConnectionService", "notifyConnDisconnected err", th, new Object[0]);
                }
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23fe1e", new Object[]{this});
            return;
        }
        ALog.e("AllWeatherConnectionService", "setCurrentProcessToConnect", new Object[0]);
        connLock.d(h5d.f());
        try {
            ((ConnectionWrapper) ((IConnection) ((ConcurrentHashMap) this.e).get(this.d))).getConnection().I();
        } catch (Throwable th) {
            ALog.e("AllWeatherConnectionService", "setCurrentProcessToConnect err", th, new Object[0]);
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d732ed3", new Object[]{this})).booleanValue();
        }
        String f = h5d.f();
        String c = connLock.c(f);
        boolean z = TextUtils.isEmpty(c) || c.equals(f);
        Boolean bool = this.f;
        if (bool == null || bool.booleanValue() != z) {
            ALog.e("AllWeatherConnectionService", "isCurProcessAllow2Connect", "process", c, "allowed", Boolean.valueOf(z));
        }
        this.f = Boolean.valueOf(z);
        return z;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String LOCK_FILE_NAME = "aw_con.lock";

        /* renamed from: a  reason: collision with root package name */
        public long f6040a = -1;
        public String b;

        static {
            t2o.a(343933051);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                b(1, null);
            }
        }

        public String c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5228cf21", new Object[]{this, str});
            }
            return b(0, str);
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9e4327e", new Object[]{this, str});
            } else {
                b(1, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(int r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 345
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.connection.a.b.b(int, java.lang.String):java.lang.String");
        }
    }
}
