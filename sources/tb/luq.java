package tb;

import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class luq implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SubRewardNiubilityEnterEventController f23578a;

    public luq(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        this.f23578a = subRewardNiubilityEnterEventController;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        SubRewardNiubilityEnterEventController.o(this.f23578a).c();
        SubRewardNiubilityEnterEventController.f(this.f23578a).setVisibility(8);
        SubRewardNiubilityEnterEventController.g(this.f23578a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
        }
    }
}
