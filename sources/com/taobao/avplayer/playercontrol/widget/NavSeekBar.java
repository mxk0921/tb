package com.taobao.avplayer.playercontrol.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.itb;
import tb.jtb;
import tb.r85;
import tb.t2o;
import tb.t85;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NavSeekBar extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int BUBBLE_HEIGHT;
    private static int BUBBLE_WIDTH;
    private RectF mAchorRect;
    private float mCurrentX;
    private itb mDWNavAdapter;
    private jtb mDWNavSeekBarCallback;
    private boolean mExpanded;
    private boolean mNavVisible;
    private SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener;
    private Paint mPaint;
    private int mProgressHeight;
    private int mProgressRealWidth;
    private Drawable mThumb;
    private int mThumbHeight;
    private Rect mThumbRect;
    private int mThumbWidth;
    private int size;

    static {
        t2o.a(452985187);
    }

    public NavSeekBar(Context context) {
        this(context, null);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_NavSeekBar);
    }

    public static /* synthetic */ Object ipc$super(NavSeekBar navSeekBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 689194376:
                super.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/playercontrol/widget/NavSeekBar");
        }
    }

    public int getProgressRealWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("139e085f", new Object[]{this})).intValue();
        }
        return this.mProgressRealWidth;
    }

    public void init(AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a9cdcc", new Object[]{this, attributeSet, new Integer(i)});
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.NavSeekBar, i, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.NavSeekBar_thumb);
            this.mThumb = drawable;
            if (drawable != null) {
                this.mThumbWidth = drawable.getIntrinsicWidth();
                this.mThumbHeight = this.mThumb.getIntrinsicHeight();
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int i;
        int i2;
        int paddingBottom;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        jtb jtbVar = this.mDWNavSeekBarCallback;
        if (jtbVar != null) {
            ((t85) jtbVar).c(this);
        }
        itb itbVar = this.mDWNavAdapter;
        if (itbVar != null && this.mNavVisible) {
            this.size = ((r85) itbVar).a();
            for (int i4 = 0; i4 < this.size; i4++) {
                if (!(((r85) this.mDWNavAdapter).b(i4) == null || ((r85) this.mDWNavAdapter).b(i4).b == null)) {
                    int paddingLeft = (int) ((this.mProgressRealWidth * ((r85) this.mDWNavAdapter).b(i4).f29222a) + getPaddingLeft());
                    RectF rectF = this.mAchorRect;
                    int i5 = BUBBLE_WIDTH;
                    float f = paddingLeft - (i5 / 2);
                    float paddingBottom2 = ((int) ((this.mProgressHeight * 0.5f) + (((i - getPaddingBottom()) - getPaddingTop()) / 2))) - BUBBLE_HEIGHT;
                    int i6 = paddingLeft + (i5 / 2);
                    if (i5 % 2 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    rectF.set(f, paddingBottom2, i6 + i3, paddingBottom + i2);
                    RectF rectF2 = this.mAchorRect;
                    int i7 = BUBBLE_HEIGHT;
                    canvas.drawRoundRect(rectF2, i7 / 2, i7 / 2, this.mPaint);
                }
            }
        }
        if (this.mThumb != null) {
            setThumbPosition(this.mThumbRect);
            this.mThumb.setBounds(this.mThumbRect);
            this.mThumb.draw(canvas);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
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

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        jtb jtbVar = this.mDWNavSeekBarCallback;
        if (jtbVar != null) {
            ((t85) jtbVar).d(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(itb itbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c41ebbd", new Object[]{this, itbVar});
        } else {
            this.mDWNavAdapter = itbVar;
        }
    }

    public void setNavSeekBarCallback(jtb jtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97a2f3e", new Object[]{this, jtbVar});
        } else {
            this.mDWNavSeekBarCallback = jtbVar;
        }
    }

    public void setNavVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c211fc", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mNavVisible = z;
        invalidate();
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29144588", new Object[]{this, onSeekBarChangeListener});
            return;
        }
        this.mOnSeekBarChangeListener = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    public Rect setThumbPosition(Rect rect) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("ef14f3be", new Object[]{this, rect});
        }
        float progress = (float) (((getProgress() * this.mProgressRealWidth) / getMax()) + 0.5d);
        this.mCurrentX = progress;
        int i4 = this.mThumbWidth;
        if (progress < i4 - (i4 / 2)) {
            int paddingLeft = getPaddingLeft();
            i3 = this.mThumbWidth;
            i2 = (int) ((paddingLeft - (i3 / 2)) + this.mCurrentX);
        } else if (progress + (i4 / 2) > this.mProgressRealWidth + getPaddingLeft()) {
            i2 = this.mProgressRealWidth + getPaddingLeft();
            i3 = this.mThumbWidth;
        } else {
            float f = this.mCurrentX;
            i = ((int) f) + this.mThumbWidth;
            i2 = (int) f;
            int i5 = this.mThumbHeight;
            int i6 = (this.mProgressHeight / 2) - (i5 / 2);
            rect.set(i2, i6, i, i5 + i6);
            return rect;
        }
        i = i3 + i2;
        int i52 = this.mThumbHeight;
        int i62 = (this.mProgressHeight / 2) - (i52 / 2);
        rect.set(i2, i62, i, i52 + i62);
        return rect;
    }

    public NavSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_NavSeekBar);
    }

    public NavSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNavVisible = true;
        this.mAchorRect = new RectF();
        this.mThumbRect = new Rect();
        init(attributeSet, i);
        BUBBLE_WIDTH = DWViewUtil.dip2px(context, 4.0f);
        BUBBLE_HEIGHT = DWViewUtil.dip2px(context, 2.0f);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(context.getResources().getColor(R.color.dw_interactive_sdk_white));
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setAntiAlias(true);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_NavSeekBar);
    }
}
