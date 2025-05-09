package com.taobao.tao.recommend3.tracelog;

import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g0b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HomeGlobalTraceUtils$1 extends HashMap<String, Object> {
    public final /* synthetic */ MtopResponse val$response;
    public final /* synthetic */ String val$traceKey;

    public HomeGlobalTraceUtils$1(String str, MtopResponse mtopResponse) {
        this.val$traceKey = str;
        this.val$response = mtopResponse;
        put(g0b.g(str), mtopResponse.getMtopStat().toString());
        put(g0b.h(str), Boolean.valueOf(mtopResponse.isApiSuccess()));
    }
}
