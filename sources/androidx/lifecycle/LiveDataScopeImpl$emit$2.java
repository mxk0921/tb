package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LiveDataScopeImpl$emit$2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ T $value;
    public int label;
    public final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t, ar4<? super LiveDataScopeImpl$emit$2> ar4Var) {
        super(2, ar4Var);
        this.this$0 = liveDataScopeImpl;
        this.$value = t;
    }

    public static /* synthetic */ Object ipc$super(LiveDataScopeImpl$emit$2 liveDataScopeImpl$emit$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/LiveDataScopeImpl$emit$2");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, ar4Var);
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
            CoroutineLiveData target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            this.label = 1;
            if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
        return xhv.INSTANCE;
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((LiveDataScopeImpl$emit$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
