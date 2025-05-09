package com.taobao.android.searchbaseframe.net;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RequestStats implements Serializable {
    public long oneWayTime;
    public long recvDataSize;
    public long recvDataTime;
    public int retryTimes;
    public long sendDataSize;
    public long serverRt;

    static {
        t2o.a(993001895);
    }
}
