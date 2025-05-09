package anetwork.channel;

import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Response {
    byte[] getBytedata();

    Map<String, List<String>> getConnHeadFields();

    String getDesc();

    Throwable getError();

    StatisticData getStatisticData();

    int getStatusCode();
}
