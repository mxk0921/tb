package androidx.core.animation;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AnimatorKt$addPauseListener$2 extends Lambda implements g1a<Animator, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AnimatorKt$addPauseListener$2 INSTANCE = new AnimatorKt$addPauseListener$2();

    public AnimatorKt$addPauseListener$2() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(AnimatorKt$addPauseListener$2 animatorKt$addPauseListener$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/animation/AnimatorKt$addPauseListener$2");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f2fc9c", new Object[]{this, animator});
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Animator animator) {
        invoke2(animator);
        return xhv.INSTANCE;
    }
}
