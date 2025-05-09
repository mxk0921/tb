package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import kotlin.Pair;
import tb.n8s;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.inside.adapter.DefaultTraceAdapter")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITraceAdapter extends n8s {
    void asyncBegin(String str, long j, Pair<String, String> pair);

    void asyncEnd(String str, long j, Pair<String, String> pair);

    void begin(String str, Pair<String, String> pair, Pair<String, String> pair2);

    void end(String str);

    void flowBegin(String str, long j);

    void flowEnd(String str, long j);

    void flowStep(String str, long j);

    long generateTraceId();
}
