package com.taobao.update.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;
import tb.tyv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class Button extends CustomView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROIDXML = "http://schemas.android.com/apk/res/android";
    public int background;
    public boolean clickAfterRipple;
    public int minHeight;
    public int minWidth;
    public View.OnClickListener onClickListener;
    public Integer rippleColor;
    public TextView textButton;
    public float rippleSpeed = 12.0f;
    public int rippleSize = 3;
    public int backgroundColor = Color.parseColor("#1E88E5");
    public float x = -1.0f;
    public float y = -1.0f;
    public float radius = -1.0f;

    static {
        t2o.a(947912730);
    }

    public Button(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clickAfterRipple = true;
        setDefaultProperties();
        this.clickAfterRipple = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "animate", true);
        setAttributes(attributeSet);
        this.beforeBackground = this.backgroundColor;
        if (this.rippleColor == null) {
            this.rippleColor = Integer.valueOf(makePressColor());
        }
    }

    public static /* synthetic */ Object ipc$super(Button button, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dialog/Button");
    }

    public float getRippleSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a083ab8", new Object[]{this})).floatValue();
        }
        return this.rippleSpeed;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.textButton.getText().toString();
    }

    public TextView getTextView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this});
        }
        return this.textButton;
    }

    public Bitmap makeCircle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f8e59c3", new Object[]{this});
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth() - tyv.dpToPx(6.0f, getResources()), getHeight() - tyv.dpToPx(7.0f, getResources()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.rippleColor.intValue());
        canvas.drawCircle(this.x, this.y, this.radius, paint);
        if (this.radius > getHeight() / this.rippleSize) {
            this.radius += this.rippleSpeed;
        }
        if (this.radius >= getWidth()) {
            this.x = -1.0f;
            this.y = -1.0f;
            this.radius = getHeight() / this.rippleSize;
            View.OnClickListener onClickListener = this.onClickListener;
            if (onClickListener != null && this.clickAfterRipple) {
                onClickListener.onClick(this);
            }
        }
        return createBitmap;
    }

    public int makePressColor() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fedbae8", new Object[]{this})).intValue();
        }
        int i2 = this.backgroundColor;
        int i3 = (i2 >> 8) & 255;
        int i4 = i2 & 255;
        int i5 = ((i2 >> 16) & 255) - 30;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = i3 - 30;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = i4 - 30;
        if (i7 >= 0) {
            i = i7;
        }
        return Color.rgb(i5, i6, i);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
        } else if (!z) {
            this.x = -1.0f;
            this.y = -1.0f;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        invalidate();
        if (isEnabled()) {
            this.isLastTouch = true;
            if (motionEvent.getAction() == 0) {
                this.radius = getHeight() / this.rippleSize;
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                this.radius = getHeight() / this.rippleSize;
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                if (motionEvent.getX() > getWidth() || motionEvent.getX() < 0.0f || motionEvent.getY() > getHeight() || motionEvent.getY() < 0.0f) {
                    this.isLastTouch = false;
                    this.x = -1.0f;
                    this.y = -1.0f;
                }
            } else if (motionEvent.getAction() == 1) {
                if (motionEvent.getX() > getWidth() || motionEvent.getX() < 0.0f || motionEvent.getY() > getHeight() || motionEvent.getY() < 0.0f) {
                    this.isLastTouch = false;
                    this.x = -1.0f;
                    this.y = -1.0f;
                } else {
                    this.radius += 1.0f;
                    if (!this.clickAfterRipple && (onClickListener = this.onClickListener) != null) {
                        onClickListener.onClick(this);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.isLastTouch = false;
                this.x = -1.0f;
                this.y = -1.0f;
            }
        }
        return true;
    }

    public abstract void setAttributes(AttributeSet attributeSet);

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.backgroundColor = i;
        if (isEnabled()) {
            this.beforeBackground = this.backgroundColor;
        }
        try {
            ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(R.id.shape_bacground)).setColor(this.backgroundColor);
            this.rippleColor = Integer.valueOf(makePressColor());
        } catch (Exception unused) {
        }
    }

    public void setDefaultProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a83e199", new Object[]{this});
            return;
        }
        setMinimumHeight(tyv.dpToPx(this.minHeight, getResources()));
        setMinimumWidth(tyv.dpToPx(this.minWidth, getResources()));
        setBackgroundResource(this.background);
        setBackgroundColor(this.backgroundColor);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.onClickListener = onClickListener;
        }
    }

    public void setRippleSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afc1b04", new Object[]{this, new Float(f)});
        } else {
            this.rippleSpeed = f;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.textButton.setText(str);
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textButton.setTextColor(i);
        }
    }
}
