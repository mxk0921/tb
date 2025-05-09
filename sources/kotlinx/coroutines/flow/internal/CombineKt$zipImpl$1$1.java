package kotlinx.coroutines.flow.internal;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.n;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.qp9;
import tb.sp9;
import tb.t94;
import tb.u1a;
import tb.uu4;
import tb.w1a;
import tb.wp9;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {c.LOCATION_SECOND}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ qp9<Object> $flow;
    final /* synthetic */ qp9<Object> $flow2;
    final /* synthetic */ sp9<Object> $this_unsafeFlow;
    final /* synthetic */ w1a<Object, Object, ar4<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Throwable, xhv> {
        final /* synthetic */ t94 $collectJob;
        final /* synthetic */ sp9<Object> $this_unsafeFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(t94 t94Var, sp9<Object> sp9Var) {
            super(1);
            this.$collectJob = t94Var;
            this.$this_unsafeFlow = sp9Var;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            invoke2(th);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.$collectJob.isActive()) {
                this.$collectJob.a(new AbortFlowException(this.$this_unsafeFlow));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Ltb/xhv;", AdvanceSetting.NETWORK_TYPE, "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u1a<xhv, ar4<? super xhv>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ qp9<Object> $flow;
        final /* synthetic */ d $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ sp9<Object> $this_unsafeFlow;
        final /* synthetic */ w1a<Object, Object, ar4<Object>, Object> $transform;
        int label;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class AnonymousClass1<T> implements sp9 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f15368a;
            final /* synthetic */ Object b;
            final /* synthetic */ ReceiveChannel<Object> c;
            final /* synthetic */ sp9<Object> d;
            final /* synthetic */ w1a<Object, Object, ar4<Object>, Object> e;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Ltb/xhv;", AdvanceSetting.NETWORK_TYPE, "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, 132, 132}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
            public static final class C08631 extends SuspendLambda implements u1a<xhv, ar4<? super xhv>, Object> {
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ sp9<Object> $this_unsafeFlow;
                final /* synthetic */ w1a<Object, Object, ar4<Object>, Object> $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C08631(ReceiveChannel<? extends Object> receiveChannel, sp9<Object> sp9Var, w1a<Object, Object, ? super ar4<Object>, ? extends Object> w1aVar, Object obj, ar4<? super C08631> ar4Var) {
                    super(2, ar4Var);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = sp9Var;
                    this.$transform = w1aVar;
                    this.$value = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
                    return new C08631(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, ar4Var);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = tb.dkf.d()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L_0x0030
                        if (r1 == r5) goto L_0x0026
                        if (r1 == r4) goto L_0x001e
                        if (r1 != r3) goto L_0x0016
                        kotlin.b.b(r9)
                        goto L_0x006f
                    L_0x0016:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L_0x001e:
                        java.lang.Object r1 = r8.L$0
                        tb.sp9 r1 = (tb.sp9) r1
                        kotlin.b.b(r9)
                        goto L_0x0064
                    L_0x0026:
                        kotlin.b.b(r9)
                        kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.e) r9
                        java.lang.Object r9 = r9.j()
                        goto L_0x003e
                    L_0x0030:
                        kotlin.b.b(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.i(r8)
                        if (r9 != r0) goto L_0x003e
                        return r0
                    L_0x003e:
                        tb.sp9<java.lang.Object> r1 = r8.$this_unsafeFlow
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.e.c
                        if (r5 == 0) goto L_0x0050
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.e.c(r9)
                        if (r9 != 0) goto L_0x004f
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L_0x004f:
                        throw r9
                    L_0x0050:
                        tb.w1a<java.lang.Object, java.lang.Object, tb.ar4<java.lang.Object>, java.lang.Object> r5 = r8.$transform
                        java.lang.Object r6 = r8.$value
                        tb.u1r r7 = tb.iak.NULL
                        if (r9 != r7) goto L_0x0059
                        r9 = r2
                    L_0x0059:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L_0x0064
                        return r0
                    L_0x0064:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L_0x006f
                        return r0
                    L_0x006f:
                        tb.xhv r9 = tb.xhv.INSTANCE
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C08631.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public final Object invoke(xhv xhvVar, ar4<? super xhv> ar4Var) {
                    return ((C08631) create(xhvVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(d dVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, sp9<Object> sp9Var, w1a<Object, Object, ? super ar4<Object>, ? extends Object> w1aVar) {
                this.f15368a = dVar;
                this.b = obj;
                this.c = receiveChannel;
                this.d = sp9Var;
                this.e = w1aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // tb.sp9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r13, tb.ar4<? super tb.xhv> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = tb.dkf.d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.b.b(r14)
                    goto L_0x0051
                L_0x0029:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0031:
                    kotlin.b.b(r14)
                    kotlin.coroutines.d r14 = r12.f15368a
                    tb.xhv r2 = tb.xhv.INSTANCE
                    java.lang.Object r4 = r12.b
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.c
                    tb.sp9<java.lang.Object> r7 = r12.d
                    tb.w1a<java.lang.Object, java.lang.Object, tb.ar4<java.lang.Object>, java.lang.Object> r8 = r12.e
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.label = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.a.c(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L_0x0051
                    return r1
                L_0x0051:
                    tb.xhv r13 = tb.xhv.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, tb.ar4):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(qp9<Object> qp9Var, d dVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, sp9<Object> sp9Var, w1a<Object, Object, ? super ar4<Object>, ? extends Object> w1aVar, ar4<? super AnonymousClass2> ar4Var) {
            super(2, ar4Var);
            this.$flow = qp9Var;
            this.$scopeContext = dVar;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = sp9Var;
            this.$transform = w1aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d = dkf.d();
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                qp9<Object> qp9Var = this.$flow;
                AnonymousClass1 r1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
                this.label = 1;
                if (qp9Var.a(r1, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return xhv.INSTANCE;
        }

        public final Object invoke(xhv xhvVar, ar4<? super xhv> ar4Var) {
            return ((AnonymousClass2) create(xhvVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(sp9<Object> sp9Var, qp9<Object> qp9Var, qp9<Object> qp9Var2, w1a<Object, Object, ? super ar4<Object>, ? extends Object> w1aVar, ar4<? super CombineKt$zipImpl$1$1> ar4Var) {
        super(2, ar4Var);
        this.$this_unsafeFlow = sp9Var;
        this.$flow2 = qp9Var;
        this.$flow = qp9Var2;
        this.$transform = w1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, ar4Var);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        ReceiveChannel receiveChannel;
        AbortFlowException e;
        t94 b;
        ReceiveChannel receiveChannel2;
        d plus;
        xhv xhvVar;
        AnonymousClass2 r4;
        Object d = dkf.d();
        ReceiveChannel receiveChannel3 = this.label;
        try {
            if (receiveChannel3 == 0) {
                b.b(obj);
                uu4 uu4Var = (uu4) this.L$0;
                ReceiveChannel e2 = ProduceKt.e(uu4Var, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
                b = n.b(null, 1, null);
                ((i) e2).k(new AnonymousClass1(b, this.$this_unsafeFlow));
                try {
                    d coroutineContext = uu4Var.getCoroutineContext();
                    Object b2 = ThreadContextKt.b(coroutineContext);
                    plus = uu4Var.getCoroutineContext().plus(b);
                    xhvVar = xhv.INSTANCE;
                    r4 = new AnonymousClass2(this.$flow, coroutineContext, b2, e2, this.$this_unsafeFlow, this.$transform, null);
                    this.L$0 = e2;
                    this.label = 1;
                    receiveChannel2 = e2;
                    try {
                    } catch (AbortFlowException e3) {
                        e = e3;
                        receiveChannel = receiveChannel2;
                        wp9.a(e, this.$this_unsafeFlow);
                        receiveChannel3 = receiveChannel;
                        ReceiveChannel.DefaultImpls.a(receiveChannel3, null, 1, null);
                        return xhv.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel3 = receiveChannel2;
                        ReceiveChannel.DefaultImpls.a(receiveChannel3, null, 1, null);
                        throw th;
                    }
                } catch (AbortFlowException e4) {
                    e = e4;
                    receiveChannel2 = e2;
                } catch (Throwable th3) {
                    th = th3;
                    receiveChannel2 = e2;
                }
                if (a.d(plus, xhvVar, null, r4, this, 4, null) == d) {
                    return d;
                }
                receiveChannel3 = receiveChannel2;
                ReceiveChannel.DefaultImpls.a(receiveChannel3, null, 1, null);
                return xhv.INSTANCE;
            } else if (receiveChannel3 == 1) {
                receiveChannel = (ReceiveChannel) this.L$0;
                try {
                    b.b(obj);
                    receiveChannel3 = receiveChannel;
                } catch (AbortFlowException e5) {
                    e = e5;
                }
                ReceiveChannel.DefaultImpls.a(receiveChannel3, null, 1, null);
                return xhv.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wp9.a(e, this.$this_unsafeFlow);
            receiveChannel3 = receiveChannel;
            ReceiveChannel.DefaultImpls.a(receiveChannel3, null, 1, null);
            return xhv.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((CombineKt$zipImpl$1$1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
