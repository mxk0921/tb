package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Layer extends ConstraintHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    public ConstraintLayout mContainer;
    private float mRotationCenterX = Float.NaN;
    private float mRotationCenterY = Float.NaN;
    private float mGroupRotateAngle = Float.NaN;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    public float mComputedCenterX = Float.NaN;
    public float mComputedCenterY = Float.NaN;
    public float mComputedMaxX = Float.NaN;
    public float mComputedMaxY = Float.NaN;
    public float mComputedMinX = Float.NaN;
    public float mComputedMinY = Float.NaN;
    public boolean mNeedBounds = true;
    public View[] mViews = null;
    private float mShiftX = 0.0f;
    private float mShiftY = 0.0f;

    public Layer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(Layer layer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1832146921:
                super.init((AttributeSet) objArr[0]);
                return null;
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case 623635678:
                super.setElevation(((Number) objArr[0]).floatValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/helper/widget/Layer");
        }
    }

    private void reCacheViews() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5574ffa6", new Object[]{this});
        } else if (this.mContainer != null && (i = this.mCount) != 0) {
            View[] viewArr = this.mViews;
            if (viewArr == null || viewArr.length != i) {
                this.mViews = new View[i];
            }
            for (int i2 = 0; i2 < this.mCount; i2++) {
                this.mViews[i2] = this.mContainer.getViewById(this.mIds[i2]);
            }
        }
    }

    private void transform() {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999859f3", new Object[]{this});
        } else if (this.mContainer != null) {
            if (this.mViews == null) {
                reCacheViews();
            }
            calcCenters();
            if (Float.isNaN(this.mGroupRotateAngle)) {
                d = vu3.b.GEO_NOT_SUPPORT;
            } else {
                d = Math.toRadians(this.mGroupRotateAngle);
            }
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = this.mScaleX;
            float f2 = f * cos;
            float f3 = this.mScaleY;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.mCount; i++) {
                View view = this.mViews[i];
                float left = ((view.getLeft() + view.getRight()) / 2) - this.mComputedCenterX;
                float top = ((view.getTop() + view.getBottom()) / 2) - this.mComputedCenterY;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.mShiftX);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.mShiftY);
                view.setScaleY(this.mScaleY);
                view.setScaleX(this.mScaleX);
                if (!Float.isNaN(this.mGroupRotateAngle)) {
                    view.setRotation(this.mGroupRotateAngle);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950d11df", new Object[]{this, constraintLayout});
        } else {
            applyLayoutFeatures(constraintLayout);
        }
    }

    public void calcCenters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e98ab0", new Object[]{this});
        } else if (this.mContainer != null) {
            if (!(this.mNeedBounds || Float.isNaN(this.mComputedCenterX) || Float.isNaN(this.mComputedCenterY))) {
                return;
            }
            if (Float.isNaN(this.mRotationCenterX) || Float.isNaN(this.mRotationCenterY)) {
                View[] views = getViews(this.mContainer);
                int left = views[0].getLeft();
                int top = views[0].getTop();
                int right = views[0].getRight();
                int bottom = views[0].getBottom();
                for (int i = 0; i < this.mCount; i++) {
                    View view = views[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.mComputedMaxX = right;
                this.mComputedMaxY = bottom;
                this.mComputedMinX = left;
                this.mComputedMinY = top;
                if (Float.isNaN(this.mRotationCenterX)) {
                    this.mComputedCenterX = (left + right) / 2;
                } else {
                    this.mComputedCenterX = this.mRotationCenterX;
                }
                if (Float.isNaN(this.mRotationCenterY)) {
                    this.mComputedCenterY = (top + bottom) / 2;
                } else {
                    this.mComputedCenterY = this.mRotationCenterY;
                }
            } else {
                this.mComputedCenterY = this.mRotationCenterY;
                this.mComputedCenterX = this.mRotationCenterX;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.mApplyVisibilityOnAttach = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.mApplyElevationOnAttach = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                View viewById = this.mContainer.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.mApplyVisibilityOnAttach) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252becde", new Object[]{this, new Float(f)});
            return;
        }
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9afb7c1", new Object[]{this, new Float(f)});
            return;
        }
        this.mRotationCenterX = f;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb649060", new Object[]{this, new Float(f)});
            return;
        }
        this.mRotationCenterY = f;
        transform();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
            return;
        }
        this.mGroupRotateAngle = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        this.mScaleX = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            return;
        }
        this.mScaleY = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
            return;
        }
        this.mShiftX = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
            return;
        }
        this.mShiftY = f;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a25b217", new Object[]{this, constraintLayout});
            return;
        }
        reCacheViews();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        transform();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ef5cc", new Object[]{this, constraintLayout});
            return;
        }
        this.mContainer = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.mGroupRotateAngle = rotation;
        } else if (!Float.isNaN(this.mGroupRotateAngle)) {
            this.mGroupRotateAngle = rotation;
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
