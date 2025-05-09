package com.network.diagnosis.statistics;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

/* compiled from: Taobao */
@Monitor(module = "npm", monitorPoint = "server_exception")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ServerExceptionStat extends StatObject {
    @Dimension
    public int code;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public String protocol;
    @Dimension
    public String url;
}
