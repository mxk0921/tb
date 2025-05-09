package com.taobao.android.turbo.adapter.impl.mtop;

import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopRequest;
import tb.jwc;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/android/turbo/adapter/impl/mtop/MtopRequestWrapper;", "Lmtopsdk/mtop/domain/MtopRequest;", "Ltb/jwc;", "comparator", "<init>", "(Ltb/jwc;)V", "Ltb/jwc;", "getComparator", "()Ltb/jwc;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MtopRequestWrapper extends MtopRequest {
    private final jwc comparator;

    static {
        t2o.a(919601222);
    }

    public MtopRequestWrapper(jwc jwcVar) {
    }

    public final jwc getComparator() {
        return this.comparator;
    }
}
