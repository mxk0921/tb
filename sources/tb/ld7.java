package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ld7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262288);
    }

    public static kd7<? extends md7> a(Context context, md7 md7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd7) ipChange.ipc$dispatch("952ddb7", new Object[]{context, md7Var});
        }
        return b(context, md7Var, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
        if (r7.equals("desc_quality") == false) goto L_0x0043;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.kd7<? extends tb.md7> b(android.content.Context r6, tb.md7 r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ld7.b(android.content.Context, tb.md7, boolean):tb.kd7");
    }
}
