package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w87 extends c3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912770);
    }

    public static /* synthetic */ Object ipc$super(w87 w87Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/version/DefaultVersionComparator");
    }

    public static boolean isDigits(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a193b545", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e A[LOOP:1: B:34:0x006e->B:41:0x0083, LOOP_START, PHI: r3 
      PHI: (r3v6 int) = (r3v3 int), (r3v7 int) binds: [B:33:0x006c, B:41:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compare(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.w87.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "2b88f5f3"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r9
            r4[r1] = r10
            r10 = 2
            r4[r10] = r11
            java.lang.Object r10 = r2.ipc$dispatch(r3, r4)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            return r10
        L_0x001f:
            r2 = -1
            if (r10 != 0) goto L_0x0023
            return r2
        L_0x0023:
            if (r11 != 0) goto L_0x0026
            return r1
        L_0x0026:
            java.lang.String r3 = "\\."
            java.lang.String[] r10 = r10.split(r3)
            java.lang.String[] r11 = r11.split(r3)
            int r3 = r10.length
            int r4 = r11.length
            if (r3 <= r4) goto L_0x0038
            r3 = r4
            r4 = 1
        L_0x0036:
            r5 = 0
            goto L_0x003f
        L_0x0038:
            if (r3 >= r4) goto L_0x003d
            r4 = 0
            r5 = 1
            goto L_0x003f
        L_0x003d:
            r4 = 0
            goto L_0x0036
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 >= r3) goto L_0x0068
            r7 = r10[r6]
            boolean r7 = isDigits(r7)
            if (r7 != 0) goto L_0x004b
            return r2
        L_0x004b:
            r7 = r11[r6]
            boolean r7 = isDigits(r7)
            if (r7 != 0) goto L_0x0054
            return r1
        L_0x0054:
            r7 = r10[r6]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = r11[r6]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r7 <= r8) goto L_0x0063
            return r1
        L_0x0063:
            if (r7 >= r8) goto L_0x0066
            return r2
        L_0x0066:
            int r6 = r6 + r1
            goto L_0x0040
        L_0x0068:
            java.lang.String r6 = "00"
            java.lang.String r7 = "0"
            if (r4 == 0) goto L_0x0086
        L_0x006e:
            int r11 = r10.length
            if (r3 >= r11) goto L_0x0085
            r11 = r10[r3]
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0083
            r11 = r10[r3]
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            return r1
        L_0x0083:
            int r3 = r3 + r1
            goto L_0x006e
        L_0x0085:
            return r0
        L_0x0086:
            if (r5 == 0) goto L_0x009f
        L_0x0088:
            int r10 = r11.length
            if (r3 >= r10) goto L_0x009f
            r10 = r11[r3]
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x009d
            r10 = r11[r3]
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            return r2
        L_0x009d:
            int r3 = r3 + r1
            goto L_0x0088
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w87.compare(java.lang.String, java.lang.String):int");
    }
}
