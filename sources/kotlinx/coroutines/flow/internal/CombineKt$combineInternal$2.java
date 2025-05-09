package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.channels.i;
import tb.ar4;
import tb.d1a;
import tb.dkf;
import tb.hte;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ d1a<T[]> $arrayFactory;
    final /* synthetic */ qp9<T>[] $flows;
    final /* synthetic */ sp9<R> $this_combineInternal;
    final /* synthetic */ w1a<sp9<? super R>, T[], ar4<? super xhv>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        final /* synthetic */ qp9<T>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ c<hte<Object>> $resultChannel;
        int label;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class C08621<T> implements sp9 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c<hte<Object>> f15367a;
            final /* synthetic */ int b;

            public C08621(c<hte<Object>> cVar, int i) {
                this.f15367a = cVar;
                this.b = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
            @Override // tb.sp9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, tb.ar4<? super tb.xhv> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = tb.dkf.d()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0038
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.b.b(r8)
                    goto L_0x0056
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    kotlin.b.b(r8)
                    goto L_0x004d
                L_0x0038:
                    kotlin.b.b(r8)
                    kotlinx.coroutines.channels.c<tb.hte<java.lang.Object>> r8 = r6.f15367a
                    tb.hte r2 = new tb.hte
                    int r5 = r6.b
                    r2.<init>(r5, r7)
                    r0.label = r4
                    java.lang.Object r7 = r8.d(r2, r0)
                    if (r7 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    r0.label = r3
                    java.lang.Object r7 = tb.wox.a(r0)
                    if (r7 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    tb.xhv r7 = tb.xhv.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C08621.emit(java.lang.Object, tb.ar4):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(qp9<? extends T>[] qp9VarArr, int i, AtomicInteger atomicInteger, c<hte<Object>> cVar, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$flows = qp9VarArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            Object d = dkf.d();
            int i = this.label;
            try {
                if (i == 0) {
                    b.b(obj);
                    qp9[] qp9VarArr = this.$flows;
                    int i2 = this.$i;
                    qp9 qp9Var = qp9VarArr[i2];
                    C08621 r4 = new C08621(this.$resultChannel, i2);
                    this.label = 1;
                    if (qp9Var.a(r4, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    b.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    i.a.a(this.$resultChannel, null, 1, null);
                }
                return xhv.INSTANCE;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    i.a.a(this.$resultChannel, null, 1, null);
                }
            }
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            return ((AnonymousClass1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(qp9<? extends T>[] qp9VarArr, d1a<T[]> d1aVar, w1a<? super sp9<? super R>, ? super T[], ? super ar4<? super xhv>, ? extends Object> w1aVar, sp9<? super R> sp9Var, ar4<? super CombineKt$combineInternal$2> ar4Var) {
        super(2, ar4Var);
        this.$flows = qp9VarArr;
        this.$arrayFactory = d1aVar;
        this.$transform = w1aVar;
        this.$this_combineInternal = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, ar4Var);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[LOOP:1: B:27:0x00c9->B:33:0x00ec, LOOP_START, PHI: r6 r10 
      PHI: (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:24:0x00c4, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v3 tb.hte) = (r10v2 tb.hte), (r10v16 tb.hte) binds: [B:24:0x00c4, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v1, types: [tb.qp9[], tb.qp9<T>[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [tb.qp9<T>[]] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0134 -> B:44:0x0136). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((CombineKt$combineInternal$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
