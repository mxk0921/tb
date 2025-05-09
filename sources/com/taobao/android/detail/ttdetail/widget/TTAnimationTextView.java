package com.taobao.android.detail.ttdetail.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.ckf;
import tb.pl4;
import tb.t2o;
import tb.xbn;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000f\b\u0017\u0018\u0000 X2\u00020\u0001:\u0002YZB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\u0015¢\u0006\u0004\b$\u0010\u0017J\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010\u0017J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0014J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0011J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001a¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0012¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u0012¢\u0006\u0004\b9\u00107J\r\u0010:\u001a\u00020\u000b¢\u0006\u0004\b:\u0010\"J\u0017\u0010<\u001a\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020\u0012¢\u0006\u0004\b<\u00107J\u0019\u0010=\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u000b¢\u0006\u0004\b?\u0010\"J\u000f\u0010@\u001a\u00020\u000bH\u0014¢\u0006\u0004\b@\u0010\"J\u000f\u0010A\u001a\u00020\u000bH\u0014¢\u0006\u0004\bA\u0010\"R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u001e\u0010J\u001a\n I*\u0004\u0018\u00010H0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010QR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u0016\u0010V\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u0016\u0010W\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010S¨\u0006["}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "", pl4.KEY_PAGE_ID, "type", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView$AnimationState;", "state", "Ltb/xhv;", "setAnimationState", "(Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView$AnimationState;)V", "", "value", "updateValue", "(F)V", "", "calculateAnimationDuration", "()J", "", "check", "()Z", "Landroid/graphics/Canvas;", "canvas", "", "index", "", "char", "drawCurrentChar", "(Landroid/graphics/Canvas;IC)V", "drawTargetChar", "onAttachedToWindowInternal", "()V", "onDetachedFromWindowInternal", "isAnimating", "isAnimAble", "getAnimationDuration", "text", "setTargetText", "(Ljava/lang/String;)V", "getTargetText", "()Ljava/lang/String;", "offSetX", "setOffsetX", "getOffsetX", "()F", "diff", "setPreDiff", "(I)V", "getDiff", "()I", "duration", "setCharAnimationDuration", "(J)V", Constants.Name.INTERVAL, "setCharAnimationInterval", "init", "delay", "start", "onDraw", "(Landroid/graphics/Canvas;)V", "finish", "onAttachedToWindow", "onDetachedFromWindow", "mAnimationState", "Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView$AnimationState;", "mAnimationDuration", "J", "mCharAnimationDuration", "mCharAnimationInterval", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "mAnimator", "Landroid/animation/ValueAnimator;", "", "mTargetText", "Ljava/lang/CharSequence;", "mCurrentText", "mAnimationProgress", UTConstant.Args.UT_SUCCESS_F, "mDiff", TLogTracker.LEVEL_INFO, "mCurrentTextWidth", "mTargetTextWidth", "mOffsetX", "mPreDiff", "Companion", "AnimationState", "a", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTAnimationTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long ANIMATION_DURATION_DEFAULT = 500;
    public static final a Companion = new a(null);
    public static final String TAG = "TTAnimTextView";
    private float mAnimationProgress;
    private long mCharAnimationDuration;
    private long mCharAnimationInterval;
    private float mCurrentTextWidth;
    private int mDiff;
    private float mOffsetX;
    private int mPreDiff;
    private float mTargetTextWidth;
    private AnimationState mAnimationState = AnimationState.IDLE;
    private long mAnimationDuration = 500;
    private ValueAnimator mAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private CharSequence mTargetText = "";
    private CharSequence mCurrentText = "";

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView$AnimationState;", "", "(Ljava/lang/String;I)V", "PLAYING", Configuration.IDLE, "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum AnimationState {
        PLAYING,
        IDLE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnimationState animationState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TTAnimationTextView$AnimationState");
        }

        public static AnimationState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9bce0ed9", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(AnimationState.class, str);
            }
            return (AnimationState) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262931);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            ckf.c(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                TTAnimationTextView.access$updateValue(TTAnimationTextView.this, ((Float) animatedValue).floatValue());
                TTAnimationTextView.this.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(912262929);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTAnimationTextView(Context context, String str, String str2) {
        super(context);
        ckf.h(context, "context");
        ckf.h(str, pl4.KEY_PAGE_ID);
        ckf.h(str2, "type");
        xbn.a aVar = xbn.Companion;
        String concat = TAG.concat(str2);
        ValueAnimator valueAnimator = this.mAnimator;
        ckf.c(valueAnimator, "this.mAnimator");
        aVar.d(str, concat, valueAnimator);
    }

    public static final /* synthetic */ void access$updateValue(TTAnimationTextView tTAnimationTextView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c892cc", new Object[]{tTAnimationTextView, new Float(f)});
        } else {
            tTAnimationTextView.updateValue(f);
        }
    }

    private final long calculateAnimationDuration() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c2b9ed", new Object[]{this})).longValue();
        }
        if (this.mCharAnimationDuration > 0) {
            int i2 = this.mPreDiff;
            if (i2 > 0) {
                i = Math.max(this.mCurrentText.length(), this.mTargetText.length() + this.mDiff);
            } else if (i2 < 0) {
                i = Math.max(this.mCurrentText.length() - this.mPreDiff, this.mTargetText.length());
            } else {
                i = Math.max(this.mCurrentText.length(), this.mTargetText.length());
            }
            this.mAnimationDuration = ((i - 1) * this.mCharAnimationInterval) + this.mCharAnimationDuration;
        }
        return this.mAnimationDuration;
    }

    private final boolean check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17afa593", new Object[]{this})).booleanValue();
        }
        if (isAnimating()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mCurrentText) || !TextUtils.isEmpty(this.mTargetText)) {
            return true;
        }
        return false;
    }

    private final void drawCurrentChar(Canvas canvas, int i, char c) {
        int i2;
        String str;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e110232d", new Object[]{this, canvas, new Integer(i), new Character(c)});
            return;
        }
        if (this.mDiff < 0) {
            i2 = i - this.mPreDiff;
        } else {
            i2 = i;
        }
        long j = this.mCharAnimationInterval * i2;
        long j2 = this.mCharAnimationDuration + j;
        float f2 = this.mAnimationProgress * ((float) this.mAnimationDuration);
        TextPaint paint = getPaint();
        if (i > 0) {
            str = this.mCurrentText.subSequence(0, i).toString();
        } else {
            str = null;
        }
        if (str != null) {
            f = paint.measureText(str);
        } else {
            f = 0.0f;
        }
        float compoundPaddingLeft = f + getCompoundPaddingLeft();
        int baseline = getBaseline();
        float f3 = (float) j;
        if (f2 < f3) {
            canvas.drawText(String.valueOf(c), compoundPaddingLeft, baseline, paint);
        } else if (f2 < ((float) j2)) {
            canvas.drawText(String.valueOf(c), compoundPaddingLeft, baseline + (((f2 - f3) / ((float) this.mCharAnimationDuration)) * getHeight()), paint);
        }
    }

    private final void drawTargetChar(Canvas canvas, int i, char c) {
        int i2;
        String str;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e050b2cd", new Object[]{this, canvas, new Integer(i), new Character(c)});
            return;
        }
        if (this.mDiff > 0) {
            i2 = this.mPreDiff + i;
        } else {
            i2 = i;
        }
        long j = this.mCharAnimationInterval * i2;
        long j2 = this.mCharAnimationDuration + j;
        float f2 = this.mAnimationProgress * ((float) this.mAnimationDuration);
        TextPaint paint = getPaint();
        if (i > 0) {
            str = this.mTargetText.subSequence(0, i).toString();
        } else {
            str = null;
        }
        if (str != null) {
            f = paint.measureText(str);
        } else {
            f = 0.0f;
        }
        float compoundPaddingLeft = f + getCompoundPaddingLeft() + this.mOffsetX;
        int baseline = getBaseline();
        if (f2 > ((float) j2)) {
            canvas.drawText(String.valueOf(c), compoundPaddingLeft, baseline, paint);
            return;
        }
        float f3 = (float) j;
        if (f2 > f3) {
            canvas.drawText(String.valueOf(c), compoundPaddingLeft, (baseline + (((f2 - f3) / ((float) this.mCharAnimationDuration)) * getHeight())) - getHeight(), paint);
        }
    }

    public static /* synthetic */ Object ipc$super(TTAnimationTextView tTAnimationTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/TTAnimationTextView");
        }
    }

    private final void onAttachedToWindowInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97afd3f2", new Object[]{this});
        } else {
            this.mAnimator.resume();
        }
    }

    private final void onDetachedFromWindowInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7ae9ef", new Object[]{this});
        } else {
            this.mAnimator.pause();
        }
    }

    private final void setAnimationState(AnimationState animationState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cb9812", new Object[]{this, animationState});
        } else {
            this.mAnimationState = animationState;
        }
    }

    public static /* synthetic */ void start$default(TTAnimationTextView tTAnimationTextView, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb2b958", new Object[]{tTAnimationTextView, new Long(j), new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            tTAnimationTextView.start(j);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
    }

    private final synchronized void updateValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a718ef1", new Object[]{this, new Float(f)});
        } else {
            this.mAnimationProgress = f;
        }
    }

    public final void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        setAnimationState(AnimationState.IDLE);
        setText(this.mTargetText);
    }

    public final long getAnimationDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97203fd", new Object[]{this})).longValue();
        }
        return this.mAnimationDuration;
    }

    public final int getDiff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75ff4375", new Object[]{this})).intValue();
        }
        return this.mDiff;
    }

    public final float getOffsetX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25635ee6", new Object[]{this})).floatValue();
        }
        return this.mTargetTextWidth - this.mCurrentTextWidth;
    }

    public final String getTargetText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4df925", new Object[]{this});
        }
        return this.mTargetText.toString();
    }

    public final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAnimator.removeAllUpdateListeners();
        CharSequence text = getText();
        if (text == null) {
            text = "";
        }
        this.mCurrentText = text;
        this.mDiff = this.mTargetText.length() - this.mCurrentText.length();
        this.mCurrentTextWidth = getPaint().measureText(this.mCurrentText.toString());
        this.mTargetTextWidth = getPaint().measureText(this.mTargetText.toString());
        ValueAnimator valueAnimator = this.mAnimator;
        ckf.c(valueAnimator, "mAnimator");
        valueAnimator.setDuration(calculateAnimationDuration());
        ValueAnimator valueAnimator2 = this.mAnimator;
        ckf.c(valueAnimator2, "mAnimator");
        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mAnimator.addUpdateListener(new b());
    }

    public final boolean isAnimAble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68b55460", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.mCurrentText) || !TextUtils.isEmpty(this.mTargetText)) {
            return true;
        }
        return false;
    }

    public final boolean isAnimating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        if (this.mAnimationState == AnimationState.PLAYING) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        onAttachedToWindowInternal();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetachedFromWindowInternal();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!isAnimating()) {
            super.onDraw(canvas);
        } else if (canvas != null) {
            CharSequence charSequence = this.mCurrentText;
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequence.length()) {
                drawCurrentChar(canvas, i3, charSequence.charAt(i2));
                i2++;
                i3++;
            }
            CharSequence charSequence2 = this.mTargetText;
            int i4 = 0;
            while (i < charSequence2.length()) {
                drawTargetChar(canvas, i4, charSequence2.charAt(i));
                i++;
                i4++;
            }
        }
    }

    public final void setCharAnimationDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8db9dd", new Object[]{this, new Long(j)});
        } else {
            this.mCharAnimationDuration = j;
        }
    }

    public final void setCharAnimationInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce15f94c", new Object[]{this, new Long(j)});
        } else {
            this.mCharAnimationInterval = j;
        }
    }

    public final void setOffsetX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51e296", new Object[]{this, new Float(f)});
        } else {
            this.mOffsetX = f;
        }
    }

    public final void setPreDiff(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b37096", new Object[]{this, new Integer(i)});
        } else {
            this.mPreDiff = i;
        }
    }

    public final void setTargetText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325ab2f1", new Object[]{this, str});
            return;
        }
        ckf.h(str, "text");
        this.mTargetText = str;
    }

    public final void start(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
        } else if (check()) {
            setAnimationState(AnimationState.PLAYING);
            ValueAnimator valueAnimator = this.mAnimator;
            ckf.c(valueAnimator, "mAnimator");
            valueAnimator.setStartDelay(j);
            this.mAnimator.start();
        }
    }
}
