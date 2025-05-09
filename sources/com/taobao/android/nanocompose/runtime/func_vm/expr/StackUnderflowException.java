package com.taobao.android.nanocompose.runtime.func_vm.expr;

import java.util.EmptyStackException;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StackUnderflowException extends EmptyStackException {
    static {
        t2o.a(598737354);
    }

    public StackUnderflowException(String str) {
        ckf.g(str, "message");
    }
}
