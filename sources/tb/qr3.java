package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import tb.dr2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] b = {"based on Qualcomm Technologies, Inc ", "Qualcomm Technologies, Inc. ", "Qualcomm Technologies, Inc ", "Qualcomm ", "Hisilicon ", "Samsung Technologies, Inc ", " based on Samsung ", "SAMSUNG ", "Samsung "};
    public static final String[] c = {" HUAWEI "};

    /* renamed from: a  reason: collision with root package name */
    public final pr3[] f26891a;

    static {
        t2o.a(395313323);
    }

    public qr3(pr3[] pr3VarArr) {
        this.f26891a = pr3VarArr;
    }

    public static String[] a(pr3 pr3Var, pr3[] pr3VarArr) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("61d7f525", new Object[]{pr3Var, pr3VarArr});
        }
        if (pr3VarArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (pr3 pr3Var2 : pr3VarArr) {
            if (g(pr3Var2.platform, pr3Var.platform) && (((strArr = pr3Var.hardware) == null || strArr.length <= 0 || f(pr3Var2.hardware, h(strArr[0]))) && e(pr3Var2.cpu, pr3Var.cpu))) {
                arrayList.add(pr3Var2.id);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean d(dr2.a aVar, dr2.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f362632a", new Object[]{aVar, aVar2})).booleanValue();
        }
        int[] iArr = aVar2.frequencies;
        if (iArr == null || iArr.length == 0 || aVar.frequencies == null) {
            return true;
        }
        int i = iArr[0];
        int i2 = iArr[iArr.length - 1];
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        int[] iArr2 = aVar.frequencies;
        if (min == iArr2[0] && max == iArr2[1]) {
            return true;
        }
        return false;
    }

    public static boolean e(dr2 dr2Var, dr2 dr2Var2) {
        dr2.a[] aVarArr;
        dr2.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39b1a596", new Object[]{dr2Var, dr2Var2})).booleanValue();
        }
        if (!(dr2Var == null || dr2Var2 == null)) {
            if (dr2Var.coreCount != dr2Var2.coreCount) {
                return false;
            }
            dr2.a[] aVarArr2 = dr2Var.clusters;
            if (!(aVarArr2 == null || (aVarArr = dr2Var2.clusters) == null)) {
                if (aVarArr2.length < aVarArr.length) {
                    return false;
                }
                for (dr2.a aVar2 : aVarArr) {
                    dr2.a[] aVarArr3 = dr2Var.clusters;
                    int length = aVarArr3.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            aVar = null;
                            break;
                        }
                        aVar = aVarArr3[i];
                        int i2 = aVar.coreMask;
                        int i3 = aVar2.coreMask;
                        if ((i2 & i3) == i3) {
                            break;
                        }
                        i++;
                    }
                    if (aVar == null || !d(aVar, aVar2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean f(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c005c533", new Object[]{strArr, str})).booleanValue();
        }
        if (strArr == null || str == null) {
            return true;
        }
        return Arrays.asList(strArr).contains(str);
    }

    public static boolean g(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c342165e", new Object[]{strArr, strArr2})).booleanValue();
        }
        if (strArr2 == null || strArr2.length == 0) {
            return true;
        }
        return f(strArr, strArr2[0]);
    }

    public static String h(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb552a6d", new Object[]{str});
        }
        for (String str2 : b) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                str = str.substring(indexOf + str2.length());
            }
        }
        for (String str3 : c) {
            int indexOf2 = str.indexOf(str3);
            if (indexOf2 >= 0) {
                str = str.substring(0, indexOf2);
            }
        }
        return str.trim();
    }

    public String b(pr3 pr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("542b7f7a", new Object[]{this, pr3Var});
        }
        String[] c2 = c(pr3Var);
        if (c2 == null || c2.length <= 0) {
            return null;
        }
        return c2[0];
    }

    public String[] c(pr3 pr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b3e79d8c", new Object[]{this, pr3Var});
        }
        return a(pr3Var, this.f26891a);
    }
}
