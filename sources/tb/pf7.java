package tb;

import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.fragment.weex.DetailFullScreenVesselFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pf7 implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DetailFullScreenVesselFragment f26059a;

    public pf7(DetailFullScreenVesselFragment detailFullScreenVesselFragment) {
        this.f26059a = detailFullScreenVesselFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
        } else {
            this.f26059a.dismiss();
        }
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
