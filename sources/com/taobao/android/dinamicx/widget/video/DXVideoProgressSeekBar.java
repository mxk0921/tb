package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXVideoProgressSeekBar extends AppCompatSeekBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isTouching;
    private int mProgressHeight;
    private int mProgressRealWidth;
    private GradientDrawable mThumbDrawable;
    private int mThumbHeight;
    private Rect mThumbRect;
    private int mThumbWidth;
    private int middleProgressHeight;
    private int middleThumbSize;
    private int normalProgressHeight;
    private int normalThumbSize;
    private ThumbState thumbState;
    private long touchMaxY;
    private int touchProgressHeight;
    private int touchThumbSize;
    private boolean touchingStateChanged;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ThumbState {
        NORMAL,
        MIDDLE,
        TOUCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ThumbState thumbState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXVideoProgressSeekBar$ThumbState");
        }

        public static ThumbState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThumbState) ipChange.ipc$dispatch("d0bda880", new Object[]{str});
            }
            return (ThumbState) Enum.valueOf(ThumbState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$dinamicx$widget$video$DXVideoProgressSeekBar$ThumbState;

        static {
            int[] iArr = new int[ThumbState.values().length];
            $SwitchMap$com$taobao$android$dinamicx$widget$video$DXVideoProgressSeekBar$ThumbState = iArr;
            try {
                iArr[ThumbState.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$video$DXVideoProgressSeekBar$ThumbState[ThumbState.TOUCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DXVideoProgressSeekBar(Context context) {
        this(context, null);
    }

    private void initThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc9c82d", new Object[]{this});
            return;
        }
        this.normalThumbSize = pb6.f(getContext(), 3.0f);
        this.middleThumbSize = pb6.f(getContext(), 6.0f);
        this.touchThumbSize = pb6.f(getContext(), 10.0f);
        this.normalProgressHeight = pb6.f(getContext(), 2.0f);
        this.middleProgressHeight = pb6.f(getContext(), 4.0f);
        this.touchProgressHeight = pb6.f(getContext(), 8.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.mThumbDrawable = gradientDrawable;
        gradientDrawable.setColor(-1);
        this.mThumbDrawable.setShape(1);
        setThumbState(ThumbState.NORMAL);
    }

    public static /* synthetic */ Object ipc$super(DXVideoProgressSeekBar dXVideoProgressSeekBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/video/DXVideoProgressSeekBar");
        }
    }

    private void setThumbStyle(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7c4e4", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mThumbDrawable.setSize(i, i);
        this.mThumbDrawable.setCornerRadius(i / 2.0f);
        this.mThumbWidth = i;
        this.mThumbHeight = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i2;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.thumbState != ThumbState.NORMAL) {
                    i3 = pb6.f(getContext(), 1.0f);
                }
                marginLayoutParams.bottomMargin = i3;
            }
        }
        requestLayout();
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue();
        }
        return this.isTouching;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mThumbDrawable != null) {
            setThumbPosition(this.mThumbRect);
            this.mThumbDrawable.setBounds(this.mThumbRect);
            this.mThumbDrawable.draw(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.mProgressRealWidth = (getWidth() - getPaddingLeft()) - getPaddingRight();
            this.mProgressHeight = getHeight();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r3 != 3) goto L_0x006a;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r2[r0] = r12
            java.lang.Object r12 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L_0x001c:
            int r3 = r12.getAction()
            r4 = 3
            if (r3 == 0) goto L_0x0042
            if (r3 == r0) goto L_0x0032
            if (r3 == r2) goto L_0x002a
            if (r3 == r4) goto L_0x0032
            goto L_0x006a
        L_0x002a:
            android.view.ViewParent r2 = r11.getParent()
            r2.requestDisallowInterceptTouchEvent(r0)
            goto L_0x006a
        L_0x0032:
            boolean r2 = r11.isTouching
            if (r2 == 0) goto L_0x003a
            r11.touchingStateChanged = r0
            r11.isTouching = r1
        L_0x003a:
            android.view.ViewParent r2 = r11.getParent()
            r2.requestDisallowInterceptTouchEvent(r1)
            goto L_0x006a
        L_0x0042:
            float r2 = r12.getY()
            int r3 = r11.getBottom()
            long r5 = (long) r3
            long r7 = r11.touchMaxY
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            int r3 = r11.getHeight()
            int r3 = r3 * 3
            long r7 = (long) r3
        L_0x005b:
            long r5 = r5 - r7
            float r3 = (float) r5
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0063
            r11.isTouching = r0
        L_0x0063:
            android.view.ViewParent r2 = r11.getParent()
            r2.requestDisallowInterceptTouchEvent(r0)
        L_0x006a:
            boolean r2 = r11.isTouching
            if (r2 != 0) goto L_0x0074
            boolean r2 = r11.touchingStateChanged
            if (r2 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            return r0
        L_0x0074:
            r11.touchingStateChanged = r1
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setThumbPosition(Rect rect) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfcf6835", new Object[]{this, rect});
            return;
        }
        float progress = (float) (((getProgress() * this.mProgressRealWidth) / getMax()) + 0.5d);
        int i3 = this.mThumbWidth;
        if (progress < i3 / 2.0f) {
            int paddingLeft = getPaddingLeft();
            int i4 = this.mThumbWidth;
            i2 = (int) ((paddingLeft - (i4 / 2)) + progress);
            i = i4 + i2;
        } else if ((i3 / 2) + progress > this.mProgressRealWidth + getPaddingLeft()) {
            i2 = this.mProgressRealWidth + getPaddingLeft();
            i = i2 + this.mThumbWidth;
        } else {
            int i5 = (int) progress;
            int i6 = this.mThumbWidth;
            i = i5 + (i6 / 2);
            i2 = i5 - (i6 / 2);
        }
        int i7 = this.mThumbHeight;
        int i8 = (this.mProgressHeight / 2) - (i7 / 2);
        rect.set(i2, i8, i, i7 + i8);
    }

    public void setThumbState(ThumbState thumbState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a850e7", new Object[]{this, thumbState});
            return;
        }
        this.thumbState = thumbState;
        int i = a.$SwitchMap$com$taobao$android$dinamicx$widget$video$DXVideoProgressSeekBar$ThumbState[thumbState.ordinal()];
        if (i == 1 || i == 2) {
            setThumbStyle(this.middleThumbSize, this.middleProgressHeight);
        } else {
            setThumbStyle(this.normalThumbSize, this.normalProgressHeight);
        }
    }

    public void setTouchMaxY(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba3094b", new Object[]{this, new Long(j)});
        } else {
            this.touchMaxY = j;
        }
    }

    public DXVideoProgressSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXVideoProgressSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbRect = new Rect();
        initThumb();
    }
}
