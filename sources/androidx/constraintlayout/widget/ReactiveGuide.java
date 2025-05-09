package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mAttributeId = -1;
    private boolean mAnimateChange = false;
    private int mApplyToConstraintSetId = 0;
    private boolean mApplyToAllConstraintSets = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        init(null);
    }

    private void changeValue(int i, int i2, MotionLayout motionLayout, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67287fc0", new Object[]{this, new Integer(i), new Integer(i2), motionLayout, new Integer(i3)});
            return;
        }
        ConstraintSet constraintSet = motionLayout.getConstraintSet(i3);
        constraintSet.setGuidelineEnd(i2, i);
        motionLayout.updateState(i3, constraintSet);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.mAttributeId = obtainStyledAttributes.getResourceId(index, this.mAttributeId);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.mAnimateChange = obtainStyledAttributes.getBoolean(index, this.mAnimateChange);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.mApplyToConstraintSetId = obtainStyledAttributes.getResourceId(index, this.mApplyToConstraintSetId);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.mApplyToAllConstraintSets = obtainStyledAttributes.getBoolean(index, this.mApplyToAllConstraintSets);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mAttributeId != -1) {
            ConstraintLayout.getSharedValues().addListener(this.mAttributeId, this);
        }
    }

    public static /* synthetic */ Object ipc$super(ReactiveGuide reactiveGuide, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/widget/ReactiveGuide");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        }
    }

    public int getApplyToConstraintSetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aff21867", new Object[]{this})).intValue();
        }
        return this.mApplyToConstraintSetId;
    }

    public int getAttributeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95b68f9b", new Object[]{this})).intValue();
        }
        return this.mAttributeId;
    }

    public boolean isAnimatingChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e8fe0af", new Object[]{this})).booleanValue();
        }
        return this.mAnimateChange;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setAnimateChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4581ebde", new Object[]{this, new Boolean(z)});
        } else {
            this.mAnimateChange = z;
        }
    }

    public void setApplyToConstraintSetId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56697483", new Object[]{this, new Integer(i)});
        } else {
            this.mApplyToConstraintSetId = i;
        }
    }

    public void setAttributeId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5186d67", new Object[]{this, new Integer(i)});
            return;
        }
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.mAttributeId;
        if (i2 != -1) {
            sharedValues.removeListener(i2, this);
        }
        this.mAttributeId = i;
        if (i != -1) {
            sharedValues.addListener(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30b21a1", new Object[]{this, new Integer(i)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194c5c2f", new Object[]{this, new Integer(i)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e4f0c2", new Object[]{this, new Float(f)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacd740c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        setGuidelineBegin(i2);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i5 = this.mApplyToConstraintSetId;
            if (i5 != 0) {
                currentState = i5;
            }
            if (this.mAnimateChange) {
                if (this.mApplyToAllConstraintSets) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i4 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i4];
                        if (i6 != currentState) {
                            changeValue(i2, id, motionLayout, i6);
                        }
                        i4++;
                    }
                }
                ConstraintSet cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                cloneConstraintSet.setGuidelineEnd(id, i2);
                motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
            } else if (this.mApplyToAllConstraintSets) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i4 < constraintSetIds2.length) {
                    changeValue(i2, id, motionLayout, constraintSetIds2[i4]);
                    i4++;
                }
            } else {
                changeValue(i2, id, motionLayout, currentState);
            }
        }
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        init(attributeSet);
    }
}
