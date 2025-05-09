package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/sp9;", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {IFAAFaceManager.STATUS_FACE_NO_FACE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements u1a<sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayFlow$1(long j, ar4<? super FlowKt__MigrationKt$delayFlow$1> ar4Var) {
        super(2, ar4Var);
        this.$timeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        return new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.$timeMillis;
            this.label = 1;
            if (DelayKt.b(j, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        return ((FlowKt__MigrationKt$delayFlow$1) create(sp9Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
