package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResolutionAnchor extends ResolutionNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BARRIER_CONNECTION = 5;
    public static final int CENTER_CONNECTION = 2;
    public static final int CHAIN_CONNECTION = 4;
    public static final int DIRECT_CONNECTION = 1;
    public static final int MATCH_CONNECTION = 3;
    public static final int UNCONNECTED = 0;
    public float computedValue;
    public ConstraintAnchor myAnchor;
    public float offset;
    private ResolutionAnchor opposite;
    private float oppositeOffset;
    public float resolvedOffset;
    public ResolutionAnchor resolvedTarget;
    public ResolutionAnchor target;
    public int type = 0;
    private ResolutionDimension dimension = null;
    private int dimensionMultiplier = 1;
    private ResolutionDimension oppositeDimension = null;
    private int oppositeDimensionMultiplier = 1;

    public ResolutionAnchor(ConstraintAnchor constraintAnchor) {
        this.myAnchor = constraintAnchor;
    }

    public static /* synthetic */ Object ipc$super(ResolutionAnchor resolutionAnchor, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.reset();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/ResolutionAnchor");
    }

    public void addResolvedValue(LinearSystem linearSystem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439e8bb4", new Object[]{this, linearSystem});
            return;
        }
        SolverVariable solverVariable = this.myAnchor.getSolverVariable();
        ResolutionAnchor resolutionAnchor = this.resolvedTarget;
        if (resolutionAnchor == null) {
            linearSystem.addEquality(solverVariable, (int) (this.resolvedOffset + 0.5f));
        } else {
            linearSystem.addEquality(solverVariable, linearSystem.createObjectVariable(resolutionAnchor.myAnchor), (int) (this.resolvedOffset + 0.5f), 6);
        }
    }

    public void dependsOn(int i, ResolutionAnchor resolutionAnchor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd223c93", new Object[]{this, new Integer(i), resolutionAnchor, new Integer(i2)});
            return;
        }
        this.type = i;
        this.target = resolutionAnchor;
        this.offset = i2;
        resolutionAnchor.addDependent(this);
    }

    public float getResolvedValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29f0d79a", new Object[]{this})).floatValue();
        }
        return this.resolvedOffset;
    }

    @Override // androidx.constraintlayout.solver.widgets.ResolutionNode
    public void remove(ResolutionDimension resolutionDimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc116fa", new Object[]{this, resolutionDimension});
            return;
        }
        ResolutionDimension resolutionDimension2 = this.dimension;
        if (resolutionDimension2 == resolutionDimension) {
            this.dimension = null;
            this.offset = this.dimensionMultiplier;
        } else if (resolutionDimension2 == this.oppositeDimension) {
            this.oppositeDimension = null;
            this.oppositeOffset = this.oppositeDimensionMultiplier;
        }
        resolve();
    }

    @Override // androidx.constraintlayout.solver.widgets.ResolutionNode
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        this.target = null;
        this.offset = 0.0f;
        this.dimension = null;
        this.dimensionMultiplier = 1;
        this.oppositeDimension = null;
        this.oppositeDimensionMultiplier = 1;
        this.resolvedTarget = null;
        this.resolvedOffset = 0.0f;
        this.computedValue = 0.0f;
        this.opposite = null;
        this.oppositeOffset = 0.0f;
        this.type = 0;
    }

    public void resolve(ResolutionAnchor resolutionAnchor, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d753e0ed", new Object[]{this, resolutionAnchor, new Float(f)});
            return;
        }
        int i = this.state;
        if (i == 0 || !(this.resolvedTarget == resolutionAnchor || this.resolvedOffset == f)) {
            this.resolvedTarget = resolutionAnchor;
            this.resolvedOffset = f;
            if (i == 1) {
                invalidate();
            }
            didResolve();
        }
    }

    public void setOpposite(ResolutionAnchor resolutionAnchor, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b0cc6a", new Object[]{this, resolutionAnchor, new Float(f)});
            return;
        }
        this.opposite = resolutionAnchor;
        this.oppositeOffset = f;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        ConstraintAnchor target = this.myAnchor.getTarget();
        if (target != null) {
            if (target.getTarget() == this.myAnchor) {
                this.type = 4;
                target.getResolutionNode().type = 4;
            }
            int margin = this.myAnchor.getMargin();
            ConstraintAnchor.Type type = this.myAnchor.mType;
            if (type == ConstraintAnchor.Type.RIGHT || type == ConstraintAnchor.Type.BOTTOM) {
                margin = -margin;
            }
            dependsOn(target.getResolutionNode(), margin);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.state != 1) {
            return "{ " + this.myAnchor + " UNRESOLVED} type: " + sType(this.type);
        } else if (this.resolvedTarget == this) {
            return "[" + this.myAnchor + ", RESOLVED: " + this.resolvedOffset + "]  type: " + sType(this.type);
        } else {
            return "[" + this.myAnchor + ", RESOLVED: " + this.resolvedTarget + ":" + this.resolvedOffset + "] type: " + sType(this.type);
        }
    }

    public String sType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf67c351", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return "DIRECT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "MATCH";
        }
        if (i == 4) {
            return "CHAIN";
        }
        if (i == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }

    public void setOpposite(ResolutionAnchor resolutionAnchor, int i, ResolutionDimension resolutionDimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64da041c", new Object[]{this, resolutionAnchor, new Integer(i), resolutionDimension});
            return;
        }
        this.opposite = resolutionAnchor;
        this.oppositeDimension = resolutionDimension;
        this.oppositeDimensionMultiplier = i;
    }

    public void dependsOn(ResolutionAnchor resolutionAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a92560a", new Object[]{this, resolutionAnchor, new Integer(i)});
            return;
        }
        this.target = resolutionAnchor;
        this.offset = i;
        resolutionAnchor.addDependent(this);
    }

    @Override // androidx.constraintlayout.solver.widgets.ResolutionNode
    public void resolve() {
        int i;
        ResolutionAnchor resolutionAnchor;
        ResolutionAnchor resolutionAnchor2;
        ResolutionAnchor resolutionAnchor3;
        ResolutionAnchor resolutionAnchor4;
        ResolutionAnchor resolutionAnchor5;
        ResolutionAnchor resolutionAnchor6;
        ConstraintAnchor constraintAnchor;
        float f;
        float f2;
        float f3;
        ResolutionAnchor resolutionAnchor7;
        int i2 = 0;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74533073", new Object[]{this});
        } else if (this.state != 1 && (i = this.type) != 4) {
            ResolutionDimension resolutionDimension = this.dimension;
            if (resolutionDimension != null) {
                if (resolutionDimension.state == 1) {
                    this.offset = this.dimensionMultiplier * resolutionDimension.value;
                } else {
                    return;
                }
            }
            ResolutionDimension resolutionDimension2 = this.oppositeDimension;
            if (resolutionDimension2 != null) {
                if (resolutionDimension2.state == 1) {
                    this.oppositeOffset = this.oppositeDimensionMultiplier * resolutionDimension2.value;
                } else {
                    return;
                }
            }
            if (i == 1 && ((resolutionAnchor7 = this.target) == null || resolutionAnchor7.state == 1)) {
                if (resolutionAnchor7 == null) {
                    this.resolvedTarget = this;
                    this.resolvedOffset = this.offset;
                } else {
                    this.resolvedTarget = resolutionAnchor7.resolvedTarget;
                    this.resolvedOffset = resolutionAnchor7.resolvedOffset + this.offset;
                }
                didResolve();
            } else if (i == 2 && (resolutionAnchor4 = this.target) != null && resolutionAnchor4.state == 1 && (resolutionAnchor5 = this.opposite) != null && (resolutionAnchor6 = resolutionAnchor5.target) != null && resolutionAnchor6.state == 1) {
                if (LinearSystem.getMetrics() != null) {
                    LinearSystem.getMetrics().centerConnectionResolved++;
                }
                ResolutionAnchor resolutionAnchor8 = this.target;
                this.resolvedTarget = resolutionAnchor8.resolvedTarget;
                ResolutionAnchor resolutionAnchor9 = this.opposite;
                ResolutionAnchor resolutionAnchor10 = resolutionAnchor9.target;
                resolutionAnchor9.resolvedTarget = resolutionAnchor10.resolvedTarget;
                ConstraintAnchor.Type type = this.myAnchor.mType;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                if (!(type == type2 || type == ConstraintAnchor.Type.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = resolutionAnchor8.resolvedOffset - resolutionAnchor10.resolvedOffset;
                } else {
                    f = resolutionAnchor10.resolvedOffset - resolutionAnchor8.resolvedOffset;
                }
                if (type == ConstraintAnchor.Type.LEFT || type == type2) {
                    f3 = f - constraintAnchor.mOwner.getWidth();
                    f2 = this.myAnchor.mOwner.mHorizontalBiasPercent;
                } else {
                    f3 = f - constraintAnchor.mOwner.getHeight();
                    f2 = this.myAnchor.mOwner.mVerticalBiasPercent;
                }
                i2 = this.myAnchor.getMargin();
                int margin = this.opposite.myAnchor.getMargin();
                if (this.myAnchor.getTarget() == this.opposite.myAnchor.getTarget()) {
                    f2 = 0.5f;
                    margin = 0;
                }
                float f4 = i2;
                float f5 = margin;
                float f6 = (f3 - f4) - f5;
                if (z) {
                    ResolutionAnchor resolutionAnchor11 = this.opposite;
                    resolutionAnchor11.resolvedOffset = resolutionAnchor11.target.resolvedOffset + f5 + (f6 * f2);
                    this.resolvedOffset = (this.target.resolvedOffset - f4) - (f6 * (1.0f - f2));
                } else {
                    this.resolvedOffset = this.target.resolvedOffset + f4 + (f6 * f2);
                    ResolutionAnchor resolutionAnchor12 = this.opposite;
                    resolutionAnchor12.resolvedOffset = (resolutionAnchor12.target.resolvedOffset - f5) - (f6 * (1.0f - f2));
                }
                didResolve();
                this.opposite.didResolve();
            } else if (i == 3 && (resolutionAnchor = this.target) != null && resolutionAnchor.state == 1 && (resolutionAnchor2 = this.opposite) != null && (resolutionAnchor3 = resolutionAnchor2.target) != null && resolutionAnchor3.state == 1) {
                if (LinearSystem.getMetrics() != null) {
                    LinearSystem.getMetrics().matchConnectionResolved++;
                }
                ResolutionAnchor resolutionAnchor13 = this.target;
                this.resolvedTarget = resolutionAnchor13.resolvedTarget;
                ResolutionAnchor resolutionAnchor14 = this.opposite;
                ResolutionAnchor resolutionAnchor15 = resolutionAnchor14.target;
                resolutionAnchor14.resolvedTarget = resolutionAnchor15.resolvedTarget;
                this.resolvedOffset = resolutionAnchor13.resolvedOffset + this.offset;
                resolutionAnchor14.resolvedOffset = resolutionAnchor15.resolvedOffset + resolutionAnchor14.offset;
                didResolve();
                this.opposite.didResolve();
            } else if (i == 5) {
                this.myAnchor.mOwner.resolve();
            }
        }
    }

    public void dependsOn(ResolutionAnchor resolutionAnchor, int i, ResolutionDimension resolutionDimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6360db9", new Object[]{this, resolutionAnchor, new Integer(i), resolutionDimension});
            return;
        }
        this.target = resolutionAnchor;
        resolutionAnchor.addDependent(this);
        this.dimension = resolutionDimension;
        this.dimensionMultiplier = i;
        resolutionDimension.addDependent(this);
    }
}
