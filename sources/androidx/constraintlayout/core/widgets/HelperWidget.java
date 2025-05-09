package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    public static /* synthetic */ Object ipc$super(HelperWidget helperWidget, String str, Object... objArr) {
        if (str.hashCode() == -1680364003) {
            super.copy((ConstraintWidget) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/HelperWidget");
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a5be2a", new Object[]{this, constraintWidget});
        } else if (constraintWidget != this && constraintWidget != null) {
            int i = this.mWidgetsCount + 1;
            ConstraintWidget[] constraintWidgetArr = this.mWidgets;
            if (i > constraintWidgetArr.length) {
                this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
            int i2 = this.mWidgetsCount;
            constraintWidgetArr2[i2] = constraintWidget;
            this.mWidgetsCount = i2 + 1;
        }
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i, WidgetGroup widgetGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8938a6c", new Object[]{this, arrayList, new Integer(i), widgetGroup});
            return;
        }
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            widgetGroup.add(this.mWidgets[i2]);
        }
        for (int i3 = 0; i3 < this.mWidgetsCount; i3++) {
            Grouping.findDependents(this.mWidgets[i3], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd7ae1d", new Object[]{this, constraintWidget, hashMap});
            return;
        }
        super.copy(constraintWidget, hashMap);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i = helperWidget.mWidgetsCount;
        for (int i2 = 0; i2 < i; i2++) {
            add(hashMap.get(helperWidget.mWidgets[i2]));
        }
    }

    public int findGroupInDependents(int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23b4d2f0", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
            ConstraintWidget constraintWidget = this.mWidgets[i4];
            if (i == 0 && (i3 = constraintWidget.horizontalGroup) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = constraintWidget.verticalGroup) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5634fdb1", new Object[]{this, constraintWidgetContainer});
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41a3602", new Object[]{this});
            return;
        }
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }
}
