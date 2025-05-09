package kotlinx.coroutines.flow;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.w1a;
import tb.xhv;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Ltb/sp9;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements w1a<sp9<Object>, Object, ar4<? super xhv>, Object> {
    final /* synthetic */ u1a $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(u1a u1aVar, ar4 ar4Var) {
        super(3, ar4Var);
        this.$transform = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sp9 sp9Var;
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sp9Var = (sp9) this.L$0;
            Object obj2 = this.L$1;
            u1a u1aVar = this.$transform;
            this.L$0 = sp9Var;
            this.label = 1;
            obj = u1aVar.invoke(obj2, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            sp9Var = (sp9) this.L$0;
            b.b(obj);
        } else if (i == 2) {
            b.b(obj);
            return xhv.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.L$0 = null;
        this.label = 2;
        if (yp9.n(sp9Var, (qp9) obj, this) == d) {
            return d;
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(sp9<Object> sp9Var, Object obj, ar4<? super xhv> ar4Var) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, ar4Var);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = sp9Var;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = obj;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(xhv.INSTANCE);
    }
}
