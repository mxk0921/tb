package com.taobao.uikit.extend.iconfont.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class IconfontApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getIconfont(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("599d73e7", new Object[]{str, str2});
        }
        String iconfontLevel0 = getIconfontLevel0(str, str2);
        if (!TextUtils.equals(iconfontLevel0, str2)) {
            return iconfontLevel0;
        }
        String iconfontLevel1 = getIconfontLevel1(str, str2);
        if (!TextUtils.equals(iconfontLevel1, str2)) {
            return iconfontLevel1;
        }
        String iconfontLevel2 = getIconfontLevel2(str, str2);
        if (!TextUtils.equals(iconfontLevel2, str2)) {
            return iconfontLevel2;
        }
        String iconfontLevel3 = getIconfontLevel3(str, str2);
        if (!TextUtils.equals(iconfontLevel3, str2)) {
            return iconfontLevel3;
        }
        return getIconfontLevel4(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0b63, code lost:
        if (r7.equals("round_redpacket") == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIconfontLevel0(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 4930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.iconfont.utils.IconfontApi.getIconfontLevel0(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0b84, code lost:
        if (r5.equals("discover_fill") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIconfontLevel1(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 4974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.iconfont.utils.IconfontApi.getIconfontLevel1(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0bb0, code lost:
        if (r5.equals("tb_Viewmodelist") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIconfontLevel2(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 5018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.iconfont.utils.IconfontApi.getIconfontLevel2(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0b69, code lost:
        if (r6.equals("selection_fill") == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIconfontLevel3(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 4942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.iconfont.utils.IconfontApi.getIconfontLevel3(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e6, code lost:
        if (r5.equals("camera") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIconfontLevel4(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.iconfont.utils.IconfontApi.getIconfontLevel4(java.lang.String, java.lang.String):java.lang.String");
    }
}
