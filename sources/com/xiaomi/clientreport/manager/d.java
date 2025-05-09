package com.xiaomi.clientreport.manager;

import com.xiaomi.push.ah;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f14685a;

    public d(a aVar) {
        this.f14685a = aVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public void run() {
        int a2;
        ExecutorService executorService;
        a2 = this.f14685a.a();
        if (a2 > 0) {
            executorService = this.f14685a.f647a;
            executorService.execute(new e(this));
        }
    }
}
