package com.taobao.android.diagnose.common;

import com.alipay.mobile.common.logging.util.avail.ExceptionData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum DiagnoseType {
    UNKNOWN("UNKNOWN", 0),
    JavaCrash("JavaCrash", 1),
    NativeCrash("NativeCrash", 2),
    ANR(ExceptionData.TYPE_ANR, 3),
    BizError("BizError", 4),
    Feedback("Feedback", 5),
    CustomError("CustomError", 6);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int index;
    private String name;

    DiagnoseType(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static /* synthetic */ Object ipc$super(DiagnoseType diagnoseType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/common/DiagnoseType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r4.equals("1") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.diagnose.common.DiagnoseType parseByType(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.diagnose.common.DiagnoseType.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "12736be8"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.android.diagnose.common.DiagnoseType r4 = (com.taobao.android.diagnose.common.DiagnoseType) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 49: goto L_0x0059;
                case 50: goto L_0x004e;
                case 51: goto L_0x0043;
                case 52: goto L_0x0038;
                case 53: goto L_0x002d;
                case 54: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x0062
        L_0x0022:
            java.lang.String r0 = "6"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r0 = 5
            goto L_0x0062
        L_0x002d:
            java.lang.String r0 = "5"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r0 = 4
            goto L_0x0062
        L_0x0038:
            java.lang.String r0 = "4"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r0 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "3"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r0 = 2
            goto L_0x0062
        L_0x004e:
            java.lang.String r0 = "2"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0057
            goto L_0x0020
        L_0x0057:
            r0 = 1
            goto L_0x0062
        L_0x0059:
            java.lang.String r1 = "1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0062
            goto L_0x0020
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0074;
                case 2: goto L_0x0071;
                case 3: goto L_0x006e;
                case 4: goto L_0x006b;
                case 5: goto L_0x0068;
                default: goto L_0x0065;
            }
        L_0x0065:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.UNKNOWN
            return r4
        L_0x0068:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.CustomError
            return r4
        L_0x006b:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.Feedback
            return r4
        L_0x006e:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.BizError
            return r4
        L_0x0071:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.ANR
            return r4
        L_0x0074:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.NativeCrash
            return r4
        L_0x0077:
            com.taobao.android.diagnose.common.DiagnoseType r4 = com.taobao.android.diagnose.common.DiagnoseType.JavaCrash
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.common.DiagnoseType.parseByType(java.lang.String):com.taobao.android.diagnose.common.DiagnoseType");
    }

    public static DiagnoseType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiagnoseType) ipChange.ipc$dispatch("ba30f34c", new Object[]{str});
        }
        return (DiagnoseType) Enum.valueOf(DiagnoseType.class, str);
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public static String getName(int i) {
        DiagnoseType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)});
        }
        for (DiagnoseType diagnoseType : values()) {
            if (diagnoseType.getIndex() == i) {
                return diagnoseType.name;
            }
        }
        return null;
    }
}
