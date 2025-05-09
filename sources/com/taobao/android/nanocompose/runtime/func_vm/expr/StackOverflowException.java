package com.taobao.android.nanocompose.runtime.func_vm.expr;

import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StackOverflowException extends RuntimeException {
    static {
        t2o.a(598737353);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackOverflowException(String str) {
        super(str);
        ckf.g(str, "message");
    }
}
