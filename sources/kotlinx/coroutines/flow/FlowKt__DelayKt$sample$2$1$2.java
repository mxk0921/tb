package kotlinx.coroutines.flow;

import com.alibaba.wireless.security.SecExceptionCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ar4;
import tb.dkf;
import tb.iak;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/xhv;", AdvanceSetting.NETWORK_TYPE, "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {SecExceptionCode.SEC_ERROR_STA_STORE_UNKNOWN_ERROR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements u1a<xhv, ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<Object> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, sp9<Object> sp9Var, ar4<? super FlowKt__DelayKt$sample$2$1$2> ar4Var) {
        super(2, ar4Var);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == null) {
                return xhv.INSTANCE;
            }
            ref$ObjectRef.element = null;
            sp9<Object> sp9Var = this.$downstream;
            if (obj2 == iak.NULL) {
                obj2 = null;
            }
            this.label = 1;
            if (sp9Var.emit(obj2, this) == d) {
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
        return ((FlowKt__DelayKt$sample$2$1$2) create(xhvVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
