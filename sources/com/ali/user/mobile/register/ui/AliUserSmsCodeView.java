package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserSmsCodeView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mHeight;
    private OnCompletedListener mOnCompletedListener;
    private OnTextChangedListener mOnTextChangedListener;
    public RectF[] mOuterRects;
    public StringBuilder mTextBuilder;
    public Paint mTextPaint;
    public PointF[] mTextPositions;
    public RectF[] mTextRects;
    public Paint mUnderLinePaint;
    public int mWidth;
    private String TAG = "smscode";
    private int mTextColor = -16777216;
    public float mTextSize = 36.0f;
    public int mTextCount = 6;
    public int padding = 10;
    public float mDividerWidth = 6.0f;
    public int mUnderLineColor = -16777216;
    public int mNextUnderLineColor = -16777216;
    public float mUnderLineStrokeWidth = 1.0f;
    public float mBorderWidth = ScreenUtil.dip2px(getContext(), 36.0f);
    public float mBorderheight = ScreenUtil.dip2px(getContext(), 40.0f);
    public boolean autoHideKeyboard = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnCompletedListener {
        void onCompleted(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnTextChangedListener {
        void onTextChanged(String str);
    }

    static {
        t2o.a(70254829);
    }

    public AliUserSmsCodeView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AliUserSmsCodeView);
            this.mTextCount = obtainStyledAttributes.getInt(R.styleable.AliUserSmsCodeView_scTextCount, this.mTextCount);
            this.mTextColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scTextColor, this.mTextColor);
            this.mTextSize = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scTextSize, TypedValue.applyDimension(2, this.mTextSize, context.getResources().getDisplayMetrics()));
            setTextSize();
            this.mDividerWidth = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scDividerWidth, TypedValue.applyDimension(1, this.mDividerWidth, context.getResources().getDisplayMetrics()));
            this.mUnderLineStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.AliUserSmsCodeView_scUnderLineStrokeWidth, TypedValue.applyDimension(1, this.mUnderLineStrokeWidth, context.getResources().getDisplayMetrics()));
            this.mUnderLineColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scUnderLineColor, this.mUnderLineColor);
            this.mNextUnderLineColor = obtainStyledAttributes.getColor(R.styleable.AliUserSmsCodeView_scNextUnderLineColor, this.mNextUnderLineColor);
            obtainStyledAttributes.recycle();
        }
        this.mTextBuilder = new StringBuilder(this.mTextCount);
        int i = this.mTextCount;
        this.mTextPositions = new PointF[i];
        this.mOuterRects = new RectF[i];
        this.mTextRects = new RectF[i];
        if (i == 4) {
            this.mBorderWidth = ScreenUtil.dip2px(getContext(), 45.0f);
            this.mBorderheight = ScreenUtil.dip2px(getContext(), 50.0f);
        }
        initPaint();
        setFocusableInTouchMode(true);
    }

    public static /* synthetic */ Object ipc$super(AliUserSmsCodeView aliUserSmsCodeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1391904137:
                return new Boolean(super.onKeyMultiple(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (KeyEvent) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/register/ui/AliUserSmsCodeView");
        }
    }

    private double measureChildPositions() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b9b3a21", new Object[]{this})).doubleValue();
        }
        Paint.FontMetricsInt fontMetricsInt = this.mTextPaint.getFontMetricsInt();
        float measureText = this.mTextPaint.measureText("0");
        float f = (this.mHeight / 2) + this.padding + ((fontMetricsInt.bottom - fontMetricsInt.top) / 4.0f);
        float f2 = this.mBorderWidth;
        while (true) {
            if (i2 >= this.mTextCount) {
                return (i * f2) + (this.mDividerWidth * (i - 1)) + (this.padding * 2);
            }
            float f3 = i2;
            float f4 = f3 * f2;
            this.mTextPositions[i2] = new PointF((this.mDividerWidth * f3) + f4 + (f2 / 2.0f) + this.padding, f);
            RectF[] rectFArr = this.mOuterRects;
            float f5 = this.mDividerWidth;
            int i3 = this.padding;
            int i4 = i2 + 1;
            rectFArr[i2] = new RectF(f4 + (f3 * f5) + i3, 0.0f, (i4 * f2) + (f3 * f5) + i3, this.mHeight);
            RectF[] rectFArr2 = this.mTextRects;
            PointF pointF = this.mTextPositions[i2];
            float f6 = pointF.x;
            float f7 = measureText / 2.0f;
            float f8 = pointF.y;
            rectFArr2[i2] = new RectF(f6 - f7, fontMetricsInt.top + f8, f6 + f7, f8 + fontMetricsInt.bottom);
            i2 = i4;
        }
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
        } else if (this.mTextBuilder.length() != 0) {
            StringBuilder sb = this.mTextBuilder;
            sb.delete(0, sb.length());
            OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
            if (onTextChangedListener != null) {
                onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
        }
    }

    public void drawUnderLine(Canvas canvas, Paint paint, RectF rectF, RectF rectF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb18ced", new Object[]{this, canvas, paint, rectF, rectF2});
            return;
        }
        float f = rectF.left;
        float f2 = rectF.bottom;
        canvas.drawLine(f, f2, rectF.right, f2, paint);
    }

    public void focus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6100ad5f", new Object[]{this});
            return;
        }
        requestFocus();
        postDelayed(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserSmsCodeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) AliUserSmsCodeView.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(AliUserSmsCodeView.this, 0);
                }
            }
        }, 100L);
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        StringBuilder sb = this.mTextBuilder;
        if (sb != null) {
            return sb.toString();
        }
        return "";
    }

    public int getTextCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e41cfa6", new Object[]{this})).intValue();
        }
        return this.mTextCount;
    }

    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        if (this.mTextPaint == null) {
            this.mTextPaint = new Paint(1);
        }
        this.mTextPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        if (this.mUnderLinePaint == null) {
            this.mUnderLinePaint = new Paint(1);
        }
        this.mUnderLinePaint.setStyle(Paint.Style.STROKE);
        this.mUnderLinePaint.setColor(this.mUnderLineColor);
        this.mUnderLinePaint.setStrokeWidth(this.mUnderLineStrokeWidth);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputConnection) ipChange.ipc$dispatch("bab20287", new Object[]{this, editorInfo});
        }
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false) { // from class: com.ali.user.mobile.register.ui.AliUserSmsCodeView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/register/ui/AliUserSmsCodeView$2");
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a62772b1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                    return false;
                }
                return true;
            }
        };
        editorInfo.actionLabel = null;
        editorInfo.inputType = 3;
        editorInfo.imeOptions = 5;
        return baseInputConnection;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        initPaint();
        int length = this.mTextBuilder.length();
        for (int i = 0; i < this.mTextCount; i++) {
            if (i < length) {
                PointF pointF = this.mTextPositions[i];
                canvas.drawText(this.mTextBuilder.toString(), i, i + 1, pointF.x, pointF.y, this.mTextPaint);
            }
            int i2 = this.mUnderLineColor;
            if (hasFocus() && i == length) {
                i2 = this.mNextUnderLineColor;
            } else if (i < length) {
                i2 = this.mNextUnderLineColor;
            }
            this.mUnderLinePaint.setColor(i2);
            drawUnderLine(canvas, this.mUnderLinePaint, this.mOuterRects[i], this.mTextRects[i]);
        }
        setBackgroundColor(-1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mWidth = View.MeasureSpec.getSize(i);
        this.mHeight = View.MeasureSpec.getSize(i2);
        double measureChildPositions = measureChildPositions();
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) measureChildPositions, this.mHeight + (this.padding * 2));
        } else {
            setMeasuredDimension(this.mWidth, this.mHeight + (this.padding * 2));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            focus();
        }
        return true;
    }

    public void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cf78ff", new Object[]{this, onCompletedListener});
        } else {
            this.mOnCompletedListener = onCompletedListener;
        }
    }

    public void setOnTextChangedListener(OnTextChangedListener onTextChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75db5d3f", new Object[]{this, onTextChangedListener});
        } else {
            this.mOnTextChangedListener = onTextChangedListener;
        }
    }

    public void setTextCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ef01bc", new Object[]{this, new Integer(i)});
        } else if (this.mTextCount != i) {
            this.mTextCount = i;
            this.mTextBuilder = new StringBuilder(i);
            this.mTextPositions = new PointF[i];
            this.mOuterRects = new RectF[i];
            this.mTextRects = new RectF[i];
            if (i == 4) {
                this.mBorderWidth = ScreenUtil.dip2px(getContext(), 45.0f);
                this.mBorderheight = ScreenUtil.dip2px(getContext(), 50.0f);
            }
            setTextSize();
            invalidate();
        }
    }

    public void setTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a835d7", new Object[]{this});
        } else if (this.mTextCount == 4) {
            this.mTextSize = (float) (this.mTextSize * 1.2d);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52f6c589", new Object[]{this, new Integer(i), new Integer(i2), keyEvent})).booleanValue();
        }
        String characters = keyEvent.getCharacters();
        if (TextUtils.isEmpty(characters) || !TextUtils.isDigitsOnly(characters)) {
            return super.onKeyMultiple(i, i2, keyEvent);
        }
        LoginTLogAdapter.e("login_optimize", "onKeyMultiple: " + characters);
        this.mTextBuilder.append(characters);
        OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
        if (onTextChangedListener != null) {
            onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
        }
        invalidate();
        if (this.mTextBuilder.length() >= this.mTextCount && this.autoHideKeyboard) {
            OnCompletedListener onCompletedListener = this.mOnCompletedListener;
            if (onCompletedListener != null) {
                onCompletedListener.onCompleted(this.mTextBuilder.toString());
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 67 && this.mTextBuilder.length() > 0) {
            StringBuilder sb = this.mTextBuilder;
            sb.deleteCharAt(sb.length() - 1);
            OnTextChangedListener onTextChangedListener = this.mOnTextChangedListener;
            if (onTextChangedListener != null) {
                onTextChangedListener.onTextChanged(this.mTextBuilder.toString());
            }
            invalidate();
        } else if (i >= 7 && i <= 16 && this.mTextBuilder.length() < this.mTextCount) {
            this.mTextBuilder.append(keyEvent.getDisplayLabel());
            OnTextChangedListener onTextChangedListener2 = this.mOnTextChangedListener;
            if (onTextChangedListener2 != null) {
                onTextChangedListener2.onTextChanged(this.mTextBuilder.toString());
            }
            String str = this.TAG;
            LoginTLogAdapter.e(str, "onKeyDown: " + keyEvent.getDisplayLabel() + ",builder=" + ((Object) this.mTextBuilder));
            invalidate();
        }
        if (this.mTextBuilder.length() >= this.mTextCount && this.autoHideKeyboard) {
            OnCompletedListener onCompletedListener = this.mOnCompletedListener;
            if (!(onCompletedListener == null || i == 4)) {
                onCompletedListener.onCompleted(this.mTextBuilder.toString());
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public AliUserSmsCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public AliUserSmsCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
