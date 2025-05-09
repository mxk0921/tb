package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class iv1<T extends bdd> extends kv1<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup c;
    public ViewGroup d;

    static {
        t2o.a(295699014);
    }

    public iv1(xea xeaVar, ViewGroup viewGroup) {
        super(xeaVar);
        this.c = viewGroup;
        h();
    }

    public static /* synthetic */ Object ipc$super(iv1 iv1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/BaseGoodsPopViewNew");
    }

    public Animation f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            i(this.c);
        }
    }

    public abstract View i(ViewGroup viewGroup);
}
