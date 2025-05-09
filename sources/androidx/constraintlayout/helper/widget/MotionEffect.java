package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionEffect extends MotionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private float mMotionEffectAlpha = 0.1f;
    private int mMotionEffectStart = 49;
    private int mMotionEffectEnd = 50;
    private int mMotionEffectTranslationX = 0;
    private int mMotionEffectTranslationY = 0;
    private boolean mMotionEffectStrictMove = true;
    private int mViewTransitionId = -1;
    private int mFadeMove = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.mMotionEffectStart);
                    this.mMotionEffectStart = i2;
                    this.mMotionEffectStart = Math.max(Math.min(i2, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.mMotionEffectEnd);
                    this.mMotionEffectEnd = i3;
                    this.mMotionEffectEnd = Math.max(Math.min(i3, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.mMotionEffectTranslationX = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationX);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.mMotionEffectTranslationY = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationY);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.mMotionEffectAlpha = obtainStyledAttributes.getFloat(index, this.mMotionEffectAlpha);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.mFadeMove = obtainStyledAttributes.getInt(index, this.mFadeMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.mMotionEffectStrictMove = obtainStyledAttributes.getBoolean(index, this.mMotionEffectStrictMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.mViewTransitionId = obtainStyledAttributes.getResourceId(index, this.mViewTransitionId);
                }
            }
            int i4 = this.mMotionEffectStart;
            int i5 = this.mMotionEffectEnd;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.mMotionEffectStart = i4 - 1;
                } else {
                    this.mMotionEffectEnd = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Object ipc$super(MotionEffect motionEffect, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/helper/widget/MotionEffect");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54b17e3c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
        if (r6 == 0.0f) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
        if (r6 == 0.0f) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
        if (r19 == 0.0f) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
        if (r19 == 0.0f) goto L_0x017c;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r24) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
