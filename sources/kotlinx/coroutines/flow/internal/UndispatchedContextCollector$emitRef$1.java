package kotlinx.coroutines.flow.internal;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements u1a<T, ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(sp9<? super T> sp9Var, ar4<? super UndispatchedContextCollector$emitRef$1> ar4Var) {
        super(2, ar4Var);
        this.$downstream = sp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, ar4Var);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(Object obj, ar4<? super xhv> ar4Var) {
        return invoke2((UndispatchedContextCollector$emitRef$1) obj, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Object obj2 = this.L$0;
            sp9<T> sp9Var = this.$downstream;
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

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(T t, ar4<? super xhv> ar4Var) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
