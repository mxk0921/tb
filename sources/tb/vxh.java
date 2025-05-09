package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217782);
    }

    public static MaType a(eyh eyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType) ipChange.ipc$dispatch("b836065", new Object[]{eyhVar});
        }
        int i = eyhVar.f18888a;
        if (i == 0) {
            return MaType.PRODUCT;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 127 && eyhVar.b == 128) {
                    return MaType.PRODUCT;
                }
                return null;
            } else if (g(eyhVar.c)) {
                return MaType.MEDICINE;
            } else {
                return MaType.EXPRESS;
            }
        } else if (j(eyhVar.c)) {
            return MaType.TB_ANTI_FAKE;
        } else {
            if (e(eyhVar.b)) {
                return MaType.GEN3;
            }
            if (b(eyhVar.b)) {
                return MaType.TB_4G;
            }
            if (d(eyhVar.b)) {
                return MaType.DM;
            }
            return MaType.QR;
        }
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cd40d6", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 2050) {
            return true;
        }
        return false;
    }

    public static boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4139ac1", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == 0 || i == 2) {
            return true;
        }
        if (i == 127 && i2 == 128) {
            return true;
        }
        return false;
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d113a0", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 1024) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe2cbc53", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 32768) {
            return true;
        }
        return false;
    }

    public static boolean f(int i, MaType maType, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff2b94c", new Object[]{new Integer(i), maType, new Integer(i2)})).booleanValue();
        }
        if (i == 1 && maType == MaType.GEN3 && i2 == 32768) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("557d0566", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("8") || str.length() != 20) && ((!str.startsWith("10") && !str.startsWith("11")) || str.length() != 16)) {
            return false;
        }
        return true;
    }

    public static boolean h(int i, MaType maType, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b55dce", new Object[]{new Integer(i), maType, new Integer(i2)})).booleanValue();
        }
        if (i == 1 && maType == MaType.QR && i2 == 512) {
            return true;
        }
        return false;
    }

    public static boolean i(int i, MaType maType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd9df781", new Object[]{new Integer(i), maType})).booleanValue();
        }
        if (i == 1 && maType == MaType.TB_ANTI_FAKE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (android.text.TextUtils.equals(r1, "5") != false) goto L_0x007d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.vxh.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "bdb1af31"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0020
            return r0
        L_0x0020:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            if (r4 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.String r2 = r4.getHost()
            if (r2 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.String r2 = "2020-11-23_path"
            java.lang.String r3 = "the 2020-11-23 path is applied..."
            android.util.Log.e(r2, r3)     // Catch: all -> 0x007d
            java.lang.String r2 = "^/([^/]*)/"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: all -> 0x007d
            java.lang.String r3 = r4.getPath()     // Catch: all -> 0x007d
            java.util.regex.Matcher r2 = r2.matcher(r3)     // Catch: all -> 0x007d
            boolean r3 = r2.find()     // Catch: all -> 0x007d
            if (r3 == 0) goto L_0x007c
            int r3 = r2.groupCount()     // Catch: all -> 0x007d
            if (r3 < r1) goto L_0x007c
            java.lang.String r1 = r2.group(r1)     // Catch: all -> 0x007d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: all -> 0x007d
            if (r2 == 0) goto L_0x005b
            goto L_0x007c
        L_0x005b:
            java.lang.String r2 = "2"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch: all -> 0x007d
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "3"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch: all -> 0x007d
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "4"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch: all -> 0x007d
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "5"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return r0
        L_0x007d:
            java.lang.String r4 = r4.getHost()
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r0 = "s.tb.cn"
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vxh.j(java.lang.String):boolean");
    }
}
