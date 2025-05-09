package tb;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wp9 {
    public static final void a(AbortFlowException abortFlowException, sp9<?> sp9Var) {
        if (abortFlowException.owner != sp9Var) {
            throw abortFlowException;
        }
    }
}
