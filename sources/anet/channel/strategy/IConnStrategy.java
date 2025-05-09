package anet.channel.strategy;

import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IConnStrategy {
    String getAccessPoint();

    Map<String, Object> getCommonInfo();

    int getConnectionTimeout();

    int getHeartbeat();

    String getIp();

    int getIpSource();

    int getIpType();

    int getPort();

    ConnProtocol getProtocol();

    List<ProxyStrategy> getProxyStrategies();

    int getReadTimeout();

    int getRetryTimes();

    int getStatus();

    String getUnit();

    boolean isSupportMultiPath();
}
