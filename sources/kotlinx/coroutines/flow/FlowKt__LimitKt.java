package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__LimitKt {

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltb/qp9;", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements qp9<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qp9 f15305a;
        final /* synthetic */ u1a b;

        public a(qp9 qp9Var, u1a u1aVar) {
            this.f15305a = qp9Var;
            this.b = u1aVar;
        }

        @Override // tb.qp9, tb.t23
        public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
            Object a2 = this.f15305a.a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), sp9Var, this.b), ar4Var);
            if (a2 == dkf.d()) {
                return a2;
            }
            return xhv.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(tb.qp9<? extends T> r4, tb.u1a<? super T, ? super tb.ar4<? super java.lang.Boolean>, ? extends java.lang.Object> r5, tb.ar4<? super tb.xhv> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.b.b(r6)     // Catch: AbortFlowException -> 0x002d
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.b.b(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.L$0 = r6     // Catch: AbortFlowException -> 0x004a
            r0.label = r3     // Catch: AbortFlowException -> 0x004a
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: AbortFlowException -> 0x004a
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004a:
            r5 = move-exception
            r4 = r6
        L_0x004c:
            tb.wp9.a(r5, r4)
        L_0x004f:
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.b(tb.qp9, tb.u1a, tb.ar4):java.lang.Object");
    }

    public static final <T> qp9<T> c(qp9<? extends T> qp9Var, u1a<? super T, ? super ar4<? super Boolean>, ? extends Object> u1aVar) {
        return new a(qp9Var, u1aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(tb.sp9<? super T> r4, T r5, tb.ar4<? super tb.xhv> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.L$0
            tb.sp9 r4 = (tb.sp9) r4
            kotlin.b.b(r6)
            goto L_0x0043
        L_0x0035:
            kotlin.b.b(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.d(tb.sp9, java.lang.Object, tb.ar4):java.lang.Object");
    }
}
