package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WidgetGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = false;
    public static int sCount;
    public int mId;
    public int mOrientation;
    public ArrayList<ConstraintWidget> mWidgets = new ArrayList<>();
    public boolean mAuthoritative = false;
    public ArrayList<MeasureResult> mResults = null;
    private int mMoveTo = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MeasureResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mBaseline;
        public int mBottom;
        public int mLeft;
        public int mOrientation;
        public int mRight;
        public int mTop;
        public WeakReference<ConstraintWidget> mWidgetRef;

        public MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i) {
            this.mWidgetRef = new WeakReference<>(constraintWidget);
            this.mLeft = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.mTop = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.mRight = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.mBottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.mBaseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.mOrientation = i;
        }

        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
                return;
            }
            ConstraintWidget constraintWidget = this.mWidgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.mLeft, this.mTop, this.mRight, this.mBottom, this.mBaseline, this.mOrientation);
            }
        }
    }

    public WidgetGroup(int i) {
        int i2 = sCount;
        sCount = i2 + 1;
        this.mId = i2;
        this.mOrientation = i;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f65d170", new Object[]{this, constraintWidget})).booleanValue();
        }
        return this.mWidgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7820ce8e", new Object[]{this});
        }
        int i = this.mOrientation;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int measureWrap(int i, ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73d662b1", new Object[]{this, new Integer(i), constraintWidget})).intValue();
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i);
        if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (i == 0) {
            return constraintWidget.getWidth();
        }
        return constraintWidget.getHeight();
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int objectVariableValue;
        int objectVariableValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("865990d9", new Object[]{this, linearSystem, arrayList, new Integer(i)})).intValue();
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).addToSolver(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.mResults = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.mResults.add(new MeasureResult(arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2a5be2e", new Object[]{this, constraintWidget})).booleanValue();
        }
        if (this.mWidgets.contains(constraintWidget)) {
            return false;
        }
        this.mWidgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
        } else if (this.mResults != null && this.mAuthoritative) {
            for (int i = 0; i < this.mResults.size(); i++) {
                this.mResults.get(i).apply();
            }
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mWidgets.clear();
        }
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.mId;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.mOrientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64d25db9", new Object[]{this, widgetGroup})).booleanValue();
        }
        for (int i = 0; i < this.mWidgets.size(); i++) {
            if (widgetGroup.contains(this.mWidgets.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1121de90", new Object[]{this})).booleanValue();
        }
        return this.mAuthoritative;
    }

    public void moveTo(int i, WidgetGroup widgetGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b9c811", new Object[]{this, new Integer(i), widgetGroup});
            return;
        }
        Iterator<ConstraintWidget> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.add(next);
            if (i == 0) {
                next.horizontalGroup = widgetGroup.getId();
            } else {
                next.verticalGroup = widgetGroup.getId();
            }
        }
        this.mMoveTo = widgetGroup.mId;
    }

    public void setAuthoritative(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf3f700", new Object[]{this, new Boolean(z)});
        } else {
            this.mAuthoritative = z;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mWidgets.size();
    }

    public String toString() {
        Iterator<ConstraintWidget> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = getOrientationString() + " [" + this.mId + "] <";
        while (this.mWidgets.iterator().hasNext()) {
            str = str + " " + it.next().getDebugName();
        }
        return str + " >";
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ba95f", new Object[]{this, arrayList});
            return;
        }
        int size = this.mWidgets.size();
        if (this.mMoveTo != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = arrayList.get(i);
                if (this.mMoveTo == widgetGroup.mId) {
                    moveTo(this.mOrientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int measureWrap(LinearSystem linearSystem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6badba46", new Object[]{this, linearSystem, new Integer(i)})).intValue();
        }
        if (this.mWidgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.mWidgets, i);
    }
}
