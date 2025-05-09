package tb;

import android.system.Os;
import android.system.OsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.Objects;
import tb.dr2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class er2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18772a = {"BogoMIPS", "Features", "model name", "Hardware", "Processor"};

    public static dr2.a b(dr2.a[] aVarArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dr2.a) ipChange.ipc$dispatch("6e552452", new Object[]{aVarArr, new Integer(i)});
        }
        if (aVarArr == null) {
            return null;
        }
        for (dr2.a aVar : aVarArr) {
            if (((1 << i) & aVar.coreMask) != 0) {
                return aVar;
            }
        }
        return null;
    }

    public static final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("722a96cc", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/cpufreq/scaling_available_frequencies";
    }

    public static final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8c44ef", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/topology/core_siblings";
    }

    public static final String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11245253", new Object[]{new Integer(i)});
        }
        return "/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state";
    }

    public static String f(String[] strArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adeeabc6", new Object[]{strArr});
        }
        String a2 = blt.a(strArr, "Hardware\t:");
        if (a2 == null) {
            return null;
        }
        return a2.substring(10).trim();
    }

    public static long g() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8850ad07", new Object[0])).longValue();
        }
        String h = blt.h("/proc/self/stat");
        String[] split = h.substring(h.lastIndexOf(41) + 2).split(" ");
        return ((Long.parseLong(split[11]) + Long.parseLong(split[12])) * 1000) / Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static int h(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88db38cc", new Object[]{strArr, str})).intValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    public static int[] i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9662d15d", new Object[]{new Integer(i)});
        }
        try {
            return blt.c(c(i));
        } catch (Exception unused) {
            try {
                return blt.d(e(i), 0);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static void j(pr3 pr3Var) throws Exception {
        dr2.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedc0017", new Object[]{pr3Var});
            return;
        }
        dr2 dr2Var = pr3Var.cpu;
        if (dr2Var == null) {
            dr2Var = new dr2();
            pr3Var.cpu = dr2Var;
        }
        if (dr2Var.coreCount == 0) {
            dr2Var.coreCount = Runtime.getRuntime().availableProcessors();
        }
        for (int i = 0; i < dr2Var.coreCount; i++) {
            if (b(dr2Var.clusters, i) == null) {
                try {
                    dr2Var.clusters = a(dr2Var.clusters, blt.b(d(i), 16));
                } catch (Exception unused) {
                }
            }
        }
        for (dr2.a aVar : dr2Var.clusters) {
            for (int i2 = 0; i2 < dr2Var.coreCount && aVar.frequencies == null; i2++) {
                if (((1 << i2) & aVar.coreMask) != 0) {
                    aVar.frequencies = i(i2);
                }
            }
        }
        String[] f = blt.f("/proc/cpuinfo");
        k(f, dr2Var.clusters);
        String f2 = f(f);
        if (f2 != null) {
            pr3Var.hardware = new String[]{f2};
        }
    }

    public static dr2.a[] a(dr2.a[] aVarArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dr2.a[]) ipChange.ipc$dispatch("97e3d133", new Object[]{aVarArr, new Integer(i)});
        }
        if (aVarArr != null) {
            for (dr2.a aVar : aVarArr) {
                int i2 = aVar.coreMask;
                if (i2 == i) {
                    return aVarArr;
                }
                if ((i2 & i) != 0) {
                    throw new IllegalArgumentException("partial match: " + aVar.coreMask + " vs " + i);
                }
            }
        }
        dr2.a aVar2 = new dr2.a();
        aVar2.coreMask = i;
        int length = aVarArr != null ? aVarArr.length : 0;
        dr2.a[] aVarArr2 = new dr2.a[1 + length];
        if (aVarArr != null) {
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        }
        aVarArr2[length] = aVar2;
        return aVarArr2;
    }

    static {
        t2o.a(395313322);
    }

    public static void k(String[] strArr, dr2.a[] aVarArr) {
        dr2.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6f7693", new Object[]{strArr, aVarArr});
            return;
        }
        short[] sArr = new short[5];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            String[] split = str.split(":");
            if (split.length == 2) {
                String trim = split[0].trim();
                String trim2 = split[1].trim();
                trim.hashCode();
                char c = 65535;
                switch (trim.hashCode()) {
                    case -1815500307:
                        if (trim.equals("CPU variant")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1509145992:
                        if (trim.equals("CPU implementer")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1094759278:
                        if (trim.equals("processor")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 516911339:
                        if (trim.equals("CPU architecture")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 542854003:
                        if (trim.equals("CPU revision")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1256489867:
                        if (trim.equals("CPU part")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        sArr[1] = Short.decode(trim2).shortValue();
                        continue;
                    case 1:
                        sArr[0] = Short.decode(trim2).shortValue();
                        continue;
                    case 2:
                        i2++;
                        if (sArr[2] != 0) {
                            dr2.a b2 = b(aVarArr, i3);
                            if (b2 != null && b2.midr == null) {
                                b2.midr = (short[]) sArr.clone();
                            }
                            i++;
                            sArr[2] = 0;
                        }
                        i3 = Integer.parseInt(trim2);
                        continue;
                    case 3:
                        trim2.hashCode();
                        if (trim2.equals("AArch64")) {
                            sArr[2] = 8;
                            break;
                        } else {
                            sArr[2] = Short.decode(trim2).shortValue();
                            continue;
                        }
                    case 4:
                        sArr[4] = Short.parseShort(trim2);
                        continue;
                    case 5:
                        sArr[3] = Short.decode(trim2).shortValue();
                        continue;
                    default:
                        if (h(f18772a, trim) >= 0) {
                            break;
                        } else {
                            "Unknown field ignored: ".concat(trim);
                            continue;
                        }
                }
            }
        }
        if ((i != 0 || i2 <= 1) && (b = b(aVarArr, i3)) != null && b.midr == null) {
            b.midr = (short[]) sArr.clone();
        }
    }
}
