package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.relationship.mtop.isfollow.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ycr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(759169030);
        RelationshipApplication.init();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (android.text.TextUtils.equals(r12, "1") == false) goto L_0x0098;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, tb.ct9 r28, android.app.Activity r29) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = 1
            r7 = 0
            com.android.alibaba.ip.runtime.IpChange r8 = tb.ycr.$ipChange
            boolean r9 = r8 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r9 == 0) goto L_0x004c
            java.lang.String r9 = "d0050855"
            r10 = 14
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r7] = r16
            r10[r6] = r17
            r6 = 2
            r10[r6] = r18
            r6 = 3
            r10[r6] = r19
            r6 = 4
            r10[r6] = r0
            r0 = 5
            r10[r0] = r1
            r0 = 6
            r10[r0] = r2
            r0 = 7
            r10[r0] = r23
            r0 = 8
            r10[r0] = r24
            r0 = 9
            r10[r0] = r25
            r0 = 10
            r10[r0] = r26
            r0 = 11
            r10[r0] = r3
            r0 = 12
            r10[r0] = r4
            r0 = 13
            r10[r0] = r5
            r8.ipc$dispatch(r9, r10)
            return
        L_0x004c:
            boolean r8 = android.text.TextUtils.isEmpty(r16)
            if (r8 != 0) goto L_0x0057
            long r8 = java.lang.Long.parseLong(r16)
            goto L_0x0064
        L_0x0057:
            boolean r8 = android.text.TextUtils.isEmpty(r17)
            if (r8 != 0) goto L_0x0062
            long r8 = java.lang.Long.parseLong(r17)
            goto L_0x0064
        L_0x0062:
            r8 = 0
        L_0x0064:
            boolean r10 = android.text.TextUtils.isEmpty(r18)
            if (r10 == 0) goto L_0x006c
            r10 = 1
            goto L_0x0070
        L_0x006c:
            int r10 = java.lang.Integer.parseInt(r18)
        L_0x0070:
            boolean r11 = android.text.TextUtils.isEmpty(r19)
            if (r11 == 0) goto L_0x0078
            r11 = 1
            goto L_0x007c
        L_0x0078:
            int r11 = java.lang.Integer.parseInt(r19)
        L_0x007c:
            boolean r12 = android.text.TextUtils.isEmpty(r24)
            java.lang.String r13 = "1"
            java.lang.String r14 = "true"
            if (r12 != 0) goto L_0x0098
            java.lang.String r12 = r24.toLowerCase()
            boolean r15 = android.text.TextUtils.equals(r12, r14)
            if (r15 != 0) goto L_0x0099
            boolean r12 = android.text.TextUtils.equals(r12, r13)
            if (r12 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            tb.rt9 r7 = new tb.rt9
            r7.<init>()
            r7.b = r8
            r7.f = r0
            r7.g = r1
            r7.h = r2
            r7.d = r10
            r7.e = r11
            r7.i = r3
            r7.j = r6
            r7.f27593a = r5
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = r23.toLowerCase()
            boolean r1 = android.text.TextUtils.equals(r0, r14)
            if (r1 != 0) goto L_0x00c4
            boolean r0 = android.text.TextUtils.equals(r0, r13)
        L_0x00c4:
            com.taobao.relationship.mtop.addfollow.a r0 = new com.taobao.relationship.mtop.addfollow.a
            r0.<init>(r4)
            r0.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ycr.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, tb.ct9, android.app.Activity):void");
    }

    public static void b(String str, String str2, String str3, String str4, ct9 ct9Var) {
        long j;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ea937b", new Object[]{str, str2, str3, str4, ct9Var});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            j = Long.parseLong(str);
        } else if (!TextUtils.isEmpty(str2)) {
            j = Long.parseLong(str2);
        } else {
            j = 0;
        }
        if (!TextUtils.isEmpty(str3)) {
            i = Integer.parseInt(str3);
        }
        rt9 rt9Var = new rt9();
        rt9Var.b = j;
        rt9Var.d = i;
        rt9Var.i = str4;
        new a(ct9Var).d(rt9Var);
    }

    public static void c(String str, String str2, ct9 ct9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d74b7f3", new Object[]{str, str2, ct9Var});
            return;
        }
        if (au9.g()) {
            if (!TextUtils.isEmpty(str)) {
                s0m.B().T(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                s0m.B().T(str2);
            }
        }
        ct9Var.onResult(new JSONObject());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (android.text.TextUtils.equals(r11, "1") == false) goto L_0x0074;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, tb.ct9 r14, android.app.Activity r15) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ycr.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = "942de170"
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r5 = 2
            r4[r5] = r7
            r5 = 3
            r4[r5] = r8
            r5 = 4
            r4[r5] = r9
            r5 = 5
            r4[r5] = r10
            r5 = 6
            r4[r5] = r11
            r5 = 7
            r4[r5] = r12
            r5 = 8
            r4[r5] = r13
            r5 = 9
            r4[r5] = r14
            r5 = 10
            r4[r5] = r15
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0034:
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x003f
            long r5 = java.lang.Long.parseLong(r5)
            goto L_0x004c
        L_0x003f:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x004a
            long r5 = java.lang.Long.parseLong(r6)
            goto L_0x004c
        L_0x004a:
            r5 = 0
        L_0x004c:
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 == 0) goto L_0x0054
            r7 = 1
            goto L_0x0058
        L_0x0054:
            int r7 = java.lang.Integer.parseInt(r7)
        L_0x0058:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 != 0) goto L_0x0074
            java.lang.String r11 = r12.toLowerCase()
            java.lang.String r12 = "true"
            boolean r12 = android.text.TextUtils.equals(r11, r12)
            if (r12 != 0) goto L_0x0075
            java.lang.String r12 = "1"
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            tb.rt9 r11 = new tb.rt9
            r11.<init>()
            r11.b = r5
            r11.f = r8
            r11.g = r9
            r11.h = r10
            r11.d = r7
            r11.i = r13
            r11.j = r0
            r11.f27593a = r15
            com.taobao.relationship.mtop.removefollow.a r5 = new com.taobao.relationship.mtop.removefollow.a
            r5.<init>(r14)
            r5.c(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ycr.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, tb.ct9, android.app.Activity):void");
    }
}
