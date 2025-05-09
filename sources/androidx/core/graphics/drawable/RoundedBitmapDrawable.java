package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class RoundedBitmapDrawable extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PAINT_FLAGS = 3;
    public final Bitmap mBitmap;
    private int mBitmapHeight;
    private final BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    private boolean mIsCircular;
    private int mTargetDensity;
    private int mGravity = 119;
    private final Paint mPaint = new Paint(3);
    private final Matrix mShaderMatrix = new Matrix();
    public final Rect mDstRect = new Rect();
    private final RectF mDstRectF = new RectF();
    private boolean mApplyGravity = true;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
        this.mTargetDensity = 160;
        if (resources != null) {
            this.mTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        this.mBitmap = bitmap;
        if (bitmap != null) {
            computeBitmapSize();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.mBitmapHeight = -1;
        this.mBitmapWidth = -1;
        this.mBitmapShader = null;
    }

    private void computeBitmapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05a6e", new Object[]{this});
            return;
        }
        this.mBitmapWidth = this.mBitmap.getScaledWidth(this.mTargetDensity);
        this.mBitmapHeight = this.mBitmap.getScaledHeight(this.mTargetDensity);
    }

    public static /* synthetic */ Object ipc$super(RoundedBitmapDrawable roundedBitmapDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/graphics/drawable/RoundedBitmapDrawable");
    }

    private static boolean isGreaterThanZero(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357b8844", new Object[]{new Float(f)})).booleanValue();
        }
        if (f > 0.05f) {
            return true;
        }
        return false;
    }

    private void updateCircularCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43347ef6", new Object[]{this});
        } else {
            this.mCornerRadius = Math.min(this.mBitmapHeight, this.mBitmapWidth) / 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            updateDstRect();
            if (this.mPaint.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.mDstRect, this.mPaint);
                return;
            }
            RectF rectF = this.mDstRectF;
            float f = this.mCornerRadius;
            canvas.drawRoundRect(rectF, f, f, this.mPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
        }
        return this.mPaint.getAlpha();
    }

    public final Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.mBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorFilter) ipChange.ipc$dispatch("65433e22", new Object[]{this});
        }
        return this.mPaint.getColorFilter();
    }

    public float getCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b4", new Object[]{this})).floatValue();
        }
        return this.mCornerRadius;
    }

    public int getGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue();
        }
        return this.mGravity;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return this.mBitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.mBitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        if (this.mGravity != 119 || this.mIsCircular || (bitmap = this.mBitmap) == null || bitmap.hasAlpha() || this.mPaint.getAlpha() < 255 || isGreaterThanZero(this.mCornerRadius)) {
            return -3;
        }
        return -1;
    }

    public final Paint getPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this});
        }
        return this.mPaint;
    }

    public void gravityCompatApply(int i, int i2, int i3, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7667887e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), rect, rect2});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean hasAntiAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("841ea51f", new Object[]{this})).booleanValue();
        }
        return this.mPaint.isAntiAlias();
    }

    public boolean hasMipMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f87d2d", new Object[]{this})).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743715f4", new Object[]{this})).booleanValue();
        }
        return this.mIsCircular;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        if (this.mIsCircular) {
            updateCircularCornerRadius();
        }
        this.mApplyGravity = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57261ce1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mPaint.setAntiAlias(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (this.mCornerRadius != f) {
            this.mIsCircular = false;
            if (isGreaterThanZero(f)) {
                this.mPaint.setShader(this.mBitmapShader);
            } else {
                this.mPaint.setShader(null);
            }
            this.mCornerRadius = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2271105", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mPaint.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b194884", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mPaint.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
        } else if (this.mGravity != i) {
            this.mGravity = i;
            this.mApplyGravity = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15d4403", new Object[]{this, new Boolean(z)});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setTargetDensity(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ac2e09", new Object[]{this, canvas});
        } else {
            setTargetDensity(canvas.getDensity());
        }
    }

    public void updateDstRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c4e8c7", new Object[]{this});
        } else if (this.mApplyGravity) {
            if (this.mIsCircular) {
                int min = Math.min(this.mBitmapWidth, this.mBitmapHeight);
                gravityCompatApply(this.mGravity, min, min, getBounds(), this.mDstRect);
                int min2 = Math.min(this.mDstRect.width(), this.mDstRect.height());
                this.mDstRect.inset(Math.max(0, (this.mDstRect.width() - min2) / 2), Math.max(0, (this.mDstRect.height() - min2) / 2));
                this.mCornerRadius = min2 * 0.5f;
            } else {
                gravityCompatApply(this.mGravity, this.mBitmapWidth, this.mBitmapHeight, getBounds(), this.mDstRect);
            }
            this.mDstRectF.set(this.mDstRect);
            if (this.mBitmapShader != null) {
                Matrix matrix = this.mShaderMatrix;
                RectF rectF = this.mDstRectF;
                matrix.setTranslate(rectF.left, rectF.top);
                this.mShaderMatrix.preScale(this.mDstRectF.width() / this.mBitmap.getWidth(), this.mDstRectF.height() / this.mBitmap.getHeight());
                this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
                this.mPaint.setShader(this.mBitmapShader);
            }
            this.mApplyGravity = false;
        }
    }

    public void setCircular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a326ac", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsCircular = z;
        this.mApplyGravity = true;
        if (z) {
            updateCircularCornerRadius();
            this.mPaint.setShader(this.mBitmapShader);
            invalidateSelf();
            return;
        }
        setCornerRadius(0.0f);
    }

    public void setTargetDensity(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67970457", new Object[]{this, displayMetrics});
        } else {
            setTargetDensity(displayMetrics.densityDpi);
        }
    }

    public void setTargetDensity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79693a7", new Object[]{this, new Integer(i)});
        } else if (this.mTargetDensity != i) {
            if (i == 0) {
                i = 160;
            }
            this.mTargetDensity = i;
            if (this.mBitmap != null) {
                computeBitmapSize();
            }
            invalidateSelf();
        }
    }
}
