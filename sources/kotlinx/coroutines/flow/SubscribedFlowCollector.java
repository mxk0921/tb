package kotlinx.coroutines.flow;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;
import tb.ar4;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Ltb/sp9;", "collector", "Lkotlin/Function2;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Ltb/sp9;Ltb/u1a;)V", "value", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "a", "(Ltb/ar4;)Ljava/lang/Object;", "Ltb/sp9;", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/u1a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SubscribedFlowCollector<T> implements sp9<T> {

    /* renamed from: a  reason: collision with root package name */
    private final sp9<T> f15355a;
    private final u1a<sp9<? super T>, ar4<? super xhv>, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(sp9<? super T> sp9Var, u1a<? super sp9<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        this.f15355a = sp9Var;
        this.b = u1aVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(tb.ar4<? super tb.xhv> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.b.b(r7)
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.b.b(r7)     // Catch: all -> 0x0040
            goto L_0x0060
        L_0x0040:
            r7 = move-exception
            goto L_0x007f
        L_0x0042:
            kotlin.b.b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            tb.sp9<T> r7 = r6.f15355a
            kotlin.coroutines.d r5 = r0.getContext()
            r2.<init>(r7, r5)
            tb.u1a<tb.sp9<? super T>, tb.ar4<? super tb.xhv>, java.lang.Object> r7 = r6.b     // Catch: all -> 0x0040
            r0.L$0 = r6     // Catch: all -> 0x0040
            r0.L$1 = r2     // Catch: all -> 0x0040
            r0.label = r4     // Catch: all -> 0x0040
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: all -> 0x0040
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r4 = r6
        L_0x0060:
            r2.releaseIntercepted()
            tb.sp9<T> r7 = r4.f15355a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L_0x007c
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        L_0x007c:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        L_0x007f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.a(tb.ar4):java.lang.Object");
    }

    @Override // tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        return this.f15355a.emit(t, ar4Var);
    }
}
