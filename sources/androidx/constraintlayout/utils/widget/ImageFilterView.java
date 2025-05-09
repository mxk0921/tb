package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable mAltDrawable;
    private float mCrossfade;
    private Drawable mDrawable;
    private ImageMatrix mImageMatrix;
    public LayerDrawable mLayer;
    public Drawable[] mLayers;
    private boolean mOverlay;
    public float mPanX;
    public float mPanY;
    private Path mPath;
    public RectF mRect;
    public float mRotate;
    private float mRound;
    private float mRoundPercent;
    public ViewOutlineProvider mViewOutlineProvider;
    public float mZoom;

    public ImageFilterView(Context context) {
        super(context);
        this.mImageMatrix = new ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, null);
    }

    public static /* synthetic */ float access$000(ImageFilterView imageFilterView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6b20fa9", new Object[]{imageFilterView})).floatValue();
        }
        return imageFilterView.mRoundPercent;
    }

    public static /* synthetic */ float access$100(ImageFilterView imageFilterView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba4193ea", new Object[]{imageFilterView})).floatValue();
        }
        return imageFilterView.mRound;
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.mAltDrawable = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.mCrossfade = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.mOverlay));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.mPanX));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.mPanY));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.mRotate));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.mZoom));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.mDrawable = drawable;
            if (this.mAltDrawable == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.mDrawable = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.mLayers;
                    Drawable mutate = drawable2.mutate();
                    this.mDrawable = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.mLayers;
            Drawable mutate2 = getDrawable().mutate();
            this.mDrawable = mutate2;
            drawableArr2[0] = mutate2;
            this.mLayers[1] = this.mAltDrawable.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            super.setImageDrawable(this.mLayer);
        }
    }

    public static /* synthetic */ Object ipc$super(ImageFilterView imageFilterView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -974402955:
                super.setImageResource(((Number) objArr[0]).intValue());
                return null;
            case 521290481:
                super.layout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/utils/widget/ImageFilterView");
        }
    }

    private void setMatrix() {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80459ca", new Object[]{this});
        } else if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            float f5 = 0.0f;
            if (Float.isNaN(this.mPanX)) {
                f = 0.0f;
            } else {
                f = this.mPanX;
            }
            if (Float.isNaN(this.mPanY)) {
                f2 = 0.0f;
            } else {
                f2 = this.mPanY;
            }
            if (Float.isNaN(this.mZoom)) {
                f3 = 1.0f;
            } else {
                f3 = this.mZoom;
            }
            if (!Float.isNaN(this.mRotate)) {
                f5 = this.mRotate;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            float width = getWidth();
            float height = getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f4 = width / intrinsicWidth;
            } else {
                f4 = height / intrinsicHeight;
            }
            float f6 = f3 * f4;
            matrix.postScale(f6, f6);
            float f7 = intrinsicWidth * f6;
            float f8 = f6 * intrinsicHeight;
            matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
            matrix.postRotate(f5, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    private void setOverlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5713a5f", new Object[]{this, new Boolean(z)});
        } else {
            this.mOverlay = z;
        }
    }

    private void updateViewMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09a9176", new Object[]{this});
        } else if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            setMatrix();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else {
            super.draw(canvas);
        }
    }

    public float getBrightness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ceed3e", new Object[]{this})).floatValue();
        }
        return this.mImageMatrix.mBrightness;
    }

    public float getContrast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2897d8ef", new Object[]{this})).floatValue();
        }
        return this.mImageMatrix.mContrast;
    }

    public float getCrossfade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d49d17d", new Object[]{this})).floatValue();
        }
        return this.mCrossfade;
    }

    public float getImagePanX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d320117", new Object[]{this})).floatValue();
        }
        return this.mPanX;
    }

    public float getImagePanY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d401898", new Object[]{this})).floatValue();
        }
        return this.mPanY;
    }

    public float getImageRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9336ddd7", new Object[]{this})).floatValue();
        }
        return this.mRotate;
    }

    public float getImageZoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4371c58f", new Object[]{this})).floatValue();
        }
        return this.mZoom;
    }

    public float getRound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff0e304f", new Object[]{this})).floatValue();
        }
        return this.mRound;
    }

    public float getRoundPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8500b744", new Object[]{this})).floatValue();
        }
        return this.mRoundPercent;
    }

    public float getSaturation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc8a143f", new Object[]{this})).floatValue();
        }
        return this.mImageMatrix.mSaturation;
    }

    public float getWarmth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e60cba6", new Object[]{this})).floatValue();
        }
        return this.mImageMatrix.mWarmth;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1242f1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.layout(i, i2, i3, i4);
        setMatrix();
    }

    public void setAltImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26bc69d", new Object[]{this, drawable});
            return;
        }
        Drawable mutate = drawable.mutate();
        this.mAltDrawable = mutate;
        Drawable[] drawableArr = this.mLayers;
        drawableArr[0] = this.mDrawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
        this.mLayer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.mCrossfade);
    }

    public void setAltImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1455e8ba", new Object[]{this, new Integer(i)});
            return;
        }
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i);
        this.mAltDrawable = drawable;
        setAltImageDrawable(drawable);
    }

    public void setBrightness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be5bda6", new Object[]{this, new Float(f)});
            return;
        }
        ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mBrightness = f;
        imageMatrix.updateMatrix(this);
    }

    public void setContrast(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3a1515", new Object[]{this, new Float(f)});
            return;
        }
        ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mContrast = f;
        imageMatrix.updateMatrix(this);
    }

    public void setCrossfade(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e72fdf", new Object[]{this, new Float(f)});
            return;
        }
        this.mCrossfade = f;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else if (this.mAltDrawable == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            Drawable mutate = drawable.mutate();
            this.mDrawable = mutate;
            Drawable[] drawableArr = this.mLayers;
            drawableArr[0] = mutate;
            drawableArr[1] = this.mAltDrawable;
            LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.mCrossfade);
        }
    }

    public void setImagePanX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2104f385", new Object[]{this, new Float(f)});
            return;
        }
        this.mPanX = f;
        updateViewMatrix();
    }

    public void setImagePanY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b9cc24", new Object[]{this, new Float(f)});
            return;
        }
        this.mPanY = f;
        updateViewMatrix();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
        } else if (this.mAltDrawable != null) {
            Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
            this.mDrawable = mutate;
            Drawable[] drawableArr = this.mLayers;
            drawableArr[0] = mutate;
            drawableArr[1] = this.mAltDrawable;
            LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.mCrossfade);
        } else {
            super.setImageResource(i);
        }
    }

    public void setImageRotate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a1dbc5", new Object[]{this, new Float(f)});
            return;
        }
        this.mRotate = f;
        updateViewMatrix();
    }

    public void setImageZoom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bdbe0d", new Object[]{this, new Float(f)});
            return;
        }
        this.mZoom = f;
        updateViewMatrix();
    }

    public void setRound(float f) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dc914d", new Object[]{this, new Float(f)});
        } else if (Float.isNaN(f)) {
            this.mRound = f;
            float f2 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f2);
        } else {
            if (this.mRound != f) {
                z = true;
            } else {
                z = false;
            }
            this.mRound = f;
            if (f != 0.0f) {
                if (this.mPath == null) {
                    this.mPath = new Path();
                }
                if (this.mRect == null) {
                    this.mRect = new RectF();
                }
                if (this.mViewOutlineProvider == null) {
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/utils/widget/ImageFilterView$2");
                        }

                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            } else {
                                outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.access$100(ImageFilterView.this));
                            }
                        }
                    };
                    this.mViewOutlineProvider = viewOutlineProvider;
                    setOutlineProvider(viewOutlineProvider);
                }
                setClipToOutline(true);
                this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
                this.mPath.reset();
                Path path = this.mPath;
                RectF rectF = this.mRect;
                float f3 = this.mRound;
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            } else {
                setClipToOutline(false);
            }
            if (z) {
                invalidateOutline();
            }
        }
    }

    public void setSaturation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f76c5", new Object[]{this, new Float(f)});
            return;
        }
        ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mSaturation = f;
        imageMatrix.updateMatrix(this);
    }

    public void setWarmth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241e863e", new Object[]{this, new Float(f)});
            return;
        }
        ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mWarmth = f;
        imageMatrix.updateMatrix(this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ImageMatrix {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float[] mMatrix = new float[20];
        public ColorMatrix mColorMatrix = new ColorMatrix();
        public ColorMatrix mTmpColorMatrix = new ColorMatrix();
        public float mBrightness = 1.0f;
        public float mSaturation = 1.0f;
        public float mContrast = 1.0f;
        public float mWarmth = 1.0f;

        private void brightness(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50ad5268", new Object[]{this, new Float(f)});
                return;
            }
            float[] fArr = this.mMatrix;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void warmth(float f) {
            float f2;
            float f3;
            float f4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e2cc00", new Object[]{this, new Float(f)});
                return;
            }
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f5 = (5000.0f / f) / 100.0f;
            if (f5 > 66.0f) {
                double d = f5 - 60.0f;
                f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f3 = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                f3 = (((float) Math.log(f5)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            if (f5 >= 66.0f) {
                f4 = 255.0f;
            } else if (f5 > 19.0f) {
                f4 = (((float) Math.log(f5 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                f4 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f2, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f3, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f4, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.mMatrix;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void updateMatrix(ImageView imageView) {
            boolean z = true;
            z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df5071eb", new Object[]{this, imageView});
                return;
            }
            this.mColorMatrix.reset();
            float f = this.mSaturation;
            if (f != 1.0f) {
                saturation(f);
                this.mColorMatrix.set(this.mMatrix);
                z = true;
            }
            float f2 = this.mContrast;
            if (f2 != 1.0f) {
                this.mTmpColorMatrix.setScale(f2, f2, f2, 1.0f);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                z = true;
            }
            float f3 = this.mWarmth;
            if (f3 != 1.0f) {
                warmth(f3);
                this.mTmpColorMatrix.set(this.mMatrix);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                z = true;
            }
            float f4 = this.mBrightness;
            if (f4 != 1.0f) {
                brightness(f4);
                this.mTmpColorMatrix.set(this.mMatrix);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
            }
            if (z) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.mColorMatrix));
            } else {
                imageView.clearColorFilter();
            }
        }

        private void saturation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0570b87", new Object[]{this, new Float(f)});
                return;
            }
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.mMatrix;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public void setRoundPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aca760", new Object[]{this, new Float(f)});
            return;
        }
        boolean z = this.mRoundPercent != f;
        this.mRoundPercent = f;
        if (f != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/utils/widget/ImageFilterView$1");
                    }

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        int width = ImageFilterView.this.getWidth();
                        int height = ImageFilterView.this.getHeight();
                        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.access$000(ImageFilterView.this)) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mImageMatrix = new ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mImageMatrix = new ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }
}
