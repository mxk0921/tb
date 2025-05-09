package com.etao.feimagesearch.ui.coordinatorcard;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.l83;
import tb.p83;
import tb.t2o;
import tb.t83;
import tb.trl;
import tb.zb7;
import tb.zr1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CoordinatorCardView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<Animator> animList;
    private final Map<String, l83> cardLayoutStrategies;
    private final Map<String, RectF> cardLocateRecords;
    private final p83 cardManager;
    private float cardMarginLeft;
    private float cardMarginTop;
    private final Map<String, zr1> cardRecords;
    private boolean childNeedScaleWithParent;
    private boolean needReMeasure;
    private RectF parentOriginalEdge;
    private int regionRationHeight;
    private int regionRationWidth;
    private float rootScale;
    private float rootTranslationX;
    private float rootTranslationY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4879a;
        public final /* synthetic */ CoordinatorCardView b;
        public final /* synthetic */ View c;
        public final /* synthetic */ zr1 d;

        /* compiled from: Taobao */
        /* renamed from: com.etao.feimagesearch.ui.coordinatorcard.CoordinatorCardView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C0240a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorCardView f4880a;

            public C0240a(CoordinatorCardView coordinatorCardView) {
                this.f4880a = coordinatorCardView;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
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
                CoordinatorCardView.access$getAnimList$p(this.f4880a).remove(animator);
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

        public a(int i, CoordinatorCardView coordinatorCardView, View view, zr1 zr1Var) {
            this.f4879a = i;
            this.b = coordinatorCardView;
            this.c = view;
            this.d = zr1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Animator animator;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f4879a == 1) {
                animator = CoordinatorCardView.access$getBigCardAnim(this.b, this.c);
            } else {
                animator = CoordinatorCardView.access$getSmallCardAnim(this.b, this.c, this.d.m());
            }
            animator.addListener(new C0240a(this.b));
            CoordinatorCardView.access$getAnimList$p(this.b).add(animator);
            animator.start();
        }
    }

    static {
        t2o.a(481297553);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView(Context context) {
        this(context, null, 0, 6, null);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ void access$addViewWithAnim(CoordinatorCardView coordinatorCardView, int i, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c4501c", new Object[]{coordinatorCardView, new Integer(i), zr1Var});
        } else {
            coordinatorCardView.addViewWithAnim(i, zr1Var);
        }
    }

    public static final /* synthetic */ List access$getAnimList$p(CoordinatorCardView coordinatorCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15cd24e8", new Object[]{coordinatorCardView});
        }
        return coordinatorCardView.animList;
    }

    public static final /* synthetic */ Animator access$getBigCardAnim(CoordinatorCardView coordinatorCardView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("9b249006", new Object[]{coordinatorCardView, view});
        }
        return coordinatorCardView.getBigCardAnim(view);
    }

    public static final /* synthetic */ Map access$getCardLayoutStrategies$p(CoordinatorCardView coordinatorCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b6e2d7f8", new Object[]{coordinatorCardView});
        }
        return coordinatorCardView.cardLayoutStrategies;
    }

    public static final /* synthetic */ Map access$getCardRecords$p(CoordinatorCardView coordinatorCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c004f7d", new Object[]{coordinatorCardView});
        }
        return coordinatorCardView.cardRecords;
    }

    public static final /* synthetic */ Animator access$getSmallCardAnim(CoordinatorCardView coordinatorCardView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("3ff889b3", new Object[]{coordinatorCardView, view, new Boolean(z)});
        }
        return coordinatorCardView.getSmallCardAnim(view, z);
    }

    private final void addViewWithAnim(int i, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69fe40d", new Object[]{this, new Integer(i), zr1Var});
            return;
        }
        View g = zr1Var.g();
        g.setAlpha(0.0f);
        addView(g);
        g.post(new a(i, this, g, zr1Var));
    }

    private final void attachCard(t83 t83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457bd3ac", new Object[]{this, t83Var});
            return;
        }
        p83 p83Var = this.cardManager;
        Context context = getContext();
        ckf.f(context, "context");
        p83Var.b(context, t83Var.b(), new CoordinatorCardView$attachCard$1(t83Var, this), CoordinatorCardView$attachCard$2.INSTANCE);
    }

    private final RectF changeRectFAssignLeft(RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8dc1bc87", new Object[]{this, rectF, new Float(f)});
        }
        return new RectF(f, rectF.top, rectF.width() + f, rectF.bottom);
    }

    private final RectF changeRectFAssignTop(RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("eb131333", new Object[]{this, rectF, new Float(f)});
        }
        return new RectF(rectF.left, f, rectF.right, rectF.height() + f);
    }

    private final void customLayoutChildren() {
        zr1 zr1Var;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633a58a1", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            Object tag = childAt.getTag();
            if ((tag instanceof String) && (zr1Var = this.cardRecords.get(tag)) != null) {
                RectF layoutChild = layoutChild(i, (String) tag, zr1Var);
                if (layoutChild != null) {
                    childAt.layout((int) layoutChild.left, (int) layoutChild.top, (int) layoutChild.right, (int) layoutChild.bottom);
                    zr1Var.w(true);
                }
                if (this.childNeedScaleWithParent) {
                    zr1Var.g().setPivotX(0.0f);
                    zr1Var.g().setPivotY(0.0f);
                    zr1Var.g().setScaleX(this.rootScale);
                    zr1Var.g().setScaleY(this.rootScale);
                }
            }
            i = i2;
        }
    }

    private final void detachCard(zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def9a722", new Object[]{this, zr1Var});
        } else {
            zr1Var.a();
        }
    }

    private final RectF fixedLayoutRectFByMoveStrategy(RectF rectF, l83 l83Var, int i) {
        RectF rectF2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b1f4df83", new Object[]{this, rectF, l83Var, new Integer(i)});
        }
        if (l83Var == null) {
            return rectF;
        }
        RectF parseRatioRectF2RealRectF = parseRatioRectF2RealRectF(l83Var.d());
        if (parseRatioRectF2RealRectF == null) {
            return rectF;
        }
        RectF rectF3 = new RectF(rectF);
        while (i2 < i) {
            int i3 = i2 + 1;
            Object tag = getChildAt(i2).getTag();
            if ((tag instanceof String) && (rectF2 = this.cardLocateRecords.get(tag)) != null && isRectOverLap(rectF3, rectF2)) {
                if (l83Var.a() == 1) {
                    float f = 4;
                    float height = (parseRatioRectF2RealRectF.height() / f) + parseRatioRectF2RealRectF.top;
                    if (rectF3.top == height) {
                        float height2 = ((parseRatioRectF2RealRectF.height() * 3) / f) + parseRatioRectF2RealRectF.top;
                        if (rectF3.top == height2) {
                            return rectF3;
                        }
                        rectF3 = changeRectFAssignTop(rectF3, height2);
                    } else {
                        rectF3 = changeRectFAssignTop(rectF3, height);
                    }
                } else if (l83Var.a() == 3) {
                    float b = rectF3.top - l83Var.b();
                    if (b <= this.parentOriginalEdge.top) {
                        return changeRectFAssignTop(rectF3, rectF3.top + l83Var.b());
                    }
                    rectF3 = changeRectFAssignTop(rectF3, b);
                } else {
                    float f2 = 4;
                    float width = (parseRatioRectF2RealRectF.width() / f2) + parseRatioRectF2RealRectF.left;
                    if (rectF3.left == width) {
                        float height3 = ((parseRatioRectF2RealRectF.height() * 3) / f2) + parseRatioRectF2RealRectF.left;
                        if (rectF3.left == height3) {
                            return rectF3;
                        }
                        rectF3 = changeRectFAssignLeft(rectF3, height3);
                    } else {
                        rectF3 = changeRectFAssignLeft(rectF3, width);
                    }
                }
            }
            i2 = i3;
        }
        return rectF3;
    }

    private final RectF generateCardPreLayoutRectF(RectF rectF, l83 l83Var, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("944b701f", new Object[]{this, rectF, l83Var, zr1Var});
        }
        RectF parseRatioRectF2RealRectF = parseRatioRectF2RealRectF(rectF);
        Integer num = null;
        if (parseRatioRectF2RealRectF == null) {
            return null;
        }
        int a2 = zb7.a(6.0f);
        float f = parseRatioRectF2RealRectF.right - parseRatioRectF2RealRectF.left;
        float f2 = parseRatioRectF2RealRectF.bottom - parseRatioRectF2RealRectF.top;
        int i = a2 * 2;
        if (f > getWidth() - i || f2 > getHeight() - i) {
            return null;
        }
        if (l83Var != null) {
            num = Integer.valueOf(l83Var.c());
        }
        if (num != null && num.intValue() == 2) {
            return getCenterLocateAnchorRect(parseRatioRectF2RealRectF, zr1Var);
        }
        if (num != null && num.intValue() == 1) {
            return getNotCoverAnchorRect(parseRatioRectF2RealRectF, zr1Var);
        }
        return getCoverAnchorRect(parseRatioRectF2RealRectF, zr1Var);
    }

    private final RectF getCenterLocateAnchorRect(RectF rectF, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("4438b7e9", new Object[]{this, rectF, zr1Var});
        }
        float f = rectF.right - rectF.left;
        float f2 = rectF.bottom - rectF.top;
        RectF rectF2 = new RectF();
        int[] d = zr1Var.d();
        int i = d[1];
        int i2 = d[0];
        float f3 = rectF.top + (f2 / 2.0f);
        float f4 = this.parentOriginalEdge.top;
        if (zr1Var.f() + f3 < f4) {
            rectF2.top = f4;
        } else {
            rectF2.top = f3 + zr1Var.f();
        }
        float f5 = rectF2.top;
        float f6 = i;
        float f7 = this.parentOriginalEdge.bottom;
        if (f5 + f6 > f7) {
            rectF2.bottom = f7;
            rectF2.top = f7 - f6;
        } else {
            rectF2.bottom = f5 + f6;
        }
        float f8 = rectF.left + (f / 2.0f);
        if (zr1Var.e() + f8 < 0.0f) {
            rectF2.left = this.parentOriginalEdge.left;
        } else {
            rectF2.left = zr1Var.e() + f8;
        }
        float f9 = rectF2.left;
        float f10 = i2;
        float f11 = this.parentOriginalEdge.right;
        if (f9 + f10 <= f11) {
            rectF2.right = f9 + f10;
        } else if (f11 - f10 < rectF.left) {
            zr1Var.v(true);
            float e = f8 - zr1Var.e();
            rectF2.right = e;
            rectF2.left = e - f10;
        } else {
            rectF2.right = f11;
            rectF2.left = f11 - f10;
        }
        return rectF2;
    }

    private final RectF getCoverAnchorRect(RectF rectF, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b1d99a6d", new Object[]{this, rectF, zr1Var});
        }
        RectF rectF2 = new RectF();
        int[] d = zr1Var.d();
        int i = d[0];
        int i2 = d[1];
        if (zr1Var.c() == null) {
            zr1Var.q(true);
            zr1Var.r(true);
        }
        if (zr1Var.e() <= 0.0f) {
            float f = i;
            if (rectF.left + f + zr1Var.e() <= this.parentOriginalEdge.right) {
                float e = rectF.left + zr1Var.e();
                float f2 = this.parentOriginalEdge.left;
                if (e < f2) {
                    rectF2.left = f2;
                } else {
                    rectF2.left = e;
                }
                rectF2.right = rectF2.left + f;
            } else {
                zr1Var.v(true);
                float f3 = rectF.right + (-zr1Var.e());
                float f4 = this.parentOriginalEdge.right;
                if (f3 > f4) {
                    rectF2.right = f4;
                } else {
                    rectF2.right = f3;
                }
                rectF2.left = rectF2.right - f;
            }
        } else {
            float f5 = i;
            float e2 = rectF.left + f5 + zr1Var.e();
            RectF rectF3 = this.parentOriginalEdge;
            float f6 = rectF3.right;
            if (e2 <= f6) {
                float e3 = rectF.left + zr1Var.e();
                rectF2.left = e3;
                rectF2.right = e3 + f5;
            } else if (rectF.left + f5 <= f6) {
                float f7 = rectF3.left;
                rectF2.left = f7;
                rectF2.right = f7 + f5;
            } else {
                zr1Var.v(true);
                float e4 = rectF.right - zr1Var.e();
                rectF2.right = e4;
                rectF2.left = e4 - f5;
            }
        }
        if (zr1Var.f() <= 0.0f) {
            float f8 = i2;
            if (rectF.top + zr1Var.f() + f8 <= this.parentOriginalEdge.bottom) {
                float f9 = rectF.top + zr1Var.f();
                float f10 = this.parentOriginalEdge.top;
                if (f9 < f10) {
                    rectF2.top = f10;
                } else {
                    rectF2.top = f9;
                }
                rectF2.bottom = rectF2.top + f8;
            } else {
                zr1Var.p(true);
                float f11 = rectF.bottom + (-zr1Var.f());
                float f12 = this.parentOriginalEdge.bottom;
                if (f11 > f12) {
                    rectF2.bottom = f12;
                } else {
                    rectF2.bottom = f11;
                }
                rectF2.top = rectF2.bottom - f8;
            }
        } else {
            float f13 = i2;
            float f14 = this.parentOriginalEdge.bottom;
            if (rectF.top + zr1Var.f() + f13 <= f14) {
                float f15 = rectF.top + zr1Var.f();
                rectF2.top = f15;
                rectF2.bottom = f15 + f13;
            } else {
                float f16 = rectF.top;
                float f17 = f16 + f13;
                if (f17 <= f14) {
                    rectF2.top = f16;
                    rectF2.bottom = f17;
                } else {
                    zr1Var.p(true);
                    rectF2.bottom = rectF.bottom - zr1Var.f();
                    rectF2.top = rectF2.right - f13;
                }
            }
        }
        return rectF2;
    }

    private final RectF getFixedChildLayoutWithChildMove(RectF rectF, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("281c9352", new Object[]{this, rectF, zr1Var});
        }
        int[] d = zr1Var.d();
        RectF rectF2 = new RectF();
        if (zr1Var.k()) {
            int i = d[0];
            float centerX = (((rectF.centerX() * this.rootScale) + this.rootTranslationX) + this.cardMarginLeft) - (i / 2.0f);
            rectF2.left = centerX;
            rectF2.right = centerX + i;
        } else if (zr1Var.m()) {
            float f = (rectF.right * this.rootScale) + this.rootTranslationX + this.cardMarginLeft;
            rectF2.right = f;
            rectF2.left = f - d[0];
        } else {
            float f2 = (rectF.left * this.rootScale) + this.rootTranslationX + this.cardMarginLeft;
            rectF2.left = f2;
            rectF2.right = f2 + d[0];
        }
        if (zr1Var.l()) {
            float centerY = (rectF.centerY() * this.rootScale) + this.rootTranslationY + this.cardMarginTop;
            int i2 = d[1];
            float f3 = centerY - (i2 / 2.0f);
            rectF2.top = f3;
            rectF2.bottom = f3 + i2;
        } else if (zr1Var.j()) {
            float f4 = (rectF.bottom * this.rootScale) + this.rootTranslationY + this.cardMarginTop;
            rectF2.bottom = f4;
            rectF2.top = f4 - d[1];
        } else {
            float f5 = (rectF.top * this.rootScale) + this.rootTranslationY + this.cardMarginTop;
            rectF2.top = f5;
            rectF2.bottom = f5 + d[1];
        }
        return rectF2;
    }

    private final RectF getFixedChildLayoutWithChildScale(RectF rectF, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ea27852f", new Object[]{this, rectF, zr1Var});
        }
        float f = rectF.left;
        float f2 = this.rootScale;
        RectF rectF2 = new RectF(f * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
        float f3 = zr1Var.d()[0];
        float f4 = zr1Var.d()[1];
        float f5 = this.rootTranslationX;
        float f6 = this.rootTranslationY;
        RectF rectF3 = new RectF();
        if (zr1Var.k()) {
            float centerX = ((rectF2.centerX() + f5) + this.cardMarginLeft) - (f3 / 2.0f);
            rectF3.left = centerX;
            rectF3.right = centerX + f3;
        } else if (zr1Var.m()) {
            float f7 = rectF2.right + f5 + this.cardMarginLeft;
            rectF3.right = f7;
            rectF3.left = f7 - f3;
        } else {
            float f8 = rectF2.left + f5 + this.cardMarginLeft;
            rectF3.left = f8;
            rectF3.right = f8 + f3;
        }
        if (zr1Var.l()) {
            float centerY = ((rectF2.centerY() + f6) + this.cardMarginTop) - (f4 / 2.0f);
            rectF3.top = centerY;
            rectF3.bottom = centerY + f4;
        } else if (zr1Var.j()) {
            float f9 = rectF2.bottom + f6 + this.cardMarginTop;
            rectF3.bottom = f9;
            rectF3.top = f9 - f4;
        } else {
            float f10 = rectF2.top + f6 + this.cardMarginTop;
            rectF3.top = f10;
            rectF3.bottom = f10 + f4;
        }
        return rectF3;
    }

    private final RectF getNotCoverAnchorRect(RectF rectF, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ce523046", new Object[]{this, rectF, zr1Var});
        }
        float f = rectF.right - rectF.left;
        int a2 = zb7.a(6.0f);
        RectF rectF2 = new RectF();
        int[] d = zr1Var.d();
        int i = d[1];
        int i2 = d[0];
        float f2 = rectF.top;
        float f3 = i;
        float f4 = a2;
        if ((f2 - f3) - f4 >= this.parentOriginalEdge.top) {
            float f5 = f2 - f4;
            rectF2.bottom = f5;
            rectF2.top = f5 - f3;
            zr1Var.p(true);
        } else {
            float f6 = rectF.bottom + f4;
            rectF2.top = f6;
            rectF2.bottom = f6 + f3;
        }
        float f7 = i2;
        float abs = Math.abs(f7 - f) / 2;
        if (f7 > f) {
            float f8 = rectF.left - abs;
            float f9 = this.parentOriginalEdge.left;
            if (f8 <= f9) {
                f8 = f9;
            } else {
                zr1Var.q(true);
            }
            rectF2.left = f8;
            float f10 = f8 + f7;
            RectF rectF3 = this.parentOriginalEdge;
            float f11 = rectF3.right;
            if (f10 > f11) {
                rectF2.right = f11;
                rectF2.left = rectF3.right - f7;
                zr1Var.v(true);
            } else {
                rectF2.right = f10;
            }
        } else {
            zr1Var.q(true);
            float f12 = rectF.left + abs;
            rectF2.left = f12;
            rectF2.right = f12 + f7;
        }
        return rectF2;
    }

    public static /* synthetic */ Object ipc$super(CoordinatorCardView coordinatorCardView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/CoordinatorCardView");
    }

    private final boolean isRectOverLap(RectF rectF, RectF rectF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa86946", new Object[]{this, rectF, rectF2})).booleanValue();
        }
        if (rectF.left > rectF2.right || rectF.right < rectF2.left || rectF.top > rectF2.bottom || rectF.bottom < rectF2.top) {
            return false;
        }
        return true;
    }

    private final RectF layoutChild(int i, String str, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("50431a8f", new Object[]{this, new Integer(i), str, zr1Var});
        }
        RectF rectF = this.cardLocateRecords.get(str);
        if (rectF == null || !zr1Var.h()) {
            rectF = relayoutNewRectF(i, str, zr1Var);
        }
        if (rectF == null) {
            return null;
        }
        if (this.childNeedScaleWithParent) {
            return getFixedChildLayoutWithChildScale(rectF, zr1Var);
        }
        return getFixedChildLayoutWithChildMove(rectF, zr1Var);
    }

    private final RectF parseRatioRectF2RealRectF(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c5a8ca53", new Object[]{this, rectF});
        }
        if (rectF == null) {
            return null;
        }
        float f = rectF.left;
        int i = this.regionRationWidth;
        float f2 = f * i;
        float f3 = rectF.right * i;
        float f4 = rectF.top;
        int i2 = this.regionRationHeight;
        float f5 = f4 * i2;
        float f6 = rectF.bottom * i2;
        RectF rectF2 = this.parentOriginalEdge;
        float f7 = rectF2.left;
        if (f2 < f7) {
            f2 = f7;
        }
        float f8 = rectF2.top;
        if (f5 < f8) {
            f5 = f8;
        }
        float f9 = rectF2.right;
        if (f3 > f9) {
            f3 = f9;
        }
        float f10 = rectF2.bottom;
        if (f6 > f10) {
            f6 = f10;
        }
        return new RectF(f2, f5, f3, f6);
    }

    private final RectF relayoutNewRectF(int i, String str, zr1 zr1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("1819ea22", new Object[]{this, new Integer(i), str, zr1Var});
        }
        l83 l83Var = this.cardLayoutStrategies.get(str);
        RectF generateCardPreLayoutRectF = generateCardPreLayoutRectF(trl.e(str, 1, 1), l83Var, zr1Var);
        if (generateCardPreLayoutRectF == null) {
            return null;
        }
        if (l83Var == null || l83Var.a() != 0) {
            generateCardPreLayoutRectF = fixedLayoutRectFByMoveStrategy(generateCardPreLayoutRectF, l83Var, i);
        }
        this.cardLocateRecords.put(str, generateCardPreLayoutRectF);
        return generateCardPreLayoutRectF;
    }

    public final void executeActions(List<t83> list) {
        zr1 zr1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f31fb40", new Object[]{this, list});
        } else if (list != null) {
            for (t83 t83Var : list) {
                if (!TextUtils.isEmpty(t83Var.e()) && t83Var.d() != null) {
                    int f = t83Var.f();
                    if (f == 0) {
                        attachCard(t83Var);
                    } else if (f == 1) {
                        zr1 remove = this.cardRecords.remove(t83Var.e());
                        if (remove != null) {
                            detachCard(remove);
                        }
                    } else if (f == 2) {
                        zr1 zr1Var2 = this.cardRecords.get(t83Var.e());
                        if (zr1Var2 != null) {
                            zr1Var2.y(4);
                        }
                    } else if (f == 3) {
                        zr1 zr1Var3 = this.cardRecords.get(t83Var.e());
                        if (zr1Var3 != null) {
                            zr1Var3.y(0);
                        }
                    } else if (f == 4 && (zr1Var = this.cardRecords.get(t83Var.e())) != null) {
                        zr1Var.o(t83Var.g());
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.cardManager.a();
        for (Animator animator : this.animList) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.animList.clear();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.needReMeasure) {
            this.parentOriginalEdge.set(i, i2, i3, i4);
            this.needReMeasure = false;
        }
        customLayoutChildren();
    }

    public final void removeAllChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c1da6", new Object[]{this});
            return;
        }
        for (zr1 zr1Var : this.cardRecords.values()) {
            zr1Var.a();
        }
        this.cardRecords.clear();
        this.cardLocateRecords.clear();
        this.cardLayoutStrategies.clear();
        this.animList.clear();
    }

    public final void setChildNeedScaleWithParent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf32323", new Object[]{this, new Boolean(z)});
        } else {
            this.childNeedScaleWithParent = z;
        }
    }

    public final void setLayoutScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a6105b", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.rootScale = f;
        requestLayout();
    }

    public final void setLayoutTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527f5fe6", new Object[]{this, new Float(f)});
            return;
        }
        this.rootTranslationX = f;
        requestLayout();
    }

    public final void setLayoutTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54343885", new Object[]{this, new Float(f)});
            return;
        }
        this.rootTranslationY = f;
        requestLayout();
    }

    public final void setMargin(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe00f77", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.cardMarginLeft = f;
        this.cardMarginTop = f2;
    }

    public final void setRegionRationSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7586a1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.regionRationWidth = i;
        this.regionRationHeight = i2;
    }

    public final void updateRootViewMetrics(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc1e8fa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            this.needReMeasure = true;
            for (zr1 zr1Var : this.cardRecords.values()) {
                zr1Var.w(false);
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ckf.g(context, "context");
    }

    public /* synthetic */ CoordinatorCardView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.parentOriginalEdge = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.cardManager = new p83();
        this.cardRecords = new LinkedHashMap();
        this.cardLocateRecords = new LinkedHashMap();
        this.cardLayoutStrategies = new LinkedHashMap();
        this.animList = new ArrayList();
        this.rootScale = 1.0f;
        this.needReMeasure = true;
    }

    private final Animator getBigCardAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("3bdfec93", new Object[]{this, view});
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", (-view.getWidth()) / 2.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", -view.getHeight(), 0.0f));
        ckf.f(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…ight.toFloat(), 0f)\n    )");
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofPropertyValuesHolder;
    }

    private final Animator getSmallCardAnim(View view, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("6dd89218", new Object[]{this, view, new Boolean(z)});
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        if (z) {
            f = view.getWidth();
        } else {
            f = -view.getWidth();
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, PropertyValuesHolder.ofFloat("translationX", f / 2.0f, 0.0f));
        ckf.f(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…() / 2f, 0f\n      )\n    )");
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofPropertyValuesHolder;
    }
}
