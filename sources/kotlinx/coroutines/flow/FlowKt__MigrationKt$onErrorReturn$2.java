package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltb/sp9;", "", "e", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements w1a<sp9<Object>, Throwable, ar4<? super xhv>, Object> {
    final /* synthetic */ Object $fallback;
    final /* synthetic */ g1a<Throwable, Boolean> $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MigrationKt$onErrorReturn$2(g1a<? super Throwable, Boolean> g1aVar, Object obj, ar4<? super FlowKt__MigrationKt$onErrorReturn$2> ar4Var) {
        super(3, ar4Var);
        this.$predicate = g1aVar;
        this.$fallback = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sp9 sp9Var = (sp9) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (this.$predicate.invoke(th).booleanValue()) {
                Object obj2 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (sp9Var.emit(obj2, this) == d) {
                    return d;
                }
            } else {
                throw th;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(sp9<Object> sp9Var, Throwable th, ar4<? super xhv> ar4Var) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, ar4Var);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = sp9Var;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(xhv.INSTANCE);
    }
}
