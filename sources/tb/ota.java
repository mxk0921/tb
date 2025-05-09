package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ota {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25638a;
    public int b = 4;
    public final String[] c = {"K3V2E,K3V2,MT6589,EXYNOS4210,EXYNOS4212,MSM8X25Q,MSM8X26,PXA1088,PXA1L88,MSM8260,MSM8660,MSM8625,MSM8225,MSM8655,APQ8055,MSM7230,MSM7630,GOLDFISH,MSM8255T,MSM8655T,MSM7627A,MSM7227A,MSM7627T,MSM7227T,MT6577T,MT6572M,MT6515M,MT6575,QSD8650,QSD8250,OMAP4470,SP8810,SC8810MT6516,MT6573,MT6513,S5PC100,S5L8900,HI3611,HI3620,OMAP4460,OMAP4440,OMAP4430,EXYNOS3475,EXYNOS3110", "MT6595,MT6592,MT6582,MSM8936,MSM8909,MSM8909V2,MSM8916V2,MSM8208,MSM8960T,MSM8260A,MSM8660A,MSM8960,MSM8X12,MSM8X10,MSM8X30,LC1860", "EXYNOS5260,EXYNOS5250,MT6750,MT6735,MSM8939V2,MSM8937,MSM8929,APQ8064,MSM8917,EXYNOS52,K3V2+,REDHOOKBAY,PXA1908,SC9860,HI6620OEM", "MT675X,MT6795,MT6755,MT6752,MT6753,EXYNOS5800,EXYNOS5422,EXYNOS5410,MSM8952,MSM8940,PXA1936,HI6210SFT", "MSM8X74,MSM8X74AA,MSM8X74AB,MSM8X74AC,MSM8674,MSM8274,MSM8074,EXYNOS5430,EXYNOS7870,EXYNOS7580,EXYNOS5433,MT679X,MT6797T,MT6797,EXYNOS5420,UNIVERSAL5420,RANCHU", "APQ8084,MSM8084,MSM8953,HI3630,EXYNOS5433,HI3635,EXYNOS5", "MSM8956,MSM8946,MT6797X,MT6797X,MT6797T,MT6797D", "SDM660,SDM630,MSM8994,MSM8992,HI3650,EXYNOS7420,VBOX86", "MSM8996,MSM8996PRO,MSM8996 PRO,EXYNOS8890,MT6799", "MSM8997,HI3660", "SDM845,KIRIN970,MSM8998,EXYNOS8895"};

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ea3405d", new Object[]{this, str})).intValue();
        }
        if (this.f25638a == null) {
            return -1;
        }
        for (int length = this.c.length - 1; length >= 0; length--) {
            String str2 = this.c[length];
            if (str2 != null && str2.contains(str)) {
                Log.e("OnlineMonitor", "cpuModel=" + str + ",score=" + length);
                return length;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r5 >= 1.0f) goto L_0x007c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e2, code lost:
        if (r0 >= 1.0f) goto L_0x00e4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e4, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
        if (r0 >= 1.0f) goto L_0x00e4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0115, code lost:
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(com.ali.alihadeviceevaluator.old.HardWareInfo r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ota.b(com.ali.alihadeviceevaluator.old.HardWareInfo):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b9, code lost:
        if (r0 >= 2) goto L_0x0119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cc, code lost:
        if (r0 >= 2) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dd, code lost:
        if (r0 >= 2) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ed, code lost:
        if (r0 >= 2) goto L_0x0114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r0 >= 2) goto L_0x0119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
        if (r1 >= 2) goto L_0x011c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a7, code lost:
        if (r0 >= 2) goto L_0x0119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(com.ali.alihadeviceevaluator.old.HardWareInfo r14) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ota.c(com.ali.alihadeviceevaluator.old.HardWareInfo):int");
    }
}
