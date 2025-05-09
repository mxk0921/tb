package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.w1a;
import tb.xhv;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:80)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:52)
    */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1<T> implements sp9 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef<m> f15366a;
        final /* synthetic */ uu4 b;
        final /* synthetic */ ChannelFlowTransformLatest<T, R> c;
        final /* synthetic */ sp9<R> d;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
            final /* synthetic */ sp9<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, sp9<? super R> sp9Var, T t, ar4<? super AnonymousClass2> ar4Var) {
                super(2, ar4Var);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = sp9Var;
                this.$value = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, ar4Var);
            }

            @Override // tb.u1a
            public /* bridge */ /* synthetic */ Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
                return invoke2(uu4Var, ar4Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                w1a w1aVar;
                Object d = dkf.d();
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    w1aVar = ((ChannelFlowTransformLatest) this.this$0).e;
                    Object obj2 = this.$collector;
                    T t = this.$value;
                    this.label = 1;
                    if (w1aVar.invoke(obj2, t, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    b.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return xhv.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(uu4 uu4Var, ar4<? super xhv> ar4Var) {
                return ((AnonymousClass2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<m> ref$ObjectRef, uu4 uu4Var, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, sp9<? super R> sp9Var) {
            this.f15366a = ref$ObjectRef;
            this.b = uu4Var;
            this.c = channelFlowTransformLatest;
            this.d = sp9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        @Override // tb.sp9
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, tb.ar4<? super tb.xhv> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = tb.dkf.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x003b
                if (r2 != r3) goto L_0x0033
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.m r8 = (kotlinx.coroutines.m) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1) r0
                kotlin.b.b(r9)
                goto L_0x005e
            L_0x0033:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003b:
                kotlin.b.b(r9)
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.m> r9 = r7.f15366a
                T r9 = r9.element
                kotlinx.coroutines.m r9 = (kotlinx.coroutines.m) r9
                if (r9 == 0) goto L_0x005d
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.a(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.f0(r0)
                if (r9 != r1) goto L_0x005d
                return r1
            L_0x005d:
                r0 = r7
            L_0x005e:
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.m> r9 = r0.f15366a
                tb.uu4 r1 = r0.b
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r2 = r0.c
                tb.sp9<R> r0 = r0.d
                r5 = 0
                r4.<init>(r2, r0, r8, r5)
                r6 = 0
                r2 = 0
                r5 = 1
                kotlinx.coroutines.m r8 = tb.mn2.b(r1, r2, r3, r4, r5, r6)
                r9.element = r8
                tb.xhv r8 = tb.xhv.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.emit(java.lang.Object, tb.ar4):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, sp9<? super R> sp9Var, ar4<? super ChannelFlowTransformLatest$flowCollect$3> ar4Var) {
        super(2, ar4Var);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, ar4Var);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return invoke2(uu4Var, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
            qp9<S> qp9Var = channelFlowTransformLatest.d;
            AnonymousClass1 r5 = new AnonymousClass1(ref$ObjectRef, (uu4) this.L$0, channelFlowTransformLatest, this.$collector);
            this.label = 1;
            if (qp9Var.a(r5, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
