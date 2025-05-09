package com.xiaomi.push;

import com.xiaomi.push.ah;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aj extends ah.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ah f14753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ah ahVar, ah.a aVar) {
        super(aVar);
        this.f14753a = ahVar;
    }

    @Override // com.xiaomi.push.ah.b
    public void b() {
        Object obj;
        Map map;
        obj = this.f14753a.f720a;
        synchronized (obj) {
            map = this.f14753a.f721a;
            map.remove(super.f14751a.mo607a());
        }
    }
}
