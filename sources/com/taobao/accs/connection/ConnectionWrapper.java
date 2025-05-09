package com.taobao.accs.connection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.AckExtraData;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.MessageBizAck;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import tb.t2o;
import tb.tv9;
import tb.va8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnectionWrapper implements IConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConnectionWrapper";
    private BaseConnection connection;

    static {
        t2o.a(343933057);
        t2o.a(343933063);
    }

    public ConnectionWrapper(AccsClientConfig accsClientConfig, int i) {
        AccsClientConfig.setAccsConfig(accsClientConfig.getConfigEnv(), accsClientConfig);
        this.connection = va8.getConnection(GlobalClientInfo.mContext, accsClientConfig.getTag(), true, 0, i);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean addBizAckInfo(String str, String str2, AckExtraData ackExtraData) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67adc39", new Object[]{this, str, str2, ackExtraData})).booleanValue();
        }
        return this.connection.b(str, str2, ackExtraData);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5301f18f", new Object[]{this, str})).booleanValue();
        }
        return this.connection.e(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.connection.f();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a305e", new Object[]{this});
        }
        return this.connection.i.getAppSecret();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.connection.i();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getConfigTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d33cb5f7", new Object[]{this});
        }
        return this.connection.r;
    }

    public BaseConnection getConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConnection) ipChange.ipc$dispatch("de8fe9bf", new Object[]{this});
        }
        return this.connection;
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getConnectionUnitInfo() throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this});
        }
        return this.connection.p();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{this, str});
        }
        return this.connection.l(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean getSendBackState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7740ac17", new Object[]{this})).booleanValue();
        }
        return this.connection.m();
    }

    @Override // com.taobao.accs.connection.IConnection
    public long getServerTime() throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        return this.connection.n();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getStoreId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5844913", new Object[]{this});
        }
        return this.connection.i.getStoreId();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.connection.o();
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isAppBinded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdfebb68", new Object[]{this, str})).booleanValue();
        }
        return this.connection.j().d(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isAppUnbinded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abec28c1", new Object[]{this, str})).booleanValue();
        }
        return this.connection.j().e(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        return this.connection.s();
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isUserBinded(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bdc330", new Object[]{this, str, str2})).booleanValue();
        }
        return this.connection.j().f(str, str2);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean notifyMsgDelivery(String str) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd9b921", new Object[]{this, str})).booleanValue();
        }
        return this.connection.y(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public void onResult(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd80fc3d", new Object[]{this, message, new Integer(i)});
        } else {
            this.connection.A(message, i);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void ping(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72fd39", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.connection.C(z, z2);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
        } else {
            this.connection.G(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void registerHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
        } else {
            this.connection.H(iHeartBeat);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void send(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb9ebe2", new Object[]{this, message, new Boolean(z)});
        } else {
            this.connection.J(message, z);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void sendDelayBizAck(MessageBizAck messageBizAck) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a309805", new Object[]{this, messageBizAck});
        } else {
            this.connection.K(messageBizAck);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void sendMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e2a749", new Object[]{this, message});
        } else {
            this.connection.L(message, true);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{this, str});
        } else {
            this.connection.b = str;
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setForeBackState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ddd90", new Object[]{this, new Integer(i)});
        } else {
            this.connection.M(i);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setSendBackState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8010b2d", new Object[]{this, new Boolean(z)});
        } else {
            this.connection.N(z);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setTTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e61ce", new Object[]{this, str});
        } else {
            this.connection.f6078a = str;
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.connection.P();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void startChannelService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ecfbb", new Object[]{this});
        } else {
            this.connection.Q();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
        } else {
            this.connection.R(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
        } else {
            this.connection.S(iHeartBeat);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        BaseConnection baseConnection = this.connection;
        if (baseConnection instanceof InAppConnection) {
            ((InAppConnection) baseConnection).I0(accsClientConfig);
        }
    }

    public ConnectionWrapper(String str) {
        if (UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
            this.connection = va8.getConnection(GlobalClientInfo.mContext, str, true, 0, tv9.h().i());
            return;
        }
        this.connection = va8.getConnection(GlobalClientInfo.mContext, str, true, 0);
    }
}
