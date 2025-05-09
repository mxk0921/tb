package org.android.spdy;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.NetWorkStatusUtil;
import org.android.spdy.ProtectedPointer;
import org.android.spdy.SpdyProtocol;
import org.json.JSONException;
import org.json.JSONObject;
import tb.d61;
import tb.l0r;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpdySession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APPKEY_SPLIT = "_";
    public static final int CUSTOM_FRAME_QUIC_DGRAM_UNRELIABLE_CHANNEL_TYPE = 202;
    public static final int CUSTOM_FRAME_QUIC_RELIABLE_CHANNEL_TYPE = 201;
    private static final int DEFAULE_UNRELIABLECHANNEL_MSS = -1;
    public static final int NETWORK_CHANGED = 4;
    private static final int P_CONNECT_FEC_ENABLE = 16;
    private static final int P_CONNECT_QPACK_RESIZE_ENABLE = 32;
    private static final int P_CONNECT_QUIC_0RTT_FAST_TIMEOUT = 8;
    private static final int P_CONNECT_QUIC_PTO_OPT_ENABLE = 1;
    private static final int P_CONNECT_RECV_BUFFER_RESIZE_ENABLE = 4;
    private static final int P_REQUEST_LIMIT_SPEED_ENABLE = 2;
    private static final String SCHEME_SPLIT = "://";
    private static final String TAG = "tnetsdk.SpdySession";
    private final SpdyAgent agent;
    private final String authority;
    private final String certHost;
    private final AtomicBoolean closed;
    public long connectTaskStartTime;
    public SessionCustomExtraCb customExtraCb;
    private final String domain;
    public boolean isBg;
    private boolean isMultiPathCompensateEnable;
    private boolean isMultiPathParallelAddSpeedEnable;
    public String mHost;
    private int mUsedProtocolMode;
    private int mode;
    public int options;
    private final ProtectedPointer pptr4sessionNativePtr;
    private int pubkey_seqnum;
    private String seq;
    public SessionCb sessionCallBack;
    private volatile long sessionNativePtr;
    private volatile String sessionPoolUniqueKey;
    private NetSparseArray<SpdyStreamContext> spdyStream;
    private String tunnelHost;
    private ArrayList<StrategyInfo> tunnelInfoArrayList;
    private Object userData;
    private final AtomicBoolean sessionClearedFromSessionMgr = new AtomicBoolean(false);
    private boolean isTunnelProxyClose = false;
    public AtomicBoolean isAddInterfaceListen = new AtomicBoolean(false);
    public int unreliableChannelMss = -1;
    private int sessionParameter = 0;
    private JSONObject extra = null;
    private final Object lock = new Object();
    private int streamcount = 1;
    public volatile int refcount = 1;
    private int forceCellularType = 0;
    public SuperviseConnectInfo mSuperviseConnectInfo = new SuperviseConnectInfo();
    private NetWorkStatusUtil.a NetworkStatusChangeListener = new NetWorkStatusUtil.a() { // from class: org.android.spdy.SpdySession.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // org.android.spdy.NetWorkStatusUtil.a
        public void onNetworkStatusChanged(NetWorkStatusUtil.InterfaceStatus interfaceStatus, boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29868ea2", new Object[]{this, interfaceStatus, new Boolean(z)});
            } else if (!d61.e() || !l0r.u() || interfaceStatus != NetWorkStatusUtil.InterfaceStatus.ACTIVE_INTERFACE_CELLULAR || !z) {
                int interfaceStatus2 = interfaceStatus.getInterfaceStatus() << 16;
                if (z) {
                    interfaceStatus2 |= 1;
                }
                try {
                    i = SpdySession.this.setOption(4, interfaceStatus2);
                } catch (SpdyErrorException e) {
                    i = e.SpdyErrorGetCode();
                } catch (Exception unused) {
                    i = 0;
                }
                String sessionSeq = SpdySession.this.getSessionSeq();
                Integer valueOf = Integer.valueOf(interfaceStatus.getInterfaceStatus());
                Boolean valueOf2 = Boolean.valueOf(z);
                spduLog.Tloge(SpdySession.TAG, sessionSeq, "[onNetworkStatusChanged]", pg1.ATOM_interface, valueOf, "isAvaiable", valueOf2, "changeValue", "0x" + Integer.toHexString(interfaceStatus2), AmnetMonitorLoggerListener.LogModel.ERR_CODE, Integer.valueOf(i));
            }
        }
    };
    public Intenalcb intenalcb = new SpdySessionCallBack();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum QosLevel {
        HIGHEST(1),
        HIGH(2),
        MEDIUM(3),
        NORMAL(4),
        LOW(5),
        LOWEST(6),
        DEFAULT_LEVEL(4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int qosLevel;

        QosLevel(int i) {
            this.qosLevel = i;
        }

        public static /* synthetic */ Object ipc$super(QosLevel qosLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/SpdySession$QosLevel");
        }

        public static QosLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QosLevel) ipChange.ipc$dispatch("b905d5c9", new Object[]{str});
            }
            return (QosLevel) Enum.valueOf(QosLevel.class, str);
        }

        public int getQosLevel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("272bc1df", new Object[]{this})).intValue();
            }
            return this.qosLevel;
        }
    }

    public SpdySession(long j, SpdyAgent spdyAgent, String str, String str2, String str3, String str4, SessionCb sessionCb, SessionCustomExtraCb sessionCustomExtraCb, int i, int i2, Object obj, String str5, ArrayList<StrategyInfo> arrayList, boolean z, boolean z2, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.closed = atomicBoolean;
        this.mHost = null;
        this.isMultiPathCompensateEnable = false;
        this.isMultiPathParallelAddSpeedEnable = false;
        this.connectTaskStartTime = 0L;
        this.options = 0;
        this.isBg = false;
        this.customExtraCb = null;
        this.sessionCallBack = null;
        this.pubkey_seqnum = 0;
        this.userData = null;
        this.mode = 0;
        this.tunnelInfoArrayList = null;
        this.spdyStream = null;
        this.sessionNativePtr = j;
        ProtectedPointer protectedPointer = new ProtectedPointer(this);
        this.pptr4sessionNativePtr = protectedPointer;
        protectedPointer.setHow2close(new ProtectedPointer.a() { // from class: org.android.spdy.SpdySession.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // org.android.spdy.ProtectedPointer.a
            public void close(Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4698949b", new Object[]{this, obj2});
                    return;
                }
                SpdySession spdySession = (SpdySession) obj2;
                SpdySession.access$100(spdySession, SpdySession.access$000(spdySession));
                spdySession.setSessionNativePtr(0L);
            }
        });
        this.spdyStream = new NetSparseArray<>(5);
        this.agent = spdyAgent;
        this.authority = str;
        this.domain = str2;
        this.certHost = str4;
        this.sessionCallBack = sessionCb;
        this.customExtraCb = sessionCustomExtraCb;
        this.mode = i;
        this.mUsedProtocolMode = i;
        this.pubkey_seqnum = i2;
        this.userData = obj;
        this.tunnelHost = str5;
        this.tunnelInfoArrayList = arrayList;
        this.mHost = str3;
        this.isMultiPathParallelAddSpeedEnable = z2;
        this.isMultiPathCompensateEnable = z;
        this.options = i3;
        this.connectTaskStartTime = System.currentTimeMillis();
        this.isBg = d61.d();
        atomicBoolean.set(false);
    }

    private native int NotifyNotInvokeAnyMoreN(long j);

    public static /* synthetic */ long access$000(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffc64c68", new Object[]{spdySession})).longValue();
        }
        return spdySession.sessionNativePtr;
    }

    public static /* synthetic */ int access$100(SpdySession spdySession, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a565562", new Object[]{spdySession, new Long(j)})).intValue();
        }
        return spdySession.NotifyNotInvokeAnyMoreN(j);
    }

    private String getAuthority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dac808c", new Object[]{this});
        }
        return this.authority;
    }

    public static String getHostFromDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baafc2e3", new Object[]{str});
        }
        try {
            int indexOf = str.indexOf("_");
            if (indexOf > 0) {
                return str.substring(str.indexOf("://") + 3, indexOf);
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    private StrategyInfo getStrategyInfoBySeq(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyInfo) ipChange.ipc$dispatch("87969029", new Object[]{this, new Integer(i)});
        }
        ArrayList<StrategyInfo> arrayList = this.tunnelInfoArrayList;
        if (!(arrayList == null || arrayList == Collections.EMPTY_LIST)) {
            for (int i2 = 0; i2 < this.tunnelInfoArrayList.size(); i2++) {
                StrategyInfo strategyInfo = this.tunnelInfoArrayList.get(i2);
                if (strategyInfo.getTunnelStrategySeq() == i) {
                    return strategyInfo;
                }
            }
        }
        return null;
    }

    private void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
            return;
        }
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private native int sendCustomControlFrameN(long j, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr);

    private native int sendHeadersN(long j, int i, String[] strArr, boolean z);

    private void sessionIsOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c79b851", new Object[]{this});
        } else if (this.closed.get()) {
            throw new SpdyErrorException("session is already closed: -1104", (int) TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        }
    }

    private native int setOptionN(long j, int i, int i2);

    private native int streamCloseN(long j, int i, int i2);

    private native int streamSendDataN(long j, int i, byte[] bArr, int i2, int i3, boolean z);

    private native int submitPingN(long j);

    private native int submitRequestN(long j, String str, byte b, String[] strArr, byte[] bArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public void clearAllStreamCb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fb473a", new Object[]{this});
            return;
        }
        spduLog.Logd(TAG, "[SpdySession.clearAllStreamCb] - ");
        synchronized (this.lock) {
            this.spdyStream.clear();
        }
    }

    public SpdyStreamContext[] getAllStreamCb() {
        SpdyStreamContext[] spdyStreamContextArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyStreamContext[]) ipChange.ipc$dispatch("6797af7a", new Object[]{this});
        }
        synchronized (this.lock) {
            try {
                int size = this.spdyStream.size();
                if (size > 0) {
                    spdyStreamContextArr = new SpdyStreamContext[size];
                    this.spdyStream.toArray(spdyStreamContextArr);
                } else {
                    spdyStreamContextArr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return spdyStreamContextArr;
    }

    public int getConnectFastTimeout(int i) {
        long k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dad5f9de", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!l0r.r() || !l0r.v(this.mHost)) {
            return i;
        }
        if (isQUIC()) {
            if (i > 0 && l0r.h() >= i) {
                return i;
            }
            k = l0r.h();
        } else if (i > 0 && l0r.k() >= i) {
            return i;
        } else {
            k = l0r.k();
        }
        return (int) k;
    }

    public String getConnectInfoOnConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6b384f1", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("mode=");
        sb.append(this.mode);
        sb.append(",ip=");
        sb.append(this.mSuperviseConnectInfo.ip);
        sb.append(",createTime=");
        sb.append(this.mSuperviseConnectInfo.createTime);
        sb.append(",connectTime=");
        sb.append(this.mSuperviseConnectInfo.connectTime);
        sb.append(",handshakeTime=");
        sb.append(this.mSuperviseConnectInfo.handshakeTime);
        sb.append(",doHandshakeTime=");
        sb.append(this.mSuperviseConnectInfo.doHandshakeTime);
        sb.append(",isForceCellular=");
        sb.append(this.mSuperviseConnectInfo.isForceCellular);
        if (isQUIC()) {
            sb.append(",scid=");
            sb.append(this.mSuperviseConnectInfo.scid);
            sb.append(",dcid=");
            sb.append(this.mSuperviseConnectInfo.dcid);
            sb.append(",ccType=");
            sb.append(this.mSuperviseConnectInfo.congControlKind);
            sb.append(",try0RTT=");
            sb.append(this.mSuperviseConnectInfo.isQuicTry0RTT);
            if (isTunnel()) {
                sb.append(",isTlClose=");
                sb.append(this.isTunnelProxyClose);
                sb.append(",tlType=");
                sb.append(this.mSuperviseConnectInfo.tunnelType);
                sb.append(",tlScid=");
                sb.append(this.mSuperviseConnectInfo.tunnelScid);
                sb.append(",tlDcid=");
                sb.append(this.mSuperviseConnectInfo.tunnelDcid);
                sb.append(",tlConnectTime=");
                sb.append(this.mSuperviseConnectInfo.tunnelConnectTime);
                if (this.mSuperviseConnectInfo.tunnelInfo != null) {
                    sb.append(",tlIp=");
                    sb.append(this.mSuperviseConnectInfo.tunnelInfo.getTunnelStrategyHost());
                    sb.append(",tlPort=");
                    sb.append(this.mSuperviseConnectInfo.tunnelInfo.getTunnelStrategyPort());
                    sb.append(",tlStrategyStatus=");
                    sb.append(this.mSuperviseConnectInfo.currStrategyStatus);
                }
            }
        }
        return sb.toString();
    }

    public String getConnectInfoOnDisConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4abf6ebd", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append(getConnectInfoOnConnected());
        sb.append(",reusedCnt=");
        sb.append(this.mSuperviseConnectInfo.reused_counter);
        sb.append(",keepAlive=");
        sb.append(this.mSuperviseConnectInfo.keepalive_period_second);
        sb.append(",srtt=");
        sb.append(this.mSuperviseConnectInfo.srtt);
        sb.append(",sendSz=");
        sb.append(this.mSuperviseConnectInfo.connSendSize);
        sb.append(",recvSz=");
        sb.append(this.mSuperviseConnectInfo.connRecvSize);
        sb.append(",upMaxMtu=");
        sb.append(this.mSuperviseConnectInfo.upMaxMtu);
        sb.append(",recvMax=");
        sb.append(this.mSuperviseConnectInfo.recvPacketMax);
        sb.append(",sendPktCnt=");
        sb.append(this.mSuperviseConnectInfo.sendPacketCount);
        sb.append(",recvPktCnt=");
        sb.append(this.mSuperviseConnectInfo.recvPacketCount);
        sb.append(",connRdIdleTime=");
        sb.append(this.mSuperviseConnectInfo.connLastRdEventIdleTime);
        sb.append(",pubkeyRetry=");
        sb.append(this.mSuperviseConnectInfo.pubkeyRetry);
        sb.append(",sslHsk=");
        sb.append(this.mSuperviseConnectInfo.handshakeStat);
        sb.append(",datagramMss=");
        sb.append(this.unreliableChannelMss);
        if (isQUIC()) {
            sb.append(",retransRate=");
            sb.append(this.mSuperviseConnectInfo.retransmissionRate);
            sb.append(",tlpCnt=");
            sb.append(this.mSuperviseConnectInfo.tlpCount);
            sb.append(",rtoCnt=");
            sb.append(this.mSuperviseConnectInfo.rtoCount);
            sb.append(",sendCnt=");
            sb.append(this.mSuperviseConnectInfo.sendCount);
            sb.append(",recvCnt=");
            sb.append(this.mSuperviseConnectInfo.recvCount);
            sb.append(",lossRate=");
            sb.append(this.mSuperviseConnectInfo.lossRate);
            sb.append(",0RttStatus=");
            sb.append(this.mSuperviseConnectInfo.xqc0RttStatus);
            sb.append(",multiNet=");
            sb.append(this.mSuperviseConnectInfo.multiNetStatus);
            sb.append(",mpStatus=");
            sb.append(this.mSuperviseConnectInfo.mpquicStatus);
            sb.append(",sendWeight=");
            sb.append(this.mSuperviseConnectInfo.defaultPathSendWeight);
            sb.append(",recvWeight=");
            sb.append(this.mSuperviseConnectInfo.defaultPathRecvWeight);
            sb.append(",bgForbiddenTime=");
            sb.append(this.mSuperviseConnectInfo.bgForbiddenTime);
            sb.append(",mpPathInfo=");
            sb.append(this.mSuperviseConnectInfo.mpquicPathInfo);
            if (isTunnel()) {
                sb.append(",tl0RTTStatus=");
                sb.append(this.mSuperviseConnectInfo.tunnel0RTTStatus);
                sb.append(",tlRetryTimes=");
                sb.append(this.mSuperviseConnectInfo.tunnelRetryTimes);
                sb.append(",tlDegraded=");
                sb.append(this.mSuperviseConnectInfo.tunnelDegraded);
                sb.append(",tlErrorCode=");
                sb.append(this.mSuperviseConnectInfo.tunnelErrorCode);
            }
        }
        sb.append(",");
        sb.append(getExternStat());
        return sb.toString();
    }

    public int getConnectTryForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33812b92", new Object[]{this, new Boolean(z)})).intValue();
        }
        try {
            if (z) {
                this.forceCellularType = 2;
            } else if (!l0r.H(this.mHost) || SpdyAgent.wifiConsecutiveFailCount < 2) {
                return 0;
            } else {
                this.forceCellularType = 1;
            }
        } catch (Exception unused) {
        }
        if (l0r.K() && this.isMultiPathCompensateEnable) {
            if (NetWorkStatusUtil.isWifi() && NetWorkStatusUtil.cellularNetwork != null) {
                if (d61.e() && l0r.u()) {
                    this.forceCellularType = -3;
                }
                return this.forceCellularType;
            }
            this.forceCellularType = -2;
            return this.forceCellularType;
        }
        this.forceCellularType = -1;
        return this.forceCellularType;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.domain;
    }

    public String getExternStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8a3972f", new Object[]{this});
        }
        putExtra("qcStat", Integer.valueOf(SoInstallMgrSdk.loadQuicStat));
        putExtra("net", Integer.valueOf(NetWorkStatusUtil.getCurrentNetworkStats()));
        putExtra("mpNetEnv", NetWorkStatusUtil.getMultiNetEnvTrace());
        JSONObject jSONObject = this.extra;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "null";
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
        }
        return this.mode;
    }

    public int getRefCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a97da52c", new Object[]{this})).intValue();
        }
        return this.refcount;
    }

    public int getSessionParameter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac20923", new Object[]{this})).intValue();
        }
        return this.sessionParameter;
    }

    public String getSessionPoolUniqueKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d823cca7", new Object[]{this});
        }
        return this.sessionPoolUniqueKey;
    }

    public String getSessionSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eac5f67a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.seq)) {
            this.seq = Integer.toHexString(hashCode());
        }
        return this.seq;
    }

    public SpdyStreamContext getSpdyStream(int i) {
        SpdyStreamContext spdyStreamContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyStreamContext) ipChange.ipc$dispatch("ea52d066", new Object[]{this, new Integer(i)});
        }
        if (i <= 0) {
            return null;
        }
        synchronized (this.lock) {
            spdyStreamContext = this.spdyStream.get(i);
        }
        return spdyStreamContext;
    }

    public int getUsedProtocolMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c40fe1a8", new Object[]{this})).intValue();
        }
        return this.mUsedProtocolMode;
    }

    public Object getUserData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3c756e0", new Object[]{this});
        }
        return this.userData;
    }

    public void increRefCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ff3bf4", new Object[]{this});
        } else {
            this.refcount++;
        }
    }

    public boolean isForceUseCellular() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c9241fb", new Object[]{this})).booleanValue();
        }
        if (this.mSuperviseConnectInfo.isForceCellular > 0) {
            return true;
        }
        return false;
    }

    public boolean isHTTP3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ee069cc", new Object[]{this})).booleanValue();
        }
        if ((this.mode & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMultiPathMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6120fc2", new Object[]{this})).booleanValue();
        }
        if ((this.mode & 2048) == 0 && (this.mUsedProtocolMode & 2048) == 0) {
            return false;
        }
        return true;
    }

    public boolean isQUIC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe592f3", new Object[]{this})).booleanValue();
        }
        if (isHTTP3() || (this.mode & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isQuicTry0RTT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98884ec0", new Object[]{this})).booleanValue();
        }
        if (this.mSuperviseConnectInfo.isQuicTry0RTT == 1) {
            return true;
        }
        return false;
    }

    public boolean isTunnel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6089dbd", new Object[]{this})).booleanValue();
        }
        if ((this.mode & 512) != 0) {
            return true;
        }
        return false;
    }

    public boolean isTunnelProxyClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a896687", new Object[]{this})).booleanValue();
        }
        return this.isTunnelProxyClose;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
        if ((r1 & 2048) != 0) goto L_0x0188;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void preProcessProtocol(byte[] r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdySession.preProcessProtocol(byte[], java.lang.String):void");
    }

    public void registerNetworkStatusChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20846bc8", new Object[]{this});
        } else if (!this.isAddInterfaceListen.getAndSet(true)) {
            NetWorkStatusUtil.addInterfaceStatusChangeListener(this.NetworkStatusChangeListener);
        }
    }

    public void releasePptr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69e472c", new Object[]{this});
        } else {
            this.pptr4sessionNativePtr.release();
        }
    }

    public void removeSpdyStream(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8353a6", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            synchronized (this.lock) {
                this.spdyStream.remove(i);
            }
        }
    }

    public int sendCustomControlFrame(int i, int i2, int i3, int i4, byte[] bArr) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8afa674a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr})).intValue() : sendCustomControlFrame(SpdyProtocol.DataChannel.ReliableChannel, QosLevel.DEFAULT_LEVEL, i, i2, i3, i4, bArr);
    }

    public void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else {
            this.mode = i;
        }
    }

    public int setOption(int i, int i2) throws SpdyErrorException {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a90e0951", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        sessionIsOpen();
        if (this.pptr4sessionNativePtr.enter()) {
            i3 = setOptionN(this.sessionNativePtr, i, i2);
            this.pptr4sessionNativePtr.exit();
        } else {
            i3 = -2001;
        }
        if (i3 == 0) {
            return i3;
        }
        throw new SpdyErrorException("setOption error: " + i3, i3);
    }

    public void setSessionNativePtr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c7b71a", new Object[]{this, new Long(j)});
        } else {
            this.sessionNativePtr = j;
        }
    }

    public void setSessionPoolUniqueKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109f70af", new Object[]{this, str});
        } else {
            this.sessionPoolUniqueKey = str;
        }
    }

    public void setSuperviseConnectInfoOnConnectedCB(SuperviseConnectInfo superviseConnectInfo) {
        StrategyInfo strategyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a6ec41", new Object[]{this, superviseConnectInfo});
        } else if (superviseConnectInfo != null) {
            SuperviseConnectInfo superviseConnectInfo2 = this.mSuperviseConnectInfo;
            superviseConnectInfo.createTime = superviseConnectInfo2.createTime;
            superviseConnectInfo2.ip = superviseConnectInfo.ip;
            superviseConnectInfo2.connectTime = superviseConnectInfo.connectTime;
            superviseConnectInfo2.retryTimes = superviseConnectInfo.retryTimes;
            superviseConnectInfo2.timeout = superviseConnectInfo.timeout;
            superviseConnectInfo2.handshakeTime = superviseConnectInfo.handshakeTime;
            superviseConnectInfo2.doHandshakeTime = superviseConnectInfo.doHandshakeTime;
            superviseConnectInfo2.sessionTicketReused = superviseConnectInfo.sessionTicketReused;
            int i = superviseConnectInfo.isForceCellular;
            if ((i > 0 && this.forceCellularType > 0) || (i == 0 && this.forceCellularType < 0)) {
                superviseConnectInfo.isForceCellular = this.forceCellularType;
            }
            superviseConnectInfo2.isForceCellular = superviseConnectInfo.isForceCellular;
            if (isQUIC()) {
                SuperviseConnectInfo superviseConnectInfo3 = this.mSuperviseConnectInfo;
                superviseConnectInfo3.scid = superviseConnectInfo.scid;
                superviseConnectInfo3.dcid = superviseConnectInfo.dcid;
                superviseConnectInfo3.congControlKind = superviseConnectInfo.congControlKind;
                superviseConnectInfo3.isQuicTry0RTT = superviseConnectInfo.isQuicTry0RTT;
                if (isTunnel()) {
                    SuperviseConnectInfo superviseConnectInfo4 = this.mSuperviseConnectInfo;
                    superviseConnectInfo4.currStrategySeq = superviseConnectInfo.currStrategySeq;
                    superviseConnectInfo4.currStrategyStatus = superviseConnectInfo.currStrategyStatus;
                    superviseConnectInfo4.tunnelScid = superviseConnectInfo.tunnelScid;
                    superviseConnectInfo4.tunnelDcid = superviseConnectInfo.tunnelDcid;
                    superviseConnectInfo4.tunnelConnectTime = superviseConnectInfo.tunnelConnectTime;
                    superviseConnectInfo4.tunnelType = superviseConnectInfo.tunnelType;
                    try {
                        if (this.isTunnelProxyClose) {
                            ArrayList<StrategyInfo> arrayList = this.tunnelInfoArrayList;
                            strategyInfo = (arrayList == null || arrayList == Collections.EMPTY_LIST) ? null : arrayList.get(0);
                        } else {
                            strategyInfo = getStrategyInfoBySeq(superviseConnectInfo.currStrategySeq);
                            if (strategyInfo != null) {
                                strategyInfo.setStrategyStatus(superviseConnectInfo.currStrategyStatus);
                            }
                        }
                        SuperviseConnectInfo superviseConnectInfo5 = this.mSuperviseConnectInfo;
                        superviseConnectInfo.tunnelInfo = strategyInfo;
                        superviseConnectInfo5.tunnelInfo = strategyInfo;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public void setSuperviseConnectInfoOnDisconnectedCB(SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64a3a3d", new Object[]{this, superviseConnectInfo});
        } else if (superviseConnectInfo != null) {
            SuperviseConnectInfo superviseConnectInfo2 = this.mSuperviseConnectInfo;
            superviseConnectInfo2.reused_counter = superviseConnectInfo.reused_counter;
            superviseConnectInfo2.keepalive_period_second = superviseConnectInfo.keepalive_period_second;
            superviseConnectInfo2.timeout = superviseConnectInfo.timeout;
            superviseConnectInfo2.handshakeTime = superviseConnectInfo.handshakeTime;
            superviseConnectInfo2.doHandshakeTime = superviseConnectInfo.doHandshakeTime;
            superviseConnectInfo2.sessionTicketReused = superviseConnectInfo.sessionTicketReused;
            superviseConnectInfo2.srtt = superviseConnectInfo.srtt;
            superviseConnectInfo2.connRecvSize = superviseConnectInfo.connRecvSize;
            superviseConnectInfo2.connSendSize = superviseConnectInfo.connSendSize;
            superviseConnectInfo2.recvPacketCount = superviseConnectInfo.recvPacketCount;
            superviseConnectInfo2.sendPacketCount = superviseConnectInfo.sendPacketCount;
            superviseConnectInfo2.recvPacketMax = superviseConnectInfo.recvPacketMax;
            superviseConnectInfo2.connLastRdEventIdleTime = superviseConnectInfo.connLastRdEventIdleTime;
            superviseConnectInfo2.pubkeyRetry = superviseConnectInfo.pubkeyRetry;
            superviseConnectInfo2.handshakeStat = superviseConnectInfo.handshakeStat;
            if (isQUIC()) {
                SuperviseConnectInfo superviseConnectInfo3 = this.mSuperviseConnectInfo;
                superviseConnectInfo3.retransmissionRate = superviseConnectInfo.retransmissionRate;
                superviseConnectInfo3.lossRate = superviseConnectInfo.lossRate;
                superviseConnectInfo3.tlpCount = superviseConnectInfo.tlpCount;
                superviseConnectInfo3.rtoCount = superviseConnectInfo.rtoCount;
                superviseConnectInfo3.sendCount = superviseConnectInfo.sendCount;
                superviseConnectInfo3.recvCount = superviseConnectInfo.recvCount;
                superviseConnectInfo3.upMaxMtu = superviseConnectInfo.upMaxMtu;
                superviseConnectInfo3.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                superviseConnectInfo3.multiNetStatus = superviseConnectInfo.multiNetStatus;
                superviseConnectInfo3.mpquicStatus = superviseConnectInfo.mpquicStatus;
                superviseConnectInfo3.defaultPathRecvWeight = superviseConnectInfo.defaultPathRecvWeight;
                superviseConnectInfo3.defaultPathSendWeight = superviseConnectInfo.defaultPathSendWeight;
                superviseConnectInfo3.mpquicPathInfo = superviseConnectInfo.mpquicPathInfo;
                superviseConnectInfo3.bgForbiddenTime = superviseConnectInfo.bgForbiddenTime;
                if (isTunnel()) {
                    SuperviseConnectInfo superviseConnectInfo4 = this.mSuperviseConnectInfo;
                    superviseConnectInfo4.tunnel0RTTStatus = superviseConnectInfo.tunnel0RTTStatus;
                    if (superviseConnectInfo4.tunnelErrorCode == -1) {
                        superviseConnectInfo4.tunnelErrorCode = superviseConnectInfo.tunnelErrorCode;
                    }
                    if (superviseConnectInfo4.tunnelDegraded == -1) {
                        superviseConnectInfo4.tunnelDegraded = superviseConnectInfo.tunnelDegraded;
                    }
                    superviseConnectInfo4.tunnelRetryTimes = superviseConnectInfo.tunnelRetryTimes;
                }
            }
        }
    }

    public void setTunnelProxyClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4916a079", new Object[]{this, new Boolean(z)});
        } else {
            this.isTunnelProxyClose = z;
        }
    }

    public int streamReset(long j, int i) throws SpdyErrorException {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2adda1e8", new Object[]{this, new Long(j), new Integer(i)})).intValue();
        }
        sessionIsOpen();
        spduLog.Logd(TAG, "[SpdySession.streamReset] - ");
        if (this.pptr4sessionNativePtr.enter()) {
            i2 = streamCloseN(this.sessionNativePtr, (int) j, i);
            this.pptr4sessionNativePtr.exit();
        } else {
            i2 = -2001;
        }
        if (i2 == 0) {
            return i2;
        }
        throw new SpdyErrorException("streamReset error: " + i2, i2);
    }

    @Deprecated
    public int submitBioPing() throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fea73edc", new Object[]{this})).intValue();
        }
        sessionIsOpen();
        throw new SpdyErrorException("submitBioPing deprecated: -1", -1);
    }

    public int submitPing() throws SpdyErrorException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b490924", new Object[]{this})).intValue();
        }
        sessionIsOpen();
        if (this.pptr4sessionNativePtr.enter()) {
            i = submitPingN(this.sessionNativePtr);
            this.pptr4sessionNativePtr.exit();
        } else {
            i = -2001;
        }
        if (i == 0) {
            return i;
        }
        throw new SpdyErrorException("submitPing error: " + i, i);
    }

    public void unRegisterNetworkStatusChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b476aaef", new Object[]{this});
        } else if (this.isAddInterfaceListen.getAndSet(false)) {
            NetWorkStatusUtil.removeInterfaceStatusChangeListener(this.NetworkStatusChangeListener);
        }
    }

    public int putSpdyStreamCtx(SpdyStreamContext spdyStreamContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e14d5804", new Object[]{this, spdyStreamContext})).intValue();
        }
        synchronized (this.lock) {
            i = this.streamcount;
            this.streamcount = 1 + i;
            this.spdyStream.put(i, spdyStreamContext);
        }
        return i;
    }

    public int sendCustomControlFrame(SpdyProtocol.DataChannel dataChannel, QosLevel qosLevel, int i, int i2, int i3, int i4, byte[] bArr) throws SpdyErrorException {
        int i5;
        int i6;
        byte[] bArr2 = bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("685daeba", new Object[]{this, dataChannel, qosLevel, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr2})).intValue();
        }
        sessionIsOpen();
        if (bArr2 != null && bArr2.length <= 0) {
            bArr2 = null;
        }
        int i7 = this.mode;
        if (!((i7 & 256) == 0 || (i7 & 16) == 0)) {
            boolean z = dataChannel == SpdyProtocol.DataChannel.UnreliableChannel && i4 > (i6 = this.unreliableChannelMss) && i6 != -1;
            spduLog.Tloge(TAG, getSessionSeq(), "[accs2][sendCustomFrame]", "dataId", Integer.valueOf(i), "channel", Integer.valueOf(dataChannel.getDataChannelInt()), "qos", Integer.valueOf(qosLevel.getQosLevel()), "len", Integer.valueOf(i4), "mss", Integer.valueOf(this.unreliableChannelMss), "type", Integer.valueOf(i2), "drop", Boolean.valueOf(z));
            if (z) {
                throw new SpdyErrorException("length " + i4 + " exceeds Mss:" + this.unreliableChannelMss, (int) TnetStatusCode.EASY_SPDY_FRAME_TOO_LARGE);
            }
        }
        spduLog.Logi("tnet-jni", "[sendCustomControlFrame] - type: ", i2);
        if (this.pptr4sessionNativePtr.enter()) {
            i5 = sendCustomControlFrameN(this.sessionNativePtr, dataChannel.getDataChannelInt(), qosLevel.getQosLevel(), i, i2, i3, i4, bArr2);
            this.pptr4sessionNativePtr.exit();
        } else {
            i5 = -2001;
        }
        if (i5 == 0) {
            return i5;
        }
        throw new SpdyErrorException("sendCustomControlFrame error: " + i5, i5);
    }

    private int closeprivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6886785", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            try {
                if (!this.sessionClearedFromSessionMgr.getAndSet(true)) {
                    this.agent.clearSpdySession(this.sessionPoolUniqueKey);
                }
                unRegisterNetworkStatusChangeListener();
                SpdyStreamContext[] allStreamCb = getAllStreamCb();
                if (allStreamCb != null) {
                    for (SpdyStreamContext spdyStreamContext : allStreamCb) {
                        spduLog.Logi(TAG, "[spdyStreamCloseCallback] unfinished stm=", spdyStreamContext.streamId);
                        spdyStreamContext.callBack.spdyStreamCloseCallback(this, spdyStreamContext.streamId, -2001, spdyStreamContext.streamContext, null);
                    }
                }
                this.spdyStream.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0f7d53e", new Object[]{this})).intValue();
        }
        spduLog.Logd(TAG, "[SpdySession.cleanUp] - ");
        if (this.closed.getAndSet(true)) {
            return 0;
        }
        this.agent.removeSession(this);
        return closeprivate();
    }

    public int closeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6a5a2cf", new Object[]{this})).intValue();
        }
        if (!this.closed.getAndSet(true)) {
            return closeprivate();
        }
        return 0;
    }

    public int closeSession() {
        ProtectedPointer protectedPointer;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a316aaf8", new Object[]{this})).intValue();
        }
        spduLog.Logd(TAG, "[SpdySession.closeSession] - ");
        unRegisterNetworkStatusChangeListener();
        synchronized (this.lock) {
            if (!this.sessionClearedFromSessionMgr.getAndSet(true)) {
                spduLog.Logd(TAG, "[SpdySession.closeSession] - ", this.authority);
                this.agent.clearSpdySession(this.sessionPoolUniqueKey);
                if (this.pptr4sessionNativePtr.enter()) {
                    try {
                        i = this.agent.closeSession(this.sessionNativePtr);
                        protectedPointer = this.pptr4sessionNativePtr;
                    } catch (UnsatisfiedLinkError e) {
                        e.printStackTrace();
                        protectedPointer = this.pptr4sessionNativePtr;
                    }
                    protectedPointer.exit();
                } else {
                    i = -2001;
                }
            }
        }
        return i;
    }

    public byte[] getTunnelInfoBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f443d9f7", new Object[]{this});
        }
        ArrayList<StrategyInfo> arrayList = this.tunnelInfoArrayList;
        if (arrayList == null || arrayList == Collections.EMPTY_LIST || arrayList.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tunnelInfoArrayList.size(); i++) {
            sb.append(this.tunnelInfoArrayList.get(i).infoToString());
            sb.append("/");
        }
        return sb.toString().getBytes();
    }

    public void checkWifiConsecutiveFailStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67d75bf", new Object[]{this, new Integer(i)});
        } else if (!NetWorkStatusUtil.isWifi()) {
        } else {
            if (i == -2003 || i == -5004 || ((isTunnel() && i == -4993) || i == -2613 || i == -2601 || ((!d61.d() && i == -2603) || (i == -2002 && this.mSuperviseConnectInfo.connRecvSize == 0 && this.connectTaskStartTime > 0 && System.currentTimeMillis() - this.connectTaskStartTime > 3000)))) {
                SpdyAgent.wifiConsecutiveFailCount++;
                spduLog.Tloge(TAG, "[netEnv]", "wifi env connect fail count:" + SpdyAgent.wifiConsecutiveFailCount, "error", Integer.valueOf(i));
            }
        }
    }

    public int submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Spdycb spdycb) throws SpdyErrorException {
        SpdyStreamContext spdyStreamContext;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c9f4e95", new Object[]{this, spdyRequest, spdyDataProvider, obj, spdycb})).intValue();
        }
        if (spdyRequest == null || obj == null || spdyRequest.getUrl() == null) {
            throw new SpdyErrorException("submitRequest error: -1102", (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
        sessionIsOpen();
        byte[] dataproviderToByteArray = SpdyAgent.dataproviderToByteArray(spdyRequest, spdyDataProvider);
        if (dataproviderToByteArray != null && dataproviderToByteArray.length <= 0) {
            dataproviderToByteArray = null;
        }
        boolean z = spdyDataProvider != null ? spdyDataProvider.finished : true;
        SpdyStreamContext spdyStreamContext2 = new SpdyStreamContext(obj, spdycb);
        int putSpdyStreamCtx = putSpdyStreamCtx(spdyStreamContext2);
        String[] mapToByteArray = SpdyAgent.mapToByteArray(spdyRequest.getHeaders());
        spdyRequest.optimizeRequestTimeout();
        if (this.pptr4sessionNativePtr.enter()) {
            i = putSpdyStreamCtx;
            spdyStreamContext = spdyStreamContext2;
            i2 = submitRequestN(this.sessionNativePtr, spdyRequest.getUrlPath(), (byte) spdyRequest.getPriority(), mapToByteArray, dataproviderToByteArray, z, putSpdyStreamCtx, spdyRequest.getRequestTimeoutMs(), spdyRequest.getRequestRdTimeoutMs(), spdyRequest.getBodyRdTimeoutMs(), spdyRequest.getRequestRecvRateBps(), spdyRequest.getRequestFecSize(), spdyRequest.getRequestFecUpSize());
            this.pptr4sessionNativePtr.exit();
        } else {
            i = putSpdyStreamCtx;
            spdyStreamContext = spdyStreamContext2;
            i2 = -2001;
        }
        if (i2 >= 0) {
            spdyStreamContext.streamId = i2;
            return i2;
        }
        removeSpdyStream(i);
        throw new SpdyErrorException("submitRequest error: " + i2, i2);
    }
}
