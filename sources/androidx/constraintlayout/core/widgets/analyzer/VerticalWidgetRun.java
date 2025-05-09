package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VerticalWidgetRun extends WidgetRun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean FORCE_USE = true;
    public DependencyNode baseline;
    public DimensionDependency mBaselineDimension = null;

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.baseline = dependencyNode;
        this.start.mType = DependencyNode.Type.TOP;
        this.end.mType = DependencyNode.Type.BOTTOM;
        dependencyNode.mType = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    public static /* synthetic */ Object ipc$super(VerticalWidgetRun verticalWidgetRun, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/analyzer/VerticalWidgetRun");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            return;
        }
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget.measured) {
            this.mDimension.resolve(constraintWidget.getHeight());
        }
        if (!this.mDimension.resolved) {
            this.mDimensionBehavior = this.mWidget.getVerticalDimensionBehaviour();
            if (this.mWidget.hasBaseline()) {
                this.mBaselineDimension = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.mWidget.getParent()) != null && parent2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int height = (parent2.getHeight() - this.mWidget.mTop.getMargin()) - this.mWidget.mBottom.getMargin();
                    addTarget(this.start, parent2.mVerticalRun.start, this.mWidget.mTop.getMargin());
                    addTarget(this.end, parent2.mVerticalRun.end, -this.mWidget.mBottom.getMargin());
                    this.mDimension.resolve(height);
                    return;
                } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.mDimension.resolve(this.mWidget.getHeight());
                }
            }
        } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.mWidget.getParent()) != null && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.mVerticalRun.start, this.mWidget.mTop.getMargin());
            addTarget(this.end, parent.mVerticalRun.end, -this.mWidget.mBottom.getMargin());
            return;
        }
        DimensionDependency dimensionDependency = this.mDimension;
        boolean z = dimensionDependency.resolved;
        if (z) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[3].mTarget != null) {
                    if (constraintWidget2.isInVerticalChain()) {
                        this.start.mMargin = this.mWidget.mListAnchors[2].getMargin();
                        this.end.mMargin = -this.mWidget.mListAnchors[3].getMargin();
                    } else {
                        DependencyNode target = getTarget(this.mWidget.mListAnchors[2]);
                        if (target != null) {
                            addTarget(this.start, target, this.mWidget.mListAnchors[2].getMargin());
                        }
                        DependencyNode target2 = getTarget(this.mWidget.mListAnchors[3]);
                        if (target2 != null) {
                            addTarget(this.end, target2, -this.mWidget.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if (this.mWidget.hasBaseline()) {
                        addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.mWidget.mListAnchors[2].getMargin());
                        addTarget(this.end, this.start, this.mDimension.value);
                        if (this.mWidget.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.mTarget != null) {
                        DependencyNode target4 = getTarget(constraintAnchor3);
                        if (target4 != null) {
                            addTarget(this.end, target4, -this.mWidget.mListAnchors[3].getMargin());
                            addTarget(this.start, this.end, -this.mDimension.value);
                        }
                        if (this.mWidget.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.mTarget != null) {
                        DependencyNode target5 = getTarget(constraintAnchor4);
                        if (target5 != null) {
                            addTarget(this.baseline, target5, 0);
                            addTarget(this.start, this.baseline, -this.mWidget.getBaselineDistance());
                            addTarget(this.end, this.start, this.mDimension.value);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof Helper) && constraintWidget2.getParent() != null && this.mWidget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget == null) {
                        addTarget(this.start, this.mWidget.getParent().mVerticalRun.start, this.mWidget.getY());
                        addTarget(this.end, this.start, this.mDimension.value);
                        if (this.mWidget.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z || this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            dimensionDependency.addDependency(this);
        } else {
            ConstraintWidget constraintWidget3 = this.mWidget;
            int i = constraintWidget3.mMatchConstraintDefaultHeight;
            if (i == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    DimensionDependency dimensionDependency2 = parent3.mVerticalRun.mDimension;
                    this.mDimension.mTargets.add(dimensionDependency2);
                    dimensionDependency2.mDependencies.add(this.mDimension);
                    DimensionDependency dimensionDependency3 = this.mDimension;
                    dimensionDependency3.delegateToWidgetRun = true;
                    dimensionDependency3.mDependencies.add(this.start);
                    this.mDimension.mDependencies.add(this.end);
                }
            } else if (i == 3 && !constraintWidget3.isInVerticalChain()) {
                ConstraintWidget constraintWidget4 = this.mWidget;
                if (constraintWidget4.mMatchConstraintDefaultWidth != 3) {
                    DimensionDependency dimensionDependency4 = constraintWidget4.mHorizontalRun.mDimension;
                    this.mDimension.mTargets.add(dimensionDependency4);
                    dimensionDependency4.mDependencies.add(this.mDimension);
                    DimensionDependency dimensionDependency5 = this.mDimension;
                    dimensionDependency5.delegateToWidgetRun = true;
                    dimensionDependency5.mDependencies.add(this.start);
                    this.mDimension.mDependencies.add(this.end);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.mWidget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.mListAnchors;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].mTarget != null) {
            if (constraintWidget5.isInVerticalChain()) {
                this.start.mMargin = this.mWidget.mListAnchors[2].getMargin();
                this.end.mMargin = -this.mWidget.mListAnchors[3].getMargin();
            } else {
                DependencyNode target6 = getTarget(this.mWidget.mListAnchors[2]);
                DependencyNode target7 = getTarget(this.mWidget.mListAnchors[3]);
                if (target6 != null) {
                    target6.addDependency(this);
                }
                if (target7 != null) {
                    target7.addDependency(this);
                }
                this.mRunType = WidgetRun.RunType.CENTER;
            }
            if (this.mWidget.hasBaseline()) {
                addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode target8 = getTarget(constraintAnchor5);
            if (target8 != null) {
                addTarget(this.start, target8, this.mWidget.mListAnchors[2].getMargin());
                addTarget(this.end, this.start, 1, this.mDimension);
                if (this.mWidget.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mDimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.mWidget.getDimensionRatio() > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun = this.mWidget.mHorizontalRun;
                    if (horizontalWidgetRun.mDimensionBehavior == dimensionBehaviour3) {
                        horizontalWidgetRun.mDimension.mDependencies.add(this.mDimension);
                        this.mDimension.mTargets.add(this.mWidget.mHorizontalRun.mDimension);
                        this.mDimension.updateDelegate = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.mTarget != null) {
                DependencyNode target9 = getTarget(constraintAnchor7);
                if (target9 != null) {
                    addTarget(this.end, target9, -this.mWidget.mListAnchors[3].getMargin());
                    addTarget(this.start, this.end, -1, this.mDimension);
                    if (this.mWidget.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.mTarget != null) {
                    DependencyNode target10 = getTarget(constraintAnchor8);
                    if (target10 != null) {
                        addTarget(this.baseline, target10, 0);
                        addTarget(this.start, this.baseline, -1, this.mBaselineDimension);
                        addTarget(this.end, this.start, 1, this.mDimension);
                    }
                } else if (!(constraintWidget5 instanceof Helper) && constraintWidget5.getParent() != null) {
                    addTarget(this.start, this.mWidget.getParent().mVerticalRun.start, this.mWidget.getY());
                    addTarget(this.end, this.start, 1, this.mDimension);
                    if (this.mWidget.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.mDimensionBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.mWidget.getDimensionRatio() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun2 = this.mWidget.mHorizontalRun;
                        if (horizontalWidgetRun2.mDimensionBehavior == dimensionBehaviour5) {
                            horizontalWidgetRun2.mDimension.mDependencies.add(this.mDimension);
                            this.mDimension.mTargets.add(this.mWidget.mHorizontalRun.mDimension);
                            this.mDimension.updateDelegate = this;
                        }
                    }
                }
            }
        }
        if (this.mDimension.mTargets.size() == 0) {
            this.mDimension.readyToSolve = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f8c34", new Object[]{this});
            return;
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.mWidget.setY(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.mDimension.clear();
        this.mResolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mResolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.mDimension.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4837404", new Object[]{this})).booleanValue();
        }
        if (this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultHeight == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VerticalRun " + this.mWidget.getDebugName();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        DimensionDependency dimensionDependency;
        int i;
        float f;
        float dimensionRatio;
        float f2;
        ConstraintWidget constraintWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd43579", new Object[]{this, dependency});
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[this.mRunType.ordinal()];
        if (i2 == 1) {
            updateRunStart(dependency);
        } else if (i2 == 2) {
            updateRunEnd(dependency);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            updateRunCenter(dependency, constraintWidget2.mTop, constraintWidget2.mBottom, 1);
            return;
        }
        DimensionDependency dimensionDependency2 = this.mDimension;
        if (dimensionDependency2.readyToSolve && !dimensionDependency2.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.mWidget;
            int i3 = constraintWidget3.mMatchConstraintDefaultHeight;
            if (i3 == 2) {
                ConstraintWidget parent = constraintWidget3.getParent();
                if (parent != null) {
                    if (parent.mVerticalRun.mDimension.resolved) {
                        this.mDimension.resolve((int) ((dimensionDependency.value * this.mWidget.mMatchConstraintPercentHeight) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget3.mHorizontalRun.mDimension.resolved) {
                int dimensionRatioSide = constraintWidget3.getDimensionRatioSide();
                if (dimensionRatioSide == -1) {
                    ConstraintWidget constraintWidget4 = this.mWidget;
                    f = constraintWidget4.mHorizontalRun.mDimension.value;
                    dimensionRatio = constraintWidget4.getDimensionRatio();
                } else if (dimensionRatioSide == 0) {
                    f2 = constraintWidget.mHorizontalRun.mDimension.value * this.mWidget.getDimensionRatio();
                    i = (int) (f2 + 0.5f);
                    this.mDimension.resolve(i);
                } else if (dimensionRatioSide != 1) {
                    i = 0;
                    this.mDimension.resolve(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.mWidget;
                    f = constraintWidget5.mHorizontalRun.mDimension.value;
                    dimensionRatio = constraintWidget5.getDimensionRatio();
                }
                f2 = f / dimensionRatio;
                i = (int) (f2 + 0.5f);
                this.mDimension.resolve(i);
            }
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (!dependencyNode.resolved || !dependencyNode2.resolved || !this.mDimension.resolved) {
                    if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.mWidget;
                        if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInVerticalChain()) {
                            int i4 = this.start.mTargets.get(0).value;
                            DependencyNode dependencyNode3 = this.start;
                            int i5 = i4 + dependencyNode3.mMargin;
                            int i6 = this.end.mTargets.get(0).value + this.end.mMargin;
                            dependencyNode3.resolve(i5);
                            this.end.resolve(i6);
                            this.mDimension.resolve(i6 - i5);
                            return;
                        }
                    }
                    if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                        int i7 = (this.end.mTargets.get(0).value + this.end.mMargin) - (this.start.mTargets.get(0).value + this.start.mMargin);
                        DimensionDependency dimensionDependency3 = this.mDimension;
                        int i8 = dimensionDependency3.wrapValue;
                        if (i7 < i8) {
                            dimensionDependency3.resolve(i7);
                        } else {
                            dimensionDependency3.resolve(i8);
                        }
                    }
                    if (this.mDimension.resolved && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                        DependencyNode dependencyNode4 = this.start.mTargets.get(0);
                        DependencyNode dependencyNode5 = this.end.mTargets.get(0);
                        int i9 = dependencyNode4.value + this.start.mMargin;
                        int i10 = dependencyNode5.value + this.end.mMargin;
                        float verticalBiasPercent = this.mWidget.getVerticalBiasPercent();
                        if (dependencyNode4 == dependencyNode5) {
                            i9 = dependencyNode4.value;
                            i10 = dependencyNode5.value;
                            verticalBiasPercent = 0.5f;
                        }
                        this.start.resolve((int) (i9 + 0.5f + (((i10 - i9) - this.mDimension.value) * verticalBiasPercent)));
                        this.end.resolve(this.start.value + this.mDimension.value);
                    }
                }
            }
        }
    }
}
