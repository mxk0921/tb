package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.IGetBitmap;
import com.taobao.uikit.utils.FeatureSwitch;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ReusableImageShapeFeature extends ImageShapeFeature {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RoundRectShape = 1;
    public static final int RoundShape = 0;
    private float[] mCornerRadiusArray;
    private RectF mRectF;
    private Shape mShape;
    private Paint mStrokePaint;
    private Path mStrokePath;
    private final Matrix mMatrix = new Matrix();
    private boolean mIsRound = true;
    private boolean mStrokeEnable = false;
    private float mStrokeWidth = 0.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MyShapeDrawable extends ShapeDrawable {
        public MyShapeDrawable() {
        }

        public MyShapeDrawable(Shape shape) {
            super(shape);
        }
    }

    private Bitmap getBitmap(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b928da2e", new Object[]{this, drawable});
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof IGetBitmap) {
            return ((IGetBitmap) drawable).getBitmap();
        }
        return null;
    }

    private void initCornerRadius(TypedArray typedArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa30eb9", new Object[]{this, typedArray});
            return;
        }
        float dimension = typedArray.getDimension(R.styleable.ImageShapeFeature_uik_cornerRadius, 0.0f);
        float dimension2 = typedArray.getDimension(R.styleable.ImageShapeFeature_uik_topLeftRadius, dimension);
        float dimension3 = typedArray.getDimension(R.styleable.ImageShapeFeature_uik_bottomLeftRadius, dimension);
        float dimension4 = typedArray.getDimension(R.styleable.ImageShapeFeature_uik_topRightRadius, dimension);
        float dimension5 = typedArray.getDimension(R.styleable.ImageShapeFeature_uik_bottomRightRadius, dimension);
        this.mCornerRadiusArray = new float[]{dimension2, dimension2, dimension4, dimension4, dimension5, dimension5, dimension3, dimension3};
    }

    private void initShape(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5ff98b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.mShape = new OvalShape();
            T t = this.mHost;
            if (t != 0) {
                ((ImageView) t).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
            this.mIsRound = true;
        } else if (1 == i) {
            this.mShape = new RoundRectShape(this.mCornerRadiusArray, new RectF(0.0f, 0.0f, 0.0f, 0.0f), null);
            this.mIsRound = false;
        }
    }

    private void invalidateHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ImageView) t).invalidate();
        }
    }

    public static /* synthetic */ Object ipc$super(ReusableImageShapeFeature reusableImageShapeFeature, String str, Object... objArr) {
        if (str.hashCode() == 1274094891) {
            super.setHost((ImageView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/ReusableImageShapeFeature");
    }

    private void requestLayoutHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2de93e8", new Object[]{this});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((ImageView) t).requestLayout();
        }
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature, com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        } else if (this.mStrokeEnable) {
            canvas.drawPath(this.mStrokePath, this.mStrokePaint);
        }
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature, com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (z) {
            if (this.mIsRound) {
                int i5 = i3 - i;
                int i6 = i4 - i2;
                this.mStrokePath.addCircle(i5 * 0.5f, i6 * 0.5f, (Math.min(i5, i6) - this.mStrokeWidth) * 0.5f, Path.Direction.CCW);
            } else if (this.mCornerRadiusArray != null) {
                float f = this.mStrokeWidth * 0.5f;
                this.mRectF.set(f, f, (i3 - i) - f, (i4 - i2) - f);
                this.mStrokePath.addRoundRect(this.mRectF, this.mCornerRadiusArray, Path.Direction.CCW);
            }
            getHost().setImageDrawable(getHost().getDrawable());
        }
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature, com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        int i2 = tkt.DEFAULT_SHADOW_COLOR;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageShapeFeature, i, 0);
            int i3 = obtainStyledAttributes.getInt(R.styleable.ImageShapeFeature_uik_shapeType, 0);
            initCornerRadius(obtainStyledAttributes);
            initShape(i3);
            i2 = obtainStyledAttributes.getColor(R.styleable.ImageShapeFeature_uik_strokeColor, tkt.DEFAULT_SHADOW_COLOR);
            this.mStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.ImageShapeFeature_uik_strokeWidth, 0.0f);
            this.mStrokeEnable = obtainStyledAttributes.getBoolean(R.styleable.ImageShapeFeature_uik_strokeEnable, false);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.mStrokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setAntiAlias(true);
        this.mStrokePaint.setColor(i2);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        this.mStrokePath = new Path();
        this.mRectF = new RectF();
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setCornerRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d984d0", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.mCornerRadiusArray = new float[]{f, f, f2, f2, f4, f4, f3, f3};
        if (this.mShape instanceof RoundRectShape) {
            this.mShape = new RoundRectShape(this.mCornerRadiusArray, new RectF(0.0f, 0.0f, 0.0f, 0.0f), null);
            requestLayoutHost();
            invalidateHost();
        }
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setShape(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4530d25d", new Object[]{this, new Integer(i)});
            return;
        }
        initShape(i);
        requestLayoutHost();
        invalidateHost();
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setStrokeColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db15eb3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStrokePaint.setColor(i);
        invalidateHost();
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setStrokeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5955c5f0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mStrokeEnable = z;
        requestLayoutHost();
        invalidateHost();
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setStrokeWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
            return;
        }
        this.mStrokeWidth = f;
        this.mStrokePaint.setStrokeWidth(f);
        requestLayoutHost();
        invalidateHost();
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature, com.taobao.uikit.feature.callback.ImageCallback
    public Drawable wrapImageDrawable(Drawable drawable) {
        MyShapeDrawable myShapeDrawable;
        boolean z;
        float f;
        float f2;
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("442ee360", new Object[]{this, drawable});
        }
        if (getHost().getWidth() <= 0 && getHost().getHeight() <= 0) {
            return drawable;
        }
        Drawable drawable2 = getHost().getDrawable();
        if (drawable2 instanceof MyShapeDrawable) {
            myShapeDrawable = (MyShapeDrawable) drawable2;
        } else {
            myShapeDrawable = new MyShapeDrawable(this.mShape);
        }
        int width = getHost().getWidth();
        int height = getHost().getHeight();
        if (getHost().getLayoutParams() != null && (i = (layoutParams = getHost().getLayoutParams()).width) > 0 && (i2 = layoutParams.height) > 0) {
            height = i2;
            width = i;
        }
        if (FeatureSwitch.isRoundRectShowCompletelyOpen() && (height == 0 || width == 0)) {
            return drawable;
        }
        if (myShapeDrawable.getIntrinsicHeight() > 0 || myShapeDrawable.getIntrinsicWidth() > 0) {
            z = false;
        } else {
            z = true;
        }
        if ((myShapeDrawable.getIntrinsicHeight() == height && myShapeDrawable.getIntrinsicWidth() == width) || width <= 0 || height <= 0) {
            z2 = false;
        }
        if (z || z2) {
            if (this.mIsRound) {
                width = Math.min(width, height);
                height = width;
            }
            myShapeDrawable.setIntrinsicWidth(width);
            myShapeDrawable.setIntrinsicHeight(height);
        }
        if ((drawable instanceof BitmapDrawable) || (drawable instanceof IGetBitmap)) {
            Bitmap bitmap = getBitmap(drawable);
            if (bitmap != null) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                float f3 = 0.0f;
                if (width2 * height > height2 * width) {
                    f = height / height2;
                    f3 = (width - (width2 * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    f = width / width2;
                    f2 = (height - (height2 * f)) * 0.5f;
                }
                this.mMatrix.reset();
                this.mMatrix.setScale(f, f);
                this.mMatrix.postTranslate(f3 + 0.5f, f2 + 0.5f);
                bitmapShader.setLocalMatrix(this.mMatrix);
                myShapeDrawable.getPaint().reset();
                myShapeDrawable.getPaint().setShader(bitmapShader);
            } else {
                myShapeDrawable.getPaint().setShader(null);
            }
        } else if (!(drawable instanceof ColorDrawable)) {
            return drawable;
        } else {
            myShapeDrawable.getPaint().setShader(null);
            myShapeDrawable.getPaint().setColor(((ColorDrawable) drawable).getColor());
        }
        myShapeDrawable.invalidateSelf();
        return myShapeDrawable;
    }

    @Override // com.taobao.uikit.feature.features.ImageShapeFeature
    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
            return;
        }
        super.setHost(imageView);
        if (this.mShape instanceof OvalShape) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
    }
}
