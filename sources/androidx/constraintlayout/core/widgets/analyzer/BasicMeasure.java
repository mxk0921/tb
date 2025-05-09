package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BasicMeasure {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer mConstraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mConstraintWidgetContainer = constraintWidgetContainer;
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i, int i2, int i3) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbe1de2", new Object[]{this, constraintWidgetContainer, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (constraintWidgetContainer.mMetrics != null) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setHeight(i3);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.mConstraintWidgetContainer.setPass(i);
        this.mConstraintWidgetContainer.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long nanoTime = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.mMetrics;
            metrics.mSolverPasses++;
            metrics.measuresLayoutDuration += nanoTime - j;
        }
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z;
        long j;
        ConstraintWidgetContainer constraintWidgetContainer2;
        int i13;
        Metrics metrics;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer3 = constraintWidgetContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5531b708", new Object[]{basicMeasure, constraintWidgetContainer3, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)})).longValue();
        }
        Measurer measurer = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer3.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean enabled = Optimizer.enabled(i, 128);
        boolean z2 = enabled || Optimizer.enabled(i, 64);
        if (z2) {
            int i14 = 0;
            while (i14 < size) {
                ConstraintWidget constraintWidget = constraintWidgetContainer3.mChildren.get(i14);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z3 = (horizontalDimensionBehaviour == dimensionBehaviour) && (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z3) || ((constraintWidget.isInVerticalChain() && z3) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z2 = false;
                    break;
                }
                i14++;
                z2 = z2;
            }
        }
        if (!z2 || (metrics = LinearSystem.sMetrics) == null) {
            i11 = width;
            i10 = height;
        } else {
            i11 = width;
            i10 = height;
            metrics.measures++;
        }
        boolean z4 = z2 & ((i4 == 1073741824 && i6 == 1073741824) || enabled);
        if (z4) {
            int min = Math.min(constraintWidgetContainer.getMaxWidth(), i5);
            int min2 = Math.min(constraintWidgetContainer.getMaxHeight(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.getWidth() != min) {
                constraintWidgetContainer3.setWidth(min);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.getHeight() != min2) {
                constraintWidgetContainer3.setHeight(min2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = constraintWidgetContainer3.directMeasure(enabled);
                i12 = 2;
            } else {
                z = constraintWidgetContainer3.directMeasureSetup(enabled);
                if (i4 == 1073741824) {
                    z &= constraintWidgetContainer3.directMeasureWithOrientation(enabled, 0);
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i6 == 1073741824) {
                    z &= constraintWidgetContainer3.directMeasureWithOrientation(enabled, 1);
                    i12++;
                }
            }
            if (z) {
                constraintWidgetContainer3.updateFromRuns(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i12 = 0;
        }
        long j2 = 0;
        if (!z || i12 != 2) {
            int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
            if (size > 0) {
                measureChildren(constraintWidgetContainer);
            }
            if (constraintWidgetContainer3.mMetrics != null) {
                j2 = System.nanoTime();
            }
            updateHierarchy(constraintWidgetContainer);
            int size2 = basicMeasure.mVariableDimensionsWidgets.size();
            if (size > 0) {
                solveLinearSystem(constraintWidgetContainer, "First pass", 0, i11, i10);
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z5 = horizontalDimensionBehaviour2 == dimensionBehaviour2;
                boolean z6 = constraintWidgetContainer.getVerticalDimensionBehaviour() == dimensionBehaviour2;
                int max = Math.max(constraintWidgetContainer.getWidth(), basicMeasure.mConstraintWidgetContainer.getMinWidth());
                int max2 = Math.max(constraintWidgetContainer.getHeight(), basicMeasure.mConstraintWidgetContainer.getMinHeight());
                int i15 = 0;
                boolean z7 = false;
                while (i15 < size2) {
                    ConstraintWidget constraintWidget2 = basicMeasure.mVariableDimensionsWidgets.get(i15);
                    if (!(constraintWidget2 instanceof VirtualLayout)) {
                        z4 = z4;
                        j2 = j2;
                    } else {
                        int width2 = constraintWidget2.getWidth();
                        int height2 = constraintWidget2.getHeight();
                        j2 = j2;
                        boolean measure = z7 | basicMeasure.measure(measurer, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS);
                        Metrics metrics2 = constraintWidgetContainer3.mMetrics;
                        z4 = z4;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets++;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z5 && constraintWidget2.getRight() > max) {
                                max = Math.max(max, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            measure = true;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z6 && constraintWidget2.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            measure = true;
                        }
                        z7 = measure | ((VirtualLayout) constraintWidget2).needSolverPass();
                    }
                    i15++;
                    constraintWidgetContainer3 = constraintWidgetContainer;
                }
                j = j2;
                int i16 = 0;
                int i17 = 2;
                while (i16 < i17) {
                    int i18 = 0;
                    while (i18 < size2) {
                        ConstraintWidget constraintWidget3 = basicMeasure.mVariableDimensionsWidgets.get(i18);
                        if ((!(constraintWidget3 instanceof Helper) || (constraintWidget3 instanceof VirtualLayout)) && !(constraintWidget3 instanceof Guideline)) {
                            if (constraintWidget3.getVisibility() != 8 && ((!z4 || !constraintWidget3.mHorizontalRun.mDimension.resolved || !constraintWidget3.mVerticalRun.mDimension.resolved) && !(constraintWidget3 instanceof VirtualLayout))) {
                                int width4 = constraintWidget3.getWidth();
                                int height4 = constraintWidget3.getHeight();
                                int baselineDistance = constraintWidget3.getBaselineDistance();
                                int i19 = Measure.TRY_GIVEN_DIMENSIONS;
                                if (i16 == 1) {
                                    i19 = Measure.USE_GIVEN_DIMENSIONS;
                                }
                                z7 |= basicMeasure.measure(measurer, constraintWidget3, i19);
                                Metrics metrics3 = constraintWidgetContainer.mMetrics;
                                optimizationLevel = optimizationLevel;
                                if (metrics3 != null) {
                                    metrics3.measuredMatchWidgets++;
                                }
                                int width5 = constraintWidget3.getWidth();
                                int height5 = constraintWidget3.getHeight();
                                if (width5 != width4) {
                                    constraintWidget3.setWidth(width5);
                                    if (z5 && constraintWidget3.getRight() > max) {
                                        max = Math.max(max, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                    }
                                    z7 = true;
                                }
                                if (height5 != height4) {
                                    constraintWidget3.setHeight(height5);
                                    if (z6 && constraintWidget3.getBottom() > max2) {
                                        max2 = Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                    }
                                    z7 = true;
                                }
                                if (!constraintWidget3.hasBaseline() || baselineDistance == constraintWidget3.getBaselineDistance()) {
                                    i13 = 1;
                                } else {
                                    i13 = 1;
                                    z7 = true;
                                }
                                i18 += i13;
                                basicMeasure = this;
                            }
                        }
                        optimizationLevel = optimizationLevel;
                        i13 = 1;
                        i18 += i13;
                        basicMeasure = this;
                    }
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    if (!z7) {
                        optimizationLevel = optimizationLevel;
                        break;
                    }
                    i16++;
                    solveLinearSystem(constraintWidgetContainer, "intermediate pass", i16, i11, i10);
                    basicMeasure = this;
                    optimizationLevel = optimizationLevel;
                    i17 = 2;
                    z7 = false;
                }
                constraintWidgetContainer2 = constraintWidgetContainer;
            } else {
                j = j2;
                constraintWidgetContainer2 = constraintWidgetContainer3;
            }
            constraintWidgetContainer2.setOptimizationLevel(optimizationLevel);
        } else {
            j = 0;
            constraintWidgetContainer2 = constraintWidgetContainer3;
        }
        return constraintWidgetContainer2.mMetrics != null ? System.nanoTime() - j : j;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e5830", new Object[]{this, constraintWidgetContainer});
            return;
        }
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    private void measureChildren(ConstraintWidgetContainer constraintWidgetContainer) {
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5579d81", new Object[]{this, constraintWidgetContainer});
            return;
        }
        int size = constraintWidgetContainer.mChildren.size();
        boolean optimizeFor = constraintWidgetContainer.optimizeFor(64);
        Measurer measurer = constraintWidgetContainer.getMeasurer();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (!(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !constraintWidget.isInVirtualLayout() && (!optimizeFor || (horizontalWidgetRun = constraintWidget.mHorizontalRun) == null || (verticalWidgetRun = constraintWidget.mVerticalRun) == null || !horizontalWidgetRun.mDimension.resolved || !verticalWidgetRun.mDimension.resolved)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z = dimensionBehaviour == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour2 == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultHeight != 1;
                if (!z && constraintWidgetContainer.optimizeFor(1) && !(constraintWidget instanceof VirtualLayout)) {
                    if (dimensionBehaviour == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour2 != dimensionBehaviour3 && !constraintWidget.isInHorizontalChain()) {
                        z = true;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultHeight == 0 && dimensionBehaviour != dimensionBehaviour3 && !constraintWidget.isInHorizontalChain()) {
                        z = true;
                    }
                    if ((dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) && constraintWidget.mDimensionRatio > 0.0f) {
                        z = true;
                    }
                }
                if (!z) {
                    measure(measurer, constraintWidget, Measure.SELF_DIMENSIONS);
                    Metrics metrics = constraintWidgetContainer.mMetrics;
                    if (metrics != null) {
                        metrics.measuredWidgets++;
                    }
                }
            }
        }
        measurer.didMeasures();
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1a571a4", new Object[]{this, measurer, constraintWidget, new Integer(i)})).booleanValue();
        }
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.mDimensionRatio > 0.0f;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        if (z3 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }
}
