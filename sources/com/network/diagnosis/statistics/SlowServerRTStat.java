package com.network.diagnosis.statistics;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

/* compiled from: Taobao */
@Monitor(module = "npm", monitorPoint = "slow_server_rt")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SlowServerRTStat extends StatObject {
    @Dimension
    public int code;
    @Dimension
    public String eagleEyeId;
    @Dimension
    public String host;
    @Measure
    public long serverRt;
    @Dimension
    public String url;
    @Dimension
    public int userType;
}
