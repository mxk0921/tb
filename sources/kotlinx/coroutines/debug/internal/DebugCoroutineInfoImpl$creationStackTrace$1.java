package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.bv6;
import tb.dkf;
import tb.qgq;
import tb.u1a;
import tb.vbp;
import tb.vu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/vbp;", "Ljava/lang/StackTraceElement;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements u1a<vbp<? super StackTraceElement>, ar4<? super xhv>, Object> {
    final /* synthetic */ qgq $bottom;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bv6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(bv6 bv6Var, qgq qgqVar, ar4<? super DebugCoroutineInfoImpl$creationStackTrace$1> ar4Var) {
        super(2, ar4Var);
        this.$bottom = qgqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, this.$bottom, ar4Var);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object d2 = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            bv6 bv6Var = this.this$0;
            vu4 callerFrame = this.$bottom.getCallerFrame();
            this.label = 1;
            d = bv6Var.d((vbp) this.L$0, callerFrame, this);
            if (d == d2) {
                return d2;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<? super StackTraceElement> vbpVar, ar4<? super xhv> ar4Var) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
