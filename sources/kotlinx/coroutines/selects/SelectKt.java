package kotlinx.coroutines.selects;

import tb.g1a;
import tb.q23;
import tb.u1r;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SelectKt {

    /* renamed from: a  reason: collision with root package name */
    public static final w1a<Object, Object, Object, Object> f15393a = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE;
    public static final u1r b = new u1r("STATE_REG");
    public static final u1r c = new u1r("STATE_COMPLETED");
    public static final u1r d = new u1r("STATE_CANCELLED");
    public static final u1r e = new u1r("NO_RESULT");
    public static final u1r f = new u1r("PARAM_CLAUSE_0");

    public static final TrySelectDetailedResult a(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    public static final u1r i() {
        return f;
    }

    public static final boolean j(q23<? super xhv> q23Var, g1a<? super Throwable, xhv> g1aVar) {
        Object q = q23Var.q(xhv.INSTANCE, null, g1aVar);
        if (q == null) {
            return false;
        }
        q23Var.p(q);
        return true;
    }
}
