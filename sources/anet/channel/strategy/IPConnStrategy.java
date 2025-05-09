package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IPConnStrategy implements IConnStrategy, Serializable, Parcelable {
    public static final Parcelable.Creator<IPConnStrategy> CREATOR = new Parcelable.Creator<IPConnStrategy>() { // from class: anet.channel.strategy.IPConnStrategy.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPConnStrategy createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPConnStrategy) ipChange.ipc$dispatch("f13061eb", new Object[]{this, parcel}) : new IPConnStrategy(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPConnStrategy[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPConnStrategy[]) ipChange.ipc$dispatch("c9c7d614", new Object[]{this, new Integer(i)}) : new IPConnStrategy[i];
        }
    };
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;
    private static final long serialVersionUID = -2492035520806142510L;
    public volatile String accessPoint;
    public volatile String clientIp;
    public volatile Map<String, Object> commonInfo;
    public volatile int cto;
    public volatile int heartbeat;
    public final String ip;
    volatile int ipSource;
    volatile int ipType;
    transient boolean isToRemove;
    public final int port;
    public final ConnProtocol protocol;
    public volatile List<ProxyStrategy> proxyStrategies;
    public volatile int retry;
    public volatile int rto;
    public volatile int status;
    public volatile int supportMultiPath;
    public volatile String unit;

    static {
        t2o.a(607125836);
        t2o.a(607125835);
    }

    public IPConnStrategy(Parcel parcel) {
        this.status = -1;
        this.unit = null;
        this.accessPoint = null;
        this.clientIp = null;
        this.commonInfo = null;
        this.ipType = 1;
        this.ipSource = 1;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.ip = parcel.readString();
            this.port = parcel.readInt();
            this.protocol = (ConnProtocol) parcel.readParcelable(ConnProtocol.class.getClassLoader());
            this.cto = parcel.readInt();
            this.rto = parcel.readInt();
            this.retry = parcel.readInt();
            this.heartbeat = parcel.readInt();
            this.status = parcel.readInt();
            this.proxyStrategies = parcel.createTypedArrayList(ProxyStrategy.CREATOR);
            this.supportMultiPath = parcel.readInt();
            this.unit = parcel.readString();
            this.accessPoint = parcel.readString();
            this.clientIp = parcel.readString();
            if (this.commonInfo == null) {
                this.commonInfo = new HashMap();
            }
            parcel.readMap(this.commonInfo, Object.class.getClassLoader());
            this.ipType = parcel.readInt();
            this.ipSource = parcel.readInt();
            return;
        }
        throw new IllegalArgumentException("IPConnStrategy Unsupported Parcelable version: " + readInt);
    }

    public static IPConnStrategy create(String str, StrategyResultParser.Aisles aisles) {
        ConnProtocol valueOf = ConnProtocol.valueOf(aisles);
        if (valueOf == null) {
            return null;
        }
        return create(str, aisles.port, valueOf, aisles.cto, aisles.rto, aisles.retry, aisles.heartbeat, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        if (this.port != iPConnStrategy.port || !this.ip.equals(iPConnStrategy.ip) || !this.protocol.equals(iPConnStrategy.protocol)) {
            z = false;
        } else {
            z = true;
        }
        if (this.proxyStrategies == null || this.proxyStrategies.isEmpty() ? !(!z || (iPConnStrategy.proxyStrategies != null && !iPConnStrategy.proxyStrategies.isEmpty())) : !(!z || !this.proxyStrategies.equals(iPConnStrategy.proxyStrategies))) {
            if (this.supportMultiPath == iPConnStrategy.supportMultiPath) {
                return true;
            }
        }
        return false;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getAccessPoint() {
        if ((this.accessPoint == null || this.accessPoint.isEmpty()) && this.clientIp != null && !this.clientIp.isEmpty()) {
            return this.clientIp;
        }
        return this.accessPoint;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public Map<String, Object> getCommonInfo() {
        if (this.commonInfo == null) {
            this.commonInfo = new HashMap();
        }
        this.commonInfo.put("selectProxyStrategy", selectProxyStrategy());
        return this.commonInfo;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.ipSource;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.ipType;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public List<ProxyStrategy> getProxyStrategies() {
        return this.proxyStrategies;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getStatus() {
        return this.status;
    }

    public int getUniqueId() {
        return hashCode();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int hashCode = ((((527 + this.ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
        if (this.proxyStrategies != null && !this.proxyStrategies.isEmpty()) {
            hashCode = (hashCode * 31) + this.proxyStrategies.hashCode();
        }
        return (hashCode * 31) + this.supportMultiPath;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public boolean isSupportMultiPath() {
        if (this.supportMultiPath == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.ip);
        if (this.ipType == 0) {
            sb.append("(*)");
        }
        sb.append(' ');
        sb.append(this.port);
        sb.append(' ');
        sb.append(this.protocol);
        if (isSupportMultiPath()) {
            sb.append(" mp");
        }
        if (this.proxyStrategies != null && !this.proxyStrategies.isEmpty()) {
            sb.append(" proxy");
            sb.append(this.proxyStrategies);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeString(this.ip);
        parcel.writeInt(this.port);
        parcel.writeParcelable(this.protocol, i);
        parcel.writeInt(this.cto);
        parcel.writeInt(this.rto);
        parcel.writeInt(this.retry);
        parcel.writeInt(this.heartbeat);
        parcel.writeInt(this.status);
        parcel.writeTypedList(this.proxyStrategies);
        parcel.writeInt(this.supportMultiPath);
        parcel.writeString(this.unit);
        parcel.writeString(this.accessPoint);
        parcel.writeString(this.clientIp);
        parcel.writeMap(this.commonInfo);
        parcel.writeInt(this.ipType);
        parcel.writeInt(this.ipSource);
    }

    public ProxyStrategy selectProxyStrategy() {
        if (this.proxyStrategies == null) {
            ALog.e("anet.IPConnStrategy", "[tunnel_opt] proxyStrategies null! ", null, new Object[0]);
            return null;
        }
        ProxyStrategy proxyStrategy = null;
        for (ProxyStrategy proxyStrategy2 : this.proxyStrategies) {
            if ("tunnel".equalsIgnoreCase(proxyStrategy2.protocol) && (!Inet64Util.isIPv4OnlyNetwork() || !Utils.isIPV6Address(proxyStrategy2.ip))) {
                if (proxyStrategy == null || proxyStrategy2.connHistoryItem.countFail() < proxyStrategy.connHistoryItem.countFail()) {
                    proxyStrategy = proxyStrategy2;
                }
            }
        }
        ALog.e("anet.IPConnStrategy", "[tunnel_opt]", null, "selectProxyStrategy", proxyStrategy, "proxyStrategies", this.proxyStrategies);
        return proxyStrategy;
    }

    public static IPConnStrategy create(String str, StrategyResultParser.ChannelAttribute channelAttribute) {
        ConnProtocol valueOf = ConnProtocol.valueOf(channelAttribute);
        if (valueOf == null) {
            return null;
        }
        return create(str, channelAttribute.port, valueOf, channelAttribute.cto, channelAttribute.rto, channelAttribute.retry, channelAttribute.heartbeat, channelAttribute.unit, channelAttribute.accessPoint, channelAttribute.clientIp);
    }

    public static IPConnStrategy create(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i, connProtocol, i2, i3, i4, i5, str2, str3, str4);
    }

    public static IPConnStrategy create(IConnStrategy iConnStrategy, ConnProtocol connProtocol) {
        if (iConnStrategy == null || connProtocol == null) {
            return null;
        }
        IPConnStrategy iPConnStrategy = new IPConnStrategy(iConnStrategy.getIp(), iConnStrategy.getPort(), connProtocol, iConnStrategy.getConnectionTimeout(), iConnStrategy.getReadTimeout(), iConnStrategy.getRetryTimes(), iConnStrategy.getHeartbeat(), iConnStrategy.getUnit(), iConnStrategy.getAccessPoint(), "");
        iPConnStrategy.ipType = iConnStrategy.getIpType();
        iPConnStrategy.ipSource = iConnStrategy.getIpSource();
        iPConnStrategy.proxyStrategies = iConnStrategy.getProxyStrategies();
        iPConnStrategy.supportMultiPath = iConnStrategy.isSupportMultiPath() ? 1 : 0;
        iPConnStrategy.commonInfo = iConnStrategy.getCommonInfo();
        return iPConnStrategy;
    }

    private IPConnStrategy(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5, String str2, String str3, String str4) {
        this.status = -1;
        this.unit = null;
        this.accessPoint = null;
        this.clientIp = null;
        this.commonInfo = null;
        this.ipType = 1;
        this.ipSource = 1;
        this.ip = str;
        this.port = i;
        this.protocol = connProtocol;
        this.cto = i2;
        this.rto = i3;
        this.retry = i4;
        this.heartbeat = i5;
        this.proxyStrategies = Collections.EMPTY_LIST;
        this.supportMultiPath = 0;
        this.unit = str2;
        this.accessPoint = str3;
        this.clientIp = str4;
    }
}
