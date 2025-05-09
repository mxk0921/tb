package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintHorizontalLayout extends ConstraintWidgetContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ContentAlignment mAlignment = ContentAlignment.MIDDLE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ContentAlignment contentAlignment, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/ConstraintHorizontalLayout$ContentAlignment");
        }

        public static ContentAlignment valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentAlignment) ipChange.ipc$dispatch("8d27b943", new Object[]{str});
            }
            return (ContentAlignment) Enum.valueOf(ContentAlignment.class, str);
        }
    }

    public ConstraintHorizontalLayout() {
    }

    public static /* synthetic */ Object ipc$super(ConstraintHorizontalLayout constraintHorizontalLayout, String str, Object... objArr) {
        if (str.hashCode() == 676242781) {
            super.addToSolver((LinearSystem) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/ConstraintHorizontalLayout");
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284ea55d", new Object[]{this, linearSystem});
            return;
        }
        if (this.mChildren.size() != 0) {
            int size = this.mChildren.size();
            ConstraintWidget constraintWidget = this;
            while (i < size) {
                ConstraintWidget constraintWidget2 = this.mChildren.get(i);
                if (constraintWidget != this) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget2.connect(type, constraintWidget, type2);
                    constraintWidget.connect(type2, constraintWidget2, type);
                } else {
                    ConstraintAnchor.Strength strength = ConstraintAnchor.Strength.STRONG;
                    if (this.mAlignment == ContentAlignment.END) {
                        strength = ConstraintAnchor.Strength.WEAK;
                    }
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                    constraintWidget2.connect(type3, constraintWidget, type3, 0, strength);
                }
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                constraintWidget2.connect(type4, this, type4);
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget2.connect(type5, this, type5);
                i++;
                constraintWidget = constraintWidget2;
            }
            if (constraintWidget != this) {
                ConstraintAnchor.Strength strength2 = ConstraintAnchor.Strength.STRONG;
                if (this.mAlignment == ContentAlignment.BEGIN) {
                    strength2 = ConstraintAnchor.Strength.WEAK;
                }
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.connect(type6, this, type6, 0, strength2);
            }
        }
        super.addToSolver(linearSystem);
    }

    public ConstraintHorizontalLayout(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public ConstraintHorizontalLayout(int i, int i2) {
        super(i, i2);
    }
}
