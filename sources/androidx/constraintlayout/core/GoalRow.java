package androidx.constraintlayout.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GoalRow extends ArrayRow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GoalRow(Cache cache) {
        super(cache);
    }

    public static /* synthetic */ Object ipc$super(GoalRow goalRow, String str, Object... objArr) {
        if (str.hashCode() == 878252630) {
            super.addError((SolverVariable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/GoalRow");
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34591256", new Object[]{this, solverVariable});
            return;
        }
        super.addError(solverVariable);
        solverVariable.usageInRowCount--;
    }
}
