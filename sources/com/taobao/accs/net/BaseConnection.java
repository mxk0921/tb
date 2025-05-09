package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.AckExtraData;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.MessageBizAck;
import com.taobao.accs.data.MessageHandler;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import tb.brt;
import tb.c71;
import tb.h1p;
import tb.iiz;
import tb.j8l;
import tb.lef;
import tb.m8l;
import tb.pu3;
import tb.rd0;
import tb.t2o;
import tb.vu3;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int CONNECTED = 1;
    public static final int CONNECTING = 2;
    public static final int DISCONNECTED = 3;
    public static final int DISCONNECTING = 4;
    public static final int FRAME_TYPE = 200;
    public static final int FRAME_TYPE_QUIC_DATAGRAM = 202;
    public static final int FRAME_TYPE_QUIC_STREAM = 201;
    public static final int INAPP = 1;
    public static final int MAX_DATA_SIZE = 49152;
    public static final int MAX_QUEUE_SIZE = 1000;
    public static final int RESEND_ACK_DELAY = 5000;
    public static final int RESEND_DELAY = 2000;
    public static final int SERVICE = 0;
    public static volatile long s = 0;
    public static volatile int t = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f6078a;
    public String b;
    public final int c;
    public final Context d;
    public final MessageHandler e;
    public pu3 h;
    public AccsClientConfig i;
    public String j;
    public String l;
    public String r;
    public long f = 0;
    public volatile boolean g = false;
    public String k = null;
    public boolean m = false;
    public final ConcurrentMap<String, MessageBizAck> n = new ConcurrentHashMap();
    public final LinkedHashMap<Integer, Message> o = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/net/BaseConnection$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public final ArrayList<AccsConnectStateListener> p = new ArrayList<>();
    public final List<IHeartBeat> q = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.d(BaseConnection.this.o(), "startChannelService", new Object[0]);
            Intent intent = new Intent(Constants.ACTION_START_SERVICE);
            intent.putExtra("appKey", BaseConnection.this.i());
            intent.putExtra("ttid", BaseConnection.this.f6078a);
            intent.putExtra("packageName", GlobalClientInfo.getContext().getPackageName());
            intent.putExtra("app_sercet", BaseConnection.this.i.getAppSecret());
            intent.putExtra("mode", AccsClientConfig.mEnv);
            intent.putExtra(Config.PROPERTY_APP_KEY, Config.getAgooAppKey(GlobalClientInfo.getContext()));
            intent.putExtra(Constants.KEY_CONFIG_TAG, BaseConnection.this.r);
            intent.setClassName(GlobalClientInfo.getContext().getPackageName(), xd0.channelService);
            lef.f(GlobalClientInfo.getContext(), intent);
            Intent intent2 = new Intent();
            intent2.setAction(AgooConstants.INTENT_FROM_AGOO_REPORT);
            intent2.setPackage(GlobalClientInfo.getContext().getPackageName());
            intent2.setClassName(GlobalClientInfo.getContext().getPackageName(), rd0.a(GlobalClientInfo.getContext().getPackageName()));
            lef.f(GlobalClientInfo.getContext(), intent2);
        }
    }

    static {
        t2o.a(343933152);
    }

    public BaseConnection(Context context, int i, String str) {
        this.b = "";
        this.c = i;
        this.d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        this.i = configByTag;
        if (configByTag == null) {
            ALog.e(o(), "BaseConnection config null!!", new Object[0]);
            try {
                this.i = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e) {
                ALog.e(o(), "BaseConnection build config", e, new Object[0]);
            }
        }
        AccsClientConfig accsClientConfig = this.i;
        if (accsClientConfig != null) {
            this.r = accsClientConfig.getTag();
            this.b = this.i.getAppKey();
        }
        MessageHandler messageHandler = new MessageHandler(context, this);
        this.e = messageHandler;
        messageHandler.d = this.c;
        String o = o();
        ALog.e(o, "new connection " + this.r, new Object[0]);
    }

    public void A(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd80fc3d", new Object[]{this, message, new Integer(i)});
        } else {
            this.e.t(message, i);
        }
    }

    public abstract void B(String str, boolean z, String str2);

    public abstract void C(boolean z, boolean z2);

    public abstract void D();

    public void G(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
            return;
        }
        synchronized (this.p) {
            try {
                if (!this.p.contains(accsConnectStateListener)) {
                    this.p.add(accsConnectStateListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58851426", new Object[]{this, iHeartBeat});
            return;
        }
        synchronized (this.q) {
            try {
                if (!((ArrayList) this.q).contains(iHeartBeat)) {
                    ((ArrayList) this.q).add(iHeartBeat);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74fcd4e", new Object[]{this});
        }
    }

    public void J(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb9ebe2", new Object[]{this, message, new Boolean(z)});
        } else if (message.isAck || UtilityImpl.isNetworkConnected(this.d)) {
            long c = message.getType() != 2 ? this.e.e.c(message.serviceId, message.bizId) : 0L;
            if (c == -1) {
                ALog.e(o(), "sendMessage ready server limit high", "dataId", message.dataId);
                this.e.t(message, 70021);
            } else if (c == -1000) {
                ALog.e(o(), "sendMessage ready server limit high for brush", "dataId", message.dataId);
                this.e.t(message, 70023);
            } else {
                int i = (c > 0L ? 1 : (c == 0L ? 0 : -1));
                if (i > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.f;
                    if (currentTimeMillis > j) {
                        message.delyTime = c;
                    } else {
                        message.delyTime = (j + c) - System.currentTimeMillis();
                    }
                    this.f = System.currentTimeMillis() + message.delyTime;
                }
                if (UtilityImpl.isServiceIdPrintLog(message.serviceId) || i > 0) {
                    ALog.e(o(), "sendMessage ready", "dataId", message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
                }
                try {
                    if (TextUtils.isEmpty(this.j)) {
                        this.j = UtilityImpl.getDeviceId(this.d);
                    }
                    if (!message.isTimeOut()) {
                        L(message, z);
                        return;
                    }
                    ALog.e(o(), "sendMessage timeout-18", "dataId", message.dataId);
                    this.e.t(message, -18);
                } catch (RejectedExecutionException unused) {
                    this.e.t(message, 70008);
                    ALog.e(o(), "sendMessage ready queue full", new Object[0]);
                }
            }
        } else {
            ALog.e(o(), "sendMessage ready no network", "dataId", message.dataId);
            this.e.t(message, -13);
        }
    }

    public void K(MessageBizAck messageBizAck) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a309805", new Object[]{this, messageBizAck});
            return;
        }
        final String str = messageBizAck.dataId;
        ((ConcurrentHashMap) this.n).put(str, messageBizAck);
        brt.h().schedule(new Runnable() { // from class: tb.ss1
            @Override // java.lang.Runnable
            public final void run() {
                BaseConnection.this.x(str);
            }
        }, 5L, TimeUnit.SECONDS);
    }

    public abstract void L(Message message, boolean z);

    public void M(int i) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ddd90", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 1) {
            i2 = 0;
        }
        t = i2;
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8010b2d", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        }
    }

    public abstract void P();

    public void R(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
            return;
        }
        synchronized (this.p) {
            this.p.remove(accsConnectStateListener);
        }
    }

    public void S(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897b97ad", new Object[]{this, iHeartBeat});
            return;
        }
        synchronized (this.q) {
            ((ArrayList) this.q).remove(iHeartBeat);
        }
    }

    public String c(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7720c3b6", new Object[]{this, str});
        }
        String deviceId = UtilityImpl.getDeviceId(this.d);
        try {
            str2 = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.e(o(), "buildAuthUrl", th, new Object[0]);
            str2 = deviceId;
        }
        String appsign = UtilityImpl.getAppsign(this.d, i(), this.i.getAppSecret(), deviceId, this.r, !u());
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("auth");
        if (j8l.y(this.d)) {
            str3 = "?version=2";
        } else {
            str3 = "?";
        }
        sb.append(str3);
        if (j8l.y(this.d)) {
            str4 = "&0=" + j8l.p(this.d);
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append("&1=");
        sb.append(str2);
        sb.append("&2=");
        sb.append(appsign);
        sb.append("&3=");
        sb.append(i());
        if (this.k != null) {
            sb.append("&4=");
            sb.append(this.k);
        }
        sb.append("&5=");
        sb.append(this.c);
        sb.append("&6=");
        sb.append(UtilityImpl.getNetworkType(this.d));
        sb.append("&7=null&8=");
        if (this.c == 1) {
            i = "1.1.2";
        } else {
            i = 402;
        }
        sb.append(i);
        sb.append("&9=");
        sb.append(System.currentTimeMillis());
        sb.append("&10=1&11=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&12=");
        sb.append(this.d.getPackageName());
        sb.append("&13=");
        sb.append(UtilityImpl.getAppVersion(this.d));
        sb.append("&14=");
        sb.append(this.f6078a);
        sb.append("&15=");
        sb.append(UtilityImpl.urlEncode(Build.MODEL));
        sb.append("&16=");
        sb.append(UtilityImpl.urlEncode(Build.BRAND));
        sb.append("&17=");
        sb.append(j8l.l(this.d));
        sb.append("&19=");
        sb.append(!u());
        sb.append("&20=");
        sb.append(this.i.getStoreId());
        if (t != 0 || !j8l.a() || !UtilityImpl.isChannelProcess(this.d) || com.taobao.accs.connection.state.a.v().z(this.d)) {
            sb.append("&21=");
            sb.append(t);
        } else {
            sb.append("&21=3");
        }
        return sb.toString();
    }

    public abstract boolean e(String str);

    public abstract void f();

    public ArrayList<AccsConnectStateListener> g() {
        ArrayList<AccsConnectStateListener> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ec5e7075", new Object[]{this});
        }
        synchronized (this.p) {
            arrayList = new ArrayList<>(this.p);
        }
        return arrayList;
    }

    public List<IHeartBeat> h() {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6774531", new Object[]{this});
        }
        synchronized (this.q) {
            arrayList = new ArrayList(this.q);
        }
        return arrayList;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.b;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("294b4cea", new Object[]{this})).longValue();
        }
        return s;
    }

    public String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(h1p.HTTPS_PREFIX);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        sb.append(this.i.getInappHost());
        return sb.toString();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7740ac17", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c72d022", new Object[]{this})).longValue();
        }
        return s + SystemClock.elapsedRealtime();
    }

    public abstract String o();

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("790b8e31", new Object[]{this});
        }
        return this.l;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38e7cc90", new Object[]{this})).booleanValue();
        }
        if (2 == this.i.getSecurity()) {
            return true;
        }
        return false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe9f34f", new Object[]{this})).booleanValue();
        }
        AccsClientConfig accsClientConfig = this.i;
        if (accsClientConfig == null || accsClientConfig.getVersion() != 2 || !m8l.C()) {
            return false;
        }
        return true;
    }

    public abstract void z(String str);

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ecfbb", new Object[]{this});
            return;
        }
        try {
            brt.m(new a(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.w(o(), "startChannelService", th, new Object[0]);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3435fc9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e60e890e", new Object[]{this})).booleanValue();
        }
        return true ^ w();
    }

    public String d(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("736911a5", new Object[]{this, str});
        }
        String deviceId = UtilityImpl.getDeviceId(this.d);
        try {
            str2 = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.e(o(), "buildAuthUrl", th, new Object[0]);
            str2 = deviceId;
        }
        String createRegIdAppSign = UtilityImpl.getCreateRegIdAppSign(this.d, i(), this.i.getAppSecret(), deviceId, this.r, !u());
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("createRegId?did=");
        sb.append(str2);
        sb.append("&appKey=");
        sb.append(i());
        sb.append("&sign=");
        sb.append(createRegIdAppSign);
        sb.append("&sec=");
        sb.append(!u());
        sb.append("&version=1");
        return sb.toString();
    }

    public pu3 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pu3) ipChange.ipc$dispatch("b0f599aa", new Object[]{this});
        }
        if (this.h == null) {
            ALog.d(o(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.r);
            this.h = new pu3(this.d, this.r);
        }
        return this.h;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbada564", new Object[]{this})).booleanValue();
        }
        return t == 1;
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf9cdee", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
            ALog.e(o(), "reSendAck", "dataId", Integer.valueOf(i));
            Message message = this.o.get(Integer.valueOf(i));
            if (message != null) {
                E(message, 5000);
                c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, vu3.b.GEO_NOT_SUPPORT);
            }
        }
    }

    public boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3677674", new Object[]{this, context})).booleanValue();
        }
        try {
            ENV env = ENV.ONLINE;
            if (AccsClientConfig.mEnv == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (AccsClientConfig.mEnv == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.b).setAppSecret(this.i.getAppSecret()).setAuthCode(this.i.getAuthCode()).setEnv(env).setTag(this.i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.i.getInappPubKey() == 10 || this.i.getInappPubKey() == 11) {
                str = "open";
            }
            ALog.i(o(), "init awcn register new conn protocol host:", this.i.getInappHost());
            if (w()) {
                StrategyTemplate.getInstance().registerConnProtocol(this.i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP3, null, null, false));
            } else {
                StrategyTemplate.getInstance().registerConnProtocol(this.i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
            }
        } catch (Throwable th) {
            ALog.e(o(), "initAwcn", th, new Object[0]);
        }
        return true;
    }

    public final /* synthetic */ void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519e6175", new Object[]{this, str});
            return;
        }
        MessageBizAck messageBizAck = (MessageBizAck) ((ConcurrentHashMap) this.n).remove(str);
        if (messageBizAck != null) {
            ALog.e(o(), "send bizAck now due to timeout", "dataId", messageBizAck.dataId);
            L(messageBizAck, true);
        }
    }

    public boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd9b921", new Object[]{this, str})).booleanValue();
        }
        MessageBizAck messageBizAck = (MessageBizAck) ((ConcurrentHashMap) this.n).remove(str);
        if (messageBizAck != null) {
            ALog.e(o(), "send bizAck now due to notify", "dataId", str);
            messageBizAck.updateExtHeader(20, "0");
            L(messageBizAck, true);
            return true;
        }
        ALog.e(o(), "try notifyMsgDelivery but unsentBizAck null", "dataId", str);
        return false;
    }

    public boolean E(Message message, int i) {
        Throwable th;
        int i2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7abdf262", new Object[]{this, message, new Integer(i)})).booleanValue();
        }
        try {
            i2 = message.retryTimes;
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        if (i2 > 3) {
            return false;
        }
        message.retryTimes = i2 + 1;
        message.delyTime = i;
        ALog.e(o(), "reSend", "dataid", message.dataId, "delay", Integer.valueOf(i), " retryTimes", Integer.valueOf(message.retryTimes));
        J(message, true);
        try {
            if (message.getNetPermanceMonitor() != null) {
                NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                int i3 = message.retryTimes;
                netPermanceMonitor.retry_times = i3;
                if (i3 == 1) {
                    c71.c("accs", BaseMonitor.COUNT_POINT_RESEND, iiz.PERF_STAG_TOTAL, vu3.b.GEO_NOT_SUPPORT);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            this.e.t(message, -8);
            ALog.e(o(), "reSend error", th, new Object[0]);
            return z;
        }
        return z;
    }

    public boolean b(String str, String str2, AckExtraData ackExtraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67adc39", new Object[]{this, str, str2, ackExtraData})).booleanValue();
        }
        MessageBizAck messageBizAck = (MessageBizAck) ((ConcurrentHashMap) this.n).get(str);
        if (messageBizAck != null) {
            ALog.e(o(), "update bizAckInfo for", "dataId", str, Constants.KEY_STEPID, str2);
            messageBizAck.update(str2, ackExtraData);
            return true;
        }
        ALog.e(o(), "try addBizAckInfo but unsentBizAck null", "dataId", str);
        return false;
    }
}
