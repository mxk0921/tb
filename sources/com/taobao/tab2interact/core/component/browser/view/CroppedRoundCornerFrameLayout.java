package com.taobao.tab2interact.core.component.browser.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CroppedRoundCornerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long ANIMATION_DURATION = 300;
    private static final String TAG = "CroppedRoundCornerFrameLayout";
    private final Context mContext;
    private TextView mLeftComponentBottomText;
    private LinearLayout mLeftComponentTextRoot;
    private TextView mLeftComponentTopText;
    private e mPendingJob;
    private f mTargetTextSet;
    private ValueAnimator mValueAnimator;
    private boolean mEnable = true;
    private boolean mUseAnimate = true;
    private float mShowPercent = 0.0f;
    private int mCurrState = 0;
    private g mVisibilityChangeListener = null;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface State {
        public static final int CLOSE = 0;
        public static final int OPEN = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f11823a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(null);
            this.f11823a = fVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/CroppedRoundCornerFrameLayout$1");
        }

        @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.d, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this) == null) {
            } else {
                if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).b()) {
                    CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = CroppedRoundCornerFrameLayout.this;
                    if (CroppedRoundCornerFrameLayout.access$500(croppedRoundCornerFrameLayout, CroppedRoundCornerFrameLayout.access$400(croppedRoundCornerFrameLayout), CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).a())) {
                        CroppedRoundCornerFrameLayout.access$600(CroppedRoundCornerFrameLayout.this);
                    } else {
                        CroppedRoundCornerFrameLayout.access$700(CroppedRoundCornerFrameLayout.this);
                    }
                } else {
                    CroppedRoundCornerFrameLayout.access$700(CroppedRoundCornerFrameLayout.this);
                }
            }
        }

        @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.d, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            if (CroppedRoundCornerFrameLayout.access$100(CroppedRoundCornerFrameLayout.this) != null) {
                CroppedRoundCornerFrameLayout.this.setTextSet(this.f11823a);
            }
            CroppedRoundCornerFrameLayout.access$200(CroppedRoundCornerFrameLayout.this, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            super(null);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/CroppedRoundCornerFrameLayout$2");
        }

        @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.d, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this) == null || !CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).b()) {
                CroppedRoundCornerFrameLayout.this.setTextSet(null);
                CroppedRoundCornerFrameLayout.access$200(CroppedRoundCornerFrameLayout.this, 0);
            } else {
                CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = CroppedRoundCornerFrameLayout.this;
                CroppedRoundCornerFrameLayout.access$800(croppedRoundCornerFrameLayout, CroppedRoundCornerFrameLayout.access$300(croppedRoundCornerFrameLayout).a());
                CroppedRoundCornerFrameLayout.access$600(CroppedRoundCornerFrameLayout.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                CroppedRoundCornerFrameLayout.access$900(CroppedRoundCornerFrameLayout.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963083);
        }

        private d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
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

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11826a;
        public final f b;

        static {
            t2o.a(689963084);
        }

        public e(boolean z, f fVar) {
            this.f11826a = z;
            this.b = fVar;
        }

        public f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("8a202f4c", new Object[]{this});
            }
            return this.b;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3381d583", new Object[]{this})).booleanValue();
            }
            return this.f11826a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f11827a;
        public final String b;

        static {
            t2o.a(689963086);
        }

        public f(String str, String str2) {
            this.f11827a = str;
            this.b = str2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "topText=" + this.f11827a + ", bottomText=" + this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
    }

    static {
        t2o.a(689963079);
    }

    public CroppedRoundCornerFrameLayout(Context context) {
        super(context);
        this.mContext = context;
    }

    public static /* synthetic */ LinearLayout access$100(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("86ee8d57", new Object[]{croppedRoundCornerFrameLayout});
        }
        return croppedRoundCornerFrameLayout.mLeftComponentTextRoot;
    }

    public static /* synthetic */ void access$200(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c9dfc4", new Object[]{croppedRoundCornerFrameLayout, new Integer(i)});
        } else {
            croppedRoundCornerFrameLayout.updateState(i);
        }
    }

    public static /* synthetic */ e access$300(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5a00f586", new Object[]{croppedRoundCornerFrameLayout});
        }
        return croppedRoundCornerFrameLayout.mPendingJob;
    }

    public static /* synthetic */ f access$400(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ed1dcbb4", new Object[]{croppedRoundCornerFrameLayout});
        }
        return croppedRoundCornerFrameLayout.getShowedTextSet();
    }

    public static /* synthetic */ boolean access$500(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df007320", new Object[]{croppedRoundCornerFrameLayout, fVar, fVar2})).booleanValue();
        }
        return croppedRoundCornerFrameLayout.isTextSetEqual(fVar, fVar2);
    }

    public static /* synthetic */ void access$600(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a8e39b", new Object[]{croppedRoundCornerFrameLayout});
        } else {
            croppedRoundCornerFrameLayout.clearPendingJob();
        }
    }

    public static /* synthetic */ void access$700(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df99beba", new Object[]{croppedRoundCornerFrameLayout});
        } else {
            croppedRoundCornerFrameLayout.startCloseAnim();
        }
    }

    public static /* synthetic */ void access$800(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccfd36e", new Object[]{croppedRoundCornerFrameLayout, fVar});
        } else {
            croppedRoundCornerFrameLayout.startOpenAnim(fVar);
        }
    }

    public static /* synthetic */ void access$900(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff391c8", new Object[]{croppedRoundCornerFrameLayout, new Float(f2)});
        } else {
            croppedRoundCornerFrameLayout.updateShowPercent(f2);
        }
    }

    private void changeBubbleText(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775d5337", new Object[]{this, fVar});
        } else if (this.mUseAnimate) {
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                stopAll();
                setNewPendingJob(true, fVar);
                if (this.mCurrState == 1) {
                    startCloseAnim();
                } else {
                    startOpenAnim(fVar);
                }
            } else {
                setNewPendingJob(true, fVar);
            }
        } else {
            stopAll();
            setTextSet(fVar);
            updateShowPercent(1.0f);
            updateState(1);
        }
    }

    private void clearPendingJob() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acab57da", new Object[]{this});
        } else {
            this.mPendingJob = null;
        }
    }

    private void closeBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27beb72b", new Object[]{this});
        } else if (this.mUseAnimate) {
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                stopAll();
                startCloseAnim();
                return;
            }
            setNewPendingJob(false, null);
        } else {
            stopAll();
            setTextSet(null);
            updateShowPercent(0.0f);
            updateState(0);
        }
    }

    private f getShowedTextSet() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4deccf61", new Object[]{this});
        }
        TextView textView = this.mLeftComponentTopText;
        String str2 = null;
        if (textView != null) {
            str = textView.getText().toString();
        } else {
            str = null;
        }
        TextView textView2 = this.mLeftComponentBottomText;
        if (textView2 != null) {
            str2 = textView2.getText().toString();
        }
        return new f(str, str2);
    }

    public static /* synthetic */ Object ipc$super(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/component/browser/view/CroppedRoundCornerFrameLayout");
        }
    }

    private boolean isTextSetEmpty(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45ebb322", new Object[]{this, fVar})).booleanValue();
        }
        if (fVar == null) {
            return true;
        }
        if (!TextUtils.isEmpty(fVar.f11827a) || !TextUtils.isEmpty(fVar.b)) {
            return false;
        }
        return true;
    }

    private boolean isTextSetEqual(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bddcb234", new Object[]{this, fVar, fVar2})).booleanValue();
        }
        if (fVar == null || fVar2 == null) {
            if (fVar == null && fVar2 == null) {
                return true;
            }
            return false;
        } else if (!TextUtils.equals(fVar.f11827a, fVar2.f11827a) || !TextUtils.equals(fVar.b, fVar2.b)) {
            return false;
        } else {
            return true;
        }
    }

    private void setLayoutParams(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e16562a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
            }
            view.setLayoutParams(layoutParams);
            vgh.c(this, TAG, "设置布局参数，pixelWidth=" + i + "，pixelHeight=" + i2);
        }
    }

    private void setNewPendingJob(boolean z, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804a8be", new Object[]{this, new Boolean(z), fVar});
        } else {
            this.mPendingJob = new e(z, fVar);
        }
    }

    private void startAnim(float f2, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec1080e", new Object[]{this, new Float(f2), animatorListener});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mShowPercent, f2);
        this.mValueAnimator = ofFloat;
        ofFloat.setDuration(300L);
        this.mValueAnimator.addListener(animatorListener);
        this.mValueAnimator.addUpdateListener(new c());
        this.mValueAnimator.start();
    }

    private void startCloseAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9babaee", new Object[]{this});
        } else {
            startAnim(0.0f, new b());
        }
    }

    private void startOpenAnim(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae623663", new Object[]{this, fVar});
        } else {
            startAnim(1.0f, new a(fVar));
        }
    }

    private void stopAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfb2f46", new Object[]{this});
            return;
        }
        stopAnim();
        clearPendingJob();
    }

    private void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mValueAnimator = null;
        }
    }

    private void updateShowPercent(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ab597a", new Object[]{this, new Float(f2)});
            return;
        }
        this.mShowPercent = f2;
        LinearLayout linearLayout = this.mLeftComponentTextRoot;
        if (linearLayout != null) {
            linearLayout.setTranslationX(linearLayout.getMeasuredWidth() * (1.0f - f2));
        }
    }

    private void updateState(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
        } else if (this.mCurrState != i) {
            this.mCurrState = i;
            g gVar = this.mVisibilityChangeListener;
            if (gVar != null) {
                if (i != 1) {
                    z = false;
                }
                ((BrowserBadgeViewController.a) gVar).a(z);
            }
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            stopAll();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawCircle(getWidth(), getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.restoreToCount(saveLayer);
    }

    public void initView(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bde789c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.browser_badge_left_component);
        this.mLeftComponentTextRoot = linearLayout;
        this.mLeftComponentTopText = (TextView) linearLayout.findViewById(R.id.browser_badge_left_component_top_text);
        this.mLeftComponentBottomText = (TextView) this.mLeftComponentTextRoot.findViewById(R.id.browser_badge_left_component_bottom_text);
        int i5 = i2 / 2;
        this.mLeftComponentTextRoot.setPadding(0, 0, i + i5, 0);
        setLayoutParams(this, -2, i2, GravityCompat.END);
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.topMargin = i3;
            layoutParams.bottomMargin = i4;
            layoutParams.rightMargin = i5;
            setLayoutParams(layoutParams);
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0 && this.mEnable && this.mCurrState == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            updateShowPercent(this.mShowPercent);
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else if (this.mEnable != z) {
            this.mEnable = z;
            if (!z) {
                this.mTargetTextSet = null;
                closeBubble();
            }
        }
    }

    public void setTextSet(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b093706d", new Object[]{this, fVar});
            return;
        }
        TextView textView = this.mLeftComponentTopText;
        if (textView != null) {
            if (fVar == null) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(fVar.f11827a);
            }
        }
        TextView textView2 = this.mLeftComponentBottomText;
        if (textView2 == null) {
            return;
        }
        if (fVar == null) {
            textView2.setText((CharSequence) null);
        } else {
            textView2.setText(fVar.b);
        }
    }

    public void setUseAnimate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa351", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseAnimate = z;
        }
    }

    public void setVisibilityChangeListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4241cfdd", new Object[]{this, gVar});
        } else {
            this.mVisibilityChangeListener = gVar;
        }
    }

    public void updateText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b3d9b1", new Object[]{this, str, str2});
        } else {
            updateText(new f(str, str2));
        }
    }

    private void updateText(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5233aa", new Object[]{this, fVar});
        } else if (this.mEnable && !isTextSetEqual(fVar, this.mTargetTextSet)) {
            Context context = this.mContext;
            vgh.c(context, TAG, "changeBubbleText: " + fVar + ", mTargetTextSet: " + this.mTargetTextSet);
            this.mTargetTextSet = fVar;
            if (isTextSetEmpty(fVar)) {
                closeBubble();
            } else {
                changeBubbleText(fVar);
            }
        }
    }

    public CroppedRoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    public CroppedRoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
    }
}
