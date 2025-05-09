package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Barrier extends Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private int mBarrierType = 0;
    private ArrayList<ResolutionAnchor> mNodes = new ArrayList<>(4);
    private boolean mAllowsGoneWidget = true;

    public static /* synthetic */ Object ipc$super(Barrier barrier, String str, Object... objArr) {
        if (str.hashCode() == -876334691) {
            super.resetResolutionNodes();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/Barrier");
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284ea55d", new Object[]{this, linearSystem});
            return;
        }
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i3 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i3 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            i3++;
        }
        int i4 = this.mBarrierType;
        if (i4 >= 0 && i4 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i4];
            for (int i5 = 0; i5 < this.mWidgetsCount; i5++) {
                ConstraintWidget constraintWidget = this.mWidgets[i5];
                if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i = this.mBarrierType) == 0 || i == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (((i2 = this.mBarrierType) == 2 || i2 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))) {
                    z = true;
                    break;
                }
            }
            z = false;
            int i6 = this.mBarrierType;
            if (i6 == 0 || i6 == 1 ? getParent().getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : getParent().getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.mWidgetsCount; i7++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i7];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                    int i8 = this.mBarrierType;
                    constraintAnchorArr3[i8].mSolverVariable = createObjectVariable;
                    if (i8 == 0 || i8 == 2) {
                        linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, z);
                    } else {
                        linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, z);
                    }
                }
            }
            int i9 = this.mBarrierType;
            if (i9 == 0) {
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 5);
                }
            } else if (i9 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 5);
                }
            } else if (i9 == 2) {
                linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 5);
                }
            } else if (i9 == 3) {
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 6);
                if (!z) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 5);
                }
            }
        }
    }

    public boolean allowsGoneWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("281747b8", new Object[]{this})).booleanValue();
        }
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void resetResolutionNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc4319d", new Object[]{this});
            return;
        }
        super.resetResolutionNodes();
        this.mNodes.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void resolve() {
        ResolutionAnchor resolutionAnchor;
        float f;
        ResolutionAnchor resolutionAnchor2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74533073", new Object[]{this});
            return;
        }
        int i = this.mBarrierType;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                resolutionAnchor = this.mRight.getResolutionNode();
            } else if (i == 2) {
                resolutionAnchor = this.mTop.getResolutionNode();
            } else if (i == 3) {
                resolutionAnchor = this.mBottom.getResolutionNode();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            resolutionAnchor = this.mLeft.getResolutionNode();
        }
        int size = this.mNodes.size();
        ResolutionAnchor resolutionAnchor3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            ResolutionAnchor resolutionAnchor4 = this.mNodes.get(i2);
            if (resolutionAnchor4.state == 1) {
                int i3 = this.mBarrierType;
                if (i3 == 0 || i3 == 2) {
                    f = resolutionAnchor4.resolvedOffset;
                    if (f < f2) {
                        resolutionAnchor2 = resolutionAnchor4.resolvedTarget;
                        resolutionAnchor3 = resolutionAnchor2;
                        f2 = f;
                    }
                } else {
                    f = resolutionAnchor4.resolvedOffset;
                    if (f > f2) {
                        resolutionAnchor2 = resolutionAnchor4.resolvedTarget;
                        resolutionAnchor3 = resolutionAnchor2;
                        f2 = f;
                    }
                }
            } else {
                return;
            }
        }
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().barrierConnectionResolved++;
        }
        resolutionAnchor.resolvedTarget = resolutionAnchor3;
        resolutionAnchor.resolvedOffset = f2;
        resolutionAnchor.didResolve();
        int i4 = this.mBarrierType;
        if (i4 == 0) {
            this.mRight.getResolutionNode().resolve(resolutionAnchor3, f2);
        } else if (i4 == 1) {
            this.mLeft.getResolutionNode().resolve(resolutionAnchor3, f2);
        } else if (i4 == 2) {
            this.mBottom.getResolutionNode().resolve(resolutionAnchor3, f2);
        } else if (i4 == 3) {
            this.mTop.getResolutionNode().resolve(resolutionAnchor3, f2);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b690e65e", new Object[]{this, new Boolean(z)});
        } else {
            this.mAllowsGoneWidget = z;
        }
    }

    public void setBarrierType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf491aed", new Object[]{this, new Integer(i)});
        } else {
            this.mBarrierType = i;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eac6f595", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void analyze(int i) {
        ResolutionAnchor resolutionAnchor;
        ResolutionAnchor resolutionAnchor2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff629190", new Object[]{this, new Integer(i)});
            return;
        }
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && ((ConstraintWidgetContainer) constraintWidget).optimizeFor(2)) {
            int i2 = this.mBarrierType;
            if (i2 == 0) {
                resolutionAnchor = this.mLeft.getResolutionNode();
            } else if (i2 == 1) {
                resolutionAnchor = this.mRight.getResolutionNode();
            } else if (i2 == 2) {
                resolutionAnchor = this.mTop.getResolutionNode();
            } else if (i2 == 3) {
                resolutionAnchor = this.mBottom.getResolutionNode();
            } else {
                return;
            }
            resolutionAnchor.setType(5);
            int i3 = this.mBarrierType;
            if (i3 == 0 || i3 == 1) {
                this.mTop.getResolutionNode().resolve(null, 0.0f);
                this.mBottom.getResolutionNode().resolve(null, 0.0f);
            } else {
                this.mLeft.getResolutionNode().resolve(null, 0.0f);
                this.mRight.getResolutionNode().resolve(null, 0.0f);
            }
            this.mNodes.clear();
            for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i4];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    int i5 = this.mBarrierType;
                    if (i5 == 0) {
                        resolutionAnchor2 = constraintWidget2.mLeft.getResolutionNode();
                    } else if (i5 == 1) {
                        resolutionAnchor2 = constraintWidget2.mRight.getResolutionNode();
                    } else if (i5 != 2) {
                        resolutionAnchor2 = i5 != 3 ? null : constraintWidget2.mBottom.getResolutionNode();
                    } else {
                        resolutionAnchor2 = constraintWidget2.mTop.getResolutionNode();
                    }
                    if (resolutionAnchor2 != null) {
                        this.mNodes.add(resolutionAnchor2);
                        resolutionAnchor2.addDependent(resolutionAnchor);
                    }
                }
            }
        }
    }
}
