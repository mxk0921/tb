package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Analyzer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private Analyzer() {
    }

    public static void determineGroups(ConstraintWidgetContainer constraintWidgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270bebd7", new Object[]{constraintWidgetContainer});
        } else if ((constraintWidgetContainer.getOptimizationLevel() & 32) != 32) {
            singleGroup(constraintWidgetContainer);
        } else {
            constraintWidgetContainer.mSkipSolver = true;
            constraintWidgetContainer.mGroupsWrapOptimized = false;
            constraintWidgetContainer.mHorizontalWrapOptimized = false;
            constraintWidgetContainer.mVerticalWrapOptimized = false;
            ArrayList<ConstraintWidget> arrayList = constraintWidgetContainer.mChildren;
            List<ConstraintWidgetGroup> list = constraintWidgetContainer.mWidgetGroups;
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidgetContainer.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z = horizontalDimensionBehaviour == dimensionBehaviour;
            boolean z2 = constraintWidgetContainer.getVerticalDimensionBehaviour() == dimensionBehaviour;
            boolean z3 = z || z2;
            list.clear();
            for (ConstraintWidget constraintWidget : arrayList) {
                constraintWidget.mBelongingGroup = null;
                constraintWidget.mGroupsToSolver = false;
                constraintWidget.resetResolutionNodes();
            }
            for (ConstraintWidget constraintWidget2 : arrayList) {
                if (constraintWidget2.mBelongingGroup == null && !determineGroups(constraintWidget2, list, z3)) {
                    singleGroup(constraintWidgetContainer);
                    constraintWidgetContainer.mSkipSolver = false;
                    return;
                }
            }
            int i = 0;
            int i2 = 0;
            for (ConstraintWidgetGroup constraintWidgetGroup : list) {
                i = Math.max(i, getMaxDimension(constraintWidgetGroup, 0));
                i2 = Math.max(i2, getMaxDimension(constraintWidgetGroup, 1));
            }
            if (z) {
                constraintWidgetContainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setWidth(i);
                constraintWidgetContainer.mGroupsWrapOptimized = true;
                constraintWidgetContainer.mHorizontalWrapOptimized = true;
                constraintWidgetContainer.mWrapFixedWidth = i;
            }
            if (z2) {
                constraintWidgetContainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setHeight(i2);
                constraintWidgetContainer.mGroupsWrapOptimized = true;
                constraintWidgetContainer.mVerticalWrapOptimized = true;
                constraintWidgetContainer.mWrapFixedHeight = i2;
            }
            setPosition(list, 0, constraintWidgetContainer.getWidth());
            setPosition(list, 1, constraintWidgetContainer.getHeight());
        }
    }

    private static int getMaxDimension(ConstraintWidgetGroup constraintWidgetGroup, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e2834cc", new Object[]{constraintWidgetGroup, new Integer(i)})).intValue();
        }
        int i2 = i * 2;
        List<ConstraintWidget> startWidgets = constraintWidgetGroup.getStartWidgets(i);
        int size = startWidgets.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = startWidgets.get(i4);
            ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i2 + 1].mTarget;
            if (constraintAnchor == null || !(constraintAnchorArr[i2].mTarget == null || constraintAnchor == null)) {
                z = true;
            } else {
                z = false;
            }
            i3 = Math.max(i3, getMaxDimensionTraversal(constraintWidget, i, z, 0));
        }
        constraintWidgetGroup.mGroupDimensions[i] = i3;
        return i3;
    }

    private static int getMaxDimensionTraversal(ConstraintWidget constraintWidget, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i2;
        int i15 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b9d72c", new Object[]{constraintWidget, new Integer(i), new Boolean(z), new Integer(i14)})).intValue();
        }
        if (!constraintWidget.mOptimizerMeasurable) {
            return 0;
        }
        if (constraintWidget.mBaseline.mTarget == null || i != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            i5 = constraintWidget.getBaselineDistance();
            i4 = constraintWidget.getHeight() - constraintWidget.getBaselineDistance();
            i6 = i * 2;
            i3 = i6 + 1;
        } else {
            i5 = constraintWidget.getHeight() - constraintWidget.getBaselineDistance();
            i4 = constraintWidget.getBaselineDistance();
            i3 = i * 2;
            i6 = i3 + 1;
        }
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
        if (constraintAnchorArr[i3].mTarget == null || constraintAnchorArr[i6].mTarget != null) {
            i7 = 1;
        } else {
            i7 = -1;
            i3 = i6;
            i6 = i3;
        }
        if (z2) {
            i14 -= i5;
        }
        int margin = (constraintAnchorArr[i6].getMargin() * i7) + getParentBiasOffset(constraintWidget, i);
        int i16 = i14 + margin;
        if (i == 0) {
            i8 = constraintWidget.getWidth();
        } else {
            i8 = constraintWidget.getHeight();
        }
        int i17 = i8 * i7;
        Iterator<ResolutionNode> it = constraintWidget.mListAnchors[i6].getResolutionNode().dependents.iterator();
        while (it.hasNext()) {
            i15 = Math.max(i15, getMaxDimensionTraversal(((ResolutionAnchor) it.next()).myAnchor.mOwner, i, z, i16));
        }
        int i18 = 0;
        for (Iterator<ResolutionNode> it2 = constraintWidget.mListAnchors[i3].getResolutionNode().dependents.iterator(); it2.hasNext(); it2 = it2) {
            i18 = Math.max(i18, getMaxDimensionTraversal(((ResolutionAnchor) it2.next()).myAnchor.mOwner, i, z, i17 + i16));
        }
        if (z2) {
            i15 -= i5;
            i10 = i18 + i4;
        } else {
            if (i == 0) {
                i9 = constraintWidget.getWidth();
            } else {
                i9 = constraintWidget.getHeight();
            }
            i10 = i18 + (i9 * i7);
        }
        int i19 = 1;
        if (i == 1) {
            Iterator<ResolutionNode> it3 = constraintWidget.mBaseline.getResolutionNode().dependents.iterator();
            int i20 = 0;
            while (it3.hasNext()) {
                ResolutionAnchor resolutionAnchor = (ResolutionAnchor) it3.next();
                if (i7 == i19) {
                    i20 = Math.max(i20, getMaxDimensionTraversal(resolutionAnchor.myAnchor.mOwner, i, z, i5 + i16));
                    i13 = i3;
                } else {
                    i13 = i3;
                    i20 = Math.max(i20, getMaxDimensionTraversal(resolutionAnchor.myAnchor.mOwner, i, z, (i4 * i7) + i16));
                }
                it3 = it3;
                i3 = i13;
                i19 = 1;
            }
            i11 = i3;
            i12 = i20;
            if (constraintWidget.mBaseline.getResolutionNode().dependents.size() > 0 && !z2) {
                i12 = i7 == 1 ? i12 + i5 : i12 - i4;
            }
        } else {
            i11 = i3;
            i12 = 0;
        }
        int max = margin + Math.max(i15, Math.max(i10, i12));
        int i21 = i17 + i16;
        if (i7 == -1) {
            i21 = i16;
            i16 = i21;
        }
        if (z) {
            Optimizer.setOptimizedWidget(constraintWidget, i, i16);
            constraintWidget.setFrame(i16, i21, i);
        } else {
            constraintWidget.mBelongingGroup.addWidgetsToSet(constraintWidget, i);
            constraintWidget.setRelativePositioning(i16, i);
        }
        if (constraintWidget.getDimensionBehaviour(i) == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mDimensionRatio != 0.0f) {
            constraintWidget.mBelongingGroup.addWidgetsToSet(constraintWidget, i);
        }
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.mListAnchors;
        if (!(constraintAnchorArr2[i6].mTarget == null || constraintAnchorArr2[i11].mTarget == null)) {
            ConstraintWidget parent = constraintWidget.getParent();
            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget.mListAnchors;
            if (constraintAnchorArr3[i6].mTarget.mOwner == parent && constraintAnchorArr3[i11].mTarget.mOwner == parent) {
                constraintWidget.mBelongingGroup.addWidgetsToSet(constraintWidget, i);
            }
        }
        return max;
    }

    private static int getParentBiasOffset(ConstraintWidget constraintWidget, int i) {
        ConstraintAnchor constraintAnchor;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1856faa3", new Object[]{constraintWidget, new Integer(i)})).intValue();
        }
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2 + 1];
        ConstraintAnchor constraintAnchor4 = constraintAnchor2.mTarget;
        if (constraintAnchor4 != null) {
            ConstraintWidget constraintWidget2 = constraintAnchor4.mOwner;
            ConstraintWidget constraintWidget3 = constraintWidget.mParent;
            if (constraintWidget2 == constraintWidget3 && (constraintAnchor = constraintAnchor3.mTarget) != null && constraintAnchor.mOwner == constraintWidget3) {
                int length = constraintWidget3.getLength(i);
                if (i == 0) {
                    f = constraintWidget.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget.mVerticalBiasPercent;
                }
                return (int) ((((length - constraintAnchor2.getMargin()) - constraintAnchor3.getMargin()) - constraintWidget.getLength(i)) * f);
            }
        }
        return 0;
    }

    private static void invalidate(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidget constraintWidget, ConstraintWidgetGroup constraintWidgetGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb82e9a6", new Object[]{constraintWidgetContainer, constraintWidget, constraintWidgetGroup});
            return;
        }
        constraintWidgetGroup.mSkipSolver = false;
        constraintWidgetContainer.mSkipSolver = false;
        constraintWidget.mOptimizerMeasurable = false;
    }

    private static int resolveDimensionRatio(ConstraintWidget constraintWidget) {
        float width;
        float height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc3e721", new Object[]{constraintWidget})).intValue();
        }
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (horizontalDimensionBehaviour == dimensionBehaviour) {
            if (constraintWidget.mDimensionRatioSide == 0) {
                height = constraintWidget.getHeight() * constraintWidget.mDimensionRatio;
            } else {
                height = constraintWidget.getHeight() / constraintWidget.mDimensionRatio;
            }
            int i = (int) height;
            constraintWidget.setWidth(i);
            return i;
        } else if (constraintWidget.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            return -1;
        } else {
            if (constraintWidget.mDimensionRatioSide == 1) {
                width = constraintWidget.getWidth() * constraintWidget.mDimensionRatio;
            } else {
                width = constraintWidget.getWidth() / constraintWidget.mDimensionRatio;
            }
            int i2 = (int) width;
            constraintWidget.setHeight(i2);
            return i2;
        }
    }

    private static void setConnection(ConstraintAnchor constraintAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9a45ae", new Object[]{constraintAnchor});
            return;
        }
        ResolutionAnchor resolutionNode = constraintAnchor.getResolutionNode();
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget != constraintAnchor) {
            constraintAnchor2.getResolutionNode().addDependent(resolutionNode);
        }
    }

    public static void setPosition(List<ConstraintWidgetGroup> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be16db43", new Object[]{list, new Integer(i), new Integer(i2)});
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (ConstraintWidget constraintWidget : list.get(i3).getWidgetsToSet(i)) {
                if (constraintWidget.mOptimizerMeasurable) {
                    updateSizeDependentWidgets(constraintWidget, i, i2);
                }
            }
        }
    }

    private static void singleGroup(ConstraintWidgetContainer constraintWidgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0d52e7", new Object[]{constraintWidgetContainer});
            return;
        }
        constraintWidgetContainer.mWidgetGroups.clear();
        constraintWidgetContainer.mWidgetGroups.add(0, new ConstraintWidgetGroup(constraintWidgetContainer.mChildren));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x017e, code lost:
        if (r4.mOwner == r5) goto L_0x0180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0135, code lost:
        if (r4.mOwner == r5) goto L_0x0137;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean traverse(androidx.constraintlayout.solver.widgets.ConstraintWidget r8, androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup r9, java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Analyzer.traverse(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup, java.util.List, boolean):boolean");
    }

    private static void updateSizeDependentWidgets(ConstraintWidget constraintWidget, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605abd45", new Object[]{constraintWidget, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i3 + 1];
        if (constraintAnchor.mTarget != null && constraintAnchor2.mTarget != null) {
            Optimizer.setOptimizedWidget(constraintWidget, i, getParentBiasOffset(constraintWidget, i) + constraintAnchor.getMargin());
        } else if (constraintWidget.mDimensionRatio == 0.0f || constraintWidget.getDimensionBehaviour(i) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int relativePositioning = i2 - constraintWidget.getRelativePositioning(i);
            int length = relativePositioning - constraintWidget.getLength(i);
            constraintWidget.setFrame(length, relativePositioning, i);
            Optimizer.setOptimizedWidget(constraintWidget, i, length);
        } else {
            int resolveDimensionRatio = resolveDimensionRatio(constraintWidget);
            int i4 = (int) constraintWidget.mListAnchors[i3].getResolutionNode().resolvedOffset;
            constraintAnchor2.getResolutionNode().resolvedTarget = constraintAnchor.getResolutionNode();
            constraintAnchor2.getResolutionNode().resolvedOffset = resolveDimensionRatio;
            constraintAnchor2.getResolutionNode().state = 1;
            constraintWidget.setFrame(i4, i4 + resolveDimensionRatio, i);
        }
    }

    private static boolean determineGroups(ConstraintWidget constraintWidget, List<ConstraintWidgetGroup> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2f974f", new Object[]{constraintWidget, list, new Boolean(z)})).booleanValue();
        }
        ConstraintWidgetGroup constraintWidgetGroup = new ConstraintWidgetGroup(new ArrayList(), true);
        list.add(constraintWidgetGroup);
        return traverse(constraintWidget, constraintWidgetGroup, list, z);
    }
}
