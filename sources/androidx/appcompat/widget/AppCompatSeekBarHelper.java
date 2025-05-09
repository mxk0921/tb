package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable mTickMark;
    private final SeekBar mView;
    private ColorStateList mTickMarkTintList = null;
    private PorterDuff.Mode mTickMarkTintMode = null;
    private boolean mHasTickMarkTint = false;
    private boolean mHasTickMarkTintMode = false;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.mView = seekBar;
    }

    private void applyTickMarkTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146a7dba", new Object[]{this});
            return;
        }
        Drawable drawable = this.mTickMark;
        if (drawable == null) {
            return;
        }
        if (this.mHasTickMarkTint || this.mHasTickMarkTintMode) {
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            this.mTickMark = wrap;
            if (this.mHasTickMarkTint) {
                DrawableCompat.setTintList(wrap, this.mTickMarkTintList);
            }
            if (this.mHasTickMarkTintMode) {
                DrawableCompat.setTintMode(this.mTickMark, this.mTickMarkTintMode);
            }
            if (this.mTickMark.isStateful()) {
                this.mTickMark.setState(this.mView.getDrawableState());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AppCompatSeekBarHelper appCompatSeekBarHelper, String str, Object... objArr) {
        if (str.hashCode() == 1948509155) {
            super.loadFromAttributes((AttributeSet) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatSeekBarHelper");
    }

    public void drawTickMarks(Canvas canvas) {
        int max;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cf3219", new Object[]{this, canvas});
        } else if (this.mTickMark != null && (max = this.mView.getMax()) > 1) {
            int intrinsicWidth = this.mTickMark.getIntrinsicWidth();
            int intrinsicHeight = this.mTickMark.getIntrinsicHeight();
            if (intrinsicWidth >= 0) {
                i = intrinsicWidth / 2;
            } else {
                i = 1;
            }
            if (intrinsicHeight >= 0) {
                i2 = intrinsicHeight / 2;
            } else {
                i2 = 1;
            }
            this.mTickMark.setBounds(-i, -i2, i, i2);
            float width = ((this.mView.getWidth() - this.mView.getPaddingLeft()) - this.mView.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.mView.getPaddingLeft(), this.mView.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.mTickMark.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        Drawable drawable = this.mTickMark;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.mView.getDrawableState())) {
            this.mView.invalidateDrawable(drawable);
        }
    }

    public Drawable getTickMark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("674fc53", new Object[]{this});
        }
        return this.mTickMark;
    }

    public ColorStateList getTickMarkTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("f797adb4", new Object[]{this});
        }
        return this.mTickMarkTintList;
    }

    public PorterDuff.Mode getTickMarkTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("619c0b9c", new Object[]{this});
        }
        return this.mTickMarkTintMode;
    }

    public void jumpDrawablesToCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c74b21", new Object[]{this});
            return;
        }
        Drawable drawable = this.mTickMark;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423e3e3", new Object[]{this, attributeSet, new Integer(i)});
            return;
        }
        super.loadFromAttributes(attributeSet, i);
        Context context = this.mView.getContext();
        int[] iArr = R.styleable.AppCompatSeekBar;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.mView;
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.mView.setThumb(drawableIfKnown);
        }
        setTickMark(obtainStyledAttributes.getDrawable(R.styleable.AppCompatSeekBar_tickMark));
        int i2 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mTickMarkTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i2, -1), this.mTickMarkTintMode);
            this.mHasTickMarkTintMode = true;
        }
        int i3 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mTickMarkTintList = obtainStyledAttributes.getColorStateList(i3);
            this.mHasTickMarkTint = true;
        }
        obtainStyledAttributes.recycle();
        applyTickMarkTint();
    }

    public void setTickMark(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0808b7", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = this.mTickMark;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTickMark = drawable;
        if (drawable != null) {
            drawable.setCallback(this.mView);
            DrawableCompat.setLayoutDirection(drawable, this.mView.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.mView.getDrawableState());
            }
            applyTickMarkTint();
        }
        this.mView.invalidate();
    }

    public void setTickMarkTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e97d7c", new Object[]{this, mode});
            return;
        }
        this.mTickMarkTintMode = mode;
        this.mHasTickMarkTintMode = true;
        applyTickMarkTint();
    }

    public void setTickMarkTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dda16a", new Object[]{this, colorStateList});
            return;
        }
        this.mTickMarkTintList = colorStateList;
        this.mHasTickMarkTint = true;
        applyTickMarkTint();
    }
}
