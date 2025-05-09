package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", "value", "Ltb/xhv;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Transformations$distinctUntilChanged$1 extends Lambda implements g1a<X, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $firstTime;
    public final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = ref$BooleanRef;
    }

    public static /* synthetic */ Object ipc$super(Transformations$distinctUntilChanged$1 transformations$distinctUntilChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/Transformations$distinctUntilChanged$1");
    }

    @Override // tb.g1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, x});
            return;
        }
        Object value = this.$outputLiveData.getValue();
        if (this.$firstTime.element || ((value == null && x != 0) || (value != null && !ckf.b(value, x)))) {
            this.$firstTime.element = false;
            this.$outputLiveData.setValue(x);
        }
    }
}
