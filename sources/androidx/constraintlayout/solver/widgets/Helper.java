package androidx.constraintlayout.solver.widgets;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Helper extends ConstraintWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    public static /* synthetic */ Object ipc$super(Helper helper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/Helper");
    }

    public void add(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d4e7de", new Object[]{this, constraintWidget});
            return;
        }
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

    public void removeAllIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41a3602", new Object[]{this});
        } else {
            this.mWidgetsCount = 0;
        }
    }
}
