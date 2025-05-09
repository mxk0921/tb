package com.taobao.android.nanocompose.runtime.func_vm.expr;

import tb.ckf;
import tb.diz;
import tb.iiz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCExprException extends RuntimeException {
    static {
        t2o.a(598737322);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCExprException(String str) {
        super(ckf.p("NCExprException: ", str));
        ckf.g(str, "message");
        iiz.Companion.l("NCExprVM", ckf.p("NCExprException: ", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCExprException(String str, Throwable th) {
        super(ckf.p("NCExprException: ", str), th);
        ckf.g(str, "message");
        iiz.Companion.l("NCExprVM", ckf.p("NCExprException: ", diz.INSTANCE.a(th)));
    }
}
