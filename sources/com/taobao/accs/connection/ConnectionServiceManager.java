package com.taobao.accs.connection;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.mass.MassClient;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c71;
import tb.czv;
import tb.j08;
import tb.m8l;
import tb.re;
import tb.t2o;
import tb.vu3;
import tb.wi4;
import tb.wv9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnectionServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConnectionServiceManager";
    public static final String TYPE_ALL_WEATHER = "2";
    public static final String TYPE_DUAL = "3";
    public static final String TYPE_FOREGROUND = "4";
    private final Map<String, wi4> connServiceMap;
    private AtomicBoolean isInit;
    private final ProcessStateListener processStateListener;
    private String serviceType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ProcessStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107b37c3", new Object[]{this, str});
            }
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStop(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                return;
            }
            ALog.e(ConnectionServiceManager.TAG, "onProcessStop: " + str, new Object[0]);
            if (!m8l.n() || "com.taobao.taobao:channel".equals(str)) {
                com.taobao.accs.connection.state.a.v().c(StateMachine.Event.obtain(103));
                boolean z = false;
                for (wi4 wi4Var : ConnectionServiceManager.access$200(ConnectionServiceManager.this).values()) {
                    if (!wi4Var.c()) {
                        ALog.e(ConnectionServiceManager.TAG, "not aranger proxy", new Object[0]);
                        return;
                    }
                    if (!z) {
                        try {
                            IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) re.q(new ComponentName(re.r(), AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, re.r()));
                            IAgooAppReceiver iAgooAppReceiver = GlobalClientInfo.mAgooAppReceiver;
                            if (iAgooAppReceiver != null) {
                                iGlobalClientInfoService.setRemoteAgooAppReceiver(iAgooAppReceiver);
                            }
                            if (GlobalClientInfo.getInstance(re.r()).getAppReceiver() != null) {
                                for (Map.Entry<String, IAppReceiver> entry : GlobalClientInfo.getInstance(re.r()).getAppReceiver().entrySet()) {
                                    iGlobalClientInfoService.setRemoteAppReceiver(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            ALog.e(ConnectionServiceManager.TAG, "on processStateListener global error", th, new Object[0]);
                        }
                        z = true;
                    }
                    wi4Var.f();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ConnectionServiceManager f6037a = new ConnectionServiceManager(null);

        static {
            t2o.a(343933056);
        }

        public static /* synthetic */ ConnectionServiceManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConnectionServiceManager) ipChange.ipc$dispatch("f06bbfec", new Object[0]);
            }
            return f6037a;
        }
    }

    static {
        t2o.a(343933054);
    }

    public /* synthetic */ ConnectionServiceManager(a aVar) {
        this();
    }

    public static /* synthetic */ Map access$200(ConnectionServiceManager connectionServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3c69b20", new Object[]{connectionServiceManager});
        }
        return connectionServiceManager.connServiceMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r6.equals("3") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.wi4 getConnServiceByType(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.accs.connection.ConnectionServiceManager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "9df4bbe0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.wi4 r6 = (tb.wi4) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 50: goto L_0x0039;
                case 51: goto L_0x0030;
                case 52: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "4"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0043
        L_0x0030:
            java.lang.String r1 = "3"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0043
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "2"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0052;
                case 2: goto L_0x004c;
                default: goto L_0x0046;
            }
        L_0x0046:
            com.taobao.accs.connection.a r6 = new com.taobao.accs.connection.a
            r6.<init>()
            return r6
        L_0x004c:
            tb.wv9 r6 = new tb.wv9
            r6.<init>()
            return r6
        L_0x0052:
            tb.j08 r6 = new tb.j08
            r6.<init>()
            return r6
        L_0x0058:
            com.taobao.accs.connection.a r6 = new com.taobao.accs.connection.a
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.connection.ConnectionServiceManager.getConnServiceByType(java.lang.String):tb.wi4");
    }

    public static ConnectionServiceManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectionServiceManager) ipChange.ipc$dispatch("e77b3d46", new Object[0]);
        }
        return b.a();
    }

    private void setServiceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c30f7d4", new Object[]{this});
        } else if (UtilityImpl.isDualApp(GlobalClientInfo.getContext())) {
            this.serviceType = "3";
        } else {
            this.serviceType = "2";
        }
    }

    public List<IConnection> getConnections(String str) {
        wi4 wi4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d83d6d7", new Object[]{this, str});
        }
        if (str == null || (wi4Var = this.connServiceMap.get(str)) == null) {
            return null;
        }
        return wi4Var.b();
    }

    public boolean isAllWeather(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53bb2b2", new Object[]{this, str})).booleanValue();
        }
        return this.connServiceMap.get(str) instanceof com.taobao.accs.connection.a;
    }

    public boolean isDual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d73c651", new Object[]{this})).booleanValue();
        }
        return "3".equals(this.serviceType);
    }

    public boolean isProxyConnection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3fa0a77", new Object[]{this, str})).booleanValue();
        }
        return this.connServiceMap.get(str).c();
    }

    public void onAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cad717", new Object[]{this});
            return;
        }
        for (Map.Entry<String, wi4> entry : this.connServiceMap.entrySet()) {
            if (UtilityImpl.isChannelProcess(GlobalClientInfo.getContext()) && (entry.getValue() instanceof com.taobao.accs.connection.a)) {
                ((com.taobao.accs.connection.a) entry.getValue()).s();
            }
            onBackground(entry.getKey());
        }
    }

    public void onChannelConnectionChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4899a3b", new Object[]{this, new Boolean(z)});
            return;
        }
        for (wi4 wi4Var : this.connServiceMap.values()) {
            wi4Var.e(z);
        }
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        for (wi4 wi4Var : this.connServiceMap.values()) {
            wi4Var.g();
        }
    }

    private ConnectionServiceManager() {
        this.connServiceMap = new ConcurrentHashMap();
        this.isInit = new AtomicBoolean();
        this.processStateListener = new a();
        setServiceType();
    }

    public void coldLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32dd4be", new Object[]{this});
            return;
        }
        try {
            ALog.e(TAG, "coldLaunch", new Object[0]);
            com.taobao.accs.connection.a.connLock.a();
        } catch (Exception e) {
            ALog.e(TAG, "coldLaunch err", e, new Object[0]);
        }
    }

    public IConnection getConnectionWrapper(String str) {
        IConnection iConnection;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("1eb52e35", new Object[]{this, str});
        }
        try {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            wi4 wi4Var = this.connServiceMap.get(str);
            if (wi4Var == null) {
                if (isDual()) {
                    wi4Var = new j08();
                } else {
                    if (!TextUtils.isEmpty(configByTag.getConnType())) {
                        str2 = configByTag.getConnType();
                    } else {
                        str2 = this.serviceType;
                    }
                    wi4Var = getConnServiceByType(str2);
                }
                this.connServiceMap.put(str, wi4Var);
            }
            iConnection = wi4Var.a(str, configByTag);
        } catch (Throwable th) {
            ALog.e(TAG, "getConnectionWrapper err", th, new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_VERIFY, "getConnectionWrapper err", vu3.b.GEO_NOT_SUPPORT);
            iConnection = null;
        }
        if (iConnection == null) {
            ALog.e(TAG, "getConnectionWrapper Null", new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_VERIFY, "getConnectionWrapper null", vu3.b.GEO_NOT_SUPPORT);
        }
        return iConnection;
    }

    public void onBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb02f3e", new Object[]{this, str});
            return;
        }
        for (IConnection iConnection : getConnections(str)) {
            try {
                iConnection.sendMessage(Message.buildBackground(iConnection.getHost(null)));
                iConnection.setForeBackState(0);
                if (MassClient.getInstance().isNotEmpty()) {
                    ALog.i(TAG, "send mass background state frame", new Object[0]);
                    iConnection.sendMessage(Message.buildMassMessage(iConnection.getAppkey(), "back", "powermsg", iConnection.getHost(null), iConnection.getConfigTag(), GlobalClientInfo.getContext()));
                }
            } catch (Exception e) {
                ALog.e(TAG, "onBackground err", e, new Object[0]);
            }
        }
        this.connServiceMap.get(str).d();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.isInit.getAndSet(true)) {
            ALog.e(TAG, "already init", new Object[0]);
        } else {
            ALog.e(TAG, "init", new Object[0]);
            if (czv.g(GlobalClientInfo.getContext()) && !"3".equals(this.serviceType)) {
                re.B(this.processStateListener);
            }
        }
    }

    public boolean isCurProcessAllow2Connect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cde2dd", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!this.connServiceMap.containsKey(str) && m8l.n()) {
                getConnectionWrapper(str);
            }
        } catch (Exception e) {
            ALog.e(TAG, "isCurProcessAllow2Connect err", e, new Object[0]);
        }
        if (isAllWeather(str) && !((com.taobao.accs.connection.a) this.connServiceMap.get(str)).n()) {
            return false;
        }
        if (isDual()) {
            return UtilityImpl.isMainProcess(GlobalClientInfo.getContext());
        }
        if (this.connServiceMap.get(str) instanceof wv9) {
            return UtilityImpl.isMainProcess(GlobalClientInfo.getContext());
        }
        return true;
    }
}
