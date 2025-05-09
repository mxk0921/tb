package androidx.core.transition;

import android.transition.Transition;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TransitionKt$addListener$5 extends Lambda implements g1a<Transition, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TransitionKt$addListener$5 INSTANCE = new TransitionKt$addListener$5();

    public TransitionKt$addListener$5() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(TransitionKt$addListener$5 transitionKt$addListener$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/transition/TransitionKt$addListener$5");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1db6bf3", new Object[]{this, transition});
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Transition transition) {
        invoke2(transition);
        return xhv.INSTANCE;
    }
}
