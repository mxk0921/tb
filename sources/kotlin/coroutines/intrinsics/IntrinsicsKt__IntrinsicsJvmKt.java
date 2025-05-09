package kotlin.coroutines.intrinsics;

import kotlin.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import tb.ar4;
import tb.ckf;
import tb.g1a;
import tb.jv6;
import tb.kqu;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    public static <T> ar4<xhv> a(final g1a<? super ar4<? super T>, ? extends Object> g1aVar, final ar4<? super T> ar4Var) {
        ckf.g(g1aVar, "<this>");
        ckf.g(ar4Var, "completion");
        jv6.a(ar4Var);
        if (g1aVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) g1aVar).create(ar4Var);
        }
        final d context = ar4Var.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(ar4Var, g1aVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                final /* synthetic */ g1a $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(ar4Var);
                    this.$this_createCoroutineUnintercepted$inlined = g1aVar;
                    ckf.e(ar4Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        b.b(obj);
                        ckf.e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        g1a g1aVar2 = this.$this_createCoroutineUnintercepted$inlined;
                        kqu.e(g1aVar2, 1);
                        return g1aVar2.invoke(this);
                    } else if (i == 1) {
                        this.label = 2;
                        b.b(obj);
                        return obj;
                    } else {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            };
        }
        return new ContinuationImpl(ar4Var, context, g1aVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ g1a $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(ar4Var, context);
                this.$this_createCoroutineUnintercepted$inlined = g1aVar;
                ckf.e(ar4Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    b.b(obj);
                    ckf.e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    g1a g1aVar2 = this.$this_createCoroutineUnintercepted$inlined;
                    kqu.e(g1aVar2, 1);
                    return g1aVar2.invoke(this);
                } else if (i == 1) {
                    this.label = 2;
                    b.b(obj);
                    return obj;
                } else {
                    throw new IllegalStateException("This coroutine had already completed");
                }
            }
        };
    }

    public static <R, T> ar4<xhv> b(final u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar, final R r, final ar4<? super T> ar4Var) {
        ckf.g(u1aVar, "<this>");
        ckf.g(ar4Var, "completion");
        jv6.a(ar4Var);
        if (u1aVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) u1aVar).create(r, ar4Var);
        }
        final d context = ar4Var.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(ar4Var, u1aVar, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ u1a $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(ar4Var);
                    this.$this_createCoroutineUnintercepted$inlined = u1aVar;
                    this.$receiver$inlined = r;
                    ckf.e(ar4Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        b.b(obj);
                        ckf.e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        u1a u1aVar2 = this.$this_createCoroutineUnintercepted$inlined;
                        kqu.e(u1aVar2, 2);
                        return u1aVar2.invoke(this.$receiver$inlined, this);
                    } else if (i == 1) {
                        this.label = 2;
                        b.b(obj);
                        return obj;
                    } else {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            };
        }
        return new ContinuationImpl(ar4Var, context, u1aVar, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ u1a $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(ar4Var, context);
                this.$this_createCoroutineUnintercepted$inlined = u1aVar;
                this.$receiver$inlined = r;
                ckf.e(ar4Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    b.b(obj);
                    ckf.e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    u1a u1aVar2 = this.$this_createCoroutineUnintercepted$inlined;
                    kqu.e(u1aVar2, 2);
                    return u1aVar2.invoke(this.$receiver$inlined, this);
                } else if (i == 1) {
                    this.label = 2;
                    b.b(obj);
                    return obj;
                } else {
                    throw new IllegalStateException("This coroutine had already completed");
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> ar4<T> c(ar4<? super T> ar4Var) {
        ContinuationImpl continuationImpl;
        ar4<T> ar4Var2;
        ckf.g(ar4Var, "<this>");
        if (ar4Var instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) ar4Var;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl == null || (ar4Var2 = (ar4<T>) continuationImpl.intercepted()) == null) {
            return ar4Var;
        }
        return ar4Var2;
    }
}
