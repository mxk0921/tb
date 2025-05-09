package kotlinx.coroutines.flow;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.dlp;
import tb.gfj;
import tb.gk2;
import tb.qp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ gfj<Object> $shared;
    final /* synthetic */ k $started;
    final /* synthetic */ qp9<Object> $upstream;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", AdvanceSetting.NETWORK_TYPE, ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<Integer, ar4<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            AnonymousClass1 r0 = new AnonymousClass1(ar4Var);
            r0.I$0 = ((Number) obj).intValue();
            return r0;
        }

        public final Object invoke(int i, ar4<? super Boolean> ar4Var) {
            return ((AnonymousClass1) create(Integer.valueOf(i), ar4Var)).invokeSuspend(xhv.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            dkf.d();
            if (this.label == 0) {
                b.b(obj);
                if (this.I$0 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return gk2.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ar4<? super Boolean> ar4Var) {
            return invoke(num.intValue(), ar4Var);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u1a<SharingCommand, ar4<? super xhv>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ gfj<Object> $shared;
        final /* synthetic */ qp9<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: Taobao */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(qp9<Object> qp9Var, gfj<Object> gfjVar, Object obj, ar4<? super AnonymousClass2> ar4Var) {
            super(2, ar4Var);
            this.$upstream = qp9Var;
            this.$shared = gfjVar;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, ar4Var);
            r0.L$0 = obj;
            return r0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d = dkf.d();
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                int i2 = a.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    qp9<Object> qp9Var = this.$upstream;
                    gfj<Object> gfjVar = this.$shared;
                    this.label = 1;
                    if (qp9Var.a(gfjVar, this) == d) {
                        return d;
                    }
                } else if (i2 == 3) {
                    Object obj2 = this.$initialValue;
                    if (obj2 == dlp.NO_VALUE) {
                        this.$shared.c();
                    } else {
                        this.$shared.d(obj2);
                    }
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return xhv.INSTANCE;
        }

        public final Object invoke(SharingCommand sharingCommand, ar4<? super xhv> ar4Var) {
            return ((AnonymousClass2) create(sharingCommand, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(k kVar, qp9<Object> qp9Var, gfj<Object> gfjVar, Object obj, ar4<? super FlowKt__ShareKt$launchSharing$1> ar4Var) {
        super(2, ar4Var);
        this.$started = kVar;
        this.$upstream = qp9Var;
        this.$shared = gfjVar;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, ar4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r5) goto L_0x0021
            if (r1 == r4) goto L_0x001d
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0015
            goto L_0x0021
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001d:
            kotlin.b.b(r8)
            goto L_0x005c
        L_0x0021:
            kotlin.b.b(r8)
            goto L_0x008d
        L_0x0025:
            kotlin.b.b(r8)
            kotlinx.coroutines.flow.k r8 = r7.$started
            kotlinx.coroutines.flow.k$a r1 = kotlinx.coroutines.flow.k.Companion
            kotlinx.coroutines.flow.k r6 = r1.a()
            if (r8 != r6) goto L_0x003f
            tb.qp9<java.lang.Object> r8 = r7.$upstream
            tb.gfj<java.lang.Object> r1 = r7.$shared
            r7.label = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L_0x008d
            return r0
        L_0x003f:
            kotlinx.coroutines.flow.k r8 = r7.$started
            kotlinx.coroutines.flow.k r1 = r1.b()
            r5 = 0
            if (r8 != r1) goto L_0x0069
            tb.gfj<java.lang.Object> r8 = r7.$shared
            tb.ajq r8 = r8.e()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = tb.yp9.q(r8, r1, r7)
            if (r8 != r0) goto L_0x005c
            return r0
        L_0x005c:
            tb.qp9<java.lang.Object> r8 = r7.$upstream
            tb.gfj<java.lang.Object> r1 = r7.$shared
            r7.label = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L_0x008d
            return r0
        L_0x0069:
            kotlinx.coroutines.flow.k r8 = r7.$started
            tb.gfj<java.lang.Object> r1 = r7.$shared
            tb.ajq r1 = r1.e()
            tb.qp9 r8 = r8.a(r1)
            tb.qp9 r8 = tb.yp9.k(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            tb.qp9<java.lang.Object> r3 = r7.$upstream
            tb.gfj<java.lang.Object> r4 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r8 = tb.yp9.g(r8, r1, r7)
            if (r8 != r0) goto L_0x008d
            return r0
        L_0x008d:
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((FlowKt__ShareKt$launchSharing$1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
