package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ajq;
import tb.ar4;
import tb.dkf;
import tb.hfj;
import tb.o94;
import tb.qp9;
import tb.quf;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ o94<ajq<Object>> $result;
    final /* synthetic */ qp9<Object> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> implements sp9 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef<hfj<T>> f15325a;
        final /* synthetic */ uu4 b;
        final /* synthetic */ o94<ajq<T>> c;

        public a(Ref$ObjectRef<hfj<T>> ref$ObjectRef, uu4 uu4Var, o94<ajq<T>> o94Var) {
            this.f15325a = ref$ObjectRef;
            this.b = uu4Var;
        }

        @Override // tb.sp9
        public final Object emit(T t, ar4<? super xhv> ar4Var) {
            xhv xhvVar;
            hfj<T> hfjVar = this.f15325a.element;
            if (hfjVar != null) {
                hfjVar.setValue(t);
                xhvVar = xhv.INSTANCE;
            } else {
                xhvVar = null;
            }
            if (xhvVar != null) {
                return xhv.INSTANCE;
            }
            uu4 uu4Var = this.b;
            m.a(t);
            quf.h(uu4Var.getCoroutineContext());
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(qp9<Object> qp9Var, o94<ajq<Object>> o94Var, ar4<? super FlowKt__ShareKt$launchSharingDeferred$1> ar4Var) {
        super(2, ar4Var);
        this.$upstream = qp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, null, ar4Var);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            uu4 uu4Var = (uu4) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            qp9<Object> qp9Var = this.$upstream;
            a aVar = new a(ref$ObjectRef, uu4Var, null);
            this.label = 1;
            if (qp9Var.a(aVar, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
