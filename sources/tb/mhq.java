package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewDetailMaskFrameLayout f24051a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ float c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;

        public a(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z, float f, boolean z2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f24051a = newDetailMaskFrameLayout;
            this.b = z;
            this.c = f;
            this.d = z2;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
            this.i = f6;
            this.j = f7;
            this.k = f8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
            if (r3 >= 0) goto L_0x012b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
            if (r2.j.B() != false) goto L_0x0133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0133, code lost:
            r1 = r7.f24051a;
            r1.mHasFrozenOuterSuccessLayout = true;
            r1.frozenNoneCoreLayout();
            r7.f24051a.frozenOuterNoneCoreLayout();
            r1 = r7.f24051a.mNewDetailMaskFrameLayoutContext.j;
            r1.a(r1.n(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
            r1 = r7.f24051a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
            if (r1.mHasSetBottomBarColor != false) goto L_0x015f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x015a, code lost:
            if (r8 <= 0.9f) goto L_0x015f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x015c, code lost:
            r1.setCurrentBottomBarColor();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
            r7.f24051a.invalidate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
            return;
         */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationUpdate(android.animation.ValueAnimator r8) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.mhq.a.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewDetailMaskFrameLayout f24052a;
        public final /* synthetic */ boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!b.this.f24052a.isDestroy()) {
                    b.this.f24052a.checkAndTryConvertActivityFromTranslucent();
                }
            }
        }

        public b(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
            this.f24052a = newDetailMaskFrameLayout;
            this.b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                onAnimationEnd(animator);
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
                return;
            }
            try {
                if (this.f24052a.mNewDetailMaskFrameLayoutContext.j.J()) {
                    this.f24052a.frozenNoneCoreLayout();
                    this.f24052a.frozenOuterNoneCoreLayout();
                }
            } catch (Throwable th) {
                l5i l5iVar = this.f24052a.mNewDetailMaskFrameLayoutContext.j;
                l5iVar.b(l5iVar.n(), "动画开始时，场景冻结出错。", th);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!this.f24052a.isDestroy()) {
                NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f24052a;
                newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext.f = false;
                if (!newDetailMaskFrameLayout.mHasSetBottomBarColor) {
                    newDetailMaskFrameLayout.setCurrentBottomBarColor();
                }
                this.f24052a.setAlpha(1.0f);
                this.f24052a.setScaleX(1.0f);
                this.f24052a.setScaleY(1.0f);
                this.f24052a.setTranslationX(0.0f);
                this.f24052a.setTranslationX(0.0f);
                this.f24052a.getMainHandler().postDelayed(new a(), this.f24052a.getMaskHandler().g());
                if (this.b) {
                    this.f24052a.mScaleImageView.setVisibility(8);
                }
                try {
                    this.f24052a.resumeNoneCoreLayout();
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = this.f24052a;
                    newDetailMaskFrameLayout2.mFrozenLayoutCount = 0;
                    newDetailMaskFrameLayout2.resumeOuterNoneCoreLayout();
                    this.f24052a.mFrozenOutLayoutCount = 0;
                } catch (Throwable th) {
                    l5i l5iVar = this.f24052a.mNewDetailMaskFrameLayoutContext.j;
                    l5iVar.b(l5iVar.n(), "新转场完成后，主视图恢复出错。", th);
                }
                this.f24052a.checkAndTryProcessDelayTask();
            }
        }
    }

    static {
        t2o.a(352322014);
    }

    public static void a(NewDetailMaskFrameLayout newDetailMaskFrameLayout, ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bce6d2", new Object[]{newDetailMaskFrameLayout, valueAnimator, animatorUpdateListener, animatorListener});
        } else if (valueAnimator != null && animatorUpdateListener != null && animatorListener != null) {
            if (newDetailMaskFrameLayout.getMaskHandler().D()) {
                e25 e25Var = new e25();
                e25Var.c = animatorUpdateListener;
                e25Var.d = valueAnimator;
                e25Var.e = animatorListener;
                int l = newDetailMaskFrameLayout.getMaskHandler().l();
                if (l > 0) {
                    if (newDetailMaskFrameLayout.getMaskHandler().m() > 0) {
                        if (NewDetailMaskFrameLayout.sFrameSpeedAvgDuration > newDetailMaskFrameLayout.getMaskHandler().m()) {
                            i = 16;
                        } else {
                            l = (l * 2) / 3;
                            i = 18;
                        }
                        e25Var.f = i;
                    }
                    e25Var.f18222a = l;
                    l5i maskHandler = newDetailMaskFrameLayout.getMaskHandler();
                    String logTag = newDetailMaskFrameLayout.getLogTag();
                    maskHandler.a(logTag, "customVerticalSyncAnimation currentRealMinFrameFit:" + e25Var.f + " frameMaxCount:" + e25Var.f18222a);
                    z = e25Var.j();
                }
            }
            if (!z) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.addListener(animatorListener);
                valueAnimator.start();
            }
        }
    }

    public static void b(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd0f383", new Object[]{newDetailMaskFrameLayout});
        } else if (!newDetailMaskFrameLayout.mHasShowAnim) {
            newDetailMaskFrameLayout.mHasShowAnim = true;
            newDetailMaskFrameLayout.getMaskHandler().f23120a = newDetailMaskFrameLayout;
            if (newDetailMaskFrameLayout.getMaskHandler().E()) {
                newDetailMaskFrameLayout.setAlpha(1.0f);
            }
            float f = newDetailMaskFrameLayout.mScreenWidth;
            float f2 = newDetailMaskFrameLayout.mImageViewStartWidth;
            float f3 = newDetailMaskFrameLayout.mScreenHeight;
            float f4 = newDetailMaskFrameLayout.mImageViewStartHeight;
            float f5 = (int) (f - f2);
            float f6 = (int) (f3 - f4);
            float f7 = f3 / f4;
            float f8 = f / f2;
            float f9 = (-(newDetailMaskFrameLayout.mImageViewStartLeftMargin / f5)) * f5;
            float f10 = f6 * (-(newDetailMaskFrameLayout.mImageViewStartTopMargin / f6));
            if (newDetailMaskFrameLayout.mScaleImageView == null || !newDetailMaskFrameLayout.getMaskHandler().I()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                newDetailMaskFrameLayout.mScaleImageView.setPivotX(0.0f);
                newDetailMaskFrameLayout.mScaleImageView.setPivotY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(bx0.c(newDetailMaskFrameLayout.getMaskHandler().s(), newDetailMaskFrameLayout.getMaskHandler()));
            ofFloat.setInterpolator(newDetailMaskFrameLayout.getMaskHandler().v());
            float f11 = newDetailMaskFrameLayout.mImageViewStartWidth / newDetailMaskFrameLayout.mScreenWidth;
            float f12 = newDetailMaskFrameLayout.mImageViewStartHeight / newDetailMaskFrameLayout.mScreenHeight;
            newDetailMaskFrameLayout.setPivotX(0.0f);
            newDetailMaskFrameLayout.setPivotY(0.0f);
            newDetailMaskFrameLayout.setScaleX(f11);
            newDetailMaskFrameLayout.setScaleY(f12);
            newDetailMaskFrameLayout.setTranslationX(newDetailMaskFrameLayout.mImageViewStartLeftMargin);
            newDetailMaskFrameLayout.setTranslationY(newDetailMaskFrameLayout.mImageViewStartTopMargin);
            float u = newDetailMaskFrameLayout.getMaskHandler().u();
            float p = newDetailMaskFrameLayout.getMaskHandler().p();
            if (newDetailMaskFrameLayout.getMaskHandler().G()) {
                newDetailMaskFrameLayout.bindItemCardMainView(newDetailMaskFrameLayout.mParentFrameLayout);
            }
            a(newDetailMaskFrameLayout, ofFloat, new a(newDetailMaskFrameLayout, newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext.j.C(), p, z, u, f9, f10, f8, f7, f11, f12), new b(newDetailMaskFrameLayout, z));
        }
    }
}
