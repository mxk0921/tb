package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.dkf;
import tb.gbp;
import tb.ozm;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;
import tb.y9p;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltb/qp9;", "inner", "Ltb/xhv;", "a", "(Ltb/qp9;Ltb/ar4;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements sp9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f15365a;
    final /* synthetic */ y9p b;
    final /* synthetic */ ozm<T> c;
    final /* synthetic */ gbp<T> d;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        final /* synthetic */ gbp<T> $collector;
        final /* synthetic */ qp9<T> $inner;
        final /* synthetic */ y9p $semaphore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(qp9<? extends T> qp9Var, gbp<T> gbpVar, y9p y9pVar, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$inner = qp9Var;
            this.$collector = gbpVar;
            this.$semaphore = y9pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, ar4Var);
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d = dkf.d();
            int i = this.label;
            try {
                if (i == 0) {
                    b.b(obj);
                    qp9<T> qp9Var = this.$inner;
                    gbp<T> gbpVar = this.$collector;
                    this.label = 1;
                    if (qp9Var.a(gbpVar, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    b.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$semaphore.release();
                return xhv.INSTANCE;
            } catch (Throwable th) {
                this.$semaphore.release();
                throw th;
            }
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            return ((AnonymousClass1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2(m mVar, y9p y9pVar, ozm<? super T> ozmVar, gbp<T> gbpVar) {
        this.f15365a = mVar;
        this.b = y9pVar;
        this.c = ozmVar;
        this.d = gbpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(tb.qp9<? extends T> r8, tb.ar4<? super tb.xhv> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$1
            tb.qp9 r8 = (tb.qp9) r8
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) r0
            kotlin.b.b(r9)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.b.b(r9)
            kotlinx.coroutines.m r9 = r7.f15365a
            if (r9 == 0) goto L_0x0043
            tb.quf.g(r9)
        L_0x0043:
            tb.y9p r9 = r7.b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r7
        L_0x0053:
            tb.ozm<T> r1 = r0.c
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
            tb.gbp<T> r9 = r0.d
            tb.y9p r0 = r0.b
            r2 = 0
            r4.<init>(r8, r9, r0, r2)
            r3 = 0
            r5 = 3
            r6 = 0
            tb.mn2.b(r1, r2, r3, r4, r5, r6)
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.emit(tb.qp9, tb.ar4):java.lang.Object");
    }
}
