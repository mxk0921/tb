package tb;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wmf implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ umf f30776a;

    public wmf(umf umfVar) {
        this.f30776a = umfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        TUrlImageView k0 = umf.k0(this.f30776a);
        if (k0 != null) {
            k0.setVisibility(8);
        } else {
            ckf.y("mScanLine");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        TUrlImageView k0 = umf.k0(this.f30776a);
        if (k0 != null) {
            k0.setVisibility(8);
        } else {
            ckf.y("mScanLine");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        } else {
            ckf.g(animator, "animation");
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        } else {
            ckf.g(animator, "animation");
        }
    }
}
