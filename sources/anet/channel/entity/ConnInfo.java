package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import tb.r5q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConnInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String host;
    private String seq;
    public final IConnStrategy strategy;
    public int retryTime = 0;
    public int maxRetryTime = 0;

    static {
        t2o.a(607125627);
    }

    public ConnInfo(String str, String str2, IConnStrategy iConnStrategy) {
        this.strategy = iConnStrategy;
        this.host = str;
        this.seq = str2;
    }

    public ConnType getConnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("fdfc0fef", new Object[]{this});
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null) {
            return ConnType.valueOf(iConnStrategy.getProtocol());
        }
        return ConnType.HTTP;
    }

    public int getConnectionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af0dde7", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.strategy.getConnectionTimeout();
    }

    public int getHeartbeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return r5q.FOREGROUND_INTERVAL;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.host;
    }

    public String getIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    public int getReadTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return 20000;
        }
        return this.strategy.getReadTimeout();
    }

    public String getSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2a3c570", new Object[]{this});
        }
        return this.seq;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConnInfo [ip=" + getIp() + ",port=" + getPort() + ",type=" + getConnType() + ",hb" + getHeartbeat() + "]";
    }
}
