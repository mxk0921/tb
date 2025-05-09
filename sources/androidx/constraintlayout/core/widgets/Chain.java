package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Chain {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560109d1", new Object[]{constraintWidgetContainer, linearSystem, arrayList, new Integer(i)});
            return;
        }
        if (i == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = 0;
        } else {
            int i4 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r12 == 2) goto L_0x005d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r12 == 2) goto L_0x005d;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x057a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r1v44, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r36, androidx.constraintlayout.core.LinearSystem r37, int r38, int r39, androidx.constraintlayout.core.widgets.ChainHead r40) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
