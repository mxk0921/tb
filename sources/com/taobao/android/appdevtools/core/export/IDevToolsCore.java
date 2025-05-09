package com.taobao.android.appdevtools.core.export;

import com.taobao.android.appdevtools.core.model.Config;
import com.taobao.android.appdevtools.core.model.RemoteDebugParam;
import kotlin.Metadata;
import tb.g1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/appdevtools/core/export/IDevToolsCore;", "", "Ltb/xhv;", "init", "()V", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IDevToolsCore {
    void a(Config config, g1a<? super Boolean, xhv> g1aVar);

    void b(g1a<? super Boolean, xhv> g1aVar);

    void c(g1a<? super Config, xhv> g1aVar);

    void d(Config config, g1a<? super Boolean, xhv> g1aVar);

    void e(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar);

    void f(String str, g1a<? super Boolean, xhv> g1aVar);

    void g(g1a<? super Boolean, xhv> g1aVar);

    void init();
}
