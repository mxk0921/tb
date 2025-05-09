package tb;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n0n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOADING_COLOR = -1;

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f24429a;
    public boolean b;

    static {
        t2o.a(468714089);
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feed6a9", new Object[]{this, view});
        } else if (view != null && !this.b) {
            this.b = true;
            view.setVisibility(8);
            AnimatorSet animatorSet = this.f24429a;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2a1592", new Object[]{this, view});
        } else if (view != null) {
            this.b = false;
            view.setVisibility(0);
            if (this.f24429a == null) {
                this.f24429a = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.7f, 0.0f);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                this.f24429a.playTogether(ofFloat, ofFloat2);
                this.f24429a.setDuration(650L);
            }
            this.f24429a.start();
        }
    }
}
