package com.taobao.themis.container.title.titleView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import tb.a1e;
import tb.a90;
import tb.ckf;
import tb.d04;
import tb.t2o;
import tb.xcs;
import tb.zk4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010\u001aJ%\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0016J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u0016J\u0017\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00142\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00142\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010G\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010H\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lcom/taobao/themis/container/title/titleView/TMSTitleView;", "Landroid/widget/RelativeLayout;", "Ltb/a1e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attr", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "alpha", "Ltb/xhv;", "setTitleViewAlpha", "(I)V", "Ltb/a90;", "action", "addLeftAction", "(Ltb/a90;)V", "index", "(Ltb/a90;I)V", "addRightAction", "clearLeftActions", "()V", "clearRightActions", "location", "addCenterAction", "clearCenterActions", "removeAction", "T", "Ljava/lang/Class;", "cls", "getAction", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "getActions", "()Ljava/util/List;", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "setTitleBarBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "color", "setTitleBarBackgroundColor", "setTitleBarAlpha", "Lcom/taobao/themis/kernel/container/Window$Theme;", "style", "setStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)V", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "animType", "showTitleBar", "(Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;)V", "hideTitleBar", "getTitleViewHeight", "()I", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "attachPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "Landroid/view/ViewGroup;", "mLeftPanel", "Landroid/view/ViewGroup;", "mCenterLeftPanel", "mCenterPanel", "mCenterRightPanel", "mRightPanel", "", "mActions", "Ljava/util/List;", "mBgDrawable", "Landroid/graphics/drawable/Drawable;", "mAlpha", TLogTracker.LEVEL_INFO, "mTextStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTitleView extends RelativeLayout implements a1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable mBgDrawable;
    private final ViewGroup mCenterLeftPanel;
    private final ViewGroup mCenterPanel;
    private final ViewGroup mCenterRightPanel;
    private final ViewGroup mLeftPanel;
    private final ViewGroup mRightPanel;
    private final List<a90> mActions = new CopyOnWriteArrayList();
    private int mAlpha = 255;
    private Window.Theme mTextStyle = Window.Theme.LIGHT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(835715192);
            int[] iArr = new int[NavigatorBarAnimType.values().length];
            iArr[NavigatorBarAnimType.NULL.ordinal()] = 1;
            iArr[NavigatorBarAnimType.ALPHA.ordinal()] = 2;
            iArr[NavigatorBarAnimType.TRANS.ordinal()] = 3;
            iArr[NavigatorBarAnimType.OTHER.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                TMSTitleView.this.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/titleView/TMSTitleView$hideTitleBar$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            TMSTitleView.this.setVisibility(8);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/taobao/themis/container/title/titleView/TMSTitleView$d", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Ltb/xhv;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            ckf.g(animation, "animation");
            TMSTitleView.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                TMSTitleView.this.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(835715191);
        t2o.a(835715189);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context):void");
    }

    public static /* synthetic */ Object ipc$super(TMSTitleView tMSTitleView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/titleView/TMSTitleView");
    }

    public void addCenterAction(a90 a90Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6900e", new Object[]{this, a90Var, new Integer(i)});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.p(2);
        this.mActions.add(a90Var);
        if (i == 0) {
            ViewGroup viewGroup = this.mCenterLeftPanel;
            Context context = getContext();
            ckf.f(context, "context");
            viewGroup.addView(a90Var.l(context));
        } else if (i == 1) {
            ViewGroup viewGroup2 = this.mCenterRightPanel;
            Context context2 = getContext();
            ckf.f(context2, "context");
            viewGroup2.addView(a90Var.l(context2));
        } else if (i == 2) {
            ViewGroup viewGroup3 = this.mCenterPanel;
            Context context3 = getContext();
            ckf.f(context3, "context");
            viewGroup3.addView(a90Var.l(context3));
        }
        a90Var.q(this.mTextStyle);
    }

    @Override // tb.a1e
    public void addLeftAction(a90 a90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01343e3", new Object[]{this, a90Var});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.p(0);
        this.mActions.add(a90Var);
        ViewGroup viewGroup = this.mLeftPanel;
        Context context = getContext();
        ckf.f(context, "context");
        viewGroup.addView(a90Var.l(context));
        a90Var.q(this.mTextStyle);
    }

    @Override // tb.a1e
    public void addRightAction(a90 a90Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401f3473", new Object[]{this, a90Var, new Integer(i)});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.p(1);
        this.mActions.add(a90Var);
        ViewGroup viewGroup = this.mRightPanel;
        Context context = getContext();
        ckf.f(context, "context");
        viewGroup.addView(a90Var.l(context), i);
        a90Var.q(this.mTextStyle);
    }

    @Override // tb.a1e
    public void attachPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
        } else if (iTMSPage != null && !iTMSPage.getPageParams().i()) {
            setPadding(0, 0, 0, 0);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, xcs.a(getContext(), 44.0f)));
        }
    }

    @Override // tb.a1e
    public void clearCenterActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fc98a2", new Object[]{this});
            return;
        }
        d04.A(this.mActions, TMSTitleView$clearCenterActions$1.INSTANCE);
        this.mCenterLeftPanel.removeAllViews();
        this.mCenterPanel.removeAllViews();
        this.mCenterRightPanel.removeAllViews();
    }

    @Override // tb.a1e
    public void clearLeftActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9779270", new Object[]{this});
            return;
        }
        this.mLeftPanel.removeAllViews();
        d04.A(this.mActions, TMSTitleView$clearLeftActions$1.INSTANCE);
    }

    @Override // tb.a1e
    public void clearRightActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430783b5", new Object[]{this});
            return;
        }
        this.mRightPanel.removeAllViews();
        d04.A(this.mActions, TMSTitleView$clearRightActions$1.INSTANCE);
    }

    @Override // tb.a1e
    public <T> T getAction(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b5e78488", new Object[]{this, cls});
        }
        ckf.g(cls, "cls");
        for (T t : this.mActions) {
            if (cls.isInstance((a90) t)) {
                return t;
            }
        }
        return null;
    }

    @Override // tb.a1e
    public List<a90> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return this.mActions;
    }

    @Override // tb.a1e
    public Drawable getBackgroundDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c24857b1", new Object[]{this});
        }
        return this.mBgDrawable;
    }

    @Override // tb.a1e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this;
    }

    @Override // tb.a1e
    public int getTitleViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1686c7e8", new Object[]{this})).intValue();
        }
        return getLayoutParams().height;
    }

    @Override // tb.a1e
    public void hideTitleBar(NavigatorBarAnimType navigatorBarAnimType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b5c0f3", new Object[]{this, navigatorBarAnimType});
            return;
        }
        ckf.g(navigatorBarAnimType, "animType");
        if (getVisibility() != 8) {
            int i = a.$EnumSwitchMapping$0[navigatorBarAnimType.ordinal()];
            if (i == 1) {
                setAlpha(1.0f);
                setVisibility(8);
            } else if (i == 2) {
                setAlpha(1.0f);
                setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new b());
                ofFloat.addListener(new c());
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
            } else if (i == 3) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getHeight());
                setAlpha(1.0f);
                setVisibility(0);
                translateAnimation.setDuration(500L);
                translateAnimation.setAnimationListener(new d());
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setFillAfter(false);
                startAnimation(translateAnimation);
            } else if (i == 4) {
                setVisibility(8);
            }
        }
    }

    @Override // tb.a1e
    public void removeAction(a90 a90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2270727", new Object[]{this, a90Var});
            return;
        }
        ckf.g(a90Var, "action");
        this.mActions.remove(a90Var);
        Context context = getContext();
        ckf.f(context, "context");
        View l = a90Var.l(context);
        this.mLeftPanel.removeView(l);
        this.mCenterLeftPanel.removeView(l);
        this.mCenterPanel.removeView(l);
        this.mCenterRightPanel.removeView(l);
        this.mRightPanel.removeView(l);
    }

    @Override // tb.a1e
    public void setStyle(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        this.mTextStyle = theme;
        for (a90 a90Var : this.mActions) {
            a90Var.q(theme);
        }
    }

    @Override // tb.a1e
    public void setTitleBarAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1915bb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mAlpha = i;
        Drawable drawable = this.mBgDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // tb.a1e
    public void setTitleBarBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4704a64", new Object[]{this, new Integer(i)});
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        colorDrawable.setAlpha(this.mAlpha);
        this.mBgDrawable = colorDrawable;
        setBackground(colorDrawable);
    }

    @Override // tb.a1e
    public void setTitleBarBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75984f14", new Object[]{this, drawable});
            return;
        }
        ckf.g(drawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        drawable.setAlpha(this.mAlpha);
        this.mBgDrawable = drawable;
        setBackground(drawable);
    }

    public final void setTitleViewAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e855f9", new Object[]{this, new Integer(i)});
            return;
        }
        this.mAlpha = i;
        Drawable drawable = this.mBgDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // tb.a1e
    public void showTitleBar(NavigatorBarAnimType navigatorBarAnimType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaae898", new Object[]{this, navigatorBarAnimType});
            return;
        }
        ckf.g(navigatorBarAnimType, "animType");
        if (getVisibility() != 0) {
            int i = a.$EnumSwitchMapping$0[navigatorBarAnimType.ordinal()];
            if (i == 1) {
                setAlpha(1.0f);
                setVisibility(0);
            } else if (i == 2) {
                setAlpha(0.0f);
                setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new e());
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
            } else if (i == 3) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -getHeight(), 0.0f);
                setAlpha(1.0f);
                setVisibility(0);
                translateAnimation.setDuration(500L);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setFillAfter(false);
                startAnimation(translateAnimation);
            } else if (i == 4) {
                setVisibility(0);
            }
        }
    }

    public void addLeftAction(a90 a90Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5255ab80", new Object[]{this, a90Var, new Integer(i)});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.p(0);
        this.mActions.add(a90Var);
        ViewGroup viewGroup = this.mLeftPanel;
        Context context = getContext();
        ckf.f(context, "context");
        viewGroup.addView(a90Var.l(context), i);
        a90Var.q(this.mTextStyle);
    }

    @Override // tb.a1e
    public void addRightAction(a90 a90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94b5090", new Object[]{this, a90Var});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.p(1);
        this.mActions.add(a90Var);
        ViewGroup viewGroup = this.mRightPanel;
        Context context = getContext();
        ckf.f(context, "context");
        viewGroup.addView(a90Var.l(context), 0);
        a90Var.q(this.mTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
