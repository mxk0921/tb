package com.xiaomi.clientreport.manager;

import com.xiaomi.push.ah;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f14687a;

    public f(a aVar) {
        this.f14687a = aVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        int b;
        ExecutorService executorService;
        b = this.f14687a.b();
        if (b > 0) {
            executorService = this.f14687a.f647a;
            executorService.execute(new g(this));
        }
    }
}
