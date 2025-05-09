package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/lifecycle/LiveDataScope;", "Ltb/xhv;", "<anonymous>", "(Landroidx/lifecycle/LiveDataScope;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements u1a<LiveDataScope<T>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ qp9<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowLiveDataConversions$asLiveData$1(qp9<? extends T> qp9Var, ar4<? super FlowLiveDataConversions$asLiveData$1> ar4Var) {
        super(2, ar4Var);
        this.$this_asLiveData = qp9Var;
    }

    public static /* synthetic */ Object ipc$super(FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowLiveDataConversions$asLiveData$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, ar4Var);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object invoke(LiveDataScope<T> liveDataScope, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("995ad745", new Object[]{this, liveDataScope, ar4Var}) : ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            qp9<T> qp9Var = this.$this_asLiveData;
            sp9 sp9Var = new sp9() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sp9
                public final Object emit(T t, ar4<? super xhv> ar4Var) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("93a862aa", new Object[]{this, t, ar4Var});
                    }
                    Object emit = liveDataScope.emit(t, ar4Var);
                    if (emit == dkf.d()) {
                        return emit;
                    }
                    return xhv.INSTANCE;
                }
            };
            this.label = 1;
            if (qp9Var.a(sp9Var, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }
}
