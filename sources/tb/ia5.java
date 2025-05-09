package tb;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ia5 implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f21185a;
    public final /* synthetic */ DWVideoViewController b;

    public ia5(DWVideoViewController dWVideoViewController, boolean z) {
        this.b = dWVideoViewController;
        this.f21185a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        } else {
            DWVideoViewController.H(this.b, this.f21185a);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
        } else {
            DWVideoViewController.H(this.b, this.f21185a);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        }
    }
}
