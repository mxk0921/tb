package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.taobao.R;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionLabel extends View implements FloatLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    public static final String TAG = "MotionLabel";
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private String mFontFamily;
    private Layout mLayout;
    public Matrix mOutlinePositionMatrix;
    public float mPaintTextSize;
    public RectF mRect;
    private int mStyleIndex;
    public Paint mTempPaint;
    public Rect mTempRect;
    private Drawable mTextBackground;
    private Bitmap mTextBackgroundBitmap;
    private BitmapShader mTextShader;
    private Matrix mTextShaderMatrix;
    private int mTypefaceIndex;
    public ViewOutlineProvider mViewOutlineProvider;
    public TextPaint mPaint = new TextPaint();
    public Path mPath = new Path();
    private int mTextFillColor = 65535;
    private int mTextOutlineColor = 65535;
    private boolean mUseOutline = false;
    private float mRoundPercent = 0.0f;
    private float mRound = Float.NaN;
    private float mTextSize = 48.0f;
    private float mBaseTextSize = Float.NaN;
    private float mTextOutlineThickness = 0.0f;
    private String mText = "Hello World";
    public boolean mNotBuilt = true;
    private Rect mTextBounds = new Rect();
    private int mPaddingLeft = 1;
    private int mPaddingRight = 1;
    private int mPaddingTop = 1;
    private int mPaddingBottom = 1;
    private int mGravity = BadgeDrawable.TOP_START;
    private int mAutoSizeTextType = 0;
    private boolean mAutoSize = false;
    private float mTextureHeight = Float.NaN;
    private float mTextureWidth = Float.NaN;
    private float mTextPanX = 0.0f;
    private float mTextPanY = 0.0f;
    public Paint mPaintCache = new Paint();
    private int mTextureEffect = 0;
    public float mBackgroundPanX = Float.NaN;
    public float mBackgroundPanY = Float.NaN;
    public float mZoom = Float.NaN;
    public float mRotate = Float.NaN;

    public MotionLabel(Context context) {
        super(context);
        init(context, null);
    }

    public static /* synthetic */ float access$000(MotionLabel motionLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1795783", new Object[]{motionLabel})).floatValue();
        }
        return motionLabel.mRoundPercent;
    }

    public static /* synthetic */ float access$100(MotionLabel motionLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c22f2444", new Object[]{motionLabel})).floatValue();
        }
        return motionLabel.mRound;
    }

    private void adjustTexture(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534df393", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (this.mTextShaderMatrix != null) {
            this.mFloatWidth = f3 - f;
            this.mFloatHeight = f4 - f2;
            updateShaderMatrix();
        }
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("340faf44", new Object[]{this})).floatValue();
        }
        if (Float.isNaN(this.mBaseTextSize)) {
            f = 1.0f;
        } else {
            f = this.mTextSize / this.mBaseTextSize;
        }
        TextPaint textPaint = this.mPaint;
        String str = this.mText;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.mFloatWidth)) {
            f2 = getMeasuredWidth();
        } else {
            f2 = this.mFloatWidth;
        }
        return ((((f2 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.mTextPanX + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9752b196", new Object[]{this})).floatValue();
        }
        if (Float.isNaN(this.mBaseTextSize)) {
            f = 1.0f;
        } else {
            f = this.mTextSize / this.mBaseTextSize;
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        if (Float.isNaN(this.mFloatHeight)) {
            f2 = getMeasuredHeight();
        } else {
            f2 = this.mFloatHeight;
        }
        float paddingTop = (f2 - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.mTextPanY)) / 2.0f) - (f * f4);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.mFontFamily = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.mBaseTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mBaseTextSize);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.mTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mTextSize);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.mStyleIndex = obtainStyledAttributes.getInt(index, this.mStyleIndex);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.mTypefaceIndex = obtainStyledAttributes.getInt(index, this.mTypefaceIndex);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.mTextFillColor = obtainStyledAttributes.getColor(index, this.mTextFillColor);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.mRound);
                    this.mRound = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.mRoundPercent);
                    this.mRoundPercent = f;
                    setRoundPercent(f);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.mAutoSizeTextType = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.mTextOutlineColor = obtainStyledAttributes.getInt(index, this.mTextOutlineColor);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.mTextOutlineThickness = obtainStyledAttributes.getDimension(index, this.mTextOutlineThickness);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.mTextBackground = obtainStyledAttributes.getDrawable(index);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.mBackgroundPanX = obtainStyledAttributes.getFloat(index, this.mBackgroundPanX);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.mBackgroundPanY = obtainStyledAttributes.getFloat(index, this.mBackgroundPanY);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.mTextPanX = obtainStyledAttributes.getFloat(index, this.mTextPanX);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.mTextPanY = obtainStyledAttributes.getFloat(index, this.mTextPanY);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.mRotate = obtainStyledAttributes.getFloat(index, this.mRotate);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.mZoom = obtainStyledAttributes.getFloat(index, this.mZoom);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.mTextureHeight = obtainStyledAttributes.getDimension(index, this.mTextureHeight);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.mTextureWidth = obtainStyledAttributes.getDimension(index, this.mTextureWidth);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.mTextureEffect = obtainStyledAttributes.getInt(index, this.mTextureEffect);
                }
            }
            obtainStyledAttributes.recycle();
        }
        setupTexture();
        setupPath();
    }

    public static /* synthetic */ Object ipc$super(MotionLabel motionLabel, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 521290481) {
            super.layout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/utils/widget/MotionLabel");
        }
    }

    private void setTypefaceFromAttrs(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        int i3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87eeb9b0", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i3 = typeface2.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.mPaint;
            if ((i4 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.mPaint;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.mPaint.setFakeBoldText(false);
        this.mPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void setUpTheme(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1eb9375", new Object[]{this, context});
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.mPaint;
        int i = typedValue.data;
        this.mTextFillColor = i;
        textPaint.setColor(i);
    }

    private void setupTexture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b84165", new Object[]{this});
        } else if (this.mTextBackground != null) {
            this.mTextShaderMatrix = new Matrix();
            int intrinsicWidth = this.mTextBackground.getIntrinsicWidth();
            int intrinsicHeight = this.mTextBackground.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.mTextureWidth)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.mTextureWidth;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.mTextureHeight)) {
                    i = (int) this.mTextureHeight;
                }
                intrinsicHeight = i;
            }
            if (this.mTextureEffect != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.mTextBackgroundBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mTextBackgroundBitmap);
            this.mTextBackground.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.mTextBackground.setFilterBitmap(true);
            this.mTextBackground.draw(canvas);
            if (this.mTextureEffect != 0) {
                this.mTextBackgroundBitmap = blur(this.mTextBackgroundBitmap, 4);
            }
            Bitmap bitmap = this.mTextBackgroundBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.mTextShader = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void updateShaderMatrix() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f49876", new Object[]{this});
            return;
        }
        float f7 = 0.0f;
        if (Float.isNaN(this.mBackgroundPanX)) {
            f = 0.0f;
        } else {
            f = this.mBackgroundPanX;
        }
        if (Float.isNaN(this.mBackgroundPanY)) {
            f2 = 0.0f;
        } else {
            f2 = this.mBackgroundPanY;
        }
        if (Float.isNaN(this.mZoom)) {
            f3 = 1.0f;
        } else {
            f3 = this.mZoom;
        }
        if (!Float.isNaN(this.mRotate)) {
            f7 = this.mRotate;
        }
        this.mTextShaderMatrix.reset();
        float width = this.mTextBackgroundBitmap.getWidth();
        float height = this.mTextBackgroundBitmap.getHeight();
        if (Float.isNaN(this.mTextureWidth)) {
            f4 = this.mFloatWidth;
        } else {
            f4 = this.mTextureWidth;
        }
        if (Float.isNaN(this.mTextureHeight)) {
            f5 = this.mFloatHeight;
        } else {
            f5 = this.mTextureHeight;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.mTextShaderMatrix.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.mTextureHeight)) {
            f12 = this.mTextureHeight / 2.0f;
        }
        if (!Float.isNaN(this.mTextureWidth)) {
            f10 = this.mTextureWidth / 2.0f;
        }
        this.mTextShaderMatrix.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.mTextShaderMatrix.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.mTextShader.setLocalMatrix(this.mTextShaderMatrix);
    }

    public Bitmap blur(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("89a27061", new Object[]{this, bitmap, new Integer(i)});
        }
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    public void buildShape(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfeb226", new Object[]{this, new Float(f)});
        } else if (this.mUseOutline || f != 1.0f) {
            this.mPath.reset();
            String str = this.mText;
            int length = str.length();
            this.mPaint.getTextBounds(str, 0, length, this.mTextBounds);
            this.mPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.mPath);
            if (f != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(Debug.getLoc());
                sb.append(" scale ");
                sb.append(f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.mPath.transform(matrix);
            }
            Rect rect = this.mTextBounds;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.mNotBuilt = false;
        }
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

    public float getScaleFromTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50db30c3", new Object[]{this})).floatValue();
        }
        return this.mBaseTextSize;
    }

    public float getTextBackgroundPanX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c190d4a3", new Object[]{this})).floatValue();
        }
        return this.mBackgroundPanX;
    }

    public float getTextBackgroundPanY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c19eec24", new Object[]{this})).floatValue();
        }
        return this.mBackgroundPanY;
    }

    public float getTextBackgroundRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b2efe63", new Object[]{this})).floatValue();
        }
        return this.mRotate;
    }

    public float getTextBackgroundZoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7d0991b", new Object[]{this})).floatValue();
        }
        return this.mZoom;
    }

    public int getTextOutlineColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e52d7fe", new Object[]{this})).intValue();
        }
        return this.mTextOutlineColor;
    }

    public float getTextPanX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f588115", new Object[]{this})).floatValue();
        }
        return this.mTextPanX;
    }

    public float getTextPanY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f669896", new Object[]{this})).floatValue();
        }
        return this.mTextPanY;
    }

    public float getTextureHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52dffce3", new Object[]{this})).floatValue();
        }
        return this.mTextureHeight;
    }

    public float getTextureWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec269fd8", new Object[]{this})).floatValue();
        }
        return this.mTextureWidth;
    }

    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        return this.mPaint.getTypeface();
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1242f1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.mBaseTextSize);
        float f = isNaN ? 1.0f : this.mTextSize / this.mBaseTextSize;
        this.mFloatWidth = i3 - i;
        this.mFloatHeight = i4 - i2;
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int width = this.mTempRect.width();
            int height = (int) (this.mTempRect.height() * 1.3f);
            float f2 = (this.mFloatWidth - this.mPaddingRight) - this.mPaddingLeft;
            float f3 = (this.mFloatHeight - this.mPaddingBottom) - this.mPaddingTop;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.mPaint.setTextSize((this.mPaintTextSize * f2) / f4);
                } else {
                    this.mPaint.setTextSize((this.mPaintTextSize * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.mUseOutline || !isNaN) {
            adjustTexture(i, i2, i3, i4);
            buildShape(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (Float.isNaN(this.mBaseTextSize)) {
            f = 1.0f;
        } else {
            f = this.mTextSize / this.mBaseTextSize;
        }
        super.onDraw(canvas);
        if (this.mUseOutline || f != 1.0f) {
            if (this.mNotBuilt) {
                buildShape(f);
            }
            if (this.mOutlinePositionMatrix == null) {
                this.mOutlinePositionMatrix = new Matrix();
            }
            if (this.mUseOutline) {
                this.mPaintCache.set(this.mPaint);
                this.mOutlinePositionMatrix.reset();
                float horizontalOffset = this.mPaddingLeft + getHorizontalOffset();
                float verticalOffset = this.mPaddingTop + getVerticalOffset();
                this.mOutlinePositionMatrix.postTranslate(horizontalOffset, verticalOffset);
                this.mOutlinePositionMatrix.preScale(f, f);
                this.mPath.transform(this.mOutlinePositionMatrix);
                if (this.mTextShader != null) {
                    this.mPaint.setFilterBitmap(true);
                    this.mPaint.setShader(this.mTextShader);
                } else {
                    this.mPaint.setColor(this.mTextFillColor);
                }
                this.mPaint.setStyle(Paint.Style.FILL);
                this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
                canvas.drawPath(this.mPath, this.mPaint);
                if (this.mTextShader != null) {
                    this.mPaint.setShader(null);
                }
                this.mPaint.setColor(this.mTextOutlineColor);
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
                canvas.drawPath(this.mPath, this.mPaint);
                this.mOutlinePositionMatrix.reset();
                this.mOutlinePositionMatrix.postTranslate(-horizontalOffset, -verticalOffset);
                this.mPath.transform(this.mOutlinePositionMatrix);
                this.mPaint.set(this.mPaintCache);
                return;
            }
            float horizontalOffset2 = this.mPaddingLeft + getHorizontalOffset();
            float verticalOffset2 = this.mPaddingTop + getVerticalOffset();
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.preTranslate(horizontalOffset2, verticalOffset2);
            this.mPath.transform(this.mOutlinePositionMatrix);
            this.mPaint.setColor(this.mTextFillColor);
            this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.mPath.transform(this.mOutlinePositionMatrix);
            return;
        }
        canvas.drawText(this.mText, this.mDeltaLeft + this.mPaddingLeft + getHorizontalOffset(), this.mPaddingTop + getVerticalOffset(), this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.mAutoSize = false;
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.mPaint;
            String str = this.mText;
            textPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
            if (mode != 1073741824) {
                size = (int) (this.mTextBounds.width() + 0.99999f);
            }
            size += this.mPaddingLeft + this.mPaddingRight;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.mPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.mPaddingTop + this.mPaddingBottom + fontMetricsInt;
            }
        } else if (this.mAutoSizeTextType != 0) {
            this.mAutoSize = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
            return;
        }
        if ((i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i |= GravityCompat.START;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.mGravity) {
            invalidate();
        }
        this.mGravity = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.mTextPanY = -1.0f;
        } else if (i2 != 80) {
            this.mTextPanY = 0.0f;
        } else {
            this.mTextPanY = 1.0f;
        }
        int i3 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.mTextPanX = 0.0f;
                        return;
                    }
                }
            }
            this.mTextPanX = 1.0f;
            return;
        }
        this.mTextPanX = -1.0f;
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
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/utils/widget/MotionLabel$2");
                        }

                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            } else {
                                outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.access$100(MotionLabel.this));
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

    public void setScaleFromTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcceed59", new Object[]{this, new Float(f)});
        } else {
            this.mBaseTextSize = f;
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
            return;
        }
        this.mText = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ba0ee1", new Object[]{this, new Float(f)});
            return;
        }
        this.mBackgroundPanX = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ee780", new Object[]{this, new Float(f)});
            return;
        }
        this.mBackgroundPanY = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447d9021", new Object[]{this, new Float(f)});
            return;
        }
        this.mRotate = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5872d969", new Object[]{this, new Float(f)});
            return;
        }
        this.mZoom = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextFillColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1e624b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextFillColor = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b4ecc", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextOutlineColor = i;
        this.mUseOutline = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93042c98", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextOutlineThickness = f;
        this.mUseOutline = true;
        if (Float.isNaN(f)) {
            this.mTextOutlineThickness = 1.0f;
            this.mUseOutline = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8e71af", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextPanX = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0434a4e", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextPanY = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextSize = f;
        TextPaint textPaint = this.mPaint;
        if (!Float.isNaN(this.mBaseTextSize)) {
            f = this.mBaseTextSize;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.mBaseTextSize)) {
            f2 = 1.0f;
        } else {
            f2 = this.mTextSize / this.mBaseTextSize;
        }
        buildShape(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04b8b39", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextureHeight = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextureWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7443d14c", new Object[]{this, new Float(f)});
            return;
        }
        this.mTextureWidth = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else if (!Objects.equals(this.mPaint.getTypeface(), typeface)) {
            this.mPaint.setTypeface(typeface);
            if (this.mLayout != null) {
                this.mLayout = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public void setupPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76701fc9", new Object[]{this});
            return;
        }
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        setTypefaceFromAttrs(this.mFontFamily, this.mTypefaceIndex, this.mStyleIndex);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setFlags(128);
        setTextSize(this.mTextSize);
        this.mPaint.setAntiAlias(true);
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
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/utils/widget/MotionLabel$1");
                    }

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        int width = MotionLabel.this.getWidth();
                        int height = MotionLabel.this.getHeight();
                        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.access$000(MotionLabel.this)) / 2.0f);
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

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c80a31", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        int i = (int) (f + 0.5f);
        this.mDeltaLeft = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.mFloatWidth = f5;
        float f6 = f4 - f2;
        this.mFloatHeight = f6;
        adjustTexture(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.mPaintTextSize = this.mTempPaint.getTextSize();
            }
            this.mFloatWidth = f5;
            this.mFloatHeight = f6;
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            float height = this.mTempRect.height() * 1.3f;
            float f7 = (f5 - this.mPaddingRight) - this.mPaddingLeft;
            float f8 = (f6 - this.mPaddingBottom) - this.mPaddingTop;
            float width = this.mTempRect.width();
            if (width * f8 > height * f7) {
                this.mPaint.setTextSize((this.mPaintTextSize * f7) / width);
            } else {
                this.mPaint.setTextSize((this.mPaintTextSize * f8) / height);
            }
            if (this.mUseOutline || !Float.isNaN(this.mBaseTextSize)) {
                buildShape(Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize);
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
