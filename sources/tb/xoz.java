package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xoz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewDetailMaskFrameLayout f31503a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ float c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ float f;
        public final /* synthetic */ j0z g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ float m;
        public final /* synthetic */ float n;

        public a(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z, float f, boolean z2, Integer num, float f2, j0z j0zVar, float f3, float f4, float f5, float f6, boolean z3, float f7, float f8) {
            this.f31503a = newDetailMaskFrameLayout;
            this.b = z;
            this.c = f;
            this.d = z2;
            this.e = num;
            this.f = f2;
            this.g = j0zVar;
            this.h = f3;
            this.i = f4;
            this.j = f5;
            this.k = f6;
            this.l = z3;
            this.m = f7;
            this.n = f8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0188, code lost:
            if (r3 >= 0) goto L_0x018a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0190, code lost:
            if (r2.j.B() != false) goto L_0x0192;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0192, code lost:
            r1 = r7.f31503a;
            r1.mHasFrozenOuterSuccessLayout = true;
            r1.frozenNoneCoreLayout();
            r7.f31503a.frozenOuterNoneCoreLayout();
            r1 = r7.f31503a.mNewDetailMaskFrameLayoutContext.j;
            r1.a(r1.n(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01ae, code lost:
            r1 = r7.f31503a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01b2, code lost:
            if (r1.mHasSetBottomBarColor != false) goto L_0x01be;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01b9, code lost:
            if (r8 <= 0.9f) goto L_0x01be;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01bb, code lost:
            r1.setCurrentBottomBarColor();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01be, code lost:
            r7.f31503a.invalidate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationUpdate(android.animation.ValueAnimator r8) {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.xoz.a.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewDetailMaskFrameLayout f31504a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ rpz c;
        public final /* synthetic */ zpz d;
        public final /* synthetic */ boolean e;

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
                } else if (!b.this.f31504a.isDestroy()) {
                    b.this.f31504a.checkAndTryConvertActivityFromTranslucent();
                }
            }
        }

        public b(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z, rpz rpzVar, zpz zpzVar, boolean z2) {
            this.f31504a = newDetailMaskFrameLayout;
            this.b = z;
            this.c = rpzVar;
            this.d = zpzVar;
            this.e = z2;
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
                if (this.f31504a.mNewDetailMaskFrameLayoutContext.j.J()) {
                    this.f31504a.frozenNoneCoreLayout();
                    this.f31504a.frozenOuterNoneCoreLayout();
                }
            } catch (Throwable th) {
                l5i l5iVar = this.f31504a.mNewDetailMaskFrameLayoutContext.j;
                l5iVar.b(l5iVar.n(), "动画开始时，场景冻结出错。", th);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!this.f31504a.isDestroy()) {
                NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f31504a;
                newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext.f = false;
                if (!newDetailMaskFrameLayout.mHasSetBottomBarColor) {
                    newDetailMaskFrameLayout.setCurrentBottomBarColor();
                }
                this.f31504a.setAlpha(1.0f);
                this.f31504a.setScaleX(1.0f);
                this.f31504a.setScaleY(1.0f);
                this.f31504a.setTranslationX(0.0f);
                this.f31504a.setTranslationX(0.0f);
                this.f31504a.getMainHandler().postDelayed(new a(), this.f31504a.getMaskHandler().g());
                if (this.b) {
                    if (this.c.a()) {
                        zpz zpzVar = this.d;
                        zpzVar.a(zpzVar.b(), "模拟一跳的卡片被禁止隐藏", null);
                        this.f31504a.mScaleImageView.setAlpha(1.0f);
                    } else {
                        this.f31504a.mScaleImageView.setVisibility(8);
                    }
                }
                if (this.e) {
                    this.f31504a.mScaleWhiteBgView.setVisibility(8);
                }
                try {
                    this.f31504a.resumeNoneCoreLayout();
                    NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = this.f31504a;
                    newDetailMaskFrameLayout2.mFrozenLayoutCount = 0;
                    newDetailMaskFrameLayout2.resumeOuterNoneCoreLayout();
                    this.f31504a.mFrozenOutLayoutCount = 0;
                } catch (Throwable th) {
                    l5i l5iVar = this.f31504a.mNewDetailMaskFrameLayoutContext.j;
                    l5iVar.b(l5iVar.n(), "新转场完成后，主视图恢复出错。", th);
                }
                this.f31504a.checkAndTryProcessDelayTask();
            }
        }
    }

    static {
        t2o.a(352322018);
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

    public static void b(View view, NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9ad32c", new Object[]{view, newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.mParentFrameLayout.addView(view, 0);
        }
    }

    public static boolean c(tpz tpzVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout, zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42e17e8", new Object[]{tpzVar, newDetailMaskFrameLayout, zpzVar})).booleanValue();
        }
        if (!newDetailMaskFrameLayout.supportScaleWhiteBgView()) {
            zpzVar.a(zpzVar.b(), "UnSupport:不支持白色放大背景", null);
            return false;
        } else if (newDetailMaskFrameLayout.mScaleWhiteBgView != null || tpzVar == null) {
            String b2 = zpzVar.b();
            zpzVar.a(b2, "Error:白色放大背景初始化失败。参数校验未通过。mScaleWhiteBgView:" + newDetailMaskFrameLayout.mScaleWhiteBgView + " cardInfo:" + tpzVar, null);
            return false;
        } else {
            View view = new View(newDetailMaskFrameLayout.getContext());
            view.setBackgroundColor(-1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) tpzVar.d, (int) tpzVar.c);
            layoutParams.gravity = 51;
            layoutParams.leftMargin = (int) tpzVar.f28877a;
            layoutParams.topMargin = (int) tpzVar.b;
            view.setLayoutParams(layoutParams);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            b(view, newDetailMaskFrameLayout);
            newDetailMaskFrameLayout.mScaleWhiteBgView = view;
            zpzVar.a(zpzVar.b(), "Success:白色放大背景初始化成功。", null);
            return true;
        }
    }

    public static void d(NewDetailMaskFrameLayout newDetailMaskFrameLayout, aqz aqzVar) {
        int i;
        int intValue;
        boolean z;
        float floatValue;
        float floatValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e4ab42", new Object[]{newDetailMaskFrameLayout, aqzVar});
            return;
        }
        aqz c = bqz.c(aqzVar, newDetailMaskFrameLayout);
        vpz b2 = wpz.b(c);
        rpz c2 = spz.c(c);
        j0z j0zVar = new j0z();
        zpz e = k0z.e(c);
        tpz b3 = upz.b(c);
        if (!newDetailMaskFrameLayout.mHasShowAnim) {
            newDetailMaskFrameLayout.mHasShowAnim = true;
            newDetailMaskFrameLayout.getMaskHandler().f23120a = newDetailMaskFrameLayout;
            boolean c3 = c(b3, newDetailMaskFrameLayout, e);
            if (newDetailMaskFrameLayout.getMaskHandler().E()) {
                newDetailMaskFrameLayout.setAlpha(1.0f);
            }
            Integer num = b2.f;
            Integer num2 = b2.e;
            if (num2 == null) {
                i = 0;
            } else {
                i = num2.intValue();
            }
            if (num == null) {
                intValue = newDetailMaskFrameLayout.mScreenHeight;
            } else {
                intValue = num.intValue();
            }
            float f = intValue / newDetailMaskFrameLayout.mImageViewStartHeight;
            float f2 = newDetailMaskFrameLayout.mScreenWidth / newDetailMaskFrameLayout.mImageViewStartWidth;
            float f3 = -newDetailMaskFrameLayout.mImageViewStartLeftMargin;
            float f4 = -(newDetailMaskFrameLayout.mImageViewStartTopMargin - i);
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
            float f5 = newDetailMaskFrameLayout.mImageViewStartWidth / newDetailMaskFrameLayout.mScreenWidth;
            float f6 = newDetailMaskFrameLayout.mImageViewStartHeight / newDetailMaskFrameLayout.mScreenHeight;
            newDetailMaskFrameLayout.setPivotX(0.0f);
            newDetailMaskFrameLayout.setPivotY(0.0f);
            newDetailMaskFrameLayout.setScaleX(f5);
            newDetailMaskFrameLayout.setScaleY(f6);
            newDetailMaskFrameLayout.setTranslationX(newDetailMaskFrameLayout.mImageViewStartLeftMargin);
            newDetailMaskFrameLayout.setTranslationY(newDetailMaskFrameLayout.mImageViewStartTopMargin);
            Float f7 = b2.c;
            if (f7 == null) {
                floatValue = newDetailMaskFrameLayout.getMaskHandler().u();
            } else {
                floatValue = f7.floatValue();
            }
            Float f8 = b2.d;
            if (f8 == null) {
                floatValue2 = newDetailMaskFrameLayout.getMaskHandler().p();
            } else {
                floatValue2 = f8.floatValue();
            }
            if (newDetailMaskFrameLayout.getMaskHandler().G()) {
                newDetailMaskFrameLayout.bindItemCardMainView(newDetailMaskFrameLayout.mParentFrameLayout);
            }
            a(newDetailMaskFrameLayout, ofFloat, new a(newDetailMaskFrameLayout, newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext.j.C(), floatValue2, z, num, floatValue, j0zVar, f3, f4, f2, f, c3, f5, f6), new b(newDetailMaskFrameLayout, z, c2, e, c3));
        }
    }
}
