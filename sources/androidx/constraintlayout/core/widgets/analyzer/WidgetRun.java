package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class WidgetRun implements Dependency {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    public RunGroup mRunGroup;
    public ConstraintWidget mWidget;
    public int matchConstraintsType;
    public DimensionDependency mDimension = new DimensionDependency(this);
    public int orientation = 0;
    public boolean mResolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    public RunType mRunType = RunType.NONE;

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class RunType extends Enum<RunType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final RunType NONE = new RunType("NONE", 0);
        public static final RunType START = new RunType("START", 1);
        public static final RunType END = new RunType("END", 2);
        public static final RunType CENTER = new RunType("CENTER", 3);
        private static final /* synthetic */ RunType[] $VALUES = $values();

        private static /* synthetic */ RunType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RunType[]) ipChange.ipc$dispatch("ad10a8a8", new Object[0]) : new RunType[]{NONE, START, END, CENTER};
        }

        private RunType(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(RunType runType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/analyzer/WidgetRun$RunType");
        }

        public static RunType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunType) ipChange.ipc$dispatch("9a8b705d", new Object[]{str});
            }
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunType[]) ipChange.ipc$dispatch("28e12e4c", new Object[0]);
            }
            return (RunType[]) $VALUES.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.mWidget = constraintWidget;
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127dd3c", new Object[]{this, dependencyNode, dependencyNode2, new Integer(i)});
            return;
        }
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mMargin = i;
        dependencyNode2.mDependencies.add(dependencyNode);
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b2d9fc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.mWidget;
            int i4 = constraintWidget.mMatchConstraintMaxWidth;
            i3 = Math.max(constraintWidget.mMatchConstraintMinWidth, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i5 = constraintWidget2.mMatchConstraintMaxHeight;
            i3 = Math.max(constraintWidget2.mMatchConstraintMinHeight, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DependencyNode) ipChange.ipc$dispatch("d0b3734a", new Object[]{this, constraintAnchor});
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (i == 2) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (i == 3) {
            return constraintWidget.mVerticalRun.start;
        }
        if (i == 4) {
            return constraintWidget.mVerticalRun.baseline;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.end;
    }

    public long getWrapDimension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d9fe01", new Object[]{this})).longValue();
        }
        DimensionDependency dimensionDependency = this.mDimension;
        if (dimensionDependency.resolved) {
            return dimensionDependency.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef74c68", new Object[]{this})).booleanValue();
        }
        int size = this.start.mTargets.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.start.mTargets.get(i2).mRun != this) {
                i++;
            }
        }
        int size2 = this.end.mTargets.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.end.mTargets.get(i3).mRun != this) {
                i++;
            }
        }
        if (i >= 2) {
            return true;
        }
        return false;
    }

    public boolean isDimensionResolved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc5a5dff", new Object[]{this})).booleanValue();
        }
        return this.mDimension.resolved;
    }

    public boolean isResolved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebad76cd", new Object[]{this})).booleanValue();
        }
        return this.mResolved;
    }

    public abstract void reset();

    public abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd43579", new Object[]{this, dependency});
        }
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959d0fdc", new Object[]{this, dependency, constraintAnchor, constraintAnchor2, new Integer(i)});
            return;
        }
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i, i2);
            }
            DimensionDependency dimensionDependency = this.mDimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i2) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                if (i == 0) {
                    f = this.mWidget.getHorizontalBiasPercent();
                } else {
                    f = this.mWidget.getVerticalBiasPercent();
                }
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    f = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.mDimension.value) * f)));
                this.end.resolve(this.start.value + this.mDimension.value);
            }
        }
    }

    public void updateRunEnd(Dependency dependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a6d29", new Object[]{this, dependency});
        }
    }

    public void updateRunStart(Dependency dependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f48130", new Object[]{this, dependency});
        }
    }

    public long wrapSize(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29057ac5", new Object[]{this, new Integer(i)})).longValue();
        }
        DimensionDependency dimensionDependency = this.mDimension;
        if (!dimensionDependency.resolved) {
            return 0L;
        }
        long j = dimensionDependency.value;
        if (isCenterConnection()) {
            i2 = this.start.mMargin - this.end.mMargin;
        } else if (i != 0) {
            return j - this.end.mMargin;
        } else {
            i2 = this.start.mMargin;
        }
        return j + i2;
    }

    private void resolveDimension(int i, int i2) {
        WidgetRun widgetRun;
        float f;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb6c881", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = this.matchConstraintsType;
        if (i4 == 0) {
            this.mDimension.resolve(getLimitedDimension(i2, i));
        } else if (i4 == 1) {
            this.mDimension.resolve(Math.min(getLimitedDimension(this.mDimension.wrapValue, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget parent = this.mWidget.getParent();
            if (parent != null) {
                if (i == 0) {
                    widgetRun = parent.mHorizontalRun;
                } else {
                    widgetRun = parent.mVerticalRun;
                }
                DimensionDependency dimensionDependency = widgetRun.mDimension;
                if (dimensionDependency.resolved) {
                    if (i == 0) {
                        f = this.mWidget.mMatchConstraintPercentWidth;
                    } else {
                        f = this.mWidget.mMatchConstraintPercentHeight;
                    }
                    this.mDimension.resolve(getLimitedDimension((int) ((dimensionDependency.value * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            ConstraintWidget constraintWidget = this.mWidget;
            WidgetRun widgetRun2 = constraintWidget.mHorizontalRun;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.mDimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.matchConstraintsType == 3) {
                VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                if (verticalWidgetRun.mDimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                    return;
                }
            }
            if (i == 0) {
                widgetRun2 = constraintWidget.mVerticalRun;
            }
            if (widgetRun2.mDimension.resolved) {
                float dimensionRatio = constraintWidget.getDimensionRatio();
                if (i == 1) {
                    i3 = (int) ((widgetRun2.mDimension.value / dimensionRatio) + 0.5f);
                } else {
                    i3 = (int) ((dimensionRatio * widgetRun2.mDimension.value) + 0.5f);
                }
                this.mDimension.resolve(i3);
            }
        }
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414008f", new Object[]{this, dependencyNode, dependencyNode2, new Integer(i), dimensionDependency});
            return;
        }
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mTargets.add(this.mDimension);
        dependencyNode.mMarginFactor = i;
        dependencyNode.mMarginDependency = dimensionDependency;
        dependencyNode2.mDependencies.add(dependencyNode);
        dimensionDependency.mDependencies.add(dependencyNode);
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DependencyNode) ipChange.ipc$dispatch("1d258a2d", new Object[]{this, constraintAnchor, new Integer(i)});
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }
}
