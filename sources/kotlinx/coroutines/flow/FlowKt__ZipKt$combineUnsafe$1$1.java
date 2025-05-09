package kotlinx.coroutines.flow;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Ltb/sp9;", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__ZipKt$combineUnsafe$1$1 extends SuspendLambda implements w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> {
    final /* synthetic */ u1a<Object[], ar4<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineUnsafe$1$1(u1a<? super Object[], ? super ar4<Object>, ? extends Object> u1aVar, ar4<? super FlowKt__ZipKt$combineUnsafe$1$1> ar4Var) {
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
            u1a<Object[], ar4<Object>, Object> u1aVar = this.$transform;
            this.L$0 = sp9Var;
            this.label = 1;
            obj = u1aVar.invoke((Object[]) this.L$1, this);
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
        if (sp9Var.emit(obj, this) == d) {
            return d;
        }
        return xhv.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        ((sp9) this.L$0).emit(this.$transform.invoke((Object[]) this.L$1, this), this);
        return xhv.INSTANCE;
    }

    public final Object invoke(sp9<Object> sp9Var, Object[] objArr, ar4<? super xhv> ar4Var) {
        ckf.l();
        throw null;
    }
}
