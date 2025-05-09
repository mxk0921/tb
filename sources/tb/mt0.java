package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mt0 extends rfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24283a;

        public a(View view) {
            this.f24283a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            fve.e("AllChannelGuideAnimeScaleTask", "高亮动画执行完成");
            mt0.this.u();
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
                return;
            }
            fve.e("AllChannelGuideAnimeScaleTask", "开始执行高亮动画");
            this.f24283a.setVisibility(0);
        }
    }

    static {
        t2o.a(491782376);
    }

    public mt0(Context context, rdc.a aVar) {
        super(context, aVar);
    }

    public static /* synthetic */ Object ipc$super(mt0 mt0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/anime/AllChannelGuideAnimeScaleTask");
    }

    public final void B(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dee3dd", new Object[]{this, view, view2});
            return;
        }
        this.g = new WeakReference<>(view2);
        view.getGlobalVisibleRect(new Rect());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int c = pb6.c(view.getContext(), 35.0f);
        int c2 = pb6.c(view.getContext(), 3.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c, c);
        layoutParams.leftMargin = iArr[0] - c2;
        layoutParams.topMargin = iArr[1] - c2;
        view2.setVisibility(4);
        this.d.addView(view2, layoutParams);
        fve.e("AllChannelGuideAnimeScaleTask", "build highlight view");
    }

    public final Animation C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("95d702a7", new Object[]{this});
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(800L);
        alphaAnimation.setDuration(300L);
        return alphaAnimation;
    }

    public final Animation D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("351893e0", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 1.0f);
        alphaAnimation2.setStartOffset(300L);
        alphaAnimation2.setDuration(800L);
        animationSet.addAnimation(alphaAnimation2);
        return animationSet;
    }

    public final Animation E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("6574975", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.5f, 1.5f, 1.5f, 1, 0.0f, 1, 0.0f);
        scaleAnimation.setDuration(600L);
        scaleAnimation.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.0f, 1, 0.0f);
        scaleAnimation2.setStartOffset(600L);
        scaleAnimation2.setDuration(300L);
        animationSet.addAnimation(scaleAnimation2);
        return animationSet;
    }

    @Override // tb.x10
    public void z(nxa nxaVar, View view, int[] iArr, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3b6fc0", new Object[]{this, nxaVar, view, iArr, rect, new Integer(i), new Integer(i2)});
            return;
        }
        fve.e("AllChannelGuideAnimeScaleTask", "startAnimation");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            u();
            return;
        }
        ViewGroup c = nxaVar.c(view);
        B(view, c);
        WeakReference<View> weakReference = this.g;
        View view2 = weakReference == null ? null : weakReference.get();
        if (view2 == null) {
            u();
            return;
        }
        Context context = view.getContext();
        View b = nxaVar.b(view, pb6.c(context, 3.0f), pb6.c(context, 3.0f));
        if (b == null) {
            u();
            return;
        }
        c.addView(b);
        Animation D = D();
        this.b = D;
        D.setAnimationListener(new a(view2));
        view2.startAnimation(this.b);
        b.startAnimation(E());
        this.d.startAnimation(C());
    }
}
