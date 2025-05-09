package com.vivo.push.restructure.request;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b<I extends com.vivo.push.restructure.request.a.a.b, O extends com.vivo.push.restructure.request.a.a.b> {

    /* renamed from: a  reason: collision with root package name */
    private a<I, O> f14640a;
    private c<O> b;
    private long c;

    private b(a<I, O> aVar) {
        this.c = 5000L;
        this.f14640a = aVar;
        if (aVar == null) {
            u.a((int) JosStatusCodes.RTN_CODE_PARAMS_ERROR, "Command object is null, please construct command first");
        }
    }

    public final a a() {
        return this.f14640a;
    }

    public final c b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    private b(a<I, O> aVar, c<O> cVar) {
        this(aVar);
        this.b = cVar;
    }

    public b(a<I, O> aVar, c<O> cVar, byte b) {
        this(aVar, cVar);
        this.c = 20000L;
    }
}
