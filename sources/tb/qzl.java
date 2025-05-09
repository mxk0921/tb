package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String[] f27021a = null;
    public int[] b = null;
    public String[] c = null;

    public static qzl a(String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzl) ipChange.ipc$dispatch("5e2ca014", new Object[]{strArr, iArr});
        }
        qzl qzlVar = new qzl();
        qzlVar.f27021a = strArr;
        qzlVar.b = iArr;
        if (iArr != null) {
            qzlVar.c = new String[iArr.length];
            for (int i = 0; i < qzlVar.f27021a.length; i++) {
                int i2 = qzlVar.b[i];
                if (i2 == -3) {
                    qzlVar.c[i] = "ROLLBACK";
                } else if (i2 == -2) {
                    qzlVar.c[i] = "BIZ DINED";
                } else if (i2 == -1) {
                    qzlVar.c[i] = "SYS DINED";
                } else if (i2 != 0) {
                    qzlVar.c[i] = "UNKNOWN STATUS";
                } else {
                    qzlVar.c[i] = "";
                }
            }
        }
        return qzlVar;
    }
}
