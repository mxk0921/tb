package androidx.constraintlayout.solver.widgets;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintWidgetGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ConstraintWidget> mConstrainedGroup;
    public final int[] mGroupDimensions;
    public int mGroupHeight;
    public int mGroupWidth;
    public boolean mSkipSolver;
    public List<ConstraintWidget> mStartHorizontalWidgets;
    public List<ConstraintWidget> mStartVerticalWidgets;
    public List<ConstraintWidget> mUnresolvedWidgets;
    public HashSet<ConstraintWidget> mWidgetsToSetHorizontal;
    public HashSet<ConstraintWidget> mWidgetsToSetVertical;
    public List<ConstraintWidget> mWidgetsToSolve;

    public ConstraintWidgetGroup(List<ConstraintWidget> list) {
        this.mGroupWidth = -1;
        this.mGroupHeight = -1;
        this.mSkipSolver = false;
        this.mGroupDimensions = new int[]{-1, -1};
        this.mStartHorizontalWidgets = new ArrayList();
        this.mStartVerticalWidgets = new ArrayList();
        this.mWidgetsToSetHorizontal = new HashSet<>();
        this.mWidgetsToSetVertical = new HashSet<>();
        this.mWidgetsToSolve = new ArrayList();
        this.mUnresolvedWidgets = new ArrayList();
        this.mConstrainedGroup = list;
    }

    private void getWidgetsToSolveTraversal(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b33d6", new Object[]{this, arrayList, constraintWidget});
        } else if (!constraintWidget.mGroupsToSolver) {
            arrayList.add(constraintWidget);
            constraintWidget.mGroupsToSolver = true;
            if (!constraintWidget.isFullyResolved()) {
                if (constraintWidget instanceof Helper) {
                    Helper helper = (Helper) constraintWidget;
                    int i = helper.mWidgetsCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        getWidgetsToSolveTraversal(arrayList, helper.mWidgets[i2]);
                    }
                }
                int length = constraintWidget.mListAnchors.length;
                for (int i3 = 0; i3 < length; i3++) {
                    ConstraintAnchor constraintAnchor = constraintWidget.mListAnchors[i3].mTarget;
                    if (!(constraintAnchor == null || (constraintWidget2 = constraintAnchor.mOwner) == constraintWidget.getParent())) {
                        getWidgetsToSolveTraversal(arrayList, constraintWidget2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateResolvedDimension(androidx.constraintlayout.solver.widgets.ConstraintWidget r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup.updateResolvedDimension(androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }

    public void addWidgetsToSet(ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc687fd", new Object[]{this, constraintWidget, new Integer(i)});
        } else if (i == 0) {
            this.mWidgetsToSetHorizontal.add(constraintWidget);
        } else if (i == 1) {
            this.mWidgetsToSetVertical.add(constraintWidget);
        }
    }

    public Set<ConstraintWidget> getWidgetsToSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ad5ae9d", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.mWidgetsToSetHorizontal;
        }
        if (i == 1) {
            return this.mWidgetsToSetVertical;
        }
        return null;
    }

    public List<ConstraintWidget> getWidgetsToSolve() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2ae4b35", new Object[]{this});
        }
        if (!this.mWidgetsToSolve.isEmpty()) {
            return this.mWidgetsToSolve;
        }
        int size = this.mConstrainedGroup.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mConstrainedGroup.get(i);
            if (!constraintWidget.mOptimizerMeasurable) {
                getWidgetsToSolveTraversal((ArrayList) this.mWidgetsToSolve, constraintWidget);
            }
        }
        this.mUnresolvedWidgets.clear();
        this.mUnresolvedWidgets.addAll(this.mConstrainedGroup);
        this.mUnresolvedWidgets.removeAll(this.mWidgetsToSolve);
        return this.mWidgetsToSolve;
    }

    public void updateUnresolvedWidgets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361b41c", new Object[]{this});
            return;
        }
        int size = this.mUnresolvedWidgets.size();
        for (int i = 0; i < size; i++) {
            updateResolvedDimension(this.mUnresolvedWidgets.get(i));
        }
    }

    public List<ConstraintWidget> getStartWidgets(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d46d224e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.mStartHorizontalWidgets;
        }
        if (i == 1) {
            return this.mStartVerticalWidgets;
        }
        return null;
    }

    public ConstraintWidgetGroup(List<ConstraintWidget> list, boolean z) {
        this.mGroupWidth = -1;
        this.mGroupHeight = -1;
        this.mSkipSolver = false;
        this.mGroupDimensions = new int[]{-1, -1};
        this.mStartHorizontalWidgets = new ArrayList();
        this.mStartVerticalWidgets = new ArrayList();
        this.mWidgetsToSetHorizontal = new HashSet<>();
        this.mWidgetsToSetVertical = new HashSet<>();
        this.mWidgetsToSolve = new ArrayList();
        this.mUnresolvedWidgets = new ArrayList();
        this.mConstrainedGroup = list;
        this.mSkipSolver = z;
    }
}
