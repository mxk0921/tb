package com.loc;

import com.loc.cq;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cr extends ct {
    private static cr c = new cr(new cq.a().a("amap-global-threadPool").a());

    private cr(cq cqVar) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(cqVar.a(), cqVar.b(), cqVar.d(), TimeUnit.SECONDS, cqVar.c(), cqVar);
            this.f5637a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            av.b(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static cr a() {
        return c;
    }
}
