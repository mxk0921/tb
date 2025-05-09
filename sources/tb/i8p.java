package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i8p extends AnimatorListenerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k8p f21159a;

    public i8p(k8p k8pVar) {
        this.f21159a = k8pVar;
    }

    public static /* synthetic */ Object ipc$super(i8p i8pVar, String str, Object... objArr) {
        if (str.hashCode() == -2145066406) {
            super.onAnimationEnd((Animator) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/SecurityWarning/SecurityWarningComponent$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        super.onAnimationEnd(animator);
        k8p.f(this.f21159a, false);
    }
}
