package kotlinx.coroutines.flow;

import kotlin.Metadata;
import tb.ar4;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements sp9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w1a<sp9<Object>, T, ar4<? super xhv>, Object> f15297a;
    final /* synthetic */ sp9<Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1(w1a<? super sp9<Object>, ? super T, ? super ar4<? super xhv>, ? extends Object> w1aVar, sp9<Object> sp9Var) {
        this.f15297a = w1aVar;
        this.b = sp9Var;
    }

    public final Object a(T t, ar4<? super xhv> ar4Var) {
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, ar4Var);
        this.f15297a.invoke(this.b, t, ar4Var);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // tb.sp9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r5, tb.ar4<? super tb.xhv> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.b.b(r6)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.b.b(r6)
            tb.w1a<tb.sp9<java.lang.Object>, T, tb.ar4<? super tb.xhv>, java.lang.Object> r6 = r4.f15297a
            tb.sp9<java.lang.Object> r2 = r4.b
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r2, r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            tb.xhv r5 = tb.xhv.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1.emit(java.lang.Object, tb.ar4):java.lang.Object");
    }
}
